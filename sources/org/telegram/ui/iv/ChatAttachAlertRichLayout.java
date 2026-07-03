package org.telegram.ui.iv;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.EditTextCell;
import org.telegram.ui.Cells.TextSelectionHelper;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AIEditorAlert;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatAttachAlert;
import org.telegram.ui.Components.ChatAttachAlertAudioLayout;
import org.telegram.ui.Components.ChatAttachAlertLocationLayout;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EmojiView;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.TrendingStickersLayout;
import org.telegram.ui.MessageSendPreview;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.iv.ChatAttachAlertRichLayout;
import org.telegram.ui.iv.RichCommandSuggestions;
import org.telegram.ui.iv.RichEditorListView;
import org.telegram.ui.iv.RichEditorToolbar;
import ru.noties.jlatexmath.JLatexMathDrawable;

/* loaded from: classes3.dex */
public class ChatAttachAlertRichLayout extends ChatAttachAlert.AttachAlertLayout implements NotificationCenter.NotificationCenterDelegate {
    private static final int[] STYLE_FLAGS = {1, 2, 16, 8, 256, 4, 16384, 32768};
    private boolean attachButtonsShown;
    private int attachRaise;
    private RichCommandSuggestions commandSuggestions;
    private final int currentAccount;
    private int currentItemTop;
    private int emojiPadding;
    private boolean emojiSearchOpened;
    private RichEditText emojiTargetEditText;
    private int emojiTargetSelection;
    private EmojiView emojiView;
    private boolean emojiViewVisible;
    private boolean ignoreLayout;
    private boolean keyboardVisible;
    private int lastAttachRise;
    private final Runnable limitCheckRunnable;
    private final RichEditorListView listView;
    private ItemOptions menu;
    private MessageSendPreview messageSendPreview;
    private boolean sendButtonShown;
    private RichEditorToolbar toolbar;
    private final RichEditorToolbar.Delegate toolbarDelegate;

    @Override // org.telegram.ui.Components.ChatAttachAlert.AttachAlertLayout
    public boolean disableBottomFade() {
        return true;
    }

    @Override // org.telegram.ui.Components.ChatAttachAlert.AttachAlertLayout
    public int needsActionBar() {
        return 0;
    }

    @Override // org.telegram.ui.Components.ChatAttachAlert.AttachAlertLayout
    public void onHidden() {
    }

