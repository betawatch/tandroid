package org.telegram.ui.iv;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.text.Editable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.webkit.MimeTypeMap;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AppGlobalConfig;
import org.telegram.messenger.CodeHighlighting;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.FloatingToolbar;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.TextSelectionHelper;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.iv.RichAudioCell;
import org.telegram.ui.iv.RichDetailsCell;
import org.telegram.ui.iv.RichDetailsEndCell;
import org.telegram.ui.iv.RichDividerCell;
import org.telegram.ui.iv.RichEditor;
import org.telegram.ui.iv.RichEditorHistory;
import org.telegram.ui.iv.RichEditorListView;
import org.telegram.ui.iv.RichMapCell;
import org.telegram.ui.iv.RichMathCell;
import org.telegram.ui.iv.RichMediaCell;
import org.telegram.ui.iv.RichMediaConverter;
import org.telegram.ui.iv.RichMediaUploader;
import org.telegram.ui.iv.RichTableCell;
import org.telegram.ui.iv.RichTextCell;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes3.dex */
public class RichEditorListView extends UniversalRecyclerView {
    RichTableCell activeCellSelectionTable;
    private boolean allowTapAboveContent;
    private final RichAudioCell.Delegate audioDelegate;
    private int bottomInset;
    private final RichTextCell.Delegate cellDelegate;
    private final RichTableCell.CellSelectionListener cellSelectionListener;
    private final IdentityHashMap converters;
    private int currentAccount;
    private Delegate delegate;
    private final RichDetailsCell.Delegate detailsDelegate;
    private final RichDividerCell.Delegate dividerDelegate;
    private int dotSelectedCol;
    private int dotSelectedRow;
    private boolean draggingOverTrash;
    private BlockRow draggingRow;
    private int emojiPadding;
    RichEditorHistory history;
    private final RichEditorHistory.Delegate historyDelegate;
    private int imeInset;
    private ArrayList initialSelectionRows;
    final ArrayList itemRows;
    private int lastExternalImageId;
    private long lastTapDownTime;
    private float lastTapDownX;
    private float lastTapDownY;
    TL_iv.RichMessage loadedRichMessage;
    private boolean longPressConsumed;
    private Runnable longPressRunnable;
    private final RichMapCell.Delegate mapDelegate;
    private final RichMathCell.Delegate mathDelegate;
    private final RichMediaCell.Delegate mediaDelegate;
    private Runnable pendingMathEdit;
    BlockRow pendingMediaRow;
    private boolean pressMoved;
    private View pressTarget;
    private float pressX;
    private float pressY;
    private Theme.ResourcesProvider resourcesProvider;
    private int restoreFocusCell;
    private int restoreFocusChildPosition;
    private int restoreFocusOffset;
    final ArrayList rows;
    private boolean suppressSpansChanged;
    private ItemOptions tableCellMenu;
    private final RichTableCell.Delegate tableDelegate;
    TextSelectionHelper.ArticleTextSelectionHelper textSelectionHelper;
    TextSelectionHelper.TextSelectionOverlay textSelectionOverlay;
    private final IdentityHashMap uploaders;

    public interface Delegate {
        void makeEditTextFocusable(RichEditText richEditText, boolean z);

        ItemOptions makeMenu(View view);

        void onContentChanged();

        void onHistoryChanged();

        void onListLayoutUpdated();

        void onListScrolled(int i);

        void onOpenAttachRequest(int i, int i2);

        void onOpenLocationRequest(BlockRow blockRow);

        void onReorderEnd();

        boolean onReorderMove(float f, float f2);

        void onReorderStart();

        void onSelectionChanged();

        void onSlashSuggest(RichTextCell richTextCell, String str);
    }

    private static int clearMaskFor(int i) {
        if (i == 4) {
            return 49435;
        }
        if (i == 16384) {
            return 32772;
        }
        if (i == 32768) {
            return LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD;
        }
        return 4;
    }

    private static boolean isArrowKey(int i) {
        return i == 21 || i == 22 || i == 19 || i == 20;
    }

    public RichEditorListView(Context context, int i, Theme.ResourcesProvider resourcesProvider, Delegate delegate) {
        this(context, i, resourcesProvider, delegate, new RichEditorListView[1]);
    }

