package org.telegram.ui.iv;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
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
import android.view.ViewTreeObserver;
import android.webkit.MimeTypeMap;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Map;
import j$.util.Objects;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
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
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.FloatingToolbar;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.TextSelectionHelper;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.ReplyMessageLine;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.iv.RichAudioCell;
import org.telegram.ui.iv.RichDetailsCell;
import org.telegram.ui.iv.RichDetailsEndCell;
import org.telegram.ui.iv.RichDividerCell;
import org.telegram.ui.iv.RichDocumentCell;
import org.telegram.ui.iv.RichEditor;
import org.telegram.ui.iv.RichEditorHistory;
import org.telegram.ui.iv.RichEditorListView;
import org.telegram.ui.iv.RichMapCell;
import org.telegram.ui.iv.RichMathCell;
import org.telegram.ui.iv.RichMediaCell;
import org.telegram.ui.iv.RichMediaConverter;
import org.telegram.ui.iv.RichMediaUploader;
import org.telegram.ui.iv.RichQuoteAuthorCell;
import org.telegram.ui.iv.RichTableCell;
import org.telegram.ui.iv.RichTextCell;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes5.dex */
public class RichEditorListView extends UniversalRecyclerView {
    private static final ArrayList EMPTY_QUOTE_IDS = new ArrayList();
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
    private final RichDocumentCell.Delegate documentDelegate;
    private int dotSelectedCol;
    private int dotSelectedRow;
    private boolean draggingOverTrash;
    private BlockRow draggingRow;
    private int emojiPadding;
    private MessageObject fileRefParentObject;
    private RichEditText focusedEditText;
    RichEditorHistory history;
    private final RichEditorHistory.Delegate historyDelegate;
    private final ViewTreeObserver.OnGlobalFocusChangeListener imeFocusListener;
    private int imeInset;
    private ArrayList initialSelectionRows;
    final ArrayList itemRows;
    private int lastExternalImageId;
    private int lastListHeight;
    private long lastTapDownTime;
    private float lastTapDownX;
    private float lastTapDownY;
    TL_iv.RichMessage loadedRichMessage;
    private boolean longPressConsumed;
    private Runnable longPressRunnable;
    private final RichMapCell.Delegate mapDelegate;
    private final RichMathCell.Delegate mathDelegate;
    private final RichMediaCell.Delegate mediaDelegate;
    BlockRow pendingInsertRow;
    BlockRow pendingMediaRow;
    private boolean pendingTapDismiss;
    private float pendingTapRawX;
    private float pendingTapRawY;
    private boolean pressMoved;
    private View pressTarget;
    private float pressX;
    private float pressY;
    private final RichQuoteAuthorCell.Delegate quoteAuthorDelegate;
    final HashMap quoteAuthors;
    private ReplyMessageLine quoteLine;
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

    public interface SelectionEdit {
        TL_iv.RichMessage extractRichMessage();

        void replaceWith(TL_iv.RichMessage richMessage);
    }