    public ChatAttachAlertRichLayout(ChatAttachAlert chatAttachAlert, Context context, int i, Theme.ResourcesProvider resourcesProvider) {
        super(chatAttachAlert, context, resourcesProvider);
        2 r6 = new 2();
        this.toolbarDelegate = r6;
        this.attachButtonsShown = true;
        this.limitCheckRunnable = new Runnable() { // from class: org.telegram.ui.iv.ChatAttachAlertRichLayout$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                ChatAttachAlertRichLayout.this.updateSendButtonEnabled();
            }
        };
        this.currentAccount = i;
        this.occupyStatusBar = true;
        this.occupyNavigationBar = true;
        RichEditorListView richEditorListView = new RichEditorListView(context, i, resourcesProvider, new 1(resourcesProvider));
        this.listView = richEditorListView;
        richEditorListView.setAllowTapAboveContent(false);
        addView(richEditorListView, LayoutHelper.createFrame(-1, -1, 119));
        addView(richEditorListView.getOverlayView(), LayoutHelper.createFrame(-1, -1, 119));
        richEditorListView.seedEmptyArticle();
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            setDefaultFocusHighlightEnabled(false);
        }
        setBackground(null);
        setForeground(null);
        RichEditorToolbar richEditorToolbar = new RichEditorToolbar(context, r6);
        this.toolbar = richEditorToolbar;
        richEditorToolbar.setBackVisible(false);
        this.toolbar.setTopGradientVisible(false);
        updateSendButtonLocked();
        addView(this.toolbar, LayoutHelper.createFrame(-1, -1, 119));
        updateHistoryButtons();
        updateToolbarBlockType();
        updateAttachButtons(false);
        getViewTreeObserver().addOnGlobalFocusChangeListener(new ViewTreeObserver.OnGlobalFocusChangeListener() { // from class: org.telegram.ui.iv.ChatAttachAlertRichLayout$$ExternalSyntheticLambda2
            @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
            public final void onGlobalFocusChanged(View view, View view2) {
                ChatAttachAlertRichLayout.this.lambda$new$0(view, view2);
            }
        });
    }

    class 1 implements RichEditorListView.Delegate {
        final /* synthetic */ Theme.ResourcesProvider val$resourcesProvider;

        1(Theme.ResourcesProvider resourcesProvider) {
            this.val$resourcesProvider = resourcesProvider;
        }

        @Override // org.telegram.ui.iv.RichEditorListView.Delegate
        public ItemOptions makeMenu(View view) {
            ChatAttachAlertRichLayout chatAttachAlertRichLayout = ChatAttachAlertRichLayout.this;
            return chatAttachAlertRichLayout.menu = ItemOptions.makeOptions(chatAttachAlertRichLayout, this.val$resourcesProvider, view, false, false, true);
        }

        @Override // org.telegram.ui.iv.RichEditorListView.Delegate
        public void onSelectionChanged() {
            ChatAttachAlertRichLayout.this.updateFormattingPanel();
            ChatAttachAlertRichLayout.this.updateToolbarBlockType();
        }

        @Override // org.telegram.ui.iv.RichEditorListView.Delegate
        public void onContentChanged() {
            ChatAttachAlertRichLayout.this.updateSendButtonLoading();
            ChatAttachAlertRichLayout.this.scheduleLimitCheck();
        }

        @Override // org.telegram.ui.iv.RichEditorListView.Delegate
        public void onHistoryChanged() {
            ChatAttachAlertRichLayout.this.updateHistoryButtons();
        }

        @Override // org.telegram.ui.iv.RichEditorListView.Delegate
        public void onOpenAttachRequest(int i, int i2) {
            ChatAttachAlertRichLayout.this.openAttach(i, i2);
        }

        @Override // org.telegram.ui.iv.RichEditorListView.Delegate
        public void onOpenLocationRequest(BlockRow blockRow) {
            ChatAttachAlertRichLayout.this.openLocationPicker(blockRow);
        }

        @Override // org.telegram.ui.iv.RichEditorListView.Delegate
        public void onSlashSuggest(RichTextCell richTextCell, String str) {
            if (ChatAttachAlertRichLayout.this.commandSuggestions == null) {
                ChatAttachAlertRichLayout chatAttachAlertRichLayout = ChatAttachAlertRichLayout.this;
                final Theme.ResourcesProvider resourcesProvider = this.val$resourcesProvider;
                chatAttachAlertRichLayout.commandSuggestions = new RichCommandSuggestions(new RichCommandSuggestions.MenuFactory() { // from class: org.telegram.ui.iv.ChatAttachAlertRichLayout$1$$ExternalSyntheticLambda0
                    @Override // org.telegram.ui.iv.RichCommandSuggestions.MenuFactory
                    public final ItemOptions make(View view) {
                        ItemOptions lambda$onSlashSuggest$0;
                        lambda$onSlashSuggest$0 = ChatAttachAlertRichLayout.1.this.lambda$onSlashSuggest$0(resourcesProvider, view);
                        return lambda$onSlashSuggest$0;
                    }
                }, this.val$resourcesProvider);
            }
            ChatAttachAlertRichLayout.this.commandSuggestions.update(richTextCell, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ ItemOptions lambda$onSlashSuggest$0(Theme.ResourcesProvider resourcesProvider, View view) {
            ChatAttachAlertRichLayout chatAttachAlertRichLayout = ChatAttachAlertRichLayout.this;
            return chatAttachAlertRichLayout.menu = ItemOptions.makeOptions(chatAttachAlertRichLayout, resourcesProvider, view, false, false, true);
        }

        @Override // org.telegram.ui.iv.RichEditorListView.Delegate
        public void onListScrolled(int i) {
            ((ChatAttachAlert.AttachAlertLayout) ChatAttachAlertRichLayout.this).parentAlert.updateLayout(ChatAttachAlertRichLayout.this, true, i);
            ChatAttachAlertRichLayout.this.updateToolbarTopOffset();
            ChatAttachAlertRichLayout.this.updateAttachRaise();
        }

        @Override // org.telegram.ui.iv.RichEditorListView.Delegate
        public void onListLayoutUpdated() {
            if (ChatAttachAlertRichLayout.this.getCurrentItemTop() != ChatAttachAlertRichLayout.this.currentItemTop) {
                ((ChatAttachAlert.AttachAlertLayout) ChatAttachAlertRichLayout.this).parentAlert.updateLayout(ChatAttachAlertRichLayout.this, true, 0);
            }
            ChatAttachAlertRichLayout.this.updateToolbarTopOffset();
            ChatAttachAlertRichLayout.this.updateAttachRaise();
        }

        @Override // org.telegram.ui.iv.RichEditorListView.Delegate
        public void makeEditTextFocusable(RichEditText richEditText, boolean z) {
            ((ChatAttachAlert.AttachAlertLayout) ChatAttachAlertRichLayout.this).parentAlert.makeFocusable(richEditText, z);
        }

        @Override // org.telegram.ui.iv.RichEditorListView.Delegate
        public void onReorderStart() {
            if (ChatAttachAlertRichLayout.this.toolbar != null) {
                ChatAttachAlertRichLayout.this.toolbar.onReorderStart();
            }
        }

        @Override // org.telegram.ui.iv.RichEditorListView.Delegate
        public boolean onReorderMove(float f, float f2) {
            return ChatAttachAlertRichLayout.this.toolbar != null && ChatAttachAlertRichLayout.this.toolbar.onReorderMove(f, f2);
        }

        @Override // org.telegram.ui.iv.RichEditorListView.Delegate
        public void onReorderEnd() {
            if (ChatAttachAlertRichLayout.this.toolbar != null) {
                ChatAttachAlertRichLayout.this.toolbar.onReorderEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(View view, View view2) {
        updateToolbarBlockType();
    }

    class 2 implements RichEditorToolbar.Delegate {
        @Override // org.telegram.ui.iv.RichEditorToolbar.Delegate
        public void onBack() {
        }

        2() {
        }

        @Override // org.telegram.ui.iv.RichEditorToolbar.Delegate
        public Theme.ResourcesProvider getResourcesProvider() {
            return ((ChatAttachAlert.AttachAlertLayout) ChatAttachAlertRichLayout.this).resourcesProvider;
        }

        @Override // org.telegram.ui.iv.RichEditorToolbar.Delegate
        public void onUndo() {
            ChatAttachAlertRichLayout.this.listView.undo();
        }

        @Override // org.telegram.ui.iv.RichEditorToolbar.Delegate
        public void onRedo() {
            ChatAttachAlertRichLayout.this.listView.redo();
        }

        @Override // org.telegram.ui.iv.RichEditorToolbar.Delegate
        public void onEmoji() {
            ChatAttachAlertRichLayout.this.toggleEmojiPopup();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAi$0(TL_iv.RichMessage richMessage) {
            ChatAttachAlertRichLayout.this.listView.addRichMessage(richMessage);
        }

        @Override // org.telegram.ui.iv.RichEditorToolbar.Delegate
        public void onAi() {
            new RichAIComposeSheet(ChatAttachAlertRichLayout.this.getContext(), ChatAttachAlertRichLayout.this.currentAccount, ((ChatAttachAlert.AttachAlertLayout) ChatAttachAlertRichLayout.this).resourcesProvider, new Utilities.Callback() { // from class: org.telegram.ui.iv.ChatAttachAlertRichLayout$2$$ExternalSyntheticLambda1
                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    ChatAttachAlertRichLayout.2.this.lambda$onAi$0((TL_iv.RichMessage) obj);
                }
            }).show();
        }

        @Override // org.telegram.ui.iv.RichEditorToolbar.Delegate
        public void onAttach() {
            ChatAttachAlertRichLayout.this.listView.pendingMediaRow = null;
            ChatAttachAlertRichLayout.this.openAttach(74, 0);
        }

        @Override // org.telegram.ui.iv.RichEditorToolbar.Delegate
        public void onSend() {
            ChatAttachAlertRichLayout.this.sendSelectedItems(true, 0, 0, 0L, false);
        }

        @Override // org.telegram.ui.iv.RichEditorToolbar.Delegate
        public boolean onSendLongClick(View view) {
            return ChatAttachAlertRichLayout.this.showSendPreview(view);
        }

        @Override // org.telegram.ui.iv.RichEditorToolbar.Delegate
        public void onBlockButton(int i, View view) {
            ChatAttachAlertRichLayout.this.onBlockButtonClicked(i, view);
        }

        @Override // org.telegram.ui.iv.RichEditorToolbar.Delegate
        public void onFormatting(int i) {
            ChatAttachAlertRichLayout.this.listView.onFormattingClicked(i);
        }

        @Override // org.telegram.ui.iv.RichEditorToolbar.Delegate
        public void onLink() {
            ChatAttachAlertRichLayout.this.listView.onLinkClicked();
        }

        @Override // org.telegram.ui.iv.RichEditorToolbar.Delegate
        public void onDate() {
            ChatAttachAlertRichLayout.this.listView.onDateClicked();
        }

        @Override // org.telegram.ui.iv.RichEditorToolbar.Delegate
        public void onMath() {
            ChatAttachAlertRichLayout.this.listView.onMathClicked();
        }

        @Override // org.telegram.ui.iv.RichEditorToolbar.Delegate
        public void onAiStyle() {
            TL_iv.RichMessage extractRichMessage;
            RichEditorListView.SelectionEdit beginSelectionEdit = ChatAttachAlertRichLayout.this.listView.beginSelectionEdit();
            if (beginSelectionEdit == null || (extractRichMessage = beginSelectionEdit.extractRichMessage()) == null || extractRichMessage.blocks.isEmpty()) {
                return;
            }
            new AIEditorAlert(ChatAttachAlertRichLayout.this.getContext(), ((ChatAttachAlert.AttachAlertLayout) ChatAttachAlertRichLayout.this).resourcesProvider).setText(extractRichMessage).setOnUseRich(new ChatAttachAlertRichLayout$2$$ExternalSyntheticLambda0(beginSelectionEdit)).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateToolbarTopOffset() {
        if (this.toolbar == null) {
            return;
        }
        this.toolbar.setTopButtonsOffset(Math.max((AndroidUtilities.statusBarHeight + ((ActionBar.getCurrentActionBarHeight() - AndroidUtilities.dp(44.0f)) / 2)) - AndroidUtilities.dp(8.0f), firstItemTopRaw()));
    }

    private int firstItemTopRaw() {
        if (this.listView.getChildCount() <= 0) {
            return this.listView.getPaddingTop();
        }
        int i = ConnectionsManager.DEFAULT_DATACENTER_ID;
        for (int i2 = 0; i2 < this.listView.getChildCount(); i2++) {
            View childAt = this.listView.getChildAt(i2);
            if (this.listView.getChildAdapterPosition(childAt) >= 0 && childAt.getY() < i) {
                i = (int) childAt.getY();
            }
        }
        return i == Integer.MAX_VALUE ? this.listView.getPaddingTop() : i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateHistoryButtons() {
        RichEditorToolbar richEditorToolbar = this.toolbar;
        if (richEditorToolbar != null) {
            richEditorToolbar.setHistoryEnabled(this.listView.canUndo(), this.listView.canRedo());
        }
    }

    private boolean checkDiscard() {
        RichEditorListView richEditorListView = this.listView;
        if (richEditorListView == null || !richEditorListView.hasAnyText()) {
            return true;
        }
        new AlertDialog.Builder(getContext(), this.resourcesProvider).setTitle(LocaleController.getString(R.string.ArticleSaveDraftTitle)).setMessage(LocaleController.getString(R.string.ArticleSaveDraftMessage)).setNegativeButton(LocaleController.getString(R.string.Delete), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.iv.ChatAttachAlertRichLayout$$ExternalSyntheticLambda4
            @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
            public final void onClick(AlertDialog alertDialog, int i) {
                ChatAttachAlertRichLayout.this.lambda$checkDiscard$1(alertDialog, i);
            }
        }).setPositiveButton(LocaleController.getString(R.string.Save), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.iv.ChatAttachAlertRichLayout$$ExternalSyntheticLambda5
            @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
            public final void onClick(AlertDialog alertDialog, int i) {
                ChatAttachAlertRichLayout.this.lambda$checkDiscard$2(alertDialog, i);
            }
        }).makeRed(-2).show();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$checkDiscard$1(AlertDialog alertDialog, int i) {
        this.parentAlert.lambda$new$0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$checkDiscard$2(AlertDialog alertDialog, int i) {
        persistDraft();
        this.parentAlert.lambda$new$0();
    }

    private boolean persistDraft() {
        BaseFragment baseFragment = this.parentAlert.baseFragment;
        if (!(baseFragment instanceof ChatActivity)) {
            return false;
        }
        ChatActivity chatActivity = (ChatActivity) baseFragment;
        if (!this.listView.canUndo()) {
            return false;
        }
        TL_iv.RichMessage buildDraftRichMessage = this.listView.buildDraftRichMessage();
        AccountInstance.getInstance(this.currentAccount).getMediaDataController().saveDraft(chatActivity.getDialogId(), chatActivity.getDraftThreadId(), "", null, null, null, null, 0L, false, false, buildDraftRichMessage);
        if (chatActivity.getChatActivityEnterView() == null) {
            return true;
        }
        chatActivity.getChatActivityEnterView().setRichDraftPreview(buildDraftRichMessage);
        return true;
    }

    @Override // org.telegram.ui.Components.ChatAttachAlert.AttachAlertLayout
    public boolean onDismissWithTouchOutside() {
        if (checkDiscard()) {
            return super.onDismissWithTouchOutside();
        }
        return false;
    }

    @Override // org.telegram.ui.Components.ChatAttachAlert.AttachAlertLayout
    public boolean onDismiss() {
        RichEditorListView richEditorListView = this.listView;
        if (richEditorListView != null) {
            richEditorListView.clearContent();
        }
        return super.onDismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onBlockButtonClicked(int i, View view) {
        RichTableCell findFocusedTableCell;
        TL_iv.pageTableCell focusedCellOf;
        final TL_iv.pageBlockMath pageblockmath;
        BlockRow findFocusedRow = this.listView.findFocusedRow();
        if (i == 1) {
            showTextTypeMenu(findFocusedRow, view);
            return;
        }
        if (i == 2) {
            showListMenu(findFocusedRow, view);
            return;
        }
        if (i != 4) {
            if (i != 7) {
                if (i != 9) {
                    return;
                }
                this.listView.insertDetails();
                return;
            }
            if (findFocusedRow != null) {
                TL_iv.PageBlock pageBlock = findFocusedRow.block;
                if (pageBlock instanceof TL_iv.pageBlockMath) {
                    pageblockmath = (TL_iv.pageBlockMath) pageBlock;
                    showEditLatexSheet(getContext(), (pageblockmath != null || TextUtils.isEmpty(pageblockmath.source)) ? "" : pageblockmath.source, new Utilities.Callback() { // from class: org.telegram.ui.iv.ChatAttachAlertRichLayout$$ExternalSyntheticLambda23
                        @Override // org.telegram.messenger.Utilities.Callback
                        public final void run(Object obj) {
                            ChatAttachAlertRichLayout.this.lambda$onBlockButtonClicked$3(pageblockmath, (String) obj);
                        }
                    }, this.resourcesProvider);
                    return;
                }
            }
            pageblockmath = null;
            showEditLatexSheet(getContext(), (pageblockmath != null || TextUtils.isEmpty(pageblockmath.source)) ? "" : pageblockmath.source, new Utilities.Callback() { // from class: org.telegram.ui.iv.ChatAttachAlertRichLayout$$ExternalSyntheticLambda23
                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    ChatAttachAlertRichLayout.this.lambda$onBlockButtonClicked$3(pageblockmath, (String) obj);
                }
            }, this.resourcesProvider);
            return;
        }
        RichEditorListView richEditorListView = this.listView;
        RichTableCell richTableCell = richEditorListView.activeCellSelectionTable;
        if (richTableCell == null && (findFocusedTableCell = richEditorListView.findFocusedTableCell()) != null && findFocusedTableCell.getModel() != null && (focusedCellOf = this.listView.focusedCellOf(findFocusedTableCell)) != null) {
            this.listView.enterCellSelectionMode(findFocusedTableCell, focusedCellOf);
            richTableCell = findFocusedTableCell;
        }
        if (richTableCell != null && richTableCell.getModel() != null && richTableCell.hasCellSelection()) {
            this.listView.showTableCellMenu(richTableCell);
        } else {
            this.listView.addBlock(RichTextCell.newEmptyTable(2, 2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onBlockButtonClicked$3(TL_iv.pageBlockMath pageblockmath, String str) {
        if (pageblockmath != null) {
            pageblockmath.source = str;
            this.listView.adapter.update(false);
        } else {
            TL_iv.pageBlockMath pageblockmath2 = new TL_iv.pageBlockMath();
            pageblockmath2.source = str;
            this.listView.addBlock(pageblockmath2);
        }
    }

    private void showTextTypeMenu(final BlockRow blockRow, View view) {
        ItemOptions itemOptions = this.menu;
        if (itemOptions != null) {
            itemOptions.dismiss();
        }
        final ItemOptions dontFocus = ItemOptions.makeOptions((ViewGroup) this, this.resourcesProvider, view, true).dontFocus();
        final ItemOptions makeSwipeback = dontFocus.makeSwipeback();
        makeSwipeback.add(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new Runnable() { // from class: org.telegram.ui.iv.ChatAttachAlertRichLayout$$ExternalSyntheticLambda31
            @Override // java.lang.Runnable
            public final void run() {
                ItemOptions.this.closeSwipeback();
            }
        });
        makeSwipeback.addGap();
        TL_iv.pageBlockHeading1 pageblockheading1 = new TL_iv.pageBlockHeading1();
        int i = R.drawable.iv_h1;
        addHeadingItem(makeSwipeback, blockRow, pageblockheading1, i, LocaleController.getString(R.string.ArticleHeading1), SharedConfig.fontSize + 2, dontFocus);
        addHeadingItem(makeSwipeback, blockRow, new TL_iv.pageBlockHeading2(), R.drawable.iv_h2, LocaleController.getString(R.string.ArticleHeading2), SharedConfig.fontSize + 1, dontFocus);
        addHeadingItem(makeSwipeback, blockRow, new TL_iv.pageBlockHeading3(), R.drawable.iv_h3, LocaleController.getString(R.string.ArticleHeading3), SharedConfig.fontSize, dontFocus);
        addHeadingItem(makeSwipeback, blockRow, new TL_iv.pageBlockHeading4(), R.drawable.iv_h4, LocaleController.getString(R.string.ArticleHeading4), SharedConfig.fontSize - 1, dontFocus);
        addHeadingItem(makeSwipeback, blockRow, new TL_iv.pageBlockHeading5(), R.drawable.iv_h5, LocaleController.getString(R.string.ArticleHeading5), SharedConfig.fontSize - 2, dontFocus);
        addHeadingItem(makeSwipeback, blockRow, new TL_iv.pageBlockHeading6(), R.drawable.iv_h6, LocaleController.getString(R.string.ArticleHeading6), SharedConfig.fontSize - 3, dontFocus);
        dontFocus.addChecked(blockRow != null && RichEditorListView.isHeading(blockRow.block), i, LocaleController.getString(R.string.ArticleHeading), new Runnable() { // from class: org.telegram.ui.iv.ChatAttachAlertRichLayout$$ExternalSyntheticLambda32
            @Override // java.lang.Runnable
            public final void run() {
                ItemOptions.this.openSwipeback(makeSwipeback);
            }
        });
        dontFocus.addChecked(blockRow != null && (blockRow.block instanceof TL_iv.pageBlockParagraph), R.drawable.iv_text, LocaleController.getString(R.string.ArticleText), new Runnable() { // from class: org.telegram.ui.iv.ChatAttachAlertRichLayout$$ExternalSyntheticLambda33
            @Override // java.lang.Runnable
            public final void run() {
                ChatAttachAlertRichLayout.this.lambda$showTextTypeMenu$6(blockRow);
            }
        });
        dontFocus.addChecked(blockRow != null && (blockRow.block instanceof TL_iv.pageBlockBlockquote), R.drawable.iv_quote, LocaleController.getString(R.string.ArticleQuote), new Runnable() { // from class: org.telegram.ui.iv.ChatAttachAlertRichLayout$$ExternalSyntheticLambda34
            @Override // java.lang.Runnable
            public final void run() {
                ChatAttachAlertRichLayout.this.lambda$showTextTypeMenu$7(blockRow);
            }
        });
        dontFocus.addChecked(blockRow != null && (blockRow.block instanceof TL_iv.pageBlockPullquote), R.drawable.iv_pullquote, LocaleController.getString(R.string.ArticlePullquote), new Runnable() { // from class: org.telegram.ui.iv.ChatAttachAlertRichLayout$$ExternalSyntheticLambda35
            @Override // java.lang.Runnable
            public final void run() {
                ChatAttachAlertRichLayout.this.lambda$showTextTypeMenu$8(blockRow);
            }
        });
        dontFocus.addChecked(blockRow != null && (blockRow.block instanceof TL_iv.pageBlockPreformatted), R.drawable.iv_code, LocaleController.getString(R.string.ArticleCode), new Runnable() { // from class: org.telegram.ui.iv.ChatAttachAlertRichLayout$$ExternalSyntheticLambda36
            @Override // java.lang.Runnable
            public final void run() {
                ChatAttachAlertRichLayout.this.lambda$showTextTypeMenu$9(blockRow);
            }
        });
        dontFocus.addChecked(blockRow != null && (blockRow.block instanceof TL_iv.pageBlockFooter), R.drawable.iv_footer, LocaleController.getString(R.string.ArticleFooter), new Runnable() { // from class: org.telegram.ui.iv.ChatAttachAlertRichLayout$$ExternalSyntheticLambda37
            @Override // java.lang.Runnable
            public final void run() {
                ChatAttachAlertRichLayout.this.lambda$showTextTypeMenu$10(blockRow);
            }
        });
        this.menu = dontFocus.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showTextTypeMenu$6(BlockRow blockRow) {
        this.listView.turnInto(blockRow, new TL_iv.pageBlockParagraph(), 0, 0, false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showTextTypeMenu$7(BlockRow blockRow) {
        this.listView.turnInto(blockRow, RichEditorListView.newBlockquote(), 0, 0, false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showTextTypeMenu$8(BlockRow blockRow) {
        this.listView.turnInto(blockRow, RichEditorListView.newPullquote(), 0, 0, false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showTextTypeMenu$9(BlockRow blockRow) {
        this.listView.turnInto(blockRow, new TL_iv.pageBlockPreformatted(), 0, 0, false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showTextTypeMenu$10(BlockRow blockRow) {
        this.listView.turnInto(blockRow, new TL_iv.pageBlockFooter(), 0, 0, false, false);
    }

    private void addHeadingItem(ItemOptions itemOptions, final BlockRow blockRow, final TL_iv.PageBlock pageBlock, int i, String str, int i2, final ItemOptions itemOptions2) {
        itemOptions.addChecked(blockRow != null && blockRow.block.getClass() == pageBlock.getClass(), i, str, new Runnable() { // from class: org.telegram.ui.iv.ChatAttachAlertRichLayout$$ExternalSyntheticLambda38
            @Override // java.lang.Runnable
            public final void run() {
                ChatAttachAlertRichLayout.this.lambda$addHeadingItem$11(blockRow, pageBlock, itemOptions2);
            }
        });
        itemOptions.getLast().textView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_MERRIWEATHER_BOLD));
        itemOptions.getLast().textView.setTextSize(1, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addHeadingItem$11(BlockRow blockRow, TL_iv.PageBlock pageBlock, ItemOptions itemOptions) {
        this.listView.turnInto(blockRow, pageBlock, 0, 0, false, false);
        itemOptions.dismiss();
    }

    private void showListMenu(final BlockRow blockRow, View view) {
        ItemOptions itemOptions = this.menu;
        if (itemOptions != null) {
            itemOptions.dismiss();
        }
        final ItemOptions dontFocus = ItemOptions.makeOptions(this, this.resourcesProvider, view).dontFocus();
        boolean z = false;
        ItemOptions addChecked = dontFocus.addChecked(blockRow == null || !blockRow.isInList(), R.drawable.field_carret_empty, LocaleController.getString(R.string.ArticleNone), new Runnable() { // from class: org.telegram.ui.iv.ChatAttachAlertRichLayout$$ExternalSyntheticLambda24
            @Override // java.lang.Runnable
            public final void run() {
                ChatAttachAlertRichLayout.this.lambda$showListMenu$12(blockRow);
            }
        }).addChecked((blockRow == null || !blockRow.isInList() || blockRow.isChecklist() || blockRow.isOrdered()) ? false : true, R.drawable.iv_list, LocaleController.getString(R.string.ArticleListBulleted), new Runnable() { // from class: org.telegram.ui.iv.ChatAttachAlertRichLayout$$ExternalSyntheticLambda25
            @Override // java.lang.Runnable
            public final void run() {
                ChatAttachAlertRichLayout.this.lambda$showListMenu$13(blockRow);
            }
        }).addChecked(blockRow != null && blockRow.isInList() && !blockRow.isChecklist() && blockRow.isOrdered(), R.drawable.iv_ordered_list, LocaleController.getString(R.string.ArticleListNumbered), new Runnable() { // from class: org.telegram.ui.iv.ChatAttachAlertRichLayout$$ExternalSyntheticLambda26
            @Override // java.lang.Runnable
            public final void run() {
                ChatAttachAlertRichLayout.this.lambda$showListMenu$14(blockRow);
            }
        }).addChecked(blockRow != null && blockRow.isInList() && blockRow.isChecklist() && !blockRow.isOrdered(), R.drawable.iv_todo, LocaleController.getString(R.string.ArticleListTodo), new Runnable() { // from class: org.telegram.ui.iv.ChatAttachAlertRichLayout$$ExternalSyntheticLambda27
            @Override // java.lang.Runnable
            public final void run() {
                ChatAttachAlertRichLayout.this.lambda$showListMenu$15(blockRow);
            }
        });
        boolean z2 = blockRow != null && (blockRow.block instanceof TL_iv.pageBlockDetails);
        int i = R.drawable.iv_details;
        String string = LocaleController.getString(R.string.ArticleToggleBlock);
        RichEditorListView richEditorListView = this.listView;
        Objects.requireNonNull(richEditorListView);
        addChecked.addChecked(z2, i, string, new ChatAttachAlertRichLayout$$ExternalSyntheticLambda28(richEditorListView));
        int indexOf = blockRow != null ? this.listView.rows.indexOf(blockRow) : -1;
        boolean z3 = blockRow != null && blockRow.isInList();
        boolean z4 = z3 && this.listView.canIndentRow(indexOf);
        if (z3 && this.listView.canOutdentRow(indexOf) && ((BlockRow) this.listView.rows.get(indexOf)).level > 1) {
            z = true;
        }
        if (z4 || z) {
            dontFocus.addGap();
            if (z4) {
                dontFocus.add(R.drawable.iv_list_tab, LocaleController.getString(R.string.ArticleIndent), new Runnable() { // from class: org.telegram.ui.iv.ChatAttachAlertRichLayout$$ExternalSyntheticLambda29
                    @Override // java.lang.Runnable
                    public final void run() {
                        ChatAttachAlertRichLayout.this.lambda$showListMenu$16(blockRow, dontFocus);
                    }
                });
            }
            if (z) {
                dontFocus.add(R.drawable.iv_list_untab, LocaleController.getString(R.string.ArticleOutdent), new Runnable() { // from class: org.telegram.ui.iv.ChatAttachAlertRichLayout$$ExternalSyntheticLambda30
                    @Override // java.lang.Runnable
                    public final void run() {
                        ChatAttachAlertRichLayout.this.lambda$showListMenu$17(blockRow, dontFocus);
                    }
                });
            }
        }
        this.menu = dontFocus.forceTop(true).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showListMenu$12(BlockRow blockRow) {
        this.listView.turnIntoList(blockRow, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showListMenu$13(BlockRow blockRow) {
        this.listView.turnIntoList(blockRow, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showListMenu$14(BlockRow blockRow) {
        this.listView.turnIntoList(blockRow, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showListMenu$15(BlockRow blockRow) {
        this.listView.turnIntoList(blockRow, 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showListMenu$16(BlockRow blockRow, ItemOptions itemOptions) {
        this.listView.onCellIndent(blockRow, false);
        itemOptions.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showListMenu$17(BlockRow blockRow, ItemOptions itemOptions) {
        this.listView.onCellIndent(blockRow, true);
        itemOptions.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateFormattingPanel() {
        if (this.toolbar == null) {
            return;
        }
        boolean z = this.listView.isInSelectionMode() && this.listView.selectionHasInlineFormattable();
        this.toolbar.showFormattingPanel(z, true);
        if (z) {
            updateFormattingButtons();
        }
    }

    private void updateFormattingButtons() {
        int i;
        TextSelectionHelper.ArticleTextSelectionHelper textSelectionHelper = this.listView.getTextSelectionHelper();
        if (this.toolbar == null || textSelectionHelper == null || !textSelectionHelper.isInSelectionMode()) {
            return;
        }
        if (this.listView.isTableSelection()) {
            updateFormattingButtonsTable();
            return;
        }
        if (this.listView.isCaptionSelection()) {
            updateFormattingButtonsCaption();
            return;
        }
        int startCell = textSelectionHelper.getStartCell();
        int endCell = textSelectionHelper.getEndCell();
        int startOffset = textSelectionHelper.getStartOffset();
        int endOffset = textSelectionHelper.getEndOffset();
        boolean z = startCell >= 0 && endCell >= 0 && endCell >= startCell && endCell < this.listView.itemRows.size();
        if (z) {
            int[] iArr = STYLE_FLAGS;
            int length = iArr.length;
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                int i4 = iArr[i2];
                int i5 = i2;
                if (this.listView.isStyleFullyApplied(i4, startCell, startOffset, endCell, endOffset)) {
                    i3 |= i4;
                }
                i2 = i5 + 1;
            }
            i = i3;
        } else {
            i = 0;
        }
        this.toolbar.setFormattingState(i, z && this.listView.isLinkApplied(startCell, startOffset, endCell, endOffset), z && this.listView.isDateApplied(startCell, startOffset, endCell, endOffset), z && startCell == endCell, !this.listView.isSelectionAllHeadings());
    }

    private void updateFormattingButtonsTable() {
        TextSelectionHelper.ArticleTextSelectionHelper textSelectionHelper = this.listView.getTextSelectionHelper();
        int startCell = textSelectionHelper.getStartCell();
        int startChildPosition = textSelectionHelper.getStartChildPosition();
        int endChildPosition = textSelectionHelper.getEndChildPosition();
        int startOffset = textSelectionHelper.getStartOffset();
        int endOffset = textSelectionHelper.getEndOffset();
        int[] iArr = STYLE_FLAGS;
        int length = iArr.length;
        boolean z = false;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = iArr[i];
            int i4 = i;
            if (this.listView.isStyleFullyAppliedTable(i3, startCell, startChildPosition, startOffset, endChildPosition, endOffset)) {
                i2 |= i3;
            }
            i = i4 + 1;
        }
        boolean z2 = startChildPosition == endChildPosition;
        RichEditText tableEditText = z2 ? this.listView.tableEditText(startCell, startChildPosition) : null;
        int max = Math.max(0, Math.min(startOffset, endOffset));
        int max2 = tableEditText == null ? 0 : Math.max(0, Math.min(Math.max(startOffset, endOffset), tableEditText.length()));
        RichEditorToolbar richEditorToolbar = this.toolbar;
        boolean z3 = tableEditText != null && max < max2 && RichTextStyle.hasLink(tableEditText.getText(), max, max2);
        if (tableEditText != null && max < max2 && RichTextStyle.hasDate(tableEditText.getText(), max, max2)) {
            z = true;
        }
        richEditorToolbar.setFormattingState(i2, z3, z, z2, true);
    }

    private void updateFormattingButtonsCaption() {
        int i;
        TextSelectionHelper.ArticleTextSelectionHelper textSelectionHelper = this.listView.getTextSelectionHelper();
        RichEditText captionEditText = this.listView.captionEditText(textSelectionHelper.getStartCell());
        int startOffset = textSelectionHelper.getStartOffset();
        int endOffset = textSelectionHelper.getEndOffset();
        int max = captionEditText == null ? 0 : Math.max(0, Math.min(Math.min(startOffset, endOffset), captionEditText.length()));
        int max2 = captionEditText == null ? 0 : Math.max(0, Math.min(Math.max(startOffset, endOffset), captionEditText.length()));
        if (captionEditText == null || max >= max2) {
            i = 0;
        } else {
            int i2 = 0;
            for (int i3 : STYLE_FLAGS) {
                if ((captionEditText.getCurrentStyle(max, max2) & i3) != 0) {
                    i2 |= i3;
                }
            }
            i = i2;
        }
        this.toolbar.setFormattingState(i, captionEditText != null && max < max2 && RichTextStyle.hasLink(captionEditText.getText(), max, max2), captionEditText != null && max < max2 && RichTextStyle.hasDate(captionEditText.getText(), max, max2), true, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0076, code lost:
    
        if ((r1 instanceof org.telegram.tgnet.tl.TL_iv.pageBlockPullquote) == false) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void updateToolbarBlockType() {
        BlockRow findFocusedRow;
        int i;
        if (this.toolbar == null) {
            return;
        }
        TextSelectionHelper.ArticleTextSelectionHelper textSelectionHelper = this.listView.getTextSelectionHelper();
        if (textSelectionHelper != null && textSelectionHelper.isInSelectionMode()) {
            int startCell = textSelectionHelper.getStartCell();
            findFocusedRow = startCell == textSelectionHelper.getEndCell() ? this.listView.rowForCell(startCell) : null;
        } else {
            findFocusedRow = this.listView.findFocusedRow();
        }
        int i2 = 0;
        if (this.listView.findFocusedTableCell() == null) {
            if (findFocusedRow != null) {
                if (!findFocusedRow.isChecklist() && !findFocusedRow.isInList() && !findFocusedRow.isOrdered()) {
                    TL_iv.PageBlock pageBlock = findFocusedRow.block;
                    if (!(pageBlock instanceof TL_iv.pageBlockDetails)) {
                        if (!(pageBlock instanceof TL_iv.pageBlockTable)) {
                            if (pageBlock instanceof TL_iv.pageBlockMath) {
                                i = 7;
                            } else {
                                if (!RichEditorListView.isHeading(pageBlock)) {
                                    TL_iv.PageBlock pageBlock2 = findFocusedRow.block;
                                    if (!(pageBlock2 instanceof TL_iv.pageBlockParagraph)) {
                                        if (!(pageBlock2 instanceof TL_iv.pageBlockPreformatted)) {
                                            if (!(pageBlock2 instanceof TL_iv.pageBlockBlockquote)) {
                                            }
                                        }
                                    }
                                }
                                i = 1;
                            }
                            if (findFocusedRow != null) {
                                if (i == 1) {
                                    TL_iv.PageBlock pageBlock3 = findFocusedRow.block;
                                    if (pageBlock3 instanceof TL_iv.pageBlockHeading1) {
                                        i2 = R.drawable.iv_h1;
                                    } else if (pageBlock3 instanceof TL_iv.pageBlockHeading2) {
                                        i2 = R.drawable.iv_h2;
                                    } else if (pageBlock3 instanceof TL_iv.pageBlockHeading3) {
                                        i2 = R.drawable.iv_h3;
                                    } else if (pageBlock3 instanceof TL_iv.pageBlockHeading4) {
                                        i2 = R.drawable.iv_h4;
                                    } else if (pageBlock3 instanceof TL_iv.pageBlockHeading5) {
                                        i2 = R.drawable.iv_h5;
                                    } else if (pageBlock3 instanceof TL_iv.pageBlockHeading6) {
                                        i2 = R.drawable.iv_h6;
                                    } else if (pageBlock3 instanceof TL_iv.pageBlockPreformatted) {
                                        i2 = R.drawable.iv_code;
                                    } else if (pageBlock3 instanceof TL_iv.pageBlockBlockquote) {
                                        i2 = R.drawable.iv_quote;
                                    } else if (pageBlock3 instanceof TL_iv.pageBlockPullquote) {
                                        i2 = R.drawable.iv_pullquote;
                                    } else if (pageBlock3 instanceof TL_iv.pageBlockFooter) {
                                        i2 = R.drawable.iv_footer;
                                    }
                                } else if (i == 2) {
                                    if (findFocusedRow.isChecklist()) {
                                        i2 = R.drawable.iv_todo;
                                    } else if (findFocusedRow.isOrdered()) {
                                        i2 = R.drawable.iv_ordered_list;
                                    }
                                }
                            }
                            this.toolbar.setSelectedBlockType(i, i2);
                        }
                    }
                }
                i = 2;
                if (findFocusedRow != null) {
                }
                this.toolbar.setSelectedBlockType(i, i2);
            }
            i = 0;
            if (findFocusedRow != null) {
            }
            this.toolbar.setSelectedBlockType(i, i2);
        }
        i = 4;
        if (findFocusedRow != null) {
        }
        this.toolbar.setSelectedBlockType(i, i2);
    }

    public TextSelectionHelper.ArticleTextSelectionHelper getTextSelectionHelper() {
        return this.listView.getTextSelectionHelper();
    }

    private void updateSendButton(boolean z) {
        updateAttachButtons(z);
    }

    private void updateAttachButtons(boolean z) {
        boolean z2 = this.listView.hasAnyText() || this.emojiViewVisible;
        this.parentAlert.setTypeButtonsHidden(z2, z);
        this.attachRaise = attachRaiseTarget(z2);
        layoutBottomPanels();
        if (this.attachButtonsShown == z2) {
            this.attachButtonsShown = !z2;
            requestLayout();
        }
    }

    private int attachRaiseTarget(boolean z) {
        if (!z) {
            ChatAttachAlert chatAttachAlert = this.parentAlert;
            if (!chatAttachAlert.pinnedToTop) {
                return chatAttachAlert.getTypeButtonsHeight();
            }
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateAttachRaise() {
        int attachRaiseTarget = attachRaiseTarget(this.listView.hasAnyText() || this.emojiViewVisible);
        if (this.attachRaise != attachRaiseTarget) {
            this.attachRaise = attachRaiseTarget;
            layoutBottomPanels();
        }
    }

    private int bottomNavInset() {
        if (this.keyboardVisible || this.emojiPadding > 0) {
            return 0;
        }
        return AndroidUtilities.navigationBarHeight;
    }

    private int emojiVisibleHeight() {
        return this.emojiSearchOpened ? AndroidUtilities.dp(245.0f) : this.emojiPadding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void layoutBottomPanels() {
        int emojiVisibleHeight = emojiVisibleHeight();
        EmojiView emojiView = this.emojiView;
        if (emojiView != null) {
            if (this.emojiViewVisible) {
                r3 = (this.emojiSearchOpened ? -this.parentAlert.currentPanTranslationY : 0.0f) + (this.emojiPadding - emojiVisibleHeight);
            }
            emojiView.setTranslationY(r3);
        }
        if (this.toolbar != null) {
            if (!this.emojiViewVisible) {
                emojiVisibleHeight = bottomNavInset();
            }
            float f = emojiVisibleHeight;
            if (!this.emojiViewVisible || this.emojiSearchOpened) {
                f += this.parentAlert.currentPanTranslationY;
            }
            this.toolbar.getBottomContainer().animate().cancel();
            this.toolbar.getBottomContainer().setTranslationY(-f);
            if (this.lastAttachRise != this.attachRaise) {
                ViewPropertyAnimator animate = this.toolbar.getBottomInnerContainer().animate();
                this.lastAttachRise = this.attachRaise;
                animate.translationY(-r1).setDuration(320L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
            }
        }
    }

    @Override // org.telegram.ui.Components.ChatAttachAlert.AttachAlertLayout
    public boolean onBackPressed() {
        if (this.emojiSearchOpened) {
            closeEmojiSearch();
            return false;
        }
        if (this.emojiViewVisible) {
            hideEmojiPopup();
            return false;
        }
        if (this.listView.deselectIfAny()) {
            return false;
        }
        if (checkDiscard()) {
            return super.onBackPressed();
        }
        return true;
    }

    @Override // org.telegram.ui.Components.ChatAttachAlert.AttachAlertLayout
    public boolean shouldHideBottomButtons() {
        return !this.listView.hasAnyText();
    }

    @Override // org.telegram.ui.Components.ChatAttachAlert.AttachAlertLayout
    public int getListTopPadding() {
        return (this.listView.getPaddingTop() - AndroidUtilities.statusBarHeight) - ActionBar.getCurrentActionBarHeight();
    }

    @Override // org.telegram.ui.Components.ChatAttachAlert.AttachAlertLayout
    public int getCurrentItemTop() {
        if (this.listView.getChildCount() <= 0) {
            RichEditorListView richEditorListView = this.listView;
            int paddingTop = richEditorListView.getPaddingTop();
            this.currentItemTop = paddingTop;
            richEditorListView.setTopGlowOffset(paddingTop);
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        int i = ConnectionsManager.DEFAULT_DATACENTER_ID;
        boolean z = false;
        for (int i2 = 0; i2 < this.listView.getChildCount(); i2++) {
            View childAt = this.listView.getChildAt(i2);
            int childAdapterPosition = this.listView.getChildAdapterPosition(childAt);
            if (childAdapterPosition == 0) {
                z = true;
            }
            if (childAdapterPosition >= 0 && childAt.getTop() < i) {
                i = (int) childAt.getY();
            }
        }
        if (i == Integer.MAX_VALUE) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        this.listView.setTopGlowOffset(Math.max(0, i));
        int i3 = i - AndroidUtilities.statusBarHeight;
        int dp = AndroidUtilities.dp(7.0f);
        if (i3 < AndroidUtilities.dp(7.0f) || !z) {
            i3 = dp;
        }
        this.currentItemTop = i3;
        return i3;
    }

    @Override // org.telegram.ui.Components.ChatAttachAlert.AttachAlertLayout
    public int getFirstOffset() {
        return getListTopPadding() + AndroidUtilities.dp(56.0f);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.ignoreLayout) {
            return;
        }
        super.requestLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    @Override // org.telegram.ui.Components.ChatAttachAlert.AttachAlertLayout
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onPreMeasure(int i, int i2) {
        int dp;
        int i3;
        ItemOptions itemOptions;
        boolean z = this.keyboardVisible;
        boolean z2 = this.parentAlert.sizeNotifierFrameLayout.measureKeyboardHeight() > AndroidUtilities.dp(20.0f);
        this.keyboardVisible = z2;
        if (!z2 && z && (itemOptions = this.menu) != null) {
            itemOptions.dismiss();
            this.menu = null;
        }
        if (this.keyboardVisible || this.emojiPadding > AndroidUtilities.dp(20.0f)) {
            dp = AndroidUtilities.dp(52.0f);
            this.parentAlert.setAllowNestedScroll(false);
        } else {
            if (!AndroidUtilities.isTablet()) {
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i3 = (int) (i2 / 3.5f);
                    dp = i3 - AndroidUtilities.dp(52.0f);
                    if (dp < 0) {
                        dp = 0;
                    }
                    this.parentAlert.setAllowNestedScroll(true);
                }
            }
            i3 = (i2 / 5) * 2;
            dp = i3 - AndroidUtilities.dp(52.0f);
            if (dp < 0) {
            }
            this.parentAlert.setAllowNestedScroll(true);
        }
        int currentActionBarHeight = dp + AndroidUtilities.statusBarHeight + ActionBar.getCurrentActionBarHeight();
        int bottomNavInset = bottomNavInset() + AndroidUtilities.dp(110.0f) + ((this.listView.hasAnyText() || this.emojiViewVisible) ? 0 : this.parentAlert.getTypeButtonsHeight()) + this.emojiPadding;
        if (this.listView.getPaddingTop() != currentActionBarHeight || this.listView.getPaddingBottom() != bottomNavInset) {
            this.ignoreLayout = true;
            this.listView.setPaddingWithoutRequestLayout(0, currentActionBarHeight, 0, bottomNavInset);
            this.ignoreLayout = false;
        }
        updateToolbarTopOffset();
    }

    @Override // org.telegram.ui.Components.ChatAttachAlert.AttachAlertLayout
    public void scrollToTop() {
        this.listView.smoothScrollToPosition(0);
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        this.parentAlert.getSheetContainer().invalidate();
        invalidate();
    }

    @Override // org.telegram.ui.Components.ChatAttachAlert.AttachAlertLayout
    public void onPanTransitionStart(boolean z, int i) {
        super.onPanTransitionStart(z, i);
        this.keyboardVisible = z;
        layoutBottomPanels();
        if (z && this.emojiViewVisible && !this.emojiSearchOpened) {
            hideEmojiPopup();
        }
        updateToolbarTopOffset();
    }

    @Override // org.telegram.ui.Components.ChatAttachAlert.AttachAlertLayout
    public void onContainerTranslationUpdated(float f) {
        super.onContainerTranslationUpdated(f);
        layoutBottomPanels();
    }

    @Override // org.telegram.ui.Components.ChatAttachAlert.AttachAlertLayout
    public void onPanTransitionEnd() {
        super.onPanTransitionEnd();
        this.keyboardVisible = this.parentAlert.sizeNotifierFrameLayout.measureKeyboardHeight() > AndroidUtilities.dp(20.0f);
        layoutBottomPanels();
        updateToolbarTopOffset();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        EmojiView emojiView;
        if (this.listView.textSelectionHelper.isInSelectionMode() && this.listView.textSelectionOverlay.onTouchEvent(motionEvent)) {
            return true;
        }
        int height = (((!this.emojiSearchOpened || (emojiView = this.emojiView) == null) ? getHeight() - this.emojiPadding : (int) emojiView.getY()) - AndroidUtilities.dp(60.0f)) - this.attachRaise;
        if (motionEvent.getAction() == 0 && this.emojiViewVisible && motionEvent.getY() < height) {
            hideEmojiPopup();
        }
        if ((motionEvent.getAction() != 0 || (motionEvent.getY() > AndroidUtilities.dp(60.0f) && motionEvent.getY() < height)) && this.listView.textSelectionOverlay.checkOnTap(motionEvent)) {
            motionEvent.setAction(3);
        }
        if (motionEvent.getY() >= height || !this.listView.handleSelectionTouch(motionEvent)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 47 && keyEvent.isCtrlPressed()) {
            saveDraftWithBulletin();
            return true;
        }
        if (this.listView.handleKeyEvent(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    private void saveDraftWithBulletin() {
        if ((this.parentAlert.baseFragment instanceof ChatActivity) && this.listView.canUndo() && persistDraft()) {
            BulletinFactory.of(this.toolbar, this.resourcesProvider).createSimpleBulletin(R.raw.contact_check, LocaleController.getString(R.string.RichEditorDraftSaved)).show();
        }
    }

    @Override // org.telegram.ui.Components.ChatAttachAlert.AttachAlertLayout
    public void onShow(ChatAttachAlert.AttachAlertLayout attachAlertLayout) {
        this.parentAlert.actionBar.setTitle("");
        this.listView.adapter.update(false);
        updateAttachButtons(false);
        post(new Runnable() { // from class: org.telegram.ui.iv.ChatAttachAlertRichLayout$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                ChatAttachAlertRichLayout.this.updateToolbarTopOffset();
            }
        });
    }

    @Override // org.telegram.ui.Components.ChatAttachAlert.AttachAlertLayout
    public void onHide() {
        RichCommandSuggestions richCommandSuggestions = this.commandSuggestions;
        if (richCommandSuggestions != null) {
            richCommandSuggestions.hide();
        }
        if (this.emojiViewVisible) {
            hideEmojiPopup();
        }
        if (this.sendButtonShown) {
            this.sendButtonShown = false;
            this.parentAlert.showSendButtonOnly(false, true);
        }
    }

    @Override // org.telegram.ui.Components.ChatAttachAlert.AttachAlertLayout
    public boolean sendSelectedItems(boolean z, int i, int i2, long j, boolean z2) {
        MessageObject messageObject;
        MessageObject messageObject2;
        long j2;
        int i3;
        if (!MessagesController.getInstance(this.currentAccount).richEditorAllowed()) {
            if (!UserConfig.getInstance(this.currentAccount).isPremium()) {
                new PremiumFeatureBottomSheet(this.parentAlert.baseFragment, getContext(), this.currentAccount, 43, true).show();
            }
            return false;
        }
        if (!this.listView.hasAnyText() || this.listView.hasPendingUploads()) {
            return false;
        }
        if (!this.listView.isWithinLimits()) {
            updateSendButtonEnabled();
            return false;
        }
        ArrayList flattenRowsToBlocks = this.listView.flattenRowsToBlocks();
        if (flattenRowsToBlocks.isEmpty()) {
            return false;
        }
        ArrayList collectPhotos = this.listView.collectPhotos();
        ArrayList collectDocuments = this.listView.collectDocuments();
        BaseFragment baseFragment = this.parentAlert.baseFragment;
        if (baseFragment instanceof ChatActivity) {
            ChatActivity chatActivity = (ChatActivity) baseFragment;
            MessageObject replyMessage = chatActivity.getReplyMessage();
            MessageObject threadMessage = chatActivity.getThreadMessage();
            long sendMonoForumPeerId = chatActivity.getSendMonoForumPeerId();
            i3 = chatActivity.getQuickReplyId();
            messageObject = replyMessage;
            messageObject2 = threadMessage;
            j2 = sendMonoForumPeerId;
        } else {
            messageObject = null;
            messageObject2 = null;
            j2 = 0;
            i3 = 0;
        }
        SendMessagesHelper.prepareSendingArticle(AccountInstance.getInstance(this.parentAlert.currentAccount), flattenRowsToBlocks, collectPhotos, collectDocuments, null, false, this.parentAlert.getDialogId(), messageObject, messageObject2, z, i, i2, null, i3, j, j2, 0L);
        this.parentAlert.dismiss(true);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean showSendPreview(View view) {
        if (!UserConfig.getInstance(this.currentAccount).isPremium()) {
            new PremiumFeatureBottomSheet(this.parentAlert.baseFragment, getContext(), this.currentAccount, 43, true).show();
            return true;
        }
        boolean z = false;
        if (!this.listView.hasAnyText() || this.listView.hasPendingUploads()) {
            return false;
        }
        if (!this.listView.isWithinLimits()) {
            updateSendButtonEnabled();
            return false;
        }
        ArrayList<TL_iv.PageBlock> flattenRowsToBlocks = this.listView.flattenRowsToBlocks();
        if (flattenRowsToBlocks.isEmpty()) {
            return false;
        }
        BaseFragment baseFragment = this.parentAlert.baseFragment;
        ChatActivity chatActivity = baseFragment instanceof ChatActivity ? (ChatActivity) baseFragment : null;
        MessageSendPreview messageSendPreview = this.messageSendPreview;
        if (messageSendPreview != null) {
            messageSendPreview.dismiss(false);
            this.messageSendPreview = null;
        }
        MessageSendPreview messageSendPreview2 = new MessageSendPreview(getContext(), this.resourcesProvider);
        this.messageSendPreview = messageSendPreview2;
        messageSendPreview2.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.iv.ChatAttachAlertRichLayout$$ExternalSyntheticLambda15
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                ChatAttachAlertRichLayout.this.lambda$showSendPreview$18(dialogInterface);
            }
        });
        final long dialogId = this.parentAlert.getDialogId();
        MessageObject replyMessage = chatActivity != null ? chatActivity.getReplyMessage() : null;
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.id = 0;
        tL_message.out = true;
        tL_message.peer_id = MessagesController.getInstance(this.currentAccount).getPeer(dialogId);
        tL_message.from_id = MessagesController.getInstance(this.currentAccount).getPeer(UserConfig.getInstance(this.currentAccount).getClientUserId());
        tL_message.flags2 |= 8192;
        TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
        tL_message.rich_message = richMessage;
        richMessage.blocks = flattenRowsToBlocks;
        richMessage.photos = this.listView.collectPhotos();
        tL_message.rich_message.documents = this.listView.collectDocuments();
        if (replyMessage != null && !replyMessage.isTopicMainMessage) {
            TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
            tL_messageReplyHeader.flags |= 16;
            tL_messageReplyHeader.reply_to_msg_id = replyMessage.getId();
            tL_message.reply_to = tL_messageReplyHeader;
        }
        MessageObject messageObject = new MessageObject(this.currentAccount, tL_message, false, false);
        if (replyMessage != null && !replyMessage.isTopicMainMessage) {
            messageObject.replyMessageObject = replyMessage;
        }
        messageObject.sendPreview = true;
        messageObject.isOutOwnerCached = Boolean.TRUE;
        messageObject.generateLayout(null);
        messageObject.notime = true;
        ArrayList arrayList = new ArrayList();
        arrayList.add(messageObject);
        this.messageSendPreview.setMessageObjects(arrayList);
        ChatActivityEnterView.SendButton sendButton = this.toolbar.getSendButton();
        sendButton.setScaleX(1.0f);
        sendButton.setScaleY(1.0f);
        ChatActivityEnterView.SendButton sendButton2 = this.messageSendPreview.setSendButton(sendButton, true, new View.OnClickListener() { // from class: org.telegram.ui.iv.ChatAttachAlertRichLayout$$ExternalSyntheticLambda16
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ChatAttachAlertRichLayout.this.lambda$showSendPreview$19(view2);
            }
        });
        if (sendButton2 != null) {
            sendButton2.setBackground(RichEditor.withShadow(Theme.createRoundRectDrawable(AndroidUtilities.dp(22.0f), getThemedColor(Theme.key_featuredStickers_addButton))));
            this.messageSendPreview.setSendButtonWidth(AndroidUtilities.dp(44.0f));
        }
        ItemOptions makeOptions = ItemOptions.makeOptions(this, this.resourcesProvider, sendButton);
        if (chatActivity != null && UserObject.isUserSelf(chatActivity.getCurrentUser())) {
            z = true;
        }
        if (chatActivity != null && chatActivity.canScheduleMessage()) {
            makeOptions.add(R.drawable.msg_calendar2, LocaleController.getString(z ? R.string.SetReminder : R.string.ScheduleMessage), new Runnable() { // from class: org.telegram.ui.iv.ChatAttachAlertRichLayout$$ExternalSyntheticLambda17
                @Override // java.lang.Runnable
                public final void run() {
                    ChatAttachAlertRichLayout.this.lambda$showSendPreview$20(dialogId);
                }
            });
            if (!z && dialogId > 0) {
                makeOptions.add(R.drawable.msg_online, LocaleController.getString(R.string.SendWhenOnline), new Runnable() { // from class: org.telegram.ui.iv.ChatAttachAlertRichLayout$$ExternalSyntheticLambda18
                    @Override // java.lang.Runnable
                    public final void run() {
                        ChatAttachAlertRichLayout.this.lambda$showSendPreview$21();
                    }
                });
            }
        }
        if (!z) {
            makeOptions.add(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new Runnable() { // from class: org.telegram.ui.iv.ChatAttachAlertRichLayout$$ExternalSyntheticLambda19
                @Override // java.lang.Runnable
                public final void run() {
                    ChatAttachAlertRichLayout.this.lambda$showSendPreview$22();
                }
            });
        }
        makeOptions.setupSelectors();
        this.messageSendPreview.setItemOptions(makeOptions);
        this.messageSendPreview.show();
        try {
            view.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showSendPreview$18(DialogInterface dialogInterface) {
        this.messageSendPreview = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showSendPreview$19(View view) {
        sendSelectedItems(true, 0, 0, 0L, false);
        MessageSendPreview messageSendPreview = this.messageSendPreview;
        if (messageSendPreview != null) {
            messageSendPreview.dismiss(true);
            this.messageSendPreview = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showSendPreview$20(long j) {
        AlertsCreator.createScheduleDatePickerDialog(this.parentAlert.baseFragment.getParentActivity(), j, new AlertsCreator.ScheduleDatePickerDelegate() { // from class: org.telegram.ui.iv.ChatAttachAlertRichLayout.3
            @Override // org.telegram.ui.Components.AlertsCreator.ScheduleDatePickerDelegate
            public void didSelectDate(boolean z, int i, int i2) {
                ChatAttachAlertRichLayout.this.sendSelectedItems(z, i, i2, 0L, false);
                if (ChatAttachAlertRichLayout.this.messageSendPreview != null) {
                    ChatAttachAlertRichLayout.this.messageSendPreview.dismissInstant();
                    ChatAttachAlertRichLayout.this.messageSendPreview = null;
                }
            }
        }, this.resourcesProvider);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showSendPreview$21() {
        sendSelectedItems(true, 2147483646, 0, 0L, false);
        MessageSendPreview messageSendPreview = this.messageSendPreview;
        if (messageSendPreview != null) {
            messageSendPreview.dismiss(false);
            this.messageSendPreview = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showSendPreview$22() {
        sendSelectedItems(false, 0, 0, 0L, false);
        MessageSendPreview messageSendPreview = this.messageSendPreview;
        if (messageSendPreview != null) {
            messageSendPreview.dismiss(true);
            this.messageSendPreview = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void openLocationPicker(final BlockRow blockRow) {
        BaseFragment baseFragment = this.parentAlert.baseFragment;
        if (baseFragment != null && blockRow != null && (blockRow.block instanceof TL_iv.pageBlockMap) && AndroidUtilities.isMapsInstalled(baseFragment)) {
            final ChatAttachAlert chatAttachAlert = new ChatAttachAlert(getContext(), this.parentAlert.baseFragment, false, false, false, null);
            chatAttachAlert.setDelegate(new ChatAttachAlert.ChatAttachViewDelegate() { // from class: org.telegram.ui.iv.ChatAttachAlertRichLayout.4
                @Override // org.telegram.ui.Components.ChatAttachAlert.ChatAttachViewDelegate
                public void didPressedButton(int i, boolean z, boolean z2, int i2, int i3, long j, boolean z3, boolean z4, long j2) {
                }

                @Override // org.telegram.ui.Components.ChatAttachAlert.ChatAttachViewDelegate
                public /* synthetic */ void didSelectBot(TLRPC.User user) {
                    ChatAttachAlert.ChatAttachViewDelegate.-CC.$default$didSelectBot(this, user);
                }

                @Override // org.telegram.ui.Components.ChatAttachAlert.ChatAttachViewDelegate
                public /* synthetic */ void doOnIdle(Runnable runnable) {
                    runnable.run();
                }

                @Override // org.telegram.ui.Components.ChatAttachAlert.ChatAttachViewDelegate
                public /* synthetic */ boolean needEnterComment() {
                    return ChatAttachAlert.ChatAttachViewDelegate.-CC.$default$needEnterComment(this);
                }

                @Override // org.telegram.ui.Components.ChatAttachAlert.ChatAttachViewDelegate
                public /* synthetic */ void onCameraOpened() {
                    ChatAttachAlert.ChatAttachViewDelegate.-CC.$default$onCameraOpened(this);
                }

                @Override // org.telegram.ui.Components.ChatAttachAlert.ChatAttachViewDelegate
                public /* synthetic */ void onWallpaperSelected(Object obj) {
                    ChatAttachAlert.ChatAttachViewDelegate.-CC.$default$onWallpaperSelected(this, obj);
                }

                @Override // org.telegram.ui.Components.ChatAttachAlert.ChatAttachViewDelegate
                public /* synthetic */ void openAvatarsSearch() {
                    ChatAttachAlert.ChatAttachViewDelegate.-CC.$default$openAvatarsSearch(this);
                }

                @Override // org.telegram.ui.Components.ChatAttachAlert.ChatAttachViewDelegate
                public /* synthetic */ boolean selectItemOnClicking() {
                    return ChatAttachAlert.ChatAttachViewDelegate.-CC.$default$selectItemOnClicking(this);
                }

                @Override // org.telegram.ui.Components.ChatAttachAlert.ChatAttachViewDelegate
                public /* synthetic */ void sendAudio(ArrayList arrayList, CharSequence charSequence, boolean z, int i, int i2, long j, boolean z2, long j2) {
                    ChatAttachAlert.ChatAttachViewDelegate.-CC.$default$sendAudio(this, arrayList, charSequence, z, i, i2, j, z2, j2);
                }
            });
            chatAttachAlert.setLocationPicker();
            chatAttachAlert.setLocationActivityDelegate(new ChatAttachAlertLocationLayout.LocationActivityDelegate() { // from class: org.telegram.ui.iv.ChatAttachAlertRichLayout$$ExternalSyntheticLambda13
                @Override // org.telegram.ui.Components.ChatAttachAlertLocationLayout.LocationActivityDelegate
                public final void didSelectLocation(TLRPC.MessageMedia messageMedia, int i, boolean z, int i2, long j) {
                    ChatAttachAlertRichLayout.this.lambda$openLocationPicker$24(blockRow, chatAttachAlert, messageMedia, i, z, i2, j);
                }
            });
            chatAttachAlert.init();
            chatAttachAlert.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$openLocationPicker$24(final BlockRow blockRow, ChatAttachAlert chatAttachAlert, TLRPC.MessageMedia messageMedia, int i, boolean z, int i2, long j) {
        if (messageMedia == null || messageMedia.geo == null) {
            return;
        }
        RichEditorHistory richEditorHistory = this.listView.history;
        if (richEditorHistory != null) {
            richEditorHistory.flush();
        }
        TL_iv.pageBlockMap pageblockmap = (TL_iv.pageBlockMap) blockRow.block;
        pageblockmap.geo = messageMedia.geo;
        pageblockmap.zoom = 15;
        if (pageblockmap.w <= 0 || pageblockmap.h <= 0) {
            pageblockmap.w = 600;
            pageblockmap.h = 400;
        }
        RichEditorHistory richEditorHistory2 = this.listView.history;
        if (richEditorHistory2 != null) {
            richEditorHistory2.record();
        }
        updateSendButton(true);
        chatAttachAlert.dismiss(true);
        this.listView.post(new Runnable() { // from class: org.telegram.ui.iv.ChatAttachAlertRichLayout$$ExternalSyntheticLambda21
            @Override // java.lang.Runnable
            public final void run() {
                ChatAttachAlertRichLayout.this.lambda$openLocationPicker$23(blockRow);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$openLocationPicker$23(BlockRow blockRow) {
        View findViewByItemObject = this.listView.findViewByItemObject(blockRow);
        if (findViewByItemObject instanceof RichMapCell) {
            ((RichMapCell) findViewByItemObject).bind(blockRow, this.listView.getMapDelegate());
        } else {
            this.listView.adapter.update(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void openAttach(int i, int i2) {
        if (this.parentAlert.baseFragment == null) {
            return;
        }
        final ChatAttachAlert chatAttachAlert = new ChatAttachAlert(getContext(), this.parentAlert.baseFragment, false, false, true, this.resourcesProvider);
        chatAttachAlert.setDelegate(new ChatAttachAlert.ChatAttachViewDelegate() { // from class: org.telegram.ui.iv.ChatAttachAlertRichLayout.5
            @Override // org.telegram.ui.Components.ChatAttachAlert.ChatAttachViewDelegate
            public void didSelectBot(TLRPC.User user) {
            }

            @Override // org.telegram.ui.Components.ChatAttachAlert.ChatAttachViewDelegate
            public boolean needEnterComment() {
                return false;
            }

            @Override // org.telegram.ui.Components.ChatAttachAlert.ChatAttachViewDelegate
            public void onCameraOpened() {
            }

            @Override // org.telegram.ui.Components.ChatAttachAlert.ChatAttachViewDelegate
            public /* synthetic */ void onWallpaperSelected(Object obj) {
                ChatAttachAlert.ChatAttachViewDelegate.-CC.$default$onWallpaperSelected(this, obj);
            }

            @Override // org.telegram.ui.Components.ChatAttachAlert.ChatAttachViewDelegate
            public /* synthetic */ void openAvatarsSearch() {
                ChatAttachAlert.ChatAttachViewDelegate.-CC.$default$openAvatarsSearch(this);
            }

            @Override // org.telegram.ui.Components.ChatAttachAlert.ChatAttachViewDelegate
            public /* synthetic */ boolean selectItemOnClicking() {
                return ChatAttachAlert.ChatAttachViewDelegate.-CC.$default$selectItemOnClicking(this);
            }

            @Override // org.telegram.ui.Components.ChatAttachAlert.ChatAttachViewDelegate
            public /* synthetic */ void sendAudio(ArrayList arrayList, CharSequence charSequence, boolean z, int i3, int i4, long j, boolean z2, long j2) {
                ChatAttachAlert.ChatAttachViewDelegate.-CC.$default$sendAudio(this, arrayList, charSequence, z, i3, i4, j, z2, j2);
            }

            @Override // org.telegram.ui.Components.ChatAttachAlert.ChatAttachViewDelegate
            public void didPressedButton(int i3, boolean z, boolean z2, int i4, int i5, long j, boolean z3, boolean z4, long j2) {
                if (i3 == 7 || i3 == 8) {
                    HashMap<Object, Object> selectedPhotos = chatAttachAlert.getPhotoLayout().getSelectedPhotos();
                    ArrayList<Object> selectedPhotosOrder = chatAttachAlert.getPhotoLayout().getSelectedPhotosOrder();
                    BlockRow blockRow = ChatAttachAlertRichLayout.this.listView.pendingMediaRow;
                    ChatAttachAlertRichLayout.this.listView.pendingMediaRow = null;
                    int i6 = 0;
                    while (true) {
                        if (i6 >= selectedPhotosOrder.size()) {
                            break;
                        }
                        Object obj = selectedPhotos.get(selectedPhotosOrder.get(i6));
                        if (!(obj instanceof MediaController.PhotoEntry)) {
                            i6++;
                        } else if (blockRow != null) {
                            ChatAttachAlertRichLayout.this.listView.addMediaToRow(blockRow, (MediaController.PhotoEntry) obj);
                        } else {
                            ChatAttachAlertRichLayout.this.listView.attachMedia((MediaController.PhotoEntry) obj);
                        }
                    }
                }
                ChatAttachAlertRichLayout.this.listView.pendingMediaRow = null;
                chatAttachAlert.dismiss(true);
            }

            @Override // org.telegram.ui.Components.ChatAttachAlert.ChatAttachViewDelegate
            public void doOnIdle(Runnable runnable) {
                NotificationCenter.getInstance(ChatAttachAlertRichLayout.this.currentAccount).doOnIdle(runnable);
            }
        });
        chatAttachAlert.getPhotoLayout().loadGalleryPhotos();
        chatAttachAlert.setMaxSelectedPhotos(1, true);
        chatAttachAlert.enablePollAttachMode(i);
        chatAttachAlert.setLocationActivityDelegate(new ChatAttachAlertLocationLayout.LocationActivityDelegate() { // from class: org.telegram.ui.iv.ChatAttachAlertRichLayout$$ExternalSyntheticLambda11
            @Override // org.telegram.ui.Components.ChatAttachAlertLocationLayout.LocationActivityDelegate
            public final void didSelectLocation(TLRPC.MessageMedia messageMedia, int i3, boolean z, int i4, long j) {
                ChatAttachAlertRichLayout.this.lambda$openAttach$25(chatAttachAlert, messageMedia, i3, z, i4, j);
            }
        });
        chatAttachAlert.setAudioSelectDelegate(new ChatAttachAlertAudioLayout.AudioSelectDelegate() { // from class: org.telegram.ui.iv.ChatAttachAlertRichLayout$$ExternalSyntheticLambda12
            @Override // org.telegram.ui.Components.ChatAttachAlertAudioLayout.AudioSelectDelegate
            public final void didSelectAudio(ArrayList arrayList, CharSequence charSequence, boolean z, int i3, int i4, long j, boolean z2, long j2) {
                ChatAttachAlertRichLayout.this.lambda$openAttach$26(chatAttachAlert, arrayList, charSequence, z, i3, i4, j, z2, j2);
            }
        });
        chatAttachAlert.init();
        if (i2 != 0) {
            chatAttachAlert.openAttachLayoutForType(i2);
        }
        chatAttachAlert.setFocusable(true);
        chatAttachAlert.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$openAttach$25(ChatAttachAlert chatAttachAlert, TLRPC.MessageMedia messageMedia, int i, boolean z, int i2, long j) {
        if (messageMedia == null || messageMedia.geo == null) {
            chatAttachAlert.dismiss(true);
            return;
        }
        TL_iv.pageBlockMap pageblockmap = new TL_iv.pageBlockMap();
        pageblockmap.geo = messageMedia.geo;
        pageblockmap.zoom = 15;
        pageblockmap.w = 600;
        pageblockmap.h = 400;
        this.listView.addBlock(pageblockmap);
        updateSendButton(true);
        chatAttachAlert.dismiss(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$openAttach$26(ChatAttachAlert chatAttachAlert, ArrayList arrayList, CharSequence charSequence, boolean z, int i, int i2, long j, boolean z2, long j2) {
        if (arrayList != null && !arrayList.isEmpty()) {
            this.listView.attachAudio((MessageObject) arrayList.get(0));
        }
        chatAttachAlert.dismiss(true);
    }

    public void onExternalMediaPicked(Intent intent) {
        if (intent == null || intent.getData() == null) {
            return;
        }
        this.listView.attachExternalMedia(intent.getData());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateSendButtonLoading() {
        RichEditorToolbar richEditorToolbar = this.toolbar;
        if (richEditorToolbar != null) {
            richEditorToolbar.setSendLoading(this.listView.hasPendingUploads());
        }
        updateSendButton(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void scheduleLimitCheck() {
        AndroidUtilities.cancelRunOnUIThread(this.limitCheckRunnable);
        AndroidUtilities.runOnUIThread(this.limitCheckRunnable, 1000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateSendButtonEnabled() {
        RichEditorToolbar richEditorToolbar = this.toolbar;
        if (richEditorToolbar != null) {
            richEditorToolbar.setSendEnabled(this.listView.isWithinLimits());
        }
    }

    private void updateSendButtonLocked() {
        RichEditorToolbar richEditorToolbar = this.toolbar;
        if (richEditorToolbar != null) {
            richEditorToolbar.getSendButton().setLocked(!MessagesController.getInstance(this.currentAccount).richEditorAllowed());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        updateSendButtonLocked();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.currentUserPremiumStatusChanged) {
            updateSendButtonLocked();
        }
    }

    private int getEmojiPanelHeight() {
        int measureKeyboardHeight = this.parentAlert.sizeNotifierFrameLayout.measureKeyboardHeight();
        if (measureKeyboardHeight <= 0) {
            SharedPreferences globalEmojiSettings = MessagesController.getGlobalEmojiSettings();
            Point point = AndroidUtilities.displaySize;
            measureKeyboardHeight = globalEmojiSettings.getInt(point.x > point.y ? "kbd_height_land3" : "kbd_height", AndroidUtilities.dp(200.0f));
        }
        if (measureKeyboardHeight <= 0) {
            measureKeyboardHeight = AndroidUtilities.dp(200.0f);
        }
        return measureKeyboardHeight + AndroidUtilities.navigationBarHeight;
    }

    private void createEmojiView() {
        if (this.emojiView != null) {
            return;
        }
        EmojiView emojiView = new EmojiView(this.parentAlert.baseFragment, true, false, false, getContext(), true, null, this.parentAlert.sizeNotifierFrameLayout, true, this.resourcesProvider, false);
        this.emojiView = emojiView;
        emojiView.setVisibility(8);
        EmojiView emojiView2 = this.emojiView;
        emojiView2.fixBottomTabContainerTranslation = false;
        emojiView2.setBottomInset(AndroidUtilities.navigationBarHeight);
        this.emojiView.hideBottomTabContainerBackground();
        this.emojiView.setDelegate(new EmojiView.EmojiViewDelegate() { // from class: org.telegram.ui.iv.ChatAttachAlertRichLayout.6
            @Override // org.telegram.ui.Components.EmojiView.EmojiViewDelegate
            public /* synthetic */ boolean canAddCaptionToGif(TLRPC.Document document) {
                return EmojiView.EmojiViewDelegate.-CC.$default$canAddCaptionToGif(this, document);
            }

            @Override // org.telegram.ui.Components.EmojiView.EmojiViewDelegate
            public /* synthetic */ boolean canSchedule() {
                return EmojiView.EmojiViewDelegate.-CC.$default$canSchedule(this);
            }

            @Override // org.telegram.ui.Components.EmojiView.EmojiViewDelegate
            public /* synthetic */ long getDialogId() {
                return EmojiView.EmojiViewDelegate.-CC.$default$getDialogId(this);
            }

            @Override // org.telegram.ui.Components.EmojiView.EmojiViewDelegate
            public /* synthetic */ float getProgressToSearchOpened() {
                return EmojiView.EmojiViewDelegate.-CC.$default$getProgressToSearchOpened(this);
            }

            @Override // org.telegram.ui.Components.EmojiView.EmojiViewDelegate
            public /* synthetic */ int getThreadId() {
                return EmojiView.EmojiViewDelegate.-CC.$default$getThreadId(this);
            }

            @Override // org.telegram.ui.Components.EmojiView.EmojiViewDelegate
            public /* synthetic */ void invalidateEnterView() {
                EmojiView.EmojiViewDelegate.-CC.$default$invalidateEnterView(this);
            }

            @Override // org.telegram.ui.Components.EmojiView.EmojiViewDelegate
            public /* synthetic */ boolean isExpanded() {
                return EmojiView.EmojiViewDelegate.-CC.$default$isExpanded(this);
            }

            @Override // org.telegram.ui.Components.EmojiView.EmojiViewDelegate
            public /* synthetic */ boolean isInScheduleMode() {
                return EmojiView.EmojiViewDelegate.-CC.$default$isInScheduleMode(this);
            }

            @Override // org.telegram.ui.Components.EmojiView.EmojiViewDelegate
            public /* synthetic */ boolean isUserSelf() {
                return EmojiView.EmojiViewDelegate.-CC.$default$isUserSelf(this);
            }

            @Override // org.telegram.ui.Components.EmojiView.EmojiViewDelegate
            public /* synthetic */ void onAnimatedEmojiUnlockClick() {
                EmojiView.EmojiViewDelegate.-CC.$default$onAnimatedEmojiUnlockClick(this);
            }

            @Override // org.telegram.ui.Components.EmojiView.EmojiViewDelegate
            public /* synthetic */ void onClearEmojiRecent() {
                EmojiView.EmojiViewDelegate.-CC.$default$onClearEmojiRecent(this);
            }

            @Override // org.telegram.ui.Components.EmojiView.EmojiViewDelegate
            public /* synthetic */ void onEmojiSettingsClick(ArrayList arrayList) {
                EmojiView.EmojiViewDelegate.-CC.$default$onEmojiSettingsClick(this, arrayList);
            }

            @Override // org.telegram.ui.Components.EmojiView.EmojiViewDelegate
            public /* synthetic */ void onGifSelected(View view, Object obj, String str, Object obj2, boolean z, int i, int i2) {
                EmojiView.EmojiViewDelegate.-CC.$default$onGifSelected(this, view, obj, str, obj2, z, i, i2);
            }

            @Override // org.telegram.ui.Components.EmojiView.EmojiViewDelegate
            public /* synthetic */ void onGifSelectedForAddCaption(View view, Object obj, String str, Object obj2, boolean z, int i, int i2) {
                EmojiView.EmojiViewDelegate.-CC.$default$onGifSelectedForAddCaption(this, view, obj, str, obj2, z, i, i2);
            }

            @Override // org.telegram.ui.Components.EmojiView.EmojiViewDelegate
            public /* synthetic */ void onShowStickerSet(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z) {
                EmojiView.EmojiViewDelegate.-CC.$default$onShowStickerSet(this, stickerSet, inputStickerSet, z);
            }

            @Override // org.telegram.ui.Components.EmojiView.EmojiViewDelegate
            public /* synthetic */ void onStickerSelected(View view, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z, int i, int i2) {
                EmojiView.EmojiViewDelegate.-CC.$default$onStickerSelected(this, view, document, str, obj, sendAnimationData, z, i, i2);
            }

            @Override // org.telegram.ui.Components.EmojiView.EmojiViewDelegate
            public /* synthetic */ void onStickerSetAdd(TLRPC.StickerSetCovered stickerSetCovered) {
                EmojiView.EmojiViewDelegate.-CC.$default$onStickerSetAdd(this, stickerSetCovered);
            }

            @Override // org.telegram.ui.Components.EmojiView.EmojiViewDelegate
            public /* synthetic */ void onStickerSetRemove(TLRPC.StickerSetCovered stickerSetCovered) {
                EmojiView.EmojiViewDelegate.-CC.$default$onStickerSetRemove(this, stickerSetCovered);
            }

            @Override // org.telegram.ui.Components.EmojiView.EmojiViewDelegate
            public /* synthetic */ void onStickersGroupClick(long j) {
                EmojiView.EmojiViewDelegate.-CC.$default$onStickersGroupClick(this, j);
            }

            @Override // org.telegram.ui.Components.EmojiView.EmojiViewDelegate
            public /* synthetic */ void onStickersSettingsClick() {
                EmojiView.EmojiViewDelegate.-CC.$default$onStickersSettingsClick(this);
            }

            @Override // org.telegram.ui.Components.EmojiView.EmojiViewDelegate
            public /* synthetic */ void onTabOpened(int i) {
                EmojiView.EmojiViewDelegate.-CC.$default$onTabOpened(this, i);
            }

            @Override // org.telegram.ui.Components.EmojiView.EmojiViewDelegate
            public /* synthetic */ void showTrendingStickersAlert(TrendingStickersLayout trendingStickersLayout) {
                EmojiView.EmojiViewDelegate.-CC.$default$showTrendingStickersAlert(this, trendingStickersLayout);
            }

            @Override // org.telegram.ui.Components.EmojiView.EmojiViewDelegate
            public void onSearchOpenClose(int i) {
                RichEditText focusedEditTextOrNull;
                if (i != 0 && (focusedEditTextOrNull = ChatAttachAlertRichLayout.this.listView.getFocusedEditTextOrNull()) != null) {
                    ChatAttachAlertRichLayout.this.emojiTargetEditText = focusedEditTextOrNull;
                    ChatAttachAlertRichLayout.this.emojiTargetSelection = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
                }
                ChatAttachAlertRichLayout.this.emojiSearchOpened = i != 0;
                ChatAttachAlertRichLayout.this.layoutBottomPanels();
            }

            @Override // org.telegram.ui.Components.EmojiView.EmojiViewDelegate
            public boolean isSearchOpened() {
                return ChatAttachAlertRichLayout.this.emojiSearchOpened;
            }

            @Override // org.telegram.ui.Components.EmojiView.EmojiViewDelegate
            public boolean onBackspace() {
                RichEditText resolveEmojiTarget = ChatAttachAlertRichLayout.this.resolveEmojiTarget();
                if (resolveEmojiTarget == null || resolveEmojiTarget.length() == 0) {
                    return false;
                }
                resolveEmojiTarget.dispatchKeyEvent(new KeyEvent(0, 67));
                return true;
            }

            @Override // org.telegram.ui.Components.EmojiView.EmojiViewDelegate
            public void onEmojiSelected(String str) {
                RichEditText resolveEmojiTarget = ChatAttachAlertRichLayout.this.resolveEmojiTarget();
                if (resolveEmojiTarget == null) {
                    return;
                }
                int resolveEmojiTargetOffset = ChatAttachAlertRichLayout.this.resolveEmojiTargetOffset(resolveEmojiTarget);
                try {
                    CharSequence replaceEmoji = Emoji.replaceEmoji((CharSequence) str, resolveEmojiTarget.getPaint().getFontMetricsInt(), false, (int[]) null);
                    resolveEmojiTarget.setText(resolveEmojiTarget.getText().insert(resolveEmojiTargetOffset, replaceEmoji));
                    int length = resolveEmojiTargetOffset + replaceEmoji.length();
                    resolveEmojiTarget.setSelection(length, length);
                    if (resolveEmojiTarget == ChatAttachAlertRichLayout.this.emojiTargetEditText) {
                        ChatAttachAlertRichLayout.this.emojiTargetSelection = length;
                    }
                } catch (Exception unused) {
                }
            }

            @Override // org.telegram.ui.Components.EmojiView.EmojiViewDelegate
            public void onCustomEmojiSelected(long j, TLRPC.Document document, String str, boolean z) {
                AnimatedEmojiSpan animatedEmojiSpan;
                RichEditText resolveEmojiTarget = ChatAttachAlertRichLayout.this.resolveEmojiTarget();
                if (resolveEmojiTarget == null) {
                    return;
                }
                int resolveEmojiTargetOffset = ChatAttachAlertRichLayout.this.resolveEmojiTargetOffset(resolveEmojiTarget);
                try {
                    if (str == null) {
                        str = "😀";
                    }
                    SpannableString spannableString = new SpannableString(str);
                    if (document != null) {
                        animatedEmojiSpan = new AnimatedEmojiSpan(document, resolveEmojiTarget.getPaint().getFontMetricsInt());
                    } else {
                        animatedEmojiSpan = new AnimatedEmojiSpan(j, resolveEmojiTarget.getPaint().getFontMetricsInt());
                    }
                    animatedEmojiSpan.cacheType = AnimatedEmojiDrawable.getCacheTypeForEnterView();
                    spannableString.setSpan(animatedEmojiSpan, 0, spannableString.length(), 33);
                    resolveEmojiTarget.setText(resolveEmojiTarget.getText().insert(resolveEmojiTargetOffset, spannableString));
                    int length = resolveEmojiTargetOffset + spannableString.length();
                    resolveEmojiTarget.setSelection(length, length);
                    if (resolveEmojiTarget == ChatAttachAlertRichLayout.this.emojiTargetEditText) {
                        ChatAttachAlertRichLayout.this.emojiTargetSelection = length;
                    }
                } catch (Exception unused) {
                }
            }
        });
        addView(this.emojiView, LayoutHelper.createFrame(-1, getEmojiPanelHeight(), 87));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RichEditText resolveEmojiTarget() {
        RichEditText focusedEditTextOrNull = this.listView.getFocusedEditTextOrNull();
        if (focusedEditTextOrNull != null) {
            this.emojiTargetEditText = focusedEditTextOrNull;
            this.emojiTargetSelection = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
            return focusedEditTextOrNull;
        }
        RichEditText richEditText = this.emojiTargetEditText;
        return richEditText != null ? richEditText : this.listView.findFocusedEditText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int resolveEmojiTargetOffset(RichEditText richEditText) {
        if (richEditText == this.emojiTargetEditText && this.listView.getFocusedEditTextOrNull() != richEditText) {
            return Math.min(this.emojiTargetSelection, richEditText.length());
        }
        return Math.max(0, richEditText.getSelectionEnd());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void toggleEmojiPopup() {
        if (this.emojiViewVisible) {
            RichEditText findFocusedEditText = this.listView.findFocusedEditText();
            if (findFocusedEditText != null) {
                findFocusedEditText.requestEditFocus();
                AndroidUtilities.showKeyboard(findFocusedEditText);
            }
            hideEmojiPopup(true);
            return;
        }
        showEmojiPopup();
    }

    private void showEmojiPopup() {
        createEmojiView();
        int emojiPanelHeight = getEmojiPanelHeight();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.emojiView.getLayoutParams();
        layoutParams.height = emojiPanelHeight;
        this.emojiView.setLayoutParams(layoutParams);
        this.emojiView.setTranslationY(0.0f);
        this.emojiView.setVisibility(0);
        this.emojiViewVisible = true;
        this.emojiPadding = emojiPanelHeight;
        RichEditText findFocusedEditText = this.listView.findFocusedEditText();
        if (findFocusedEditText != null) {
            AndroidUtilities.hideKeyboard(findFocusedEditText);
        }
        RichEditorToolbar richEditorToolbar = this.toolbar;
        if (richEditorToolbar != null) {
            richEditorToolbar.setEmojiOpened(true);
        }
        updateAttachButtons(false);
        requestLayout();
    }

    private void hideEmojiPopup() {
        hideEmojiPopup(false);
    }

    private void hideEmojiPopup(boolean z) {
        if (this.emojiSearchOpened) {
            this.emojiSearchOpened = false;
            EmojiView emojiView = this.emojiView;
            if (emojiView != null) {
                emojiView.closeSearch(false);
                if (!z) {
                    this.emojiView.hideSearchKeyboard();
                }
            }
        }
        this.emojiTargetEditText = null;
        EmojiView emojiView2 = this.emojiView;
        if (emojiView2 != null) {
            emojiView2.setTranslationY(0.0f);
            this.emojiView.setVisibility(8);
        }
        this.emojiViewVisible = false;
        this.emojiPadding = 0;
        RichEditorToolbar richEditorToolbar = this.toolbar;
        if (richEditorToolbar != null) {
            richEditorToolbar.setEmojiOpened(false);
        }
        updateAttachButtons(false);
        requestLayout();
    }

    private void closeEmojiSearch() {
        if (this.emojiSearchOpened) {
            this.emojiSearchOpened = false;
            EmojiView emojiView = this.emojiView;
            if (emojiView != null) {
                emojiView.closeSearch(false);
                this.emojiView.hideSearchKeyboard();
            }
            layoutBottomPanels();
        }
    }

    @Override // org.telegram.ui.Components.ChatAttachAlert.AttachAlertLayout
    public void onDestroy() {
        MessageSendPreview messageSendPreview = this.messageSendPreview;
        if (messageSendPreview != null) {
            messageSendPreview.dismissInstant();
            this.messageSendPreview = null;
        }
        RichCommandSuggestions richCommandSuggestions = this.commandSuggestions;
        if (richCommandSuggestions != null) {
            richCommandSuggestions.hide();
        }
        RichEditorListView richEditorListView = this.listView;
        if (richEditorListView != null) {
            richEditorListView.clearContent();
        }
        EmojiView emojiView = this.emojiView;
        if (emojiView != null) {
            emojiView.onDestroy();
        }
    }

    public static void showEditLatexSheet(Context context, final String str, final Utilities.Callback callback, final Theme.ResourcesProvider resourcesProvider) {
        BottomSheet.Builder builder = new BottomSheet.Builder(context, true, resourcesProvider);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        final String[] strArr = {str == null ? "" : str};
        final ImageView imageView = new ImageView(context);
        imageView.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        imageView.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(8.0f), Theme.multAlpha(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider), 0.05f)));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(imageView, new FrameLayout.LayoutParams(-2, -2, 17));
        final HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.setClipToPadding(false);
        horizontalScrollView.setFillViewport(true);
        horizontalScrollView.setVisibility(8);
        horizontalScrollView.addView(frameLayout, new FrameLayout.LayoutParams(-2, -2));
        linearLayout.addView(horizontalScrollView, LayoutHelper.createLinear(-1, -2, 49, 12, 2, 12, 0));
        final ButtonWithCounterView round = new ButtonWithCounterView(context, resourcesProvider).setRound();
        final boolean[] zArr = {false};
        final boolean[] zArr2 = {false};
        final int[] iArr = {6};
        final Utilities.Callback2 callback2 = new Utilities.Callback2() { // from class: org.telegram.ui.iv.ChatAttachAlertRichLayout$$ExternalSyntheticLambda6
            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                ChatAttachAlertRichLayout.lambda$showEditLatexSheet$29(strArr, (String) obj, (Utilities.Callback2) obj2);
            }
        };
        final Runnable runnable = new Runnable() { // from class: org.telegram.ui.iv.ChatAttachAlertRichLayout$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                ChatAttachAlertRichLayout.lambda$showEditLatexSheet$31(strArr, horizontalScrollView, round, zArr2, callback2, imageView, resourcesProvider, iArr);
            }
        };
        final EditTextCell editTextCell = new EditTextCell(context, LocaleController.getString(R.string.ArticleLatexEquation), true, false, -1, resourcesProvider);
        editTextCell.editText.setImeOptions(6);
        editTextCell.editText.setMaxLines(5);
        editTextCell.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(24.0f), Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider)));
        editTextCell.setText(strArr[0]);
        editTextCell.editText.addTextChangedListener(new TextWatcher() { // from class: org.telegram.ui.iv.ChatAttachAlertRichLayout.7
            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                strArr[0] = editable.toString();
                runnable.run();
            }
        });
        linearLayout.addView(editTextCell, LayoutHelper.createLinear(-1, -2, 55, 12, 8, 12, 0));
        round.setText(LocaleController.getString(R.string.Done));
        linearLayout.addView(round, LayoutHelper.createLinear(-1, 48, 55, 12, 12, 12, 12));
        runnable.run();
        builder.setCustomView(linearLayout);
        builder.setOnPreDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.iv.ChatAttachAlertRichLayout$$ExternalSyntheticLambda8
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                ChatAttachAlertRichLayout.lambda$showEditLatexSheet$32(EditTextCell.this, zArr, zArr2, str, strArr, callback, dialogInterface);
            }
        });
        final BottomSheet show = builder.show();
        int i = Theme.key_windowBackgroundGray;
        show.setBackgroundColor(Theme.getColor(i, resourcesProvider));
        show.fixNavigationBar(Theme.getColor(i, resourcesProvider));
        round.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.iv.ChatAttachAlertRichLayout$$ExternalSyntheticLambda9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChatAttachAlertRichLayout.lambda$showEditLatexSheet$33(ButtonWithCounterView.this, zArr, callback, strArr, show, view);
            }
        });
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.iv.ChatAttachAlertRichLayout$$ExternalSyntheticLambda10
            @Override // java.lang.Runnable
            public final void run() {
                ChatAttachAlertRichLayout.lambda$showEditLatexSheet$34(EditTextCell.this);
            }
        }, 200L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showEditLatexSheet$29(final String[] strArr, String str, final Utilities.Callback2 callback2) {
        Utilities.themeQueue.postRunnable(new Runnable() { // from class: org.telegram.ui.iv.ChatAttachAlertRichLayout$$ExternalSyntheticLambda14
            @Override // java.lang.Runnable
            public final void run() {
                ChatAttachAlertRichLayout.lambda$showEditLatexSheet$28(strArr, callback2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showEditLatexSheet$28(String[] strArr, final Utilities.Callback2 callback2) {
        final boolean z = true;
        final Bitmap bitmap = null;
        try {
            JLatexMathDrawable build = JLatexMathDrawable.builder(strArr[0]).textSize(AndroidUtilities.dp(26.0f)).build();
            int intrinsicWidth = build.getIntrinsicWidth();
            int intrinsicHeight = build.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ALPHA_8);
                build.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
                build.draw(new Canvas(createBitmap));
                bitmap = createBitmap;
                z = false;
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (z) {
            try {
                JLatexMathDrawable build2 = JLatexMathDrawable.builder(LocaleController.getString(R.string.ArticleLatexError)).textSize(AndroidUtilities.dp(26.0f)).build();
                int intrinsicWidth2 = build2.getIntrinsicWidth();
                int intrinsicHeight2 = build2.getIntrinsicHeight();
                if (intrinsicWidth2 > 0 && intrinsicHeight2 > 0) {
                    Bitmap createBitmap2 = Bitmap.createBitmap(intrinsicWidth2, intrinsicHeight2, Bitmap.Config.ALPHA_8);
                    build2.setBounds(0, 0, intrinsicWidth2, intrinsicHeight2);
                    build2.draw(new Canvas(createBitmap2));
                    bitmap = createBitmap2;
                }
            } catch (Exception e2) {
                FileLog.e(e2);
            }
        }
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.iv.ChatAttachAlertRichLayout$$ExternalSyntheticLambda22
            @Override // java.lang.Runnable
            public final void run() {
                ChatAttachAlertRichLayout.lambda$showEditLatexSheet$27(Utilities.Callback2.this, bitmap, z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showEditLatexSheet$27(Utilities.Callback2 callback2, Bitmap bitmap, boolean z) {
        callback2.run(bitmap, Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showEditLatexSheet$31(final String[] strArr, final HorizontalScrollView horizontalScrollView, final ButtonWithCounterView buttonWithCounterView, final boolean[] zArr, Utilities.Callback2 callback2, final ImageView imageView, final Theme.ResourcesProvider resourcesProvider, final int[] iArr) {
        if (TextUtils.isEmpty(strArr[0].trim())) {
            horizontalScrollView.setVisibility(8);
            buttonWithCounterView.setEnabled(false);
        } else {
            final boolean z = zArr[0];
            final String str = strArr[0];
            callback2.run(str, new Utilities.Callback2() { // from class: org.telegram.ui.iv.ChatAttachAlertRichLayout$$ExternalSyntheticLambda20
                @Override // org.telegram.messenger.Utilities.Callback2
                public final void run(Object obj, Object obj2) {
                    ChatAttachAlertRichLayout.lambda$showEditLatexSheet$30(str, strArr, imageView, resourcesProvider, z, iArr, buttonWithCounterView, horizontalScrollView, zArr, (Bitmap) obj, (Boolean) obj2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showEditLatexSheet$30(String str, String[] strArr, ImageView imageView, Theme.ResourcesProvider resourcesProvider, boolean z, int[] iArr, ButtonWithCounterView buttonWithCounterView, HorizontalScrollView horizontalScrollView, boolean[] zArr, Bitmap bitmap, Boolean bool) {
        if (TextUtils.equals(str, strArr[0])) {
            if (bool.booleanValue()) {
                imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_text_RedBold, resourcesProvider), PorterDuff.Mode.SRC_IN));
                if (!z) {
                    int i = -iArr[0];
                    iArr[0] = i;
                    AndroidUtilities.shakeViewSpring(imageView, i);
                }
            } else {
                imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider), PorterDuff.Mode.SRC_IN));
            }
            if (bitmap != null) {
                imageView.setImageBitmap(bitmap);
            }
            buttonWithCounterView.setEnabled(!bool.booleanValue());
            horizontalScrollView.setVisibility(bitmap != null ? 0 : 8);
            zArr[0] = bool.booleanValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showEditLatexSheet$32(EditTextCell editTextCell, boolean[] zArr, boolean[] zArr2, String str, String[] strArr, Utilities.Callback callback, DialogInterface dialogInterface) {
        editTextCell.editText.clearFocus();
        AndroidUtilities.hideKeyboard(editTextCell.editText);
        if (zArr[0] || zArr2[0] || TextUtils.equals(str, strArr[0])) {
            return;
        }
        zArr[0] = true;
        callback.run(strArr[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showEditLatexSheet$33(ButtonWithCounterView buttonWithCounterView, boolean[] zArr, Utilities.Callback callback, String[] strArr, BottomSheet bottomSheet, View view) {
        if (buttonWithCounterView.isEnabled()) {
            if (!zArr[0]) {
                zArr[0] = true;
                callback.run(strArr[0]);
            }
            bottomSheet.lambda$new$0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showEditLatexSheet$34(EditTextCell editTextCell) {
        editTextCell.editText.requestFocus();
        AndroidUtilities.showKeyboard(editTextCell.editText);
    }
}