    private RichEditorListView(Context context, int i, Theme.ResourcesProvider resourcesProvider, final Delegate delegate, final RichEditorListView[] richEditorListViewArr) {
        super(context, i, 0, false, new Utilities.Callback2() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda25
            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                RichEditorListView.lambda$new$0(richEditorListViewArr, (ArrayList) obj, (UniversalAdapter) obj2);
            }
        }, new Utilities.Callback5() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda26
            @Override // org.telegram.messenger.Utilities.Callback5
            public final void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                RichEditorListView.lambda$new$1(richEditorListViewArr, (UItem) obj, (View) obj2, (Integer) obj3, (Float) obj4, (Float) obj5);
            }
        }, null, resourcesProvider);
        this.rows = new ArrayList();
        this.restoreFocusCell = -1;
        this.restoreFocusOffset = -1;
        this.restoreFocusChildPosition = 0;
        this.allowTapAboveContent = true;
        this.dividerDelegate = new RichDividerCell.Delegate() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda27
            @Override // org.telegram.ui.iv.RichDividerCell.Delegate
            public final TextSelectionHelper.ArticleTextSelectionHelper getSelectionHelper() {
                return RichEditorListView.this.getTextSelectionHelper();
            }
        };
        this.mediaDelegate = new RichMediaCell.Delegate() { // from class: org.telegram.ui.iv.RichEditorListView.4
            @Override // org.telegram.ui.iv.RichMediaCell.Delegate
            public void onRequestWindowFocusable(RichEditText richEditText, boolean z) {
                RichEditorListView.this.delegate.makeEditTextFocusable(richEditText, z);
            }

            @Override // org.telegram.ui.iv.RichMediaCell.Delegate
            public void onMediaPick(BlockRow blockRow) {
                RichEditorListView richEditorListView = RichEditorListView.this;
                richEditorListView.pendingMediaRow = blockRow;
                richEditorListView.delegate.onOpenAttachRequest(74, 0);
            }

            @Override // org.telegram.ui.iv.RichMediaCell.Delegate
            public void onAddMedia(BlockRow blockRow) {
                RichEditorListView richEditorListView = RichEditorListView.this;
                richEditorListView.pendingMediaRow = blockRow;
                richEditorListView.delegate.onOpenAttachRequest(74, 0);
            }

            @Override // org.telegram.ui.iv.RichMediaCell.Delegate
            public void onSwitchMode(BlockRow blockRow) {
                RichEditorListView.this.switchGalleryMode(blockRow);
            }

            @Override // org.telegram.ui.iv.RichMediaCell.Delegate
            public void onCancelUpload(BlockRow blockRow, MediaUploadState mediaUploadState) {
                RichEditorListView.this.cancelMediaUpload(blockRow, mediaUploadState);
            }

            @Override // org.telegram.ui.iv.RichMediaCell.Delegate
            public void onDeleteMedia(BlockRow blockRow, MediaUploadState mediaUploadState) {
                RichEditorListView.this.cancelMediaUpload(blockRow, mediaUploadState);
            }

            @Override // org.telegram.ui.iv.RichMediaCell.Delegate
            public TextSelectionHelper.ArticleTextSelectionHelper getSelectionHelper() {
                return RichEditorListView.this.getTextSelectionHelper();
            }

            @Override // org.telegram.ui.iv.RichMediaCell.Delegate
            public void onCaptionWillChange(BlockRow blockRow, int i2, int i3) {
                RichEditorHistory richEditorHistory = RichEditorListView.this.history;
                if (richEditorHistory != null) {
                    richEditorHistory.onBeforeChange(i2, i3);
                }
            }

            @Override // org.telegram.ui.iv.RichMediaCell.Delegate
            public void onCaptionChanged(BlockRow blockRow) {
                RichEditorHistory richEditorHistory = RichEditorListView.this.history;
                if (richEditorHistory != null) {
                    richEditorHistory.onTyping();
                }
                RichEditorListView.this.delegate.onContentChanged();
            }

            @Override // org.telegram.ui.iv.RichMediaCell.Delegate
            public void onCaptionSpansChanged(BlockRow blockRow) {
                RichEditorListView.this.onCellSpansChanged();
            }

            @Override // org.telegram.ui.iv.RichMediaCell.Delegate
            public void onCaptionEnter(BlockRow blockRow) {
                RichEditorListView.this.onCaptionEnter(blockRow);
            }

            @Override // org.telegram.ui.iv.RichMediaCell.Delegate
            public void onCaptionLockedInsert(CharSequence charSequence) {
                if (charSequence == null || charSequence.length() <= 0) {
                    return;
                }
                RichEditorListView.this.replaceHelperSelectionWith(charSequence.toString());
            }

            @Override // org.telegram.ui.iv.RichMediaCell.Delegate
            public boolean onCaptionSelectAll(BlockRow blockRow) {
                return RichEditorListView.this.tryEscalateSelectAll();
            }
        };
        this.audioDelegate = new RichAudioCell.Delegate() { // from class: org.telegram.ui.iv.RichEditorListView.5
            @Override // org.telegram.ui.iv.RichAudioCell.Delegate
            public void onRequestWindowFocusable(RichEditText richEditText, boolean z) {
                RichEditorListView.this.delegate.makeEditTextFocusable(richEditText, z);
            }

            @Override // org.telegram.ui.iv.RichAudioCell.Delegate
            public void onCancelUpload(BlockRow blockRow) {
                RichEditorListView.this.cancelAudioUpload(blockRow);
            }

            @Override // org.telegram.ui.iv.RichAudioCell.Delegate
            public TextSelectionHelper.ArticleTextSelectionHelper getSelectionHelper() {
                return RichEditorListView.this.getTextSelectionHelper();
            }

            @Override // org.telegram.ui.iv.RichAudioCell.Delegate
            public void onCaptionWillChange(BlockRow blockRow, int i2, int i3) {
                RichEditorHistory richEditorHistory = RichEditorListView.this.history;
                if (richEditorHistory != null) {
                    richEditorHistory.onBeforeChange(i2, i3);
                }
            }

            @Override // org.telegram.ui.iv.RichAudioCell.Delegate
            public void onCaptionChanged(BlockRow blockRow) {
                RichEditorHistory richEditorHistory = RichEditorListView.this.history;
                if (richEditorHistory != null) {
                    richEditorHistory.onTyping();
                }
                RichEditorListView.this.delegate.onContentChanged();
            }

            @Override // org.telegram.ui.iv.RichAudioCell.Delegate
            public void onCaptionSpansChanged(BlockRow blockRow) {
                RichEditorListView.this.onCellSpansChanged();
            }

            @Override // org.telegram.ui.iv.RichAudioCell.Delegate
            public void onCaptionEnter(BlockRow blockRow) {
                RichEditorListView.this.onCaptionEnter(blockRow);
            }

            @Override // org.telegram.ui.iv.RichAudioCell.Delegate
            public void onCaptionLockedInsert(CharSequence charSequence) {
                if (charSequence == null || charSequence.length() <= 0) {
                    return;
                }
                RichEditorListView.this.replaceHelperSelectionWith(charSequence.toString());
            }

            @Override // org.telegram.ui.iv.RichAudioCell.Delegate
            public boolean onCaptionSelectAll(BlockRow blockRow) {
                return RichEditorListView.this.tryEscalateSelectAll();
            }
        };
        this.uploaders = new IdentityHashMap();
        this.converters = new IdentityHashMap();
        this.mapDelegate = new RichMapCell.Delegate() { // from class: org.telegram.ui.iv.RichEditorListView.6
            @Override // org.telegram.ui.iv.RichMapCell.Delegate
            public void onRequestWindowFocusable(RichEditText richEditText, boolean z) {
                RichEditorListView.this.delegate.makeEditTextFocusable(richEditText, z);
            }

            @Override // org.telegram.ui.iv.RichMapCell.Delegate
            public void onPickLocation(BlockRow blockRow) {
                RichEditorListView.this.delegate.onOpenLocationRequest(blockRow);
            }

            @Override // org.telegram.ui.iv.RichMapCell.Delegate
            public TextSelectionHelper.ArticleTextSelectionHelper getSelectionHelper() {
                return RichEditorListView.this.getTextSelectionHelper();
            }

            @Override // org.telegram.ui.iv.RichMapCell.Delegate
            public void onCaptionWillChange(BlockRow blockRow, int i2, int i3) {
                RichEditorHistory richEditorHistory = RichEditorListView.this.history;
                if (richEditorHistory != null) {
                    richEditorHistory.onBeforeChange(i2, i3);
                }
            }

            @Override // org.telegram.ui.iv.RichMapCell.Delegate
            public void onCaptionChanged(BlockRow blockRow) {
                RichEditorHistory richEditorHistory = RichEditorListView.this.history;
                if (richEditorHistory != null) {
                    richEditorHistory.onTyping();
                }
                RichEditorListView.this.delegate.onContentChanged();
            }

            @Override // org.telegram.ui.iv.RichMapCell.Delegate
            public void onCaptionSpansChanged(BlockRow blockRow) {
                RichEditorListView.this.onCellSpansChanged();
            }

            @Override // org.telegram.ui.iv.RichMapCell.Delegate
            public void onCaptionEnter(BlockRow blockRow) {
                RichEditorListView.this.onCaptionEnter(blockRow);
            }

            @Override // org.telegram.ui.iv.RichMapCell.Delegate
            public void onCaptionLockedInsert(CharSequence charSequence) {
                if (charSequence == null || charSequence.length() <= 0) {
                    return;
                }
                RichEditorListView.this.replaceHelperSelectionWith(charSequence.toString());
            }

            @Override // org.telegram.ui.iv.RichMapCell.Delegate
            public boolean onCaptionSelectAll(BlockRow blockRow) {
                return RichEditorListView.this.tryEscalateSelectAll();
            }
        };
        this.mathDelegate = new RichMathCell.Delegate() { // from class: org.telegram.ui.iv.RichEditorListView.7
            @Override // org.telegram.ui.iv.RichMathCell.Delegate
            public TextSelectionHelper.ArticleTextSelectionHelper getSelectionHelper() {
                return RichEditorListView.this.getTextSelectionHelper();
            }
        };
        this.tableDelegate = new RichTableCell.Delegate() { // from class: org.telegram.ui.iv.RichEditorListView.8
            @Override // org.telegram.ui.iv.RichTableCell.Delegate
            public void onRequestWindowFocusable(RichEditText richEditText, boolean z) {
                RichEditorListView.this.delegate.makeEditTextFocusable(richEditText, z);
            }

            @Override // org.telegram.ui.iv.RichTableCell.Delegate
            public void onTextChanged(BlockRow blockRow) {
                RichEditorHistory richEditorHistory = RichEditorListView.this.history;
                if (richEditorHistory != null) {
                    richEditorHistory.onTyping();
                }
                RichEditorListView.this.delegate.onContentChanged();
            }

            @Override // org.telegram.ui.iv.RichTableCell.Delegate
            public void onTextWillChange(BlockRow blockRow, int i2, int i3) {
                RichEditorHistory richEditorHistory = RichEditorListView.this.history;
                if (richEditorHistory != null) {
                    richEditorHistory.onBeforeChange(i2, i3);
                }
            }

            @Override // org.telegram.ui.iv.RichTableCell.Delegate
            public void onSpansChanged(BlockRow blockRow) {
                RichEditorListView.this.onCellSpansChanged();
            }

            @Override // org.telegram.ui.iv.RichTableCell.Delegate
            public TextSelectionHelper.ArticleTextSelectionHelper getSelectionHelper() {
                return RichEditorListView.this.getTextSelectionHelper();
            }

            @Override // org.telegram.ui.iv.RichTableCell.Delegate
            public void onLockedInsert(CharSequence charSequence) {
                if (charSequence == null || charSequence.length() <= 0) {
                    return;
                }
                RichEditorListView.this.replaceHelperSelectionWith(charSequence.toString());
            }

            @Override // org.telegram.ui.iv.RichTableCell.Delegate
            public boolean onSelectAll(BlockRow blockRow) {
                return RichEditorListView.this.tryEscalateSelectAll();
            }
        };
        this.detailsDelegate = new RichDetailsCell.Delegate() { // from class: org.telegram.ui.iv.RichEditorListView.9
            @Override // org.telegram.ui.iv.RichDetailsCell.Delegate
            public void onRequestWindowFocusable(RichEditText richEditText, boolean z) {
                RichEditorListView.this.delegate.makeEditTextFocusable(richEditText, z);
            }

            @Override // org.telegram.ui.iv.RichDetailsCell.Delegate
            public void onToggle(BlockRow blockRow) {
                RichEditorListView.this.toggleDetails(blockRow);
            }

            @Override // org.telegram.ui.iv.RichDetailsCell.Delegate
            public void onTitleChanged(BlockRow blockRow) {
                RichEditorHistory richEditorHistory = RichEditorListView.this.history;
                if (richEditorHistory != null) {
                    richEditorHistory.onTyping();
                }
                RichEditorListView.this.delegate.onContentChanged();
            }

            @Override // org.telegram.ui.iv.RichDetailsCell.Delegate
            public void onTitleEnter(BlockRow blockRow) {
                RichEditorListView.this.onDetailsTitleEnter(blockRow);
            }

            @Override // org.telegram.ui.iv.RichDetailsCell.Delegate
            public void onTitleBackspace(BlockRow blockRow) {
                RichEditorListView.this.deleteDetails(blockRow);
            }

            @Override // org.telegram.ui.iv.RichDetailsCell.Delegate
            public void onSpansChanged(BlockRow blockRow) {
                RichEditorListView.this.onCellSpansChanged();
            }

            @Override // org.telegram.ui.iv.RichDetailsCell.Delegate
            public void onLockedInsert(CharSequence charSequence) {
                if (charSequence == null || charSequence.length() <= 0) {
                    return;
                }
                RichEditorListView.this.replaceHelperSelectionWith(charSequence.toString());
            }

            @Override // org.telegram.ui.iv.RichDetailsCell.Delegate
            public boolean onSelectAll(BlockRow blockRow) {
                return RichEditorListView.this.tryEscalateSelectAll();
            }

            @Override // org.telegram.ui.iv.RichDetailsCell.Delegate
            public TextSelectionHelper.ArticleTextSelectionHelper getSelectionHelper() {
                return RichEditorListView.this.getTextSelectionHelper();
            }
        };
        this.dotSelectedRow = -1;
        this.dotSelectedCol = -1;
        this.cellSelectionListener = new RichTableCell.CellSelectionListener() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda28
            @Override // org.telegram.ui.iv.RichTableCell.CellSelectionListener
            public final void onCellSelectionChanged(RichTableCell richTableCell) {
                RichEditorListView.this.lambda$new$17(richTableCell);
            }
        };
        this.cellDelegate = new RichTextCell.Delegate() { // from class: org.telegram.ui.iv.RichEditorListView.10
            @Override // org.telegram.ui.iv.RichTextCell.Delegate
            public void onRequestWindowFocusable(RichEditText richEditText, boolean z) {
                RichEditorListView.this.delegate.makeEditTextFocusable(richEditText, z);
            }

            @Override // org.telegram.ui.iv.RichTextCell.Delegate
            public void onEnter(BlockRow blockRow) {
                RichEditorListView.this.onCellEnter(blockRow);
            }

            @Override // org.telegram.ui.iv.RichTextCell.Delegate
            public void onQuoteAuthorEnter(BlockRow blockRow) {
                RichEditorListView.this.onCaptionEnter(blockRow);
            }

            @Override // org.telegram.ui.iv.RichTextCell.Delegate
            public void onBackspace(BlockRow blockRow) {
                RichEditorListView.this.onCellBackspaceAtStart(blockRow, true);
            }

            @Override // org.telegram.ui.iv.RichTextCell.Delegate
            public boolean onBackspaceAtStart(BlockRow blockRow) {
                return RichEditorListView.this.onCellBackspaceAtStart(blockRow, false);
            }

            @Override // org.telegram.ui.iv.RichTextCell.Delegate
            public void onTextChanged(BlockRow blockRow) {
                RichEditorHistory richEditorHistory = RichEditorListView.this.history;
                if (richEditorHistory != null) {
                    richEditorHistory.onTyping();
                }
                RichEditorListView.this.delegate.onContentChanged();
            }

            @Override // org.telegram.ui.iv.RichTextCell.Delegate
            public void onTextWillChange(BlockRow blockRow, int i2, int i3) {
                RichEditorHistory richEditorHistory = RichEditorListView.this.history;
                if (richEditorHistory != null) {
                    richEditorHistory.onBeforeChange(i2, i3);
                }
            }

            @Override // org.telegram.ui.iv.RichTextCell.Delegate
            public void onTransform(BlockRow blockRow, TL_iv.PageBlock pageBlock, int i2, int i3, boolean z, boolean z2) {
                RichEditorListView.this.transformRow(blockRow, pageBlock, i2, i3, z, z2);
            }

            @Override // org.telegram.ui.iv.RichTextCell.Delegate
            public void onCheckboxToggle(BlockRow blockRow, boolean z) {
                RichEditorListView.this.onChecklistToggle(blockRow, z);
            }

            @Override // org.telegram.ui.iv.RichTextCell.Delegate
            public void onSpansChanged(BlockRow blockRow) {
                RichEditorListView.this.onCellSpansChanged();
            }

            @Override // org.telegram.ui.iv.RichTextCell.Delegate
            public TextSelectionHelper.ArticleTextSelectionHelper getSelectionHelper() {
                return RichEditorListView.this.getTextSelectionHelper();
            }

            @Override // org.telegram.ui.iv.RichTextCell.Delegate
            public boolean onIndent(BlockRow blockRow, boolean z) {
                return RichEditorListView.this.onCellIndent(blockRow, z);
            }

            @Override // org.telegram.ui.iv.RichTextCell.Delegate
            public void onLockedInsert(CharSequence charSequence) {
                if (charSequence == null || charSequence.length() <= 0) {
                    return;
                }
                RichEditorListView.this.replaceHelperSelectionWith(charSequence.toString());
            }

            @Override // org.telegram.ui.iv.RichTextCell.Delegate
            public void onLanguageClick(BlockRow blockRow, View view) {
                RichEditorListView.this.onLanguageClick(blockRow, view);
            }

            @Override // org.telegram.ui.iv.RichTextCell.Delegate
            public boolean onSelectAll(BlockRow blockRow) {
                return RichEditorListView.this.tryEscalateSelectAll();
            }

            @Override // org.telegram.ui.iv.RichTextCell.Delegate
            public boolean onPaste(BlockRow blockRow, RichEditText richEditText) {
                return RichEditorListView.this.onCellPaste(blockRow, richEditText);
            }

            @Override // org.telegram.ui.iv.RichTextCell.Delegate
            public void onCommand(BlockRow blockRow, int i2) {
                RichEditorListView.this.handleSlashCommand(blockRow, i2);
            }

            @Override // org.telegram.ui.iv.RichTextCell.Delegate
            public void onSlashSuggest(RichTextCell richTextCell, String str) {
                RichEditorListView.this.delegate.onSlashSuggest(richTextCell, str);
            }
        };
        RichEditorHistory.Delegate delegate2 = new RichEditorHistory.Delegate() { // from class: org.telegram.ui.iv.RichEditorListView.11
            @Override // org.telegram.ui.iv.RichEditorHistory.Delegate
            public ArrayList getRows() {
                return RichEditorListView.this.rows;
            }

            @Override // org.telegram.ui.iv.RichEditorHistory.Delegate
            public void restoreRows(List list, RichEditorHistory.FocusState focusState) {
                RichEditorListView.this.restoreFromHistory(list, focusState);
            }

            @Override // org.telegram.ui.iv.RichEditorHistory.Delegate
            public void onHistoryChanged() {
                RichEditorListView.this.delegate.onHistoryChanged();
            }

            @Override // org.telegram.ui.iv.RichEditorHistory.Delegate
            public RichEditorHistory.FocusState captureFocus() {
                return RichEditorListView.this.captureFocusState();
            }
        };
        this.historyDelegate = delegate2;
        this.itemRows = new ArrayList();
        this.lastExternalImageId = -1;
        richEditorListViewArr[0] = this;
        this.currentAccount = i;
        this.resourcesProvider = resourcesProvider;
        this.delegate = delegate;
        this.adapter.setApplyBackground(false);
        setClipToPadding(false);
        setClipChildren(false);
        listenReorder(new Utilities.Callback2() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda29
            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                RichEditorListView.this.onRowsReordered(((Integer) obj).intValue(), (ArrayList) obj2);
            }
        });
        setReorderLongPressEnabled(false);
        allowReorder(true);
        TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper = new TextSelectionHelper.ArticleTextSelectionHelper() { // from class: org.telegram.ui.iv.RichEditorListView.1
            @Override // org.telegram.ui.Cells.TextSelectionHelper
            protected boolean canCut() {
                return true;
            }

            @Override // org.telegram.ui.Cells.TextSelectionHelper
            protected boolean canPaste() {
                return true;
            }

            @Override // org.telegram.ui.Cells.TextSelectionHelper.ArticleTextSelectionHelper, org.telegram.ui.Cells.TextSelectionHelper
            protected void onOffsetChanged() {
                super.onOffsetChanged();
                delegate.onSelectionChanged();
            }

            @Override // org.telegram.ui.Cells.TextSelectionHelper
            protected boolean onCopyOverride() {
                RichEditorListView.this.copyHelperSelection();
                return true;
            }

            @Override // org.telegram.ui.Cells.TextSelectionHelper
            protected void onCutAction() {
                RichEditorListView.this.cutHelperSelection();
            }

            @Override // org.telegram.ui.Cells.TextSelectionHelper
            protected void onPasteAction() {
                RichEditorListView.this.pasteAtHelperSelection();
            }
        };
        this.textSelectionHelper = articleTextSelectionHelper;
        articleTextSelectionHelper.setParentView(this);
        TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper2 = this.textSelectionHelper;
        articleTextSelectionHelper2.layoutManager = this.layoutManager;
        TextSelectionHelper.TextSelectionOverlay overlayView = articleTextSelectionHelper2.getOverlayView(context);
        this.textSelectionOverlay = overlayView;
        AndroidUtilities.removeFromParent(overlayView);
        this.textSelectionHelper.setCallback(new 2(delegate));
        addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: org.telegram.ui.iv.RichEditorListView.3
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i2, int i3) {
                Delegate delegate3 = delegate;
                if (delegate3 != null) {
                    delegate3.onListScrolled(i3);
                }
                RichEditorListView.this.textSelectionHelper.onParentScrolled();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i2) {
                if (i2 == 0) {
                    RichEditorListView.this.textSelectionHelper.stopScrolling();
                }
            }
        });
        this.history = new RichEditorHistory(delegate2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$new$0(RichEditorListView[] richEditorListViewArr, ArrayList arrayList, UniversalAdapter universalAdapter) {
        RichEditorListView richEditorListView = richEditorListViewArr[0];
        if (richEditorListView != null) {
            richEditorListView.fillItems(arrayList, universalAdapter);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$new$1(RichEditorListView[] richEditorListViewArr, UItem uItem, View view, Integer num, Float f, Float f2) {
        RichEditorListView richEditorListView = richEditorListViewArr[0];
        if (richEditorListView != null) {
            richEditorListView.onItemClick(uItem, view, num.intValue(), f.floatValue(), f2.floatValue());
        }
    }

    class 2 extends TextSelectionHelper.Callback {
        final /* synthetic */ Delegate val$delegate;

        2(Delegate delegate) {
            this.val$delegate = delegate;
        }

        @Override // org.telegram.ui.Cells.TextSelectionHelper.Callback
        public void onStateChanged(boolean z) {
            this.val$delegate.onSelectionChanged();
            if (!z) {
                final int i = RichEditorListView.this.restoreFocusCell;
                final int i2 = RichEditorListView.this.restoreFocusOffset;
                final int i3 = RichEditorListView.this.restoreFocusChildPosition;
                RichEditorListView.this.restoreFocusCell = -1;
                RichEditorListView.this.restoreFocusOffset = -1;
                RichEditorListView.this.restoreFocusChildPosition = 0;
                RichEditorListView.this.setEditTextsLocked(false);
                if (i >= 0) {
                    RichEditorListView.this.post(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$2$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            RichEditorListView.2.this.lambda$onStateChanged$0(i, i3, i2);
                        }
                    });
                    return;
                }
                return;
            }
            RichEditorListView richEditorListView = RichEditorListView.this;
            richEditorListView.restoreFocusCell = richEditorListView.textSelectionHelper.getAnchorCell();
            RichEditorListView richEditorListView2 = RichEditorListView.this;
            richEditorListView2.restoreFocusOffset = richEditorListView2.textSelectionHelper.getAnchorOffset();
            RichEditorListView richEditorListView3 = RichEditorListView.this;
            richEditorListView3.restoreFocusChildPosition = richEditorListView3.textSelectionHelper.getAnchorChildPosition();
            RichEditorListView.this.setEditTextsLocked(true);
            RichEditorListView.this.hideEditTextActionModes();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onStateChanged$0(int i, int i2, int i3) {
            RichEditorListView.this.restoreFocusAt(i, i2, i3);
        }
    }

    public View getOverlayView() {
        return this.textSelectionOverlay;
    }

    @Override // org.telegram.ui.Components.UniversalRecyclerView
    protected void onLayoutUpdate() {
        super.onLayoutUpdate();
        Delegate delegate = this.delegate;
        if (delegate != null) {
            delegate.onListLayoutUpdated();
        }
    }

    public void seedEmptyArticle() {
        this.rows.clear();
        this.rows.add(new BlockRow(new TL_iv.pageBlockHeading1()));
        this.rows.add(new BlockRow(new TL_iv.pageBlockParagraph()));
        this.adapter.update(false);
    }

    public void clearContent() {
        destroy();
        this.loadedRichMessage = null;
        this.pendingMediaRow = null;
        this.history = new RichEditorHistory(this.historyDelegate);
        seedEmptyArticle();
        Delegate delegate = this.delegate;
        if (delegate != null) {
            delegate.onHistoryChanged();
        }
    }

    public void undo() {
        RichEditorHistory richEditorHistory = this.history;
        if (richEditorHistory != null) {
            richEditorHistory.undo();
        }
    }

    public void redo() {
        RichEditorHistory richEditorHistory = this.history;
        if (richEditorHistory != null) {
            richEditorHistory.redo();
        }
    }

    public boolean canUndo() {
        RichEditorHistory richEditorHistory = this.history;
        return richEditorHistory != null && richEditorHistory.canUndo();
    }

    public boolean canRedo() {
        RichEditorHistory richEditorHistory = this.history;
        return richEditorHistory != null && richEditorHistory.canRedo();
    }

    public boolean isInSelectionMode() {
        TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper = this.textSelectionHelper;
        return articleTextSelectionHelper != null && articleTextSelectionHelper.isInSelectionMode();
    }

    private ArrayList splitToLines(CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            if (charSequence.charAt(i2) == '\n') {
                arrayList.add(charSequence.subSequence(i, i2));
                i = i2 + 1;
            }
        }
        if (i <= charSequence.length()) {
            arrayList.add(charSequence.subSequence(i, charSequence.length()));
        }
        return arrayList;
    }

    public void setInitialText(CharSequence charSequence) {
        if (charSequence == null) {
            return;
        }
        this.initialSelectionRows = new ArrayList();
        Iterator it = splitToLines(charSequence).iterator();
        while (it.hasNext()) {
            CharSequence charSequence2 = (CharSequence) it.next();
            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
            pageblockparagraph.text = RichTextStyle.fromSpannable(charSequence2);
            BlockRow blockRow = new BlockRow(pageblockparagraph);
            this.rows.add(blockRow);
            this.initialSelectionRows.add(blockRow);
        }
        this.adapter.update(false);
    }

    private int[] mapInitialOffset(int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < this.initialSelectionRows.size(); i3++) {
            int length = RichTextCell.readPlainText(((BlockRow) this.initialSelectionRows.get(i3)).block).length();
            if (i <= i2 + length) {
                return new int[]{i3, i - i2};
            }
            i2 += length + 1;
        }
        int size = this.initialSelectionRows.size() - 1;
        return new int[]{size, RichTextCell.readPlainText(((BlockRow) this.initialSelectionRows.get(size)).block).length()};
    }

    public void applyInitialSelection(final int i, final int i2) {
        if (lambda$applyInitialSelection$2(i, i2)) {
            return;
        }
        post(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                RichEditorListView.this.lambda$applyInitialSelection$2(i, i2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: applyInitialSelectionInternal, reason: merged with bridge method [inline-methods] */
    public boolean lambda$applyInitialSelection$2(int i, int i2) {
        ArrayList arrayList = this.initialSelectionRows;
        if (arrayList != null && !arrayList.isEmpty()) {
            int max = Math.max(0, Math.min(i, i2));
            int max2 = Math.max(0, Math.max(i, i2));
            int[] mapInitialOffset = mapInitialOffset(max);
            int[] mapInitialOffset2 = mapInitialOffset(max2);
            BlockRow blockRow = (BlockRow) this.initialSelectionRows.get(mapInitialOffset[0]);
            if (mapInitialOffset[0] == mapInitialOffset2[0] || max == max2) {
                View findViewByItemObject = findViewByItemObject(blockRow);
                if (!(findViewByItemObject instanceof RichTextCell)) {
                    return false;
                }
                RichTextCell richTextCell = (RichTextCell) findViewByItemObject;
                richTextCell.requestEditFocus();
                RichEditText editText = richTextCell.getEditText();
                int length = editText.length();
                editText.setSelection(Math.min(mapInitialOffset[1], length), Math.min(mapInitialOffset2[1], length));
            } else {
                View findViewByItemObject2 = findViewByItemObject(blockRow);
                View findViewByItemObject3 = findViewByItemObject(this.initialSelectionRows.get(mapInitialOffset2[0]));
                if (!(findViewByItemObject2 instanceof RichTextCell) || !(findViewByItemObject3 instanceof RichTextCell)) {
                    return false;
                }
                for (int i3 = 0; i3 < this.rows.size(); i3++) {
                    this.textSelectionHelper.cacheText(i3, RichTextCell.readPlainText(((BlockRow) this.rows.get(i3)).block), null);
                }
                RichTextCell richTextCell2 = (RichTextCell) findViewByItemObject2;
                int length2 = richTextCell2.getEditText().length();
                if (mapInitialOffset[1] >= length2) {
                    length2 = Math.max(0, length2 - 1);
                }
                if (!this.textSelectionHelper.selectRangeOf(richTextCell2, mapInitialOffset[1], length2)) {
                    richTextCell2.requestEditFocus();
                    return true;
                }
                this.textSelectionHelper.extendSelectionTo((RichTextCell) findViewByItemObject3, mapInitialOffset2[1]);
                return true;
            }
        }
        return true;
    }

    public void loadRichMessage(TL_iv.RichMessage richMessage) {
        if (richMessage == null) {
            return;
        }
        this.loadedRichMessage = richMessage;
        flattenBlocks(this.rows, richMessage.blocks);
        for (int i = 0; i < this.rows.size(); i++) {
            resolveLoadedMedia((BlockRow) this.rows.get(i));
        }
        this.adapter.update(false);
    }

    public void addRichMessage(TL_iv.RichMessage richMessage) {
        ArrayList<TL_iv.PageBlock> arrayList;
        int indexOf;
        if (richMessage == null || (arrayList = richMessage.blocks) == null || arrayList.isEmpty()) {
            return;
        }
        RichEditorHistory richEditorHistory = this.history;
        if (richEditorHistory != null) {
            richEditorHistory.flush();
        }
        TL_iv.RichMessage richMessage2 = this.loadedRichMessage;
        if (richMessage2 == null) {
            this.loadedRichMessage = richMessage;
        } else {
            ArrayList<TLRPC.Photo> arrayList2 = richMessage.photos;
            if (arrayList2 != null) {
                richMessage2.photos.addAll(arrayList2);
            }
            ArrayList<TLRPC.Document> arrayList3 = richMessage.documents;
            if (arrayList3 != null) {
                this.loadedRichMessage.documents.addAll(arrayList3);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        flattenBlocks(arrayList4, richMessage.blocks);
        if (arrayList4.isEmpty()) {
            return;
        }
        for (int i = 0; i < arrayList4.size(); i++) {
            resolveLoadedMedia((BlockRow) arrayList4.get(i));
        }
        int size = this.rows.size();
        BlockRow findFocusedRow = findFocusedRow();
        if (findFocusedRow != null && (indexOf = this.rows.indexOf(findFocusedRow)) >= 0) {
            TL_iv.PageBlock pageBlock = findFocusedRow.block;
            if ((pageBlock instanceof TL_iv.pageBlockParagraph) && RichTextCell.readPlainText(pageBlock).isEmpty()) {
                this.rows.remove(indexOf);
                size = indexOf;
            } else {
                size = indexOf + 1;
            }
        }
        this.rows.addAll(size, arrayList4);
        renumberAllRuns();
        this.adapter.update(false);
        RichEditorHistory richEditorHistory2 = this.history;
        if (richEditorHistory2 != null) {
            richEditorHistory2.record();
        }
    }

    public void destroy() {
        TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper = this.textSelectionHelper;
        if (articleTextSelectionHelper != null) {
            articleTextSelectionHelper.clear(true);
        }
        exitCellSelectionMode();
        hideEditTextActionModes();
        Iterator it = this.uploaders.values().iterator();
        while (it.hasNext()) {
            ((RichMediaUploader) it.next()).cancel();
        }
        this.uploaders.clear();
        Iterator it2 = this.converters.values().iterator();
        while (it2.hasNext()) {
            ((RichMediaConverter) it2.next()).cancel();
        }
        this.converters.clear();
    }

    private TLRPC.Document findLoadedDocument(long j) {
        ArrayList<TLRPC.Document> arrayList;
        TLRPC.Document document;
        if (j == 0) {
            return null;
        }
        for (int i = 0; i < this.rows.size(); i++) {
            for (MediaUploadState mediaUploadState : mediasOf((BlockRow) this.rows.get(i))) {
                if (mediaUploadState != null && (document = mediaUploadState.document) != null && document.id == j) {
                    return document;
                }
            }
        }
        TL_iv.RichMessage richMessage = this.loadedRichMessage;
        if (richMessage != null && (arrayList = richMessage.documents) != null) {
            Iterator<TLRPC.Document> it = arrayList.iterator();
            while (it.hasNext()) {
                TLRPC.Document next = it.next();
                if (next != null && next.id == j) {
                    return next;
                }
            }
        }
        return null;
    }

    private TLRPC.Photo findLoadedPhoto(long j) {
        ArrayList<TLRPC.Photo> arrayList;
        TLRPC.Photo photo;
        if (j == 0) {
            return null;
        }
        for (int i = 0; i < this.rows.size(); i++) {
            for (MediaUploadState mediaUploadState : mediasOf((BlockRow) this.rows.get(i))) {
                if (mediaUploadState != null && (photo = mediaUploadState.photo) != null && photo.id == j) {
                    return photo;
                }
            }
        }
        TL_iv.RichMessage richMessage = this.loadedRichMessage;
        if (richMessage != null && (arrayList = richMessage.photos) != null) {
            Iterator<TLRPC.Photo> it = arrayList.iterator();
            while (it.hasNext()) {
                TLRPC.Photo next = it.next();
                if (next != null && next.id == j) {
                    return next;
                }
            }
        }
        return null;
    }

    private void resolveLoadedMedia(BlockRow blockRow) {
        TL_iv.PageBlock pageBlock;
        if (this.loadedRichMessage == null || blockRow == null || (pageBlock = blockRow.block) == null) {
            return;
        }
        if (isGallery(pageBlock)) {
            ArrayList galleryItems = galleryItems(blockRow.block);
            blockRow.medias = new ArrayList();
            if (galleryItems != null) {
                for (int i = 0; i < galleryItems.size(); i++) {
                    MediaUploadState resolveBlockMedia = resolveBlockMedia((TL_iv.PageBlock) galleryItems.get(i));
                    ArrayList arrayList = blockRow.medias;
                    if (resolveBlockMedia == null) {
                        resolveBlockMedia = new MediaUploadState();
                    }
                    arrayList.add(resolveBlockMedia);
                }
                return;
            }
            return;
        }
        MediaUploadState resolveBlockMedia2 = resolveBlockMedia(blockRow.block);
        if (resolveBlockMedia2 != null) {
            blockRow.media = resolveBlockMedia2;
        }
    }

    private MediaUploadState resolveBlockMedia(TL_iv.PageBlock pageBlock) {
        TLRPC.Photo findLoadedPhoto;
        if (pageBlock instanceof TL_iv.pageBlockAudio) {
            TLRPC.Document findLoadedDocument = findLoadedDocument(((TL_iv.pageBlockAudio) pageBlock).audio_id);
            if (findLoadedDocument == null) {
                return null;
            }
            MediaUploadState mediaUploadState = new MediaUploadState();
            mediaUploadState.isAudio = true;
            mediaUploadState.state = 2;
            mediaUploadState.document = findLoadedDocument;
            mediaUploadState.audioDisplayDocument = findLoadedDocument;
            return mediaUploadState;
        }
        if (pageBlock instanceof TL_iv.pageBlockVideo) {
            TLRPC.Document findLoadedDocument2 = findLoadedDocument(((TL_iv.pageBlockVideo) pageBlock).video_id);
            if (findLoadedDocument2 == null) {
                return null;
            }
            MediaUploadState mediaUploadState2 = new MediaUploadState();
            mediaUploadState2.isVideo = true;
            mediaUploadState2.state = 2;
            mediaUploadState2.document = findLoadedDocument2;
            int i = 0;
            while (true) {
                if (i >= findLoadedDocument2.attributes.size()) {
                    break;
                }
                if (findLoadedDocument2.attributes.get(i) instanceof TLRPC.TL_documentAttributeVideo) {
                    TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) findLoadedDocument2.attributes.get(i);
                    mediaUploadState2.width = tL_documentAttributeVideo.w;
                    mediaUploadState2.height = tL_documentAttributeVideo.h;
                    mediaUploadState2.duration = (int) tL_documentAttributeVideo.duration;
                    break;
                }
                i++;
            }
            return mediaUploadState2;
        }
        if (!(pageBlock instanceof TL_iv.pageBlockPhoto) || (findLoadedPhoto = findLoadedPhoto(((TL_iv.pageBlockPhoto) pageBlock).photo_id)) == null) {
            return null;
        }
        MediaUploadState mediaUploadState3 = new MediaUploadState();
        mediaUploadState3.state = 2;
        mediaUploadState3.photo = findLoadedPhoto;
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(findLoadedPhoto.sizes, AndroidUtilities.getPhotoSize());
        if (closestPhotoSizeWithSize != null) {
            mediaUploadState3.width = closestPhotoSizeWithSize.w;
            mediaUploadState3.height = closestPhotoSizeWithSize.h;
        }
        return mediaUploadState3;
    }

    private List resolvePastedMedia(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            BlockRow blockRow = (BlockRow) it.next();
            if (isGallery(blockRow.block)) {
                ArrayList galleryItems = galleryItems(blockRow.block);
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                if (galleryItems != null) {
                    Iterator it2 = galleryItems.iterator();
                    while (it2.hasNext()) {
                        TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) it2.next();
                        MediaUploadState resolveBlockMedia = resolveBlockMedia(pageBlock);
                        if (resolveBlockMedia != null) {
                            arrayList2.add(pageBlock);
                            arrayList3.add(resolveBlockMedia);
                        }
                    }
                    galleryItems.clear();
                    galleryItems.addAll(arrayList2);
                }
                if (!arrayList3.isEmpty()) {
                    blockRow.medias = arrayList3;
                    arrayList.add(blockRow);
                }
            } else {
                TL_iv.PageBlock pageBlock2 = blockRow.block;
                if ((pageBlock2 instanceof TL_iv.pageBlockPhoto) || (pageBlock2 instanceof TL_iv.pageBlockVideo) || (pageBlock2 instanceof TL_iv.pageBlockAudio)) {
                    MediaUploadState resolveBlockMedia2 = resolveBlockMedia(pageBlock2);
                    if (resolveBlockMedia2 != null) {
                        blockRow.media = resolveBlockMedia2;
                        arrayList.add(blockRow);
                    }
                } else {
                    arrayList.add(blockRow);
                }
            }
        }
        return arrayList;
    }

    static void flattenBlocks(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList2 == null) {
            return;
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) it.next();
            if ((pageBlock instanceof TL_iv.pageBlockList) || (pageBlock instanceof TL_iv.pageBlockOrderedList)) {
                expandListBlock(arrayList, pageBlock, 1);
            } else if (pageBlock instanceof TL_iv.pageBlockDetails) {
                flattenDetails(arrayList, (TL_iv.pageBlockDetails) pageBlock);
            } else {
                arrayList.add(new BlockRow(pageBlock));
            }
        }
    }

    public static ArrayList flattenForCopy(TL_iv.RichMessage richMessage) {
        ArrayList arrayList = new ArrayList();
        if (richMessage != null) {
            flattenBlocks(arrayList, richMessage.blocks);
        }
        return arrayList;
    }

    private static void flattenDetails(ArrayList arrayList, TL_iv.pageBlockDetails pageblockdetails) {
        if (pageblockdetails.title == null) {
            pageblockdetails.title = new TL_iv.textEmpty();
        }
        arrayList.add(new BlockRow(pageblockdetails));
        int size = arrayList.size();
        flattenBlocks(arrayList, pageblockdetails.blocks);
        if (arrayList.size() == size) {
            arrayList.add(new BlockRow(new TL_iv.pageBlockParagraph()));
        }
        arrayList.add(newDetailsEndRow());
    }

    private static BlockRow newDetailsEndRow() {
        BlockRow blockRow = new BlockRow(new TL_iv.pageBlockParagraph());
        blockRow.detailsEnd = true;
        return blockRow;
    }

    static boolean isDetailsHeader(BlockRow blockRow) {
        return blockRow != null && (blockRow.block instanceof TL_iv.pageBlockDetails);
    }

    private int matchingDetailsEnd(int i) {
        int i2 = 1;
        for (int i3 = i + 1; i3 < this.rows.size(); i3++) {
            BlockRow blockRow = (BlockRow) this.rows.get(i3);
            if (isDetailsHeader(blockRow)) {
                i2++;
            } else if (blockRow.detailsEnd && i2 - 1 == 0) {
                return i3;
            }
        }
        return this.rows.size();
    }

    private static void expandListBlock(ArrayList arrayList, TL_iv.PageBlock pageBlock, int i) {
        TL_iv.RichText richText;
        ArrayList<TL_iv.PageBlock> arrayList2;
        TL_iv.RichText richText2;
        ArrayList<TL_iv.PageBlock> arrayList3;
        if (pageBlock instanceof TL_iv.pageBlockOrderedList) {
            Iterator<TL_iv.PageListOrderedItem> it = ((TL_iv.pageBlockOrderedList) pageBlock).items.iterator();
            int i2 = 1;
            while (it.hasNext()) {
                TL_iv.PageListOrderedItem next = it.next();
                if (next instanceof TL_iv.TL_pageListOrderedItemText) {
                    richText2 = ((TL_iv.TL_pageListOrderedItemText) next).text;
                    arrayList3 = null;
                } else if (next instanceof TL_iv.TL_pageListOrderedItemBlocks) {
                    ArrayList<TL_iv.PageBlock> arrayList4 = ((TL_iv.TL_pageListOrderedItemBlocks) next).blocks;
                    arrayList3 = arrayList4;
                    richText2 = firstParagraphText(arrayList4);
                }
                addListItemRow(arrayList, richText2, i, i2, next.checkbox, next.checked);
                expandChildLists(arrayList, arrayList3, i);
                i2++;
            }
            return;
        }
        Iterator<TL_iv.PageListItem> it2 = ((TL_iv.pageBlockList) pageBlock).items.iterator();
        while (it2.hasNext()) {
            TL_iv.PageListItem next2 = it2.next();
            if (next2 instanceof TL_iv.TL_pageListItemText) {
                richText = ((TL_iv.TL_pageListItemText) next2).text;
                arrayList2 = null;
            } else if (next2 instanceof TL_iv.TL_pageListItemBlocks) {
                arrayList2 = ((TL_iv.TL_pageListItemBlocks) next2).blocks;
                richText = firstParagraphText(arrayList2);
            }
            addListItemRow(arrayList, richText, i, 0, next2.checkbox, next2.checked);
            expandChildLists(arrayList, arrayList2, i);
        }
    }

    private static void addListItemRow(ArrayList arrayList, TL_iv.RichText richText, int i, int i2, boolean z, boolean z2) {
        TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
        if (richText == null) {
            richText = new TL_iv.textEmpty();
        }
        pageblockparagraph.text = richText;
        BlockRow blockRow = new BlockRow(pageblockparagraph, i, i2);
        blockRow.checkbox = z;
        blockRow.checked = z2;
        arrayList.add(blockRow);
    }

    private static void expandChildLists(ArrayList arrayList, ArrayList arrayList2, int i) {
        if (arrayList2 == null) {
            return;
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList2.get(i2);
            if ((pageBlock instanceof TL_iv.pageBlockList) || (pageBlock instanceof TL_iv.pageBlockOrderedList)) {
                expandListBlock(arrayList, pageBlock, i + 1);
            }
        }
    }

    private static TL_iv.RichText firstParagraphText(ArrayList arrayList) {
        if (arrayList == null || arrayList.isEmpty() || !(arrayList.get(0) instanceof TL_iv.pageBlockParagraph)) {
            return null;
        }
        return ((TL_iv.pageBlockParagraph) arrayList.get(0)).text;
    }

    void onFormattingClicked(int i) {
        RichEditorHistory richEditorHistory;
        TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper = this.textSelectionHelper;
        if (articleTextSelectionHelper == null || !articleTextSelectionHelper.isInSelectionMode()) {
            return;
        }
        if (isTableSelection()) {
            onFormattingClickedTable(i);
            return;
        }
        if (isCaptionSelection()) {
            onFormattingClickedCaption(i);
            return;
        }
        if (isQuoteAuthorSelection()) {
            onFormattingClickedAuthor(i);
            return;
        }
        int startCell = this.textSelectionHelper.getStartCell();
        int endCell = this.textSelectionHelper.getEndCell();
        int startOffset = this.textSelectionHelper.getStartOffset();
        int endOffset = this.textSelectionHelper.getEndOffset();
        if (startCell < 0 || endCell < 0 || endCell < startCell || endCell >= this.itemRows.size()) {
            return;
        }
        boolean isStyleFullyApplied = isStyleFullyApplied(i, startCell, startOffset, endCell, endOffset);
        boolean z = !isStyleFullyApplied;
        int clearMaskFor = !isStyleFullyApplied ? clearMaskFor(i) : 0;
        RichEditorHistory richEditorHistory2 = this.history;
        if (richEditorHistory2 != null) {
            richEditorHistory2.flush();
        }
        this.suppressSpansChanged = true;
        int i2 = startCell;
        boolean z2 = false;
        while (i2 <= endCell) {
            BlockRow rowForCell = rowForCell(i2);
            if (rowForCell != null && isInlineFormattable(rowForCell.block)) {
                int blockTextLength = blockTextLength(i2);
                int i3 = i2 == startCell ? startOffset : 0;
                int i4 = i2 == endCell ? endOffset : blockTextLength;
                int max = Math.max(0, Math.min(i3, blockTextLength));
                int max2 = Math.max(0, Math.min(i4, blockTextLength));
                if (max < max2) {
                    RichTextCell cellAt = cellAt(i2);
                    if (cellAt != null) {
                        FloatingToolbar.StyleDelegate styleDelegate = cellAt.getStyleDelegate();
                        if (!isStyleFullyApplied) {
                            if (clearMaskFor != 0) {
                                styleDelegate.removeStyle(clearMaskFor, max, max2);
                            }
                            styleDelegate.addStyle(i, max, max2);
                        } else {
                            styleDelegate.removeStyle(i, max, max2);
                        }
                        cellAt.getEditText().invalidateEffects();
                        cellAt.getEditText().requestLayout();
                        cellAt.persistStyle();
                    } else {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(RichTextCell.readStyledText(rowForCell.block));
                        if (!isStyleFullyApplied && clearMaskFor != 0) {
                            RichTextStyle.setStyle(spannableStringBuilder, max, max2, clearMaskFor, false);
                        }
                        RichTextStyle.setStyle(spannableStringBuilder, max, max2, i, z);
                        RichTextCell.applyStyledTextToBlock(rowForCell.block, spannableStringBuilder);
                    }
                    z2 = true;
                }
            }
            i2++;
        }
        this.suppressSpansChanged = false;
        if (z2 && (richEditorHistory = this.history) != null) {
            richEditorHistory.record();
        }
        this.delegate.onSelectionChanged();
        if (z2) {
            refreshSelectionHighlight();
        }
    }

    private void refreshSelectionHighlight() {
        post(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda22
            @Override // java.lang.Runnable
            public final void run() {
                RichEditorListView.this.lambda$refreshSelectionHighlight$3();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$refreshSelectionHighlight$3() {
        TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper = this.textSelectionHelper;
        if (articleTextSelectionHelper == null || !articleTextSelectionHelper.isInSelectionMode()) {
            return;
        }
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if ((childAt instanceof RichTextCell) || (childAt instanceof RichTableCell) || (childAt instanceof RichCaptionHost) || (childAt instanceof RichDetailsCell)) {
                childAt.invalidate();
            }
        }
        this.textSelectionHelper.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onCellSpansChanged() {
        if (this.suppressSpansChanged) {
            return;
        }
        RichEditorHistory richEditorHistory = this.history;
        if (richEditorHistory != null) {
            richEditorHistory.record();
        }
        this.delegate.onSelectionChanged();
        refreshSelectionHighlight();
    }

    private RichTextCell singleSelectionCell() {
        TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper = this.textSelectionHelper;
        if (articleTextSelectionHelper != null && articleTextSelectionHelper.isInSelectionMode()) {
            int startCell = this.textSelectionHelper.getStartCell();
            int endCell = this.textSelectionHelper.getEndCell();
            BlockRow rowForCell = rowForCell(startCell);
            if (startCell == endCell && rowForCell != null && isFormattable(rowForCell.block)) {
                return cellAt(startCell);
            }
            return null;
        }
        return null;
    }

    void onLinkClicked() {
        if (isTableSelection()) {
            onLinkClickedTable();
            return;
        }
        if (isCaptionSelection()) {
            onLinkClickedCaption();
            return;
        }
        if (isQuoteAuthorSelection()) {
            onLinkClickedAuthor();
            return;
        }
        RichTextCell singleSelectionCell = singleSelectionCell();
        if (singleSelectionCell == null) {
            return;
        }
        int length = singleSelectionCell.getEditText().length();
        int max = Math.max(0, Math.min(Math.min(this.textSelectionHelper.getStartOffset(), this.textSelectionHelper.getEndOffset()), length));
        int max2 = Math.max(0, Math.min(Math.max(this.textSelectionHelper.getStartOffset(), this.textSelectionHelper.getEndOffset()), length));
        if (max >= max2) {
            return;
        }
        if (RichTextStyle.hasLink(singleSelectionCell.getEditText().getText(), max, max2)) {
            RichEditorHistory richEditorHistory = this.history;
            if (richEditorHistory != null) {
                richEditorHistory.flush();
            }
            RichTextStyle.removeLink(singleSelectionCell.getEditText().getText(), max, max2);
            singleSelectionCell.getEditText().invalidateEffects();
            singleSelectionCell.persistStyle();
            RichEditorHistory richEditorHistory2 = this.history;
            if (richEditorHistory2 != null) {
                richEditorHistory2.record();
            }
            this.delegate.onSelectionChanged();
            refreshSelectionHighlight();
            return;
        }
        RichEditorHistory richEditorHistory3 = this.history;
        if (richEditorHistory3 != null) {
            richEditorHistory3.flush();
        }
        if (RichTextStyle.hasDate(singleSelectionCell.getEditText().getText(), max, max2)) {
            RichTextStyle.removeDate(singleSelectionCell.getEditText().getText(), max, max2);
            singleSelectionCell.getEditText().invalidateEffects();
            singleSelectionCell.persistStyle();
            RichEditorHistory richEditorHistory4 = this.history;
            if (richEditorHistory4 != null) {
                richEditorHistory4.record();
            }
            refreshSelectionHighlight();
        }
        singleSelectionCell.getEditText().setSelectionOverride(max, max2);
        singleSelectionCell.getEditText().makeSelectedUrl();
    }

    void onDateClicked() {
        if (isTableSelection()) {
            onDateClickedTable();
            return;
        }
        if (isCaptionSelection()) {
            onDateClickedCaption();
            return;
        }
        if (isQuoteAuthorSelection()) {
            onDateClickedAuthor();
            return;
        }
        RichTextCell singleSelectionCell = singleSelectionCell();
        if (singleSelectionCell == null) {
            return;
        }
        int length = singleSelectionCell.getEditText().length();
        int max = Math.max(0, Math.min(Math.min(this.textSelectionHelper.getStartOffset(), this.textSelectionHelper.getEndOffset()), length));
        int max2 = Math.max(0, Math.min(Math.max(this.textSelectionHelper.getStartOffset(), this.textSelectionHelper.getEndOffset()), length));
        if (max >= max2) {
            return;
        }
        RichEditorHistory richEditorHistory = this.history;
        if (richEditorHistory != null) {
            richEditorHistory.flush();
        }
        if (RichTextStyle.hasLink(singleSelectionCell.getEditText().getText(), max, max2)) {
            RichTextStyle.removeLink(singleSelectionCell.getEditText().getText(), max, max2);
            singleSelectionCell.getEditText().invalidateEffects();
            singleSelectionCell.persistStyle();
            RichEditorHistory richEditorHistory2 = this.history;
            if (richEditorHistory2 != null) {
                richEditorHistory2.record();
            }
            refreshSelectionHighlight();
        }
        singleSelectionCell.getEditText().setSelectionOverride(max, max2);
        singleSelectionCell.getEditText().makeSelectedDate();
    }

    void onMathClicked() {
        RichEditText editText;
        Runnable runnable;
        TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper = this.textSelectionHelper;
        if (articleTextSelectionHelper == null || !articleTextSelectionHelper.isInSelectionMode()) {
            return;
        }
        if (isTableSelection()) {
            final int startCell = this.textSelectionHelper.getStartCell();
            final int startChildPosition = this.textSelectionHelper.getStartChildPosition();
            if (startChildPosition != this.textSelectionHelper.getEndChildPosition()) {
                return;
            }
            editText = tableEditText(startCell, startChildPosition);
            runnable = new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    RichEditorListView.this.lambda$onMathClicked$4(startCell, startChildPosition);
                }
            };
        } else if (isCaptionSelection()) {
            final int startCell2 = this.textSelectionHelper.getStartCell();
            editText = captionEditText(startCell2);
            runnable = new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    RichEditorListView.this.lambda$onMathClicked$5(startCell2);
                }
            };
        } else if (isQuoteAuthorSelection()) {
            final int startCell3 = this.textSelectionHelper.getStartCell();
            editText = quoteAuthorEditText(startCell3);
            runnable = new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    RichEditorListView.this.lambda$onMathClicked$6(startCell3);
                }
            };
        } else {
            final RichTextCell singleSelectionCell = singleSelectionCell();
            if (singleSelectionCell == null) {
                return;
            }
            editText = singleSelectionCell.getEditText();
            runnable = new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    RichTextCell.this.persistStyle();
                }
            };
        }
        if (editText == null) {
            return;
        }
        int length = editText.length();
        int max = Math.max(0, Math.min(Math.min(this.textSelectionHelper.getStartOffset(), this.textSelectionHelper.getEndOffset()), length));
        int max2 = Math.max(0, Math.min(Math.max(this.textSelectionHelper.getStartOffset(), this.textSelectionHelper.getEndOffset()), length));
        if (max > max2) {
            return;
        }
        insertInlineMath(editText, max, max2, runnable);
    }

    private void insertInlineMath(final RichEditText richEditText, final int i, final int i2, final Runnable runnable) {
        String sourceAt = MathSpan.sourceAt(richEditText.getText(), i, i2);
        if (sourceAt == null) {
            sourceAt = richEditText.getText().subSequence(i, i2).toString();
        }
        final float dp = AndroidUtilities.dp(SharedConfig.fontSize + 4);
        final int color = Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, this.resourcesProvider);
        ChatAttachAlertRichLayout.showEditLatexSheet(getContext(), sourceAt, new Utilities.Callback() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda48
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                RichEditorListView.this.lambda$insertInlineMath$8(color, dp, richEditText, i, i2, runnable, (String) obj);
            }
        }, this.resourcesProvider);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$insertInlineMath$8(int i, float f, final RichEditText richEditText, int i2, int i3, Runnable runnable, String str) {
        MathSpan create;
        if (TextUtils.isEmpty(str) || (create = MathSpan.create(str, i, f)) == null) {
            return;
        }
        RichEditorHistory richEditorHistory = this.history;
        if (richEditorHistory != null) {
            richEditorHistory.flush();
        }
        TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper = this.textSelectionHelper;
        if (articleTextSelectionHelper != null) {
            articleTextSelectionHelper.clear();
        }
        richEditText.setLocked(false);
        SpannableString spannableString = new SpannableString(" ");
        spannableString.setSpan(create, 0, 1, 33);
        Editable text = richEditText.getText();
        int max = Math.max(0, Math.min(i2, text.length()));
        text.replace(max, Math.max(max, Math.min(i3, text.length())), spannableString);
        runnable.run();
        RichEditorHistory richEditorHistory2 = this.history;
        if (richEditorHistory2 != null) {
            richEditorHistory2.record();
        }
        this.delegate.onContentChanged();
        final int min = Math.min(max + 1, richEditText.length());
        richEditText.requestEditFocus();
        post(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda65
            @Override // java.lang.Runnable
            public final void run() {
                RichEditorListView.lambda$insertInlineMath$7(RichEditText.this, min);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$insertInlineMath$7(RichEditText richEditText, int i) {
        richEditText.requestEditFocus();
        richEditText.setSelection(Math.min(i, richEditText.length()));
    }

    boolean isLinkApplied(int i, int i2, int i3, int i4) {
        CharSequence singleSelectionText = singleSelectionText(i, i2, i3, i4);
        if (singleSelectionText == null) {
            return false;
        }
        return RichTextStyle.hasLink(singleSelectionText, Math.max(0, Math.min(i2, i4)), Math.max(i2, i4));
    }

    boolean isDateApplied(int i, int i2, int i3, int i4) {
        CharSequence singleSelectionText = singleSelectionText(i, i2, i3, i4);
        if (singleSelectionText == null) {
            return false;
        }
        return RichTextStyle.hasDate(singleSelectionText, Math.max(0, Math.min(i2, i4)), Math.max(i2, i4));
    }

    private CharSequence singleSelectionText(int i, int i2, int i3, int i4) {
        if (i != i3) {
            return null;
        }
        if (isQuoteAuthorSelection()) {
            RichEditText quoteAuthorEditText = quoteAuthorEditText(i);
            if (quoteAuthorEditText != null) {
                return quoteAuthorEditText.getText();
            }
            return null;
        }
        BlockRow rowForCell = rowForCell(i);
        if (rowForCell == null || !isFormattable(rowForCell.block)) {
            return null;
        }
        int blockTextLength = blockTextLength(i);
        if (Math.max(0, Math.min(Math.min(i2, i4), blockTextLength)) >= Math.max(0, Math.min(Math.max(i2, i4), blockTextLength))) {
            return null;
        }
        RichTextCell cellAt = cellAt(i);
        return cellAt != null ? cellAt.getEditText().getText() : RichTextCell.readStyledText(rowForCell.block);
    }

    boolean isStyleFullyApplied(int i, int i2, int i3, int i4, int i5) {
        boolean hasStyle;
        if (isQuoteAuthorSelection()) {
            RichEditText quoteAuthorEditText = quoteAuthorEditText(i2);
            if (quoteAuthorEditText == null) {
                return false;
            }
            int length = quoteAuthorEditText.length();
            int max = Math.max(0, Math.min(Math.min(i3, i5), length));
            int max2 = Math.max(0, Math.min(Math.max(i3, i5), length));
            return max < max2 && (i & quoteAuthorEditText.getCurrentStyle(max, max2)) != 0;
        }
        int i6 = i2;
        boolean z = false;
        while (i6 <= i4) {
            BlockRow rowForCell = rowForCell(i6);
            if (rowForCell != null && isInlineFormattable(rowForCell.block)) {
                int blockTextLength = blockTextLength(i6);
                int i7 = i6 == i2 ? i3 : 0;
                int i8 = i6 == i4 ? i5 : blockTextLength;
                int max3 = Math.max(0, Math.min(i7, blockTextLength));
                int max4 = Math.max(0, Math.min(i8, blockTextLength));
                if (max3 < max4) {
                    RichTextCell cellAt = cellAt(i6);
                    if (cellAt != null) {
                        hasStyle = (cellAt.getStyleDelegate().getCurrentStyle(max3, max4) & i) != 0;
                    } else {
                        hasStyle = RichTextStyle.hasStyle(RichTextCell.readStyledText(rowForCell(i6).block), max3, max4, i);
                    }
                    if (!hasStyle) {
                        return false;
                    }
                    z = true;
                } else {
                    continue;
                }
            }
            i6++;
        }
        return z;
    }

    private int blockTextLength(int i) {
        RichTextCell cellAt = cellAt(i);
        if (cellAt != null) {
            return cellAt.getEditText().length();
        }
        BlockRow rowForCell = rowForCell(i);
        if (rowForCell == null) {
            return 0;
        }
        return RichTextCell.readPlainText(rowForCell.block).length();
    }

    private static boolean isFormattable(TL_iv.PageBlock pageBlock) {
        return (isNonText(pageBlock) || (pageBlock instanceof TL_iv.pageBlockDetails)) ? false : true;
    }

    private static boolean isInlineFormattable(TL_iv.PageBlock pageBlock) {
        return isFormattable(pageBlock) && !(pageBlock instanceof TL_iv.pageBlockPreformatted);
    }

    boolean isTableSelection() {
        TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper = this.textSelectionHelper;
        if (articleTextSelectionHelper == null || !articleTextSelectionHelper.isInSelectionMode()) {
            return false;
        }
        int startCell = this.textSelectionHelper.getStartCell();
        int endCell = this.textSelectionHelper.getEndCell();
        BlockRow rowForCell = rowForCell(startCell);
        return startCell == endCell && rowForCell != null && (rowForCell.block instanceof TL_iv.pageBlockTable);
    }

    RichEditText tableEditText(int i, int i2) {
        RichTableCell richTableCell;
        TableModel model;
        RichTableCellHost hostForAnchor;
        View selectableAt = selectableAt(i);
        if ((selectableAt instanceof RichTableCell) && (model = (richTableCell = (RichTableCell) selectableAt).getModel()) != null && i2 >= 0 && i2 < model.anchors().size() && (hostForAnchor = richTableCell.getGrid().hostForAnchor((TL_iv.pageTableCell) model.anchors().get(i2))) != null) {
            return hostForAnchor.editText;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: persistTableCell, reason: merged with bridge method [inline-methods] */
    public void lambda$onMathClicked$4(int i, int i2) {
        RichTableCell richTableCell;
        TableModel model;
        TL_iv.pageTableCell pagetablecell;
        RichTableCellHost hostForAnchor;
        View selectableAt = selectableAt(i);
        if ((selectableAt instanceof RichTableCell) && (model = (richTableCell = (RichTableCell) selectableAt).getModel()) != null && i2 >= 0 && i2 < model.anchors().size() && (hostForAnchor = richTableCell.getGrid().hostForAnchor((pagetablecell = (TL_iv.pageTableCell) model.anchors().get(i2)))) != null) {
            TableModel.applyStyledText(pagetablecell, hostForAnchor.editText.getText());
        }
    }

    private boolean tableSelectionHasFormattable() {
        int startCell = this.textSelectionHelper.getStartCell();
        int startChildPosition = this.textSelectionHelper.getStartChildPosition();
        int endChildPosition = this.textSelectionHelper.getEndChildPosition();
        int startOffset = this.textSelectionHelper.getStartOffset();
        int endOffset = this.textSelectionHelper.getEndOffset();
        int i = startChildPosition;
        while (i <= endChildPosition) {
            RichEditText tableEditText = tableEditText(startCell, i);
            if (tableEditText != null) {
                int length = tableEditText.length();
                int i2 = i == startChildPosition ? startOffset : 0;
                int i3 = i == endChildPosition ? endOffset : length;
                if (startChildPosition == endChildPosition) {
                    i2 = Math.min(startOffset, endOffset);
                    i3 = Math.max(startOffset, endOffset);
                }
                if (Math.max(0, Math.min(i2, length)) < Math.max(0, Math.min(i3, length))) {
                    return true;
                }
            }
            i++;
        }
        return false;
    }

    private void onFormattingClickedTable(int i) {
        RichEditorHistory richEditorHistory;
        int startCell = this.textSelectionHelper.getStartCell();
        int startChildPosition = this.textSelectionHelper.getStartChildPosition();
        int endChildPosition = this.textSelectionHelper.getEndChildPosition();
        int startOffset = this.textSelectionHelper.getStartOffset();
        int endOffset = this.textSelectionHelper.getEndOffset();
        boolean isStyleFullyAppliedTable = isStyleFullyAppliedTable(i, startCell, startChildPosition, startOffset, endChildPosition, endOffset);
        int clearMaskFor = !isStyleFullyAppliedTable ? clearMaskFor(i) : 0;
        RichEditorHistory richEditorHistory2 = this.history;
        if (richEditorHistory2 != null) {
            richEditorHistory2.flush();
        }
        this.suppressSpansChanged = true;
        int i2 = startChildPosition;
        boolean z = false;
        while (i2 <= endChildPosition) {
            RichEditText tableEditText = tableEditText(startCell, i2);
            if (tableEditText != null) {
                int length = tableEditText.length();
                int i3 = i2 == startChildPosition ? startOffset : 0;
                int i4 = i2 == endChildPosition ? endOffset : length;
                if (startChildPosition == endChildPosition) {
                    i3 = Math.min(startOffset, endOffset);
                    i4 = Math.max(startOffset, endOffset);
                }
                int max = Math.max(0, Math.min(i3, length));
                int max2 = Math.max(0, Math.min(i4, length));
                if (max < max2) {
                    if (!isStyleFullyAppliedTable) {
                        if (clearMaskFor != 0) {
                            tableEditText.removeStyle(clearMaskFor, max, max2);
                        }
                        tableEditText.addStyle(i, max, max2);
                    } else {
                        tableEditText.removeStyle(i, max, max2);
                    }
                    tableEditText.invalidateEffects();
                    tableEditText.requestLayout();
                    lambda$onMathClicked$4(startCell, i2);
                    z = true;
                }
            }
            i2++;
        }
        this.suppressSpansChanged = false;
        if (z && (richEditorHistory = this.history) != null) {
            richEditorHistory.record();
        }
        this.delegate.onSelectionChanged();
        if (z) {
            refreshSelectionHighlight();
        }
    }

    boolean isStyleFullyAppliedTable(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = i3;
        boolean z = false;
        while (i7 <= i5) {
            RichEditText tableEditText = tableEditText(i2, i7);
            if (tableEditText != null) {
                int length = tableEditText.length();
                int i8 = i7 == i3 ? i4 : 0;
                int i9 = i7 == i5 ? i6 : length;
                if (i3 == i5) {
                    i8 = Math.min(i4, i6);
                    i9 = Math.max(i4, i6);
                }
                int max = Math.max(0, Math.min(i8, length));
                int max2 = Math.max(0, Math.min(i9, length));
                if (max >= max2) {
                    continue;
                } else {
                    if ((tableEditText.getCurrentStyle(max, max2) & i) == 0) {
                        return false;
                    }
                    z = true;
                }
            }
            i7++;
        }
        return z;
    }

    private void onLinkClickedTable() {
        RichEditText tableEditText;
        int startCell = this.textSelectionHelper.getStartCell();
        int startChildPosition = this.textSelectionHelper.getStartChildPosition();
        if (startChildPosition == this.textSelectionHelper.getEndChildPosition() && (tableEditText = tableEditText(startCell, startChildPosition)) != null) {
            int length = tableEditText.length();
            int max = Math.max(0, Math.min(Math.min(this.textSelectionHelper.getStartOffset(), this.textSelectionHelper.getEndOffset()), length));
            int max2 = Math.max(0, Math.min(Math.max(this.textSelectionHelper.getStartOffset(), this.textSelectionHelper.getEndOffset()), length));
            if (max >= max2) {
                return;
            }
            if (RichTextStyle.hasLink(tableEditText.getText(), max, max2)) {
                RichEditorHistory richEditorHistory = this.history;
                if (richEditorHistory != null) {
                    richEditorHistory.flush();
                }
                RichTextStyle.removeLink(tableEditText.getText(), max, max2);
                tableEditText.invalidateEffects();
                lambda$onMathClicked$4(startCell, startChildPosition);
                RichEditorHistory richEditorHistory2 = this.history;
                if (richEditorHistory2 != null) {
                    richEditorHistory2.record();
                }
                this.delegate.onSelectionChanged();
                refreshSelectionHighlight();
                return;
            }
            RichEditorHistory richEditorHistory3 = this.history;
            if (richEditorHistory3 != null) {
                richEditorHistory3.flush();
            }
            if (RichTextStyle.hasDate(tableEditText.getText(), max, max2)) {
                RichTextStyle.removeDate(tableEditText.getText(), max, max2);
                tableEditText.invalidateEffects();
                lambda$onMathClicked$4(startCell, startChildPosition);
                RichEditorHistory richEditorHistory4 = this.history;
                if (richEditorHistory4 != null) {
                    richEditorHistory4.record();
                }
                refreshSelectionHighlight();
            }
            tableEditText.setSelectionOverride(max, max2);
            tableEditText.makeSelectedUrl();
        }
    }

    private void onDateClickedTable() {
        RichEditText tableEditText;
        int startCell = this.textSelectionHelper.getStartCell();
        int startChildPosition = this.textSelectionHelper.getStartChildPosition();
        if (startChildPosition == this.textSelectionHelper.getEndChildPosition() && (tableEditText = tableEditText(startCell, startChildPosition)) != null) {
            int length = tableEditText.length();
            int max = Math.max(0, Math.min(Math.min(this.textSelectionHelper.getStartOffset(), this.textSelectionHelper.getEndOffset()), length));
            int max2 = Math.max(0, Math.min(Math.max(this.textSelectionHelper.getStartOffset(), this.textSelectionHelper.getEndOffset()), length));
            if (max >= max2) {
                return;
            }
            RichEditorHistory richEditorHistory = this.history;
            if (richEditorHistory != null) {
                richEditorHistory.flush();
            }
            if (RichTextStyle.hasLink(tableEditText.getText(), max, max2)) {
                RichTextStyle.removeLink(tableEditText.getText(), max, max2);
                tableEditText.invalidateEffects();
                lambda$onMathClicked$4(startCell, startChildPosition);
                RichEditorHistory richEditorHistory2 = this.history;
                if (richEditorHistory2 != null) {
                    richEditorHistory2.record();
                }
                refreshSelectionHighlight();
            }
            tableEditText.setSelectionOverride(max, max2);
            tableEditText.makeSelectedDate();
        }
    }

    boolean isCaptionSelection() {
        int startCell;
        TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper = this.textSelectionHelper;
        if (articleTextSelectionHelper == null || !articleTextSelectionHelper.isInSelectionMode() || (startCell = this.textSelectionHelper.getStartCell()) != this.textSelectionHelper.getEndCell() || startCell < 0 || startCell >= this.itemRows.size()) {
            return false;
        }
        return selectableAt(startCell) instanceof RichCaptionHost;
    }

    RichEditText captionEditText(int i) {
        KeyEvent.Callback selectableAt = selectableAt(i);
        if (selectableAt instanceof RichCaptionHost) {
            return ((RichCaptionHost) selectableAt).getCaptionEditText();
        }
        return null;
    }

    boolean isQuoteAuthorSelection() {
        int startCell;
        BlockRow rowForCell;
        TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper = this.textSelectionHelper;
        return articleTextSelectionHelper != null && articleTextSelectionHelper.isInSelectionMode() && (startCell = this.textSelectionHelper.getStartCell()) == this.textSelectionHelper.getEndCell() && startCell >= 0 && startCell < this.itemRows.size() && this.textSelectionHelper.getStartChildPosition() == 1 && this.textSelectionHelper.getEndChildPosition() == 1 && (rowForCell = rowForCell(startCell)) != null && RichTextCell.isQuoteBlock(rowForCell.block);
    }

    RichEditText quoteAuthorEditText(int i) {
        View selectableAt = selectableAt(i);
        if (selectableAt instanceof RichTextCell) {
            return ((RichTextCell) selectableAt).getAuthorEditText();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: persistQuoteAuthor, reason: merged with bridge method [inline-methods] */
    public void lambda$onMathClicked$6(int i) {
        View selectableAt = selectableAt(i);
        if (selectableAt instanceof RichTextCell) {
            ((RichTextCell) selectableAt).persistAuthor();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: persistCaption, reason: merged with bridge method [inline-methods] */
    public void lambda$onMathClicked$5(int i) {
        KeyEvent.Callback selectableAt = selectableAt(i);
        if (selectableAt instanceof RichCaptionHost) {
            ((RichCaptionHost) selectableAt).persistCaption();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private RichCaptionHost findCaptionHostAncestor(View view) {
        if (view instanceof RichCaptionHost) {
            return (RichCaptionHost) view;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof RichCaptionHost) {
                return (RichCaptionHost) parent;
            }
        }
        return null;
    }

    private void onFormattingClickedCaption(int i) {
        int startCell = this.textSelectionHelper.getStartCell();
        RichEditText captionEditText = captionEditText(startCell);
        if (captionEditText == null) {
            return;
        }
        int length = captionEditText.length();
        int max = Math.max(0, Math.min(Math.min(this.textSelectionHelper.getStartOffset(), this.textSelectionHelper.getEndOffset()), length));
        int max2 = Math.max(0, Math.min(Math.max(this.textSelectionHelper.getStartOffset(), this.textSelectionHelper.getEndOffset()), length));
        if (max >= max2) {
            return;
        }
        boolean z = (captionEditText.getCurrentStyle(max, max2) & i) == 0;
        int clearMaskFor = z ? clearMaskFor(i) : 0;
        RichEditorHistory richEditorHistory = this.history;
        if (richEditorHistory != null) {
            richEditorHistory.flush();
        }
        this.suppressSpansChanged = true;
        if (z) {
            if (clearMaskFor != 0) {
                captionEditText.removeStyle(clearMaskFor, max, max2);
            }
            captionEditText.addStyle(i, max, max2);
        } else {
            captionEditText.removeStyle(i, max, max2);
        }
        captionEditText.invalidateEffects();
        captionEditText.requestLayout();
        lambda$onMathClicked$5(startCell);
        this.suppressSpansChanged = false;
        RichEditorHistory richEditorHistory2 = this.history;
        if (richEditorHistory2 != null) {
            richEditorHistory2.record();
        }
        this.delegate.onSelectionChanged();
        refreshSelectionHighlight();
    }

    private void onLinkClickedCaption() {
        int startCell = this.textSelectionHelper.getStartCell();
        RichEditText captionEditText = captionEditText(startCell);
        if (captionEditText == null) {
            return;
        }
        int length = captionEditText.length();
        int max = Math.max(0, Math.min(Math.min(this.textSelectionHelper.getStartOffset(), this.textSelectionHelper.getEndOffset()), length));
        int max2 = Math.max(0, Math.min(Math.max(this.textSelectionHelper.getStartOffset(), this.textSelectionHelper.getEndOffset()), length));
        if (max >= max2) {
            return;
        }
        if (RichTextStyle.hasLink(captionEditText.getText(), max, max2)) {
            RichEditorHistory richEditorHistory = this.history;
            if (richEditorHistory != null) {
                richEditorHistory.flush();
            }
            RichTextStyle.removeLink(captionEditText.getText(), max, max2);
            captionEditText.invalidateEffects();
            lambda$onMathClicked$5(startCell);
            RichEditorHistory richEditorHistory2 = this.history;
            if (richEditorHistory2 != null) {
                richEditorHistory2.record();
            }
            this.delegate.onSelectionChanged();
            refreshSelectionHighlight();
            return;
        }
        RichEditorHistory richEditorHistory3 = this.history;
        if (richEditorHistory3 != null) {
            richEditorHistory3.flush();
        }
        if (RichTextStyle.hasDate(captionEditText.getText(), max, max2)) {
            RichTextStyle.removeDate(captionEditText.getText(), max, max2);
            captionEditText.invalidateEffects();
            lambda$onMathClicked$5(startCell);
            RichEditorHistory richEditorHistory4 = this.history;
            if (richEditorHistory4 != null) {
                richEditorHistory4.record();
            }
            refreshSelectionHighlight();
        }
        captionEditText.setSelectionOverride(max, max2);
        captionEditText.makeSelectedUrl();
    }

    private void onDateClickedCaption() {
        int startCell = this.textSelectionHelper.getStartCell();
        RichEditText captionEditText = captionEditText(startCell);
        if (captionEditText == null) {
            return;
        }
        int length = captionEditText.length();
        int max = Math.max(0, Math.min(Math.min(this.textSelectionHelper.getStartOffset(), this.textSelectionHelper.getEndOffset()), length));
        int max2 = Math.max(0, Math.min(Math.max(this.textSelectionHelper.getStartOffset(), this.textSelectionHelper.getEndOffset()), length));
        if (max >= max2) {
            return;
        }
        RichEditorHistory richEditorHistory = this.history;
        if (richEditorHistory != null) {
            richEditorHistory.flush();
        }
        if (RichTextStyle.hasLink(captionEditText.getText(), max, max2)) {
            RichTextStyle.removeLink(captionEditText.getText(), max, max2);
            captionEditText.invalidateEffects();
            lambda$onMathClicked$5(startCell);
            RichEditorHistory richEditorHistory2 = this.history;
            if (richEditorHistory2 != null) {
                richEditorHistory2.record();
            }
            refreshSelectionHighlight();
        }
        captionEditText.setSelectionOverride(max, max2);
        captionEditText.makeSelectedDate();
    }

    private boolean captionSelectionHasFormattable() {
        RichEditText captionEditText = captionEditText(this.textSelectionHelper.getStartCell());
        if (captionEditText == null) {
            return false;
        }
        int startOffset = this.textSelectionHelper.getStartOffset();
        int endOffset = this.textSelectionHelper.getEndOffset();
        return Math.max(0, Math.min(Math.min(startOffset, endOffset), captionEditText.length())) < Math.max(0, Math.min(Math.max(startOffset, endOffset), captionEditText.length()));
    }

    private void onFormattingClickedAuthor(int i) {
        int startCell = this.textSelectionHelper.getStartCell();
        RichEditText quoteAuthorEditText = quoteAuthorEditText(startCell);
        if (quoteAuthorEditText == null) {
            return;
        }
        int length = quoteAuthorEditText.length();
        int max = Math.max(0, Math.min(Math.min(this.textSelectionHelper.getStartOffset(), this.textSelectionHelper.getEndOffset()), length));
        int max2 = Math.max(0, Math.min(Math.max(this.textSelectionHelper.getStartOffset(), this.textSelectionHelper.getEndOffset()), length));
        if (max >= max2) {
            return;
        }
        boolean z = (quoteAuthorEditText.getCurrentStyle(max, max2) & i) == 0;
        int clearMaskFor = z ? clearMaskFor(i) : 0;
        RichEditorHistory richEditorHistory = this.history;
        if (richEditorHistory != null) {
            richEditorHistory.flush();
        }
        this.suppressSpansChanged = true;
        if (z) {
            if (clearMaskFor != 0) {
                quoteAuthorEditText.removeStyle(clearMaskFor, max, max2);
            }
            quoteAuthorEditText.addStyle(i, max, max2);
        } else {
            quoteAuthorEditText.removeStyle(i, max, max2);
        }
        quoteAuthorEditText.invalidateEffects();
        quoteAuthorEditText.requestLayout();
        lambda$onMathClicked$6(startCell);
        this.suppressSpansChanged = false;
        RichEditorHistory richEditorHistory2 = this.history;
        if (richEditorHistory2 != null) {
            richEditorHistory2.record();
        }
        this.delegate.onSelectionChanged();
        refreshSelectionHighlight();
    }

    private void onLinkClickedAuthor() {
        int startCell = this.textSelectionHelper.getStartCell();
        RichEditText quoteAuthorEditText = quoteAuthorEditText(startCell);
        if (quoteAuthorEditText == null) {
            return;
        }
        int length = quoteAuthorEditText.length();
        int max = Math.max(0, Math.min(Math.min(this.textSelectionHelper.getStartOffset(), this.textSelectionHelper.getEndOffset()), length));
        int max2 = Math.max(0, Math.min(Math.max(this.textSelectionHelper.getStartOffset(), this.textSelectionHelper.getEndOffset()), length));
        if (max >= max2) {
            return;
        }
        if (RichTextStyle.hasLink(quoteAuthorEditText.getText(), max, max2)) {
            RichEditorHistory richEditorHistory = this.history;
            if (richEditorHistory != null) {
                richEditorHistory.flush();
            }
            RichTextStyle.removeLink(quoteAuthorEditText.getText(), max, max2);
            quoteAuthorEditText.invalidateEffects();
            lambda$onMathClicked$6(startCell);
            RichEditorHistory richEditorHistory2 = this.history;
            if (richEditorHistory2 != null) {
                richEditorHistory2.record();
            }
            this.delegate.onSelectionChanged();
            refreshSelectionHighlight();
            return;
        }
        RichEditorHistory richEditorHistory3 = this.history;
        if (richEditorHistory3 != null) {
            richEditorHistory3.flush();
        }
        if (RichTextStyle.hasDate(quoteAuthorEditText.getText(), max, max2)) {
            RichTextStyle.removeDate(quoteAuthorEditText.getText(), max, max2);
            quoteAuthorEditText.invalidateEffects();
            lambda$onMathClicked$6(startCell);
            RichEditorHistory richEditorHistory4 = this.history;
            if (richEditorHistory4 != null) {
                richEditorHistory4.record();
            }
            refreshSelectionHighlight();
        }
        quoteAuthorEditText.setSelectionOverride(max, max2);
        quoteAuthorEditText.makeSelectedUrl();
    }

    private void onDateClickedAuthor() {
        int startCell = this.textSelectionHelper.getStartCell();
        RichEditText quoteAuthorEditText = quoteAuthorEditText(startCell);
        if (quoteAuthorEditText == null) {
            return;
        }
        int length = quoteAuthorEditText.length();
        int max = Math.max(0, Math.min(Math.min(this.textSelectionHelper.getStartOffset(), this.textSelectionHelper.getEndOffset()), length));
        int max2 = Math.max(0, Math.min(Math.max(this.textSelectionHelper.getStartOffset(), this.textSelectionHelper.getEndOffset()), length));
        if (max >= max2) {
            return;
        }
        RichEditorHistory richEditorHistory = this.history;
        if (richEditorHistory != null) {
            richEditorHistory.flush();
        }
        if (RichTextStyle.hasLink(quoteAuthorEditText.getText(), max, max2)) {
            RichTextStyle.removeLink(quoteAuthorEditText.getText(), max, max2);
            quoteAuthorEditText.invalidateEffects();
            lambda$onMathClicked$6(startCell);
            RichEditorHistory richEditorHistory2 = this.history;
            if (richEditorHistory2 != null) {
                richEditorHistory2.record();
            }
            refreshSelectionHighlight();
        }
        quoteAuthorEditText.setSelectionOverride(max, max2);
        quoteAuthorEditText.makeSelectedDate();
    }

    private boolean quoteAuthorSelectionHasFormattable() {
        RichEditText quoteAuthorEditText = quoteAuthorEditText(this.textSelectionHelper.getStartCell());
        if (quoteAuthorEditText == null) {
            return false;
        }
        int startOffset = this.textSelectionHelper.getStartOffset();
        int endOffset = this.textSelectionHelper.getEndOffset();
        return Math.max(0, Math.min(Math.min(startOffset, endOffset), quoteAuthorEditText.length())) < Math.max(0, Math.min(Math.max(startOffset, endOffset), quoteAuthorEditText.length()));
    }

    boolean selectionHasInlineFormattable() {
        TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper = this.textSelectionHelper;
        if (articleTextSelectionHelper != null && articleTextSelectionHelper.isInSelectionMode()) {
            if (isTableSelection()) {
                return tableSelectionHasFormattable();
            }
            if (isCaptionSelection()) {
                return captionSelectionHasFormattable();
            }
            if (isQuoteAuthorSelection()) {
                return quoteAuthorSelectionHasFormattable();
            }
            int startCell = this.textSelectionHelper.getStartCell();
            int endCell = this.textSelectionHelper.getEndCell();
            int startOffset = this.textSelectionHelper.getStartOffset();
            int endOffset = this.textSelectionHelper.getEndOffset();
            if (startCell >= 0 && endCell >= 0 && endCell >= startCell && endCell < this.rows.size()) {
                int i = startCell;
                while (i <= endCell) {
                    if (isInlineFormattable(((BlockRow) this.rows.get(i)).block)) {
                        int blockTextLength = blockTextLength(i);
                        if (Math.max(0, Math.min(i == startCell ? startOffset : 0, blockTextLength)) < Math.max(0, Math.min(i == endCell ? endOffset : blockTextLength, blockTextLength))) {
                            return true;
                        }
                    }
                    i++;
                }
            }
        }
        return false;
    }

    static boolean isHeading(TL_iv.PageBlock pageBlock) {
        return (pageBlock instanceof TL_iv.pageBlockHeading1) || (pageBlock instanceof TL_iv.pageBlockHeading2) || (pageBlock instanceof TL_iv.pageBlockHeading3) || (pageBlock instanceof TL_iv.pageBlockHeading4) || (pageBlock instanceof TL_iv.pageBlockHeading5) || (pageBlock instanceof TL_iv.pageBlockHeading6);
    }

    private static boolean endsWithOwnParagraph(TL_iv.PageBlock pageBlock) {
        return (pageBlock instanceof TL_iv.pageBlockPreformatted) || (pageBlock instanceof TL_iv.pageBlockBlockquote) || (pageBlock instanceof TL_iv.pageBlockPullquote);
    }

    private static boolean demotesToParagraph(TL_iv.PageBlock pageBlock) {
        return isHeading(pageBlock) || (pageBlock instanceof TL_iv.pageBlockPreformatted) || (pageBlock instanceof TL_iv.pageBlockBlockquote);
    }

    public void setAllowTapAboveContent(boolean z) {
        this.allowTapAboveContent = z;
    }

    public void setInsets(int i, int i2, int i3) {
        this.bottomInset = i;
        this.imeInset = i2;
        this.emojiPadding = i3;
    }

    public boolean handleSelectionTouch(MotionEvent motionEvent) {
        RichTableCell richTableCell;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.pressX = motionEvent.getX();
            float y = motionEvent.getY();
            this.pressY = y;
            this.pressMoved = false;
            this.longPressConsumed = false;
            this.pressTarget = findCellUnder((int) this.pressX, (int) y);
            long eventTime = motionEvent.getEventTime();
            boolean z = !this.textSelectionHelper.isInSelectionMode() && eventTime - this.lastTapDownTime <= ((long) ViewConfiguration.getDoubleTapTimeout()) && Math.abs(this.pressX - this.lastTapDownX) <= ((float) AndroidUtilities.dp(24.0f)) && Math.abs(this.pressY - this.lastTapDownY) <= ((float) AndroidUtilities.dp(24.0f));
            this.lastTapDownTime = eventTime;
            float f = this.pressX;
            this.lastTapDownX = f;
            float f2 = this.pressY;
            this.lastTapDownY = f2;
            if (z && tryStartTextSelection(this.pressTarget, f, f2)) {
                cancelPendingMathEdit();
                this.longPressConsumed = true;
                this.lastTapDownTime = 0L;
                this.textSelectionHelper.finishOneTouchSelection();
                return true;
            }
            if (this.pressTarget != null) {
                Runnable runnable = this.longPressRunnable;
                if (runnable != null) {
                    removeCallbacks(runnable);
                }
                Runnable runnable2 = new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda21
                    @Override // java.lang.Runnable
                    public final void run() {
                        RichEditorListView.this.lambda$handleSelectionTouch$9();
                    }
                };
                this.longPressRunnable = runnable2;
                postDelayed(runnable2, ViewConfiguration.getLongPressTimeout());
            }
        } else if (action == 1) {
            Runnable runnable3 = this.longPressRunnable;
            if (runnable3 != null) {
                removeCallbacks(runnable3);
                this.longPressRunnable = null;
            }
            if (!this.pressMoved && !this.longPressConsumed) {
                View view = this.pressTarget;
                if (view instanceof RichTableCell) {
                    if (handleTableHandleTap((RichTableCell) view, (int) ((motionEvent.getX() - r0.getLeft()) - getLeft()), (int) ((motionEvent.getY() - r0.getTop()) - getTop()))) {
                        this.pressTarget = null;
                        this.longPressConsumed = false;
                    }
                }
            }
            if (!this.pressMoved && !this.longPressConsumed && (richTableCell = this.activeCellSelectionTable) != null) {
                View view2 = this.pressTarget;
                if (view2 == richTableCell) {
                    RichTableCell richTableCell2 = (RichTableCell) view2;
                    TL_iv.pageTableCell findCellAt = richTableCell2.findCellAt((int) ((motionEvent.getX() - richTableCell2.getLeft()) - getLeft()), (int) ((motionEvent.getY() - richTableCell2.getTop()) - getTop()));
                    if (findCellAt != null) {
                        if (isDotSelection()) {
                            exitCellSelectionMode();
                        } else {
                            richTableCell2.toggleCellSelection(findCellAt);
                        }
                    }
                } else if (view2 != null) {
                    exitCellSelectionMode();
                }
            }
            if (!this.pressMoved && !this.longPressConsumed && this.pressTarget == null && !this.textSelectionHelper.isInSelectionMode() && this.activeCellSelectionTable == null && isTapBelowContent(motionEvent.getX(), motionEvent.getY())) {
                onTapBelowContent();
            }
            if (!this.pressMoved && !this.longPressConsumed && this.pressTarget == null && !this.textSelectionHelper.isInSelectionMode() && this.activeCellSelectionTable == null && isTapAboveContent(motionEvent.getX(), motionEvent.getY())) {
                onTapAboveContent();
            }
            if (!this.pressMoved && !this.longPressConsumed && (this.pressTarget instanceof RichMathCell) && !this.textSelectionHelper.isInSelectionMode() && this.activeCellSelectionTable == null) {
                final BlockRow row = ((RichMathCell) this.pressTarget).getRow();
                cancelPendingMathEdit();
                Runnable runnable4 = new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda20
                    @Override // java.lang.Runnable
                    public final void run() {
                        RichEditorListView.this.lambda$handleSelectionTouch$10(row);
                    }
                };
                this.pendingMathEdit = runnable4;
                postDelayed(runnable4, ViewConfiguration.getDoubleTapTimeout());
            }
            this.pressTarget = null;
            this.longPressConsumed = false;
        } else if (action == 2) {
            float x = motionEvent.getX() - this.pressX;
            float y2 = motionEvent.getY() - this.pressY;
            if ((x * x) + (y2 * y2) > AndroidUtilities.dp(8.0f) * AndroidUtilities.dp(8.0f)) {
                this.pressMoved = true;
                Runnable runnable5 = this.longPressRunnable;
                if (runnable5 != null) {
                    removeCallbacks(runnable5);
                    this.longPressRunnable = null;
                }
            }
        } else if (action == 3) {
            Runnable runnable6 = this.longPressRunnable;
            if (runnable6 != null) {
                removeCallbacks(runnable6);
                this.longPressRunnable = null;
            }
            this.pressTarget = null;
            this.longPressConsumed = false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$handleSelectionTouch$9() {
        if (this.pressTarget == null || this.textSelectionHelper.isInSelectionMode()) {
            return;
        }
        if (tryStartTextSelection(this.pressTarget, this.pressX, this.pressY)) {
            this.longPressConsumed = true;
            return;
        }
        int left = (int) ((this.pressX - this.pressTarget.getLeft()) - getLeft());
        int top = (int) ((this.pressY - this.pressTarget.getTop()) - getTop());
        View view = this.pressTarget;
        if (view instanceof RichTableCell) {
            RichTableCell richTableCell = (RichTableCell) view;
            if (handleTableHandleTap(richTableCell, left, top)) {
                try {
                    richTableCell.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                this.longPressConsumed = true;
                return;
            }
            TL_iv.pageTableCell findCellAt = richTableCell.findCellAt(left, top);
            if (findCellAt != null) {
                enterCellSelectionMode(richTableCell, findCellAt);
                try {
                    richTableCell.performHapticFeedback(0);
                } catch (Exception unused2) {
                }
                this.longPressConsumed = true;
                return;
            }
            startBlockDrag(this.pressTarget);
            return;
        }
        startBlockDrag(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$handleSelectionTouch$10(BlockRow blockRow) {
        this.pendingMathEdit = null;
        openMathEditor(blockRow);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean tryStartTextSelection(View view, float f, float f2) {
        if (view != 0 && !this.textSelectionHelper.isInSelectionMode()) {
            int left = (int) ((f - view.getLeft()) - getLeft());
            int top = (int) ((f2 - view.getTop()) - getTop());
            if (view instanceof RichTextCell) {
                RichTextCell richTextCell = (RichTextCell) view;
                if (richTextCell.isPressOnText(left, top)) {
                    this.textSelectionHelper.setMaybeView(left, top, richTextCell);
                    this.textSelectionHelper.trySelect(richTextCell);
                    return true;
                }
            } else if (view instanceof RichTableCell) {
                RichTableCell richTableCell = (RichTableCell) view;
                if (richTableCell.isPressOnText(left, top)) {
                    this.textSelectionHelper.setMaybeView(left, top, richTableCell);
                    this.textSelectionHelper.trySelect(richTableCell);
                    return true;
                }
            } else if (view instanceof RichCaptionHost) {
                if (((RichCaptionHost) view).isPressOnCaption(left, top)) {
                    this.textSelectionHelper.setMaybeView(left, top, view);
                    this.textSelectionHelper.trySelect(view);
                    return true;
                }
            } else if (view instanceof RichDetailsCell) {
                RichDetailsCell richDetailsCell = (RichDetailsCell) view;
                if (richDetailsCell.isPressOnText(left, top)) {
                    this.textSelectionHelper.setMaybeView(left, top, richDetailsCell);
                    this.textSelectionHelper.trySelect(richDetailsCell);
                    return true;
                }
            } else if (view instanceof RichMathCell) {
                this.textSelectionHelper.setMaybeView(left, top, view);
                this.textSelectionHelper.trySelect(view);
                return true;
            }
        }
        return false;
    }

    private View findCellUnder(int i, int i2) {
        int top = i2 - getTop();
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if (top >= childAt.getTop() && top < childAt.getBottom() && i >= childAt.getLeft() && i < childAt.getRight()) {
                return childAt;
            }
        }
        return null;
    }

    private boolean isTapBelowContent(float f, float f2) {
        View view = (View) getParent();
        if (view == null || f < getLeft() || f > getRight()) {
            return false;
        }
        int top = getTop() + getPaddingTop();
        for (int i = 0; i < getChildCount(); i++) {
            top = Math.max(top, getTop() + getChildAt(i).getBottom());
        }
        return f2 >= ((float) top) && f2 <= ((float) ((view.getHeight() - AndroidUtilities.dp(60.0f)) - Math.max(Math.max(this.emojiPadding, this.bottomInset), this.imeInset)));
    }

    private boolean isTapAboveContent(float f, float f2) {
        int i;
        if (!this.allowTapAboveContent || f < getLeft() || f > getRight()) {
            return false;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= getChildCount()) {
                i = ConnectionsManager.DEFAULT_DATACENTER_ID;
                break;
            }
            View childAt = getChildAt(i2);
            if (getChildAdapterPosition(childAt) == 0) {
                i = getTop() + childAt.getTop();
                break;
            }
            i2++;
        }
        return i != Integer.MAX_VALUE && f2 >= ((float) (getTop() + AndroidUtilities.dp(60.0f))) && f2 <= ((float) i);
    }

    private void onTapAboveContent() {
        BlockRow blockRow = this.rows.isEmpty() ? null : (BlockRow) this.rows.get(0);
        if (blockRow != null && !isNonText(blockRow.block) && !blockRow.detailsEnd && !isDetailsHeader(blockRow) && !endsWithOwnParagraph(blockRow.block)) {
            lambda$onTapAboveContent$11(blockRow);
            return;
        }
        RichEditorHistory richEditorHistory = this.history;
        if (richEditorHistory != null) {
            richEditorHistory.flush();
        }
        final BlockRow blockRow2 = new BlockRow(new TL_iv.pageBlockParagraph());
        this.rows.add(0, blockRow2);
        this.adapter.update(false);
        RichEditorHistory richEditorHistory2 = this.history;
        if (richEditorHistory2 != null) {
            richEditorHistory2.record();
        }
        post(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda38
            @Override // java.lang.Runnable
            public final void run() {
                RichEditorListView.this.lambda$onTapAboveContent$11(blockRow2);
            }
        });
    }

    public void focusForDraft() {
        if (focusForDraftInternal()) {
            return;
        }
        post(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                RichEditorListView.this.focusForDraftInternal();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean focusForDraftInternal() {
        BlockRow blockRow;
        if (this.rows.isEmpty()) {
            blockRow = null;
        } else {
            ArrayList arrayList = this.rows;
            blockRow = (BlockRow) arrayList.get(arrayList.size() - 1);
        }
        if (blockRow != null && !isNonText(blockRow.block) && !blockRow.detailsEnd && !isDetailsHeader(blockRow) && !endsWithOwnParagraph(blockRow.block)) {
            if (!(findViewByItemObject(blockRow) instanceof RichTextCell)) {
                return false;
            }
            lambda$onTapBelowContent$13(blockRow);
        } else {
            RichEditorHistory richEditorHistory = this.history;
            if (richEditorHistory != null) {
                richEditorHistory.flush();
            }
            final BlockRow blockRow2 = new BlockRow(new TL_iv.pageBlockParagraph());
            this.rows.add(blockRow2);
            this.adapter.update(false);
            RichEditorHistory richEditorHistory2 = this.history;
            if (richEditorHistory2 != null) {
                richEditorHistory2.record();
            }
            post(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda51
                @Override // java.lang.Runnable
                public final void run() {
                    RichEditorListView.this.lambda$focusForDraftInternal$12(blockRow2);
                }
            });
        }
        return true;
    }

    private void onTapBelowContent() {
        BlockRow blockRow;
        if (this.rows.isEmpty()) {
            blockRow = null;
        } else {
            blockRow = (BlockRow) this.rows.get(r0.size() - 1);
        }
        if (blockRow != null && !isNonText(blockRow.block) && !blockRow.detailsEnd && !isDetailsHeader(blockRow) && !endsWithOwnParagraph(blockRow.block)) {
            lambda$onTapBelowContent$13(blockRow);
            return;
        }
        RichEditorHistory richEditorHistory = this.history;
        if (richEditorHistory != null) {
            richEditorHistory.flush();
        }
        final BlockRow blockRow2 = new BlockRow(new TL_iv.pageBlockParagraph());
        this.rows.add(blockRow2);
        this.adapter.update(false);
        RichEditorHistory richEditorHistory2 = this.history;
        if (richEditorHistory2 != null) {
            richEditorHistory2.record();
        }
        post(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda44
            @Override // java.lang.Runnable
            public final void run() {
                RichEditorListView.this.lambda$onTapBelowContent$13(blockRow2);
            }
        });
    }

    @Override // org.telegram.ui.Components.UniversalRecyclerView
    protected void onReorderStart(RecyclerView.ViewHolder viewHolder) {
        this.draggingRow = rowFromHolder(viewHolder);
        this.draggingOverTrash = false;
        Delegate delegate = this.delegate;
        if (delegate != null) {
            delegate.onReorderStart();
        }
    }

    @Override // org.telegram.ui.Components.UniversalRecyclerView
    protected void onReorderMoved(RecyclerView.ViewHolder viewHolder) {
        if (this.delegate == null || viewHolder == null) {
            return;
        }
        viewHolder.itemView.getLocationOnScreen(new int[2]);
        this.draggingOverTrash = this.delegate.onReorderMove(r0[0] + (r5.getWidth() / 2.0f), r0[1] + r5.getHeight());
    }

    @Override // org.telegram.ui.Components.UniversalRecyclerView
    protected void onReorderEnd(RecyclerView.ViewHolder viewHolder) {
        Delegate delegate = this.delegate;
        if (delegate != null) {
            delegate.onReorderEnd();
        }
    }

    @Override // org.telegram.ui.Components.UniversalRecyclerView
    protected boolean isReorderRemoving() {
        return this.draggingOverTrash;
    }

    @Override // org.telegram.ui.Components.UniversalRecyclerView
    protected void onReorderRemove(RecyclerView.ViewHolder viewHolder) {
        BlockRow blockRow = this.draggingRow;
        this.draggingRow = null;
        this.draggingOverTrash = false;
        if (blockRow == null) {
            if (viewHolder != null) {
                viewHolder.itemView.setTranslationX(0.0f);
                viewHolder.itemView.setTranslationY(0.0f);
                return;
            }
            return;
        }
        RichEditorHistory richEditorHistory = this.history;
        if (richEditorHistory != null) {
            richEditorHistory.flush();
        }
        removeRow(blockRow);
        RichEditorHistory richEditorHistory2 = this.history;
        if (richEditorHistory2 != null) {
            richEditorHistory2.record();
        }
        Delegate delegate = this.delegate;
        if (delegate != null) {
            delegate.onContentChanged();
        }
    }

    private BlockRow rowFromHolder(RecyclerView.ViewHolder viewHolder) {
        int adapterPosition;
        UItem item;
        if (viewHolder == null || (adapterPosition = viewHolder.getAdapterPosition()) < 0 || (item = this.adapter.getItem(adapterPosition)) == null) {
            return null;
        }
        Object obj = item.object;
        if (obj instanceof BlockRow) {
            return (BlockRow) obj;
        }
        return null;
    }

    private void startBlockDrag(View view) {
        RecyclerView.ViewHolder childViewHolder;
        int adapterPosition;
        if (view == null || this.itemTouchHelper == null || !isReorderAllowed() || (childViewHolder = getChildViewHolder(view)) == null || (adapterPosition = childViewHolder.getAdapterPosition()) < 0 || !this.adapter.isReorderItem(adapterPosition)) {
            return;
        }
        this.longPressConsumed = true;
        if (this.textSelectionHelper.isInSelectionMode()) {
            this.textSelectionHelper.clear();
        }
        try {
            view.performHapticFeedback(0);
        } catch (Exception unused) {
        }
        this.itemTouchHelper.startDrag(childViewHolder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void setEditTextsLocked(boolean z) {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof RichTextCell) {
                ((RichTextCell) childAt).setLocked(z);
            } else if (childAt instanceof RichTableCell) {
                ((RichTableCell) childAt).setLocked(z);
            } else if (childAt instanceof RichCaptionHost) {
                ((RichCaptionHost) childAt).getCaptionEditText().setLocked(z);
            } else if (childAt instanceof RichDetailsCell) {
                ((RichDetailsCell) childAt).setLocked(z);
            } else if (childAt instanceof RichDividerCell) {
                childAt.invalidate();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hideEditTextActionModes() {
        for (int i = 0; i < getChildCount(); i++) {
            KeyEvent.Callback childAt = getChildAt(i);
            if (childAt instanceof RichTextCell) {
                ((RichTextCell) childAt).hideActionModes();
            } else if (childAt instanceof RichTableCell) {
                ((RichTableCell) childAt).hideActionModes();
            } else if (childAt instanceof RichCaptionHost) {
                ((RichCaptionHost) childAt).getCaptionEditText().hideActionMode();
            } else if (childAt instanceof RichDetailsCell) {
                ((RichDetailsCell) childAt).getEditText().hideActionMode();
            }
        }
    }

    public boolean deselectIfAny() {
        TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper = this.textSelectionHelper;
        if (articleTextSelectionHelper != null && articleTextSelectionHelper.isInSelectionMode()) {
            this.textSelectionHelper.clear();
            return true;
        }
        if (this.activeCellSelectionTable == null) {
            return false;
        }
        exitCellSelectionMode();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void restoreFocusAt(int i, int i2, int i3) {
        if (i < 0) {
            return;
        }
        KeyEvent.Callback findViewByPosition = this.layoutManager.findViewByPosition(i);
        if (findViewByPosition instanceof RichTextCell) {
            RichTextCell richTextCell = (RichTextCell) findViewByPosition;
            RichEditText authorEditText = (i2 == 1 && richTextCell.isAuthorVisible()) ? richTextCell.getAuthorEditText() : richTextCell.getEditText();
            authorEditText.requestEditFocus();
            authorEditText.setSelection(Math.max(0, Math.min(i3, authorEditText.length())));
            return;
        }
        if (findViewByPosition instanceof RichTableCell) {
            RichTableCell richTableCell = (RichTableCell) findViewByPosition;
            TableModel model = richTableCell.getModel();
            if (model == null) {
                return;
            }
            if (i2 < 0 || i2 >= model.anchors().size()) {
                i2 = 0;
            }
            RichTableCellHost hostForAnchor = richTableCell.getGrid().hostForAnchor((TL_iv.pageTableCell) model.anchors().get(i2));
            if (hostForAnchor == null) {
                return;
            }
            hostForAnchor.editText.requestEditFocus();
            hostForAnchor.editText.setSelection(Math.max(0, Math.min(i3, hostForAnchor.editText.length())));
            return;
        }
        if (findViewByPosition instanceof RichCaptionHost) {
            RichEditText captionEditText = ((RichCaptionHost) findViewByPosition).getCaptionEditText();
            captionEditText.requestEditFocus();
            captionEditText.setSelection(Math.max(0, Math.min(i3, captionEditText.length())));
        }
    }

    public TextSelectionHelper.ArticleTextSelectionHelper getTextSelectionHelper() {
        return this.textSelectionHelper;
    }

    RichMapCell.Delegate getMapDelegate() {
        return this.mapDelegate;
    }

    private void cancelPendingMathEdit() {
        Runnable runnable = this.pendingMathEdit;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.pendingMathEdit = null;
        }
    }

    private void openMathEditor(BlockRow blockRow) {
        if (blockRow != null) {
            TL_iv.PageBlock pageBlock = blockRow.block;
            if (pageBlock instanceof TL_iv.pageBlockMath) {
                final TL_iv.pageBlockMath pageblockmath = (TL_iv.pageBlockMath) pageBlock;
                ChatAttachAlertRichLayout.showEditLatexSheet(getContext(), TextUtils.isEmpty(pageblockmath.source) ? "" : pageblockmath.source, new Utilities.Callback() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda40
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        RichEditorListView.this.lambda$openMathEditor$14(pageblockmath, (String) obj);
                    }
                }, this.resourcesProvider);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$openMathEditor$14(TL_iv.pageBlockMath pageblockmath, String str) {
        if (TextUtils.equals(str, pageblockmath.source)) {
            return;
        }
        RichEditorHistory richEditorHistory = this.history;
        if (richEditorHistory != null) {
            richEditorHistory.flush();
        }
        pageblockmath.source = str;
        this.adapter.update(false);
        RichEditorHistory richEditorHistory2 = this.history;
        if (richEditorHistory2 != null) {
            richEditorHistory2.record();
        }
        this.delegate.onContentChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void deleteDetails(BlockRow blockRow) {
        int indexOf = this.rows.indexOf(blockRow);
        if (indexOf < 0 || !isDetailsHeader(blockRow)) {
            return;
        }
        int matchingDetailsEnd = matchingDetailsEnd(indexOf);
        if (matchingDetailsEnd >= this.rows.size()) {
            matchingDetailsEnd = this.rows.size() - 1;
        }
        RichEditorHistory richEditorHistory = this.history;
        if (richEditorHistory != null) {
            richEditorHistory.flush();
        }
        while (matchingDetailsEnd >= indexOf) {
            this.rows.remove(matchingDetailsEnd);
            matchingDetailsEnd--;
        }
        final BlockRow blockRow2 = null;
        BlockRow blockRow3 = indexOf > 0 ? (BlockRow) this.rows.get(indexOf - 1) : null;
        if (blockRow3 != null && !blockRow3.detailsEnd && !isDetailsHeader(blockRow3) && !isNonText(blockRow3.block)) {
            blockRow2 = blockRow3;
        }
        if (this.rows.isEmpty()) {
            blockRow2 = new BlockRow(new TL_iv.pageBlockParagraph());
            this.rows.add(blockRow2);
        }
        this.adapter.update(false);
        RichEditorHistory richEditorHistory2 = this.history;
        if (richEditorHistory2 != null) {
            richEditorHistory2.record();
        }
        if (blockRow2 != null) {
            post(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda54
                @Override // java.lang.Runnable
                public final void run() {
                    RichEditorListView.this.lambda$deleteDetails$15(blockRow2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void toggleDetails(BlockRow blockRow) {
        if (isDetailsHeader(blockRow)) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) blockRow.block;
            RichEditorHistory richEditorHistory = this.history;
            if (richEditorHistory != null) {
                richEditorHistory.flush();
            }
            pageblockdetails.open = !pageblockdetails.open;
            this.adapter.update(true);
            RichEditorHistory richEditorHistory2 = this.history;
            if (richEditorHistory2 != null) {
                richEditorHistory2.record();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onDetailsTitleEnter(BlockRow blockRow) {
        int indexOf = this.rows.indexOf(blockRow);
        if (indexOf < 0) {
            return;
        }
        TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) blockRow.block;
        if (!pageblockdetails.open) {
            pageblockdetails.open = true;
            this.adapter.update(true);
        }
        int i = indexOf + 1;
        if (i >= this.rows.size() || ((BlockRow) this.rows.get(i)).detailsEnd || isDetailsHeader((BlockRow) this.rows.get(i))) {
            return;
        }
        final BlockRow blockRow2 = (BlockRow) this.rows.get(i);
        post(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda56
            @Override // java.lang.Runnable
            public final void run() {
                RichEditorListView.this.lambda$onDetailsTitleEnter$16(blockRow2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$17(RichTableCell richTableCell) {
        if (richTableCell != this.activeCellSelectionTable) {
            return;
        }
        if (!richTableCell.hasCellSelection()) {
            exitCellSelectionMode();
        } else {
            showTableCellMenu(richTableCell);
        }
    }

    private void beginCellSelection(RichTableCell richTableCell) {
        RichTableCell richTableCell2 = this.activeCellSelectionTable;
        if (richTableCell2 != null && richTableCell2 != richTableCell) {
            richTableCell2.clearCellSelection();
        }
        this.activeCellSelectionTable = richTableCell;
        this.dotSelectedCol = -1;
        this.dotSelectedRow = -1;
        richTableCell.setCellSelectionListener(this.cellSelectionListener);
        TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper = this.textSelectionHelper;
        if (articleTextSelectionHelper != null && articleTextSelectionHelper.isInSelectionMode()) {
            this.textSelectionHelper.clear();
        }
        setEditTextsLocked(true);
    }

    private boolean isDotSelection() {
        return this.dotSelectedRow >= 0 || this.dotSelectedCol >= 0;
    }

    void enterCellSelectionMode(RichTableCell richTableCell, TL_iv.pageTableCell pagetablecell) {
        beginCellSelection(richTableCell);
        richTableCell.addCellToSelection(pagetablecell);
    }

    private boolean handleTableHandleTap(RichTableCell richTableCell, int i, int i2) {
        int findRowHandleAt = richTableCell.findRowHandleAt(i, i2);
        if (findRowHandleAt >= 0) {
            if (richTableCell == this.activeCellSelectionTable && this.dotSelectedRow == findRowHandleAt) {
                exitCellSelectionMode();
            } else {
                beginCellSelection(richTableCell);
                richTableCell.selectWholeRow(findRowHandleAt);
                this.dotSelectedRow = findRowHandleAt;
            }
            return true;
        }
        int findColHandleAt = richTableCell.findColHandleAt(i, i2);
        if (findColHandleAt < 0) {
            return false;
        }
        if (richTableCell == this.activeCellSelectionTable && this.dotSelectedCol == findColHandleAt) {
            exitCellSelectionMode();
        } else {
            beginCellSelection(richTableCell);
            richTableCell.selectWholeColumn(findColHandleAt);
            this.dotSelectedCol = findColHandleAt;
        }
        return true;
    }

    private void exitCellSelectionMode() {
        dismissTableCellMenu();
        RichTableCell richTableCell = this.activeCellSelectionTable;
        if (richTableCell != null) {
            richTableCell.clearCellSelection();
            this.activeCellSelectionTable = null;
        }
        this.dotSelectedCol = -1;
        this.dotSelectedRow = -1;
        setEditTextsLocked(false);
    }

    private void dismissTableCellMenu() {
        ItemOptions itemOptions = this.tableCellMenu;
        if (itemOptions != null) {
            this.tableCellMenu = null;
            itemOptions.dismiss();
        }
    }

    RichTableCell findFocusedTableCell() {
        View findFocus = findFocus();
        if (findFocus instanceof RichEditText) {
            return findTableCellAncestor(findFocus);
        }
        return null;
    }

    TL_iv.pageTableCell focusedCellOf(RichTableCell richTableCell) {
        RichTableCellHost findHostContaining;
        View findFocus = findFocus();
        if ((findFocus instanceof RichEditText) && (findHostContaining = richTableCell.findHostContaining(findFocus)) != null) {
            return findHostContaining.cell;
        }
        return null;
    }

    private View tableMenuAnchor(RichTableCell richTableCell, boolean z) {
        RichTableCellHost hostForAnchor;
        TableModel model = richTableCell.getModel();
        if (model == null) {
            return richTableCell;
        }
        int i = ConnectionsManager.DEFAULT_DATACENTER_ID;
        int i2 = z ? -1 : ConnectionsManager.DEFAULT_DATACENTER_ID;
        TL_iv.pageTableCell pagetablecell = null;
        for (TL_iv.pageTableCell pagetablecell2 : richTableCell.getSelectedCells()) {
            int anchorColOf = model.anchorColOf(pagetablecell2);
            int anchorRowOf = z ? (model.anchorRowOf(pagetablecell2) + TableModel.spanRow(pagetablecell2)) - 1 : model.anchorRowOf(pagetablecell2);
            if (!z ? anchorRowOf < i2 || (anchorRowOf == i2 && anchorColOf < i) : anchorRowOf > i2 || (anchorRowOf == i2 && anchorColOf < i)) {
                pagetablecell = pagetablecell2;
                i = anchorColOf;
                i2 = anchorRowOf;
            }
        }
        return (pagetablecell == null || (hostForAnchor = richTableCell.getGrid().hostForAnchor(pagetablecell)) == null) ? richTableCell : hostForAnchor;
    }

    void showTableCellMenu(final RichTableCell richTableCell) {
        int i;
        CharSequence string;
        boolean z;
        TableModel model = richTableCell.getModel();
        if (model == null) {
            return;
        }
        Set<TL_iv.pageTableCell> selectedCells = richTableCell.getSelectedCells();
        if (selectedCells.isEmpty()) {
            return;
        }
        int size = selectedCells.size();
        int i2 = (size < 2 || !computeCanMerge(model, selectedCells)) ? 0 : 1;
        int i3 = (size == 1 && computeHasSpan(selectedCells.iterator().next())) ? 1 : 0;
        boolean computeSpansFullRows = computeSpansFullRows(model, selectedCells);
        boolean computeSpansFullColumns = computeSpansFullColumns(model, selectedCells);
        boolean computeAllSelected = computeAllSelected(model, selectedCells);
        int i4 = (!computeSpansFullRows || computeAllSelected || distinctSelectedRows(model, selectedCells) >= model.rowCount) ? 0 : 1;
        int i5 = (!computeSpansFullColumns || computeAllSelected || distinctSelectedCols(model, selectedCells) >= model.colCount) ? 0 : 1;
        boolean z2 = computeSpansFullColumns && model.colCount < MessagesController.getInstance(this.currentAccount).config.richMessageMaxTableCols.get();
        dismissTableCellMenu();
        int dp = AndroidUtilities.dp(((i2 + 1 + i3 + (z2 ? 2 : 0) + (computeSpansFullRows ? 2 : 0) + i5 + i4 + (computeAllSelected ? 1 : 0)) * 48) + 68);
        View tableMenuAnchor = tableMenuAnchor(richTableCell, false);
        int[] iArr = new int[2];
        tableMenuAnchor.getLocationOnScreen(iArr);
        boolean z3 = (iArr[1] - dp) - AndroidUtilities.dp(8.0f) >= AndroidUtilities.statusBarHeight + AndroidUtilities.dp(8.0f);
        if (!z3) {
            tableMenuAnchor = tableMenuAnchor(richTableCell, true);
        }
        final ItemOptions dontFocus = this.delegate.makeMenu(tableMenuAnchor).dontFocus();
        dontFocus.setDimAlpha(0);
        dontFocus.setDrawScrim(false);
        if (z3) {
            dontFocus.forceTop(true);
        }
        dontFocus.followScrimView();
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        TextView textView = new TextView(getContext());
        textView.setText(LocaleController.getString(R.string.ArticleAlignment));
        textView.setTextSize(1, 12.0f);
        textView.setGravity(17);
        textView.setTextColor(getThemedColor(Theme.key_windowBackgroundWhiteGrayText));
        linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2, 0.0f, 5.0f, 0.0f, 4.0f));
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        linearLayout2.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        linearLayout2.setOrientation(0);
        linearLayout.addView(linearLayout2, LayoutHelper.createLinear(-2, -2, 17));
        RichEditor.Button accent = new RichEditor.Button(getContext(), R.drawable.iv_align_horiz_left, this.resourcesProvider).setRoundRadius(4).setAccent(false);
        linearLayout2.addView(accent, LayoutHelper.createLinear(32, 32));
        int i6 = i4;
        RichEditor.Button accent2 = new RichEditor.Button(getContext(), R.drawable.iv_align_horiz_middle, this.resourcesProvider).setRoundRadius(4).setAccent(false);
        linearLayout2.addView(accent2, LayoutHelper.createLinear(32, 32));
        int i7 = i5;
        RichEditor.Button accent3 = new RichEditor.Button(getContext(), R.drawable.iv_align_horiz_right, this.resourcesProvider).setRoundRadius(4).setAccent(false);
        final RichEditor.Button[] buttonArr = {accent, accent2, accent3};
        linearLayout2.addView(accent3, LayoutHelper.createLinear(32, 32));
        linearLayout2.addView(new Space(getContext()), LayoutHelper.createLinear(8, 0));
        RichEditor.Button accent4 = new RichEditor.Button(getContext(), R.drawable.iv_align_vert_top, this.resourcesProvider).setRoundRadius(4).setAccent(false);
        linearLayout2.addView(accent4, LayoutHelper.createLinear(32, 32));
        boolean z4 = z2;
        RichEditor.Button accent5 = new RichEditor.Button(getContext(), R.drawable.iv_align_vert_middle, this.resourcesProvider).setRoundRadius(4).setAccent(false);
        linearLayout2.addView(accent5, LayoutHelper.createLinear(32, 32));
        int i8 = i3;
        RichEditor.Button accent6 = new RichEditor.Button(getContext(), R.drawable.iv_align_vert_bottom, this.resourcesProvider).setRoundRadius(4).setAccent(false);
        final RichEditor.Button[] buttonArr2 = {accent4, accent5, accent6};
        linearLayout2.addView(accent6, LayoutHelper.createLinear(32, 32));
        dontFocus.addView(linearLayout);
        int commonHorizontalAlign = richTableCell.commonHorizontalAlign();
        int commonVerticalAlign = richTableCell.commonVerticalAlign();
        int i9 = 0;
        while (i9 < 3) {
            buttonArr[i9].setSelected(i9 == commonHorizontalAlign);
            i9++;
        }
        int i10 = 0;
        while (i10 < 3) {
            buttonArr2[i10].setSelected(i10 == commonVerticalAlign);
            i10++;
        }
        for (final int i11 = 0; i11 < 3; i11++) {
            buttonArr[i11].setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    RichEditorListView.lambda$showTableCellMenu$18(RichTableCell.this, i11, buttonArr, view);
                }
            });
        }
        for (final int i12 = 0; i12 < 3; i12++) {
            buttonArr2[i12].setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda11
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    RichEditorListView.lambda$showTableCellMenu$19(RichTableCell.this, i12, buttonArr2, view);
                }
            });
        }
        dontFocus.addSpaceGap();
        final boolean allSelectedHeader = richTableCell.allSelectedHeader();
        if (allSelectedHeader) {
            string = LocaleController.getString(R.string.ArticleRemoveHighlight);
        } else {
            if (computeSpansFullColumns) {
                i = R.string.ArticleHighlightColumn;
            } else {
                i = computeSpansFullRows ? R.string.ArticleHighlightRow : R.string.ArticleHighlightCell;
            }
            string = LocaleController.getString(i);
        }
        dontFocus.add(allSelectedHeader ? R.drawable.iv_table_highlight_remove : R.drawable.iv_table_highlight, string, new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda12
            @Override // java.lang.Runnable
            public final void run() {
                RichEditorListView.this.lambda$showTableCellMenu$20(richTableCell, allSelectedHeader);
            }
        });
        if (i2 != 0) {
            dontFocus.add(R.drawable.iv_table_merge, LocaleController.getString(R.string.ArticleMergeCells), new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda13
                @Override // java.lang.Runnable
                public final void run() {
                    RichEditorListView.this.lambda$showTableCellMenu$21(richTableCell);
                }
            });
        }
        if (i8 != 0) {
            dontFocus.add(R.drawable.iv_table_unmerge, LocaleController.getString(R.string.ArticleSplitCells), new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda14
                @Override // java.lang.Runnable
                public final void run() {
                    RichEditorListView.this.lambda$showTableCellMenu$22(richTableCell);
                }
            });
        }
        if (z4) {
            dontFocus.add(R.drawable.iv_table_insert_left, LocaleController.getString(R.string.ArticleInsertLeft), new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda15
                @Override // java.lang.Runnable
                public final void run() {
                    RichEditorListView.this.lambda$showTableCellMenu$23(richTableCell);
                }
            });
            dontFocus.add(R.drawable.iv_table_insert_right, LocaleController.getString(R.string.ArticleInsertRight), new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda16
                @Override // java.lang.Runnable
                public final void run() {
                    RichEditorListView.this.lambda$showTableCellMenu$24(richTableCell);
                }
            });
        }
        if (computeSpansFullRows) {
            dontFocus.add(R.drawable.iv_table_insert_top, LocaleController.getString(R.string.ArticleInsertAbove), new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda17
                @Override // java.lang.Runnable
                public final void run() {
                    RichEditorListView.this.lambda$showTableCellMenu$25(richTableCell);
                }
            });
            dontFocus.add(R.drawable.iv_table_insert_bottom, LocaleController.getString(R.string.ArticleInsertBelow), new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda18
                @Override // java.lang.Runnable
                public final void run() {
                    RichEditorListView.this.lambda$showTableCellMenu$26(richTableCell);
                }
            });
        }
        if (i7 != 0) {
            z = true;
            dontFocus.add(R.drawable.iv_table_remove, LocaleController.getString(R.string.ArticleDeleteColumn), true, new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda19
                @Override // java.lang.Runnable
                public final void run() {
                    RichEditorListView.this.lambda$showTableCellMenu$27(richTableCell);
                }
            });
        } else {
            z = true;
        }
        if (i6 != 0) {
            dontFocus.add(R.drawable.iv_table_remove, LocaleController.getString(R.string.ArticleDeleteRow), z, new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda8
                @Override // java.lang.Runnable
                public final void run() {
                    RichEditorListView.this.lambda$showTableCellMenu$28(richTableCell);
                }
            });
        }
        if (computeAllSelected) {
            dontFocus.add(R.drawable.iv_table_remove, LocaleController.getString(R.string.ArticleDeleteTable), z, new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda9
                @Override // java.lang.Runnable
                public final void run() {
                    RichEditorListView.this.lambda$showTableCellMenu$29(richTableCell);
                }
            });
        }
        dontFocus.setOnDismiss(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda10
            @Override // java.lang.Runnable
            public final void run() {
                RichEditorListView.this.lambda$showTableCellMenu$30(dontFocus);
            }
        });
        this.tableCellMenu = dontFocus;
        dontFocus.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showTableCellMenu$18(RichTableCell richTableCell, int i, RichEditor.Button[] buttonArr, View view) {
        richTableCell.applyHorizontalAlign(i);
        int i2 = 0;
        while (i2 < 3) {
            buttonArr[i2].setSelected(i2 == i);
            i2++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showTableCellMenu$19(RichTableCell richTableCell, int i, RichEditor.Button[] buttonArr, View view) {
        richTableCell.applyVerticalAlign(i);
        int i2 = 0;
        while (i2 < 3) {
            buttonArr[i2].setSelected(i2 == i);
            i2++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showTableCellMenu$20(RichTableCell richTableCell, boolean z) {
        richTableCell.applyHeaderToggle(!z);
        exitCellSelectionMode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showTableCellMenu$21(RichTableCell richTableCell) {
        richTableCell.applyMergeFromSelection();
        exitCellSelectionMode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showTableCellMenu$22(RichTableCell richTableCell) {
        richTableCell.applyUnmergeFromSelection();
        exitCellSelectionMode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showTableCellMenu$23(RichTableCell richTableCell) {
        richTableCell.applyInsertColumnFromSelection(true);
        exitCellSelectionMode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showTableCellMenu$24(RichTableCell richTableCell) {
        richTableCell.applyInsertColumnFromSelection(false);
        exitCellSelectionMode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showTableCellMenu$25(RichTableCell richTableCell) {
        richTableCell.applyInsertRowFromSelection(true);
        exitCellSelectionMode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showTableCellMenu$26(RichTableCell richTableCell) {
        richTableCell.applyInsertRowFromSelection(false);
        exitCellSelectionMode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showTableCellMenu$27(RichTableCell richTableCell) {
        richTableCell.applyDeleteColumnsFromSelection();
        exitCellSelectionMode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showTableCellMenu$28(RichTableCell richTableCell) {
        richTableCell.applyDeleteRowsFromSelection();
        exitCellSelectionMode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showTableCellMenu$29(RichTableCell richTableCell) {
        BlockRow row = richTableCell.getRow();
        exitCellSelectionMode();
        if (row != null) {
            RichEditorHistory richEditorHistory = this.history;
            if (richEditorHistory != null) {
                richEditorHistory.flush();
            }
            removeRow(row);
            RichEditorHistory richEditorHistory2 = this.history;
            if (richEditorHistory2 != null) {
                richEditorHistory2.record();
            }
            Delegate delegate = this.delegate;
            if (delegate != null) {
                delegate.onContentChanged();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showTableCellMenu$30(ItemOptions itemOptions) {
        if (this.tableCellMenu == itemOptions) {
            this.tableCellMenu = null;
        }
    }

    private static boolean computeHasSpan(TL_iv.pageTableCell pagetablecell) {
        return TableModel.spanCol(pagetablecell) > 1 || TableModel.spanRow(pagetablecell) > 1;
    }

    private static boolean computeCanMerge(TableModel tableModel, Set set) {
        Iterator it = set.iterator();
        int i = ConnectionsManager.DEFAULT_DATACENTER_ID;
        int i2 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        int i3 = -1;
        int i4 = -1;
        while (it.hasNext()) {
            TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) it.next();
            int anchorRowOf = tableModel.anchorRowOf(pagetablecell);
            int anchorColOf = tableModel.anchorColOf(pagetablecell);
            int spanRow = TableModel.spanRow(pagetablecell);
            int spanCol = TableModel.spanCol(pagetablecell);
            i2 = Math.min(i2, anchorRowOf);
            i = Math.min(i, anchorColOf);
            i4 = Math.max(i4, (anchorRowOf + spanRow) - 1);
            i3 = Math.max(i3, (anchorColOf + spanCol) - 1);
        }
        HashSet hashSet = new HashSet();
        while (i2 <= i4) {
            for (int i5 = i; i5 <= i3; i5++) {
                if (i2 < 0 || i5 < 0 || i2 >= tableModel.rowCount || i5 >= tableModel.colCount) {
                    return false;
                }
                hashSet.add(tableModel.grid[i2][i5]);
            }
            i2++;
        }
        return hashSet.equals(new HashSet(set));
    }

    private static boolean computeSpansFullRows(TableModel tableModel, Set set) {
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(Integer.valueOf(tableModel.anchorRowOf((TL_iv.pageTableCell) it.next())));
        }
        if (hashSet.isEmpty()) {
            return false;
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            int intValue = ((Integer) it2.next()).intValue();
            if (intValue < 0 || intValue >= tableModel.rowCount) {
                return false;
            }
            for (int i = 0; i < tableModel.colCount; i++) {
                if (tableModel.anchorR[intValue][i] != intValue || !set.contains(tableModel.grid[intValue][i])) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean computeSpansFullColumns(TableModel tableModel, Set set) {
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(Integer.valueOf(tableModel.anchorColOf((TL_iv.pageTableCell) it.next())));
        }
        if (hashSet.isEmpty()) {
            return false;
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            int intValue = ((Integer) it2.next()).intValue();
            if (intValue < 0 || intValue >= tableModel.colCount) {
                return false;
            }
            for (int i = 0; i < tableModel.rowCount; i++) {
                if (tableModel.anchorC[i][intValue] != intValue || !set.contains(tableModel.grid[i][intValue])) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean computeAllSelected(TableModel tableModel, Set set) {
        if (set.isEmpty() || tableModel.rowCount <= 0 || tableModel.colCount <= 0) {
            return false;
        }
        HashSet hashSet = new HashSet();
        for (int i = 0; i < tableModel.rowCount; i++) {
            for (int i2 = 0; i2 < tableModel.colCount; i2++) {
                hashSet.add(tableModel.grid[i][i2]);
            }
        }
        return hashSet.equals(new HashSet(set));
    }

    private static int distinctSelectedRows(TableModel tableModel, Set set) {
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(Integer.valueOf(tableModel.anchorRowOf((TL_iv.pageTableCell) it.next())));
        }
        return hashSet.size();
    }

    private static int distinctSelectedCols(TableModel tableModel, Set set) {
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(Integer.valueOf(tableModel.anchorColOf((TL_iv.pageTableCell) it.next())));
        }
        return hashSet.size();
    }

    void handleSlashCommand(BlockRow blockRow, int i) {
        this.pendingMediaRow = null;
        RichEditorHistory richEditorHistory = this.history;
        if (richEditorHistory != null) {
            richEditorHistory.flush();
        }
        clearRowText(blockRow);
        RichEditorHistory richEditorHistory2 = this.history;
        if (richEditorHistory2 != null) {
            richEditorHistory2.record();
        }
        switch (i) {
            case 1:
                this.delegate.onOpenAttachRequest(74, 3);
                break;
            case 2:
                this.delegate.onOpenAttachRequest(74, 6);
                break;
            case 3:
                openLatexEditorAndAdd();
                break;
            case 4:
            case 5:
                this.delegate.onOpenAttachRequest(74, 1);
                break;
            case 6:
                insertDetails();
                break;
        }
    }

    private void clearRowText(BlockRow blockRow) {
        if (blockRow == null) {
            return;
        }
        RichTextCell.applyTextToBlock(blockRow.block, "");
        View findViewByItemObject = findViewByItemObject(blockRow);
        if (findViewByItemObject instanceof RichTextCell) {
            ((RichTextCell) findViewByItemObject).getEditText().setTextSilently("");
        }
    }

    private void openLatexEditorAndAdd() {
        ChatAttachAlertRichLayout.showEditLatexSheet(getContext(), "", new Utilities.Callback() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda53
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                RichEditorListView.this.lambda$openLatexEditorAndAdd$31((String) obj);
            }
        }, this.resourcesProvider);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$openLatexEditorAndAdd$31(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        TL_iv.pageBlockMath pageblockmath = new TL_iv.pageBlockMath();
        pageblockmath.source = str;
        addBlock(pageblockmath);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View, android.widget.TextView, org.telegram.ui.iv.RichEditText] */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v7, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v1, types: [org.telegram.ui.iv.RichTableCell] */
    /* JADX WARN: Type inference failed for: r8v0, types: [android.view.View, org.telegram.ui.iv.RichEditorListView] */
    public RichEditorHistory.FocusState captureFocusState() {
        View findFocus = findFocus();
        if (!(findFocus instanceof RichEditText)) {
            return RichEditorHistory.FocusState.NONE;
        }
        ?? r0 = (RichEditText) findFocus;
        int selectionStart = r0.getSelectionStart();
        int selectionEnd = r0.getSelectionEnd();
        ?? findTableCellAncestor = findTableCellAncestor(r0);
        if (findTableCellAncestor != 0 && findTableCellAncestor.getRow() != null) {
            RichTableCellHost findHostContaining = findTableCellAncestor.findHostContaining(r0);
            TableModel model = findTableCellAncestor.getModel();
            return new RichEditorHistory.FocusState(findTableCellAncestor.getRow().id, (findHostContaining == null || model == null) ? -1 : model.anchors().indexOf(findHostContaining.cell), selectionStart, selectionEnd);
        }
        RichCaptionHost findCaptionHostAncestor = findCaptionHostAncestor(r0);
        if (findCaptionHostAncestor != null && findCaptionHostAncestor.getRow() != null) {
            return new RichEditorHistory.FocusState(findCaptionHostAncestor.getRow().id, -1, selectionStart, selectionEnd);
        }
        while (r0 != 0 && !(r0 instanceof RichTextCell)) {
            Object parent = r0.getParent();
            r0 = parent instanceof View ? (View) parent : 0;
        }
        if (r0 instanceof RichTextCell) {
            RichTextCell richTextCell = (RichTextCell) r0;
            if (richTextCell.getRow() != null) {
                return new RichEditorHistory.FocusState(richTextCell.getRow().id, -1, selectionStart, selectionEnd);
            }
        }
        return RichEditorHistory.FocusState.NONE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void restoreFromHistory(List list, final RichEditorHistory.FocusState focusState) {
        this.textSelectionHelper.clear();
        this.rows.clear();
        this.rows.addAll(list);
        renumberAllRuns();
        this.adapter.update(false);
        if (focusState == null || focusState.rowId < 0) {
            return;
        }
        post(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda43
            @Override // java.lang.Runnable
            public final void run() {
                RichEditorListView.this.lambda$restoreFromHistory$32(focusState);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: focusFromHistory, reason: merged with bridge method [inline-methods] */
    public void lambda$restoreFromHistory$32(RichEditorHistory.FocusState focusState) {
        RichTableCellHost hostForAnchor;
        int indexOfRowId = indexOfRowId(focusState.rowId);
        if (indexOfRowId < 0) {
            return;
        }
        KeyEvent.Callback findViewByPosition = this.layoutManager.findViewByPosition(indexOfRowId);
        if (findViewByPosition instanceof RichTextCell) {
            RichTextCell richTextCell = (RichTextCell) findViewByPosition;
            richTextCell.requestEditFocus();
            RichEditText editText = richTextCell.getEditText();
            int length = editText.length();
            editText.setSelection(Math.max(0, Math.min(focusState.selStart, length)), Math.max(0, Math.min(focusState.selEnd, length)));
            return;
        }
        if (findViewByPosition instanceof RichTableCell) {
            RichTableCell richTableCell = (RichTableCell) findViewByPosition;
            TableModel model = richTableCell.getModel();
            if (model == null) {
                return;
            }
            int i = focusState.childIndex;
            if (i < 0 || i >= model.anchors().size()) {
                i = 0;
            }
            if (model.anchors().isEmpty() || (hostForAnchor = richTableCell.getGrid().hostForAnchor((TL_iv.pageTableCell) model.anchors().get(i))) == null) {
                return;
            }
            hostForAnchor.editText.requestEditFocus();
            int length2 = hostForAnchor.editText.length();
            hostForAnchor.editText.setSelection(Math.max(0, Math.min(focusState.selStart, length2)), Math.max(0, Math.min(focusState.selEnd, length2)));
            return;
        }
        if (findViewByPosition instanceof RichCaptionHost) {
            RichEditText captionEditText = ((RichCaptionHost) findViewByPosition).getCaptionEditText();
            captionEditText.requestEditFocus();
            int length3 = captionEditText.length();
            captionEditText.setSelection(Math.max(0, Math.min(focusState.selStart, length3)), Math.max(0, Math.min(focusState.selEnd, length3)));
        }
    }

    private int indexOfRowId(long j) {
        for (int i = 0; i < this.rows.size(); i++) {
            if (((BlockRow) this.rows.get(i)).id == j) {
                return i;
            }
        }
        return -1;
    }

    BlockRow rowForCell(int i) {
        if (i < 0 || i >= this.itemRows.size()) {
            return null;
        }
        return (BlockRow) this.itemRows.get(i);
    }

    private void fillItems(ArrayList arrayList, UniversalAdapter universalAdapter) {
        this.itemRows.clear();
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        boolean z = false;
        int i2 = -1;
        while (i < this.rows.size()) {
            BlockRow blockRow = (BlockRow) this.rows.get(i);
            if (blockRow.detailsEnd) {
                boolean z2 = i2 != -1;
                if (!arrayList2.isEmpty()) {
                    arrayList2.remove(arrayList2.size() - 1);
                }
                if (i2 != -1 && arrayList2.size() < i2) {
                    i2 = -1;
                } else if (!z2) {
                    if (z) {
                        universalAdapter.reorderSectionEnd();
                        z = false;
                    }
                    arrayList.add(RichDetailsEndCell.Factory.of(blockRow));
                    this.itemRows.add(blockRow);
                }
            } else {
                boolean z3 = i2 != -1;
                if (isDetailsHeader(blockRow)) {
                    if (!z3) {
                        boolean z4 = ((TL_iv.pageBlockDetails) blockRow.block).open;
                        if (!arrayList2.isEmpty() || z4) {
                            if (z) {
                                universalAdapter.reorderSectionEnd();
                                z = false;
                            }
                        } else if (!z) {
                            universalAdapter.reorderSectionStart();
                            z = true;
                        }
                        arrayList.add(RichDetailsCell.Factory.of(blockRow, this.detailsDelegate));
                        this.itemRows.add(blockRow);
                        if (!z4) {
                            i2 = arrayList2.size() + 1;
                        }
                    }
                    arrayList2.add(blockRow);
                } else if (!z3) {
                    if (arrayList2.isEmpty()) {
                        if (!z) {
                            universalAdapter.reorderSectionStart();
                            z = true;
                        }
                    } else if (z) {
                        universalAdapter.reorderSectionEnd();
                        z = false;
                    }
                    TL_iv.PageBlock pageBlock = blockRow.block;
                    if (pageBlock instanceof TL_iv.pageBlockDivider) {
                        arrayList.add(RichDividerCell.Factory.of(blockRow, this.dividerDelegate));
                    } else if (isMedia(pageBlock)) {
                        arrayList.add(RichMediaCell.Factory.of(blockRow, this.mediaDelegate));
                    } else {
                        TL_iv.PageBlock pageBlock2 = blockRow.block;
                        if (pageBlock2 instanceof TL_iv.pageBlockAudio) {
                            arrayList.add(RichAudioCell.Factory.of(blockRow, this.audioDelegate));
                        } else if (pageBlock2 instanceof TL_iv.pageBlockMap) {
                            arrayList.add(RichMapCell.Factory.of(blockRow, this.mapDelegate));
                        } else if (pageBlock2 instanceof TL_iv.pageBlockMath) {
                            arrayList.add(RichMathCell.Factory.of(blockRow, this.mathDelegate));
                        } else if (pageBlock2 instanceof TL_iv.pageBlockTable) {
                            arrayList.add(RichTableCell.Factory.of(blockRow, this.tableDelegate));
                        } else {
                            arrayList.add(RichTextCell.Factory.of(blockRow, this.cellDelegate, this.rows.size() == 2 && i == 1 && (blockRow.block instanceof TL_iv.pageBlockParagraph) && (((BlockRow) this.rows.get(0)).block instanceof TL_iv.pageBlockHeading1)));
                        }
                    }
                    this.itemRows.add(blockRow);
                }
            }
            i++;
        }
        if (z) {
            universalAdapter.reorderSectionEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onRowsReordered(int i, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object obj = ((UItem) it.next()).object;
            if (obj instanceof BlockRow) {
                arrayList2.add((BlockRow) obj);
            }
        }
        if (arrayList2.size() < 2) {
            return;
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        int i2 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        int i3 = -1;
        int i4 = 0;
        while (it2.hasNext()) {
            BlockRow blockRow = (BlockRow) it2.next();
            int indexOf = this.rows.indexOf(blockRow);
            if (indexOf < 0) {
                return;
            }
            int i5 = indexOf + 1;
            if (isDetailsHeader(blockRow) && !((TL_iv.pageBlockDetails) blockRow.block).open) {
                int matchingDetailsEnd = matchingDetailsEnd(indexOf);
                i5 = matchingDetailsEnd >= this.rows.size() ? this.rows.size() : matchingDetailsEnd + 1;
            }
            arrayList3.add(new ArrayList(this.rows.subList(indexOf, i5)));
            i2 = Math.min(i2, indexOf);
            i3 = Math.max(i3, i5);
            i4 += i5 - indexOf;
        }
        if (i4 != i3 - i2) {
            return;
        }
        ArrayList arrayList4 = new ArrayList(i4);
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            arrayList4.addAll((ArrayList) it3.next());
        }
        for (int i6 = 0; i6 < arrayList4.size(); i6++) {
            if (this.rows.get(i2 + i6) != arrayList4.get(i6)) {
                RichEditorHistory richEditorHistory = this.history;
                if (richEditorHistory != null) {
                    richEditorHistory.flush();
                }
                for (int i7 = 0; i7 < arrayList4.size(); i7++) {
                    this.rows.set(i2 + i7, (BlockRow) arrayList4.get(i7));
                }
                renumberAllRuns();
                RichEditorHistory richEditorHistory2 = this.history;
                if (richEditorHistory2 != null) {
                    richEditorHistory2.record();
                    return;
                }
                return;
            }
        }
    }

    private static boolean isMedia(TL_iv.PageBlock pageBlock) {
        return (pageBlock instanceof TL_iv.pageBlockPhoto) || (pageBlock instanceof TL_iv.pageBlockVideo) || isGallery(pageBlock);
    }

    static boolean isGallery(TL_iv.PageBlock pageBlock) {
        return (pageBlock instanceof TL_iv.pageBlockCollage) || (pageBlock instanceof TL_iv.pageBlockSlideshow);
    }

    static ArrayList galleryItems(TL_iv.PageBlock pageBlock) {
        if (pageBlock instanceof TL_iv.pageBlockCollage) {
            return ((TL_iv.pageBlockCollage) pageBlock).items;
        }
        if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
            return ((TL_iv.pageBlockSlideshow) pageBlock).items;
        }
        return null;
    }

    static List mediasOf(BlockRow blockRow) {
        if (blockRow == null) {
            return Collections.emptyList();
        }
        if (isGallery(blockRow.block)) {
            ArrayList arrayList = blockRow.medias;
            return arrayList != null ? arrayList : Collections.emptyList();
        }
        MediaUploadState mediaUploadState = blockRow.media;
        return mediaUploadState != null ? Collections.singletonList(mediaUploadState) : Collections.emptyList();
    }

    private static long mediaIdOf(TL_iv.PageBlock pageBlock) {
        if (pageBlock instanceof TL_iv.pageBlockPhoto) {
            return ((TL_iv.pageBlockPhoto) pageBlock).photo_id;
        }
        if (pageBlock instanceof TL_iv.pageBlockVideo) {
            return ((TL_iv.pageBlockVideo) pageBlock).video_id;
        }
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static TL_iv.PageBlock itemBlockFor(BlockRow blockRow, MediaUploadState mediaUploadState) {
        if (isGallery(blockRow.block)) {
            ArrayList galleryItems = galleryItems(blockRow.block);
            ArrayList arrayList = blockRow.medias;
            int indexOf = arrayList != null ? arrayList.indexOf(mediaUploadState) : -1;
            if (indexOf < 0 || galleryItems == null || indexOf >= galleryItems.size()) {
                return null;
            }
            return (TL_iv.PageBlock) galleryItems.get(indexOf);
        }
        return blockRow.block;
    }

    private void onItemClick(UItem uItem, View view, int i, float f, float f2) {
        if (view instanceof RichTextCell) {
            ((RichTextCell) view).requestEditFocus();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean handleKeyEvent(KeyEvent keyEvent) {
        RichTableCell findTableCellAncestor;
        RichTableCellHost findHostContaining;
        int unicodeChar;
        int i;
        boolean z;
        RichEditorHistory richEditorHistory;
        if (keyEvent.getAction() != 0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        boolean isShiftPressed = keyEvent.isShiftPressed();
        boolean isCtrlPressed = keyEvent.isCtrlPressed();
        boolean isAltPressed = keyEvent.isAltPressed();
        boolean isInSelectionMode = this.textSelectionHelper.isInSelectionMode();
        if (isCtrlPressed && !isAltPressed && (richEditorHistory = this.history) != null) {
            if (keyCode == 54 && !isShiftPressed) {
                richEditorHistory.undo();
                return true;
            }
            if ((keyCode == 54 && isShiftPressed) || keyCode == 53) {
                richEditorHistory.redo();
                return true;
            }
        }
        if (isCtrlPressed && !isAltPressed) {
            if (isShiftPressed) {
                if (keyCode != 41) {
                    if (keyCode != 44) {
                        if (keyCode == 47 || keyCode == 52) {
                            i = 8;
                        }
                        i = 0;
                    } else {
                        i = 256;
                    }
                    z = false;
                    if (!z) {
                    }
                }
                i = 4;
                z = false;
                if (!z) {
                }
            } else {
                if (keyCode != 30) {
                    if (keyCode != 33) {
                        if (keyCode == 37) {
                            i = 2;
                        } else if (keyCode != 39) {
                            if (keyCode == 49) {
                                i = 16;
                            }
                            i = 0;
                        } else {
                            i = 0;
                            z = true;
                            if (!z) {
                                onLinkClicked();
                                return true;
                            }
                            if (i != 0) {
                                onFormattingClicked(i);
                                return true;
                            }
                        }
                    }
                    i = 4;
                } else {
                    i = 1;
                }
                z = false;
                if (!z) {
                }
            }
        }
        if (keyCode == 111 && isInSelectionMode) {
            this.textSelectionHelper.clear();
            return true;
        }
        if (isInSelectionMode) {
            if (isCtrlPressed && !isShiftPressed && keyCode == 31) {
                copyHelperSelection();
                return true;
            }
            if (isCtrlPressed && !isShiftPressed && keyCode == 52) {
                cutHelperSelection();
                return true;
            }
            if (isCtrlPressed && keyCode == 50) {
                pasteAtHelperSelection();
                return true;
            }
            if (keyCode == 67 || keyCode == 112) {
                deleteHelperSelection();
                return true;
            }
            if (keyCode == 66) {
                replaceHelperSelectionWith("\n");
                return true;
            }
            if (!isCtrlPressed && !isAltPressed && (unicodeChar = keyEvent.getUnicodeChar(keyEvent.getMetaState())) >= 32) {
                replaceHelperSelectionWith(String.valueOf((char) unicodeChar));
                return true;
            }
        }
        if (!isInSelectionMode && isShiftPressed && isArrowKey(keyCode) && tryEscalateSelectionFromCaret(keyCode)) {
            return true;
        }
        if (isInSelectionMode && isShiftPressed && isArrowKey(keyCode)) {
            if (tryExtendSelectionAcrossCells(keyCode, isCtrlPressed || isAltPressed)) {
                return true;
            }
        }
        if (isInSelectionMode && !isShiftPressed && !isCtrlPressed && !isAltPressed && isArrowKey(keyCode)) {
            boolean z2 = keyCode == 22 || keyCode == 20;
            this.restoreFocusCell = z2 ? this.textSelectionHelper.getEndCell() : this.textSelectionHelper.getStartCell();
            this.restoreFocusOffset = z2 ? this.textSelectionHelper.getEndOffset() : this.textSelectionHelper.getStartOffset();
            this.restoreFocusChildPosition = z2 ? this.textSelectionHelper.getEndChildPosition() : this.textSelectionHelper.getStartChildPosition();
            this.textSelectionHelper.clear();
            return true;
        }
        if (isCtrlPressed && keyCode == 29 && tryEscalateSelectAll()) {
            return true;
        }
        if (!isInSelectionMode && !isShiftPressed && !isCtrlPressed && !isAltPressed && ((keyCode == 20 || keyCode == 19) && tryPlainArrowAcrossCells(keyCode))) {
            return true;
        }
        if (!isInSelectionMode && !isCtrlPressed && !isAltPressed && keyCode == 61) {
            View findFocus = findFocus();
            if ((findFocus instanceof RichEditText) && (findTableCellAncestor = findTableCellAncestor(findFocus)) != null && (findHostContaining = findTableCellAncestor.findHostContaining(findFocus)) != null && findTableCellAncestor.moveFocusByTab(findHostContaining, isShiftPressed)) {
                return true;
            }
        }
        if (keyCode != 61 || !isInSelectionMode) {
            return false;
        }
        int startCell = this.textSelectionHelper.getStartCell();
        int endCell = this.textSelectionHelper.getEndCell();
        if (startCell >= 0 && endCell >= startCell) {
            if (startCell == endCell) {
                BlockRow rowForCell = rowForCell(startCell);
                if (rowForCell != null) {
                    onCellIndent(rowForCell, isShiftPressed);
                }
            } else {
                int indexOf = this.rows.indexOf(rowForCell(startCell));
                int indexOf2 = this.rows.indexOf(rowForCell(endCell));
                if (indexOf >= 0 && indexOf2 >= indexOf) {
                    rangeIndent(indexOf, indexOf2, isShiftPressed);
                }
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void addBlock(TL_iv.PageBlock pageBlock) {
        RichEditorHistory richEditorHistory;
        RichEditorHistory richEditorHistory2 = this.history;
        if (richEditorHistory2 != null) {
            richEditorHistory2.flush();
        }
        final BlockRow findFocusedRow = findFocusedRow();
        int indexOf = findFocusedRow != null ? this.rows.indexOf(findFocusedRow) : -1;
        if (findFocusedRow != null) {
            TL_iv.PageBlock pageBlock2 = findFocusedRow.block;
            if ((pageBlock2 instanceof TL_iv.pageBlockParagraph) && RichTextCell.readPlainText(pageBlock2).isEmpty()) {
                findFocusedRow.block = pageBlock;
                if (hasCaption(pageBlock)) {
                    int indexOf2 = this.rows.indexOf(findFocusedRow) + 1;
                    if (indexOf2 >= this.rows.size() || isNonText(((BlockRow) this.rows.get(indexOf2)).block)) {
                        findFocusedRow = new BlockRow(new TL_iv.pageBlockParagraph());
                        this.rows.add(indexOf2, findFocusedRow);
                    } else {
                        findFocusedRow = (BlockRow) this.rows.get(indexOf2);
                    }
                }
                this.adapter.update(false);
                richEditorHistory = this.history;
                if (richEditorHistory != null) {
                    richEditorHistory.record();
                }
                post(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda31
                    @Override // java.lang.Runnable
                    public final void run() {
                        RichEditorListView.this.lambda$addBlock$33(findFocusedRow);
                    }
                });
            }
        }
        findFocusedRow = new BlockRow(pageBlock);
        if (indexOf >= 0) {
            this.rows.add(indexOf + 1, findFocusedRow);
        } else {
            this.rows.add(findFocusedRow);
        }
        if (hasCaption(pageBlock)) {
        }
        this.adapter.update(false);
        richEditorHistory = this.history;
        if (richEditorHistory != null) {
        }
        post(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda31
            @Override // java.lang.Runnable
            public final void run() {
                RichEditorListView.this.lambda$addBlock$33(findFocusedRow);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addBlock$33(BlockRow blockRow) {
        View findViewByItemObject = findViewByItemObject(blockRow);
        if (findViewByItemObject instanceof RichTextCell) {
            RichTextCell richTextCell = (RichTextCell) findViewByItemObject;
            richTextCell.requestEditFocus();
            richTextCell.getEditText().setSelection(0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void insertDetails() {
        RichEditorHistory richEditorHistory;
        RichEditorHistory richEditorHistory2 = this.history;
        if (richEditorHistory2 != null) {
            richEditorHistory2.flush();
        }
        TL_iv.pageBlockDetails pageblockdetails = new TL_iv.pageBlockDetails();
        pageblockdetails.open = true;
        pageblockdetails.title = new TL_iv.textEmpty();
        final BlockRow blockRow = new BlockRow(pageblockdetails);
        BlockRow blockRow2 = new BlockRow(new TL_iv.pageBlockParagraph());
        BlockRow newDetailsEndRow = newDetailsEndRow();
        BlockRow findFocusedRow = findFocusedRow();
        int indexOf = findFocusedRow != null ? this.rows.indexOf(findFocusedRow) : -1;
        if (findFocusedRow != null) {
            TL_iv.PageBlock pageBlock = findFocusedRow.block;
            if ((pageBlock instanceof TL_iv.pageBlockParagraph) && findFocusedRow.media == null && !findFocusedRow.detailsEnd && RichTextCell.readPlainText(pageBlock).isEmpty()) {
                this.rows.remove(indexOf);
                this.rows.add(indexOf, newDetailsEndRow);
                this.rows.add(indexOf, blockRow2);
                this.rows.add(indexOf, blockRow);
                this.adapter.update(false);
                richEditorHistory = this.history;
                if (richEditorHistory != null) {
                    richEditorHistory.record();
                }
                post(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda46
                    @Override // java.lang.Runnable
                    public final void run() {
                        RichEditorListView.this.lambda$insertDetails$34(blockRow);
                    }
                });
            }
        }
        indexOf = indexOf >= 0 ? indexOf + 1 : this.rows.size();
        this.rows.add(indexOf, newDetailsEndRow);
        this.rows.add(indexOf, blockRow2);
        this.rows.add(indexOf, blockRow);
        this.adapter.update(false);
        richEditorHistory = this.history;
        if (richEditorHistory != null) {
        }
        post(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda46
            @Override // java.lang.Runnable
            public final void run() {
                RichEditorListView.this.lambda$insertDetails$34(blockRow);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$insertDetails$34(BlockRow blockRow) {
        View findViewByItemObject = findViewByItemObject(blockRow);
        if (findViewByItemObject instanceof RichDetailsCell) {
            ((RichDetailsCell) findViewByItemObject).requestEditFocus();
        }
    }

    void attachAudio(MessageObject messageObject) {
        TLRPC.Document document;
        if (messageObject == null || (document = messageObject.getDocument()) == null) {
            return;
        }
        RichEditorHistory richEditorHistory = this.history;
        if (richEditorHistory != null) {
            richEditorHistory.flush();
        }
        TL_iv.pageBlockAudio pageblockaudio = new TL_iv.pageBlockAudio();
        BlockRow blockRow = new BlockRow(pageblockaudio);
        MediaUploadState mediaUploadState = new MediaUploadState();
        blockRow.media = mediaUploadState;
        mediaUploadState.isAudio = true;
        long j = document.id;
        boolean z = j == 0 || document.dc_id == 0 || document.access_hash == 0;
        if (z) {
            TLRPC.Message message = messageObject.messageOwner;
            String str = message != null ? message.attachPath : null;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            MediaUploadState mediaUploadState2 = blockRow.media;
            mediaUploadState2.audioDisplayDocument = document;
            mediaUploadState2.localPath = str;
            mediaUploadState2.state = 1;
            mediaUploadState2.progress = 0.0f;
        } else {
            mediaUploadState.document = document;
            mediaUploadState.audioDisplayDocument = document;
            mediaUploadState.state = 2;
            pageblockaudio.audio_id = j;
        }
        insertPreparedRow(blockRow);
        if (z) {
            startAudioUpload(blockRow, blockRow.media.localPath, document);
        }
        RichEditorHistory richEditorHistory2 = this.history;
        if (richEditorHistory2 != null) {
            richEditorHistory2.record();
        }
        this.delegate.onContentChanged();
    }

    private void insertPreparedRow(BlockRow blockRow) {
        int indexOf;
        int indexOf2;
        BlockRow findFocusedRow = findFocusedRow();
        int indexOf3 = findFocusedRow != null ? this.rows.indexOf(findFocusedRow) : -1;
        if (findFocusedRow != null) {
            TL_iv.PageBlock pageBlock = findFocusedRow.block;
            if ((pageBlock instanceof TL_iv.pageBlockParagraph) && findFocusedRow.media == null && RichTextCell.readPlainText(pageBlock).isEmpty()) {
                this.rows.set(indexOf3, blockRow);
                indexOf = this.rows.indexOf(blockRow);
                if (indexOf < this.rows.size() - 1 || isNonText(((BlockRow) this.rows.get(indexOf + 1)).block)) {
                    this.rows.add(indexOf + 1, new BlockRow(new TL_iv.pageBlockParagraph()));
                }
                this.adapter.update(true);
                indexOf2 = this.rows.indexOf(blockRow) + 1;
                if (indexOf2 > 0 || indexOf2 >= this.rows.size() || isNonText(((BlockRow) this.rows.get(indexOf2)).block)) {
                    return;
                }
                final BlockRow blockRow2 = (BlockRow) this.rows.get(indexOf2);
                post(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda41
                    @Override // java.lang.Runnable
                    public final void run() {
                        RichEditorListView.this.lambda$insertPreparedRow$35(blockRow2);
                    }
                });
                return;
            }
        }
        if (indexOf3 >= 0) {
            this.rows.add(indexOf3 + 1, blockRow);
        } else {
            this.rows.add(blockRow);
        }
        indexOf = this.rows.indexOf(blockRow);
        if (indexOf < this.rows.size() - 1) {
        }
        this.rows.add(indexOf + 1, new BlockRow(new TL_iv.pageBlockParagraph()));
        this.adapter.update(true);
        indexOf2 = this.rows.indexOf(blockRow) + 1;
        if (indexOf2 > 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$insertPreparedRow$35(BlockRow blockRow) {
        View findViewByItemObject = findViewByItemObject(blockRow);
        if (findViewByItemObject instanceof RichTextCell) {
            RichTextCell richTextCell = (RichTextCell) findViewByItemObject;
            richTextCell.requestEditFocus();
            richTextCell.getEditText().setSelection(0);
        }
    }

    private void startAudioUpload(final BlockRow blockRow, String str, TLRPC.Document document) {
        final MediaUploadState mediaUploadState = blockRow.media;
        RichMediaUploader richMediaUploader = (RichMediaUploader) this.uploaders.remove(mediaUploadState);
        if (richMediaUploader != null) {
            richMediaUploader.cancel();
        }
        RichMediaUploader forAudio = RichMediaUploader.forAudio(this.currentAccount, str, document, new RichMediaUploader.Listener() { // from class: org.telegram.ui.iv.RichEditorListView.12
            @Override // org.telegram.ui.iv.RichMediaUploader.Listener
            public /* synthetic */ void onPhotoUploaded(TLRPC.Photo photo) {
                RichMediaUploader.Listener.-CC.$default$onPhotoUploaded(this, photo);
            }

            @Override // org.telegram.ui.iv.RichMediaUploader.Listener
            public /* synthetic */ void onVideoUploaded(TLRPC.Document document2) {
                RichMediaUploader.Listener.-CC.$default$onVideoUploaded(this, document2);
            }

            @Override // org.telegram.ui.iv.RichMediaUploader.Listener
            public /* synthetic */ void onWidthHeightResolved(int i, int i2) {
                RichMediaUploader.Listener.-CC.$default$onWidthHeightResolved(this, i, i2);
            }

            @Override // org.telegram.ui.iv.RichMediaUploader.Listener
            public void onProgress(float f) {
                mediaUploadState.progress = f;
                RichEditorListView.this.invalidateAudioCell(blockRow);
                RichEditorListView.this.delegate.onContentChanged();
            }

            @Override // org.telegram.ui.iv.RichMediaUploader.Listener
            public void onAudioUploaded(TLRPC.Document document2) {
                MediaUploadState mediaUploadState2 = mediaUploadState;
                mediaUploadState2.document = document2;
                mediaUploadState2.audioDisplayDocument = document2;
                mediaUploadState2.state = 2;
                TL_iv.PageBlock pageBlock = blockRow.block;
                if (pageBlock instanceof TL_iv.pageBlockAudio) {
                    ((TL_iv.pageBlockAudio) pageBlock).audio_id = document2.id;
                }
                RichEditorListView.this.uploaders.remove(mediaUploadState);
                RichEditorListView.this.adapter.update(false);
                RichEditorListView.this.delegate.onContentChanged();
            }

            @Override // org.telegram.ui.iv.RichMediaUploader.Listener
            public void onError() {
                mediaUploadState.state = 3;
                RichEditorListView.this.uploaders.remove(mediaUploadState);
                int indexOf = RichEditorListView.this.rows.indexOf(blockRow);
                if (indexOf >= 0) {
                    RichEditorListView.this.rows.remove(indexOf);
                    RichEditorListView.this.adapter.update(true);
                }
                RichEditorListView.this.delegate.onContentChanged();
            }
        });
        this.uploaders.put(mediaUploadState, forAudio);
        forAudio.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cancelAudioUpload(BlockRow blockRow) {
        RichMediaUploader richMediaUploader = (RichMediaUploader) this.uploaders.remove(blockRow.media);
        if (richMediaUploader != null) {
            richMediaUploader.cancel();
        }
        int indexOf = this.rows.indexOf(blockRow);
        if (indexOf >= 0) {
            RichEditorHistory richEditorHistory = this.history;
            if (richEditorHistory != null) {
                richEditorHistory.flush();
            }
            this.rows.remove(indexOf);
            this.adapter.update(true);
            RichEditorHistory richEditorHistory2 = this.history;
            if (richEditorHistory2 != null) {
                richEditorHistory2.record();
            }
        }
        this.delegate.onContentChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void invalidateAudioCell(BlockRow blockRow) {
        View findViewByItemObject = findViewByItemObject(blockRow);
        if (findViewByItemObject instanceof RichAudioCell) {
            ((RichAudioCell) findViewByItemObject).updateButtonState(false);
            findViewByItemObject.invalidate();
        }
    }

    private static MediaUploadState newUploadingMedia(MediaController.PhotoEntry photoEntry, String str) {
        MediaUploadState mediaUploadState = new MediaUploadState();
        mediaUploadState.isVideo = photoEntry.isVideo;
        mediaUploadState.localPath = str;
        mediaUploadState.width = photoEntry.width;
        mediaUploadState.height = photoEntry.height;
        mediaUploadState.duration = photoEntry.duration;
        String str2 = photoEntry.imagePath;
        boolean z = (str2 == null || str == null || !str.equals(str2)) ? false : true;
        mediaUploadState.orientation = z ? 0 : photoEntry.orientation;
        mediaUploadState.invert = z ? 0 : photoEntry.invert;
        mediaUploadState.state = 1;
        mediaUploadState.progress = 0.0f;
        return mediaUploadState;
    }

    void attachMedia(MediaController.PhotoEntry photoEntry) {
        if (photoEntry == null) {
            return;
        }
        String str = photoEntry.imagePath;
        if (str == null) {
            str = photoEntry.path;
        }
        String str2 = str;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        RichEditorHistory richEditorHistory = this.history;
        if (richEditorHistory != null) {
            richEditorHistory.flush();
        }
        boolean hasAnimatedMediaEntities = RichMediaConverter.hasAnimatedMediaEntities(photoEntry);
        BlockRow blockRow = new BlockRow((photoEntry.isVideo || hasAnimatedMediaEntities) ? new TL_iv.pageBlockVideo() : new TL_iv.pageBlockPhoto());
        blockRow.media = newUploadingMedia(photoEntry, str2);
        insertPreparedRow(blockRow);
        if (hasAnimatedMediaEntities) {
            startMediaConvertAndUpload(blockRow, blockRow.media, photoEntry);
        } else {
            startMediaUpload(blockRow, blockRow.media, str2, photoEntry.isVideo, photoEntry.width, photoEntry.height, photoEntry.duration);
        }
        RichEditorHistory richEditorHistory2 = this.history;
        if (richEditorHistory2 != null) {
            richEditorHistory2.record();
        }
        this.delegate.onContentChanged();
    }

    void addMediaToRow(BlockRow blockRow, MediaController.PhotoEntry photoEntry) {
        if (blockRow == null || photoEntry == null || !isMedia(blockRow.block)) {
            return;
        }
        String str = photoEntry.imagePath;
        if (str == null) {
            str = photoEntry.path;
        }
        String str2 = str;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        RichEditorHistory richEditorHistory = this.history;
        if (richEditorHistory != null) {
            richEditorHistory.flush();
        }
        MediaUploadState newUploadingMedia = newUploadingMedia(photoEntry, str2);
        boolean hasAnimatedMediaEntities = RichMediaConverter.hasAnimatedMediaEntities(photoEntry);
        TL_iv.PageBlock pageblockvideo = (photoEntry.isVideo || hasAnimatedMediaEntities) ? new TL_iv.pageBlockVideo() : new TL_iv.pageBlockPhoto();
        if (isGallery(blockRow.block)) {
            galleryItems(blockRow.block).add(pageblockvideo);
            if (blockRow.medias == null) {
                blockRow.medias = new ArrayList();
            }
            blockRow.medias.add(newUploadingMedia);
        } else {
            MediaUploadState mediaUploadState = blockRow.media;
            if (mediaUploadState == null || mediaUploadState.state == 0) {
                blockRow.block = pageblockvideo;
                blockRow.media = newUploadingMedia;
            } else {
                TL_iv.pageBlockCollage pageblockcollage = new TL_iv.pageBlockCollage();
                pageblockcollage.caption = blockRow.block.caption;
                RichCaptionController.ensureCaption(pageblockcollage);
                ArrayList<TL_iv.PageBlock> arrayList = new ArrayList<>();
                pageblockcollage.items = arrayList;
                arrayList.add(blockRow.block);
                pageblockcollage.items.add(pageblockvideo);
                ArrayList arrayList2 = new ArrayList();
                blockRow.medias = arrayList2;
                arrayList2.add(blockRow.media);
                blockRow.medias.add(newUploadingMedia);
                blockRow.media = null;
                blockRow.block = pageblockcollage;
            }
        }
        this.adapter.update(false);
        refreshMediaCell(blockRow);
        if (hasAnimatedMediaEntities) {
            startMediaConvertAndUpload(blockRow, newUploadingMedia, photoEntry);
        } else {
            startMediaUpload(blockRow, newUploadingMedia, str2, photoEntry.isVideo, photoEntry.width, photoEntry.height, photoEntry.duration);
        }
        RichEditorHistory richEditorHistory2 = this.history;
        if (richEditorHistory2 != null) {
            richEditorHistory2.record();
        }
        this.delegate.onContentChanged();
    }

    void attachExternalMedia(final Uri uri) {
        if (uri == null) {
            return;
        }
        final BlockRow blockRow = this.pendingMediaRow;
        String str = null;
        this.pendingMediaRow = null;
        Context context = getContext();
        if (context == null) {
            return;
        }
        try {
            str = context.getContentResolver().getType(uri);
        } catch (Exception e) {
            FileLog.e(e);
        }
        final String str2 = str;
        final boolean startsWith = str2 != null ? str2.startsWith(MediaStreamTrack.VIDEO_TRACK_KIND) : uri.toString().contains(MediaStreamTrack.VIDEO_TRACK_KIND);
        final int i = this.lastExternalImageId;
        this.lastExternalImageId = i - 1;
        Utilities.globalQueue.postRunnable(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda24
            @Override // java.lang.Runnable
            public final void run() {
                RichEditorListView.this.lambda$attachExternalMedia$37(uri, startsWith, str2, i, blockRow);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0093 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void lambda$attachExternalMedia$37(Uri uri, final boolean z, String str, final int i, final BlockRow blockRow) {
        String str2;
        MediaMetadataRetriever mediaMetadataRetriever;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        final int i8;
        final int i9;
        int i10;
        Pair<Integer, Integer> imageOrientation;
        final int intValue;
        MediaMetadataRetriever mediaMetadataRetriever2 = null;
        try {
            str2 = AndroidUtilities.getPath(uri);
        } catch (Exception e) {
            FileLog.e(e);
            str2 = null;
        }
        if (str2 == null || !new File(str2).exists()) {
            str2 = copyUriToCache(uri, z, str, i);
        }
        final String str3 = str2;
        if (str3 == null || !new File(str3).exists()) {
            return;
        }
        if (z) {
            try {
                try {
                    mediaMetadataRetriever = new MediaMetadataRetriever();
                    try {
                        try {
                            mediaMetadataRetriever.setDataSource(str3);
                            String extractMetadata = mediaMetadataRetriever.extractMetadata(18);
                            String extractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                            String extractMetadata3 = mediaMetadataRetriever.extractMetadata(9);
                            i3 = extractMetadata != null ? Integer.parseInt(extractMetadata) : 0;
                            if (extractMetadata2 != null) {
                                try {
                                    i4 = Integer.parseInt(extractMetadata2);
                                } catch (Exception e2) {
                                    e = e2;
                                    i4 = 0;
                                    i2 = i4;
                                    mediaMetadataRetriever2 = mediaMetadataRetriever;
                                    FileLog.e(e);
                                    if (mediaMetadataRetriever2 != null) {
                                    }
                                    i4 = i2;
                                    i6 = 0;
                                    if (z) {
                                    }
                                    intValue = 0;
                                    final int i11 = i6;
                                    final int i12 = i10;
                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda39
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            RichEditorListView.this.lambda$attachExternalMedia$36(i, str3, z, i11, i12, i8, i9, intValue, blockRow);
                                        }
                                    });
                                }
                            } else {
                                i4 = 0;
                            }
                            if (extractMetadata3 != null) {
                                try {
                                    i5 = (int) Math.ceil(Long.parseLong(extractMetadata3) / 1000.0d);
                                } catch (Exception e3) {
                                    e = e3;
                                    i2 = i4;
                                    mediaMetadataRetriever2 = mediaMetadataRetriever;
                                    FileLog.e(e);
                                    if (mediaMetadataRetriever2 != null) {
                                        try {
                                            mediaMetadataRetriever2.release();
                                        } catch (Exception unused) {
                                            i4 = i2;
                                            i5 = 0;
                                        }
                                    }
                                    i4 = i2;
                                    i6 = 0;
                                    if (z) {
                                    }
                                    intValue = 0;
                                    final int i112 = i6;
                                    final int i122 = i10;
                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda39
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            RichEditorListView.this.lambda$attachExternalMedia$36(i, str3, z, i112, i122, i8, i9, intValue, blockRow);
                                        }
                                    });
                                }
                            } else {
                                i5 = 0;
                            }
                            try {
                                mediaMetadataRetriever.release();
                            } catch (Exception unused2) {
                            }
                            i6 = i5;
                        } catch (Throwable th) {
                            th = th;
                            if (mediaMetadataRetriever != null) {
                                try {
                                    mediaMetadataRetriever.release();
                                } catch (Exception unused3) {
                                }
                            }
                            throw th;
                        }
                    } catch (Exception e4) {
                        e = e4;
                        i4 = 0;
                        i3 = 0;
                    }
                } catch (Exception e5) {
                    e = e5;
                    i2 = 0;
                    i3 = 0;
                }
                if (z) {
                    try {
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        BitmapFactory.decodeFile(str3, options);
                        i3 = options.outWidth;
                        i4 = options.outHeight;
                    } catch (Exception e6) {
                        FileLog.e(e6);
                    }
                    try {
                        imageOrientation = AndroidUtilities.getImageOrientation(str3);
                        i7 = ((Integer) imageOrientation.first).intValue();
                    } catch (Exception e7) {
                        e = e7;
                        i7 = 0;
                    }
                    try {
                        intValue = ((Integer) imageOrientation.second).intValue();
                        i8 = i4;
                        i9 = i7;
                        i10 = i3;
                    } catch (Exception e8) {
                        e = e8;
                        FileLog.e(e);
                        i8 = i4;
                        i9 = i7;
                        i10 = i3;
                        intValue = 0;
                        final int i1122 = i6;
                        final int i1222 = i10;
                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda39
                            @Override // java.lang.Runnable
                            public final void run() {
                                RichEditorListView.this.lambda$attachExternalMedia$36(i, str3, z, i1122, i1222, i8, i9, intValue, blockRow);
                            }
                        });
                    }
                    final int i11222 = i6;
                    final int i12222 = i10;
                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda39
                        @Override // java.lang.Runnable
                        public final void run() {
                            RichEditorListView.this.lambda$attachExternalMedia$36(i, str3, z, i11222, i12222, i8, i9, intValue, blockRow);
                        }
                    });
                }
                i8 = i4;
                i10 = i3;
                i9 = 0;
                intValue = 0;
                final int i112222 = i6;
                final int i122222 = i10;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda39
                    @Override // java.lang.Runnable
                    public final void run() {
                        RichEditorListView.this.lambda$attachExternalMedia$36(i, str3, z, i112222, i122222, i8, i9, intValue, blockRow);
                    }
                });
            } catch (Throwable th2) {
                th = th2;
                mediaMetadataRetriever = mediaMetadataRetriever2;
            }
        } else {
            i4 = 0;
            i3 = 0;
        }
        i6 = 0;
        if (z) {
        }
        intValue = 0;
        final int i1122222 = i6;
        final int i1222222 = i10;
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda39
            @Override // java.lang.Runnable
            public final void run() {
                RichEditorListView.this.lambda$attachExternalMedia$36(i, str3, z, i1122222, i1222222, i8, i9, intValue, blockRow);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$attachExternalMedia$36(int i, String str, boolean z, int i2, int i3, int i4, int i5, int i6, BlockRow blockRow) {
        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, i, 0L, str, z ? i2 : 0, z, i3, i4, 0L);
        photoEntry.setOrientation(i5, i6);
        if (blockRow != null && isMedia(blockRow.block)) {
            addMediaToRow(blockRow, photoEntry);
        } else {
            attachMedia(photoEntry);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0095 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String copyUriToCache(Uri uri, boolean z, String str, int i) {
        FileOutputStream fileOutputStream;
        InputStream inputStream;
        String extensionFromMimeType;
        Context context = getContext();
        InputStream inputStream2 = null;
        if (context == null) {
            return null;
        }
        try {
            inputStream = context.getContentResolver().openInputStream(uri);
            if (inputStream == null) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Exception unused) {
                    }
                }
                return null;
            }
            if (str != null) {
                try {
                    extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(str);
                } catch (Exception e) {
                    e = e;
                    fileOutputStream = null;
                    try {
                        FileLog.e(e);
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Exception unused2) {
                            }
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (Exception unused3) {
                            }
                        }
                        return null;
                    } catch (Throwable th) {
                        th = th;
                        inputStream2 = inputStream;
                        inputStream = inputStream2;
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Exception unused4) {
                            }
                        }
                        if (fileOutputStream != null) {
                            throw th;
                        }
                        try {
                            fileOutputStream.close();
                            throw th;
                        } catch (Exception unused5) {
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = null;
                    inputStream2 = inputStream;
                    inputStream = inputStream2;
                    if (inputStream != null) {
                    }
                    if (fileOutputStream != null) {
                    }
                }
            } else {
                extensionFromMimeType = null;
            }
            if (TextUtils.isEmpty(extensionFromMimeType)) {
                extensionFromMimeType = z ? "mp4" : "jpg";
            }
            File file = new File(FileLoader.getDirectory(4), "rich_external_" + (-i) + "_" + SharedConfig.getLastLocalId() + "." + extensionFromMimeType);
            fileOutputStream = new FileOutputStream(file);
            try {
                AndroidUtilities.copyFile(inputStream, fileOutputStream);
                String absolutePath = file.getAbsolutePath();
                try {
                    inputStream.close();
                } catch (Exception unused6) {
                }
                try {
                    fileOutputStream.close();
                } catch (Exception unused7) {
                }
                return absolutePath;
            } catch (Exception e2) {
                e = e2;
                FileLog.e(e);
                if (inputStream != null) {
                }
                if (fileOutputStream != null) {
                }
                return null;
            } catch (Throwable th3) {
                th = th3;
                if (inputStream != null) {
                }
                if (fileOutputStream != null) {
                }
            }
        } catch (Exception e3) {
            e = e3;
            inputStream = null;
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
            inputStream = inputStream2;
            if (inputStream != null) {
            }
            if (fileOutputStream != null) {
            }
        }
    }

    private void startMediaConvertAndUpload(final BlockRow blockRow, final MediaUploadState mediaUploadState, MediaController.PhotoEntry photoEntry) {
        RichMediaUploader richMediaUploader = (RichMediaUploader) this.uploaders.remove(mediaUploadState);
        if (richMediaUploader != null) {
            richMediaUploader.cancel();
        }
        RichMediaConverter richMediaConverter = (RichMediaConverter) this.converters.remove(mediaUploadState);
        if (richMediaConverter != null) {
            richMediaConverter.cancel();
        }
        mediaUploadState.state = 1;
        mediaUploadState.progress = 0.0f;
        RichMediaConverter richMediaConverter2 = new RichMediaConverter(this.currentAccount, photoEntry, new RichMediaConverter.Listener() { // from class: org.telegram.ui.iv.RichEditorListView.13
            @Override // org.telegram.ui.iv.RichMediaConverter.Listener
            public void onProgress(float f) {
                mediaUploadState.progress = f;
                RichEditorListView.this.invalidateMediaCell(blockRow);
            }

            @Override // org.telegram.ui.iv.RichMediaConverter.Listener
            public void onDone(String str, int i, int i2, int i3) {
                RichEditorListView.this.converters.remove(mediaUploadState);
                MediaUploadState mediaUploadState2 = mediaUploadState;
                mediaUploadState2.isVideo = true;
                mediaUploadState2.localPath = str;
                if (i > 0) {
                    mediaUploadState2.width = i;
                }
                if (i2 > 0) {
                    mediaUploadState2.height = i2;
                }
                mediaUploadState2.duration = i3;
                mediaUploadState2.orientation = 0;
                mediaUploadState2.invert = 0;
                mediaUploadState2.progress = 0.0f;
                RichEditorListView.this.refreshMediaCell(blockRow);
                RichEditorListView richEditorListView = RichEditorListView.this;
                BlockRow blockRow2 = blockRow;
                MediaUploadState mediaUploadState3 = mediaUploadState;
                richEditorListView.startMediaUpload(blockRow2, mediaUploadState3, str, true, mediaUploadState3.width, mediaUploadState3.height, i3);
            }

            @Override // org.telegram.ui.iv.RichMediaConverter.Listener
            public void onError() {
                RichEditorListView.this.converters.remove(mediaUploadState);
                MediaUploadState mediaUploadState2 = mediaUploadState;
                mediaUploadState2.state = 3;
                RichEditorListView.this.removeMediaFromRow(blockRow, mediaUploadState2);
                RichEditorListView.this.delegate.onContentChanged();
            }
        });
        this.converters.put(mediaUploadState, richMediaConverter2);
        richMediaConverter2.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startMediaUpload(final BlockRow blockRow, final MediaUploadState mediaUploadState, String str, boolean z, int i, int i2, int i3) {
        RichMediaUploader richMediaUploader = (RichMediaUploader) this.uploaders.remove(mediaUploadState);
        if (richMediaUploader != null) {
            richMediaUploader.cancel();
        }
        RichMediaUploader richMediaUploader2 = new RichMediaUploader(this.currentAccount, str, z, i, i2, i3, new RichMediaUploader.Listener() { // from class: org.telegram.ui.iv.RichEditorListView.14
            @Override // org.telegram.ui.iv.RichMediaUploader.Listener
            public /* synthetic */ void onAudioUploaded(TLRPC.Document document) {
                RichMediaUploader.Listener.-CC.$default$onAudioUploaded(this, document);
            }

            @Override // org.telegram.ui.iv.RichMediaUploader.Listener
            public void onWidthHeightResolved(int i4, int i5) {
                if (i4 > 0 && i5 > 0) {
                    MediaUploadState mediaUploadState2 = mediaUploadState;
                    mediaUploadState2.width = i4;
                    mediaUploadState2.height = i5;
                }
                RichEditorListView.this.invalidateMediaCell(blockRow);
            }

            @Override // org.telegram.ui.iv.RichMediaUploader.Listener
            public void onProgress(float f) {
                mediaUploadState.progress = f;
                RichEditorListView.this.invalidateMediaCell(blockRow);
                RichEditorListView.this.delegate.onContentChanged();
            }

            @Override // org.telegram.ui.iv.RichMediaUploader.Listener
            public void onPhotoUploaded(TLRPC.Photo photo) {
                int i4;
                int i5;
                MediaUploadState mediaUploadState2 = mediaUploadState;
                mediaUploadState2.photo = photo;
                mediaUploadState2.state = 2;
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize());
                if (closestPhotoSizeWithSize != null && (i4 = closestPhotoSizeWithSize.w) > 0 && (i5 = closestPhotoSizeWithSize.h) > 0) {
                    MediaUploadState mediaUploadState3 = mediaUploadState;
                    mediaUploadState3.width = i4;
                    mediaUploadState3.height = i5;
                }
                TL_iv.PageBlock itemBlockFor = RichEditorListView.itemBlockFor(blockRow, mediaUploadState);
                if (itemBlockFor instanceof TL_iv.pageBlockPhoto) {
                    ((TL_iv.pageBlockPhoto) itemBlockFor).photo_id = photo.id;
                }
                RichEditorListView.this.uploaders.remove(mediaUploadState);
                RichEditorListView.this.refreshMediaCell(blockRow);
                RichEditorListView.this.delegate.onContentChanged();
            }

            @Override // org.telegram.ui.iv.RichMediaUploader.Listener
            public void onVideoUploaded(TLRPC.Document document) {
                MediaUploadState mediaUploadState2 = mediaUploadState;
                mediaUploadState2.document = document;
                mediaUploadState2.state = 2;
                TL_iv.PageBlock itemBlockFor = RichEditorListView.itemBlockFor(blockRow, mediaUploadState2);
                if (itemBlockFor instanceof TL_iv.pageBlockVideo) {
                    ((TL_iv.pageBlockVideo) itemBlockFor).video_id = document.id;
                }
                RichEditorListView.this.uploaders.remove(mediaUploadState);
                RichEditorListView.this.refreshMediaCell(blockRow);
                RichEditorListView.this.delegate.onContentChanged();
            }

            @Override // org.telegram.ui.iv.RichMediaUploader.Listener
            public void onError() {
                mediaUploadState.state = 3;
                RichEditorListView.this.uploaders.remove(mediaUploadState);
                RichEditorListView.this.removeMediaFromRow(blockRow, mediaUploadState);
                RichEditorListView.this.delegate.onContentChanged();
            }
        });
        this.uploaders.put(mediaUploadState, richMediaUploader2);
        richMediaUploader2.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cancelMediaUpload(BlockRow blockRow, MediaUploadState mediaUploadState) {
        if (mediaUploadState == null) {
            cancelMediaUpload(blockRow);
            return;
        }
        RichMediaUploader richMediaUploader = (RichMediaUploader) this.uploaders.remove(mediaUploadState);
        if (richMediaUploader != null) {
            richMediaUploader.cancel();
        }
        RichMediaConverter richMediaConverter = (RichMediaConverter) this.converters.remove(mediaUploadState);
        if (richMediaConverter != null) {
            richMediaConverter.cancel();
        }
        RichEditorHistory richEditorHistory = this.history;
        if (richEditorHistory != null) {
            richEditorHistory.flush();
        }
        removeMediaFromRow(blockRow, mediaUploadState);
        RichEditorHistory richEditorHistory2 = this.history;
        if (richEditorHistory2 != null) {
            richEditorHistory2.record();
        }
        this.delegate.onContentChanged();
    }

    private void cancelMediaUpload(BlockRow blockRow) {
        for (MediaUploadState mediaUploadState : mediasOf(blockRow)) {
            RichMediaUploader richMediaUploader = (RichMediaUploader) this.uploaders.remove(mediaUploadState);
            if (richMediaUploader != null) {
                richMediaUploader.cancel();
            }
            RichMediaConverter richMediaConverter = (RichMediaConverter) this.converters.remove(mediaUploadState);
            if (richMediaConverter != null) {
                richMediaConverter.cancel();
            }
        }
        int indexOf = this.rows.indexOf(blockRow);
        if (indexOf >= 0) {
            RichEditorHistory richEditorHistory = this.history;
            if (richEditorHistory != null) {
                richEditorHistory.flush();
            }
            this.rows.remove(indexOf);
            this.adapter.update(true);
            RichEditorHistory richEditorHistory2 = this.history;
            if (richEditorHistory2 != null) {
                richEditorHistory2.record();
            }
        }
        this.delegate.onContentChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeMediaFromRow(BlockRow blockRow, MediaUploadState mediaUploadState) {
        if (blockRow == null) {
            return;
        }
        if (isGallery(blockRow.block)) {
            ArrayList galleryItems = galleryItems(blockRow.block);
            ArrayList arrayList = blockRow.medias;
            int indexOf = arrayList != null ? arrayList.indexOf(mediaUploadState) : -1;
            if (indexOf >= 0) {
                blockRow.medias.remove(indexOf);
                if (galleryItems != null && indexOf < galleryItems.size()) {
                    galleryItems.remove(indexOf);
                }
            }
            if (blockRow.medias.isEmpty()) {
                removeRow(blockRow);
                return;
            }
            if (blockRow.medias.size() == 1) {
                TL_iv.PageCaption pageCaption = blockRow.block.caption;
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) galleryItems.get(0);
                blockRow.block = pageBlock;
                pageBlock.caption = pageCaption;
                blockRow.media = (MediaUploadState) blockRow.medias.get(0);
                blockRow.medias = null;
                this.adapter.update(true);
                refreshMediaCell(blockRow);
                return;
            }
            this.adapter.update(true);
            refreshMediaCell(blockRow);
            return;
        }
        removeRow(blockRow);
    }

    private void removeRow(BlockRow blockRow) {
        int indexOf = this.rows.indexOf(blockRow);
        if (indexOf >= 0) {
            this.rows.remove(indexOf);
            this.adapter.update(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void switchGalleryMode(BlockRow blockRow) {
        TL_iv.pageBlockSlideshow pageblockslideshow;
        if (blockRow == null || !isGallery(blockRow.block)) {
            return;
        }
        RichEditorHistory richEditorHistory = this.history;
        if (richEditorHistory != null) {
            richEditorHistory.flush();
        }
        ArrayList<TL_iv.PageBlock> galleryItems = galleryItems(blockRow.block);
        TL_iv.PageBlock pageBlock = blockRow.block;
        TL_iv.PageCaption pageCaption = pageBlock.caption;
        if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
            TL_iv.pageBlockCollage pageblockcollage = new TL_iv.pageBlockCollage();
            if (galleryItems == null) {
                galleryItems = new ArrayList<>();
            }
            pageblockcollage.items = galleryItems;
            pageblockcollage.caption = pageCaption;
            pageblockslideshow = pageblockcollage;
        } else {
            TL_iv.pageBlockSlideshow pageblockslideshow2 = new TL_iv.pageBlockSlideshow();
            if (galleryItems == null) {
                galleryItems = new ArrayList<>();
            }
            pageblockslideshow2.items = galleryItems;
            pageblockslideshow2.caption = pageCaption;
            pageblockslideshow = pageblockslideshow2;
        }
        blockRow.block = pageblockslideshow;
        RichEditorHistory richEditorHistory2 = this.history;
        if (richEditorHistory2 != null) {
            richEditorHistory2.record();
        }
        View findViewByItemObject = findViewByItemObject(blockRow);
        if (findViewByItemObject instanceof RichMediaCell) {
            ((RichMediaCell) findViewByItemObject).onModeChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void invalidateMediaCell(BlockRow blockRow) {
        View findViewByItemObject = findViewByItemObject(blockRow);
        if (findViewByItemObject instanceof RichMediaCell) {
            findViewByItemObject.requestLayout();
            findViewByItemObject.invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void refreshMediaCell(BlockRow blockRow) {
        View findViewByItemObject = findViewByItemObject(blockRow);
        if (findViewByItemObject instanceof RichMediaCell) {
            ((RichMediaCell) findViewByItemObject).refresh();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onChecklistToggle(BlockRow blockRow, boolean z) {
        if (blockRow == null) {
            return;
        }
        blockRow.checked = z;
        RichEditorHistory richEditorHistory = this.history;
        if (richEditorHistory != null) {
            richEditorHistory.flush();
            this.history.record();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onCaptionEnter(BlockRow blockRow) {
        int indexOf = this.rows.indexOf(blockRow);
        if (indexOf < 0) {
            return;
        }
        RichEditorHistory richEditorHistory = this.history;
        if (richEditorHistory != null) {
            richEditorHistory.flush();
        }
        final BlockRow blockRow2 = new BlockRow(new TL_iv.pageBlockParagraph());
        this.rows.add(indexOf + 1, blockRow2);
        renumberAllRuns();
        this.adapter.update(false);
        RichEditorHistory richEditorHistory2 = this.history;
        if (richEditorHistory2 != null) {
            richEditorHistory2.record();
        }
        post(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda55
            @Override // java.lang.Runnable
            public final void run() {
                RichEditorListView.this.lambda$onCaptionEnter$39(blockRow2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCaptionEnter$39(BlockRow blockRow) {
        View findViewByItemObject = findViewByItemObject(blockRow);
        if (findViewByItemObject instanceof RichTextCell) {
            RichTextCell richTextCell = (RichTextCell) findViewByItemObject;
            richTextCell.requestEditFocus();
            richTextCell.getEditText().setSelection(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onCellEnter(final BlockRow blockRow) {
        CharSequence readStyledText;
        int length;
        int indexOf = this.rows.indexOf(blockRow);
        if (indexOf < 0) {
            return;
        }
        RichEditorHistory richEditorHistory = this.history;
        if (richEditorHistory != null) {
            richEditorHistory.flush();
        }
        View findViewByItemObject = findViewByItemObject(blockRow);
        if (findViewByItemObject instanceof RichTextCell) {
            RichEditText editText = ((RichTextCell) findViewByItemObject).getEditText();
            readStyledText = editText.getText();
            length = editText.getSelectionEnd();
        } else {
            readStyledText = RichTextCell.readStyledText(blockRow.block);
            length = readStyledText.length();
        }
        if (length < 0 || length > readStyledText.length()) {
            length = readStyledText.length();
        }
        if (readStyledText.length() == 0 && blockRow.level > 0) {
            cascadeOutdent(indexOf);
            renumberAllRuns();
            this.adapter.update(false);
            RichEditorHistory richEditorHistory2 = this.history;
            if (richEditorHistory2 != null) {
                richEditorHistory2.record();
            }
            post(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda59
                @Override // java.lang.Runnable
                public final void run() {
                    RichEditorListView.this.lambda$onCellEnter$40(blockRow);
                }
            });
            return;
        }
        CharSequence subSequence = readStyledText.subSequence(0, length);
        CharSequence subSequence2 = readStyledText.subSequence(length, readStyledText.length());
        RichTextCell.applyStyledTextToBlock(blockRow.block, subSequence);
        TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
        RichTextCell.applyStyledTextToBlock(pageblockparagraph, subSequence2);
        int i = blockRow.num;
        if (i > 0) {
            i++;
        }
        final BlockRow blockRow2 = new BlockRow(pageblockparagraph, blockRow.level, i);
        blockRow2.checkbox = blockRow.checkbox;
        this.rows.add(indexOf + 1, blockRow2);
        renumberAllRuns();
        this.adapter.update(false);
        RichEditorHistory richEditorHistory3 = this.history;
        if (richEditorHistory3 != null) {
            richEditorHistory3.record();
        }
        post(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda60
            @Override // java.lang.Runnable
            public final void run() {
                RichEditorListView.this.lambda$onCellEnter$41(blockRow2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCellEnter$41(BlockRow blockRow) {
        View findViewByItemObject = findViewByItemObject(blockRow);
        if (findViewByItemObject instanceof RichTextCell) {
            RichTextCell richTextCell = (RichTextCell) findViewByItemObject;
            richTextCell.requestEditFocus();
            richTextCell.getEditText().setSelection(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean onCellBackspaceAtStart(final BlockRow blockRow, boolean z) {
        int i;
        int indexOf = this.rows.indexOf(blockRow);
        if (indexOf < 0) {
            return false;
        }
        if (demotesToParagraph(blockRow.block)) {
            turnInto(blockRow, new TL_iv.pageBlockParagraph(), 0, 0, false, false);
            return true;
        }
        if (blockRow.level > 0) {
            RichEditorHistory richEditorHistory = this.history;
            if (richEditorHistory != null) {
                richEditorHistory.flush();
            }
            cascadeOutdent(indexOf);
            renumberAllRuns();
            this.adapter.update(false);
            RichEditorHistory richEditorHistory2 = this.history;
            if (richEditorHistory2 != null) {
                richEditorHistory2.record();
            }
            post(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda61
                @Override // java.lang.Runnable
                public final void run() {
                    RichEditorListView.this.lambda$onCellBackspaceAtStart$42(blockRow);
                }
            });
            return true;
        }
        if (indexOf <= 0) {
            return false;
        }
        int i2 = indexOf - 1;
        final BlockRow blockRow2 = (BlockRow) this.rows.get(i2);
        if (isDetailsHeader(blockRow2) || blockRow2.detailsEnd) {
            if (z && (!isDetailsHeader(blockRow2) || ((i = indexOf + 1) < this.rows.size() && !((BlockRow) this.rows.get(i)).detailsEnd))) {
                RichEditorHistory richEditorHistory3 = this.history;
                if (richEditorHistory3 != null) {
                    richEditorHistory3.flush();
                }
                this.rows.remove(indexOf);
                renumberAllRuns();
                this.adapter.update(false);
                RichEditorHistory richEditorHistory4 = this.history;
                if (richEditorHistory4 != null) {
                    richEditorHistory4.record();
                }
                post(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda64
                    @Override // java.lang.Runnable
                    public final void run() {
                        RichEditorListView.this.lambda$onCellBackspaceAtStart$43(blockRow2);
                    }
                });
            }
            return true;
        }
        if (isNonText(blockRow2.block)) {
            RichEditorHistory richEditorHistory5 = this.history;
            if (richEditorHistory5 != null) {
                richEditorHistory5.flush();
            }
            this.rows.remove(i2);
            renumberAllRuns();
            this.adapter.update(false);
            RichEditorHistory richEditorHistory6 = this.history;
            if (richEditorHistory6 != null) {
                richEditorHistory6.record();
            }
            post(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda62
                @Override // java.lang.Runnable
                public final void run() {
                    RichEditorListView.this.lambda$onCellBackspaceAtStart$44(blockRow);
                }
            });
            return true;
        }
        RichEditorHistory richEditorHistory7 = this.history;
        if (richEditorHistory7 != null) {
            richEditorHistory7.flush();
        }
        String readPlainText = RichTextCell.readPlainText(blockRow2.block);
        String readPlainText2 = RichTextCell.readPlainText(blockRow.block);
        RichTextCell.applyTextToBlock(blockRow2.block, readPlainText + readPlainText2);
        this.rows.remove(indexOf);
        renumberAllRuns();
        this.adapter.update(false);
        RichEditorHistory richEditorHistory8 = this.history;
        if (richEditorHistory8 != null) {
            richEditorHistory8.record();
        }
        final int length = readPlainText.length();
        post(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda63
            @Override // java.lang.Runnable
            public final void run() {
                RichEditorListView.this.lambda$onCellBackspaceAtStart$45(blockRow2, length);
            }
        });
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCellBackspaceAtStart$45(BlockRow blockRow, int i) {
        View findViewByItemObject = findViewByItemObject(blockRow);
        if (findViewByItemObject instanceof RichTextCell) {
            RichTextCell richTextCell = (RichTextCell) findViewByItemObject;
            richTextCell.requestEditFocus();
            richTextCell.getEditText().setSelection(Math.max(0, Math.min(i, richTextCell.getEditText().length())));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onLanguageClick(final BlockRow blockRow, View view) {
        Set<String> languages;
        if (blockRow == null || !(blockRow.block instanceof TL_iv.pageBlockPreformatted) || (languages = CodeHighlighting.getLanguages()) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(languages);
        Collections.sort(arrayList);
        TL_iv.pageBlockPreformatted pageblockpreformatted = (TL_iv.pageBlockPreformatted) blockRow.block;
        ItemOptions makeMenu = this.delegate.makeMenu(view);
        makeMenu.setScrimViewBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(3.0f), Theme.getColor(Theme.key_windowBackgroundWhite, this.resourcesProvider)));
        makeMenu.setMaxHeight(AndroidUtilities.dp(350.0f));
        makeMenu.addChecked(TextUtils.isEmpty(pageblockpreformatted.language), LocaleController.getString(R.string.ArticleNone), new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda57
            @Override // java.lang.Runnable
            public final void run() {
                RichEditorListView.this.lambda$onLanguageClick$46(blockRow);
            }
        });
        if (!TextUtils.isEmpty(pageblockpreformatted.language)) {
            makeMenu.addChecked(true, MessageObject.TextLayoutBlock.capitalizeLanguage(pageblockpreformatted.language), null);
        }
        makeMenu.addGap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            final String str = (String) it.next();
            makeMenu.addChecked(TextUtils.equals(str, pageblockpreformatted.language), MessageObject.TextLayoutBlock.capitalizeLanguage(str), new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda58
                @Override // java.lang.Runnable
                public final void run() {
                    RichEditorListView.this.lambda$onLanguageClick$47(blockRow, str);
                }
            });
        }
        makeMenu.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onLanguageClick$46(BlockRow blockRow) {
        lambda$onLanguageClick$47(blockRow, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: updateLanguageOf, reason: merged with bridge method [inline-methods] */
    public void lambda$onLanguageClick$47(BlockRow blockRow, String str) {
        if (blockRow != null) {
            TL_iv.PageBlock pageBlock = blockRow.block;
            if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
                TL_iv.pageBlockPreformatted pageblockpreformatted = (TL_iv.pageBlockPreformatted) pageBlock;
                if (TextUtils.equals(pageblockpreformatted.language, str)) {
                    return;
                }
                RichEditorHistory richEditorHistory = this.history;
                if (richEditorHistory != null) {
                    richEditorHistory.flush();
                }
                pageblockpreformatted.language = str;
                RichTextCell cellAt = cellAt(this.rows.indexOf(blockRow));
                if (cellAt != null) {
                    cellAt.updateLanguage();
                }
                RichEditorHistory richEditorHistory2 = this.history;
                if (richEditorHistory2 != null) {
                    richEditorHistory2.record();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: focusRowAtEnd, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void lambda$onTapBelowContent$13(BlockRow blockRow) {
        View findViewByItemObject = findViewByItemObject(blockRow);
        if (findViewByItemObject instanceof RichTextCell) {
            RichTextCell richTextCell = (RichTextCell) findViewByItemObject;
            richTextCell.requestEditFocus();
            RichEditText editText = richTextCell.getEditText();
            editText.setSelection(editText.length());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: focusRowAtStart, reason: merged with bridge method [inline-methods] */
    public void lambda$onTapAboveContent$11(BlockRow blockRow) {
        View findViewByItemObject = findViewByItemObject(blockRow);
        if (findViewByItemObject instanceof RichTextCell) {
            RichTextCell richTextCell = (RichTextCell) findViewByItemObject;
            richTextCell.requestEditFocus();
            richTextCell.getEditText().setSelection(0);
        }
    }

    boolean onCellIndent(BlockRow blockRow, boolean z) {
        int indexOf = this.rows.indexOf(blockRow);
        if (indexOf < 0) {
            return false;
        }
        int captureCaret = captureCaret(blockRow);
        RichEditorHistory richEditorHistory = this.history;
        if (richEditorHistory != null) {
            richEditorHistory.flush();
        }
        if (!indentRow(indexOf, z, false)) {
            return false;
        }
        renumberAllRuns();
        this.adapter.update(false);
        RichEditorHistory richEditorHistory2 = this.history;
        if (richEditorHistory2 != null) {
            richEditorHistory2.record();
        }
        restoreCaret(blockRow, captureCaret);
        return true;
    }

    private BlockRow turnIntoTarget() {
        TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper;
        int startCell;
        BlockRow findFocusedRow = findFocusedRow();
        return (findFocusedRow == null && (articleTextSelectionHelper = this.textSelectionHelper) != null && articleTextSelectionHelper.isInSelectionMode() && (startCell = this.textSelectionHelper.getStartCell()) == this.textSelectionHelper.getEndCell()) ? rowForCell(startCell) : findFocusedRow;
    }

    void turnInto(BlockRow blockRow, TL_iv.PageBlock pageBlock, int i, int i2, boolean z, boolean z2) {
        if (blockRow == null) {
            blockRow = turnIntoTarget();
        }
        BlockRow blockRow2 = blockRow;
        if (blockRow2 == null || pageBlock == null || this.rows.indexOf(blockRow2) < 0 || isDetailsHeader(blockRow2) || blockRow2.detailsEnd) {
            return;
        }
        TL_iv.PageBlock pageBlock2 = blockRow2.block;
        if (pageBlock != pageBlock2 && isFormattable(pageBlock2) && isFormattable(pageBlock)) {
            RichTextCell cellAt = cellAt(this.rows.indexOf(blockRow2));
            RichTextCell.applyStyledTextToBlock(pageBlock, cellAt != null ? cellAt.getEditText().getText() : RichTextCell.readStyledText(blockRow2.block));
        }
        transformRow(blockRow2, pageBlock, i, i2, z, z2);
    }

    void turnIntoList(BlockRow blockRow, int i) {
        if (blockRow == null) {
            blockRow = turnIntoTarget();
        }
        BlockRow blockRow2 = blockRow;
        if (blockRow2 == null) {
            return;
        }
        if (i == 0) {
            turnInto(blockRow2, blockRow2.block, 0, 0, false, false);
            return;
        }
        int max = Math.max(1, blockRow2.level);
        int max2 = i == 2 ? Math.max(1, blockRow2.num) : 0;
        boolean z = i == 3;
        TL_iv.PageBlock pageBlock = blockRow2.block;
        if (!(pageBlock instanceof TL_iv.pageBlockParagraph)) {
            pageBlock = new TL_iv.pageBlockParagraph();
        }
        turnInto(blockRow2, pageBlock, max, max2, z, z && blockRow2.checked);
    }

    static TL_iv.pageBlockBlockquote newBlockquote() {
        TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
        pageblockblockquote.caption = new TL_iv.textEmpty();
        return pageblockblockquote;
    }

    static TL_iv.pageBlockPullquote newPullquote() {
        TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
        pageblockpullquote.caption = new TL_iv.textEmpty();
        return pageblockpullquote;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void transformRow(final BlockRow blockRow, TL_iv.PageBlock pageBlock, int i, int i2, boolean z, boolean z2) {
        int indexOf = this.rows.indexOf(blockRow);
        if (indexOf < 0) {
            return;
        }
        RichEditorHistory richEditorHistory = this.history;
        if (richEditorHistory != null) {
            richEditorHistory.flush();
        }
        blockRow.block = pageBlock;
        blockRow.level = i;
        blockRow.num = i2;
        blockRow.checkbox = z;
        blockRow.checked = z2;
        renumberAllRuns();
        if (pageBlock instanceof TL_iv.pageBlockTable) {
            int i3 = indexOf + 1;
            if (i3 >= this.rows.size() || isNonText(((BlockRow) this.rows.get(i3)).block)) {
                this.rows.add(i3, new BlockRow(new TL_iv.pageBlockParagraph()));
            }
        } else if (isNonText(pageBlock)) {
            if (isMedia(pageBlock) && blockRow.media == null) {
                blockRow.media = new MediaUploadState();
            }
            int i4 = indexOf + 1;
            if (i4 < this.rows.size() && !isNonText(((BlockRow) this.rows.get(i4)).block)) {
                blockRow = (BlockRow) this.rows.get(i4);
            } else {
                blockRow = new BlockRow(new TL_iv.pageBlockParagraph());
                this.rows.add(i4, blockRow);
            }
        }
        this.adapter.update(false);
        RichEditorHistory richEditorHistory2 = this.history;
        if (richEditorHistory2 != null) {
            richEditorHistory2.record();
        }
        post(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda42
            @Override // java.lang.Runnable
            public final void run() {
                RichEditorListView.this.lambda$transformRow$48(blockRow);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$transformRow$48(BlockRow blockRow) {
        View findViewByItemObject = findViewByItemObject(blockRow);
        if (findViewByItemObject instanceof RichTextCell) {
            RichTextCell richTextCell = (RichTextCell) findViewByItemObject;
            richTextCell.requestEditFocus();
            richTextCell.getEditText().setSelection(richTextCell.getEditText().length());
            return;
        }
        if (findViewByItemObject instanceof RichTableCell) {
            RichTableCell richTableCell = (RichTableCell) findViewByItemObject;
            if (richTableCell.getGrid().getChildCount() > 0) {
                View childAt = richTableCell.getGrid().getChildAt(0);
                if (childAt instanceof RichTableCellHost) {
                    ((RichTableCellHost) childAt).editText.requestEditFocus();
                }
            }
        }
    }

    private boolean rangeIndent(int i, int i2, boolean z) {
        boolean z2;
        if (i < 0 || i2 < i || i2 >= this.rows.size()) {
            return false;
        }
        RichEditorHistory richEditorHistory = this.history;
        if (richEditorHistory != null) {
            richEditorHistory.flush();
        }
        if (z) {
            z2 = false;
            while (i2 >= i) {
                if (indentRow(i2, true, true)) {
                    z2 = true;
                }
                i2--;
            }
        } else {
            BlockRow blockRow = (BlockRow) this.rows.get(i);
            if (blockRow.level >= 1 && (i == 0 || ((BlockRow) this.rows.get(i - 1)).level < blockRow.level)) {
                return false;
            }
            z2 = false;
            while (i <= i2) {
                if (indentRow(i, false, true)) {
                    z2 = true;
                }
                i++;
            }
        }
        if (z2) {
            renumberAllRuns();
            this.adapter.update(false);
            RichEditorHistory richEditorHistory2 = this.history;
            if (richEditorHistory2 != null) {
                richEditorHistory2.record();
            }
        }
        return z2;
    }

    boolean canIndentRow(int i) {
        boolean z;
        if (i < 0 || i >= this.rows.size()) {
            return false;
        }
        BlockRow blockRow = (BlockRow) this.rows.get(i);
        if (blockRow.level == 0) {
            z = blockRow.block instanceof TL_iv.pageBlockParagraph;
        } else {
            z = i > 0 && ((BlockRow) this.rows.get(i + (-1))).level >= blockRow.level;
        }
        return z && indentKeepsDepth(i);
    }

    boolean canOutdentRow(int i) {
        return i >= 0 && i < this.rows.size() && ((BlockRow) this.rows.get(i)).level > 0;
    }

    private boolean indentRow(int i, boolean z, boolean z2) {
        if (i < 0 || i >= this.rows.size()) {
            return false;
        }
        BlockRow blockRow = (BlockRow) this.rows.get(i);
        if (z) {
            if (blockRow.level <= 0) {
                return false;
            }
            cascadeOutdent(i);
            return true;
        }
        if (blockRow.level == 0) {
            if (!(blockRow.block instanceof TL_iv.pageBlockParagraph) || !indentKeepsDepth(i)) {
                return false;
            }
            blockRow.level = 1;
            if (i > 0) {
                blockRow.num = ((BlockRow) this.rows.get(i - 1)).num > 0 ? 1 : 0;
            } else {
                blockRow.num = 0;
            }
            return true;
        }
        if ((!z2 && (i == 0 || ((BlockRow) this.rows.get(i - 1)).level < blockRow.level)) || !indentKeepsDepth(i)) {
            return false;
        }
        blockRow.level++;
        return true;
    }

    private void cascadeOutdent(int i) {
        BlockRow blockRow;
        int i2;
        BlockRow blockRow2 = (BlockRow) this.rows.get(i);
        int i3 = blockRow2.level;
        if (i3 <= 0) {
            return;
        }
        int i4 = i3 - 1;
        blockRow2.level = i4;
        if (i4 == 0) {
            blockRow2.num = 0;
            blockRow2.checkbox = false;
            blockRow2.checked = false;
        }
        while (true) {
            i++;
            if (i >= this.rows.size() || (i2 = (blockRow = (BlockRow) this.rows.get(i)).level) <= i3) {
                return;
            } else {
                blockRow.level = i2 - 1;
            }
        }
    }

    private void renumberAllRuns() {
        for (int i = 0; i < this.rows.size(); i++) {
            BlockRow blockRow = (BlockRow) this.rows.get(i);
            int i2 = blockRow.level;
            if (i2 > 0 && blockRow.num > 0) {
                int i3 = 1;
                for (int i4 = i - 1; i4 >= 0; i4--) {
                    BlockRow blockRow2 = (BlockRow) this.rows.get(i4);
                    int i5 = blockRow2.level;
                    if (i5 < i2) {
                        break;
                    }
                    if (i5 == i2) {
                        if (blockRow2.num <= 0) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                }
                blockRow.num = i3;
            }
        }
    }

    private int captureCaret(BlockRow blockRow) {
        View findViewByItemObject = findViewByItemObject(blockRow);
        if (!(findViewByItemObject instanceof RichTextCell)) {
            return -1;
        }
        RichTextCell richTextCell = (RichTextCell) findViewByItemObject;
        if (richTextCell.getEditText().isFocused()) {
            return richTextCell.getEditText().getSelectionEnd();
        }
        return -1;
    }

    private void restoreCaret(final BlockRow blockRow, final int i) {
        if (i < 0) {
            return;
        }
        post(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                RichEditorListView.this.lambda$restoreCaret$49(blockRow, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$restoreCaret$49(BlockRow blockRow, int i) {
        View findViewByItemObject = findViewByItemObject(blockRow);
        if (findViewByItemObject instanceof RichTextCell) {
            RichTextCell richTextCell = (RichTextCell) findViewByItemObject;
            richTextCell.requestEditFocus();
            richTextCell.getEditText().setSelection(Math.max(0, Math.min(i, richTextCell.getEditText().length())));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: focusRow, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void lambda$tryPlainArrowAcrossCells$50(BlockRow blockRow) {
        View findViewByItemObject = findViewByItemObject(blockRow);
        if (findViewByItemObject instanceof RichTextCell) {
            ((RichTextCell) findViewByItemObject).requestEditFocus();
        }
    }

    private static boolean isNonText(TL_iv.PageBlock pageBlock) {
        return (pageBlock instanceof TL_iv.pageBlockDivider) || (pageBlock instanceof TL_iv.pageBlockPhoto) || (pageBlock instanceof TL_iv.pageBlockVideo) || (pageBlock instanceof TL_iv.pageBlockCollage) || (pageBlock instanceof TL_iv.pageBlockSlideshow) || (pageBlock instanceof TL_iv.pageBlockAudio) || (pageBlock instanceof TL_iv.pageBlockMath) || (pageBlock instanceof TL_iv.pageBlockMap) || (pageBlock instanceof TL_iv.pageBlockTable) || (pageBlock instanceof TL_iv.pageBlockList) || (pageBlock instanceof TL_iv.pageBlockOrderedList);
    }

    TL_iv.RichMessage buildDraftRichMessage() {
        if (!hasAnyText()) {
            return null;
        }
        ArrayList<TL_iv.PageBlock> flattenRowsToBlocks = flattenRowsToBlocks();
        if (flattenRowsToBlocks.isEmpty()) {
            return null;
        }
        TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
        richMessage.blocks = flattenRowsToBlocks;
        richMessage.photos = collectPhotos();
        richMessage.documents = collectDocuments();
        return richMessage;
    }

    public int findExceededLimit() {
        AppGlobalConfig appGlobalConfig = MessagesController.getInstance(this.currentAccount).config;
        int i = 0;
        for (int i2 = 0; i2 < this.rows.size(); i2++) {
            i += mediasOf((BlockRow) this.rows.get(i2)).size();
        }
        return RichEditorLimits.measure(flattenRowsToBlocks(), i).findExceeded(appGlobalConfig);
    }

    private boolean indentKeepsDepth(int i) {
        return ((BlockRow) this.rows.get(i)).level + 1 <= MessagesController.getInstance(this.currentAccount).config.richMessageMaxDepth.get() + (-6);
    }

    public boolean isWithinLimits() {
        return findExceededLimit() == 0;
    }

    boolean hasAnyText() {
        for (int i = 0; i < this.rows.size(); i++) {
            BlockRow blockRow = (BlockRow) this.rows.get(i);
            if (!RichTextCell.readPlainText(blockRow.block).isEmpty()) {
                return true;
            }
            if (isMedia(blockRow.block) || (blockRow.block instanceof TL_iv.pageBlockAudio)) {
                for (MediaUploadState mediaUploadState : mediasOf(blockRow)) {
                    if (mediaUploadState.isReady() || mediaUploadState.isPending()) {
                        return true;
                    }
                }
            }
            TL_iv.PageBlock pageBlock = blockRow.block;
            if ((pageBlock instanceof TL_iv.pageBlockMath) && !TextUtils.isEmpty(((TL_iv.pageBlockMath) pageBlock).source)) {
                return true;
            }
            TL_iv.PageBlock pageBlock2 = blockRow.block;
            if ((pageBlock2 instanceof TL_iv.pageBlockMap) && RichMapCell.hasGeo((TL_iv.pageBlockMap) pageBlock2)) {
                return true;
            }
            TL_iv.PageBlock pageBlock3 = blockRow.block;
            if ((pageBlock3 instanceof TL_iv.pageBlockTable) && tableHasText((TL_iv.pageBlockTable) pageBlock3)) {
                return true;
            }
        }
        return false;
    }

    private static boolean tableHasText(TL_iv.pageBlockTable pageblocktable) {
        if (pageblocktable.rows == null) {
            return false;
        }
        for (int i = 0; i < pageblocktable.rows.size(); i++) {
            TL_iv.pageTableRow pagetablerow = pageblocktable.rows.get(i);
            for (int i2 = 0; i2 < pagetablerow.cells.size(); i2++) {
                if (!TableModel.readPlainText(pagetablerow.cells.get(i2)).isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    ArrayList collectPhotos() {
        TLRPC.Photo photo;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        for (int i = 0; i < this.rows.size(); i++) {
            for (MediaUploadState mediaUploadState : mediasOf((BlockRow) this.rows.get(i))) {
                if (mediaUploadState.isReady() && (photo = mediaUploadState.photo) != null && hashSet.add(Long.valueOf(photo.id))) {
                    arrayList.add(mediaUploadState.photo);
                }
            }
        }
        return arrayList;
    }

    ArrayList collectDocuments() {
        TLRPC.Document document;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        for (int i = 0; i < this.rows.size(); i++) {
            for (MediaUploadState mediaUploadState : mediasOf((BlockRow) this.rows.get(i))) {
                if (mediaUploadState.isReady() && (document = mediaUploadState.document) != null && hashSet.add(Long.valueOf(document.id))) {
                    arrayList.add(mediaUploadState.document);
                }
            }
        }
        return arrayList;
    }

    boolean hasPendingUploads() {
        for (int i = 0; i < this.rows.size(); i++) {
            Iterator it = mediasOf((BlockRow) this.rows.get(i)).iterator();
            while (it.hasNext()) {
                if (((MediaUploadState) it.next()).isPending()) {
                    return true;
                }
            }
        }
        return false;
    }

    ArrayList flattenRowsToBlocks() {
        return flattenRange(0, this.rows.size(), false);
    }

    private static boolean isEmptyTextBlock(TL_iv.PageBlock pageBlock) {
        return (isNonText(pageBlock) || (pageBlock instanceof TL_iv.pageBlockDetails) || !RichTextCell.readPlainText(pageBlock).isEmpty()) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ArrayList flattenRange(int i, int i2, boolean z) {
        TL_iv.pageBlockCollage pageblockcollage;
        ArrayList arrayList = new ArrayList();
        int i3 = i;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            BlockRow blockRow = (BlockRow) this.rows.get(i3);
            if (!blockRow.detailsEnd) {
                if (isDetailsHeader(blockRow)) {
                    TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) blockRow.block;
                    if (pageblockdetails.title == null) {
                        pageblockdetails.title = new TL_iv.textEmpty();
                    }
                    int matchingDetailsEnd = matchingDetailsEnd(i3);
                    pageblockdetails.blocks = flattenRange(i3 + 1, Math.min(matchingDetailsEnd, i2), true);
                    arrayList.add(pageblockdetails);
                    i3 = matchingDetailsEnd + 1;
                } else {
                    int i4 = blockRow.level;
                    if (i4 <= 0) {
                        TL_iv.PageBlock pageBlock = blockRow.block;
                        if (pageBlock instanceof TL_iv.pageBlockDivider) {
                            arrayList.add(pageBlock);
                        } else if (pageBlock instanceof TL_iv.pageBlockPhoto) {
                            MediaUploadState mediaUploadState = blockRow.media;
                            if (mediaUploadState != null && mediaUploadState.isReady()) {
                                TL_iv.pageBlockPhoto pageblockphoto = (TL_iv.pageBlockPhoto) blockRow.block;
                                if (pageblockphoto.photo_id != 0) {
                                    if (pageblockphoto.caption == null) {
                                        pageblockphoto.caption = new TL_iv.PageCaption();
                                        ((TL_iv.pageBlockPhoto) blockRow.block).caption.text = new TL_iv.textEmpty();
                                        ((TL_iv.pageBlockPhoto) blockRow.block).caption.credit = new TL_iv.textEmpty();
                                    }
                                    arrayList.add(blockRow.block);
                                }
                            }
                        } else if (pageBlock instanceof TL_iv.pageBlockVideo) {
                            MediaUploadState mediaUploadState2 = blockRow.media;
                            if (mediaUploadState2 != null && mediaUploadState2.isReady()) {
                                TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) blockRow.block;
                                if (pageblockvideo.video_id != 0) {
                                    if (pageblockvideo.caption == null) {
                                        pageblockvideo.caption = new TL_iv.PageCaption();
                                        ((TL_iv.pageBlockVideo) blockRow.block).caption.text = new TL_iv.textEmpty();
                                        ((TL_iv.pageBlockVideo) blockRow.block).caption.credit = new TL_iv.textEmpty();
                                    }
                                    arrayList.add(blockRow.block);
                                }
                            }
                        } else if (isGallery(pageBlock)) {
                            ArrayList galleryItems = galleryItems(blockRow.block);
                            List mediasOf = mediasOf(blockRow);
                            ArrayList<TL_iv.PageBlock> arrayList2 = new ArrayList<>();
                            for (int i5 = 0; galleryItems != null && i5 < galleryItems.size() && i5 < mediasOf.size(); i5++) {
                                TL_iv.PageBlock pageBlock2 = (TL_iv.PageBlock) galleryItems.get(i5);
                                if (((MediaUploadState) mediasOf.get(i5)).isReady() && mediaIdOf(pageBlock2) != 0) {
                                    RichCaptionController.ensureCaption(pageBlock2);
                                    arrayList2.add(pageBlock2);
                                }
                            }
                            if (arrayList2.size() >= 2) {
                                if (blockRow.block instanceof TL_iv.pageBlockSlideshow) {
                                    TL_iv.pageBlockSlideshow pageblockslideshow = new TL_iv.pageBlockSlideshow();
                                    pageblockslideshow.items = arrayList2;
                                    pageblockslideshow.caption = blockRow.block.caption;
                                    pageblockcollage = pageblockslideshow;
                                } else {
                                    TL_iv.pageBlockCollage pageblockcollage2 = new TL_iv.pageBlockCollage();
                                    pageblockcollage2.items = arrayList2;
                                    pageblockcollage2.caption = blockRow.block.caption;
                                    pageblockcollage = pageblockcollage2;
                                }
                                RichCaptionController.ensureCaption(pageblockcollage);
                                arrayList.add(pageblockcollage);
                            } else if (arrayList2.size() == 1) {
                                arrayList.add(arrayList2.get(0));
                            }
                        } else {
                            TL_iv.PageBlock pageBlock3 = blockRow.block;
                            if (pageBlock3 instanceof TL_iv.pageBlockAudio) {
                                MediaUploadState mediaUploadState3 = blockRow.media;
                                if (mediaUploadState3 != null && mediaUploadState3.isReady()) {
                                    TL_iv.pageBlockAudio pageblockaudio = (TL_iv.pageBlockAudio) blockRow.block;
                                    if (pageblockaudio.audio_id != 0) {
                                        if (pageblockaudio.caption == null) {
                                            pageblockaudio.caption = new TL_iv.PageCaption();
                                            ((TL_iv.pageBlockAudio) blockRow.block).caption.text = new TL_iv.textEmpty();
                                            ((TL_iv.pageBlockAudio) blockRow.block).caption.credit = new TL_iv.textEmpty();
                                        }
                                        arrayList.add(blockRow.block);
                                    }
                                }
                            } else if (pageBlock3 instanceof TL_iv.pageBlockMap) {
                                TL_iv.pageBlockMap pageblockmap = (TL_iv.pageBlockMap) pageBlock3;
                                if (RichMapCell.hasGeo(pageblockmap)) {
                                    if (pageblockmap.caption == null) {
                                        TL_iv.PageCaption pageCaption = new TL_iv.PageCaption();
                                        pageblockmap.caption = pageCaption;
                                        pageCaption.text = new TL_iv.textEmpty();
                                        pageblockmap.caption.credit = new TL_iv.textEmpty();
                                    }
                                    arrayList.add(pageblockmap);
                                }
                            } else if (pageBlock3 instanceof TL_iv.pageBlockMath) {
                                if (!TextUtils.isEmpty(((TL_iv.pageBlockMath) pageBlock3).source)) {
                                    arrayList.add(blockRow.block);
                                }
                            } else if (pageBlock3 instanceof TL_iv.pageBlockTable) {
                                TL_iv.pageBlockTable pageblocktable = (TL_iv.pageBlockTable) pageBlock3;
                                TableModel.normalizeForSend(pageblocktable);
                                if (tableHasText(pageblocktable)) {
                                    arrayList.add(pageblocktable);
                                }
                            } else {
                                arrayList.add(pageBlock3);
                            }
                        }
                    } else {
                        int[] iArr = {i3};
                        TL_iv.PageBlock buildListBlock = buildListBlock(i3, i4, blockRow.num > 0, iArr);
                        if (buildListBlock != null) {
                            arrayList.add(buildListBlock);
                        }
                        i3 = iArr[0];
                        if (i3 <= 0) {
                            i3 = i2;
                        }
                    }
                }
            }
            i3++;
        }
        if (!z) {
            while (!arrayList.isEmpty() && isEmptyTextBlock((TL_iv.PageBlock) arrayList.get(0))) {
                arrayList.remove(0);
            }
            while (!arrayList.isEmpty() && isEmptyTextBlock((TL_iv.PageBlock) arrayList.get(arrayList.size() - 1))) {
                arrayList.remove(arrayList.size() - 1);
            }
        }
        return arrayList;
    }

    private TL_iv.PageBlock buildListBlock(int i, int i2, boolean z, int[] iArr) {
        BlockRow blockRow;
        int i3;
        TL_iv.pageBlockOrderedList pageblockorderedlist = z ? new TL_iv.pageBlockOrderedList() : null;
        TL_iv.pageBlockList pageblocklist = z ? null : new TL_iv.pageBlockList();
        int i4 = i;
        int i5 = 1;
        while (i4 < this.rows.size() && (i3 = (blockRow = (BlockRow) this.rows.get(i4)).level) >= i2) {
            if (i3 == i2) {
                if ((blockRow.num > 0) != z) {
                    break;
                }
            }
            if (i3 > i2) {
                break;
            }
            TL_iv.PageBlock pageBlock = blockRow.block;
            TL_iv.RichText richText = pageBlock == null ? null : pageBlock.text;
            if (richText == null) {
                richText = new TL_iv.textEmpty();
            }
            i4++;
            ArrayList arrayList = new ArrayList();
            while (i4 < this.rows.size() && ((BlockRow) this.rows.get(i4)).level > i2) {
                int[] iArr2 = {i4};
                TL_iv.PageBlock buildListBlock = buildListBlock(i4, ((BlockRow) this.rows.get(i4)).level, ((BlockRow) this.rows.get(i4)).num > 0, iArr2);
                if (buildListBlock != null) {
                    arrayList.add(buildListBlock);
                }
                int i6 = iArr2[0];
                if (i6 <= i4) {
                    break;
                }
                i4 = i6;
            }
            if (!arrayList.isEmpty()) {
                TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                pageblockparagraph.text = richText;
                ArrayList<TL_iv.PageBlock> arrayList2 = new ArrayList<>();
                arrayList2.add(pageblockparagraph);
                arrayList2.addAll(arrayList);
                if (z) {
                    TL_iv.TL_pageListOrderedItemBlocks tL_pageListOrderedItemBlocks = new TL_iv.TL_pageListOrderedItemBlocks();
                    tL_pageListOrderedItemBlocks.num = i5 + ".";
                    tL_pageListOrderedItemBlocks.blocks = arrayList2;
                    tL_pageListOrderedItemBlocks.checkbox = blockRow.checkbox;
                    tL_pageListOrderedItemBlocks.checked = blockRow.checked;
                    pageblockorderedlist.items.add(tL_pageListOrderedItemBlocks);
                } else {
                    TL_iv.TL_pageListItemBlocks tL_pageListItemBlocks = new TL_iv.TL_pageListItemBlocks();
                    tL_pageListItemBlocks.blocks = arrayList2;
                    tL_pageListItemBlocks.checkbox = blockRow.checkbox;
                    tL_pageListItemBlocks.checked = blockRow.checked;
                    pageblocklist.items.add(tL_pageListItemBlocks);
                }
            } else if (z) {
                TL_iv.TL_pageListOrderedItemText tL_pageListOrderedItemText = new TL_iv.TL_pageListOrderedItemText();
                tL_pageListOrderedItemText.num = i5 + ".";
                tL_pageListOrderedItemText.text = richText;
                tL_pageListOrderedItemText.checkbox = blockRow.checkbox;
                tL_pageListOrderedItemText.checked = blockRow.checked;
                pageblockorderedlist.items.add(tL_pageListOrderedItemText);
            } else {
                TL_iv.TL_pageListItemText tL_pageListItemText = new TL_iv.TL_pageListItemText();
                tL_pageListItemText.text = richText;
                tL_pageListItemText.checkbox = blockRow.checkbox;
                tL_pageListItemText.checked = blockRow.checked;
                pageblocklist.items.add(tL_pageListItemText);
            }
            i5++;
        }
        iArr[0] = i4;
        if (z) {
            if (pageblockorderedlist.items.isEmpty()) {
                return null;
            }
            return pageblockorderedlist;
        }
        if (pageblocklist.items.isEmpty()) {
            return null;
        }
        return pageblocklist;
    }

    BlockRow findFocusedRow() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof RichTextCell) {
                RichTextCell richTextCell = (RichTextCell) childAt;
                if (richTextCell.getEditText().isFocused() || (richTextCell.isAuthorVisible() && richTextCell.isAuthorFocused())) {
                    return richTextCell.getRow();
                }
            }
        }
        return null;
    }

    private boolean tryPlainArrowAcrossCells(int i) {
        int indexOf;
        Layout layout;
        int findNextNavigableRow;
        Layout layout2;
        BlockRow findFocusedNavRow = findFocusedNavRow();
        if (findFocusedNavRow == null || (indexOf = this.rows.indexOf(findFocusedNavRow)) < 0) {
            return false;
        }
        View findViewByItemObject = findViewByItemObject(findFocusedNavRow);
        boolean z = i == 20;
        if (findViewByItemObject instanceof RichTextCell) {
            RichTextCell richTextCell = (RichTextCell) findViewByItemObject;
            if (richTextCell.isAuthorVisible()) {
                if (z && !richTextCell.isAuthorFocused()) {
                    Layout layout3 = richTextCell.getEditText().getLayout();
                    if (layout3 == null || layout3.getLineForOffset(richTextCell.getEditText().getSelectionEnd()) >= layout3.getLineCount() - 1) {
                        richTextCell.focusAuthorFromBody();
                        return true;
                    }
                } else if (!z && richTextCell.isAuthorFocused() && ((layout2 = richTextCell.getAuthorEditText().getLayout()) == null || layout2.getLineForOffset(richTextCell.getAuthorEditText().getSelectionEnd()) <= 0)) {
                    richTextCell.focusBodyFromAuthor();
                    return true;
                }
            }
        }
        RichEditText focusedNavEditText = focusedNavEditText(findViewByItemObject);
        if (focusedNavEditText == null || (layout = focusedNavEditText.getLayout()) == null) {
            return false;
        }
        int lineForOffset = layout.getLineForOffset(focusedNavEditText.getSelectionEnd());
        if (!z) {
            if (lineForOffset > 0 || (findNextNavigableRow = findNextNavigableRow(indexOf - 1, -1)) < 0) {
                return false;
            }
            final BlockRow blockRow = (BlockRow) this.rows.get(findNextNavigableRow);
            post(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda34
                @Override // java.lang.Runnable
                public final void run() {
                    RichEditorListView.this.lambda$tryPlainArrowAcrossCells$52(blockRow);
                }
            });
            return true;
        }
        if (lineForOffset < layout.getLineCount() - 1) {
            return false;
        }
        int findNextNavigableRow2 = findNextNavigableRow(indexOf + 1, 1);
        if (findNextNavigableRow2 < 0) {
            final BlockRow blockRow2 = new BlockRow(new TL_iv.pageBlockParagraph());
            this.rows.add(blockRow2);
            this.adapter.update(false);
            post(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda32
                @Override // java.lang.Runnable
                public final void run() {
                    RichEditorListView.this.lambda$tryPlainArrowAcrossCells$50(blockRow2);
                }
            });
        } else {
            final BlockRow blockRow3 = (BlockRow) this.rows.get(findNextNavigableRow2);
            post(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda33
                @Override // java.lang.Runnable
                public final void run() {
                    RichEditorListView.this.lambda$tryPlainArrowAcrossCells$51(blockRow3);
                }
            });
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$tryPlainArrowAcrossCells$51(BlockRow blockRow) {
        focusNavRow(blockRow, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$tryPlainArrowAcrossCells$52(BlockRow blockRow) {
        focusNavRow(blockRow, true);
    }

    private int findNextNavigableRow(int i, int i2) {
        while (i >= 0 && i < this.rows.size()) {
            BlockRow blockRow = (BlockRow) this.rows.get(i);
            if (!blockRow.detailsEnd && !isHiddenByCollapse(i)) {
                TL_iv.PageBlock pageBlock = blockRow.block;
                if (!isNonText(pageBlock) || hasCaption(pageBlock) || (pageBlock instanceof TL_iv.pageBlockTable)) {
                    return i;
                }
            }
            i += i2;
        }
        return -1;
    }

    private boolean isHiddenByCollapse(int i) {
        int i2 = -1;
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            BlockRow blockRow = (BlockRow) this.rows.get(i4);
            if (isDetailsHeader(blockRow)) {
                i3++;
                if (i2 == -1 && !((TL_iv.pageBlockDetails) blockRow.block).open) {
                    i2 = i3;
                }
            } else if (blockRow.detailsEnd) {
                if (i2 != -1 && i3 == i2) {
                    i2 = -1;
                }
                i3--;
            }
        }
        return i2 != -1;
    }

    private static boolean hasCaption(TL_iv.PageBlock pageBlock) {
        return (pageBlock instanceof TL_iv.pageBlockMap) || (pageBlock instanceof TL_iv.pageBlockAudio) || isMedia(pageBlock);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private RichEditText navEditTextOf(View view) {
        if (view instanceof RichTextCell) {
            return ((RichTextCell) view).getEditText();
        }
        if (view instanceof RichCaptionHost) {
            return ((RichCaptionHost) view).getCaptionEditText();
        }
        if (view instanceof RichDetailsCell) {
            return ((RichDetailsCell) view).getEditText();
        }
        return null;
    }

    private RichEditText focusedNavEditText(View view) {
        if (view instanceof RichTextCell) {
            RichTextCell richTextCell = (RichTextCell) view;
            return (richTextCell.isAuthorVisible() && richTextCell.isAuthorFocused()) ? richTextCell.getAuthorEditText() : richTextCell.getEditText();
        }
        return navEditTextOf(view);
    }

    private BlockRow findFocusedNavRow() {
        for (int i = 0; i < getChildCount(); i++) {
            KeyEvent.Callback childAt = getChildAt(i);
            if (childAt instanceof RichTextCell) {
                RichTextCell richTextCell = (RichTextCell) childAt;
                if (richTextCell.getEditText().isFocused() || (richTextCell.isAuthorVisible() && richTextCell.isAuthorFocused())) {
                    return richTextCell.getRow();
                }
            } else if (childAt instanceof RichCaptionHost) {
                RichCaptionHost richCaptionHost = (RichCaptionHost) childAt;
                if (richCaptionHost.getCaptionEditText().isFocused()) {
                    return richCaptionHost.getRow();
                }
            } else if (childAt instanceof RichDetailsCell) {
                RichDetailsCell richDetailsCell = (RichDetailsCell) childAt;
                if (richDetailsCell.getEditText().isFocused()) {
                    return richDetailsCell.getRow();
                }
            } else {
                continue;
            }
        }
        return null;
    }

    private void focusNavRow(BlockRow blockRow, boolean z) {
        View findViewByItemObject = findViewByItemObject(blockRow);
        if (findViewByItemObject instanceof RichTableCell) {
            ((RichTableCell) findViewByItemObject).focusEdgeCell(z);
            return;
        }
        if (z && (findViewByItemObject instanceof RichTextCell)) {
            RichTextCell richTextCell = (RichTextCell) findViewByItemObject;
            if (richTextCell.isAuthorVisible()) {
                richTextCell.focusAuthorEnd();
                return;
            }
        }
        RichEditText navEditTextOf = navEditTextOf(findViewByItemObject);
        if (navEditTextOf == null) {
            lambda$tryPlainArrowAcrossCells$50(blockRow);
            return;
        }
        navEditTextOf.requestEditFocus();
        if (z) {
            navEditTextOf.setSelection(navEditTextOf.length());
        }
    }

    private boolean tryEscalateSelectionFromCaret(int i) {
        int indexOf;
        boolean z;
        BlockRow findFocusedRow = findFocusedRow();
        if (findFocusedRow == null || (indexOf = this.rows.indexOf(findFocusedRow)) < 0) {
            return false;
        }
        View findViewByItemObject = findViewByItemObject(findFocusedRow);
        if (!(findViewByItemObject instanceof RichTextCell)) {
            return false;
        }
        RichTextCell richTextCell = (RichTextCell) findViewByItemObject;
        RichEditText editText = richTextCell.getEditText();
        if (editText.getLayout() == null) {
            return false;
        }
        int selectionEnd = editText.getSelectionEnd();
        int length = editText.length();
        switch (i) {
            case 19:
            case 21:
                if (selectionEnd > 0) {
                    return false;
                }
                z = false;
                break;
            case 20:
            case 22:
                if (selectionEnd < length) {
                    return false;
                }
                z = true;
                break;
            default:
                return false;
        }
        int i2 = z ? indexOf + 1 : indexOf - 1;
        if (i2 < 0 || i2 >= this.rows.size()) {
            return false;
        }
        final BlockRow blockRow = (BlockRow) this.rows.get(i2);
        for (int i3 = 0; i3 < this.rows.size(); i3++) {
            this.textSelectionHelper.cacheText(i3, RichTextCell.readPlainText(((BlockRow) this.rows.get(i3)).block), null);
        }
        if (length == 0) {
            return false;
        }
        int max = Math.max(0, Math.min(editText.getSelectionStart(), length));
        if (z) {
            TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper = this.textSelectionHelper;
            if (max >= length) {
                length--;
            }
            if (!articleTextSelectionHelper.selectRangeOf(richTextCell, max, length)) {
                return false;
            }
            KeyEvent.Callback findViewByItemObject2 = findViewByItemObject(blockRow);
            if (findViewByItemObject2 instanceof TextSelectionHelper.ArticleSelectableView) {
                this.textSelectionHelper.extendSelectionTo((TextSelectionHelper.ArticleSelectableView) findViewByItemObject2, 0);
            } else {
                scrollToPosition(i2);
                post(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda36
                    @Override // java.lang.Runnable
                    public final void run() {
                        RichEditorListView.this.lambda$tryEscalateSelectionFromCaret$53(blockRow);
                    }
                });
            }
        } else {
            if (!this.textSelectionHelper.selectRangeOf(richTextCell, max, max > 0 ? 0 : 1)) {
                return false;
            }
            KeyEvent.Callback findViewByItemObject3 = findViewByItemObject(blockRow);
            if (findViewByItemObject3 instanceof TextSelectionHelper.ArticleSelectableView) {
                this.textSelectionHelper.extendSelectionTo((TextSelectionHelper.ArticleSelectableView) findViewByItemObject3, findViewByItemObject3 instanceof RichTextCell ? ((RichTextCell) findViewByItemObject3).getEditText().length() : 0);
            } else {
                scrollToPosition(i2);
                post(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda37
                    @Override // java.lang.Runnable
                    public final void run() {
                        RichEditorListView.this.lambda$tryEscalateSelectionFromCaret$54(blockRow);
                    }
                });
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$tryEscalateSelectionFromCaret$53(BlockRow blockRow) {
        KeyEvent.Callback findViewByItemObject = findViewByItemObject(blockRow);
        if (findViewByItemObject instanceof TextSelectionHelper.ArticleSelectableView) {
            this.textSelectionHelper.extendSelectionTo((TextSelectionHelper.ArticleSelectableView) findViewByItemObject, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$tryEscalateSelectionFromCaret$54(BlockRow blockRow) {
        KeyEvent.Callback findViewByItemObject = findViewByItemObject(blockRow);
        if (findViewByItemObject instanceof TextSelectionHelper.ArticleSelectableView) {
            this.textSelectionHelper.extendSelectionTo((TextSelectionHelper.ArticleSelectableView) findViewByItemObject, findViewByItemObject instanceof RichTextCell ? ((RichTextCell) findViewByItemObject).getEditText().length() : 0);
        }
    }

    private RichTableCell findTableCellAncestor(View view) {
        for (ViewParent parent = view == null ? null : view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof RichTableCell) {
                return (RichTableCell) parent;
            }
        }
        return null;
    }

    private RichTextCell cellAt(int i) {
        if (i < 0) {
            return null;
        }
        View findViewByPosition = this.layoutManager.findViewByPosition(i);
        if (findViewByPosition instanceof RichTextCell) {
            return (RichTextCell) findViewByPosition;
        }
        return null;
    }

    private View selectableAt(int i) {
        if (i < 0) {
            return null;
        }
        return this.layoutManager.findViewByPosition(i);
    }

    private int prevTextOffset(int i) {
        Layout layout;
        View selectableAt = selectableAt(i);
        if (!(selectableAt instanceof RichTextCell) || (layout = ((RichTextCell) selectableAt).getEditText().getLayout()) == null) {
            return 0;
        }
        return layout.getText().length();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01bb, code lost:
    
        if (r14 < r12.rows.size()) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x023d, code lost:
    
        if (r13 < r12.rows.size()) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c8, code lost:
    
        if (r14 < r12.rows.size()) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0249  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean tryExtendSelectionAcrossCells(int i, boolean z) {
        int i2;
        final int i3;
        int i4;
        int wordLeft;
        int findTableAnchorAbove;
        int prevTextOffset;
        Layout layout;
        int wordLeft2;
        int i5;
        int anchorCell = this.textSelectionHelper.getAnchorCell();
        int anchorChildPosition = this.textSelectionHelper.getAnchorChildPosition();
        int anchorOffset = this.textSelectionHelper.getAnchorOffset();
        int startCell = this.textSelectionHelper.getStartCell();
        final int startChildPosition = this.textSelectionHelper.getStartChildPosition();
        int startOffset = this.textSelectionHelper.getStartOffset();
        int endCell = this.textSelectionHelper.getEndCell();
        int endChildPosition = this.textSelectionHelper.getEndChildPosition();
        int endOffset = this.textSelectionHelper.getEndOffset();
        if (anchorCell == startCell && anchorChildPosition == startChildPosition && anchorOffset == startOffset) {
            startCell = endCell;
            startChildPosition = endChildPosition;
            startOffset = endOffset;
        }
        View selectableAt = selectableAt(startCell);
        final int i6 = 0;
        if (selectableAt == null) {
            return false;
        }
        if (selectableAt instanceof RichTableCell) {
            RichTableCell richTableCell = (RichTableCell) selectableAt;
            TableModel model = richTableCell.getModel();
            if (model != null && !model.anchors().isEmpty()) {
                i4 = (startChildPosition < 0 || startChildPosition >= model.anchors().size()) ? 0 : startChildPosition;
                RichTableCellHost hostForAnchor = richTableCell.getGrid().hostForAnchor((TL_iv.pageTableCell) model.anchors().get(i4));
                Layout layout2 = hostForAnchor != null ? hostForAnchor.editText.getLayout() : null;
                if (layout2 != null) {
                    CharSequence text = layout2.getText();
                    int length = text.length();
                    switch (i) {
                        case 19:
                            int lineForOffset = layout2.getLineForOffset(startOffset) - 1;
                            if (lineForOffset >= 0) {
                                i6 = layout2.getOffsetForHorizontal(lineForOffset, layout2.getPrimaryHorizontal(startOffset));
                            } else {
                                findTableAnchorAbove = findTableAnchorAbove(model, i4);
                                if (findTableAnchorAbove < 0) {
                                    i3 = startCell - 1;
                                    if (i3 >= 0) {
                                        prevTextOffset = prevTextOffset(i3);
                                        i6 = prevTextOffset;
                                        startChildPosition = 0;
                                        break;
                                    }
                                } else {
                                    RichTableCellHost hostForAnchor2 = richTableCell.getGrid().hostForAnchor((TL_iv.pageTableCell) model.anchors().get(findTableAnchorAbove));
                                    layout = hostForAnchor2 != null ? hostForAnchor2.editText.getLayout() : null;
                                    if (layout != null) {
                                        i6 = layout.getText().length();
                                    }
                                    startChildPosition = findTableAnchorAbove;
                                }
                            }
                            i3 = startCell;
                            break;
                        case 20:
                            int lineForOffset2 = layout2.getLineForOffset(startOffset) + 1;
                            if (lineForOffset2 < layout2.getLineCount()) {
                                i6 = layout2.getOffsetForHorizontal(lineForOffset2, layout2.getPrimaryHorizontal(startOffset));
                                i3 = startCell;
                                break;
                            } else {
                                findTableAnchorAbove = findTableAnchorBelow(model, i4);
                                if (findTableAnchorAbove < 0) {
                                    i3 = startCell + 1;
                                    if (i3 >= this.rows.size()) {
                                        i3 = startCell;
                                        i6 = length;
                                        break;
                                    }
                                    startChildPosition = 0;
                                    break;
                                }
                                startChildPosition = findTableAnchorAbove;
                                i3 = startCell;
                            }
                        case 21:
                            wordLeft2 = z ? wordLeft(text, startOffset) : Math.max(0, startOffset - 1);
                            if (wordLeft2 == startOffset && startOffset <= 0) {
                                i5 = i4 - 1;
                                if (i5 < 0) {
                                    i3 = startCell - 1;
                                    if (i3 >= 0) {
                                        prevTextOffset = prevTextOffset(i3);
                                        i6 = prevTextOffset;
                                        startChildPosition = 0;
                                        break;
                                    }
                                } else {
                                    RichTableCellHost hostForAnchor3 = richTableCell.getGrid().hostForAnchor((TL_iv.pageTableCell) model.anchors().get(i5));
                                    layout = hostForAnchor3 != null ? hostForAnchor3.editText.getLayout() : null;
                                    if (layout != null) {
                                        i6 = layout.getText().length();
                                    }
                                    startChildPosition = i5;
                                    i3 = startCell;
                                    break;
                                }
                            }
                            i6 = wordLeft2;
                            i3 = startCell;
                        case 22:
                            wordLeft2 = z ? wordRight(text, startOffset) : Math.min(length, startOffset + 1);
                            if (wordLeft2 == startOffset && startOffset >= length) {
                                i5 = i4 + 1;
                                if (i5 >= model.anchors().size()) {
                                    i3 = startCell + 1;
                                    break;
                                }
                                startChildPosition = i5;
                                i3 = startCell;
                                break;
                            }
                            i6 = wordLeft2;
                            i3 = startCell;
                        default:
                            i3 = startCell;
                            i6 = startOffset;
                            break;
                    }
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            if (selectableAt instanceof RichTextCell) {
                Layout layout3 = ((RichTextCell) selectableAt).getEditText().getLayout();
                if (layout3 != null) {
                    CharSequence text2 = layout3.getText();
                    int length2 = text2.length();
                    switch (i) {
                        case 19:
                            int lineForOffset3 = layout3.getLineForOffset(startOffset) - 1;
                            if (lineForOffset3 < 0) {
                                i2 = startCell - 1;
                                if (i2 >= 0) {
                                    i6 = prevTextOffset(i2);
                                    i3 = i2;
                                    break;
                                }
                            } else {
                                i6 = layout3.getOffsetForHorizontal(lineForOffset3, layout3.getPrimaryHorizontal(startOffset));
                            }
                            i3 = startCell;
                            break;
                        case 20:
                            int lineForOffset4 = layout3.getLineForOffset(startOffset) + 1;
                            if (lineForOffset4 < layout3.getLineCount()) {
                                i6 = layout3.getOffsetForHorizontal(lineForOffset4, layout3.getPrimaryHorizontal(startOffset));
                                i3 = startCell;
                                break;
                            } else {
                                i2 = startCell + 1;
                                if (i2 >= this.rows.size()) {
                                    i3 = startCell;
                                    i6 = length2;
                                    break;
                                }
                                i3 = i2;
                                break;
                            }
                        case 21:
                            wordLeft = z ? wordLeft(text2, startOffset) : Math.max(0, startOffset - 1);
                            if (wordLeft == startOffset && startOffset <= 0 && startCell - 1 >= 0) {
                                i6 = prevTextOffset(i3);
                                break;
                            }
                            i6 = wordLeft;
                            i3 = startCell;
                            break;
                        case 22:
                            wordLeft = z ? wordRight(text2, startOffset) : Math.min(length2, startOffset + 1);
                            if (wordLeft == startOffset) {
                                if (startOffset >= length2) {
                                    i3 = startCell + 1;
                                    break;
                                }
                            }
                            i6 = wordLeft;
                            i3 = startCell;
                            break;
                        default:
                            i3 = startCell;
                            i6 = startOffset;
                            break;
                    }
                } else {
                    return false;
                }
            } else {
                if (!(selectableAt instanceof RichDividerCell) && !(selectableAt instanceof RichMediaCell) && !(selectableAt instanceof RichAudioCell) && !(selectableAt instanceof RichMapCell) && !(selectableAt instanceof RichMathCell)) {
                    return false;
                }
                switch (i) {
                    case 19:
                    case 21:
                        i2 = startCell - 1;
                        if (i2 >= 0) {
                            i6 = prevTextOffset(i2);
                            i3 = i2;
                            break;
                        }
                        i3 = startCell;
                        i6 = startOffset;
                        break;
                    case 20:
                    case 22:
                        i2 = startCell + 1;
                        break;
                }
            }
            i4 = startChildPosition;
        }
        if (i3 == startCell && startChildPosition == i4 && i6 == startOffset) {
            return true;
        }
        if (i3 != startCell) {
            scrollToPosition(i3);
        }
        KeyEvent.Callback selectableAt2 = selectableAt(i3);
        if (!(selectableAt2 instanceof TextSelectionHelper.ArticleSelectableView)) {
            post(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda35
                @Override // java.lang.Runnable
                public final void run() {
                    RichEditorListView.this.lambda$tryExtendSelectionAcrossCells$55(i3, startChildPosition, i6);
                }
            });
            return true;
        }
        return this.textSelectionHelper.extendSelectionTo((TextSelectionHelper.ArticleSelectableView) selectableAt2, startChildPosition, i6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$tryExtendSelectionAcrossCells$55(int i, int i2, int i3) {
        KeyEvent.Callback selectableAt = selectableAt(i);
        if (selectableAt instanceof TextSelectionHelper.ArticleSelectableView) {
            this.textSelectionHelper.extendSelectionTo((TextSelectionHelper.ArticleSelectableView) selectableAt, i2, i3);
        }
    }

    private int findTableAnchorBelow(TableModel tableModel, int i) {
        if (i < 0 || i >= tableModel.anchors().size()) {
            return -1;
        }
        TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) tableModel.anchors().get(i);
        int anchorRowOf = tableModel.anchorRowOf(pagetablecell);
        int anchorColOf = tableModel.anchorColOf(pagetablecell);
        int max = anchorRowOf + Math.max(1, TableModel.spanRow(pagetablecell));
        if (max >= tableModel.rowCount) {
            return -1;
        }
        return tableModel.flatIndexOfAnchor(tableModel.grid[max][Math.min(anchorColOf, tableModel.colCount - 1)]);
    }

    private int findTableAnchorAbove(TableModel tableModel, int i) {
        if (i < 0 || i >= tableModel.anchors().size()) {
            return -1;
        }
        TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) tableModel.anchors().get(i);
        int anchorRowOf = tableModel.anchorRowOf(pagetablecell);
        int anchorColOf = tableModel.anchorColOf(pagetablecell);
        int i2 = anchorRowOf - 1;
        if (i2 < 0) {
            return -1;
        }
        return tableModel.flatIndexOfAnchor(tableModel.grid[i2][Math.min(anchorColOf, tableModel.colCount - 1)]);
    }

    private static int wordRight(CharSequence charSequence, int i) {
        BreakIterator wordInstance = BreakIterator.getWordInstance();
        wordInstance.setText(charSequence.toString());
        int following = wordInstance.following(Math.min(i, charSequence.length()));
        return following == -1 ? charSequence.length() : following;
    }

    private static int wordLeft(CharSequence charSequence, int i) {
        BreakIterator wordInstance = BreakIterator.getWordInstance();
        wordInstance.setText(charSequence.toString());
        int preceding = wordInstance.preceding(Math.max(0, Math.min(i, charSequence.length())));
        if (preceding == -1) {
            return 0;
        }
        return preceding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean tryEscalateSelectAll() {
        RichEditText findFocusedEditText;
        if (this.rows.isEmpty()) {
            return false;
        }
        if (!this.textSelectionHelper.isInSelectionMode() && (findFocusedEditText = findFocusedEditText()) != null && findFocusedEditText.getText() != null) {
            int length = findFocusedEditText.getText().length();
            boolean z = findFocusedEditText.getSelectionStart() == 0 && findFocusedEditText.getSelectionEnd() == length;
            if (length > 0 && !z) {
                findFocusedEditText.setSelection(0, length);
                return true;
            }
        }
        for (int i = 0; i < this.rows.size(); i++) {
            BlockRow blockRow = (BlockRow) this.rows.get(i);
            this.textSelectionHelper.cacheText(i, RichTextCell.readPlainText(blockRow.block), null);
            if (RichTextCell.isQuoteBlock(blockRow.block)) {
                String readAuthorPlain = RichTextCell.readAuthorPlain(blockRow.block);
                if (!readAuthorPlain.isEmpty()) {
                    this.textSelectionHelper.cacheChildText(i, 1, readAuthorPlain);
                }
            }
        }
        int size = this.rows.size() - 1;
        BlockRow blockRow2 = (BlockRow) this.rows.get(size);
        String readAuthorPlain2 = RichTextCell.isQuoteBlock(blockRow2.block) ? RichTextCell.readAuthorPlain(blockRow2.block) : "";
        if (!readAuthorPlain2.isEmpty()) {
            this.textSelectionHelper.selectAllBlocksRange(0, size, 1, readAuthorPlain2.length());
        } else {
            this.textSelectionHelper.selectAllBlocksRange(0, size);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void copyHelperSelection() {
        CharSequence selectedTextPublic = this.textSelectionHelper.getSelectedTextPublic();
        if (selectedTextPublic == null || selectedTextPublic.length() == 0) {
            return;
        }
        writeSelectionToClipboard(selectedTextPublic);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cutHelperSelection() {
        CharSequence selectedTextPublic = this.textSelectionHelper.getSelectedTextPublic();
        if (selectedTextPublic != null && selectedTextPublic.length() > 0) {
            writeSelectionToClipboard(selectedTextPublic);
        }
        deleteHelperSelection();
    }

    private void writeSelectionToClipboard(CharSequence charSequence) {
        ClipData newPlainText;
        String buildSelectionHtml = buildSelectionHtml();
        try {
            ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
            if (clipboardManager == null) {
                return;
            }
            if (buildSelectionHtml != null) {
                newPlainText = ClipData.newHtmlText("label", charSequence, buildSelectionHtml);
            } else {
                newPlainText = ClipData.newPlainText("label", charSequence);
            }
            clipboardManager.setPrimaryClip(newPlainText);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    private String buildSelectionHtml() {
        int indexOf = this.rows.indexOf(rowForCell(this.textSelectionHelper.getStartCell()));
        int indexOf2 = this.rows.indexOf(rowForCell(this.textSelectionHelper.getEndCell()));
        int startOffset = this.textSelectionHelper.getStartOffset();
        int endOffset = this.textSelectionHelper.getEndOffset();
        if (indexOf >= 0 && indexOf2 >= 0 && indexOf < this.rows.size() && indexOf2 < this.rows.size()) {
            if (indexOf > indexOf2) {
                indexOf2 = indexOf;
                indexOf = indexOf2;
                endOffset = startOffset;
                startOffset = endOffset;
            } else if (indexOf == indexOf2 && startOffset > endOffset) {
                endOffset = startOffset;
                startOffset = endOffset;
            }
            try {
                String serialize = RichHtml.serialize(this.rows, indexOf, indexOf2, startOffset, endOffset);
                if (TextUtils.isEmpty(serialize)) {
                    return null;
                }
                return serialize;
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0047 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void pasteAtHelperSelection() {
        ClipData primaryClip;
        String str;
        CharSequence coerceToText;
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        if (clipboardManager == null || !clipboardManager.hasPrimaryClip() || (primaryClip = clipboardManager.getPrimaryClip()) == null || primaryClip.getItemCount() == 0) {
            return;
        }
        ClipData.Item itemAt = primaryClip.getItemAt(0);
        if (primaryClip.getDescription() != null && primaryClip.getDescription().hasMimeType("text/html")) {
            try {
                str = itemAt.getHtmlText();
            } catch (Exception unused) {
            }
            if (!TextUtils.isEmpty(str)) {
                try {
                    List resolvePastedMedia = resolvePastedMedia(RichHtml.parse(str));
                    if (resolvePastedMedia != null && !resolvePastedMedia.isEmpty()) {
                        if (pasteBlocksAtSelection(resolvePastedMedia)) {
                            return;
                        }
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
            coerceToText = itemAt.coerceToText(getContext());
            if (coerceToText == null) {
                coerceToText = "";
            }
            applyEditRange(this.textSelectionHelper.getStartCell(), this.textSelectionHelper.getStartOffset(), this.textSelectionHelper.getEndCell(), this.textSelectionHelper.getEndOffset(), coerceToText.toString().split("\n", -1));
        }
        str = null;
        if (!TextUtils.isEmpty(str)) {
        }
        coerceToText = itemAt.coerceToText(getContext());
        if (coerceToText == null) {
        }
        applyEditRange(this.textSelectionHelper.getStartCell(), this.textSelectionHelper.getStartOffset(), this.textSelectionHelper.getEndCell(), this.textSelectionHelper.getEndOffset(), coerceToText.toString().split("\n", -1));
    }

    private boolean pasteBlocksAtSelection(List list) {
        return spliceBlocksInto(this.rows.indexOf(rowForCell(this.textSelectionHelper.getStartCell())), this.rows.indexOf(rowForCell(this.textSelectionHelper.getEndCell())), this.textSelectionHelper.getStartOffset(), this.textSelectionHelper.getEndOffset(), list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean onCellPaste(BlockRow blockRow, RichEditText richEditText) {
        ClipboardManager clipboardManager;
        ClipData primaryClip;
        int indexOf;
        if (blockRow != null && richEditText != null && (clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard")) != null && clipboardManager.hasPrimaryClip() && (primaryClip = clipboardManager.getPrimaryClip()) != null && primaryClip.getItemCount() != 0 && primaryClip.getDescription() != null && primaryClip.getDescription().hasMimeType("text/html")) {
            try {
                String htmlText = primaryClip.getItemAt(0).getHtmlText();
                if (TextUtils.isEmpty(htmlText)) {
                    return false;
                }
                try {
                    List resolvePastedMedia = resolvePastedMedia(RichHtml.parse(htmlText));
                    if (resolvePastedMedia == null || resolvePastedMedia.isEmpty()) {
                        return false;
                    }
                    if ((resolvePastedMedia.size() == 1 && isPlainParagraphRow((BlockRow) resolvePastedMedia.get(0))) || (indexOf = this.rows.indexOf(blockRow)) < 0) {
                        return false;
                    }
                    int max = Math.max(0, Math.min(richEditText.getSelectionStart(), richEditText.getSelectionEnd()));
                    return spliceBlocksInto(indexOf, indexOf, max, Math.max(max, Math.max(richEditText.getSelectionStart(), richEditText.getSelectionEnd())), resolvePastedMedia);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v8, types: [java.lang.CharSequence] */
    private boolean spliceBlocksInto(int i, int i2, int i3, int i4, List list) {
        final int caretEndOf;
        if (i < 0 || i2 < 0 || i >= this.rows.size() || i2 >= this.rows.size()) {
            return false;
        }
        if (i > i2) {
            i2 = i;
            i = i2;
            i4 = i3;
            i3 = i4;
        } else if (i == i2 && i3 > i4) {
            i4 = i3;
            i3 = i4;
        }
        for (int i5 = i; i5 <= i2; i5++) {
            BlockRow blockRow = (BlockRow) this.rows.get(i5);
            if (blockRow.detailsEnd || isDetailsHeader(blockRow) || isNonText(blockRow.block) || hasCaption(blockRow.block) || (blockRow.block instanceof TL_iv.pageBlockTable)) {
                return false;
            }
        }
        final BlockRow blockRow2 = (BlockRow) this.rows.get(i);
        BlockRow blockRow3 = (BlockRow) this.rows.get(i2);
        CharSequence readStyledText = RichTextCell.readStyledText(blockRow2.block);
        CharSequence readStyledText2 = i == i2 ? readStyledText : RichTextCell.readStyledText(blockRow3.block);
        if (readStyledText == null) {
            readStyledText = "";
        }
        if (readStyledText2 == null) {
            readStyledText2 = "";
        }
        int max = Math.max(0, Math.min(i3, readStyledText.length()));
        int max2 = Math.max(0, Math.min(i4, readStyledText2.length()));
        CharSequence subSequence = readStyledText.subSequence(0, max);
        CharSequence subSequence2 = readStyledText2.subSequence(max2, readStyledText2.length());
        RichEditorHistory richEditorHistory = this.history;
        if (richEditorHistory != null) {
            richEditorHistory.flush();
        }
        if (list.size() == 1 && isPlainParagraphRow((BlockRow) list.get(0))) {
            ?? readStyledText3 = RichTextCell.readStyledText(((BlockRow) list.get(0)).block);
            String str = readStyledText3 != 0 ? readStyledText3 : "";
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(subSequence);
            spannableStringBuilder.append((CharSequence) str);
            caretEndOf = spannableStringBuilder.length();
            spannableStringBuilder.append(subSequence2);
            RichTextCell.applyStyledTextToBlock(blockRow2.block, spannableStringBuilder);
            while (i2 > i) {
                this.rows.remove(i2);
                i2--;
            }
        } else {
            ArrayList arrayList = new ArrayList(list);
            if (subSequence.length() > 0) {
                TL_iv.PageBlock newSameTypeBlock = newSameTypeBlock(blockRow2.block);
                RichTextCell.applyStyledTextToBlock(newSameTypeBlock, subSequence);
                arrayList.add(0, new BlockRow(newSameTypeBlock, blockRow2.level, blockRow2.num));
            }
            blockRow2 = (BlockRow) list.get(list.size() - 1);
            caretEndOf = caretEndOf(blockRow2);
            if (subSequence2.length() > 0) {
                TL_iv.PageBlock newSameTypeBlock2 = newSameTypeBlock(blockRow3.block);
                RichTextCell.applyStyledTextToBlock(newSameTypeBlock2, subSequence2);
                arrayList.add(new BlockRow(newSameTypeBlock2, blockRow3.level, blockRow3.num));
            }
            while (i2 >= i) {
                this.rows.remove(i2);
                i2--;
            }
            for (int i6 = 0; i6 < arrayList.size(); i6++) {
                this.rows.add(i + i6, (BlockRow) arrayList.get(i6));
            }
        }
        renumberAllRuns();
        this.textSelectionHelper.clear();
        this.adapter.update(false);
        RichEditorHistory richEditorHistory2 = this.history;
        if (richEditorHistory2 != null) {
            richEditorHistory2.record();
        }
        post(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda23
            @Override // java.lang.Runnable
            public final void run() {
                RichEditorListView.this.lambda$spliceBlocksInto$56(blockRow2, caretEndOf);
            }
        });
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$spliceBlocksInto$56(BlockRow blockRow, int i) {
        View findViewByItemObject = blockRow == null ? null : findViewByItemObject(blockRow);
        if (findViewByItemObject instanceof RichTextCell) {
            RichTextCell richTextCell = (RichTextCell) findViewByItemObject;
            richTextCell.requestEditFocus();
            richTextCell.getEditText().setSelection(Math.min(i, richTextCell.getEditText().length()));
        }
    }

    private static boolean isPlainParagraphRow(BlockRow blockRow) {
        return (blockRow == null || blockRow.detailsEnd || isDetailsHeader(blockRow) || !(blockRow.block instanceof TL_iv.pageBlockParagraph) || blockRow.level != 0 || blockRow.num != 0 || blockRow.checkbox) ? false : true;
    }

    private static TL_iv.PageBlock newSameTypeBlock(TL_iv.PageBlock pageBlock) {
        if (pageBlock instanceof TL_iv.pageBlockHeading1) {
            return new TL_iv.pageBlockHeading1();
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading2) {
            return new TL_iv.pageBlockHeading2();
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading3) {
            return new TL_iv.pageBlockHeading3();
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading4) {
            return new TL_iv.pageBlockHeading4();
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading5) {
            return new TL_iv.pageBlockHeading5();
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading6) {
            return new TL_iv.pageBlockHeading6();
        }
        if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            return new TL_iv.pageBlockBlockquote();
        }
        if (pageBlock instanceof TL_iv.pageBlockPullquote) {
            return new TL_iv.pageBlockPullquote();
        }
        if (!(pageBlock instanceof TL_iv.pageBlockPreformatted)) {
            return pageBlock instanceof TL_iv.pageBlockFooter ? new TL_iv.pageBlockFooter() : new TL_iv.pageBlockParagraph();
        }
        TL_iv.pageBlockPreformatted pageblockpreformatted = new TL_iv.pageBlockPreformatted();
        pageblockpreformatted.language = ((TL_iv.pageBlockPreformatted) pageBlock).language;
        return pageblockpreformatted;
    }

    private static int caretEndOf(BlockRow blockRow) {
        CharSequence readStyledText;
        if (blockRow == null) {
            return 0;
        }
        if (isDetailsHeader(blockRow)) {
            CharSequence spannable = RichTextStyle.toSpannable(((TL_iv.pageBlockDetails) blockRow.block).title);
            if (spannable == null) {
                return 0;
            }
            return spannable.length();
        }
        if (!isTextBearing(blockRow.block) || (readStyledText = RichTextCell.readStyledText(blockRow.block)) == null) {
            return 0;
        }
        return readStyledText.length();
    }

    private static boolean isTextBearing(TL_iv.PageBlock pageBlock) {
        return (pageBlock instanceof TL_iv.pageBlockParagraph) || (pageBlock instanceof TL_iv.pageBlockPreformatted) || (pageBlock instanceof TL_iv.pageBlockBlockquote) || (pageBlock instanceof TL_iv.pageBlockPullquote) || isHeading(pageBlock);
    }

    private void deleteHelperSelection() {
        applyEditRange(this.textSelectionHelper.getStartCell(), this.textSelectionHelper.getStartOffset(), this.textSelectionHelper.getEndCell(), this.textSelectionHelper.getEndOffset(), new String[]{""});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void replaceHelperSelectionWith(String str) {
        applyEditRange(this.textSelectionHelper.getStartCell(), this.textSelectionHelper.getStartOffset(), this.textSelectionHelper.getEndCell(), this.textSelectionHelper.getEndOffset(), str.split("\n", -1));
    }

    private void applyEditRange(int i, int i2, int i3, int i4, String[] strArr) {
        final int length;
        int indexOf = this.rows.indexOf(rowForCell(i));
        int indexOf2 = this.rows.indexOf(rowForCell(i3));
        if (indexOf < 0 || indexOf2 < 0 || indexOf >= this.rows.size() || indexOf2 >= this.rows.size()) {
            return;
        }
        BlockRow blockRow = (BlockRow) this.rows.get(indexOf);
        BlockRow blockRow2 = (BlockRow) this.rows.get(indexOf2);
        if (indexOf == indexOf2 && isDetailsHeader(blockRow)) {
            applyEditInsideDetails(blockRow, i2, i4, strArr);
            return;
        }
        for (int i5 = indexOf; i5 <= indexOf2; i5++) {
            if (((BlockRow) this.rows.get(i5)).detailsEnd || isDetailsHeader((BlockRow) this.rows.get(i5))) {
                deleteAcrossDetails(indexOf, i2, indexOf2, i4, strArr);
                return;
            }
        }
        RichEditorHistory richEditorHistory = this.history;
        if (richEditorHistory != null) {
            richEditorHistory.flush();
        }
        TL_iv.PageBlock pageBlock = blockRow.block;
        boolean z = pageBlock instanceof TL_iv.pageBlockTable;
        boolean z2 = blockRow2.block instanceof TL_iv.pageBlockTable;
        if (z || z2) {
            if (z && z2 && indexOf == indexOf2) {
                applyEditInsideTable(blockRow, this.textSelectionHelper.getStartChildPosition(), i2, this.textSelectionHelper.getEndChildPosition(), i4, strArr);
                return;
            }
            return;
        }
        boolean hasCaption = hasCaption(pageBlock);
        boolean hasCaption2 = hasCaption(blockRow2.block);
        if (hasCaption || hasCaption2) {
            if (hasCaption && hasCaption2 && indexOf == indexOf2) {
                applyEditInsideCaption(blockRow, i2, i4, strArr);
                return;
            }
            return;
        }
        if (indexOf == indexOf2 && RichTextCell.isQuoteBlock(blockRow.block) && this.textSelectionHelper.getStartChildPosition() == 1 && this.textSelectionHelper.getEndChildPosition() == 1) {
            applyEditInsideAuthor(blockRow, i2, i4, strArr);
            return;
        }
        String readPlainText = RichTextCell.readPlainText(blockRow.block);
        String readPlainText2 = indexOf == indexOf2 ? readPlainText : RichTextCell.readPlainText(blockRow2.block);
        int max = Math.max(0, Math.min(i2, readPlainText.length()));
        int max2 = Math.max(0, Math.min(i4, readPlainText2.length()));
        String substring = readPlainText.substring(0, max);
        String substring2 = readPlainText2.substring(max2);
        if (strArr.length <= 1) {
            String str = strArr.length == 0 ? "" : strArr[0];
            RichTextCell.applyTextToBlock(blockRow.block, substring + str + substring2);
            if (indexOf2 > indexOf) {
                while (indexOf2 > indexOf) {
                    this.rows.remove(indexOf2);
                    indexOf2--;
                }
            }
            length = substring.length() + str.length();
        } else {
            RichTextCell.applyTextToBlock(blockRow.block, substring + strArr[0]);
            if (indexOf2 > indexOf) {
                while (indexOf2 > indexOf) {
                    this.rows.remove(indexOf2);
                    indexOf2--;
                }
            }
            for (int i6 = 1; i6 < strArr.length - 1; i6++) {
                TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                applyPlainText(pageblockparagraph, strArr[i6]);
                ArrayList arrayList = this.rows;
                int i7 = indexOf + i6;
                int i8 = blockRow.level;
                int i9 = blockRow.num;
                if (i9 > 0) {
                    i9 += i6;
                }
                arrayList.add(i7, new BlockRow(pageblockparagraph, i8, i9));
            }
            String str2 = strArr[strArr.length - 1];
            TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
            applyPlainText(pageblockparagraph2, str2 + substring2);
            ArrayList arrayList2 = this.rows;
            int length2 = (strArr.length + indexOf) - 1;
            int i10 = blockRow.level;
            int i11 = blockRow.num;
            if (i11 > 0) {
                i11 = (i11 + strArr.length) - 1;
            }
            arrayList2.add(length2, new BlockRow(pageblockparagraph2, i10, i11));
            indexOf = (indexOf + strArr.length) - 1;
            length = str2.length();
        }
        renumberAllRuns();
        final BlockRow blockRow3 = (indexOf < 0 || indexOf >= this.rows.size()) ? null : (BlockRow) this.rows.get(indexOf);
        this.textSelectionHelper.clear();
        this.adapter.update(false);
        RichEditorHistory richEditorHistory2 = this.history;
        if (richEditorHistory2 != null) {
            richEditorHistory2.record();
        }
        post(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda30
            @Override // java.lang.Runnable
            public final void run() {
                RichEditorListView.this.lambda$applyEditRange$57(blockRow3, length);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$applyEditRange$57(BlockRow blockRow, int i) {
        View findViewByItemObject = blockRow == null ? null : findViewByItemObject(blockRow);
        if (findViewByItemObject instanceof RichTextCell) {
            RichTextCell richTextCell = (RichTextCell) findViewByItemObject;
            richTextCell.requestEditFocus();
            richTextCell.getEditText().setSelection(Math.min(i, richTextCell.getEditText().length()));
        }
    }

    private void applyEditInsideAuthor(BlockRow blockRow, int i, int i2, String[] strArr) {
        View findViewByItemObject = findViewByItemObject(blockRow);
        if (findViewByItemObject instanceof RichTextCell) {
            RichTextCell richTextCell = (RichTextCell) findViewByItemObject;
            final RichEditText authorEditText = richTextCell.getAuthorEditText();
            RichEditorHistory richEditorHistory = this.history;
            if (richEditorHistory != null) {
                richEditorHistory.flush();
            }
            StringBuilder sb = new StringBuilder();
            for (int i3 = 0; i3 < strArr.length; i3++) {
                if (i3 > 0) {
                    sb.append(' ');
                }
                sb.append(strArr[i3]);
            }
            String sb2 = sb.toString();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(authorEditText.getText());
            int length = spannableStringBuilder.length();
            int max = Math.max(0, Math.min(Math.min(i, i2), length));
            spannableStringBuilder.replace(max, Math.max(0, Math.min(Math.max(i, i2), length)), (CharSequence) sb2);
            authorEditText.setTextSilently(spannableStringBuilder);
            authorEditText.invalidateEffects();
            richTextCell.persistAuthor();
            final int length2 = max + sb2.length();
            this.textSelectionHelper.clear();
            RichEditorHistory richEditorHistory2 = this.history;
            if (richEditorHistory2 != null) {
                richEditorHistory2.record();
            }
            this.delegate.onContentChanged();
            post(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda47
                @Override // java.lang.Runnable
                public final void run() {
                    RichEditorListView.lambda$applyEditInsideAuthor$58(RichEditText.this, length2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$applyEditInsideAuthor$58(RichEditText richEditText, int i) {
        richEditText.requestEditFocus();
        richEditText.setSelection(Math.max(0, Math.min(i, richEditText.length())));
    }

    RichEditText getFocusedEditTextOrNull() {
        View findFocus = findFocus();
        if (findFocus instanceof RichEditText) {
            return (RichEditText) findFocus;
        }
        return null;
    }

    RichEditText findFocusedEditText() {
        View findFocus = findFocus();
        if (findFocus instanceof RichEditText) {
            return (RichEditText) findFocus;
        }
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof RichTextCell) {
                return ((RichTextCell) childAt).getEditText();
            }
        }
        return null;
    }

    private static void applyPlainText(TL_iv.PageBlock pageBlock, String str) {
        TL_iv.textPlain textplain = new TL_iv.textPlain();
        textplain.text = str;
        if (pageBlock instanceof TL_iv.pageBlockParagraph) {
            ((TL_iv.pageBlockParagraph) pageBlock).text = textplain;
        }
    }

    private int detailsDepthBefore(int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < i && i3 < this.rows.size(); i3++) {
            if (isDetailsHeader((BlockRow) this.rows.get(i3))) {
                i2++;
            } else if (((BlockRow) this.rows.get(i3)).detailsEnd) {
                i2--;
            }
        }
        return i2;
    }

    private void deleteAcrossDetails(int i, int i2, int i3, int i4, String[] strArr) {
        int i5;
        final int length;
        String str;
        int i6 = i;
        while (i6 > 0 && detailsDepthBefore(i6) > 0) {
            i6--;
        }
        int i7 = i3;
        while (true) {
            i5 = i7 + 1;
            if (i5 >= this.rows.size() || detailsDepthBefore(i5) <= 0) {
                break;
            } else {
                i7 = i5;
            }
        }
        final BlockRow blockRow = (BlockRow) this.rows.get(i);
        BlockRow blockRow2 = (BlockRow) this.rows.get(i3);
        boolean z = i6 != i || isDetailsHeader(blockRow) || blockRow.detailsEnd;
        boolean z2 = i7 != i3 || isDetailsHeader(blockRow2) || blockRow2.detailsEnd;
        StringBuilder sb = new StringBuilder();
        for (int i8 = 0; i8 < strArr.length; i8++) {
            if (i8 > 0) {
                sb.append(' ');
            }
            sb.append(strArr[i8]);
        }
        String sb2 = sb.toString();
        RichEditorHistory richEditorHistory = this.history;
        if (richEditorHistory != null) {
            richEditorHistory.flush();
        }
        if (!z) {
            String readPlainText = RichTextCell.readPlainText(blockRow.block);
            String substring = readPlainText.substring(0, Math.max(0, Math.min(i2, readPlainText.length())));
            if (z2) {
                str = "";
            } else {
                String readPlainText2 = RichTextCell.readPlainText(blockRow2.block);
                str = readPlainText2.substring(Math.max(0, Math.min(i4, readPlainText2.length())));
            }
            RichTextCell.applyTextToBlock(blockRow.block, substring + sb2 + str);
            this.rows.subList(i6 + 1, i5).clear();
            length = substring.length() + sb2.length();
        } else if (!z2) {
            String readPlainText3 = RichTextCell.readPlainText(blockRow2.block);
            String substring2 = readPlainText3.substring(Math.max(0, Math.min(i4, readPlainText3.length())));
            RichTextCell.applyTextToBlock(blockRow2.block, sb2 + substring2);
            this.rows.subList(i6, i7).clear();
            length = sb2.length();
            blockRow = blockRow2;
        } else {
            this.rows.subList(i6, i5).clear();
            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
            applyPlainText(pageblockparagraph, sb2);
            blockRow = new BlockRow(pageblockparagraph);
            ArrayList arrayList = this.rows;
            arrayList.add(Math.min(i6, arrayList.size()), blockRow);
            length = sb2.length();
        }
        if (this.rows.isEmpty()) {
            blockRow = new BlockRow(new TL_iv.pageBlockParagraph());
            this.rows.add(blockRow);
            length = 0;
        }
        renumberAllRuns();
        this.textSelectionHelper.clear();
        this.adapter.update(false);
        RichEditorHistory richEditorHistory2 = this.history;
        if (richEditorHistory2 != null) {
            richEditorHistory2.record();
        }
        post(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda52
            @Override // java.lang.Runnable
            public final void run() {
                RichEditorListView.this.lambda$deleteAcrossDetails$59(blockRow, length);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$deleteAcrossDetails$59(BlockRow blockRow, int i) {
        View findViewByItemObject = findViewByItemObject(blockRow);
        if (findViewByItemObject instanceof RichTextCell) {
            RichTextCell richTextCell = (RichTextCell) findViewByItemObject;
            richTextCell.requestEditFocus();
            richTextCell.getEditText().setSelection(Math.max(0, Math.min(i, richTextCell.getEditText().length())));
        }
    }

    private void applyEditInsideDetails(BlockRow blockRow, int i, int i2, String[] strArr) {
        View findViewByItemObject = findViewByItemObject(blockRow);
        if ((findViewByItemObject instanceof RichDetailsCell) && (blockRow.block instanceof TL_iv.pageBlockDetails)) {
            final RichEditText editText = ((RichDetailsCell) findViewByItemObject).getEditText();
            RichEditorHistory richEditorHistory = this.history;
            if (richEditorHistory != null) {
                richEditorHistory.flush();
            }
            StringBuilder sb = new StringBuilder();
            for (int i3 = 0; i3 < strArr.length; i3++) {
                if (i3 > 0) {
                    sb.append(' ');
                }
                sb.append(strArr[i3]);
            }
            String sb2 = sb.toString();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(editText.getText());
            int length = spannableStringBuilder.length();
            int max = Math.max(0, Math.min(Math.min(i, i2), length));
            spannableStringBuilder.replace(max, Math.max(0, Math.min(Math.max(i, i2), length)), (CharSequence) sb2);
            editText.setTextSilently(spannableStringBuilder);
            editText.invalidateEffects();
            ((TL_iv.pageBlockDetails) blockRow.block).title = RichTextStyle.fromSpannable(spannableStringBuilder);
            final int length2 = max + sb2.length();
            this.textSelectionHelper.clear();
            RichEditorHistory richEditorHistory2 = this.history;
            if (richEditorHistory2 != null) {
                richEditorHistory2.record();
            }
            post(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda45
                @Override // java.lang.Runnable
                public final void run() {
                    RichEditorListView.lambda$applyEditInsideDetails$60(RichEditText.this, length2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$applyEditInsideDetails$60(RichEditText richEditText, int i) {
        richEditText.requestEditFocus();
        richEditText.setSelection(Math.max(0, Math.min(i, richEditText.length())));
    }

    private void applyEditInsideCaption(BlockRow blockRow, int i, int i2, String[] strArr) {
        KeyEvent.Callback findViewByItemObject = findViewByItemObject(blockRow);
        if (findViewByItemObject instanceof RichCaptionHost) {
            RichCaptionHost richCaptionHost = (RichCaptionHost) findViewByItemObject;
            final RichEditText captionEditText = richCaptionHost.getCaptionEditText();
            RichEditorHistory richEditorHistory = this.history;
            if (richEditorHistory != null) {
                richEditorHistory.flush();
            }
            StringBuilder sb = new StringBuilder();
            for (int i3 = 0; i3 < strArr.length; i3++) {
                if (i3 > 0) {
                    sb.append(' ');
                }
                sb.append(strArr[i3]);
            }
            String sb2 = sb.toString();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(captionEditText.getText());
            int length = spannableStringBuilder.length();
            int max = Math.max(0, Math.min(Math.min(i, i2), length));
            spannableStringBuilder.replace(max, Math.max(0, Math.min(Math.max(i, i2), length)), (CharSequence) sb2);
            captionEditText.setTextSilently(spannableStringBuilder);
            captionEditText.invalidateEffects();
            richCaptionHost.persistCaption();
            final int length2 = max + sb2.length();
            this.textSelectionHelper.clear();
            RichEditorHistory richEditorHistory2 = this.history;
            if (richEditorHistory2 != null) {
                richEditorHistory2.record();
            }
            post(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda49
                @Override // java.lang.Runnable
                public final void run() {
                    RichEditorListView.lambda$applyEditInsideCaption$61(RichEditText.this, length2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$applyEditInsideCaption$61(RichEditText richEditText, int i) {
        richEditText.requestEditFocus();
        richEditText.setSelection(Math.max(0, Math.min(i, richEditText.length())));
    }

    private void applyEditInsideTable(BlockRow blockRow, int i, int i2, int i3, int i4, String[] strArr) {
        final RichTableCell richTableCell;
        TableModel model;
        int max;
        int length;
        View findViewByItemObject = findViewByItemObject(blockRow);
        if ((findViewByItemObject instanceof RichTableCell) && (model = (richTableCell = (RichTableCell) findViewByItemObject).getModel()) != null) {
            int size = model.anchors().size();
            if (i < 0 || i >= size || i3 < 0 || i3 >= size) {
                return;
            }
            RichEditorHistory richEditorHistory = this.history;
            if (richEditorHistory != null) {
                richEditorHistory.flush();
            }
            if (i > i3 || (i == i3 && i2 > i4)) {
                i3 = i;
                i = i3;
                i4 = i2;
                i2 = i4;
            }
            StringBuilder sb = new StringBuilder();
            for (int i5 = 0; i5 < strArr.length; i5++) {
                if (i5 > 0) {
                    sb.append('\n');
                }
                sb.append(strArr[i5]);
            }
            String sb2 = sb.toString();
            final TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) model.anchors().get(i);
            TL_iv.pageTableCell pagetablecell2 = (TL_iv.pageTableCell) model.anchors().get(i3);
            if (i == i3) {
                String readPlainText = TableModel.readPlainText(pagetablecell);
                max = Math.max(0, Math.min(i2, readPlainText.length()));
                String str = readPlainText.substring(0, max) + sb2 + readPlainText.substring(Math.max(0, Math.min(i4, readPlainText.length())));
                TableModel.applyPlainText(pagetablecell, str);
                RichTableCellHost hostForAnchor = richTableCell.getGrid().hostForAnchor(pagetablecell);
                if (hostForAnchor != null) {
                    hostForAnchor.editText.setTextSilently(str);
                }
                length = sb2.length();
            } else {
                String readPlainText2 = TableModel.readPlainText(pagetablecell);
                max = Math.max(0, Math.min(i2, readPlainText2.length()));
                String str2 = readPlainText2.substring(0, max) + sb2;
                TableModel.applyPlainText(pagetablecell, str2);
                RichTableCellHost hostForAnchor2 = richTableCell.getGrid().hostForAnchor(pagetablecell);
                if (hostForAnchor2 != null) {
                    hostForAnchor2.editText.setTextSilently(str2);
                }
                while (true) {
                    i++;
                    if (i >= i3) {
                        break;
                    }
                    TL_iv.pageTableCell pagetablecell3 = (TL_iv.pageTableCell) model.anchors().get(i);
                    TableModel.applyPlainText(pagetablecell3, "");
                    RichTableCellHost hostForAnchor3 = richTableCell.getGrid().hostForAnchor(pagetablecell3);
                    if (hostForAnchor3 != null) {
                        hostForAnchor3.editText.setTextSilently("");
                    }
                }
                String readPlainText3 = TableModel.readPlainText(pagetablecell2);
                String substring = readPlainText3.substring(Math.max(0, Math.min(i4, readPlainText3.length())));
                TableModel.applyPlainText(pagetablecell2, substring);
                RichTableCellHost hostForAnchor4 = richTableCell.getGrid().hostForAnchor(pagetablecell2);
                if (hostForAnchor4 != null) {
                    hostForAnchor4.editText.setTextSilently(substring);
                }
                length = sb2.length();
            }
            final int i6 = max + length;
            this.textSelectionHelper.clear();
            RichEditorHistory richEditorHistory2 = this.history;
            if (richEditorHistory2 != null) {
                richEditorHistory2.record();
            }
            post(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda50
                @Override // java.lang.Runnable
                public final void run() {
                    RichEditorListView.lambda$applyEditInsideTable$62(RichTableCell.this, pagetablecell, i6);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$applyEditInsideTable$62(RichTableCell richTableCell, TL_iv.pageTableCell pagetablecell, int i) {
        RichTableCellHost hostForAnchor = richTableCell.getGrid().hostForAnchor(pagetablecell);
        if (hostForAnchor == null) {
            return;
        }
        hostForAnchor.editText.requestEditFocus();
        hostForAnchor.editText.setSelection(Math.max(0, Math.min(i, hostForAnchor.editText.length())));
    }
}