    private static int clearMaskFor(int i) {
        if (i == 4) {
            return 114971;
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

    public void setFileRefParentObject(MessageObject messageObject) {
        this.fileRefParentObject = messageObject;
    }

    private RichEditorListView(Context context, int i, Theme.ResourcesProvider resourcesProvider, final Delegate delegate, final RichEditorListView[] richEditorListViewArr) {
        super(context, i, 0, false, new Utilities.Callback2() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda31
            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                RichEditorListView.lambda$new$0(richEditorListViewArr, (ArrayList) obj, (UniversalAdapter) obj2);
            }
        }, new Utilities.Callback5() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda32
            @Override // org.telegram.messenger.Utilities.Callback5
            public final void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                RichEditorListView.lambda$new$1(richEditorListViewArr, (UItem) obj, (View) obj2, (Integer) obj3, (Float) obj4, (Float) obj5);
            }
        }, null, resourcesProvider);
        this.rows = new ArrayList();
        this.quoteAuthors = new HashMap();
        this.restoreFocusCell = -1;
        this.restoreFocusOffset = -1;
        this.restoreFocusChildPosition = 0;
        this.imeFocusListener = new ViewTreeObserver.OnGlobalFocusChangeListener() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda33
            @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
            public final void onGlobalFocusChanged(View view, View view2) {
                RichEditorListView.this.lambda$new$2(view, view2);
            }
        };
        this.allowTapAboveContent = true;
        this.dividerDelegate = new RichDividerCell.Delegate() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda34
            @Override // org.telegram.ui.iv.RichDividerCell.Delegate
            public final TextSelectionHelper.ArticleTextSelectionHelper getSelectionHelper() {
                return RichEditorListView.this.getTextSelectionHelper();
            }
        };
        this.mediaDelegate = new RichMediaCell.Delegate() { // from class: org.telegram.ui.iv.RichEditorListView.5
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
            public void onToggleSpoiler(BlockRow blockRow, MediaUploadState mediaUploadState) {
                RichEditorListView.this.toggleMediaSpoiler(blockRow, mediaUploadState);
            }

            @Override // org.telegram.ui.iv.RichMediaCell.Delegate
            public ItemOptions makeMenu(View view) {
                return RichEditorListView.this.delegate.makeMenu(view);
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
        this.audioDelegate = new RichAudioCell.Delegate() { // from class: org.telegram.ui.iv.RichEditorListView.6
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
        this.documentDelegate = new RichDocumentCell.Delegate() { // from class: org.telegram.ui.iv.RichEditorListView.7
            @Override // org.telegram.ui.iv.RichDocumentCell.Delegate
            public void onRequestWindowFocusable(RichEditText richEditText, boolean z) {
                RichEditorListView.this.delegate.makeEditTextFocusable(richEditText, z);
            }

            @Override // org.telegram.ui.iv.RichDocumentCell.Delegate
            public void onCancelUpload(BlockRow blockRow) {
                RichEditorListView.this.cancelDocumentUpload(blockRow);
            }

            @Override // org.telegram.ui.iv.RichDocumentCell.Delegate
            public TextSelectionHelper.ArticleTextSelectionHelper getSelectionHelper() {
                return RichEditorListView.this.getTextSelectionHelper();
            }

            @Override // org.telegram.ui.iv.RichDocumentCell.Delegate
            public MessageObject getFileRefParentObject() {
                return RichEditorListView.this.fileRefParentObject;
            }

            @Override // org.telegram.ui.iv.RichDocumentCell.Delegate
            public void onCaptionWillChange(BlockRow blockRow, int i2, int i3) {
                RichEditorHistory richEditorHistory = RichEditorListView.this.history;
                if (richEditorHistory != null) {
                    richEditorHistory.onBeforeChange(i2, i3);
                }
            }

            @Override // org.telegram.ui.iv.RichDocumentCell.Delegate
            public void onCaptionChanged(BlockRow blockRow) {
                RichEditorHistory richEditorHistory = RichEditorListView.this.history;
                if (richEditorHistory != null) {
                    richEditorHistory.onTyping();
                }
                RichEditorListView.this.delegate.onContentChanged();
            }

            @Override // org.telegram.ui.iv.RichDocumentCell.Delegate
            public void onCaptionSpansChanged(BlockRow blockRow) {
                RichEditorListView.this.onCellSpansChanged();
            }

            @Override // org.telegram.ui.iv.RichDocumentCell.Delegate
            public void onCaptionEnter(BlockRow blockRow) {
                RichEditorListView.this.onCaptionEnter(blockRow);
            }

            @Override // org.telegram.ui.iv.RichDocumentCell.Delegate
            public void onCaptionLockedInsert(CharSequence charSequence) {
                if (charSequence == null || charSequence.length() <= 0) {
                    return;
                }
                RichEditorListView.this.replaceHelperSelectionWith(charSequence.toString());
            }

            @Override // org.telegram.ui.iv.RichDocumentCell.Delegate
            public boolean onCaptionSelectAll(BlockRow blockRow) {
                return RichEditorListView.this.tryEscalateSelectAll();
            }
        };
        this.uploaders = new IdentityHashMap();
        this.converters = new IdentityHashMap();
        this.mapDelegate = new RichMapCell.Delegate() { // from class: org.telegram.ui.iv.RichEditorListView.8
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
        this.mathDelegate = new RichMathCell.Delegate() { // from class: org.telegram.ui.iv.RichEditorListView.9
            @Override // org.telegram.ui.iv.RichMathCell.Delegate
            public TextSelectionHelper.ArticleTextSelectionHelper getSelectionHelper() {
                return RichEditorListView.this.getTextSelectionHelper();
            }
        };
        this.quoteAuthorDelegate = new RichQuoteAuthorCell.Delegate() { // from class: org.telegram.ui.iv.RichEditorListView.10
            @Override // org.telegram.ui.iv.RichQuoteAuthorCell.Delegate
            public TL_iv.RichText getQuoteAuthor(long j) {
                return (TL_iv.RichText) RichEditorListView.this.quoteAuthors.get(Long.valueOf(j));
            }

            @Override // org.telegram.ui.iv.RichQuoteAuthorCell.Delegate
            public void setQuoteAuthor(long j, TL_iv.RichText richText) {
                if (richText == null || (richText instanceof TL_iv.textEmpty)) {
                    RichEditorListView.this.quoteAuthors.remove(Long.valueOf(j));
                } else {
                    RichEditorListView.this.quoteAuthors.put(Long.valueOf(j), richText);
                }
            }

            @Override // org.telegram.ui.iv.RichQuoteAuthorCell.Delegate
            public TextSelectionHelper.ArticleTextSelectionHelper getSelectionHelper() {
                return RichEditorListView.this.getTextSelectionHelper();
            }

            @Override // org.telegram.ui.iv.RichQuoteAuthorCell.Delegate
            public void onQuoteAuthorEnter(BlockRow blockRow) {
                RichEditorListView.this.insertParagraphAfterQuote(blockRow);
            }
        };
        this.tableDelegate = new RichTableCell.Delegate() { // from class: org.telegram.ui.iv.RichEditorListView.11
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
        this.detailsDelegate = new RichDetailsCell.Delegate() { // from class: org.telegram.ui.iv.RichEditorListView.12
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
        this.cellSelectionListener = new RichTableCell.CellSelectionListener() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda35
            @Override // org.telegram.ui.iv.RichTableCell.CellSelectionListener
            public final void onCellSelectionChanged(RichTableCell richTableCell) {
                RichEditorListView.this.lambda$new$20(richTableCell);
            }
        };
        this.cellDelegate = new RichTextCell.Delegate() { // from class: org.telegram.ui.iv.RichEditorListView.13
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
                if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                    RichEditorListView.this.applyQuote(blockRow);
                } else {
                    RichEditorListView.this.transformRow(blockRow, pageBlock, i2, i3, z, z2);
                }
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
            public int getListPaddingTop(BlockRow blockRow) {
                int indexOf = RichEditorListView.this.rows.indexOf(blockRow);
                return AndroidUtilities.dp((indexOf <= 0 || ((BlockRow) RichEditorListView.this.rows.get(indexOf + (-1))).level <= 0) ? 8.0f : 2.0f);
            }

            @Override // org.telegram.ui.iv.RichTextCell.Delegate
            public int getListPaddingBottom(BlockRow blockRow) {
                int i2;
                int indexOf = RichEditorListView.this.rows.indexOf(blockRow);
                return AndroidUtilities.dp((indexOf < 0 || (i2 = indexOf + 1) >= RichEditorListView.this.rows.size() || ((BlockRow) RichEditorListView.this.rows.get(i2)).level <= 0) ? 11.0f : 5.0f);
            }

            @Override // org.telegram.ui.iv.RichTextCell.Delegate
            public int getOrderedListMarkerWidth(BlockRow blockRow, Paint paint) {
                int i2;
                BlockRow blockRow2;
                int i3;
                int indexOf = RichEditorListView.this.rows.indexOf(blockRow);
                if (indexOf < 0 || (i2 = blockRow.level) <= 0 || blockRow.num <= 0) {
                    return RichTextCell.Delegate.-CC.$default$getOrderedListMarkerWidth(this, blockRow, paint);
                }
                int i4 = indexOf;
                while (i4 > 0) {
                    BlockRow blockRow3 = (BlockRow) RichEditorListView.this.rows.get(i4 - 1);
                    int i5 = blockRow3.level;
                    if (i5 < i2 || (i5 == i2 && blockRow3.num <= 0)) {
                        break;
                    }
                    i4--;
                }
                while (true) {
                    indexOf++;
                    if (indexOf >= RichEditorListView.this.rows.size() || (i3 = (blockRow2 = (BlockRow) RichEditorListView.this.rows.get(indexOf)).level) < i2 || (i3 == i2 && blockRow2.num <= 0)) {
                        break;
                    }
                }
                Paint paint2 = new Paint(paint);
                paint2.setTypeface(AndroidUtilities.bold());
                float f = 0.0f;
                while (i4 < indexOf) {
                    BlockRow blockRow4 = (BlockRow) RichEditorListView.this.rows.get(i4);
                    if (blockRow4.level == i2 && blockRow4.num > 0) {
                        f = Math.max(f, paint2.measureText(blockRow4.num + "."));
                    }
                    i4++;
                }
                return Math.max(AndroidUtilities.dp(28.0f), ((int) Math.ceil(f)) + AndroidUtilities.dp(10.0f));
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
        RichEditorHistory.Delegate delegate2 = new RichEditorHistory.Delegate() { // from class: org.telegram.ui.iv.RichEditorListView.14
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
        listenReorder(new Utilities.Callback2() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda36
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
            protected boolean forceShowSelectAll() {
                return !RichEditorListView.this.isWholeDocumentSelected();
            }

            @Override // org.telegram.ui.Cells.TextSelectionHelper
            protected boolean onSelectAllOverride() {
                if (expandSelectionToWholeCurrentBlock()) {
                    return true;
                }
                return RichEditorListView.this.tryEscalateSelectAll();
            }

            @Override // org.telegram.ui.Cells.TextSelectionHelper
            public int getParentTopPadding() {
                return RichEditorListView.this.getPaddingTop();
            }

            @Override // org.telegram.ui.Cells.TextSelectionHelper
            public int getParentBottomPadding() {
                return RichEditorListView.this.getPaddingBottom();
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

            @Override // org.telegram.ui.Cells.TextSelectionHelper
            protected void onTapToDismiss(float f, float f2) {
                RichEditorListView.this.pendingTapDismiss = true;
                RichEditorListView.this.pendingTapRawX = f;
                RichEditorListView.this.pendingTapRawY = f2;
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
                RichEditorListView.this.hideKeyboardIfFocusScrolledAway();
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
                boolean z2 = RichEditorListView.this.pendingTapDismiss;
                final float f = RichEditorListView.this.pendingTapRawX;
                final float f2 = RichEditorListView.this.pendingTapRawY;
                RichEditorListView.this.pendingTapDismiss = false;
                RichEditorListView.this.setEditTextsLocked(false);
                RichEditorListView.this.finishEditTextActionModes();
                if (z2) {
                    RichEditorListView.this.post(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$2$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            RichEditorListView.2.this.lambda$onStateChanged$0(f, f2, i, i3, i2);
                        }
                    });
                    return;
                }
                if (i >= 0) {
                    RichEditorListView.this.post(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$2$$ExternalSyntheticLambda1
                        @Override // java.lang.Runnable
                        public final void run() {
                            RichEditorListView.2.this.lambda$onStateChanged$1(i, i3, i2);
                        }
                    });
                    return;
                }
                View findFocus = RichEditorListView.this.findFocus();
                if (findFocus instanceof RichEditText) {
                    RichEditorListView richEditorListView = RichEditorListView.this;
                    final RichEditText richEditText = (RichEditText) findFocus;
                    Objects.requireNonNull(richEditText);
                    richEditorListView.post(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$2$$ExternalSyntheticLambda2
                        @Override // java.lang.Runnable
                        public final void run() {
                            RichEditText.this.requestEditFocusRebuild();
                        }
                    });
                    return;
                }
                return;
            }
            RichEditorListView richEditorListView2 = RichEditorListView.this;
            richEditorListView2.restoreFocusCell = richEditorListView2.textSelectionHelper.getAnchorCell();
            RichEditorListView richEditorListView3 = RichEditorListView.this;
            richEditorListView3.restoreFocusOffset = richEditorListView3.textSelectionHelper.getAnchorOffset();
            RichEditorListView richEditorListView4 = RichEditorListView.this;
            richEditorListView4.restoreFocusChildPosition = richEditorListView4.textSelectionHelper.getAnchorChildPosition();
            RichEditorListView.this.setEditTextsLocked(true);
            RichEditorListView.this.hideEditTextActionModes();
            RichEditorListView.this.finishEditTextActionModes();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onStateChanged$0(float f, float f2, int i, int i2, int i3) {
            if (RichEditorListView.this.restoreFocusAtScreenPoint(f, f2) || i < 0) {
                return;
            }
            RichEditorListView.this.restoreFocusAt(i, i2, i3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onStateChanged$1(int i, int i2, int i3) {
            RichEditorListView.this.restoreFocusAt(i, i2, i3);
        }
    }

    private boolean isInList(View view) {
        return (view == null || findContainingItemView(view) == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$2(View view, View view2) {
        doNotDetachViews(isInList(view2));
        if (view2 instanceof RichEditText) {
            this.focusedEditText = (RichEditText) view2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hideKeyboardIfFocusScrolledAway() {
        View findContainingItemView;
        RichEditText richEditText = this.focusedEditText;
        if (richEditText == null || (findContainingItemView = findContainingItemView(richEditText)) == null) {
            return;
        }
        if (findContainingItemView.getBottom() <= 0 || findContainingItemView.getTop() >= getHeight()) {
            this.focusedEditText = null;
            richEditText.clearFocus();
            AndroidUtilities.hideKeyboard(this);
        }
    }

    @Override // org.telegram.ui.Components.RecyclerListView, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        final int bottom;
        int i5 = i4 - i2;
        int i6 = this.lastListHeight;
        boolean z2 = i6 > 0 && i5 < i6;
        super.onLayout(z, i, i2, i3, i4);
        if (z2) {
            View findFocus = findFocus();
            View findContainingItemView = findFocus == null ? null : findContainingItemView(findFocus);
            if (findContainingItemView != null && (bottom = (findContainingItemView.getBottom() + AndroidUtilities.dp(8.0f)) - (i5 - getPaddingBottom())) > 0) {
                post(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda5
                    @Override // java.lang.Runnable
                    public final void run() {
                        RichEditorListView.this.lambda$onLayout$3(bottom);
                    }
                });
            }
        }
        this.lastListHeight = i5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onLayout$3(int i) {
        scrollBy(0, i);
    }

    @Override // org.telegram.ui.Components.RecyclerListView, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnGlobalFocusChangeListener(this.imeFocusListener);
    }

    @Override // org.telegram.ui.Components.RecyclerListView, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalFocusChangeListener(this.imeFocusListener);
        doNotDetachViews(false);
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
        this.pendingInsertRow = null;
        this.history = new RichEditorHistory(this.historyDelegate);
        seedEmptyArticle();
        this.history.resetBaseline();
        Delegate delegate = this.delegate;
        if (delegate != null) {
            delegate.onHistoryChanged();
        }
    }

    public void resetHistoryBaseline() {
        RichEditorHistory richEditorHistory = this.history;
        if (richEditorHistory != null) {
            richEditorHistory.resetBaseline();
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

    public void setInitialText(CharSequence charSequence) {
        if (charSequence == null) {
            return;
        }
        this.initialSelectionRows = new ArrayList();
        flattenBlocks(this.rows, RichMessageConvert.blocksFromCharSequence(charSequence), this.quoteAuthors);
        for (int size = this.rows.size(); size < this.rows.size(); size++) {
            this.initialSelectionRows.add((BlockRow) this.rows.get(size));
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
        if (lambda$applyInitialSelection$4(i, i2)) {
            return;
        }
        post(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                RichEditorListView.this.lambda$applyInitialSelection$4(i, i2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: applyInitialSelectionInternal, reason: merged with bridge method [inline-methods] */
    public boolean lambda$applyInitialSelection$4(int i, int i2) {
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
        flattenBlocks(this.rows, richMessage.blocks, this.quoteAuthors);
        normalizeNestedQuotes();
        for (int i = 0; i < this.rows.size(); i++) {
            resolveLoadedMedia((BlockRow) this.rows.get(i));
        }
        this.adapter.update(false);
    }

    public void loadHtml(CharSequence charSequence, String str, CharSequence charSequence2) {
        if (str == null) {
            return;
        }
        if (!TextUtils.isEmpty(charSequence)) {
            flattenBlocks(this.rows, RichMessageConvert.blocksFromCharSequence(charSequence), this.quoteAuthors);
        }
        List resolvePastedMedia = resolvePastedMedia(RichHtml.parse(str, this.quoteAuthors));
        if (resolvePastedMedia != null) {
            this.rows.addAll(resolvePastedMedia);
        }
        if (!TextUtils.isEmpty(charSequence2)) {
            flattenBlocks(this.rows, RichMessageConvert.blocksFromCharSequence(charSequence2), this.quoteAuthors);
        }
        normalizeNestedQuotes();
        this.adapter.update(false);
    }

    public boolean isSimpleConvertible() {
        return hasAnyText() && !RichMessageConvert.isLossy(this.rows, this.quoteAuthors);
    }

    public boolean isLossy() {
        return RichMessageConvert.isLossy(this.rows, this.quoteAuthors);
    }

    public CharSequence toSimpleMessage() {
        return RichMessageConvert.rowsToCharSequence(this.rows);
    }

    public void convertToSimple() {
        RichEditorHistory richEditorHistory = this.history;
        if (richEditorHistory != null) {
            richEditorHistory.record();
        }
        CharSequence rowsToSimpleMessage = RichMessageConvert.rowsToSimpleMessage(this.rows);
        destroy();
        this.rows.clear();
        this.quoteAuthors.clear();
        this.loadedRichMessage = null;
        flattenBlocks(this.rows, RichMessageConvert.blocksFromCharSequence(rowsToSimpleMessage), this.quoteAuthors);
        this.adapter.update(false);
        RichEditorHistory richEditorHistory2 = this.history;
        if (richEditorHistory2 != null) {
            richEditorHistory2.record();
        }
        Delegate delegate = this.delegate;
        if (delegate != null) {
            delegate.onContentChanged();
            this.delegate.onHistoryChanged();
        }
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
        flattenBlocks(arrayList4, richMessage.blocks, this.quoteAuthors);
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
        normalizeNestedQuotes();
        renumberAllRuns();
        this.adapter.update(false);
        RichEditorHistory richEditorHistory2 = this.history;
        if (richEditorHistory2 != null) {
            richEditorHistory2.record();
        }
        Delegate delegate = this.delegate;
        if (delegate != null) {
            delegate.onContentChanged();
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
        return RichMediaClipboard.document(j);
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
        return RichMediaClipboard.photo(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resolveLoadedMedia(BlockRow blockRow) {
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
        if (pageBlock instanceof TL_iv.pageBlockDocument) {
            TLRPC.Document findLoadedDocument2 = findLoadedDocument(((TL_iv.pageBlockDocument) pageBlock).document_id);
            if (findLoadedDocument2 == null) {
                return null;
            }
            MediaUploadState mediaUploadState2 = new MediaUploadState();
            mediaUploadState2.isDocument = true;
            mediaUploadState2.state = 2;
            mediaUploadState2.document = findLoadedDocument2;
            return mediaUploadState2;
        }
        if (pageBlock instanceof TL_iv.pageBlockVideo) {
            TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
            TLRPC.Document findLoadedDocument3 = findLoadedDocument(pageblockvideo.video_id);
            if (findLoadedDocument3 == null) {
                return null;
            }
            MediaUploadState mediaUploadState3 = new MediaUploadState();
            mediaUploadState3.isVideo = true;
            mediaUploadState3.state = 2;
            mediaUploadState3.document = findLoadedDocument3;
            mediaUploadState3.hasSpoiler = pageblockvideo.spoiler;
            int i = 0;
            while (true) {
                if (i >= findLoadedDocument3.attributes.size()) {
                    break;
                }
                if (findLoadedDocument3.attributes.get(i) instanceof TLRPC.TL_documentAttributeVideo) {
                    TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) findLoadedDocument3.attributes.get(i);
                    mediaUploadState3.width = tL_documentAttributeVideo.w;
                    mediaUploadState3.height = tL_documentAttributeVideo.h;
                    mediaUploadState3.duration = (int) tL_documentAttributeVideo.duration;
                    break;
                }
                i++;
            }
            return mediaUploadState3;
        }
        if (!(pageBlock instanceof TL_iv.pageBlockPhoto)) {
            return null;
        }
        TL_iv.pageBlockPhoto pageblockphoto = (TL_iv.pageBlockPhoto) pageBlock;
        TLRPC.Photo findLoadedPhoto = findLoadedPhoto(pageblockphoto.photo_id);
        if (findLoadedPhoto == null) {
            return null;
        }
        MediaUploadState mediaUploadState4 = new MediaUploadState();
        mediaUploadState4.state = 2;
        mediaUploadState4.photo = findLoadedPhoto;
        mediaUploadState4.hasSpoiler = pageblockphoto.spoiler;
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(findLoadedPhoto.sizes, AndroidUtilities.getPhotoSize());
        if (closestPhotoSizeWithSize != null) {
            mediaUploadState4.width = closestPhotoSizeWithSize.w;
            mediaUploadState4.height = closestPhotoSizeWithSize.h;
        }
        return mediaUploadState4;
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
                if ((pageBlock2 instanceof TL_iv.pageBlockPhoto) || (pageBlock2 instanceof TL_iv.pageBlockVideo) || (pageBlock2 instanceof TL_iv.pageBlockAudio) || (pageBlock2 instanceof TL_iv.pageBlockDocument)) {
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
        flattenBlocks(arrayList, arrayList2, null);
    }

    static void flattenBlocks(ArrayList arrayList, ArrayList arrayList2, Map map) {
        if (arrayList2 == null) {
            return;
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) it.next();
            if ((pageBlock instanceof TL_iv.pageBlockList) || (pageBlock instanceof TL_iv.pageBlockOrderedList)) {
                expandListBlock(arrayList, pageBlock, 1);
            } else if (pageBlock instanceof TL_iv.pageBlockDetails) {
                flattenDetails(arrayList, (TL_iv.pageBlockDetails) pageBlock, map);
            } else if (pageBlock instanceof TL_iv.pageBlockBlockquoteBlocks) {
                expandBlockquoteBlocks(arrayList, (TL_iv.pageBlockBlockquoteBlocks) pageBlock, map);
            } else {
                arrayList.add(new BlockRow(pageBlock));
            }
        }
    }

    static void expandBlockquoteBlocks(ArrayList arrayList, TL_iv.pageBlockBlockquoteBlocks pageblockblockquoteblocks, Map map) {
        TL_iv.RichText richText;
        long newId = RichContainer.newId();
        flattenBlocks(arrayList, pageblockblockquoteblocks.blocks, map);
        for (int size = arrayList.size(); size < arrayList.size(); size++) {
            ((BlockRow) arrayList.get(size)).quoteIds.add(0, Long.valueOf(newId));
        }
        if (map == null || (richText = pageblockblockquoteblocks.caption) == null || (richText instanceof TL_iv.textEmpty)) {
            return;
        }
        map.put(Long.valueOf(newId), pageblockblockquoteblocks.caption);
    }

    public static ArrayList flattenForCopy(TL_iv.RichMessage richMessage, Map map) {
        ArrayList arrayList = new ArrayList();
        if (richMessage != null) {
            flattenBlocks(arrayList, richMessage.blocks, map);
        }
        return arrayList;
    }

    private static void flattenDetails(ArrayList arrayList, TL_iv.pageBlockDetails pageblockdetails, Map map) {
        if (pageblockdetails.title == null) {
            pageblockdetails.title = new TL_iv.textEmpty();
        }
        arrayList.add(new BlockRow(pageblockdetails));
        int size = arrayList.size();
        flattenBlocks(arrayList, pageblockdetails.blocks, map);
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
        if (pageBlock instanceof TL_iv.pageBlockOrderedList) {
            Iterator<TL_iv.PageListOrderedItem> it = ((TL_iv.pageBlockOrderedList) pageBlock).items.iterator();
            int i2 = 1;
            while (it.hasNext()) {
                TL_iv.PageListOrderedItem next = it.next();
                if (next instanceof TL_iv.TL_pageListOrderedItemText) {
                    addListItemRow(arrayList, ((TL_iv.TL_pageListOrderedItemText) next).text, i, i2, next.checkbox, next.checked);
                } else if (next instanceof TL_iv.TL_pageListOrderedItemBlocks) {
                    expandItemBlocks(arrayList, ((TL_iv.TL_pageListOrderedItemBlocks) next).blocks, i, true, i2, next.checkbox, next.checked);
                }
                i2++;
            }
            return;
        }
        Iterator<TL_iv.PageListItem> it2 = ((TL_iv.pageBlockList) pageBlock).items.iterator();
        while (it2.hasNext()) {
            TL_iv.PageListItem next2 = it2.next();
            if (next2 instanceof TL_iv.TL_pageListItemText) {
                addListItemRow(arrayList, ((TL_iv.TL_pageListItemText) next2).text, i, 0, next2.checkbox, next2.checked);
            } else if (next2 instanceof TL_iv.TL_pageListItemBlocks) {
                expandItemBlocks(arrayList, ((TL_iv.TL_pageListItemBlocks) next2).blocks, i, false, 0, next2.checkbox, next2.checked);
            }
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

    private static void expandItemBlocks(ArrayList arrayList, ArrayList arrayList2, int i, boolean z, int i2, boolean z2, boolean z3) {
        boolean z4 = false;
        if (arrayList2 != null) {
            for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList2.get(i3);
                if ((pageBlock instanceof TL_iv.pageBlockList) || (pageBlock instanceof TL_iv.pageBlockOrderedList)) {
                    if (!z4) {
                        addListItemRow(arrayList, null, i, i2, z2, z3);
                        z4 = true;
                    }
                    expandListBlock(arrayList, pageBlock, i + 1);
                } else if (!z4) {
                    if (pageBlock instanceof TL_iv.pageBlockParagraph) {
                        addListItemRow(arrayList, ((TL_iv.pageBlockParagraph) pageBlock).text, i, i2, z2, z3);
                    } else {
                        BlockRow blockRow = new BlockRow(pageBlock, i, i2);
                        blockRow.checkbox = z2;
                        blockRow.checked = z3;
                        arrayList.add(blockRow);
                    }
                    z4 = true;
                } else {
                    arrayList.add(new BlockRow(pageBlock, i, z ? 1 : 0));
                }
            }
        }
        if (z4) {
            return;
        }
        addListItemRow(arrayList, null, i, i2, z2, z3);
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
        if (isDetailsSelection()) {
            onFormattingClickedDetails(i);
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
        post(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda27
            @Override // java.lang.Runnable
            public final void run() {
                RichEditorListView.this.lambda$refreshSelectionHighlight$5();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$refreshSelectionHighlight$5() {
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
        if (isDetailsSelection()) {
            onLinkClickedDetails();
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
        if (isDetailsSelection()) {
            onDateClickedDetails();
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
            runnable = new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    RichEditorListView.this.lambda$onMathClicked$6(startCell, startChildPosition);
                }
            };
        } else if (isDetailsSelection()) {
            final int startCell2 = this.textSelectionHelper.getStartCell();
            editText = detailsEditText(startCell2);
            runnable = new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda7
                @Override // java.lang.Runnable
                public final void run() {
                    RichEditorListView.this.lambda$onMathClicked$7(startCell2);
                }
            };
        } else if (isCaptionSelection()) {
            final int startCell3 = this.textSelectionHelper.getStartCell();
            editText = captionEditText(startCell3);
            runnable = new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda8
                @Override // java.lang.Runnable
                public final void run() {
                    RichEditorListView.this.lambda$onMathClicked$8(startCell3);
                }
            };
        } else if (isQuoteAuthorSelection()) {
            final int startCell4 = this.textSelectionHelper.getStartCell();
            editText = quoteAuthorEditText(startCell4);
            runnable = new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda9
                @Override // java.lang.Runnable
                public final void run() {
                    RichEditorListView.this.lambda$onMathClicked$9(startCell4);
                }
            };
        } else {
            final RichTextCell singleSelectionCell = singleSelectionCell();
            if (singleSelectionCell == null) {
                return;
            }
            editText = singleSelectionCell.getEditText();
            runnable = new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda10
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
        ChatAttachAlertRichLayout.showEditLatexSheet(getContext(), sourceAt, new Utilities.Callback() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda62
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                RichEditorListView.this.lambda$insertInlineMath$11(color, dp, richEditText, i, i2, runnable, (String) obj);
            }
        }, this.resourcesProvider);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$insertInlineMath$11(int i, float f, final RichEditText richEditText, int i2, int i3, Runnable runnable, String str) {
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
        post(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda70
            @Override // java.lang.Runnable
            public final void run() {
                RichEditorListView.lambda$insertInlineMath$10(RichEditText.this, min);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$insertInlineMath$10(RichEditText richEditText, int i) {
        richEditText.requestEditFocus();
        richEditText.setSelection(Math.min(i, richEditText.length()));
    }

    public SelectionEdit beginSelectionEdit() {
        int i;
        int i2;
        TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper = this.textSelectionHelper;
        if (articleTextSelectionHelper == null || !articleTextSelectionHelper.isInSelectionMode() || isQuoteAuthorSelection()) {
            return null;
        }
        int indexOf = this.rows.indexOf(rowForCell(this.textSelectionHelper.getStartCell()));
        int indexOf2 = this.rows.indexOf(rowForCell(this.textSelectionHelper.getEndCell()));
        if (indexOf >= 0 && indexOf2 >= 0) {
            if (indexOf > indexOf2) {
                i2 = indexOf;
                i = indexOf2;
            } else {
                i = indexOf;
                i2 = indexOf2;
            }
            for (int i3 = i; i3 <= i2; i3++) {
                BlockRow blockRow = (BlockRow) this.rows.get(i3);
                if (blockRow.detailsEnd || isDetailsHeader(blockRow)) {
                    return null;
                }
            }
            return new 4(i, i2, this.textSelectionHelper.getStartOffset(), this.textSelectionHelper.getEndOffset());
        }
        return null;
    }

    class 4 implements SelectionEdit {
        final /* synthetic */ int val$eOff;
        final /* synthetic */ int val$endRowIdx;
        final /* synthetic */ int val$sOff;
        final /* synthetic */ int val$startRowIdx;

        4(int i, int i2, int i3, int i4) {
            this.val$startRowIdx = i;
            this.val$endRowIdx = i2;
            this.val$sOff = i3;
            this.val$eOff = i4;
        }

        @Override // org.telegram.ui.iv.RichEditorListView.SelectionEdit
        public TL_iv.RichMessage extractRichMessage() {
            BlockRow blockRow = (BlockRow) RichEditorListView.this.rows.get(this.val$startRowIdx);
            BlockRow blockRow2 = (BlockRow) RichEditorListView.this.rows.get(this.val$endRowIdx);
            TL_iv.PageBlock pageBlock = blockRow.block;
            TL_iv.PageBlock pageBlock2 = blockRow2.block;
            TL_iv.PageBlock sliceClone = RichEditorListView.this.sliceClone(blockRow, this.val$sOff, this.val$startRowIdx == this.val$endRowIdx ? this.val$eOff : -1);
            TL_iv.PageBlock sliceClone2 = this.val$startRowIdx == this.val$endRowIdx ? null : RichEditorListView.this.sliceClone(blockRow2, 0, this.val$eOff);
            if (sliceClone != null) {
                blockRow.block = sliceClone;
            }
            if (sliceClone2 != null) {
                blockRow2.block = sliceClone2;
            }
            try {
                ArrayList<TL_iv.PageBlock> flattenRange = RichEditorListView.this.flattenRange(this.val$startRowIdx, this.val$endRowIdx + 1, false);
                ArrayList<TLRPC.Photo> collectMediaPhotos = RichEditorListView.this.collectMediaPhotos(this.val$startRowIdx, this.val$endRowIdx);
                ArrayList<TLRPC.Document> collectMediaDocuments = RichEditorListView.this.collectMediaDocuments(this.val$startRowIdx, this.val$endRowIdx);
                blockRow.block = pageBlock;
                blockRow2.block = pageBlock2;
                TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
                richMessage.blocks = flattenRange;
                richMessage.photos = collectMediaPhotos;
                richMessage.documents = collectMediaDocuments;
                return richMessage;
            } catch (Throwable th) {
                blockRow.block = pageBlock;
                blockRow2.block = pageBlock2;
                throw th;
            }
        }

        @Override // org.telegram.ui.iv.RichEditorListView.SelectionEdit
        public void replaceWith(TL_iv.RichMessage richMessage) {
            int i;
            if (richMessage != null && this.val$startRowIdx < RichEditorListView.this.rows.size() && this.val$endRowIdx < RichEditorListView.this.rows.size()) {
                RichEditorHistory richEditorHistory = RichEditorListView.this.history;
                if (richEditorHistory != null) {
                    richEditorHistory.flush();
                }
                TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper = RichEditorListView.this.textSelectionHelper;
                if (articleTextSelectionHelper != null) {
                    articleTextSelectionHelper.clear();
                }
                BlockRow blockRow = (BlockRow) RichEditorListView.this.rows.get(this.val$startRowIdx);
                BlockRow blockRow2 = (BlockRow) RichEditorListView.this.rows.get(this.val$endRowIdx);
                String styledTextOf = RichEditorListView.isFormattable(blockRow.block) ? RichEditorListView.this.styledTextOf(blockRow) : "";
                CharSequence styledTextOf2 = RichEditorListView.isFormattable(blockRow2.block) ? RichEditorListView.this.styledTextOf(blockRow2) : "";
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(styledTextOf.subSequence(0, Math.max(0, Math.min(this.val$sOff, styledTextOf.length()))));
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(styledTextOf2.subSequence(Math.max(0, Math.min(this.val$eOff, styledTextOf2.length())), styledTextOf2.length()));
                ArrayList arrayList = new ArrayList();
                RichEditorListView.flattenBlocks(arrayList, richMessage.blocks);
                if (arrayList.isEmpty()) {
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(spannableStringBuilder);
                    spannableStringBuilder3.append((CharSequence) spannableStringBuilder2);
                    TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                    RichTextCell.applyStyledTextToBlock(pageblockparagraph, spannableStringBuilder3);
                    arrayList.add(new BlockRow(pageblockparagraph, blockRow.level, blockRow.num));
                } else {
                    if (spannableStringBuilder.length() > 0) {
                        BlockRow blockRow3 = (BlockRow) arrayList.get(0);
                        if (RichEditorListView.isFormattable(blockRow3.block)) {
                            SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(spannableStringBuilder);
                            spannableStringBuilder4.append(RichTextCell.readStyledText(blockRow3.block));
                            RichTextCell.applyStyledTextToBlock(blockRow3.block, spannableStringBuilder4);
                        } else {
                            TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                            RichTextCell.applyStyledTextToBlock(pageblockparagraph2, spannableStringBuilder);
                            arrayList.add(0, new BlockRow(pageblockparagraph2, blockRow.level, blockRow.num));
                        }
                    }
                    if (spannableStringBuilder2.length() > 0) {
                        BlockRow blockRow4 = (BlockRow) arrayList.get(arrayList.size() - 1);
                        if (RichEditorListView.isFormattable(blockRow4.block)) {
                            SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(RichTextCell.readStyledText(blockRow4.block));
                            spannableStringBuilder5.append((CharSequence) spannableStringBuilder2);
                            RichTextCell.applyStyledTextToBlock(blockRow4.block, spannableStringBuilder5);
                        } else {
                            TL_iv.pageBlockParagraph pageblockparagraph3 = new TL_iv.pageBlockParagraph();
                            RichTextCell.applyStyledTextToBlock(pageblockparagraph3, spannableStringBuilder2);
                            arrayList.add(new BlockRow(pageblockparagraph3, blockRow2.level, blockRow2.num));
                        }
                    }
                }
                RichEditorListView richEditorListView = RichEditorListView.this;
                TL_iv.RichMessage richMessage2 = richEditorListView.loadedRichMessage;
                if (richMessage2 == null) {
                    richEditorListView.loadedRichMessage = richMessage;
                } else {
                    ArrayList<TLRPC.Photo> arrayList2 = richMessage.photos;
                    if (arrayList2 != null) {
                        richMessage2.photos.addAll(arrayList2);
                    }
                    ArrayList<TLRPC.Document> arrayList3 = richMessage.documents;
                    if (arrayList3 != null) {
                        RichEditorListView.this.loadedRichMessage.documents.addAll(arrayList3);
                    }
                }
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    RichEditorListView.this.resolveLoadedMedia((BlockRow) arrayList.get(i2));
                }
                int i3 = this.val$endRowIdx;
                while (true) {
                    i = this.val$startRowIdx;
                    if (i3 < i) {
                        break;
                    }
                    RichEditorListView.this.rows.remove(i3);
                    i3--;
                }
                RichEditorListView.this.rows.addAll(i, arrayList);
                RichEditorListView.this.renumberAllRuns();
                RichEditorListView.this.adapter.update(false);
                RichEditorHistory richEditorHistory2 = RichEditorListView.this.history;
                if (richEditorHistory2 != null) {
                    richEditorHistory2.record();
                }
                RichEditorListView.this.delegate.onContentChanged();
                final BlockRow blockRow5 = arrayList.isEmpty() ? null : (BlockRow) arrayList.get(arrayList.size() - 1);
                RichEditorListView.this.post(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$4$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        RichEditorListView.4.this.lambda$replaceWith$0(blockRow5);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$replaceWith$0(BlockRow blockRow) {
            View findViewByItemObject = blockRow == null ? null : RichEditorListView.this.findViewByItemObject(blockRow);
            if (findViewByItemObject instanceof RichTextCell) {
                RichTextCell richTextCell = (RichTextCell) findViewByItemObject;
                richTextCell.requestEditFocus();
                richTextCell.getEditText().setSelection(richTextCell.getEditText().length());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public CharSequence styledTextOf(BlockRow blockRow) {
        View findViewByItemObject = findViewByItemObject(blockRow);
        return findViewByItemObject instanceof RichTextCell ? ((RichTextCell) findViewByItemObject).getEditText().getText() : RichTextCell.readStyledText(blockRow.block);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public TL_iv.PageBlock sliceClone(BlockRow blockRow, int i, int i2) {
        if (!isFormattable(blockRow.block)) {
            return null;
        }
        CharSequence styledTextOf = styledTextOf(blockRow);
        int length = styledTextOf.length();
        int max = Math.max(0, Math.min(i, length));
        if (i2 >= 0) {
            length = Math.max(0, Math.min(i2, length));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(styledTextOf.subSequence(Math.min(max, length), Math.max(max, length)));
        TL_iv.PageBlock cloneBlock = cloneBlock(blockRow.block);
        RichTextCell.applyStyledTextToBlock(cloneBlock, spannableStringBuilder);
        return cloneBlock;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ArrayList collectMediaPhotos(int i, int i2) {
        TLRPC.Photo photo;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        while (i <= i2 && i < this.rows.size()) {
            for (MediaUploadState mediaUploadState : mediasOf((BlockRow) this.rows.get(i))) {
                if (mediaUploadState.isReady() && (photo = mediaUploadState.photo) != null && hashSet.add(Long.valueOf(photo.id))) {
                    arrayList.add(mediaUploadState.photo);
                }
            }
            i++;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ArrayList collectMediaDocuments(int i, int i2) {
        TLRPC.Document document;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        while (i <= i2 && i < this.rows.size()) {
            for (MediaUploadState mediaUploadState : mediasOf((BlockRow) this.rows.get(i))) {
                if (mediaUploadState.isReady() && (document = mediaUploadState.document) != null && hashSet.add(Long.valueOf(document.id))) {
                    arrayList.add(mediaUploadState.document);
                }
            }
            i++;
        }
        return arrayList;
    }

    private static TL_iv.PageBlock cloneBlock(TL_iv.PageBlock pageBlock) {
        if (pageBlock != null) {
            try {
                ensureSerializable(pageBlock);
                SerializedData serializedData = new SerializedData(pageBlock.getObjectSize());
                pageBlock.serializeToStream(serializedData);
                SerializedData serializedData2 = new SerializedData(serializedData.toByteArray());
                TL_iv.PageBlock TLdeserialize = TL_iv.PageBlock.TLdeserialize(serializedData2, serializedData2.readInt32(true), true);
                serializedData.cleanup();
                serializedData2.cleanup();
                if (TLdeserialize != null) {
                    return TLdeserialize;
                }
            } catch (Throwable th) {
                FileLog.e(th);
            }
        }
        TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
        pageblockparagraph.text = new TL_iv.textEmpty();
        return pageblockparagraph;
    }

    private static void ensureSerializable(TL_iv.PageBlock pageBlock) {
        if (pageBlock == null) {
            return;
        }
        if (pageBlock.text == null) {
            pageBlock.text = new TL_iv.textEmpty();
        }
        if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
            TL_iv.pageBlockPreformatted pageblockpreformatted = (TL_iv.pageBlockPreformatted) pageBlock;
            if (pageblockpreformatted.language == null) {
                pageblockpreformatted.language = "";
                return;
            }
        }
        if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            TL_iv.pageBlockBlockquote pageblockblockquote = (TL_iv.pageBlockBlockquote) pageBlock;
            if (pageblockblockquote.caption == null) {
                pageblockblockquote.caption = new TL_iv.textEmpty();
                return;
            }
        }
        if (pageBlock instanceof TL_iv.pageBlockPullquote) {
            TL_iv.pageBlockPullquote pageblockpullquote = (TL_iv.pageBlockPullquote) pageBlock;
            if (pageblockpullquote.caption == null) {
                pageblockpullquote.caption = new TL_iv.textEmpty();
            }
        }
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
        if (isDetailsHeader(rowForCell(i))) {
            RichEditText detailsEditText = detailsEditText(i);
            if (detailsEditText != null) {
                return detailsEditText.getText();
            }
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
        int max;
        int max2;
        if (isDetailsSelection()) {
            RichEditText detailsEditText = detailsEditText(i2);
            return (detailsEditText == null || (max = Math.max(0, Math.min(Math.min(i3, i5), detailsEditText.length()))) >= (max2 = Math.max(0, Math.min(Math.max(i3, i5), detailsEditText.length()))) || (i & detailsEditText.getCurrentStyle(max, max2)) == 0) ? false : true;
        }
        if (isQuoteAuthorSelection()) {
            RichEditText quoteAuthorEditText = quoteAuthorEditText(i2);
            if (quoteAuthorEditText == null) {
                return false;
            }
            int length = quoteAuthorEditText.length();
            int max3 = Math.max(0, Math.min(Math.min(i3, i5), length));
            int max4 = Math.max(0, Math.min(Math.max(i3, i5), length));
            return max3 < max4 && (i & quoteAuthorEditText.getCurrentStyle(max3, max4)) != 0;
        }
        int i6 = i2;
        boolean z = false;
        while (i6 <= i4) {
            BlockRow rowForCell = rowForCell(i6);
            if (rowForCell != null && isInlineFormattable(rowForCell.block)) {
                int blockTextLength = blockTextLength(i6);
                int i7 = i6 == i2 ? i3 : 0;
                int i8 = i6 == i4 ? i5 : blockTextLength;
                int max5 = Math.max(0, Math.min(i7, blockTextLength));
                int max6 = Math.max(0, Math.min(i8, blockTextLength));
                if (max5 < max6) {
                    RichTextCell cellAt = cellAt(i6);
                    if (cellAt != null) {
                        hasStyle = (cellAt.getStyleDelegate().getCurrentStyle(max5, max6) & i) != 0;
                    } else {
                        hasStyle = RichTextStyle.hasStyle(RichTextCell.readStyledText(rowForCell(i6).block), max5, max6, i);
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
        RichEditText detailsEditText = detailsEditText(i);
        if (detailsEditText != null) {
            return detailsEditText.length();
        }
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

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isFormattable(TL_iv.PageBlock pageBlock) {
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

    private boolean isDetailsSelection() {
        int startCell;
        TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper = this.textSelectionHelper;
        return articleTextSelectionHelper != null && articleTextSelectionHelper.isInSelectionMode() && (startCell = this.textSelectionHelper.getStartCell()) == this.textSelectionHelper.getEndCell() && isDetailsHeader(rowForCell(startCell));
    }

    private RichEditText detailsEditText(int i) {
        if (!isDetailsHeader(rowForCell(i))) {
            return null;
        }
        View selectableAt = selectableAt(i);
        if (selectableAt instanceof RichDetailsCell) {
            return ((RichDetailsCell) selectableAt).getEditText();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: persistDetailsTitle, reason: merged with bridge method [inline-methods] */
    public void lambda$onMathClicked$7(int i) {
        BlockRow rowForCell = rowForCell(i);
        RichEditText detailsEditText = detailsEditText(i);
        if (!isDetailsHeader(rowForCell) || detailsEditText == null) {
            return;
        }
        ((TL_iv.pageBlockDetails) rowForCell.block).title = RichTextStyle.fromSpannable(detailsEditText.getText());
    }

    private void onFormattingClickedDetails(int i) {
        int startCell = this.textSelectionHelper.getStartCell();
        RichEditText detailsEditText = detailsEditText(startCell);
        if (detailsEditText == null) {
            return;
        }
        int length = detailsEditText.length();
        int max = Math.max(0, Math.min(Math.min(this.textSelectionHelper.getStartOffset(), this.textSelectionHelper.getEndOffset()), length));
        int max2 = Math.max(0, Math.min(Math.max(this.textSelectionHelper.getStartOffset(), this.textSelectionHelper.getEndOffset()), length));
        if (max >= max2) {
            return;
        }
        boolean z = (detailsEditText.getCurrentStyle(max, max2) & i) == 0;
        RichEditorHistory richEditorHistory = this.history;
        if (richEditorHistory != null) {
            richEditorHistory.flush();
        }
        this.suppressSpansChanged = true;
        if (z) {
            int clearMaskFor = clearMaskFor(i);
            if (clearMaskFor != 0) {
                detailsEditText.removeStyle(clearMaskFor, max, max2);
            }
            detailsEditText.addStyle(i, max, max2);
        } else {
            detailsEditText.removeStyle(i, max, max2);
        }
        this.suppressSpansChanged = false;
        lambda$onMathClicked$7(startCell);
        detailsEditText.invalidateEffects();
        detailsEditText.requestLayout();
        RichEditorHistory richEditorHistory2 = this.history;
        if (richEditorHistory2 != null) {
            richEditorHistory2.record();
        }
        this.delegate.onSelectionChanged();
        refreshSelectionHighlight();
    }

    private void onLinkClickedDetails() {
        int startCell = this.textSelectionHelper.getStartCell();
        RichEditText detailsEditText = detailsEditText(startCell);
        if (detailsEditText == null) {
            return;
        }
        int length = detailsEditText.length();
        int max = Math.max(0, Math.min(Math.min(this.textSelectionHelper.getStartOffset(), this.textSelectionHelper.getEndOffset()), length));
        int max2 = Math.max(0, Math.min(Math.max(this.textSelectionHelper.getStartOffset(), this.textSelectionHelper.getEndOffset()), length));
        if (max >= max2) {
            return;
        }
        if (RichTextStyle.hasLink(detailsEditText.getText(), max, max2)) {
            RichEditorHistory richEditorHistory = this.history;
            if (richEditorHistory != null) {
                richEditorHistory.flush();
            }
            RichTextStyle.removeLink(detailsEditText.getText(), max, max2);
            detailsEditText.invalidateEffects();
            lambda$onMathClicked$7(startCell);
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
        if (RichTextStyle.hasDate(detailsEditText.getText(), max, max2)) {
            RichTextStyle.removeDate(detailsEditText.getText(), max, max2);
            detailsEditText.invalidateEffects();
            lambda$onMathClicked$7(startCell);
            RichEditorHistory richEditorHistory4 = this.history;
            if (richEditorHistory4 != null) {
                richEditorHistory4.record();
            }
            refreshSelectionHighlight();
        }
        detailsEditText.setSelectionOverride(max, max2);
        detailsEditText.makeSelectedUrl();
    }

    private void onDateClickedDetails() {
        int startCell = this.textSelectionHelper.getStartCell();
        RichEditText detailsEditText = detailsEditText(startCell);
        if (detailsEditText == null) {
            return;
        }
        int length = detailsEditText.length();
        int max = Math.max(0, Math.min(Math.min(this.textSelectionHelper.getStartOffset(), this.textSelectionHelper.getEndOffset()), length));
        int max2 = Math.max(0, Math.min(Math.max(this.textSelectionHelper.getStartOffset(), this.textSelectionHelper.getEndOffset()), length));
        if (max >= max2) {
            return;
        }
        RichEditorHistory richEditorHistory = this.history;
        if (richEditorHistory != null) {
            richEditorHistory.flush();
        }
        if (RichTextStyle.hasLink(detailsEditText.getText(), max, max2)) {
            RichTextStyle.removeLink(detailsEditText.getText(), max, max2);
            detailsEditText.invalidateEffects();
            lambda$onMathClicked$7(startCell);
            RichEditorHistory richEditorHistory2 = this.history;
            if (richEditorHistory2 != null) {
                richEditorHistory2.record();
            }
            refreshSelectionHighlight();
        }
        detailsEditText.setSelectionOverride(max, max2);
        detailsEditText.makeSelectedDate();
    }

    RichEditText tableEditText(int i, int i2) {
        View selectableAt = selectableAt(i);
        if (selectableAt instanceof RichTableCell) {
            return ((RichTableCell) selectableAt).editTextForChildPos(i2);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: persistTableCell, reason: merged with bridge method [inline-methods] */
    public void lambda$onMathClicked$6(int i, int i2) {
        RichTableCellHost hostForAnchor;
        View selectableAt = selectableAt(i);
        if (selectableAt instanceof RichTableCell) {
            RichTableCell richTableCell = (RichTableCell) selectableAt;
            if (i2 == richTableCell.titleChildPos()) {
                richTableCell.persistTitleFromEditor();
                return;
            }
            TL_iv.pageTableCell anchorForChildPos = richTableCell.anchorForChildPos(i2);
            if (anchorForChildPos == null || (hostForAnchor = richTableCell.getGrid().hostForAnchor(anchorForChildPos)) == null) {
                return;
            }
            TableModel.applyStyledText(anchorForChildPos, hostForAnchor.editText.getText());
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
                    lambda$onMathClicked$6(startCell, i2);
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
                lambda$onMathClicked$6(startCell, startChildPosition);
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
                lambda$onMathClicked$6(startCell, startChildPosition);
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
                lambda$onMathClicked$6(startCell, startChildPosition);
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
    public void lambda$onMathClicked$9(int i) {
        View selectableAt = selectableAt(i);
        if (selectableAt instanceof RichTextCell) {
            ((RichTextCell) selectableAt).persistAuthor();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: persistCaption, reason: merged with bridge method [inline-methods] */
    public void lambda$onMathClicked$8(int i) {
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
        lambda$onMathClicked$8(startCell);
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
            lambda$onMathClicked$8(startCell);
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
            lambda$onMathClicked$8(startCell);
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
            lambda$onMathClicked$8(startCell);
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
        lambda$onMathClicked$9(startCell);
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
            lambda$onMathClicked$9(startCell);
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
            lambda$onMathClicked$9(startCell);
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
            lambda$onMathClicked$9(startCell);
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
            if (isDetailsSelection()) {
                RichEditText detailsEditText = detailsEditText(this.textSelectionHelper.getStartCell());
                return detailsEditText != null && Math.max(0, Math.min(Math.min(this.textSelectionHelper.getStartOffset(), this.textSelectionHelper.getEndOffset()), detailsEditText.length())) < Math.max(0, Math.min(Math.max(this.textSelectionHelper.getStartOffset(), this.textSelectionHelper.getEndOffset()), detailsEditText.length()));
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
            if (startCell >= 0 && endCell >= 0 && endCell >= startCell && endCell < this.itemRows.size()) {
                int i = startCell;
                while (i <= endCell) {
                    BlockRow rowForCell = rowForCell(i);
                    if (rowForCell != null && (rowForCell.authorQuoteId != 0 || isInlineFormattable(rowForCell.block))) {
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

    boolean isSelectionAllHeadings() {
        TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper = this.textSelectionHelper;
        if (articleTextSelectionHelper != null && articleTextSelectionHelper.isInSelectionMode()) {
            int startCell = this.textSelectionHelper.getStartCell();
            int endCell = this.textSelectionHelper.getEndCell();
            if (startCell >= 0 && endCell >= 0 && endCell >= startCell) {
                boolean z = false;
                while (startCell <= endCell) {
                    BlockRow rowForCell = rowForCell(startCell);
                    if (rowForCell != null) {
                        if (!isHeading(rowForCell.block)) {
                            return false;
                        }
                        z = true;
                    }
                    startCell++;
                }
                return z;
            }
        }
        return false;
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
                Runnable runnable2 = new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda25
                    @Override // java.lang.Runnable
                    public final void run() {
                        RichEditorListView.this.lambda$handleSelectionTouch$12();
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
                openMathEditor(((RichMathCell) this.pressTarget).getRow());
            }
            this.pressTarget = null;
            this.longPressConsumed = false;
        } else if (action == 2) {
            float x = motionEvent.getX() - this.pressX;
            float y2 = motionEvent.getY() - this.pressY;
            if ((x * x) + (y2 * y2) > AndroidUtilities.dp(8.0f) * AndroidUtilities.dp(8.0f)) {
                this.pressMoved = true;
                Runnable runnable4 = this.longPressRunnable;
                if (runnable4 != null) {
                    removeCallbacks(runnable4);
                    this.longPressRunnable = null;
                }
            }
        } else if (action == 3) {
            Runnable runnable5 = this.longPressRunnable;
            if (runnable5 != null) {
                removeCallbacks(runnable5);
                this.longPressRunnable = null;
            }
            this.pressTarget = null;
            this.longPressConsumed = false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$handleSelectionTouch$12() {
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
        if (isPressOnEmptyEditText(view, left, top)) {
            this.longPressConsumed = true;
        } else {
            startBlockDrag(this.pressTarget);
        }
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
                if (richTableCell.isPressOnText(left, top) || richTableCell.isPressOnTitle(left, top)) {
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
            } else if ((view instanceof RichMathCell) && ((RichMathCell) view).isPressOnMath(left, top)) {
                this.textSelectionHelper.setMaybeView(left, top, view);
                this.textSelectionHelper.trySelect(view);
                return true;
            }
        }
        return false;
    }

    private View findCellUnder(int i, int i2) {
        int top = i2 - getTop();
        RichTableCell richTableCell = this.activeCellSelectionTable;
        if (richTableCell == null) {
            richTableCell = findFocusedTableCell();
        }
        if (richTableCell != null && richTableCell.getParent() == this) {
            int left = i - richTableCell.getLeft();
            int top2 = top - richTableCell.getTop();
            if (richTableCell.findRowHandleAt(left, top2) >= 0 || richTableCell.findColHandleAt(left, top2) >= 0) {
                return richTableCell;
            }
        }
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
            lambda$onTapAboveContent$13(blockRow);
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
        post(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda52
            @Override // java.lang.Runnable
            public final void run() {
                RichEditorListView.this.lambda$onTapAboveContent$13(blockRow2);
            }
        });
    }

    public void focusForDraft() {
        if (focusForDraftInternal()) {
            return;
        }
        post(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda4
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
            lambda$onTapBelowContent$15(blockRow);
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
            post(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda66
                @Override // java.lang.Runnable
                public final void run() {
                    RichEditorListView.this.lambda$focusForDraftInternal$14(blockRow2);
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
        if (blockRow != null && blockRow.quoteIds.isEmpty() && !isNonText(blockRow.block) && !blockRow.detailsEnd && !isDetailsHeader(blockRow) && !endsWithOwnParagraph(blockRow.block)) {
            lambda$onTapBelowContent$15(blockRow);
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
        post(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda57
            @Override // java.lang.Runnable
            public final void run() {
                RichEditorListView.this.lambda$onTapBelowContent$15(blockRow2);
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
        resyncInsetCells(true);
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

    private boolean isPressOnEmptyEditText(View view, int i, int i2) {
        if (view instanceof RichTextCell) {
            return ((RichTextCell) view).isPressOnEmptyEditText(i, i2);
        }
        if (view instanceof RichDetailsCell) {
            return ((RichDetailsCell) view).isPressOnEmptyEditText(i, i2);
        }
        return false;
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

    /* JADX INFO: Access modifiers changed from: private */
    public void finishEditTextActionModes() {
        for (int i = 0; i < getChildCount(); i++) {
            KeyEvent.Callback childAt = getChildAt(i);
            if (childAt instanceof RichTextCell) {
                ((RichTextCell) childAt).finishActionModes();
            } else if (childAt instanceof RichCaptionHost) {
                ((RichCaptionHost) childAt).getCaptionEditText().finishActionMode();
            } else if (childAt instanceof RichDetailsCell) {
                ((RichDetailsCell) childAt).getEditText().finishActionMode();
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
            authorEditText.requestEditFocusRebuild();
            authorEditText.setSelection(Math.max(0, Math.min(i3, authorEditText.length())));
            return;
        }
        if (findViewByPosition instanceof RichTableCell) {
            RichTableCell richTableCell = (RichTableCell) findViewByPosition;
            RichEditText editTextForChildPos = richTableCell.editTextForChildPos(i2);
            if (editTextForChildPos == null) {
                editTextForChildPos = richTableCell.editTextForChildPos(richTableCell.titleChildPos());
            }
            if (editTextForChildPos == null) {
                return;
            }
            editTextForChildPos.requestEditFocusRebuild();
            editTextForChildPos.setSelection(Math.max(0, Math.min(i3, editTextForChildPos.length())));
            return;
        }
        if (findViewByPosition instanceof RichCaptionHost) {
            RichEditText captionEditText = ((RichCaptionHost) findViewByPosition).getCaptionEditText();
            captionEditText.requestEditFocusRebuild();
            captionEditText.setSelection(Math.max(0, Math.min(i3, captionEditText.length())));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean restoreFocusAtScreenPoint(float f, float f2) {
        for (int i = 0; i < getChildCount(); i++) {
            KeyEvent.Callback childAt = getChildAt(i);
            if (childAt instanceof RichTextCell) {
                RichTextCell richTextCell = (RichTextCell) childAt;
                if (placeCaretAtScreenPoint(richTextCell.getEditText(), f, f2)) {
                    return true;
                }
                if (richTextCell.isAuthorVisible() && placeCaretAtScreenPoint(richTextCell.getAuthorEditText(), f, f2)) {
                    return true;
                }
            } else if (childAt instanceof RichCaptionHost) {
                if (placeCaretAtScreenPoint(((RichCaptionHost) childAt).getCaptionEditText(), f, f2)) {
                    return true;
                }
            } else if ((childAt instanceof RichDetailsCell) && placeCaretAtScreenPoint(((RichDetailsCell) childAt).getEditText(), f, f2)) {
                return true;
            }
        }
        return false;
    }

    private boolean placeCaretAtScreenPoint(RichEditText richEditText, float f, float f2) {
        if (richEditText != null && richEditText.getVisibility() == 0) {
            richEditText.getLocationOnScreen(new int[2]);
            float f3 = f - r1[0];
            float f4 = f2 - r1[1];
            if (f3 >= 0.0f && f4 >= 0.0f && f3 <= richEditText.getWidth() && f4 <= richEditText.getHeight()) {
                int offsetForPosition = richEditText.getOffsetForPosition(f3, f4);
                if (offsetForPosition < 0) {
                    offsetForPosition = 0;
                }
                richEditText.requestEditFocusRebuild();
                richEditText.setSelection(Math.max(0, Math.min(offsetForPosition, richEditText.length())));
                return true;
            }
        }
        return false;
    }

    public TextSelectionHelper.ArticleTextSelectionHelper getTextSelectionHelper() {
        return this.textSelectionHelper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void toggleMediaSpoiler(BlockRow blockRow, MediaUploadState mediaUploadState) {
        if (blockRow == null || mediaUploadState == null) {
            return;
        }
        RichEditorHistory richEditorHistory = this.history;
        if (richEditorHistory != null) {
            richEditorHistory.flush();
        }
        mediaUploadState.hasSpoiler = !mediaUploadState.hasSpoiler;
        TL_iv.PageBlock itemBlockFor = itemBlockFor(blockRow, mediaUploadState);
        if (itemBlockFor instanceof TL_iv.pageBlockPhoto) {
            ((TL_iv.pageBlockPhoto) itemBlockFor).spoiler = mediaUploadState.hasSpoiler;
        } else if (itemBlockFor instanceof TL_iv.pageBlockVideo) {
            ((TL_iv.pageBlockVideo) itemBlockFor).spoiler = mediaUploadState.hasSpoiler;
        }
        refreshMediaCell(blockRow);
        RichEditorHistory richEditorHistory2 = this.history;
        if (richEditorHistory2 != null) {
            richEditorHistory2.record();
        }
        this.delegate.onContentChanged();
    }

    RichMapCell.Delegate getMapDelegate() {
        return this.mapDelegate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void insertParagraphAfterQuote(BlockRow blockRow) {
        long j = blockRow.authorQuoteId;
        if (j == 0) {
            return;
        }
        int i = -1;
        for (int i2 = 0; i2 < this.rows.size(); i2++) {
            if (((BlockRow) this.rows.get(i2)).quoteIds.contains(Long.valueOf(j))) {
                i = i2;
            }
        }
        if (i < 0) {
            return;
        }
        RichEditorHistory richEditorHistory = this.history;
        if (richEditorHistory != null) {
            richEditorHistory.flush();
        }
        final BlockRow blockRow2 = new BlockRow(new TL_iv.pageBlockParagraph());
        blockRow2.quoteIds.addAll(blockRow.quoteIds);
        if (!blockRow2.quoteIds.isEmpty()) {
            blockRow2.quoteIds.remove(r8.size() - 1);
        }
        this.rows.add(i + 1, blockRow2);
        renumberAllRuns();
        this.adapter.update(false);
        RichEditorHistory richEditorHistory2 = this.history;
        if (richEditorHistory2 != null) {
            richEditorHistory2.record();
        }
        post(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda77
            @Override // java.lang.Runnable
            public final void run() {
                RichEditorListView.this.lambda$insertParagraphAfterQuote$16(blockRow2);
            }
        });
    }

    private void openMathEditor(BlockRow blockRow) {
        if (blockRow != null) {
            TL_iv.PageBlock pageBlock = blockRow.block;
            if (pageBlock instanceof TL_iv.pageBlockMath) {
                final TL_iv.pageBlockMath pageblockmath = (TL_iv.pageBlockMath) pageBlock;
                ChatAttachAlertRichLayout.showEditLatexSheet(getContext(), TextUtils.isEmpty(pageblockmath.source) ? "" : pageblockmath.source, new Utilities.Callback() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda53
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        RichEditorListView.this.lambda$openMathEditor$17(pageblockmath, (String) obj);
                    }
                }, this.resourcesProvider);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$openMathEditor$17(TL_iv.pageBlockMath pageblockmath, String str) {
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
            post(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda72
                @Override // java.lang.Runnable
                public final void run() {
                    RichEditorListView.this.lambda$deleteDetails$18(blockRow2);
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
        post(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda74
            @Override // java.lang.Runnable
            public final void run() {
                RichEditorListView.this.lambda$onDetailsTitleEnter$19(blockRow2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$20(RichTableCell richTableCell) {
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
        if ((iArr[1] - dp) - AndroidUtilities.dp(8.0f) < AndroidUtilities.statusBarHeight + AndroidUtilities.dp(8.0f)) {
            tableMenuAnchor = tableMenuAnchor(richTableCell, true);
        }
        final ItemOptions makeMenu = this.delegate.makeMenu(tableMenuAnchor);
        makeMenu.setDimAlpha(0);
        makeMenu.setDrawScrim(false);
        makeMenu.allowShowingOnTopOfKeyboard();
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
        boolean z3 = z2;
        RichEditor.Button accent5 = new RichEditor.Button(getContext(), R.drawable.iv_align_vert_middle, this.resourcesProvider).setRoundRadius(4).setAccent(false);
        linearLayout2.addView(accent5, LayoutHelper.createLinear(32, 32));
        int i8 = i3;
        RichEditor.Button accent6 = new RichEditor.Button(getContext(), R.drawable.iv_align_vert_bottom, this.resourcesProvider).setRoundRadius(4).setAccent(false);
        final RichEditor.Button[] buttonArr2 = {accent4, accent5, accent6};
        linearLayout2.addView(accent6, LayoutHelper.createLinear(32, 32));
        makeMenu.addView(linearLayout);
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
            buttonArr[i11].setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda11
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    RichEditorListView.lambda$showTableCellMenu$21(RichTableCell.this, i11, buttonArr, view);
                }
            });
        }
        for (final int i12 = 0; i12 < 3; i12++) {
            buttonArr2[i12].setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda15
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    RichEditorListView.lambda$showTableCellMenu$22(RichTableCell.this, i12, buttonArr2, view);
                }
            });
        }
        makeMenu.addSpaceGap();
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
        makeMenu.add(allSelectedHeader ? R.drawable.iv_table_highlight_remove : R.drawable.iv_table_highlight, string, new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda16
            @Override // java.lang.Runnable
            public final void run() {
                RichEditorListView.this.lambda$showTableCellMenu$23(richTableCell, allSelectedHeader);
            }
        });
        if (i2 != 0) {
            makeMenu.add(R.drawable.iv_table_merge, LocaleController.getString(R.string.ArticleMergeCells), new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda17
                @Override // java.lang.Runnable
                public final void run() {
                    RichEditorListView.this.lambda$showTableCellMenu$24(richTableCell);
                }
            });
        }
        if (i8 != 0) {
            makeMenu.add(R.drawable.iv_table_unmerge, LocaleController.getString(R.string.ArticleSplitCells), new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda18
                @Override // java.lang.Runnable
                public final void run() {
                    RichEditorListView.this.lambda$showTableCellMenu$25(richTableCell);
                }
            });
        }
        if (z3) {
            makeMenu.add(R.drawable.iv_table_insert_left, LocaleController.getString(R.string.ArticleInsertLeft), new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda19
                @Override // java.lang.Runnable
                public final void run() {
                    RichEditorListView.this.lambda$showTableCellMenu$26(richTableCell);
                }
            });
            makeMenu.add(R.drawable.iv_table_insert_right, LocaleController.getString(R.string.ArticleInsertRight), new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda20
                @Override // java.lang.Runnable
                public final void run() {
                    RichEditorListView.this.lambda$showTableCellMenu$27(richTableCell);
                }
            });
        }
        if (computeSpansFullRows) {
            makeMenu.add(R.drawable.iv_table_insert_top, LocaleController.getString(R.string.ArticleInsertAbove), new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda21
                @Override // java.lang.Runnable
                public final void run() {
                    RichEditorListView.this.lambda$showTableCellMenu$28(richTableCell);
                }
            });
            makeMenu.add(R.drawable.iv_table_insert_bottom, LocaleController.getString(R.string.ArticleInsertBelow), new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda22
                @Override // java.lang.Runnable
                public final void run() {
                    RichEditorListView.this.lambda$showTableCellMenu$29(richTableCell);
                }
            });
        }
        if (i7 != 0) {
            z = true;
            makeMenu.add(R.drawable.iv_table_remove, LocaleController.getString(R.string.ArticleDeleteColumn), true, new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda23
                @Override // java.lang.Runnable
                public final void run() {
                    RichEditorListView.this.lambda$showTableCellMenu$30(richTableCell);
                }
            });
        } else {
            z = true;
        }
        if (i6 != 0) {
            makeMenu.add(R.drawable.iv_table_remove, LocaleController.getString(R.string.ArticleDeleteRow), z, new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda12
                @Override // java.lang.Runnable
                public final void run() {
                    RichEditorListView.this.lambda$showTableCellMenu$31(richTableCell);
                }
            });
        }
        if (computeAllSelected) {
            makeMenu.add(R.drawable.iv_table_remove, LocaleController.getString(R.string.ArticleDeleteTable), z, new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda13
                @Override // java.lang.Runnable
                public final void run() {
                    RichEditorListView.this.lambda$showTableCellMenu$32(richTableCell);
                }
            });
        }
        makeMenu.setOnDismiss(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda14
            @Override // java.lang.Runnable
            public final void run() {
                RichEditorListView.this.lambda$showTableCellMenu$33(makeMenu);
            }
        });
        this.tableCellMenu = makeMenu;
        makeMenu.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showTableCellMenu$21(RichTableCell richTableCell, int i, RichEditor.Button[] buttonArr, View view) {
        richTableCell.applyHorizontalAlign(i);
        int i2 = 0;
        while (i2 < 3) {
            buttonArr[i2].setSelected(i2 == i);
            i2++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showTableCellMenu$22(RichTableCell richTableCell, int i, RichEditor.Button[] buttonArr, View view) {
        richTableCell.applyVerticalAlign(i);
        int i2 = 0;
        while (i2 < 3) {
            buttonArr[i2].setSelected(i2 == i);
            i2++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showTableCellMenu$23(RichTableCell richTableCell, boolean z) {
        richTableCell.applyHeaderToggle(!z);
        exitCellSelectionMode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showTableCellMenu$24(RichTableCell richTableCell) {
        richTableCell.applyMergeFromSelection();
        exitCellSelectionMode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showTableCellMenu$25(RichTableCell richTableCell) {
        richTableCell.applyUnmergeFromSelection();
        exitCellSelectionMode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showTableCellMenu$26(RichTableCell richTableCell) {
        richTableCell.applyInsertColumnFromSelection(true);
        exitCellSelectionMode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showTableCellMenu$27(RichTableCell richTableCell) {
        richTableCell.applyInsertColumnFromSelection(false);
        exitCellSelectionMode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showTableCellMenu$28(RichTableCell richTableCell) {
        richTableCell.applyInsertRowFromSelection(true);
        exitCellSelectionMode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showTableCellMenu$29(RichTableCell richTableCell) {
        richTableCell.applyInsertRowFromSelection(false);
        exitCellSelectionMode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showTableCellMenu$30(RichTableCell richTableCell) {
        richTableCell.applyDeleteColumnsFromSelection();
        exitCellSelectionMode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showTableCellMenu$31(RichTableCell richTableCell) {
        richTableCell.applyDeleteRowsFromSelection();
        exitCellSelectionMode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showTableCellMenu$32(RichTableCell richTableCell) {
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
    public /* synthetic */ void lambda$showTableCellMenu$33(ItemOptions itemOptions) {
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
        this.pendingInsertRow = blockRow;
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
        ChatAttachAlertRichLayout.showEditLatexSheet(getContext(), "", new Utilities.Callback() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda71
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                RichEditorListView.this.lambda$openLatexEditorAndAdd$34((String) obj);
            }
        }, this.resourcesProvider);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$openLatexEditorAndAdd$34(String str) {
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
            if (r0 == findTableCellAncestor.getTitleEditText()) {
                return new RichEditorHistory.FocusState(findTableCellAncestor.getRow().id, findTableCellAncestor.titleChildPos(), selectionStart, selectionEnd);
            }
            RichTableCellHost findHostContaining = findTableCellAncestor.findHostContaining(r0);
            return new RichEditorHistory.FocusState(findTableCellAncestor.getRow().id, findHostContaining != null ? findTableCellAncestor.childPosForAnchor(findHostContaining.cell) : -1, selectionStart, selectionEnd);
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
        if (focusState != null && focusState.rowId >= 0) {
            post(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda56
                @Override // java.lang.Runnable
                public final void run() {
                    RichEditorListView.this.lambda$restoreFromHistory$35(focusState);
                }
            });
        }
        this.delegate.onContentChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: focusFromHistory, reason: merged with bridge method [inline-methods] */
    public void lambda$restoreFromHistory$35(RichEditorHistory.FocusState focusState) {
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
            RichEditText editTextForChildPos = richTableCell.editTextForChildPos(focusState.childIndex);
            if (editTextForChildPos == null) {
                editTextForChildPos = richTableCell.editTextForChildPos(richTableCell.titleChildPos());
            }
            if (editTextForChildPos == null) {
                return;
            }
            editTextForChildPos.requestEditFocus();
            int length2 = editTextForChildPos.length();
            editTextForChildPos.setSelection(Math.max(0, Math.min(focusState.selStart, length2)), Math.max(0, Math.min(focusState.selEnd, length2)));
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

    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v38 */
    void assignContainers() {
        int i;
        int i2;
        int intValue;
        long longValue;
        int i3;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ?? r6 = 0;
        int i4 = 0;
        while (i4 < this.rows.size()) {
            BlockRow blockRow = (BlockRow) this.rows.get(i4);
            blockRow.path.clear();
            blockRow.itemStart = r6;
            if (blockRow.detailsEnd) {
                if (!arrayList.isEmpty()) {
                    arrayList.remove(arrayList.size() - 1);
                }
                arrayList2.clear();
                arrayList3.clear();
                arrayList4.clear();
                arrayList5.clear();
                i3 = i4;
            } else {
                for (int i5 = 0; i5 < blockRow.quoteIds.size(); i5++) {
                    blockRow.path.add(RichContainer.quote(((Long) blockRow.quoteIds.get(i5)).longValue()));
                }
                for (int i6 = 0; i6 < arrayList.size(); i6++) {
                    blockRow.path.add((RichContainer) arrayList.get(i6));
                }
                int max = Math.max((int) r6, blockRow.level);
                if (max == 0) {
                    arrayList2.clear();
                    arrayList3.clear();
                    arrayList4.clear();
                    arrayList5.clear();
                } else {
                    boolean z = blockRow.num > 0;
                    while (arrayList2.size() > max) {
                        arrayList2.remove(arrayList2.size() - 1);
                        arrayList3.remove(arrayList3.size() - 1);
                        arrayList4.remove(arrayList4.size() - 1);
                        arrayList5.remove(arrayList5.size() - 1);
                    }
                    int i7 = 1;
                    while (i7 <= max) {
                        int i8 = i7 - 1;
                        boolean z2 = i7 == max;
                        boolean z3 = i8 < arrayList2.size();
                        if (z3 && z2 && ((Boolean) arrayList3.get(i8)).booleanValue() != z) {
                            z3 = false;
                        }
                        if (!z3) {
                            while (arrayList2.size() > i8) {
                                arrayList2.remove(arrayList2.size() - 1);
                                arrayList3.remove(arrayList3.size() - 1);
                                arrayList4.remove(arrayList4.size() - 1);
                                arrayList5.remove(arrayList5.size() - 1);
                            }
                            arrayList2.add(Long.valueOf(RichContainer.newId()));
                            arrayList3.add(Boolean.valueOf(z2 ? z : false));
                            arrayList4.add(0);
                            arrayList5.add(0L);
                        }
                        long longValue2 = ((Long) arrayList2.get(i8)).longValue();
                        if (z2) {
                            if (((Long) arrayList5.get(i8)).longValue() == 0 || !isNonText(blockRow.block)) {
                                intValue = ((Integer) arrayList4.get(i8)).intValue() + 1;
                                arrayList4.set(i8, Integer.valueOf(intValue));
                                i = i4;
                                longValue = blockRow.id;
                                arrayList5.set(i8, Long.valueOf(longValue));
                                blockRow.itemStart = true;
                            } else {
                                i = i4;
                                intValue = ((Integer) arrayList4.get(i8)).intValue();
                                longValue = ((Long) arrayList5.get(i8)).longValue();
                            }
                            long j = longValue;
                            int i9 = intValue;
                            i2 = i7;
                            RichContainer list = RichContainer.list(longValue2, j, z, blockRow.checkbox, blockRow.checked);
                            list.itemNum = i9;
                            blockRow.path.add(list);
                        } else {
                            i = i4;
                            i2 = i7;
                            blockRow.path.add(RichContainer.list(longValue2, 0L, ((Boolean) arrayList3.get(i8)).booleanValue(), false, false));
                        }
                        i7 = i2 + 1;
                        i4 = i;
                    }
                }
                i3 = i4;
                if (isDetailsHeader(blockRow)) {
                    arrayList.add(RichContainer.details(RichContainer.newId(), ((TL_iv.pageBlockDetails) blockRow.block).open));
                    arrayList2.clear();
                    arrayList3.clear();
                    arrayList4.clear();
                    arrayList5.clear();
                }
                if (RichTextCell.isQuoteBlock(blockRow.block)) {
                    blockRow.path.add(RichContainer.quote(RichContainer.newId()));
                }
            }
            i4 = i3 + 1;
            r6 = 0;
        }
    }

    @Override // org.telegram.ui.Components.UniversalRecyclerView, org.telegram.ui.Components.RecyclerListView, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        drawQuoteBars(canvas);
        super.dispatchDraw(canvas);
    }

    private BlockRow rowOfChild(View view) {
        int childAdapterPosition = getChildAdapterPosition(view);
        if (childAdapterPosition < 0 || childAdapterPosition >= this.itemRows.size()) {
            return null;
        }
        return (BlockRow) this.itemRows.get(childAdapterPosition);
    }

    private void drawQuoteBars(Canvas canvas) {
        BlockRow blockRow;
        View view;
        Long l;
        BlockRow blockRow2;
        BlockRow blockRow3;
        BlockRow blockRow4;
        int i;
        boolean z;
        float f;
        int childCount = getChildCount();
        if (childCount == 0) {
            return;
        }
        boolean z2 = false;
        int i2 = 0;
        for (int i3 = 0; i3 < childCount; i3++) {
            BlockRow rowOfChild = rowOfChild(getChildAt(i3));
            if (rowOfChild != null && rowOfChild.quoteIds.size() > i2) {
                i2 = rowOfChild.quoteIds.size();
            }
        }
        if (i2 == 0) {
            return;
        }
        if (this.quoteLine == null) {
            ReplyMessageLine replyMessageLine = new ReplyMessageLine(this);
            this.quoteLine = replyMessageLine;
            replyMessageLine.check(null, null, null, this.resourcesProvider, 1);
            RichBlockChrome.applyEditorQuoteColor(this.quoteLine, this.resourcesProvider);
        }
        int i4 = 0;
        while (i4 < i2) {
            long j = 0;
            BlockRow blockRow5 = null;
            BlockRow blockRow6 = null;
            boolean z3 = false;
            int i5 = 0;
            float f2 = 0.0f;
            float f3 = 0.0f;
            float f4 = 1.0f;
            while (i5 <= childCount) {
                if (i5 < childCount) {
                    View childAt = getChildAt(i5);
                    BlockRow rowOfChild2 = rowOfChild(childAt);
                    if (rowOfChild2 == null || i4 >= rowOfChild2.quoteIds.size()) {
                        view = childAt;
                        blockRow = rowOfChild2;
                        l = null;
                    } else {
                        view = childAt;
                        blockRow = rowOfChild2;
                        l = (Long) rowOfChild2.quoteIds.get(i4);
                    }
                } else {
                    blockRow = null;
                    view = null;
                    l = null;
                }
                if (!z3 || (l != null && l.longValue() == j)) {
                    blockRow2 = blockRow;
                    blockRow3 = blockRow5;
                    blockRow4 = blockRow6;
                    i = i5;
                } else {
                    int quoteBgVinset = quoteBgVinset(i4, blockRow6, true);
                    int quoteBgVinset2 = quoteBgVinset(i4, blockRow5, z2);
                    blockRow2 = blockRow;
                    blockRow3 = blockRow5;
                    blockRow4 = blockRow6;
                    i = i5;
                    drawQuoteContainer(canvas, i4, f2, f3, f4, quoteBgVinset, quoteBgVinset2);
                    z3 = false;
                }
                if (view == null || l == null) {
                    blockRow5 = blockRow3;
                    blockRow6 = blockRow4;
                } else {
                    if (z3) {
                        z = z3;
                        f = f4;
                        blockRow6 = blockRow4;
                    } else {
                        j = l.longValue();
                        f2 = Float.MAX_VALUE;
                        f3 = -3.4028235E38f;
                        blockRow6 = blockRow2;
                        f = 1.0f;
                        z = true;
                    }
                    if (blockRow2 == null || blockRow2 != this.draggingRow) {
                        float y = view.getY();
                        float height = view.getHeight() + y;
                        if (y < f2) {
                            f2 = y;
                        }
                        if (height > f3) {
                            f3 = height;
                        }
                        f4 = Math.min(f, view.getAlpha());
                    } else {
                        f4 = f;
                    }
                    z3 = z;
                    blockRow5 = blockRow2;
                }
                i5 = i + 1;
                z2 = false;
            }
            i4++;
            z2 = false;
        }
    }

    private void drawQuoteContainer(Canvas canvas, int i, float f, float f2, float f3, int i2, int i3) {
        if (f2 - f <= AndroidUtilities.dp(4.0f)) {
            return;
        }
        int dp = AndroidUtilities.dp(16.0f) * i;
        int dp2 = AndroidUtilities.dp(16.0f) + dp;
        int width = (getWidth() - AndroidUtilities.dp(16.0f)) - dp;
        if (width - dp2 <= AndroidUtilities.dp(8.0f)) {
            return;
        }
        float floor = (float) Math.floor(SharedConfig.bubbleRadius / 3.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(dp2, i2 + f, width, f2 - i3);
        this.quoteLine.drawBackground(canvas, rectF, floor, floor, floor, f3);
        this.quoteLine.drawLine(canvas, rectF, f3);
    }

    private int quoteBgVinset(int i, BlockRow blockRow, boolean z) {
        if (blockRow == null) {
            return AndroidUtilities.dp(2.0f);
        }
        return AndroidUtilities.dp(2.0f) + (Math.max(0, i - (blockRow.quoteIds.size() - (z ? blockRow.quoteTopEdge : blockRow.quoteBottomEdge))) * AndroidUtilities.dp(16.0f));
    }

    private void fillItems(ArrayList arrayList, UniversalAdapter universalAdapter) {
        assignContainers();
        this.itemRows.clear();
        HashMap hashMap = new HashMap();
        int i = 0;
        for (int i2 = 0; i2 < this.rows.size(); i2++) {
            BlockRow blockRow = (BlockRow) this.rows.get(i2);
            if (!blockRow.detailsEnd) {
                for (int i3 = 0; i3 < blockRow.quoteIds.size(); i3++) {
                    Map.-EL.merge(hashMap, (Long) blockRow.quoteIds.get(i3), 1, new RichEditorListView$$ExternalSyntheticLambda61());
                }
                if (blockRow.block instanceof TL_iv.pageBlockParagraph) {
                    i++;
                }
            }
        }
        boolean z = i == 1;
        ArrayList arrayList2 = new ArrayList();
        BlockRow blockRow2 = null;
        int i4 = 0;
        boolean z2 = false;
        int i5 = -1;
        while (i4 < this.rows.size()) {
            BlockRow blockRow3 = (BlockRow) this.rows.get(i4);
            if (blockRow3.detailsEnd) {
                boolean z3 = i5 != -1;
                if (!arrayList2.isEmpty()) {
                    arrayList2.remove(arrayList2.size() - 1);
                }
                if (i5 != -1 && arrayList2.size() < i5) {
                    i5 = -1;
                } else if (!z3) {
                    if (z2) {
                        universalAdapter.reorderSectionEnd();
                        z2 = false;
                    }
                    arrayList.add(RichDetailsEndCell.Factory.of(blockRow3));
                    this.itemRows.add(blockRow3);
                }
            } else {
                boolean z4 = i5 != -1;
                if (isDetailsHeader(blockRow3)) {
                    if (!z4) {
                        boolean z5 = ((TL_iv.pageBlockDetails) blockRow3.block).open;
                        if (!arrayList2.isEmpty() || z5) {
                            if (z2) {
                                universalAdapter.reorderSectionEnd();
                                z2 = false;
                            }
                        } else if (!z2) {
                            universalAdapter.reorderSectionStart();
                            z2 = true;
                        }
                        arrayList.add(RichDetailsCell.Factory.of(blockRow3, this.detailsDelegate));
                        this.itemRows.add(blockRow3);
                        if (!z5) {
                            i5 = arrayList2.size() + 1;
                        }
                    }
                    arrayList2.add(blockRow3);
                } else if (!z4) {
                    if (blockRow2 != null && willInjectAuthors(blockRow2, blockRow3.quoteIds, hashMap) && z2) {
                        universalAdapter.reorderSectionEnd();
                        z2 = false;
                    }
                    if (blockRow2 != null) {
                        injectClosingQuoteAuthors(blockRow2, blockRow3.quoteIds, hashMap, arrayList);
                    }
                    if (arrayList2.isEmpty()) {
                        if (!z2) {
                            universalAdapter.reorderSectionStart();
                            z2 = true;
                        }
                    } else if (z2) {
                        universalAdapter.reorderSectionEnd();
                        z2 = false;
                    }
                    TL_iv.PageBlock pageBlock = blockRow3.block;
                    if (pageBlock instanceof TL_iv.pageBlockDivider) {
                        arrayList.add(RichDividerCell.Factory.of(blockRow3, this.dividerDelegate));
                    } else if (isMedia(pageBlock)) {
                        arrayList.add(RichMediaCell.Factory.of(blockRow3, this.mediaDelegate));
                    } else {
                        TL_iv.PageBlock pageBlock2 = blockRow3.block;
                        if (pageBlock2 instanceof TL_iv.pageBlockAudio) {
                            arrayList.add(RichAudioCell.Factory.of(blockRow3, this.audioDelegate));
                        } else if (pageBlock2 instanceof TL_iv.pageBlockDocument) {
                            arrayList.add(RichDocumentCell.Factory.of(blockRow3, this.documentDelegate));
                        } else if (pageBlock2 instanceof TL_iv.pageBlockMap) {
                            arrayList.add(RichMapCell.Factory.of(blockRow3, this.mapDelegate));
                        } else if (pageBlock2 instanceof TL_iv.pageBlockMath) {
                            arrayList.add(RichMathCell.Factory.of(blockRow3, this.mathDelegate));
                        } else if (pageBlock2 instanceof TL_iv.pageBlockTable) {
                            arrayList.add(RichTableCell.Factory.of(blockRow3, this.tableDelegate));
                        } else {
                            blockRow3.firstBlock = i4 == 0;
                            blockRow3.singleParagraph = z && (pageBlock2 instanceof TL_iv.pageBlockParagraph);
                            arrayList.add(RichTextCell.Factory.of(blockRow3, this.cellDelegate, this.rows.size() == 2 && i4 == 1 && (blockRow3.block instanceof TL_iv.pageBlockParagraph) && (((BlockRow) this.rows.get(0)).block instanceof TL_iv.pageBlockHeading1)));
                        }
                    }
                    this.itemRows.add(blockRow3);
                    blockRow2 = blockRow3;
                }
            }
            i4++;
        }
        if (z2) {
            universalAdapter.reorderSectionEnd();
        }
        if (blockRow2 != null) {
            injectClosingQuoteAuthors(blockRow2, EMPTY_QUOTE_IDS, hashMap, arrayList);
        }
        markQuoteEdges();
    }

    private void markQuoteEdges() {
        int i = 0;
        while (i < this.itemRows.size()) {
            BlockRow blockRow = (BlockRow) this.itemRows.get(i);
            blockRow.quoteFirst = false;
            blockRow.quoteLast = false;
            blockRow.quoteTopEdge = 0;
            blockRow.quoteBottomEdge = 0;
            int size = blockRow.quoteIds.size();
            if (size != 0) {
                BlockRow blockRow2 = i > 0 ? (BlockRow) this.itemRows.get(i - 1) : null;
                int i2 = i + 1;
                BlockRow blockRow3 = i2 < this.itemRows.size() ? (BlockRow) this.itemRows.get(i2) : null;
                blockRow.quoteTopEdge = size - quoteCommonPrefixLen(blockRow, blockRow2);
                int quoteCommonPrefixLen = size - quoteCommonPrefixLen(blockRow, blockRow3);
                blockRow.quoteBottomEdge = quoteCommonPrefixLen;
                blockRow.quoteFirst = blockRow.quoteTopEdge > 0;
                blockRow.quoteLast = quoteCommonPrefixLen > 0;
            }
            i++;
        }
    }

    private static int quoteCommonPrefixLen(BlockRow blockRow, BlockRow blockRow2) {
        int i = 0;
        if (blockRow != null && blockRow2 != null) {
            int min = Math.min(blockRow.quoteIds.size(), blockRow2.quoteIds.size());
            while (i < min && ((Long) blockRow.quoteIds.get(i)).equals(blockRow2.quoteIds.get(i))) {
                i++;
            }
        }
        return i;
    }

    private boolean willInjectAuthors(BlockRow blockRow, ArrayList arrayList, java.util.Map map) {
        int size = blockRow.quoteIds.size();
        int i = 0;
        while (i < size && i < arrayList.size() && ((Long) blockRow.quoteIds.get(i)).equals(arrayList.get(i))) {
            i++;
        }
        for (int i2 = size - 1; i2 >= i; i2--) {
            Long l = (Long) blockRow.quoteIds.get(i2);
            l.longValue();
            Integer num = (Integer) map.get(l);
            if (num != null && (num.intValue() >= 2 || i2 > 0 || this.quoteAuthors.containsKey(l))) {
                return true;
            }
        }
        return false;
    }

    private boolean normalizeQuoteMembership(BlockRow blockRow) {
        int indexOf;
        if (blockRow == null || (indexOf = this.rows.indexOf(blockRow)) < 0) {
            return false;
        }
        ArrayList arrayList = indexOf > 0 ? ((BlockRow) this.rows.get(indexOf - 1)).quoteIds : EMPTY_QUOTE_IDS;
        int i = indexOf + 1;
        ArrayList arrayList2 = i < this.rows.size() ? ((BlockRow) this.rows.get(i)).quoteIds : EMPTY_QUOTE_IDS;
        if (arrayList.size() < arrayList2.size()) {
            arrayList = arrayList2;
        }
        if (blockRow.quoteIds.equals(arrayList)) {
            return false;
        }
        blockRow.quoteIds.clear();
        blockRow.quoteIds.addAll(arrayList);
        return true;
    }

    private void injectClosingQuoteAuthors(BlockRow blockRow, ArrayList arrayList, java.util.Map map, ArrayList arrayList2) {
        int size = blockRow.quoteIds.size();
        int i = 0;
        while (i < size && i < arrayList.size() && ((Long) blockRow.quoteIds.get(i)).equals(arrayList.get(i))) {
            i++;
        }
        for (int i2 = size - 1; i2 >= i; i2--) {
            Long l = (Long) blockRow.quoteIds.get(i2);
            long longValue = l.longValue();
            Integer num = (Integer) map.get(l);
            if (num != null && (num.intValue() >= 2 || i2 != 0 || this.quoteAuthors.containsKey(l))) {
                BlockRow blockRow2 = new BlockRow(new TL_iv.pageBlockParagraph());
                blockRow2.authorQuoteId = longValue;
                for (int i3 = 0; i3 <= i2; i3++) {
                    blockRow2.quoteIds.add((Long) blockRow.quoteIds.get(i3));
                }
                arrayList2.add(RichQuoteAuthorCell.Factory.of(blockRow2, this.quoteAuthorDelegate));
                this.itemRows.add(blockRow2);
            }
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
                boolean normalizeQuoteMembership = normalizeQuoteMembership(this.draggingRow);
                boolean collapseSingleBlockQuotes = collapseSingleBlockQuotes();
                normalizeLevels();
                renumberAllRuns();
                assignContainers();
                if (normalizeQuoteMembership || collapseSingleBlockQuotes) {
                    this.adapter.update(true);
                    resyncInsetCells(true);
                } else {
                    resyncInsetCells(true);
                }
                RichEditorHistory richEditorHistory2 = this.history;
                if (richEditorHistory2 != null) {
                    richEditorHistory2.record();
                    return;
                }
                return;
            }
        }
    }

    private void resyncInsetCells(boolean z) {
        for (int i = 0; i < getChildCount(); i++) {
            KeyEvent.Callback childAt = getChildAt(i);
            if (childAt instanceof RichInsetCell) {
                ((RichInsetCell) childAt).resyncBlockInset(z);
            }
        }
        invalidate();
    }

    private void normalizeLevels() {
        int i = 0;
        while (i < this.rows.size()) {
            BlockRow blockRow = (BlockRow) this.rows.get(i);
            if (!blockRow.detailsEnd && !isDetailsHeader(blockRow)) {
                BlockRow blockRow2 = i > 0 ? (BlockRow) this.rows.get(i - 1) : null;
                int max = blockRow2 != null ? Math.max(0, blockRow2.level) : 0;
                if (isNonText(blockRow.block)) {
                    blockRow.level = max;
                    if (max > 0) {
                        blockRow.num = blockRow2.num > 0 ? 1 : 0;
                        blockRow.checkbox = false;
                        blockRow.checked = false;
                    }
                } else {
                    int i2 = max + 1;
                    if (blockRow.level > i2) {
                        blockRow.level = i2;
                    }
                }
                if (blockRow.level <= 0) {
                    blockRow.level = 0;
                    blockRow.num = 0;
                    blockRow.checkbox = false;
                    blockRow.checked = false;
                }
            }
            i++;
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
        if (isCtrlPressed && keyCode == 29 && (this.textSelectionHelper.expandSelectionToWholeCurrentBlock() || tryEscalateSelectAll())) {
            return true;
        }
        if (!isInSelectionMode && !isShiftPressed && !isCtrlPressed && !isAltPressed && ((keyCode == 20 || keyCode == 19) && tryPlainArrowAcrossCells(keyCode))) {
            return true;
        }
        if (!isInSelectionMode && !isCtrlPressed && !isAltPressed && keyCode == 61) {
            View findFocus = findFocus();
            if ((findFocus instanceof RichEditText) && (findTableCellAncestor = findTableCellAncestor(findFocus)) != null) {
                if (findFocus == findTableCellAncestor.getTitleEditText()) {
                    if (!isShiftPressed && findTableCellAncestor.focusFirstCell()) {
                        return true;
                    }
                } else {
                    RichTableCellHost findHostContaining = findTableCellAncestor.findHostContaining(findFocus);
                    if (findHostContaining != null && findTableCellAncestor.moveFocusByTab(findHostContaining, isShiftPressed)) {
                        return true;
                    }
                }
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

    /* JADX WARN: Removed duplicated region for block: B:33:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e3  */
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
        if (findFocusedRow == null) {
            findFocusedRow = this.pendingInsertRow;
        }
        int indexOf = findFocusedRow != null ? this.rows.indexOf(findFocusedRow) : -1;
        if (indexOf >= 0 && (findFocusedRow.block instanceof TL_iv.pageBlockBlockquote)) {
            long newId = RichContainer.newId();
            TL_iv.RichText richText = ((TL_iv.pageBlockBlockquote) findFocusedRow.block).caption;
            if (richText != null && !(richText instanceof TL_iv.textEmpty)) {
                this.quoteAuthors.put(Long.valueOf(newId), richText);
            }
            findFocusedRow.quoteIds.add(Long.valueOf(newId));
            findFocusedRow.block = new TL_iv.pageBlockParagraph();
        }
        boolean z = indexOf >= 0 && !findFocusedRow.quoteIds.isEmpty();
        if (indexOf >= 0) {
            TL_iv.PageBlock pageBlock2 = findFocusedRow.block;
            if ((pageBlock2 instanceof TL_iv.pageBlockParagraph) && findFocusedRow.media == null && RichTextCell.readPlainText(pageBlock2).isEmpty()) {
                findFocusedRow.block = pageBlock;
                this.pendingInsertRow = findFocusedRow;
                if (hasCaption(pageBlock)) {
                    int indexOf2 = this.rows.indexOf(findFocusedRow) + 1;
                    if (indexOf2 >= this.rows.size() || isNonText(((BlockRow) this.rows.get(indexOf2)).block)) {
                        BlockRow blockRow = new BlockRow(new TL_iv.pageBlockParagraph());
                        if (z) {
                            blockRow.quoteIds.addAll(findFocusedRow.quoteIds);
                        }
                        this.rows.add(indexOf2, blockRow);
                        findFocusedRow = blockRow;
                    } else {
                        findFocusedRow = (BlockRow) this.rows.get(indexOf2);
                    }
                }
                this.adapter.update(false);
                richEditorHistory = this.history;
                if (richEditorHistory != null) {
                    richEditorHistory.record();
                }
                post(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda37
                    @Override // java.lang.Runnable
                    public final void run() {
                        RichEditorListView.this.lambda$addBlock$36(findFocusedRow);
                    }
                });
            }
        }
        BlockRow blockRow2 = new BlockRow(pageBlock);
        if (z) {
            blockRow2.quoteIds.addAll(findFocusedRow.quoteIds);
        }
        if (indexOf >= 0) {
            this.rows.add(indexOf + 1, blockRow2);
        } else {
            this.rows.add(blockRow2);
        }
        findFocusedRow = blockRow2;
        this.pendingInsertRow = findFocusedRow;
        if (hasCaption(pageBlock)) {
        }
        this.adapter.update(false);
        richEditorHistory = this.history;
        if (richEditorHistory != null) {
        }
        post(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda37
            @Override // java.lang.Runnable
            public final void run() {
                RichEditorListView.this.lambda$addBlock$36(findFocusedRow);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addBlock$36(BlockRow blockRow) {
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
                post(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda59
                    @Override // java.lang.Runnable
                    public final void run() {
                        RichEditorListView.this.lambda$insertDetails$37(blockRow);
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
        post(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda59
            @Override // java.lang.Runnable
            public final void run() {
                RichEditorListView.this.lambda$insertDetails$37(blockRow);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$insertDetails$37(BlockRow blockRow) {
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

    void attachDocument(MessageObject messageObject) {
        if (messageObject == null || messageObject.getDocument() == null) {
            return;
        }
        TLRPC.Document document = messageObject.getDocument();
        TLRPC.Message message = messageObject.messageOwner;
        attachDocument(document, message != null ? message.attachPath : null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: attachDocument, reason: merged with bridge method [inline-methods] */
    public void lambda$attachDocument$38(String str) {
        int i;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        File file = new File(str);
        if (file.exists()) {
            TLRPC.TL_document tL_document = new TLRPC.TL_document();
            tL_document.id = 0L;
            tL_document.dc_id = 0;
            tL_document.size = file.length();
            String name = file.getName();
            int lastIndexOf = name.lastIndexOf(46);
            String mimeTypeFromExtension = (lastIndexOf < 0 || (i = lastIndexOf + 1) >= name.length()) ? null : MimeTypeMap.getSingleton().getMimeTypeFromExtension(name.substring(i).toLowerCase());
            if (TextUtils.isEmpty(mimeTypeFromExtension)) {
                mimeTypeFromExtension = "application/octet-stream";
            }
            tL_document.mime_type = mimeTypeFromExtension;
            TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
            tL_documentAttributeFilename.file_name = name;
            tL_document.attributes.add(tL_documentAttributeFilename);
            attachDocument(tL_document, str);
        }
    }

    private void attachDocument(TLRPC.Document document, String str) {
        if (document == null) {
            return;
        }
        RichEditorHistory richEditorHistory = this.history;
        if (richEditorHistory != null) {
            richEditorHistory.flush();
        }
        TL_iv.pageBlockDocument pageblockdocument = new TL_iv.pageBlockDocument();
        BlockRow blockRow = new BlockRow(pageblockdocument);
        MediaUploadState mediaUploadState = new MediaUploadState();
        blockRow.media = mediaUploadState;
        mediaUploadState.isDocument = true;
        long j = document.id;
        boolean z = j == 0 || document.dc_id == 0 || document.access_hash == 0;
        if (z) {
            if (TextUtils.isEmpty(str) || !new File(str).exists()) {
                return;
            }
            MediaUploadState mediaUploadState2 = blockRow.media;
            mediaUploadState2.document = document;
            mediaUploadState2.localPath = str;
            mediaUploadState2.state = 1;
            mediaUploadState2.progress = 0.0f;
        } else {
            mediaUploadState.document = document;
            mediaUploadState.state = 2;
            pageblockdocument.document_id = j;
        }
        insertPreparedRow(blockRow);
        if (z) {
            startDocumentUpload(blockRow, str, document);
        }
        RichEditorHistory richEditorHistory2 = this.history;
        if (richEditorHistory2 != null) {
            richEditorHistory2.record();
        }
        this.delegate.onContentChanged();
    }

    void attachDocument(final Uri uri) {
        if (uri == null || getContext() == null) {
            return;
        }
        Utilities.globalQueue.postRunnable(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda26
            @Override // java.lang.Runnable
            public final void run() {
                RichEditorListView.this.lambda$attachDocument$39(uri);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$attachDocument$39(Uri uri) {
        final String str;
        try {
            str = AndroidUtilities.getPath(uri);
        } catch (Exception e) {
            FileLog.e(e);
            str = null;
        }
        if (TextUtils.isEmpty(str) || !new File(str).exists()) {
            str = copyDocumentUriToCache(uri);
        }
        if (TextUtils.isEmpty(str) || !new File(str).exists()) {
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda63
            @Override // java.lang.Runnable
            public final void run() {
                RichEditorListView.this.lambda$attachDocument$38(str);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0035 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String copyDocumentUriToCache(Uri uri) {
        String str;
        InputStream openInputStream;
        Cursor query;
        try {
            query = getContext().getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
        } catch (Exception e) {
            e = e;
            str = null;
        }
        try {
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        str = query.getString(0);
                        if (query != null) {
                            try {
                                query.close();
                            } catch (Exception e2) {
                                e = e2;
                                FileLog.e(e);
                                if (TextUtils.isEmpty(str)) {
                                }
                                String replace = str.replace('/', '_').replace('\\', '_');
                                openInputStream = getContext().getContentResolver().openInputStream(uri);
                                if (openInputStream == null) {
                                }
                            }
                        }
                        if (TextUtils.isEmpty(str)) {
                            str = "document_" + SharedConfig.getLastLocalId();
                        }
                        String replace2 = str.replace('/', '_').replace('\\', '_');
                        openInputStream = getContext().getContentResolver().openInputStream(uri);
                        if (openInputStream == null) {
                            if (openInputStream != null) {
                                openInputStream.close();
                            }
                            return null;
                        }
                        try {
                            File file = new File(FileLoader.getDirectory(4), "rich_document_" + Math.abs(uri.hashCode()) + "_" + replace2);
                            FileOutputStream fileOutputStream = new FileOutputStream(file);
                            try {
                                AndroidUtilities.copyFile(openInputStream, fileOutputStream);
                                fileOutputStream.close();
                                String absolutePath = file.getAbsolutePath();
                                openInputStream.close();
                                return absolutePath;
                            } finally {
                            }
                        } finally {
                        }
                    }
                } finally {
                }
            }
            openInputStream = getContext().getContentResolver().openInputStream(uri);
            if (openInputStream == null) {
            }
        } catch (Exception e3) {
            FileLog.e(e3);
            return null;
        }
        str = null;
        if (query != null) {
        }
        if (TextUtils.isEmpty(str)) {
        }
        String replace22 = str.replace('/', '_').replace('\\', '_');
    }

    private void startDocumentUpload(final BlockRow blockRow, final String str, TLRPC.Document document) {
        final MediaUploadState mediaUploadState = blockRow.media;
        RichMediaUploader richMediaUploader = (RichMediaUploader) this.uploaders.remove(mediaUploadState);
        if (richMediaUploader != null) {
            richMediaUploader.cancel();
        }
        RichMediaUploader forDocument = RichMediaUploader.forDocument(this.currentAccount, str, document, new RichMediaUploader.Listener() { // from class: org.telegram.ui.iv.RichEditorListView.15
            @Override // org.telegram.ui.iv.RichMediaUploader.Listener
            public /* synthetic */ void onAudioUploaded(TLRPC.Document document2) {
                RichMediaUploader.Listener.-CC.$default$onAudioUploaded(this, document2);
            }

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
                RichEditorListView.this.invalidateDocumentCell(blockRow);
                RichEditorListView.this.delegate.onContentChanged();
            }

            @Override // org.telegram.ui.iv.RichMediaUploader.Listener
            public void onDocumentUploaded(TLRPC.Document document2) {
                document2.localPath = str;
                FileLoader.getInstance(RichEditorListView.this.currentAccount).setLocalPathTo(document2, str);
                MediaUploadState mediaUploadState2 = mediaUploadState;
                mediaUploadState2.document = document2;
                mediaUploadState2.state = 2;
                TL_iv.PageBlock pageBlock = blockRow.block;
                if (pageBlock instanceof TL_iv.pageBlockDocument) {
                    ((TL_iv.pageBlockDocument) pageBlock).document_id = document2.id;
                }
                RichEditorListView.this.uploaders.remove(mediaUploadState);
                RichEditorListView.this.adapter.update(false);
                RichEditorListView.this.delegate.onContentChanged();
            }

            @Override // org.telegram.ui.iv.RichMediaUploader.Listener
            public void onError() {
                mediaUploadState.state = 3;
                RichEditorListView.this.uploaders.remove(mediaUploadState);
                RichEditorListView.this.rows.remove(blockRow);
                RichEditorListView.this.adapter.update(true);
                RichEditorListView.this.delegate.onContentChanged();
            }
        });
        this.uploaders.put(mediaUploadState, forDocument);
        forDocument.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cancelDocumentUpload(BlockRow blockRow) {
        RichMediaUploader richMediaUploader = (RichMediaUploader) this.uploaders.remove(blockRow.media);
        if (richMediaUploader != null) {
            richMediaUploader.cancel();
        }
        RichEditorHistory richEditorHistory = this.history;
        if (richEditorHistory != null) {
            richEditorHistory.flush();
        }
        this.rows.remove(blockRow);
        this.adapter.update(true);
        RichEditorHistory richEditorHistory2 = this.history;
        if (richEditorHistory2 != null) {
            richEditorHistory2.record();
        }
        this.delegate.onContentChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void invalidateDocumentCell(BlockRow blockRow) {
        View findViewByItemObject = findViewByItemObject(blockRow);
        if (findViewByItemObject instanceof RichDocumentCell) {
            ((RichDocumentCell) findViewByItemObject).refreshUploadState();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void insertPreparedRow(BlockRow blockRow) {
        boolean z;
        int indexOf;
        int indexOf2;
        BlockRow findFocusedRow = findFocusedRow();
        if (findFocusedRow == null) {
            findFocusedRow = this.pendingInsertRow;
        }
        int indexOf3 = findFocusedRow != null ? this.rows.indexOf(findFocusedRow) : -1;
        boolean z2 = false;
        if (indexOf3 < 0 || !(findFocusedRow.block instanceof TL_iv.pageBlockBlockquote)) {
            z = false;
        } else {
            long newId = RichContainer.newId();
            TL_iv.RichText richText = ((TL_iv.pageBlockBlockquote) findFocusedRow.block).caption;
            if (richText != null && !(richText instanceof TL_iv.textEmpty)) {
                this.quoteAuthors.put(Long.valueOf(newId), richText);
            }
            findFocusedRow.quoteIds.add(Long.valueOf(newId));
            findFocusedRow.block = new TL_iv.pageBlockParagraph();
            z = true;
        }
        if (indexOf3 >= 0 && !findFocusedRow.quoteIds.isEmpty()) {
            z2 = true;
        }
        if (z2) {
            blockRow.quoteIds.clear();
            blockRow.quoteIds.addAll(findFocusedRow.quoteIds);
        }
        if (indexOf3 >= 0) {
            TL_iv.PageBlock pageBlock = findFocusedRow.block;
            if ((pageBlock instanceof TL_iv.pageBlockParagraph) && findFocusedRow.media == null && RichTextCell.readPlainText(pageBlock).isEmpty()) {
                this.rows.set(indexOf3, blockRow);
                this.pendingInsertRow = blockRow;
                indexOf = this.rows.indexOf(blockRow);
                if (indexOf < this.rows.size() - 1 || isNonText(((BlockRow) this.rows.get(indexOf + 1)).block)) {
                    BlockRow blockRow2 = new BlockRow(new TL_iv.pageBlockParagraph());
                    if (z2) {
                        blockRow2.quoteIds.addAll(blockRow.quoteIds);
                    }
                    this.rows.add(indexOf + 1, blockRow2);
                }
                this.adapter.update(!z);
                indexOf2 = this.rows.indexOf(blockRow) + 1;
                if (indexOf2 > 0 || indexOf2 >= this.rows.size() || isNonText(((BlockRow) this.rows.get(indexOf2)).block)) {
                    return;
                }
                final BlockRow blockRow3 = (BlockRow) this.rows.get(indexOf2);
                post(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda54
                    @Override // java.lang.Runnable
                    public final void run() {
                        RichEditorListView.this.lambda$insertPreparedRow$40(blockRow3);
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
        this.pendingInsertRow = blockRow;
        indexOf = this.rows.indexOf(blockRow);
        if (indexOf < this.rows.size() - 1) {
        }
        BlockRow blockRow22 = new BlockRow(new TL_iv.pageBlockParagraph());
        if (z2) {
        }
        this.rows.add(indexOf + 1, blockRow22);
        this.adapter.update(!z);
        indexOf2 = this.rows.indexOf(blockRow) + 1;
        if (indexOf2 > 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$insertPreparedRow$40(BlockRow blockRow) {
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
        RichMediaUploader forAudio = RichMediaUploader.forAudio(this.currentAccount, str, document, new RichMediaUploader.Listener() { // from class: org.telegram.ui.iv.RichEditorListView.16
            @Override // org.telegram.ui.iv.RichMediaUploader.Listener
            public /* synthetic */ void onDocumentUploaded(TLRPC.Document document2) {
                RichMediaUploader.Listener.-CC.$default$onDocumentUploaded(this, document2);
            }

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
        Utilities.globalQueue.postRunnable(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda30
            @Override // java.lang.Runnable
            public final void run() {
                RichEditorListView.this.lambda$attachExternalMedia$42(uri, startsWith, str2, i, blockRow);
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
    public /* synthetic */ void lambda$attachExternalMedia$42(Uri uri, final boolean z, String str, final int i, final BlockRow blockRow) {
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
                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda68
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            RichEditorListView.this.lambda$attachExternalMedia$41(i, str3, z, i11, i12, i8, i9, intValue, blockRow);
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
                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda68
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            RichEditorListView.this.lambda$attachExternalMedia$41(i, str3, z, i112, i122, i8, i9, intValue, blockRow);
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
                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda68
                            @Override // java.lang.Runnable
                            public final void run() {
                                RichEditorListView.this.lambda$attachExternalMedia$41(i, str3, z, i1122, i1222, i8, i9, intValue, blockRow);
                            }
                        });
                    }
                    final int i11222 = i6;
                    final int i12222 = i10;
                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda68
                        @Override // java.lang.Runnable
                        public final void run() {
                            RichEditorListView.this.lambda$attachExternalMedia$41(i, str3, z, i11222, i12222, i8, i9, intValue, blockRow);
                        }
                    });
                }
                i8 = i4;
                i10 = i3;
                i9 = 0;
                intValue = 0;
                final int i112222 = i6;
                final int i122222 = i10;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda68
                    @Override // java.lang.Runnable
                    public final void run() {
                        RichEditorListView.this.lambda$attachExternalMedia$41(i, str3, z, i112222, i122222, i8, i9, intValue, blockRow);
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
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda68
            @Override // java.lang.Runnable
            public final void run() {
                RichEditorListView.this.lambda$attachExternalMedia$41(i, str3, z, i1122222, i1222222, i8, i9, intValue, blockRow);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$attachExternalMedia$41(int i, String str, boolean z, int i2, int i3, int i4, int i5, int i6, BlockRow blockRow) {
        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, i, 0L, str, z ? i2 : 0, z, i3, i4, 0L);
        photoEntry.setOrientation(i5, i6);
        if (blockRow != null && isMedia(blockRow.block)) {
            addMediaToRow(blockRow, photoEntry);
        } else {
            attachMedia(photoEntry);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0093 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009c A[EXC_TOP_SPLITTER, SYNTHETIC] */
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
        RichMediaConverter richMediaConverter2 = new RichMediaConverter(this.currentAccount, photoEntry, new RichMediaConverter.Listener() { // from class: org.telegram.ui.iv.RichEditorListView.17
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
        RichMediaUploader richMediaUploader2 = new RichMediaUploader(this.currentAccount, str, z, i, i2, i3, new RichMediaUploader.Listener() { // from class: org.telegram.ui.iv.RichEditorListView.18
            @Override // org.telegram.ui.iv.RichMediaUploader.Listener
            public /* synthetic */ void onAudioUploaded(TLRPC.Document document) {
                RichMediaUploader.Listener.-CC.$default$onAudioUploaded(this, document);
            }

            @Override // org.telegram.ui.iv.RichMediaUploader.Listener
            public /* synthetic */ void onDocumentUploaded(TLRPC.Document document) {
                RichMediaUploader.Listener.-CC.$default$onDocumentUploaded(this, document);
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
        blockRow2.quoteIds.addAll(blockRow.quoteIds);
        this.rows.add(indexOf + 1, blockRow2);
        renumberAllRuns();
        this.adapter.update(false);
        RichEditorHistory richEditorHistory2 = this.history;
        if (richEditorHistory2 != null) {
            richEditorHistory2.record();
        }
        post(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda73
            @Override // java.lang.Runnable
            public final void run() {
                RichEditorListView.this.lambda$onCaptionEnter$44(blockRow2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCaptionEnter$44(BlockRow blockRow) {
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
        boolean z;
        int i;
        int indexOf = this.rows.indexOf(blockRow);
        if (indexOf < 0) {
            return;
        }
        RichEditorHistory richEditorHistory = this.history;
        if (richEditorHistory != null) {
            richEditorHistory.flush();
        }
        View findViewByItemObject = findViewByItemObject(blockRow);
        boolean z2 = findViewByItemObject instanceof RichTextCell;
        if (z2) {
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
        if (readStyledText.length() == 0) {
            if (!blockRow.quoteIds.isEmpty()) {
                ArrayList arrayList = blockRow.quoteIds;
                arrayList.remove(arrayList.size() - 1);
                renumberAllRuns();
                this.adapter.update(false);
                RichEditorHistory richEditorHistory2 = this.history;
                if (richEditorHistory2 != null) {
                    richEditorHistory2.record();
                }
                post(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda78
                    @Override // java.lang.Runnable
                    public final void run() {
                        RichEditorListView.this.lambda$onCellEnter$45(blockRow);
                    }
                });
                return;
            }
            if (blockRow.level > 0) {
                cascadeOutdent(indexOf);
                renumberAllRuns();
                this.adapter.update(false);
                RichEditorHistory richEditorHistory3 = this.history;
                if (richEditorHistory3 != null) {
                    richEditorHistory3.record();
                }
                post(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda79
                    @Override // java.lang.Runnable
                    public final void run() {
                        RichEditorListView.this.lambda$onCellEnter$46(blockRow);
                    }
                });
                return;
            }
        }
        CharSequence subSequence = readStyledText.subSequence(0, length);
        CharSequence subSequence2 = readStyledText.subSequence(length, readStyledText.length());
        if (blockRow.block instanceof TL_iv.pageBlockBlockquote) {
            long newId = RichContainer.newId();
            TL_iv.RichText richText = ((TL_iv.pageBlockBlockquote) blockRow.block).caption;
            if (richText != null && !(richText instanceof TL_iv.textEmpty)) {
                this.quoteAuthors.put(Long.valueOf(newId), richText);
            }
            blockRow.quoteIds.add(Long.valueOf(newId));
            blockRow.block = new TL_iv.pageBlockParagraph();
            z = true;
        } else {
            z = false;
        }
        RichTextCell.applyStyledTextToBlock(blockRow.block, subSequence);
        TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
        RichTextCell.applyStyledTextToBlock(pageblockparagraph, subSequence2);
        int i2 = blockRow.num;
        if (i2 > 0) {
            i2++;
        }
        final BlockRow blockRow2 = new BlockRow(pageblockparagraph, blockRow.level, i2);
        blockRow2.checkbox = blockRow.checkbox;
        blockRow2.quoteIds.addAll(blockRow.quoteIds);
        int i3 = indexOf + 1;
        this.rows.add(i3, blockRow2);
        renumberAllRuns();
        if (z) {
            this.adapter.update(false);
            RichEditorHistory richEditorHistory4 = this.history;
            if (richEditorHistory4 != null) {
                richEditorHistory4.record();
            }
            post(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda80
                @Override // java.lang.Runnable
                public final void run() {
                    RichEditorListView.this.lambda$onCellEnter$47(blockRow2);
                }
            });
            return;
        }
        if (z2) {
            ((RichTextCell) findViewByItemObject).getEditText().deleteToEndSilently(length);
        }
        this.adapter.updateWithoutNotify();
        refreshVisibleListPaddingAround(i3);
        int indexOf2 = this.itemRows.indexOf(blockRow2);
        if (indexOf2 < 0) {
            this.adapter.notifyDataSetChanged();
        } else {
            final RecyclerView.ItemAnimator itemAnimator = getItemAnimator();
            setItemAnimator(null);
            this.adapter.notifyItemInserted(indexOf2);
            if (blockRow.num > 0 && (i = indexOf2 + 1) < this.itemRows.size()) {
                this.adapter.notifyItemRangeChanged(i, (this.itemRows.size() - indexOf2) - 1);
            }
            post(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda81
                @Override // java.lang.Runnable
                public final void run() {
                    RichEditorListView.this.lambda$onCellEnter$48(itemAnimator);
                }
            });
        }
        RichEditorHistory richEditorHistory5 = this.history;
        if (richEditorHistory5 != null) {
            richEditorHistory5.record();
        }
        post(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda82
            @Override // java.lang.Runnable
            public final void run() {
                RichEditorListView.this.lambda$onCellEnter$49(blockRow2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCellEnter$48(RecyclerView.ItemAnimator itemAnimator) {
        setItemAnimator(itemAnimator);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCellEnter$49(BlockRow blockRow) {
        View findViewByItemObject = findViewByItemObject(blockRow);
        if (findViewByItemObject instanceof RichTextCell) {
            RichTextCell richTextCell = (RichTextCell) findViewByItemObject;
            richTextCell.requestEditFocus();
            richTextCell.getEditText().setSelection(0);
        }
    }

    private boolean isLastOfInnermostQuote(int i) {
        BlockRow blockRow = (BlockRow) this.rows.get(i);
        if (blockRow.quoteIds.isEmpty()) {
            return false;
        }
        int size = blockRow.quoteIds.size() - 1;
        long longValue = ((Long) blockRow.quoteIds.get(size)).longValue();
        int i2 = i + 1;
        if (i2 >= this.rows.size()) {
            return true;
        }
        BlockRow blockRow2 = (BlockRow) this.rows.get(i2);
        return blockRow2.quoteIds.size() <= size || ((Long) blockRow2.quoteIds.get(size)).longValue() != longValue;
    }

    private boolean isFirstOfInnermostQuote(int i) {
        BlockRow blockRow = (BlockRow) this.rows.get(i);
        if (blockRow.quoteIds.isEmpty()) {
            return false;
        }
        int size = blockRow.quoteIds.size() - 1;
        long longValue = ((Long) blockRow.quoteIds.get(size)).longValue();
        if (i == 0) {
            return true;
        }
        BlockRow blockRow2 = (BlockRow) this.rows.get(i - 1);
        return blockRow2.quoteIds.size() <= size || ((Long) blockRow2.quoteIds.get(size)).longValue() != longValue;
    }

    private boolean collapseSingleBlockQuotes() {
        HashMap hashMap = new HashMap();
        for (int i = 0; i < this.rows.size(); i++) {
            BlockRow blockRow = (BlockRow) this.rows.get(i);
            if (!blockRow.detailsEnd) {
                for (int i2 = 0; i2 < blockRow.quoteIds.size(); i2++) {
                    Map.-EL.merge(hashMap, (Long) blockRow.quoteIds.get(i2), 1, new RichEditorListView$$ExternalSyntheticLambda61());
                }
            }
        }
        boolean z = false;
        for (int i3 = 0; i3 < this.rows.size(); i3++) {
            BlockRow blockRow2 = (BlockRow) this.rows.get(i3);
            if (blockRow2.quoteIds.size() == 1 && (blockRow2.block instanceof TL_iv.pageBlockParagraph)) {
                Long l = (Long) blockRow2.quoteIds.get(0);
                l.longValue();
                Integer num = (Integer) hashMap.get(l);
                if (num != null && num.intValue() == 1) {
                    TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                    TL_iv.RichText richText = blockRow2.block.text;
                    if (richText == null) {
                        richText = new TL_iv.textEmpty();
                    }
                    pageblockblockquote.text = richText;
                    TL_iv.RichText richText2 = (TL_iv.RichText) this.quoteAuthors.remove(l);
                    if (richText2 == null) {
                        richText2 = new TL_iv.textEmpty();
                    }
                    pageblockblockquote.caption = richText2;
                    blockRow2.block = pageblockblockquote;
                    blockRow2.quoteIds.clear();
                    z = true;
                }
            }
        }
        return z;
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
            int captureCaret = captureCaret(blockRow);
            cascadeOutdent(indexOf);
            renumberAllRuns();
            if (hasFocusedEdit()) {
                applyInPlaceUpdateKeepingFocus();
                RichEditorHistory richEditorHistory2 = this.history;
                if (richEditorHistory2 != null) {
                    richEditorHistory2.record();
                }
                restoreCaret(blockRow, captureCaret);
            } else {
                this.adapter.update(false);
                RichEditorHistory richEditorHistory3 = this.history;
                if (richEditorHistory3 != null) {
                    richEditorHistory3.record();
                }
                post(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda83
                    @Override // java.lang.Runnable
                    public final void run() {
                        RichEditorListView.this.lambda$onCellBackspaceAtStart$50(blockRow);
                    }
                });
            }
            return true;
        }
        if (!blockRow.quoteIds.isEmpty() && z && (isFirstOfInnermostQuote(indexOf) || !isLastOfInnermostQuote(indexOf))) {
            RichEditorHistory richEditorHistory4 = this.history;
            if (richEditorHistory4 != null) {
                richEditorHistory4.flush();
            }
            ArrayList arrayList = blockRow.quoteIds;
            arrayList.remove(arrayList.size() - 1);
            collapseSingleBlockQuotes();
            renumberAllRuns();
            this.adapter.update(false);
            RichEditorHistory richEditorHistory5 = this.history;
            if (richEditorHistory5 != null) {
                richEditorHistory5.record();
            }
            post(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda84
                @Override // java.lang.Runnable
                public final void run() {
                    RichEditorListView.this.lambda$onCellBackspaceAtStart$51(blockRow);
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
                RichEditorHistory richEditorHistory6 = this.history;
                if (richEditorHistory6 != null) {
                    richEditorHistory6.flush();
                }
                this.rows.remove(indexOf);
                renumberAllRuns();
                this.adapter.update(false);
                RichEditorHistory richEditorHistory7 = this.history;
                if (richEditorHistory7 != null) {
                    richEditorHistory7.record();
                }
                post(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda89
                    @Override // java.lang.Runnable
                    public final void run() {
                        RichEditorListView.this.lambda$onCellBackspaceAtStart$52(blockRow2);
                    }
                });
            }
            return true;
        }
        if (isNonText(blockRow2.block)) {
            RichEditorHistory richEditorHistory8 = this.history;
            if (richEditorHistory8 != null) {
                richEditorHistory8.flush();
            }
            this.rows.remove(i2);
            renumberAllRuns();
            this.adapter.update(false);
            RichEditorHistory richEditorHistory9 = this.history;
            if (richEditorHistory9 != null) {
                richEditorHistory9.record();
            }
            post(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda85
                @Override // java.lang.Runnable
                public final void run() {
                    RichEditorListView.this.lambda$onCellBackspaceAtStart$53(blockRow);
                }
            });
            return true;
        }
        RichEditorHistory richEditorHistory10 = this.history;
        if (richEditorHistory10 != null) {
            richEditorHistory10.flush();
        }
        View findViewByItemObject = findViewByItemObject(blockRow2);
        int indexOf2 = this.itemRows.indexOf(blockRow);
        if ((findViewByItemObject instanceof RichTextCell) && indexOf2 >= 0) {
            RichTextCell richTextCell = (RichTextCell) findViewByItemObject;
            RichEditText editText = richTextCell.getEditText();
            int length = editText.length();
            editText.appendSilently(RichTextCell.readStyledText(blockRow.block));
            RichTextCell.applyStyledTextToBlock(blockRow2.block, editText.getText());
            View findViewByItemObject2 = findViewByItemObject(blockRow);
            if (findViewByItemObject2 instanceof RichTextCell) {
                ((RichTextCell) findViewByItemObject2).getEditText().deleteToEndSilently(0);
            }
            richTextCell.requestEditFocus();
            editText.setSelection(Math.max(0, Math.min(length, editText.length())));
            this.rows.remove(indexOf);
            boolean collapseSingleBlockQuotes = collapseSingleBlockQuotes();
            renumberAllRuns();
            if (collapseSingleBlockQuotes) {
                this.adapter.update(false);
                RichEditorHistory richEditorHistory11 = this.history;
                if (richEditorHistory11 != null) {
                    richEditorHistory11.record();
                }
                final int max = Math.max(0, length);
                post(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda86
                    @Override // java.lang.Runnable
                    public final void run() {
                        RichEditorListView.this.lambda$onCellBackspaceAtStart$54(blockRow2, max);
                    }
                });
                return true;
            }
            this.adapter.updateWithoutNotify();
            refreshVisibleListPaddingAround(indexOf);
            final RecyclerView.ItemAnimator itemAnimator = getItemAnimator();
            setItemAnimator(null);
            this.adapter.notifyItemRemoved(indexOf2);
            if ((blockRow2.num > 0 || blockRow.num > 0) && indexOf2 < this.itemRows.size()) {
                this.adapter.notifyItemRangeChanged(indexOf2, this.itemRows.size() - indexOf2);
            }
            post(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda87
                @Override // java.lang.Runnable
                public final void run() {
                    RichEditorListView.this.lambda$onCellBackspaceAtStart$55(itemAnimator);
                }
            });
            RichEditorHistory richEditorHistory12 = this.history;
            if (richEditorHistory12 != null) {
                richEditorHistory12.record();
            }
            return true;
        }
        CharSequence readStyledText = RichTextCell.readStyledText(blockRow2.block);
        final int length2 = readStyledText.length();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(readStyledText);
        spannableStringBuilder.append(RichTextCell.readStyledText(blockRow.block));
        RichTextCell.applyStyledTextToBlock(blockRow2.block, spannableStringBuilder);
        this.rows.remove(indexOf);
        collapseSingleBlockQuotes();
        renumberAllRuns();
        this.adapter.update(false);
        RichEditorHistory richEditorHistory13 = this.history;
        if (richEditorHistory13 != null) {
            richEditorHistory13.record();
        }
        post(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda88
            @Override // java.lang.Runnable
            public final void run() {
                RichEditorListView.this.lambda$onCellBackspaceAtStart$56(blockRow2, length2);
            }
        });
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCellBackspaceAtStart$54(BlockRow blockRow, int i) {
        View findViewByItemObject = findViewByItemObject(blockRow);
        if (findViewByItemObject instanceof RichTextCell) {
            RichTextCell richTextCell = (RichTextCell) findViewByItemObject;
            richTextCell.requestEditFocus();
            richTextCell.getEditText().setSelection(Math.max(0, Math.min(i, richTextCell.getEditText().length())));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCellBackspaceAtStart$55(RecyclerView.ItemAnimator itemAnimator) {
        setItemAnimator(itemAnimator);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCellBackspaceAtStart$56(BlockRow blockRow, int i) {
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
        makeMenu.allowShowingOnTopOfKeyboard();
        makeMenu.setMaxHeight(AndroidUtilities.dp(350.0f));
        makeMenu.addChecked(TextUtils.isEmpty(pageblockpreformatted.language), LocaleController.getString(R.string.ArticleNone), new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda75
            @Override // java.lang.Runnable
            public final void run() {
                RichEditorListView.this.lambda$onLanguageClick$57(blockRow);
            }
        });
        if (!TextUtils.isEmpty(pageblockpreformatted.language)) {
            makeMenu.addChecked(true, MessageObject.TextLayoutBlock.capitalizeLanguage(pageblockpreformatted.language), null);
        }
        makeMenu.addGap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            final String str = (String) it.next();
            makeMenu.addChecked(TextUtils.equals(str, pageblockpreformatted.language), MessageObject.TextLayoutBlock.capitalizeLanguage(str), new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda76
                @Override // java.lang.Runnable
                public final void run() {
                    RichEditorListView.this.lambda$onLanguageClick$58(blockRow, str);
                }
            });
        }
        makeMenu.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onLanguageClick$57(BlockRow blockRow) {
        lambda$onLanguageClick$58(blockRow, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: updateLanguageOf, reason: merged with bridge method [inline-methods] */
    public void lambda$onLanguageClick$58(BlockRow blockRow, String str) {
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
    public void lambda$onTapBelowContent$15(BlockRow blockRow) {
        View findViewByItemObject = findViewByItemObject(blockRow);
        if (findViewByItemObject instanceof RichTextCell) {
            RichTextCell richTextCell = (RichTextCell) findViewByItemObject;
            richTextCell.requestEditFocus();
            RichEditText editText = richTextCell.getEditText();
            editText.setSelection(editText.length());
            return;
        }
        if (findViewByItemObject instanceof RichDetailsCell) {
            RichDetailsCell richDetailsCell = (RichDetailsCell) findViewByItemObject;
            richDetailsCell.requestEditFocus();
            RichEditText editText2 = richDetailsCell.getEditText();
            editText2.setSelection(editText2.length());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: focusRowAtStart, reason: merged with bridge method [inline-methods] */
    public void lambda$onTapAboveContent$13(BlockRow blockRow) {
        View findViewByItemObject = findViewByItemObject(blockRow);
        if (findViewByItemObject instanceof RichTextCell) {
            RichTextCell richTextCell = (RichTextCell) findViewByItemObject;
            richTextCell.requestEditFocus();
            richTextCell.getEditText().setSelection(0);
        } else if (findViewByItemObject instanceof RichDetailsCell) {
            RichDetailsCell richDetailsCell = (RichDetailsCell) findViewByItemObject;
            richDetailsCell.requestEditFocus();
            richDetailsCell.getEditText().setSelection(0);
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
        if (hasFocusedEdit()) {
            applyInPlaceUpdateKeepingFocus();
        } else {
            this.adapter.update(false);
        }
        RichEditorHistory richEditorHistory2 = this.history;
        if (richEditorHistory2 != null) {
            richEditorHistory2.record();
        }
        restoreCaret(blockRow, captureCaret);
        return true;
    }

    private int[] selectedRowRange() {
        TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper = this.textSelectionHelper;
        if (articleTextSelectionHelper != null && articleTextSelectionHelper.isInSelectionMode()) {
            int indexOf = this.rows.indexOf(rowForCell(this.textSelectionHelper.getStartCell()));
            int indexOf2 = this.rows.indexOf(rowForCell(this.textSelectionHelper.getEndCell()));
            if (indexOf < 0 || indexOf2 < 0) {
                return null;
            }
            return new int[]{Math.min(indexOf, indexOf2), Math.max(indexOf, indexOf2)};
        }
        BlockRow findFocusedRow = findFocusedRow();
        int indexOf3 = findFocusedRow != null ? this.rows.indexOf(findFocusedRow) : -1;
        if (indexOf3 >= 0) {
            return new int[]{indexOf3, indexOf3};
        }
        return null;
    }

    private boolean isRangeQuoted(int i, int i2) {
        if (i < 0 || i2 >= this.rows.size() || i > i2) {
            return false;
        }
        boolean z = false;
        while (i <= i2) {
            BlockRow blockRow = (BlockRow) this.rows.get(i);
            if (!blockRow.detailsEnd && !isDetailsHeader(blockRow)) {
                if (blockRow.quoteIds.isEmpty() && !RichTextCell.isQuoteBlock(blockRow.block)) {
                    return false;
                }
                z = true;
            }
            i++;
        }
        return z;
    }

    public boolean isSelectionQuoted() {
        int[] selectedRowRange = selectedRowRange();
        return selectedRowRange != null && isRangeQuoted(selectedRowRange[0], selectedRowRange[1]);
    }

    public void toggleQuoteOnSelection() {
        int[] selectedRowRange = selectedRowRange();
        if (selectedRowRange == null) {
            return;
        }
        int i = selectedRowRange[0];
        int i2 = selectedRowRange[1];
        if (i < 0 || i2 >= this.rows.size() || i > i2) {
            return;
        }
        RichEditorHistory richEditorHistory = this.history;
        if (richEditorHistory != null) {
            richEditorHistory.flush();
        }
        if (isRangeQuoted(i, i2)) {
            for (int i3 = i; i3 <= i2; i3++) {
                BlockRow blockRow = (BlockRow) this.rows.get(i3);
                if (!blockRow.detailsEnd && !isDetailsHeader(blockRow)) {
                    if (RichTextCell.isQuoteBlock(blockRow.block)) {
                        TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                        pageblockparagraph.text = blockRow.block.text;
                        blockRow.block = pageblockparagraph;
                    } else if (!blockRow.quoteIds.isEmpty()) {
                        ArrayList arrayList = blockRow.quoteIds;
                        arrayList.remove(arrayList.size() - 1);
                    }
                }
            }
        } else {
            long newId = RichContainer.newId();
            for (int i4 = i; i4 <= i2; i4++) {
                BlockRow blockRow2 = (BlockRow) this.rows.get(i4);
                if (!blockRow2.detailsEnd && !isDetailsHeader(blockRow2)) {
                    if (RichTextCell.isQuoteBlock(blockRow2.block)) {
                        long newId2 = RichContainer.newId();
                        TL_iv.RichText extractCaption = RichTextCell.extractCaption(blockRow2.block);
                        if (extractCaption != null && !(extractCaption instanceof TL_iv.textEmpty)) {
                            this.quoteAuthors.put(Long.valueOf(newId2), extractCaption);
                        }
                        blockRow2.quoteIds.add(Long.valueOf(newId2));
                        TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                        pageblockparagraph2.text = blockRow2.block.text;
                        blockRow2.block = pageblockparagraph2;
                    }
                    blockRow2.quoteIds.add(0, Long.valueOf(newId));
                }
            }
        }
        collapseSingleBlockQuotes();
        normalizeNestedQuotes();
        renumberAllRuns();
        TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper = this.textSelectionHelper;
        boolean z = articleTextSelectionHelper != null && articleTextSelectionHelper.isInSelectionMode();
        ArrayList arrayList2 = this.rows;
        final BlockRow blockRow3 = (BlockRow) arrayList2.get(Math.max(0, Math.min(i, arrayList2.size() - 1)));
        ArrayList arrayList3 = this.rows;
        final BlockRow blockRow4 = (BlockRow) arrayList3.get(Math.max(0, Math.min(i2, arrayList3.size() - 1)));
        this.adapter.update(false);
        RichEditorHistory richEditorHistory2 = this.history;
        if (richEditorHistory2 != null) {
            richEditorHistory2.record();
        }
        if (z) {
            post(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    RichEditorListView.this.lambda$toggleQuoteOnSelection$59(blockRow3, blockRow4);
                }
            });
        } else {
            post(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    RichEditorListView.this.lambda$toggleQuoteOnSelection$60(blockRow3);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: reselectRowRange, reason: merged with bridge method [inline-methods] */
    public void lambda$toggleQuoteOnSelection$59(BlockRow blockRow, BlockRow blockRow2) {
        if (this.textSelectionHelper == null || blockRow == null || blockRow2 == null) {
            return;
        }
        int indexOf = this.itemRows.indexOf(blockRow);
        int indexOf2 = this.itemRows.indexOf(blockRow2);
        if (indexOf < 0 || indexOf2 < 0) {
            return;
        }
        for (int i = 0; i < this.itemRows.size(); i++) {
            BlockRow blockRow3 = (BlockRow) this.itemRows.get(i);
            long j = blockRow3.authorQuoteId;
            if (j != 0) {
                this.textSelectionHelper.cacheText(i, RichTextStyle.plainOf((TL_iv.RichText) this.quoteAuthors.get(Long.valueOf(j))), null);
            } else {
                this.textSelectionHelper.cacheText(i, RichTextCell.readPlainText(blockRow3.block), null);
            }
        }
        this.textSelectionHelper.selectAllBlocksRange(Math.min(indexOf, indexOf2), Math.max(indexOf, indexOf2));
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
            TL_iv.RichText extractCaption = RichTextCell.extractCaption(blockRow2.block);
            if (extractCaption != null && RichTextCell.extractCaption(pageBlock) != null) {
                RichTextCell.setCaption(pageBlock, extractCaption);
            }
        }
        transformRow(blockRow2, pageBlock, i, i2, z, z2);
    }

    void turnIntoKeepList(BlockRow blockRow, TL_iv.PageBlock pageBlock) {
        if (blockRow == null) {
            blockRow = turnIntoTarget();
        }
        BlockRow blockRow2 = blockRow;
        if (blockRow2 == null) {
            return;
        }
        turnInto(blockRow2, pageBlock, blockRow2.level, blockRow2.num, blockRow2.checkbox, blockRow2.checked);
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

    void applyQuote(final BlockRow blockRow) {
        if (blockRow == null) {
            blockRow = turnIntoTarget();
        }
        if (blockRow == null || this.rows.indexOf(blockRow) < 0 || isDetailsHeader(blockRow) || blockRow.detailsEnd) {
            return;
        }
        RichEditorHistory richEditorHistory = this.history;
        if (richEditorHistory != null) {
            richEditorHistory.flush();
        }
        boolean z = blockRow.quoteIds.isEmpty() && !RichTextCell.isQuoteBlock(blockRow.block);
        if (z) {
            blockRow.block = newBlockquote();
        } else {
            if (RichTextCell.isQuoteBlock(blockRow.block)) {
                long newId = RichContainer.newId();
                TL_iv.RichText extractCaption = RichTextCell.extractCaption(blockRow.block);
                if (extractCaption != null && !(extractCaption instanceof TL_iv.textEmpty)) {
                    this.quoteAuthors.put(Long.valueOf(newId), extractCaption);
                }
                blockRow.quoteIds.add(Long.valueOf(newId));
            }
            blockRow.block = new TL_iv.pageBlockParagraph();
            blockRow.quoteIds.add(Long.valueOf(RichContainer.newId()));
        }
        renumberAllRuns();
        if (z && hasFocusedEdit()) {
            applyInPlaceUpdateKeepingFocus();
            RichEditorHistory richEditorHistory2 = this.history;
            if (richEditorHistory2 != null) {
                richEditorHistory2.record();
            }
            lambda$tryPlainArrowAcrossCells$71(blockRow);
            return;
        }
        this.adapter.update(false);
        RichEditorHistory richEditorHistory3 = this.history;
        if (richEditorHistory3 != null) {
            richEditorHistory3.record();
        }
        post(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda90
            @Override // java.lang.Runnable
            public final void run() {
                RichEditorListView.this.lambda$applyQuote$61(blockRow);
            }
        });
    }

    private boolean normalizeNestedQuotes() {
        boolean z = false;
        for (int i = 0; i < this.rows.size(); i++) {
            BlockRow blockRow = (BlockRow) this.rows.get(i);
            if (!blockRow.quoteIds.isEmpty() && RichTextCell.isQuoteBlock(blockRow.block)) {
                long newId = RichContainer.newId();
                TL_iv.RichText extractCaption = RichTextCell.extractCaption(blockRow.block);
                if (extractCaption != null && !(extractCaption instanceof TL_iv.textEmpty)) {
                    this.quoteAuthors.put(Long.valueOf(newId), extractCaption);
                }
                blockRow.quoteIds.add(Long.valueOf(newId));
                TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                pageblockparagraph.text = blockRow.block.text;
                blockRow.block = pageblockparagraph;
                z = true;
            }
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void transformRow(BlockRow blockRow, TL_iv.PageBlock pageBlock, int i, int i2, boolean z, boolean z2) {
        final BlockRow blockRow2;
        RichEditorHistory richEditorHistory;
        int indexOf = this.rows.indexOf(blockRow);
        if (indexOf < 0) {
            return;
        }
        RichEditorHistory richEditorHistory2 = this.history;
        if (richEditorHistory2 != null) {
            richEditorHistory2.flush();
        }
        blockRow.block = pageBlock;
        blockRow.level = i;
        blockRow.num = i2;
        blockRow.checkbox = z;
        blockRow.checked = z2;
        renumberAllRuns();
        boolean z3 = pageBlock instanceof TL_iv.pageBlockTable;
        if (z3) {
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
                blockRow2 = (BlockRow) this.rows.get(i4);
            } else {
                blockRow2 = new BlockRow(new TL_iv.pageBlockParagraph());
                this.rows.add(i4, blockRow2);
            }
            if (blockRow2 != blockRow && !z3 && !isNonText(pageBlock) && hasFocusedEdit()) {
                applyInPlaceUpdateKeepingFocus();
                RichEditorHistory richEditorHistory3 = this.history;
                if (richEditorHistory3 != null) {
                    richEditorHistory3.record();
                }
                View findViewByItemObject = findViewByItemObject(blockRow);
                if (findViewByItemObject instanceof RichTextCell) {
                    RichTextCell richTextCell = (RichTextCell) findViewByItemObject;
                    richTextCell.requestEditFocus();
                    richTextCell.getEditText().setSelection(richTextCell.getEditText().length());
                    return;
                }
                return;
            }
            this.adapter.update(false);
            richEditorHistory = this.history;
            if (richEditorHistory != null) {
                richEditorHistory.record();
            }
            post(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda55
                @Override // java.lang.Runnable
                public final void run() {
                    RichEditorListView.this.lambda$transformRow$62(blockRow2);
                }
            });
        }
        blockRow2 = blockRow;
        if (blockRow2 != blockRow) {
        }
        this.adapter.update(false);
        richEditorHistory = this.history;
        if (richEditorHistory != null) {
        }
        post(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda55
            @Override // java.lang.Runnable
            public final void run() {
                RichEditorListView.this.lambda$transformRow$62(blockRow2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$transformRow$62(BlockRow blockRow) {
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
            if (hasFocusedEdit()) {
                applyInPlaceUpdateKeepingFocus();
            } else {
                this.adapter.update(false);
            }
            RichEditorHistory richEditorHistory2 = this.history;
            if (richEditorHistory2 != null) {
                richEditorHistory2.record();
            }
        }
        return z2;
    }

    boolean canIndentRow(int i) {
        if (i < 0 || i >= this.rows.size()) {
            return false;
        }
        BlockRow blockRow = (BlockRow) this.rows.get(i);
        if (blockRow.level == 0) {
            if (!isListableText(blockRow.block) && !canNonTextJoinList(i)) {
                return false;
            }
        } else if (i <= 0 || ((BlockRow) this.rows.get(i - 1)).level < blockRow.level) {
            return false;
        }
        return indentKeepsDepth(i);
    }

    private boolean canNonTextJoinList(int i) {
        return i > 0 && i < this.rows.size() && isNonText(((BlockRow) this.rows.get(i)).block) && ((BlockRow) this.rows.get(i - 1)).level >= 1;
    }

    BlockRow currentBlockRow() {
        int startCell;
        BlockRow rowForCell;
        BlockRow findFocusedRow = findFocusedRow();
        if (findFocusedRow != null) {
            return findFocusedRow;
        }
        TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper = this.textSelectionHelper;
        if (articleTextSelectionHelper == null || (startCell = articleTextSelectionHelper.getStartCell()) < 0 || (rowForCell = rowForCell(startCell)) == null) {
            return null;
        }
        return rowForCell;
    }

    boolean canIndentTarget(BlockRow blockRow) {
        int indexOf;
        return blockRow != null && (indexOf = this.rows.indexOf(blockRow)) >= 0 && canIndentRow(indexOf);
    }

    boolean canOutdentTarget(BlockRow blockRow) {
        int indexOf;
        return blockRow != null && (indexOf = this.rows.indexOf(blockRow)) >= 0 && blockRow.level > 0 && canOutdentRow(indexOf);
    }

    private int[] selectionRowRange() {
        TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper = this.textSelectionHelper;
        if (articleTextSelectionHelper == null) {
            return null;
        }
        int startCell = articleTextSelectionHelper.getStartCell();
        int endCell = this.textSelectionHelper.getEndCell();
        if (startCell >= 0 && endCell >= 0) {
            BlockRow rowForCell = rowForCell(startCell);
            BlockRow rowForCell2 = rowForCell(endCell);
            if (rowForCell != null && rowForCell2 != null) {
                int indexOf = this.rows.indexOf(rowForCell);
                int indexOf2 = this.rows.indexOf(rowForCell2);
                if (indexOf >= 0 && indexOf2 >= 0) {
                    if (indexOf > indexOf2) {
                        indexOf2 = indexOf;
                        indexOf = indexOf2;
                    }
                    return new int[]{indexOf, indexOf2};
                }
            }
        }
        return null;
    }

    boolean indentSelection(boolean z) {
        int i;
        int i2;
        int[] selectionRowRange = selectionRowRange();
        if (selectionRowRange == null || (i = selectionRowRange[0]) == (i2 = selectionRowRange[1])) {
            BlockRow currentBlockRow = selectionRowRange == null ? currentBlockRow() : (BlockRow) this.rows.get(selectionRowRange[0]);
            return currentBlockRow != null && onCellIndent(currentBlockRow, z);
        }
        return rangeIndent(i, i2, z);
    }

    boolean canIndentSelection() {
        int[] selectionRowRange = selectionRowRange();
        if (selectionRowRange == null) {
            return canIndentTarget(currentBlockRow());
        }
        for (int i = selectionRowRange[0]; i <= selectionRowRange[1]; i++) {
            if (canIndentTarget((BlockRow) this.rows.get(i))) {
                return true;
            }
        }
        return false;
    }

    boolean canOutdentSelection() {
        int[] selectionRowRange = selectionRowRange();
        if (selectionRowRange == null) {
            return canOutdentTarget(currentBlockRow());
        }
        for (int i = selectionRowRange[0]; i <= selectionRowRange[1]; i++) {
            if (canOutdentTarget((BlockRow) this.rows.get(i))) {
                return true;
            }
        }
        return false;
    }

    boolean canOutdentRow(int i) {
        return i >= 0 && i < this.rows.size() && ((BlockRow) this.rows.get(i)).level > 0;
    }

    private boolean indentRow(int i, boolean z, boolean z2) {
        int i2 = 0;
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
            boolean isListableText = isListableText(blockRow.block);
            if ((!isListableText && !canNonTextJoinList(i)) || !indentKeepsDepth(i)) {
                return false;
            }
            BlockRow blockRow2 = i > 0 ? (BlockRow) this.rows.get(i - 1) : null;
            if (isListableText) {
                blockRow.level = 1;
                if (blockRow2 != null && blockRow2.num > 0) {
                    i2 = 1;
                }
                blockRow.num = i2;
            } else {
                blockRow.level = blockRow2.level;
                blockRow.num = blockRow2.num > 0 ? 1 : 0;
                blockRow.checkbox = false;
                blockRow.checked = false;
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

    /* JADX INFO: Access modifiers changed from: private */
    public void renumberAllRuns() {
        for (int i = 0; i < this.rows.size(); i++) {
            BlockRow blockRow = (BlockRow) this.rows.get(i);
            if (blockRow.level > 0 && blockRow.num > 0 && !isNonText(blockRow.block)) {
                int i2 = blockRow.level;
                int i3 = 1;
                for (int i4 = i - 1; i4 >= 0; i4--) {
                    BlockRow blockRow2 = (BlockRow) this.rows.get(i4);
                    int i5 = blockRow2.level;
                    if (i5 < i2) {
                        break;
                    }
                    if (i5 == i2 && !isNonText(blockRow2.block)) {
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
        post(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                RichEditorListView.this.lambda$restoreCaret$63(blockRow, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$restoreCaret$63(BlockRow blockRow, int i) {
        View findViewByItemObject = findViewByItemObject(blockRow);
        if (findViewByItemObject instanceof RichTextCell) {
            RichTextCell richTextCell = (RichTextCell) findViewByItemObject;
            richTextCell.requestEditFocus();
            richTextCell.getEditText().setSelection(Math.max(0, Math.min(i, richTextCell.getEditText().length())));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: focusRow, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void lambda$tryPlainArrowAcrossCells$71(BlockRow blockRow) {
        View findViewByItemObject = findViewByItemObject(blockRow);
        if (findViewByItemObject instanceof RichTextCell) {
            ((RichTextCell) findViewByItemObject).requestEditFocus();
        } else if (findViewByItemObject instanceof RichDetailsCell) {
            ((RichDetailsCell) findViewByItemObject).requestEditFocus();
        }
    }

    private boolean hasFocusedEdit() {
        return findFocus() instanceof RichEditText;
    }

    private void applyInPlaceUpdateKeepingFocus() {
        this.adapter.updateWithoutNotify();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof RichTextCell) {
                ((RichTextCell) childAt).rebindInPlace();
            }
        }
    }

    private void refreshVisibleListPaddingAround(int i) {
        int min = Math.min(this.rows.size() - 1, i + 1);
        for (int max = Math.max(0, i - 1); max <= min; max++) {
            BlockRow blockRow = (BlockRow) this.rows.get(max);
            if (blockRow.level > 0) {
                View findViewByItemObject = findViewByItemObject(blockRow);
                if (findViewByItemObject instanceof RichTextCell) {
                    ((RichTextCell) findViewByItemObject).refreshListVerticalPadding();
                }
            }
        }
    }

    private static boolean isListableText(TL_iv.PageBlock pageBlock) {
        return (pageBlock instanceof TL_iv.pageBlockParagraph) || isHeading(pageBlock) || (pageBlock instanceof TL_iv.pageBlockPreformatted) || (pageBlock instanceof TL_iv.pageBlockFooter);
    }

    private static boolean isNonText(TL_iv.PageBlock pageBlock) {
        return (pageBlock instanceof TL_iv.pageBlockDivider) || (pageBlock instanceof TL_iv.pageBlockPhoto) || (pageBlock instanceof TL_iv.pageBlockVideo) || (pageBlock instanceof TL_iv.pageBlockCollage) || (pageBlock instanceof TL_iv.pageBlockSlideshow) || (pageBlock instanceof TL_iv.pageBlockAudio) || (pageBlock instanceof TL_iv.pageBlockDocument) || (pageBlock instanceof TL_iv.pageBlockMath) || (pageBlock instanceof TL_iv.pageBlockMap) || (pageBlock instanceof TL_iv.pageBlockTable) || (pageBlock instanceof TL_iv.pageBlockList) || (pageBlock instanceof TL_iv.pageBlockOrderedList);
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

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        if ((r3 instanceof org.telegram.tgnet.tl.TL_iv.pageBlockDocument) == false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    boolean hasAnyText() {
        for (int i = 0; i < this.rows.size(); i++) {
            BlockRow blockRow = (BlockRow) this.rows.get(i);
            if (!RichTextCell.readPlainText(blockRow.block).isEmpty()) {
                return true;
            }
            if (!isMedia(blockRow.block)) {
                TL_iv.PageBlock pageBlock = blockRow.block;
                if (!(pageBlock instanceof TL_iv.pageBlockAudio)) {
                }
            }
            for (MediaUploadState mediaUploadState : mediasOf(blockRow)) {
                if (mediaUploadState.isReady() || mediaUploadState.isPending()) {
                    return true;
                }
            }
            TL_iv.PageBlock pageBlock2 = blockRow.block;
            if ((pageBlock2 instanceof TL_iv.pageBlockMath) && !TextUtils.isEmpty(((TL_iv.pageBlockMath) pageBlock2).source)) {
                return true;
            }
            TL_iv.PageBlock pageBlock3 = blockRow.block;
            if ((pageBlock3 instanceof TL_iv.pageBlockMap) && RichMapCell.hasGeo((TL_iv.pageBlockMap) pageBlock3)) {
                return true;
            }
            TL_iv.PageBlock pageBlock4 = blockRow.block;
            if ((pageBlock4 instanceof TL_iv.pageBlockTable) && tableHasText((TL_iv.pageBlockTable) pageBlock4)) {
                return true;
            }
        }
        return false;
    }

    private static boolean tableHasText(TL_iv.pageBlockTable pageblocktable) {
        TL_iv.RichText richText = pageblocktable.title;
        if (richText != null && !TextUtils.isEmpty(RichTextStyle.plainOf(richText))) {
            return true;
        }
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
        MediaUploadState mediaUploadState;
        TLRPC.Document document2;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        for (int i = 0; i < this.rows.size(); i++) {
            BlockRow blockRow = (BlockRow) this.rows.get(i);
            if ((blockRow.block instanceof TL_iv.pageBlockDocument) && (mediaUploadState = blockRow.media) != null && mediaUploadState.isReady() && (document2 = blockRow.media.document) != null) {
                ((TL_iv.pageBlockDocument) blockRow.block).document_id = document2.id;
            }
            for (MediaUploadState mediaUploadState2 : mediasOf(blockRow)) {
                if (mediaUploadState2.isReady() && (document = mediaUploadState2.document) != null) {
                    long j = document.id;
                    if (j != 0 && document.access_hash != 0 && hashSet.add(Long.valueOf(j))) {
                        arrayList.add(mediaUploadState2.document);
                    }
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
        return ((pageBlock instanceof TL_iv.pageBlockBlockquote) || (pageBlock instanceof TL_iv.pageBlockBlockquoteBlocks) || (pageBlock instanceof TL_iv.pageBlockPullquote) || isNonText(pageBlock) || (pageBlock instanceof TL_iv.pageBlockDetails) || !RichTextCell.readPlainText(pageBlock).isEmpty()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ArrayList flattenRange(int i, int i2, boolean z) {
        return flattenRange(i, i2, z, 0);
    }

    private ArrayList flattenRange(int i, int i2, boolean z, int i3) {
        ArrayList arrayList = new ArrayList();
        loop0: while (true) {
            int i4 = i;
            while (i4 < i2) {
                BlockRow blockRow = (BlockRow) this.rows.get(i4);
                if (!blockRow.detailsEnd) {
                    if (blockRow.quoteIds.size() > i3) {
                        long longValue = ((Long) blockRow.quoteIds.get(i3)).longValue();
                        i = i4 + 1;
                        while (i < i2) {
                            BlockRow blockRow2 = (BlockRow) this.rows.get(i);
                            if (blockRow2.quoteIds.size() <= i3 || ((Long) blockRow2.quoteIds.get(i3)).longValue() != longValue) {
                                break;
                            }
                            i++;
                        }
                        TL_iv.PageBlock buildQuoteBlock = buildQuoteBlock(flattenRange(i4, i, true, i3 + 1), longValue);
                        if (buildQuoteBlock != null) {
                            arrayList.add(buildQuoteBlock);
                        }
                    } else if (isDetailsHeader(blockRow)) {
                        TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) blockRow.block;
                        if (pageblockdetails.title == null) {
                            pageblockdetails.title = new TL_iv.textEmpty();
                        }
                        int matchingDetailsEnd = matchingDetailsEnd(i4);
                        pageblockdetails.blocks = flattenRange(i4 + 1, Math.min(matchingDetailsEnd, i2), true, i3);
                        arrayList.add(pageblockdetails);
                        i4 = matchingDetailsEnd + 1;
                    } else {
                        int i5 = blockRow.level;
                        if (i5 <= 0) {
                            emitLeafBlock(blockRow, arrayList);
                        } else {
                            int[] iArr = {i4};
                            TL_iv.PageBlock buildListBlock = buildListBlock(i4, i5, blockRow.num > 0, iArr, i2, i3);
                            if (buildListBlock != null) {
                                arrayList.add(buildListBlock);
                            }
                            i4 = iArr[0];
                            if (i4 <= 0) {
                                i4 = i2;
                            }
                        }
                    }
                }
                i4++;
            }
            break loop0;
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

    private TL_iv.PageBlock buildQuoteBlock(ArrayList arrayList, long j) {
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        TL_iv.RichText quoteAuthor = quoteAuthor(j);
        if (arrayList.size() == 1 && (arrayList.get(0) instanceof TL_iv.pageBlockParagraph)) {
            TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
            pageblockblockquote.text = ((TL_iv.PageBlock) arrayList.get(0)).text != null ? ((TL_iv.PageBlock) arrayList.get(0)).text : new TL_iv.textEmpty();
            pageblockblockquote.caption = quoteAuthor;
            return pageblockblockquote;
        }
        TL_iv.pageBlockBlockquoteBlocks pageblockblockquoteblocks = new TL_iv.pageBlockBlockquoteBlocks();
        pageblockblockquoteblocks.blocks = arrayList;
        pageblockblockquoteblocks.caption = quoteAuthor;
        return pageblockblockquoteblocks;
    }

    private TL_iv.RichText quoteAuthor(long j) {
        TL_iv.RichText richText = (TL_iv.RichText) this.quoteAuthors.get(Long.valueOf(j));
        return richText != null ? richText : new TL_iv.textEmpty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void emitLeafBlock(BlockRow blockRow, ArrayList arrayList) {
        TLRPC.Document document;
        TL_iv.pageBlockCollage pageblockcollage;
        TL_iv.PageBlock pageBlock = blockRow.block;
        if (pageBlock instanceof TL_iv.pageBlockDivider) {
            arrayList.add(pageBlock);
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockPhoto) {
            MediaUploadState mediaUploadState = blockRow.media;
            if (mediaUploadState == null || !mediaUploadState.isReady()) {
                return;
            }
            TL_iv.PageBlock pageBlock2 = blockRow.block;
            if (((TL_iv.pageBlockPhoto) pageBlock2).photo_id != 0) {
                if (pageBlock2.caption == null) {
                    pageBlock2.caption = new TL_iv.PageCaption();
                    blockRow.block.caption.text = new TL_iv.textEmpty();
                    blockRow.block.caption.credit = new TL_iv.textEmpty();
                }
                arrayList.add(blockRow.block);
                return;
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockVideo) {
            MediaUploadState mediaUploadState2 = blockRow.media;
            if (mediaUploadState2 == null || !mediaUploadState2.isReady()) {
                return;
            }
            TL_iv.PageBlock pageBlock3 = blockRow.block;
            if (((TL_iv.pageBlockVideo) pageBlock3).video_id != 0) {
                if (pageBlock3.caption == null) {
                    pageBlock3.caption = new TL_iv.PageCaption();
                    blockRow.block.caption.text = new TL_iv.textEmpty();
                    blockRow.block.caption.credit = new TL_iv.textEmpty();
                }
                arrayList.add(blockRow.block);
                return;
            }
            return;
        }
        if (isGallery(pageBlock)) {
            ArrayList galleryItems = galleryItems(blockRow.block);
            List mediasOf = mediasOf(blockRow);
            ArrayList<TL_iv.PageBlock> arrayList2 = new ArrayList<>();
            for (int i = 0; galleryItems != null && i < galleryItems.size() && i < mediasOf.size(); i++) {
                TL_iv.PageBlock pageBlock4 = (TL_iv.PageBlock) galleryItems.get(i);
                if (((MediaUploadState) mediasOf.get(i)).isReady() && mediaIdOf(pageBlock4) != 0) {
                    RichCaptionController.ensureCaption(pageBlock4);
                    arrayList2.add(pageBlock4);
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
                return;
            }
            if (arrayList2.size() == 1) {
                arrayList.add(arrayList2.get(0));
                return;
            }
            return;
        }
        TL_iv.PageBlock pageBlock5 = blockRow.block;
        if (pageBlock5 instanceof TL_iv.pageBlockAudio) {
            MediaUploadState mediaUploadState3 = blockRow.media;
            if (mediaUploadState3 == null || !mediaUploadState3.isReady()) {
                return;
            }
            TL_iv.PageBlock pageBlock6 = blockRow.block;
            if (((TL_iv.pageBlockAudio) pageBlock6).audio_id != 0) {
                if (pageBlock6.caption == null) {
                    pageBlock6.caption = new TL_iv.PageCaption();
                    blockRow.block.caption.text = new TL_iv.textEmpty();
                    blockRow.block.caption.credit = new TL_iv.textEmpty();
                }
                arrayList.add(blockRow.block);
                return;
            }
            return;
        }
        if (pageBlock5 instanceof TL_iv.pageBlockDocument) {
            MediaUploadState mediaUploadState4 = blockRow.media;
            if (mediaUploadState4 != null && (document = mediaUploadState4.document) != null) {
                ((TL_iv.pageBlockDocument) pageBlock5).document_id = document.id;
            }
            if (mediaUploadState4 == null || !mediaUploadState4.isReady()) {
                return;
            }
            TL_iv.PageBlock pageBlock7 = blockRow.block;
            if (((TL_iv.pageBlockDocument) pageBlock7).document_id != 0) {
                RichCaptionController.ensureCaption(pageBlock7);
                arrayList.add(blockRow.block);
                return;
            }
            return;
        }
        if (pageBlock5 instanceof TL_iv.pageBlockMap) {
            TL_iv.pageBlockMap pageblockmap = (TL_iv.pageBlockMap) pageBlock5;
            if (RichMapCell.hasGeo(pageblockmap)) {
                if (pageblockmap.caption == null) {
                    TL_iv.PageCaption pageCaption = new TL_iv.PageCaption();
                    pageblockmap.caption = pageCaption;
                    pageCaption.text = new TL_iv.textEmpty();
                    pageblockmap.caption.credit = new TL_iv.textEmpty();
                }
                arrayList.add(pageblockmap);
                return;
            }
            return;
        }
        if (pageBlock5 instanceof TL_iv.pageBlockMath) {
            if (TextUtils.isEmpty(((TL_iv.pageBlockMath) pageBlock5).source)) {
                return;
            }
            arrayList.add(blockRow.block);
        } else {
            if (pageBlock5 instanceof TL_iv.pageBlockTable) {
                TL_iv.pageBlockTable pageblocktable = (TL_iv.pageBlockTable) pageBlock5;
                TableModel.normalizeForSend(pageblocktable);
                if (tableHasText(pageblocktable)) {
                    arrayList.add(pageblocktable);
                    return;
                }
                return;
            }
            arrayList.add(pageBlock5);
        }
    }

    private TL_iv.PageBlock buildListBlock(int i, int i2, boolean z, int[] iArr, int i3, int i4) {
        int i5;
        TL_iv.RichText richText;
        int i6;
        ArrayList arrayList;
        TL_iv.RichText richText2;
        BlockRow blockRow;
        int i7;
        int i8;
        RichEditorListView richEditorListView = this;
        int i9 = i2;
        int i10 = i3;
        TL_iv.pageBlockOrderedList pageblockorderedlist = z ? new TL_iv.pageBlockOrderedList() : null;
        TL_iv.pageBlockList pageblocklist = z ? null : new TL_iv.pageBlockList();
        int i11 = i;
        int i12 = 1;
        while (i11 < i10) {
            BlockRow blockRow2 = (BlockRow) richEditorListView.rows.get(i11);
            if (blockRow2.quoteIds.size() > i4 || (i5 = blockRow2.level) < i9) {
                break;
            }
            if (i5 == i9) {
                if ((blockRow2.num > 0) != z) {
                    break;
                }
            }
            if (i5 > i9) {
                break;
            }
            boolean isNonText = isNonText(blockRow2.block);
            if (isNonText) {
                richText = null;
            } else {
                TL_iv.PageBlock pageBlock = blockRow2.block;
                TL_iv.RichText richText3 = pageBlock == null ? null : pageBlock.text;
                if (richText3 == null) {
                    richText3 = new TL_iv.textEmpty();
                }
                richText = richText3;
            }
            int i13 = i11 + 1;
            ArrayList arrayList2 = new ArrayList();
            if (isNonText) {
                richEditorListView.emitLeafBlock(blockRow2, arrayList2);
            }
            int i14 = i13;
            while (i14 < i10) {
                BlockRow blockRow3 = (BlockRow) richEditorListView.rows.get(i14);
                if (blockRow3.quoteIds.size() > i4 || (i8 = blockRow3.level) < i9) {
                    break;
                }
                if (i8 == i9) {
                    if (!isNonText(blockRow3.block)) {
                        break;
                    }
                    richEditorListView.emitLeafBlock(blockRow3, arrayList2);
                    i14++;
                } else {
                    int[] iArr2 = {i14};
                    i6 = i14;
                    arrayList = arrayList2;
                    richText2 = richText;
                    blockRow = blockRow2;
                    i7 = i12;
                    TL_iv.PageBlock buildListBlock = buildListBlock(i14, i8, blockRow3.num > 0, iArr2, i3, i4);
                    if (buildListBlock != null) {
                        arrayList.add(buildListBlock);
                    }
                    i14 = iArr2[0];
                    if (i14 <= i6) {
                        break;
                    }
                    richText = richText2;
                    blockRow2 = blockRow;
                    i12 = i7;
                    arrayList2 = arrayList;
                    richEditorListView = this;
                    i9 = i2;
                    i10 = i3;
                }
            }
            i6 = i14;
            arrayList = arrayList2;
            richText2 = richText;
            blockRow = blockRow2;
            i7 = i12;
            if (isNonText || !arrayList.isEmpty()) {
                ArrayList<TL_iv.PageBlock> arrayList3 = new ArrayList<>();
                if (!isNonText) {
                    TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                    pageblockparagraph.text = richText2;
                    arrayList3.add(pageblockparagraph);
                }
                arrayList3.addAll(arrayList);
                if (arrayList3.isEmpty()) {
                    richEditorListView = this;
                    i9 = i2;
                    i12 = i7;
                    i11 = i6;
                    i10 = i3;
                } else if (z) {
                    TL_iv.TL_pageListOrderedItemBlocks tL_pageListOrderedItemBlocks = new TL_iv.TL_pageListOrderedItemBlocks();
                    tL_pageListOrderedItemBlocks.num = i7 + ".";
                    tL_pageListOrderedItemBlocks.blocks = arrayList3;
                    tL_pageListOrderedItemBlocks.checkbox = blockRow.checkbox;
                    tL_pageListOrderedItemBlocks.checked = blockRow.checked;
                    pageblockorderedlist.items.add(tL_pageListOrderedItemBlocks);
                } else {
                    TL_iv.TL_pageListItemBlocks tL_pageListItemBlocks = new TL_iv.TL_pageListItemBlocks();
                    tL_pageListItemBlocks.blocks = arrayList3;
                    tL_pageListItemBlocks.checkbox = blockRow.checkbox;
                    tL_pageListItemBlocks.checked = blockRow.checked;
                    pageblocklist.items.add(tL_pageListItemBlocks);
                }
            } else if (z) {
                TL_iv.TL_pageListOrderedItemText tL_pageListOrderedItemText = new TL_iv.TL_pageListOrderedItemText();
                tL_pageListOrderedItemText.num = i7 + ".";
                tL_pageListOrderedItemText.text = richText2;
                tL_pageListOrderedItemText.checkbox = blockRow.checkbox;
                tL_pageListOrderedItemText.checked = blockRow.checked;
                pageblockorderedlist.items.add(tL_pageListOrderedItemText);
            } else {
                TL_iv.TL_pageListItemText tL_pageListItemText = new TL_iv.TL_pageListItemText();
                tL_pageListItemText.text = richText2;
                tL_pageListItemText.checkbox = blockRow.checkbox;
                tL_pageListItemText.checked = blockRow.checked;
                pageblocklist.items.add(tL_pageListItemText);
            }
            i12 = i7 + 1;
            richEditorListView = this;
            i9 = i2;
            i10 = i3;
            i11 = i6;
        }
        iArr[0] = i11;
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
        Layout layout2;
        final BlockRow nextNavItemRow;
        boolean z = i == 20;
        RichTableCell focusedTitleTable = focusedTitleTable();
        if (focusedTitleTable != null) {
            int indexOf2 = this.rows.indexOf(focusedTitleTable.getRow());
            if (indexOf2 < 0) {
                return false;
            }
            if (z) {
                if (focusedTitleTable.focusFirstCell()) {
                    return true;
                }
                int findNextNavigableRow = findNextNavigableRow(indexOf2 + 1, 1);
                if (findNextNavigableRow < 0) {
                    final BlockRow blockRow = new BlockRow(new TL_iv.pageBlockParagraph());
                    this.rows.add(blockRow);
                    this.adapter.update(false);
                    post(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda38
                        @Override // java.lang.Runnable
                        public final void run() {
                            RichEditorListView.this.lambda$tryPlainArrowAcrossCells$64(blockRow);
                        }
                    });
                } else {
                    final BlockRow blockRow2 = (BlockRow) this.rows.get(findNextNavigableRow);
                    post(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda40
                        @Override // java.lang.Runnable
                        public final void run() {
                            RichEditorListView.this.lambda$tryPlainArrowAcrossCells$65(blockRow2);
                        }
                    });
                }
                return true;
            }
            int findNextNavigableRow2 = findNextNavigableRow(indexOf2 - 1, -1);
            if (findNextNavigableRow2 < 0) {
                return false;
            }
            final BlockRow blockRow3 = (BlockRow) this.rows.get(findNextNavigableRow2);
            post(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda41
                @Override // java.lang.Runnable
                public final void run() {
                    RichEditorListView.this.lambda$tryPlainArrowAcrossCells$66(blockRow3);
                }
            });
            return true;
        }
        RichQuoteAuthorCell findFocusedAuthorCell = findFocusedAuthorCell();
        if (findFocusedAuthorCell != null) {
            int indexOf3 = this.itemRows.indexOf(findFocusedAuthorCell.getRow());
            if (indexOf3 < 0) {
                return false;
            }
            Layout layout3 = findFocusedAuthorCell.authorEditText.getLayout();
            int lineForOffset = layout3 != null ? layout3.getLineForOffset(findFocusedAuthorCell.authorEditText.getSelectionEnd()) : 0;
            if (!z) {
                if ((layout3 != null && lineForOffset > 0) || (nextNavItemRow = nextNavItemRow(indexOf3 - 1, -1)) == null) {
                    return false;
                }
                post(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda44
                    @Override // java.lang.Runnable
                    public final void run() {
                        RichEditorListView.this.lambda$tryPlainArrowAcrossCells$69(nextNavItemRow);
                    }
                });
                return true;
            }
            if (layout3 != null && lineForOffset < layout3.getLineCount() - 1) {
                return false;
            }
            final BlockRow nextNavItemRow2 = nextNavItemRow(indexOf3 + 1, 1);
            if (nextNavItemRow2 == null) {
                final BlockRow blockRow4 = new BlockRow(new TL_iv.pageBlockParagraph());
                this.rows.add(blockRow4);
                this.adapter.update(false);
                post(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda42
                    @Override // java.lang.Runnable
                    public final void run() {
                        RichEditorListView.this.lambda$tryPlainArrowAcrossCells$67(blockRow4);
                    }
                });
                return true;
            }
            post(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda43
                @Override // java.lang.Runnable
                public final void run() {
                    RichEditorListView.this.lambda$tryPlainArrowAcrossCells$68(nextNavItemRow2);
                }
            });
            return true;
        }
        BlockRow findFocusedNavRow = findFocusedNavRow();
        if (findFocusedNavRow == null || (indexOf = this.rows.indexOf(findFocusedNavRow)) < 0) {
            return false;
        }
        View findViewByItemObject = findViewByItemObject(findFocusedNavRow);
        if (findViewByItemObject instanceof RichTextCell) {
            RichTextCell richTextCell = (RichTextCell) findViewByItemObject;
            if (richTextCell.isAuthorVisible()) {
                if (z && !richTextCell.isAuthorFocused()) {
                    Layout layout4 = richTextCell.getEditText().getLayout();
                    if (layout4 == null || layout4.getLineForOffset(richTextCell.getEditText().getSelectionEnd()) >= layout4.getLineCount() - 1) {
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
        int lineForOffset2 = layout.getLineForOffset(focusedNavEditText.getSelectionEnd());
        if (!z) {
            if (lineForOffset2 > 0) {
                return false;
            }
            final BlockRow adjacentAuthorRow = adjacentAuthorRow(findFocusedNavRow, -1);
            if (adjacentAuthorRow != null) {
                post(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda48
                    @Override // java.lang.Runnable
                    public final void run() {
                        RichEditorListView.this.lambda$tryPlainArrowAcrossCells$73(adjacentAuthorRow);
                    }
                });
                return true;
            }
            int findNextNavigableRow3 = findNextNavigableRow(indexOf - 1, -1);
            if (findNextNavigableRow3 < 0) {
                return false;
            }
            final BlockRow blockRow5 = (BlockRow) this.rows.get(findNextNavigableRow3);
            post(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda39
                @Override // java.lang.Runnable
                public final void run() {
                    RichEditorListView.this.lambda$tryPlainArrowAcrossCells$74(blockRow5);
                }
            });
            return true;
        }
        if (lineForOffset2 < layout.getLineCount() - 1) {
            return false;
        }
        final BlockRow adjacentAuthorRow2 = adjacentAuthorRow(findFocusedNavRow, 1);
        if (adjacentAuthorRow2 != null) {
            post(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda45
                @Override // java.lang.Runnable
                public final void run() {
                    RichEditorListView.this.lambda$tryPlainArrowAcrossCells$70(adjacentAuthorRow2);
                }
            });
            return true;
        }
        int findNextNavigableRow4 = findNextNavigableRow(indexOf + 1, 1);
        if (findNextNavigableRow4 < 0) {
            final BlockRow blockRow6 = new BlockRow(new TL_iv.pageBlockParagraph());
            this.rows.add(blockRow6);
            this.adapter.update(false);
            post(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda46
                @Override // java.lang.Runnable
                public final void run() {
                    RichEditorListView.this.lambda$tryPlainArrowAcrossCells$71(blockRow6);
                }
            });
        } else {
            final BlockRow blockRow7 = (BlockRow) this.rows.get(findNextNavigableRow4);
            post(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda47
                @Override // java.lang.Runnable
                public final void run() {
                    RichEditorListView.this.lambda$tryPlainArrowAcrossCells$72(blockRow7);
                }
            });
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$tryPlainArrowAcrossCells$65(BlockRow blockRow) {
        focusNavRow(blockRow, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$tryPlainArrowAcrossCells$66(BlockRow blockRow) {
        focusNavRow(blockRow, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$tryPlainArrowAcrossCells$68(BlockRow blockRow) {
        focusItemRow(blockRow, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$tryPlainArrowAcrossCells$69(BlockRow blockRow) {
        focusItemRow(blockRow, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$tryPlainArrowAcrossCells$70(BlockRow blockRow) {
        focusItemRow(blockRow, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$tryPlainArrowAcrossCells$72(BlockRow blockRow) {
        focusNavRow(blockRow, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$tryPlainArrowAcrossCells$73(BlockRow blockRow) {
        focusItemRow(blockRow, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$tryPlainArrowAcrossCells$74(BlockRow blockRow) {
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
        return (pageBlock instanceof TL_iv.pageBlockMap) || (pageBlock instanceof TL_iv.pageBlockAudio) || (pageBlock instanceof TL_iv.pageBlockDocument) || isMedia(pageBlock);
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

    private RichTableCell focusedTitleTable() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof RichTableCell) {
                RichTableCell richTableCell = (RichTableCell) childAt;
                if (richTableCell.getTitleEditText().isFocused()) {
                    return richTableCell;
                }
            }
        }
        return null;
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

    private RichQuoteAuthorCell findFocusedAuthorCell() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof RichQuoteAuthorCell) {
                RichQuoteAuthorCell richQuoteAuthorCell = (RichQuoteAuthorCell) childAt;
                if (richQuoteAuthorCell.authorEditText.isFocused()) {
                    return richQuoteAuthorCell;
                }
            }
        }
        return null;
    }

    private BlockRow adjacentAuthorRow(BlockRow blockRow, int i) {
        int i2;
        int indexOf = this.itemRows.indexOf(blockRow);
        if (indexOf < 0 || (i2 = indexOf + i) < 0 || i2 >= this.itemRows.size()) {
            return null;
        }
        BlockRow blockRow2 = (BlockRow) this.itemRows.get(i2);
        if (blockRow2.authorQuoteId != 0) {
            return blockRow2;
        }
        return null;
    }

    private BlockRow nextNavItemRow(int i, int i2) {
        while (i >= 0 && i < this.itemRows.size()) {
            BlockRow blockRow = (BlockRow) this.itemRows.get(i);
            if (!blockRow.detailsEnd) {
                if (blockRow.authorQuoteId != 0) {
                    return blockRow;
                }
                TL_iv.PageBlock pageBlock = blockRow.block;
                if (!isNonText(pageBlock) || hasCaption(pageBlock) || (pageBlock instanceof TL_iv.pageBlockTable)) {
                    return blockRow;
                }
            }
            i += i2;
        }
        return null;
    }

    private void focusItemRow(BlockRow blockRow, boolean z) {
        View findViewByItemObject = findViewByItemObject(blockRow);
        if (findViewByItemObject instanceof RichQuoteAuthorCell) {
            RichEditText richEditText = ((RichQuoteAuthorCell) findViewByItemObject).authorEditText;
            richEditText.requestEditFocus();
            richEditText.setSelection(z ? richEditText.length() : 0);
            return;
        }
        focusNavRow(blockRow, z);
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
            lambda$tryPlainArrowAcrossCells$71(blockRow);
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
                post(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda50
                    @Override // java.lang.Runnable
                    public final void run() {
                        RichEditorListView.this.lambda$tryEscalateSelectionFromCaret$75(blockRow);
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
                post(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda51
                    @Override // java.lang.Runnable
                    public final void run() {
                        RichEditorListView.this.lambda$tryEscalateSelectionFromCaret$76(blockRow);
                    }
                });
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$tryEscalateSelectionFromCaret$75(BlockRow blockRow) {
        KeyEvent.Callback findViewByItemObject = findViewByItemObject(blockRow);
        if (findViewByItemObject instanceof TextSelectionHelper.ArticleSelectableView) {
            this.textSelectionHelper.extendSelectionTo((TextSelectionHelper.ArticleSelectableView) findViewByItemObject, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$tryEscalateSelectionFromCaret$76(BlockRow blockRow) {
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
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01ac, code lost:
    
        if (r15 < r13.rows.size()) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x022e, code lost:
    
        if (r14 < r13.rows.size()) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b1, code lost:
    
        if (r15 < r13.rows.size()) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0110, code lost:
    
        if (r15 < r13.rows.size()) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0129, code lost:
    
        r1 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0126, code lost:
    
        if (r15 < r13.rows.size()) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:139:0x023a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean tryExtendSelectionAcrossCells(int i, boolean z) {
        int i2;
        final int i3;
        int i4;
        int wordLeft;
        Layout layout;
        int prevTextOffset;
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
                int size = model.anchors().size() + 1;
                i4 = (startChildPosition < 0 || startChildPosition >= size) ? 0 : startChildPosition;
                RichEditText editTextForChildPos = richTableCell.editTextForChildPos(i4);
                Layout layout2 = editTextForChildPos != null ? editTextForChildPos.getLayout() : null;
                if (layout2 != null) {
                    CharSequence text = layout2.getText();
                    int length = text.length();
                    switch (i) {
                        case 19:
                            int lineForOffset = layout2.getLineForOffset(startOffset) - 1;
                            if (lineForOffset >= 0) {
                                i6 = layout2.getOffsetForHorizontal(lineForOffset, layout2.getPrimaryHorizontal(startOffset));
                            } else if (i4 == 0) {
                                i3 = startCell - 1;
                                if (i3 >= 0) {
                                    prevTextOffset = prevTextOffset(i3);
                                    i6 = prevTextOffset;
                                    startChildPosition = 0;
                                    break;
                                }
                            } else {
                                int findTableAnchorAbove = findTableAnchorAbove(model, i4 - 1);
                                if (findTableAnchorAbove >= 0) {
                                    startChildPosition = findTableAnchorAbove + 1;
                                    RichEditText editTextForChildPos2 = richTableCell.editTextForChildPos(startChildPosition);
                                    layout = editTextForChildPos2 != null ? editTextForChildPos2.getLayout() : null;
                                    if (layout != null) {
                                        i6 = layout.getText().length();
                                    }
                                } else {
                                    i6 = richTableCell.getTitleEditText().length();
                                    startChildPosition = 0;
                                }
                            }
                            i3 = startCell;
                            break;
                        case 20:
                            int lineForOffset2 = layout2.getLineForOffset(startOffset) + 1;
                            if (lineForOffset2 >= layout2.getLineCount()) {
                                if (i4 != 0) {
                                    int findTableAnchorBelow = findTableAnchorBelow(model, i4 - 1);
                                    if (findTableAnchorBelow < 0) {
                                        i3 = startCell + 1;
                                        break;
                                    } else {
                                        startChildPosition = findTableAnchorBelow + 1;
                                    }
                                } else if (size <= 1) {
                                    i3 = startCell + 1;
                                    break;
                                } else {
                                    i3 = startCell;
                                    startChildPosition = 1;
                                    break;
                                }
                            } else {
                                i6 = layout2.getOffsetForHorizontal(lineForOffset2, layout2.getPrimaryHorizontal(startOffset));
                            }
                            i3 = startCell;
                            break;
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
                                    RichEditText editTextForChildPos3 = richTableCell.editTextForChildPos(i5);
                                    layout = editTextForChildPos3 != null ? editTextForChildPos3.getLayout() : null;
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
                                if (i5 >= size) {
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
            post(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda49
                @Override // java.lang.Runnable
                public final void run() {
                    RichEditorListView.this.lambda$tryExtendSelectionAcrossCells$77(i3, startChildPosition, i6);
                }
            });
            return true;
        }
        return this.textSelectionHelper.extendSelectionTo((TextSelectionHelper.ArticleSelectableView) selectableAt2, startChildPosition, i6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$tryExtendSelectionAcrossCells$77(int i, int i2, int i3) {
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
    public boolean isWholeDocumentSelected() {
        int size;
        if (this.rows.isEmpty() || !this.textSelectionHelper.isInSelectionMode() || this.textSelectionHelper.getStartCell() != 0 || this.textSelectionHelper.getStartChildPosition() != 0 || this.textSelectionHelper.getStartOffset() > 0 || this.textSelectionHelper.getEndCell() != (size = this.rows.size() - 1)) {
            return false;
        }
        BlockRow blockRow = (BlockRow) this.rows.get(size);
        String readAuthorPlain = RichTextCell.isQuoteBlock(blockRow.block) ? RichTextCell.readAuthorPlain(blockRow.block) : "";
        boolean z = !readAuthorPlain.isEmpty();
        if (this.textSelectionHelper.getEndChildPosition() != z) {
            return false;
        }
        return this.textSelectionHelper.getEndOffset() >= (z ? readAuthorPlain.length() : RichTextCell.readPlainText(blockRow.block).length());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean tryEscalateSelectAll() {
        if (this.rows.isEmpty()) {
            return false;
        }
        if (!this.textSelectionHelper.isInSelectionMode()) {
            if (selectCurrentUnit()) {
                return true;
            }
        } else if (tryEscalateWithinTable()) {
            return true;
        }
        for (int i = 0; i < this.itemRows.size(); i++) {
            BlockRow blockRow = (BlockRow) this.itemRows.get(i);
            long j = blockRow.authorQuoteId;
            if (j != 0) {
                this.textSelectionHelper.cacheText(i, RichTextStyle.plainOf((TL_iv.RichText) this.quoteAuthors.get(Long.valueOf(j))), null);
            } else {
                this.textSelectionHelper.cacheText(i, RichTextCell.readPlainText(blockRow.block), null);
                if (RichTextCell.isQuoteBlock(blockRow.block)) {
                    String readAuthorPlain = RichTextCell.readAuthorPlain(blockRow.block);
                    if (!readAuthorPlain.isEmpty()) {
                        this.textSelectionHelper.cacheChildText(i, 1, readAuthorPlain);
                    }
                }
            }
        }
        int size = this.itemRows.size() - 1;
        BlockRow blockRow2 = (BlockRow) this.itemRows.get(size);
        String readAuthorPlain2 = (blockRow2.authorQuoteId == 0 && RichTextCell.isQuoteBlock(blockRow2.block)) ? RichTextCell.readAuthorPlain(blockRow2.block) : "";
        if (!readAuthorPlain2.isEmpty()) {
            this.textSelectionHelper.selectAllBlocksRange(0, size, 1, readAuthorPlain2.length());
        } else {
            this.textSelectionHelper.selectAllBlocksRange(0, size);
        }
        return true;
    }

    private RichTextCell cellForEditText(RichEditText richEditText) {
        for (ViewParent parent = richEditText.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof RichTextCell) {
                return (RichTextCell) parent;
            }
        }
        return null;
    }

    private boolean selectCurrentUnit() {
        int length;
        int childPosForAnchor;
        RichEditText findFocusedEditText = findFocusedEditText();
        if (findFocusedEditText == null || findFocusedEditText.getText() == null || (length = findFocusedEditText.getText().length()) <= 0) {
            return false;
        }
        RichTableCell findTableCellAncestor = findTableCellAncestor(findFocusedEditText);
        if (findTableCellAncestor != null) {
            if (findFocusedEditText == findTableCellAncestor.getTitleEditText()) {
                childPosForAnchor = findTableCellAncestor.titleChildPos();
            } else {
                RichTableCellHost findHostContaining = findTableCellAncestor.findHostContaining(findFocusedEditText);
                childPosForAnchor = findHostContaining != null ? findTableCellAncestor.childPosForAnchor(findHostContaining.cell) : -1;
            }
            if (childPosForAnchor < 0) {
                return false;
            }
            findFocusedEditText.setSelection(findFocusedEditText.getSelectionEnd());
            return this.textSelectionHelper.selectRangeOf(findTableCellAncestor, childPosForAnchor, 0, length);
        }
        RichCaptionHost findCaptionHostAncestor = findCaptionHostAncestor(findFocusedEditText);
        if (findCaptionHostAncestor instanceof TextSelectionHelper.ArticleSelectableView) {
            findFocusedEditText.setSelection(findFocusedEditText.getSelectionEnd());
            return this.textSelectionHelper.selectRangeOf((TextSelectionHelper.ArticleSelectableView) findCaptionHostAncestor, 0, 0, length);
        }
        RichTextCell cellForEditText = cellForEditText(findFocusedEditText);
        if (cellForEditText != null) {
            int i = findFocusedEditText == cellForEditText.getAuthorEditText() ? 1 : 0;
            findFocusedEditText.setSelection(findFocusedEditText.getSelectionEnd());
            return this.textSelectionHelper.selectRangeOf(cellForEditText, i, 0, length);
        }
        return false;
    }

    private boolean tryEscalateWithinTable() {
        int startCell = this.textSelectionHelper.getStartCell();
        if (startCell != this.textSelectionHelper.getEndCell()) {
            return false;
        }
        View selectableAt = selectableAt(startCell);
        if (!(selectableAt instanceof RichTableCell)) {
            return false;
        }
        RichTableCell richTableCell = (RichTableCell) selectableAt;
        if (isWholeTableSelected(richTableCell)) {
            return false;
        }
        return selectWholeTable(richTableCell);
    }

    private int[] wholeTableEnd(RichTableCell richTableCell) {
        for (int childCount = richTableCell.childCount() - 1; childCount >= 0; childCount--) {
            int childTextLength = richTableCell.childTextLength(childCount);
            if (childTextLength > 0) {
                return new int[]{childCount, childTextLength};
            }
        }
        return null;
    }

    private boolean selectWholeTable(RichTableCell richTableCell) {
        int[] wholeTableEnd = wholeTableEnd(richTableCell);
        if (wholeTableEnd == null) {
            return false;
        }
        return this.textSelectionHelper.selectChildRange(richTableCell, 0, 0, wholeTableEnd[0], wholeTableEnd[1]);
    }

    private boolean isWholeTableSelected(RichTableCell richTableCell) {
        int[] wholeTableEnd = wholeTableEnd(richTableCell);
        return wholeTableEnd != null && this.textSelectionHelper.getStartChildPosition() == 0 && this.textSelectionHelper.getStartOffset() == 0 && this.textSelectionHelper.getEndChildPosition() == wholeTableEnd[0] && this.textSelectionHelper.getEndOffset() == wholeTableEnd[1];
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
        int i;
        int i2;
        int indexOf = this.rows.indexOf(rowForCell(this.textSelectionHelper.getStartCell()));
        int indexOf2 = this.rows.indexOf(rowForCell(this.textSelectionHelper.getEndCell()));
        int startOffset = this.textSelectionHelper.getStartOffset();
        int endOffset = this.textSelectionHelper.getEndOffset();
        if (indexOf >= 0 && indexOf2 >= 0 && indexOf < this.rows.size() && indexOf2 < this.rows.size()) {
            if (indexOf > indexOf2) {
                i2 = startOffset;
                i = endOffset;
                indexOf2 = indexOf;
                indexOf = indexOf2;
            } else if (indexOf != indexOf2 || startOffset <= endOffset) {
                i = startOffset;
                i2 = endOffset;
            } else {
                i2 = startOffset;
                i = endOffset;
            }
            try {
                String serialize = RichHtml.serialize(this.rows, indexOf, indexOf2, i, i2, this.quoteAuthors);
                if (TextUtils.isEmpty(serialize)) {
                    return null;
                }
                RichMediaClipboard.set(collectMediaPhotos(indexOf, indexOf2), collectMediaDocuments(indexOf, indexOf2));
                return serialize;
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007e  */
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
                    HashMap hashMap = new HashMap();
                    List resolvePastedMedia = resolvePastedMedia(RichHtml.parse(str, hashMap));
                    if (resolvePastedMedia != null && !resolvePastedMedia.isEmpty() && pasteBlocksAtSelection(resolvePastedMedia)) {
                        if (hashMap.isEmpty()) {
                            return;
                        }
                        this.quoteAuthors.putAll(hashMap);
                        return;
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
                HashMap hashMap = new HashMap();
                try {
                    List resolvePastedMedia = resolvePastedMedia(RichHtml.parse(htmlText, hashMap));
                    if (resolvePastedMedia == null || resolvePastedMedia.isEmpty()) {
                        return false;
                    }
                    if ((resolvePastedMedia.size() == 1 && isPlainParagraphRow((BlockRow) resolvePastedMedia.get(0))) || (indexOf = this.rows.indexOf(blockRow)) < 0) {
                        return false;
                    }
                    int max = Math.max(0, Math.min(richEditText.getSelectionStart(), richEditText.getSelectionEnd()));
                    boolean spliceBlocksInto = spliceBlocksInto(indexOf, indexOf, max, Math.max(max, Math.max(richEditText.getSelectionStart(), richEditText.getSelectionEnd())), resolvePastedMedia);
                    if (spliceBlocksInto && !hashMap.isEmpty()) {
                        this.quoteAuthors.putAll(hashMap);
                    }
                    return spliceBlocksInto;
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
        post(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda29
            @Override // java.lang.Runnable
            public final void run() {
                RichEditorListView.this.lambda$spliceBlocksInto$78(blockRow2, caretEndOf);
            }
        });
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$spliceBlocksInto$78(BlockRow blockRow, int i) {
        View findViewByItemObject = blockRow == null ? null : findViewByItemObject(blockRow);
        if (findViewByItemObject instanceof RichTextCell) {
            RichTextCell richTextCell = (RichTextCell) findViewByItemObject;
            richTextCell.requestEditFocus();
            richTextCell.getEditText().setSelection(Math.min(i, richTextCell.getEditText().length()));
        }
    }

    private static boolean isPlainParagraphRow(BlockRow blockRow) {
        return blockRow != null && !blockRow.detailsEnd && !isDetailsHeader(blockRow) && (blockRow.block instanceof TL_iv.pageBlockParagraph) && blockRow.level == 0 && blockRow.num == 0 && !blockRow.checkbox && blockRow.quoteIds.isEmpty();
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
        int startCell = this.textSelectionHelper.getStartCell();
        int startOffset = this.textSelectionHelper.getStartOffset();
        int endCell = this.textSelectionHelper.getEndCell();
        if (applyEditRange(startCell, startOffset, endCell, this.textSelectionHelper.getEndOffset(), new String[]{""})) {
            return;
        }
        removeSelectedBlocks(startCell, endCell);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void replaceHelperSelectionWith(String str) {
        applyEditRange(this.textSelectionHelper.getStartCell(), this.textSelectionHelper.getStartOffset(), this.textSelectionHelper.getEndCell(), this.textSelectionHelper.getEndOffset(), str.split("\n", -1));
    }

    private boolean applyEditRange(int i, int i2, int i3, int i4, String[] strArr) {
        final int length;
        int indexOf = this.rows.indexOf(rowForCell(i));
        int indexOf2 = this.rows.indexOf(rowForCell(i3));
        if (indexOf >= 0 && indexOf2 >= 0 && indexOf < this.rows.size() && indexOf2 < this.rows.size()) {
            BlockRow blockRow = (BlockRow) this.rows.get(indexOf);
            BlockRow blockRow2 = (BlockRow) this.rows.get(indexOf2);
            if (indexOf == indexOf2 && isDetailsHeader(blockRow)) {
                applyEditInsideDetails(blockRow, i2, i4, strArr);
                return true;
            }
            for (int i5 = indexOf; i5 <= indexOf2; i5++) {
                if (((BlockRow) this.rows.get(i5)).detailsEnd || isDetailsHeader((BlockRow) this.rows.get(i5))) {
                    deleteAcrossDetails(indexOf, i2, indexOf2, i4, strArr);
                    return true;
                }
            }
            RichEditorHistory richEditorHistory = this.history;
            if (richEditorHistory != null) {
                richEditorHistory.flush();
            }
            TL_iv.PageBlock pageBlock = blockRow.block;
            boolean z = pageBlock instanceof TL_iv.pageBlockTable;
            boolean z2 = blockRow2.block instanceof TL_iv.pageBlockTable;
            if (!z && !z2) {
                boolean hasCaption = hasCaption(pageBlock);
                boolean hasCaption2 = hasCaption(blockRow2.block);
                if (hasCaption || hasCaption2) {
                    if (!hasCaption || !hasCaption2 || indexOf != indexOf2) {
                        return false;
                    }
                    applyEditInsideCaption(blockRow, i2, i4, strArr);
                    return true;
                }
                if (indexOf == indexOf2 && RichTextCell.isQuoteBlock(blockRow.block) && this.textSelectionHelper.getStartChildPosition() == 1 && this.textSelectionHelper.getEndChildPosition() == 1) {
                    applyEditInsideAuthor(blockRow, i2, i4, strArr);
                    return true;
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
                post(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda28
                    @Override // java.lang.Runnable
                    public final void run() {
                        RichEditorListView.this.lambda$applyEditRange$79(blockRow3, length);
                    }
                });
                return true;
            }
            if (z && z2 && indexOf == indexOf2) {
                applyEditInsideTable(blockRow, this.textSelectionHelper.getStartChildPosition(), i2, this.textSelectionHelper.getEndChildPosition(), i4, strArr);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$applyEditRange$79(BlockRow blockRow, int i) {
        View findViewByItemObject = blockRow == null ? null : findViewByItemObject(blockRow);
        if (findViewByItemObject instanceof RichTextCell) {
            RichTextCell richTextCell = (RichTextCell) findViewByItemObject;
            richTextCell.requestEditFocus();
            richTextCell.getEditText().setSelection(Math.min(i, richTextCell.getEditText().length()));
        }
    }

    private void removeSelectedBlocks(int i, int i2) {
        if (i > i2) {
            i2 = i;
            i = i2;
        }
        ArrayList arrayList = new ArrayList();
        for (int max = Math.max(0, i); max <= i2 && max < this.itemRows.size(); max++) {
            BlockRow blockRow = (BlockRow) this.itemRows.get(max);
            if (blockRow.authorQuoteId == 0 && this.rows.indexOf(blockRow) >= 0) {
                arrayList.add(blockRow);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        RichEditorHistory richEditorHistory = this.history;
        if (richEditorHistory != null) {
            richEditorHistory.flush();
        }
        int indexOf = this.rows.indexOf(arrayList.get(0));
        this.rows.removeAll(arrayList);
        if (this.rows.isEmpty()) {
            this.rows.add(new BlockRow(new TL_iv.pageBlockParagraph()));
        }
        gcQuoteAuthors();
        collapseSingleBlockQuotes();
        normalizeNestedQuotes();
        renumberAllRuns();
        TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper = this.textSelectionHelper;
        if (articleTextSelectionHelper != null) {
            articleTextSelectionHelper.clear();
        }
        this.adapter.update(false);
        RichEditorHistory richEditorHistory2 = this.history;
        if (richEditorHistory2 != null) {
            richEditorHistory2.record();
        }
        final BlockRow blockRow2 = (BlockRow) this.rows.get(Math.max(0, Math.min(indexOf, r11.size() - 1)));
        post(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda24
            @Override // java.lang.Runnable
            public final void run() {
                RichEditorListView.this.lambda$removeSelectedBlocks$80(blockRow2);
            }
        });
    }

    private void gcQuoteAuthors() {
        if (this.quoteAuthors.isEmpty()) {
            return;
        }
        HashSet hashSet = new HashSet();
        for (int i = 0; i < this.rows.size(); i++) {
            hashSet.addAll(((BlockRow) this.rows.get(i)).quoteIds);
        }
        this.quoteAuthors.keySet().retainAll(hashSet);
    }

    private void applyEditInsideTableTitle(RichTableCell richTableCell, BlockRow blockRow, int i, int i2, String[] strArr) {
        TL_iv.PageBlock pageBlock = blockRow.block;
        if (pageBlock instanceof TL_iv.pageBlockTable) {
            TL_iv.pageBlockTable pageblocktable = (TL_iv.pageBlockTable) pageBlock;
            RichEditorHistory richEditorHistory = this.history;
            if (richEditorHistory != null) {
                richEditorHistory.flush();
            }
            String plainOf = RichTextStyle.plainOf(pageblocktable.title);
            int max = Math.max(0, Math.min(Math.min(i, i2), plainOf.length()));
            int max2 = Math.max(0, Math.min(Math.max(i, i2), plainOf.length()));
            StringBuilder sb = new StringBuilder();
            for (int i3 = 0; i3 < strArr.length; i3++) {
                if (i3 > 0) {
                    sb.append(' ');
                }
                sb.append(strArr[i3]);
            }
            String sb2 = sb.toString();
            String str = plainOf.substring(0, max) + sb2 + plainOf.substring(max2);
            TL_iv.textPlain textplain = new TL_iv.textPlain();
            textplain.text = str;
            pageblocktable.title = textplain;
            final RichEditText titleEditText = richTableCell.getTitleEditText();
            titleEditText.setTextSilently(str);
            titleEditText.invalidateEffects();
            final int length = max + sb2.length();
            this.textSelectionHelper.clear();
            RichEditorHistory richEditorHistory2 = this.history;
            if (richEditorHistory2 != null) {
                richEditorHistory2.record();
            }
            this.delegate.onContentChanged();
            post(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda69
                @Override // java.lang.Runnable
                public final void run() {
                    RichEditorListView.lambda$applyEditInsideTableTitle$81(RichEditText.this, length);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$applyEditInsideTableTitle$81(RichEditText richEditText, int i) {
        richEditText.requestEditFocus();
        richEditText.setSelection(Math.max(0, Math.min(i, richEditText.length())));
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
            post(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda60
                @Override // java.lang.Runnable
                public final void run() {
                    RichEditorListView.lambda$applyEditInsideAuthor$82(RichEditText.this, length2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$applyEditInsideAuthor$82(RichEditText richEditText, int i) {
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
        post(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda67
            @Override // java.lang.Runnable
            public final void run() {
                RichEditorListView.this.lambda$deleteAcrossDetails$83(blockRow, length);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$deleteAcrossDetails$83(BlockRow blockRow, int i) {
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
            post(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda58
                @Override // java.lang.Runnable
                public final void run() {
                    RichEditorListView.lambda$applyEditInsideDetails$84(RichEditText.this, length2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$applyEditInsideDetails$84(RichEditText richEditText, int i) {
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
            post(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda64
                @Override // java.lang.Runnable
                public final void run() {
                    RichEditorListView.lambda$applyEditInsideCaption$85(RichEditText.this, length2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$applyEditInsideCaption$85(RichEditText richEditText, int i) {
        richEditText.requestEditFocus();
        richEditText.setSelection(Math.max(0, Math.min(i, richEditText.length())));
    }

    private void applyEditInsideTable(BlockRow blockRow, int i, int i2, int i3, int i4, String[] strArr) {
        final RichTableCell richTableCell;
        TableModel model;
        final int length;
        View findViewByItemObject = findViewByItemObject(blockRow);
        if ((findViewByItemObject instanceof RichTableCell) && (model = (richTableCell = (RichTableCell) findViewByItemObject).getModel()) != null) {
            if (i == 0 && i3 == 0) {
                applyEditInsideTableTitle(richTableCell, blockRow, i2, i4, strArr);
                return;
            }
            int i5 = i - 1;
            int i6 = i3 - 1;
            int size = model.anchors().size();
            if (i5 < 0 || i5 >= size || i6 < 0 || i6 >= size) {
                return;
            }
            RichEditorHistory richEditorHistory = this.history;
            if (richEditorHistory != null) {
                richEditorHistory.flush();
            }
            int i7 = i2;
            int i8 = i4;
            if (i5 > i6 || (i5 == i6 && i7 > i8)) {
                i6 = i5;
                i5 = i6;
                i8 = i7;
                i7 = i8;
            }
            StringBuilder sb = new StringBuilder();
            for (int i9 = 0; i9 < strArr.length; i9++) {
                if (i9 > 0) {
                    sb.append('\n');
                }
                sb.append(strArr[i9]);
            }
            String sb2 = sb.toString();
            final TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) model.anchors().get(i5);
            TL_iv.pageTableCell pagetablecell2 = (TL_iv.pageTableCell) model.anchors().get(i6);
            if (i5 == i6) {
                String readPlainText = TableModel.readPlainText(pagetablecell);
                int max = Math.max(0, Math.min(i7, readPlainText.length()));
                String str = readPlainText.substring(0, max) + sb2 + readPlainText.substring(Math.max(0, Math.min(i8, readPlainText.length())));
                TableModel.applyPlainText(pagetablecell, str);
                RichTableCellHost hostForAnchor = richTableCell.getGrid().hostForAnchor(pagetablecell);
                if (hostForAnchor != null) {
                    hostForAnchor.editText.setTextSilently(str);
                }
                length = max + sb2.length();
            } else {
                String readPlainText2 = TableModel.readPlainText(pagetablecell);
                int max2 = Math.max(0, Math.min(i7, readPlainText2.length()));
                String str2 = readPlainText2.substring(0, max2) + sb2;
                TableModel.applyPlainText(pagetablecell, str2);
                RichTableCellHost hostForAnchor2 = richTableCell.getGrid().hostForAnchor(pagetablecell);
                if (hostForAnchor2 != null) {
                    hostForAnchor2.editText.setTextSilently(str2);
                }
                while (true) {
                    i5++;
                    if (i5 >= i6) {
                        break;
                    }
                    TL_iv.pageTableCell pagetablecell3 = (TL_iv.pageTableCell) model.anchors().get(i5);
                    TableModel.applyPlainText(pagetablecell3, "");
                    RichTableCellHost hostForAnchor3 = richTableCell.getGrid().hostForAnchor(pagetablecell3);
                    if (hostForAnchor3 != null) {
                        hostForAnchor3.editText.setTextSilently("");
                    }
                }
                String readPlainText3 = TableModel.readPlainText(pagetablecell2);
                String substring = readPlainText3.substring(Math.max(0, Math.min(i8, readPlainText3.length())));
                TableModel.applyPlainText(pagetablecell2, substring);
                RichTableCellHost hostForAnchor4 = richTableCell.getGrid().hostForAnchor(pagetablecell2);
                if (hostForAnchor4 != null) {
                    hostForAnchor4.editText.setTextSilently(substring);
                }
                length = max2 + sb2.length();
            }
            this.textSelectionHelper.clear();
            RichEditorHistory richEditorHistory2 = this.history;
            if (richEditorHistory2 != null) {
                richEditorHistory2.record();
            }
            post(new Runnable() { // from class: org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda65
                @Override // java.lang.Runnable
                public final void run() {
                    RichEditorListView.lambda$applyEditInsideTable$86(RichTableCell.this, pagetablecell, length);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$applyEditInsideTable$86(RichTableCell richTableCell, TL_iv.pageTableCell pagetablecell, int i) {
        RichTableCellHost hostForAnchor = richTableCell.getGrid().hostForAnchor(pagetablecell);
        if (hostForAnchor == null) {
            return;
        }
        hostForAnchor.editText.requestEditFocus();
        hostForAnchor.editText.setSelection(Math.max(0, Math.min(i, hostForAnchor.editText.length())));
    }
}
