package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Vibrator;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.TopicsController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.TextCheckCell2;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.Forum.ForumBubbleDrawable;
import org.telegram.ui.Components.Forum.ForumUtilities;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LetterDrawable;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.ReplaceableIconDrawable;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.TopicCreateFragment;

/* loaded from: classes4.dex */
public class TopicCreateFragment extends BaseFragment {
    BackupImageView[] backupImageView;
    long chatId;
    TextCheckCell2 checkBoxCell;
    boolean created;
    Drawable defaultIconDrawable;
    EditTextBoldCursor editTextBoldCursor;
    String firstSymbol;
    ForumBubbleDrawable forumBubbleDrawable;
    int iconColor;
    AnimationNotificationsLocker notificationsLocker;
    ReplaceableIconDrawable replaceableIconDrawable;
    SelectAnimatedEmojiDialog selectAnimatedEmojiDialog;
    long selectedEmojiDocumentId;
    TLRPC.TL_forumTopic topicForEdit;
    long topicId;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class 1 extends ActionBar.ActionBarMenuOnItemClick {
        1() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onItemClick$0(TLObject tLObject, String str, AlertDialog alertDialog) {
            if (tLObject != null) {
                TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                for (int i = 0; i < updates.updates.size(); i++) {
                    if (updates.updates.get(i) instanceof TLRPC.TL_updateMessageID) {
                        TLRPC.TL_updateMessageID tL_updateMessageID = (TLRPC.TL_updateMessageID) updates.updates.get(i);
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", TopicCreateFragment.this.chatId);
                        bundle.putInt("message_id", 1);
                        bundle.putInt("unread_count", 0);
                        bundle.putBoolean("historyPreloaded", false);
                        ChatActivity chatActivity = new ChatActivity(bundle);
                        TLRPC.TL_messageActionTopicCreate tL_messageActionTopicCreate = new TLRPC.TL_messageActionTopicCreate();
                        tL_messageActionTopicCreate.title = str;
                        TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                        tL_messageService.action = tL_messageActionTopicCreate;
                        tL_messageService.peer_id = TopicCreateFragment.this.getMessagesController().getPeer(-TopicCreateFragment.this.chatId);
                        tL_messageService.dialog_id = -TopicCreateFragment.this.chatId;
                        tL_messageService.id = tL_updateMessageID.id;
                        tL_messageService.date = (int) (System.currentTimeMillis() / 1000);
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(new MessageObject(((BaseFragment) TopicCreateFragment.this).currentAccount, tL_messageService, false, false));
                        TLRPC.Chat chat = TopicCreateFragment.this.getMessagesController().getChat(Long.valueOf(TopicCreateFragment.this.chatId));
                        TLRPC.TL_forumTopic tL_forumTopic = new TLRPC.TL_forumTopic();
                        tL_forumTopic.id = tL_updateMessageID.id;
                        TopicCreateFragment topicCreateFragment = TopicCreateFragment.this;
                        long j = topicCreateFragment.selectedEmojiDocumentId;
                        if (j != 0) {
                            tL_forumTopic.icon_emoji_id = j;
                            tL_forumTopic.flags |= 1;
                        }
                        tL_forumTopic.my = true;
                        tL_forumTopic.flags |= 2;
                        tL_forumTopic.topicStartMessage = tL_messageService;
                        tL_forumTopic.title = str;
                        tL_forumTopic.top_message = tL_messageService.id;
                        tL_forumTopic.topMessage = tL_messageService;
                        tL_forumTopic.from_id = topicCreateFragment.getMessagesController().getPeer(TopicCreateFragment.this.getUserConfig().clientUserId);
                        tL_forumTopic.notify_settings = new TLRPC.TL_peerNotifySettings();
                        tL_forumTopic.icon_color = TopicCreateFragment.this.iconColor;
                        chatActivity.setThreadMessages(arrayList, chat, tL_messageService.id, 1, 1, tL_forumTopic);
                        chatActivity.justCreatedTopic = true;
                        TopicCreateFragment.this.getMessagesController().getTopicsController().onTopicCreated(-TopicCreateFragment.this.chatId, tL_forumTopic, true);
                        TopicCreateFragment.this.presentFragment(chatActivity);
                    }
                }
            }
            alertDialog.dismiss();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onItemClick$1(final String str, final AlertDialog alertDialog, final TLObject tLObject, TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.TopicCreateFragment$1$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    TopicCreateFragment.1.this.lambda$onItemClick$0(tLObject, str, alertDialog);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onItemClick$2(TLObject tLObject, TLRPC.TL_error tL_error) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onItemClick$3(TLObject tLObject, TLRPC.TL_error tL_error) {
        }

        /* JADX WARN: Code restructure failed: missing block: B:41:0x0100, code lost:
        
            if (r12.topicForEdit.icon_emoji_id != r12.selectedEmojiDocumentId) goto L43;
         */
        @Override // org.telegram.ui.ActionBar.ActionBar.ActionBarMenuOnItemClick
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onItemClick(int i) {
            final String obj;
            if (i == -1) {
                TopicCreateFragment.this.lambda$onBackPressed$300();
                return;
            }
            if (i == 1) {
                obj = TopicCreateFragment.this.editTextBoldCursor.getText() != null ? TopicCreateFragment.this.editTextBoldCursor.getText().toString() : null;
                if (TextUtils.isEmpty(obj)) {
                    Vibrator vibrator = (Vibrator) TopicCreateFragment.this.getParentActivity().getSystemService("vibrator");
                    if (vibrator != null) {
                        vibrator.vibrate(200L);
                    }
                    AndroidUtilities.shakeView(TopicCreateFragment.this.editTextBoldCursor);
                    return;
                }
                if (TopicCreateFragment.this.created) {
                    return;
                }
                final AlertDialog alertDialog = new AlertDialog(TopicCreateFragment.this.getParentActivity(), 3);
                alertDialog.showDelayed(500L);
                TopicCreateFragment.this.created = true;
                TLRPC.TL_channels_createForumTopic tL_channels_createForumTopic = new TLRPC.TL_channels_createForumTopic();
                tL_channels_createForumTopic.channel = TopicCreateFragment.this.getMessagesController().getInputChannel(TopicCreateFragment.this.chatId);
                tL_channels_createForumTopic.title = obj;
                long j = TopicCreateFragment.this.selectedEmojiDocumentId;
                if (j != 0) {
                    tL_channels_createForumTopic.icon_emoji_id = j;
                    tL_channels_createForumTopic.flags |= 8;
                }
                tL_channels_createForumTopic.random_id = Utilities.random.nextLong();
                TopicCreateFragment topicCreateFragment = TopicCreateFragment.this;
                tL_channels_createForumTopic.icon_color = topicCreateFragment.iconColor;
                tL_channels_createForumTopic.flags |= 1;
                ConnectionsManager.getInstance(((BaseFragment) topicCreateFragment).currentAccount).sendRequest(tL_channels_createForumTopic, new RequestDelegate() { // from class: org.telegram.ui.TopicCreateFragment$1$$ExternalSyntheticLambda0
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        TopicCreateFragment.1.this.lambda$onItemClick$1(obj, alertDialog, tLObject, tL_error);
                    }
                });
                return;
            }
            if (i == 2) {
                obj = TopicCreateFragment.this.editTextBoldCursor.getText() != null ? TopicCreateFragment.this.editTextBoldCursor.getText().toString() : null;
                if (TextUtils.isEmpty(obj)) {
                    Vibrator vibrator2 = (Vibrator) TopicCreateFragment.this.getParentActivity().getSystemService("vibrator");
                    if (vibrator2 != null) {
                        vibrator2.vibrate(200L);
                    }
                    AndroidUtilities.shakeView(TopicCreateFragment.this.editTextBoldCursor);
                    return;
                }
                if (TopicCreateFragment.this.topicForEdit.title.equals(obj)) {
                    TopicCreateFragment topicCreateFragment2 = TopicCreateFragment.this;
                }
                TLRPC.TL_channels_editForumTopic tL_channels_editForumTopic = new TLRPC.TL_channels_editForumTopic();
                tL_channels_editForumTopic.channel = TopicCreateFragment.this.getMessagesController().getInputChannel(TopicCreateFragment.this.chatId);
                TLRPC.TL_forumTopic tL_forumTopic = TopicCreateFragment.this.topicForEdit;
                tL_channels_editForumTopic.topic_id = tL_forumTopic.id;
                if (!tL_forumTopic.title.equals(obj)) {
                    tL_channels_editForumTopic.title = obj;
                    tL_channels_editForumTopic.flags |= 1;
                }
                TopicCreateFragment topicCreateFragment3 = TopicCreateFragment.this;
                if (topicCreateFragment3.topicForEdit.icon_emoji_id != tL_channels_editForumTopic.icon_emoji_id) {
                    tL_channels_editForumTopic.icon_emoji_id = topicCreateFragment3.selectedEmojiDocumentId;
                    tL_channels_editForumTopic.flags |= 2;
                }
                ConnectionsManager.getInstance(((BaseFragment) topicCreateFragment3).currentAccount).sendRequest(tL_channels_editForumTopic, new RequestDelegate() { // from class: org.telegram.ui.TopicCreateFragment$1$$ExternalSyntheticLambda1
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        TopicCreateFragment.1.lambda$onItemClick$2(tLObject, tL_error);
                    }
                });
                TopicCreateFragment topicCreateFragment4 = TopicCreateFragment.this;
                if (topicCreateFragment4.checkBoxCell != null && topicCreateFragment4.topicForEdit.id == 1 && (!r2.isChecked()) != TopicCreateFragment.this.topicForEdit.hidden) {
                    TLRPC.TL_channels_editForumTopic tL_channels_editForumTopic2 = new TLRPC.TL_channels_editForumTopic();
                    tL_channels_editForumTopic2.channel = TopicCreateFragment.this.getMessagesController().getInputChannel(TopicCreateFragment.this.chatId);
                    tL_channels_editForumTopic2.topic_id = TopicCreateFragment.this.topicForEdit.id;
                    tL_channels_editForumTopic2.hidden = !r2.checkBoxCell.isChecked();
                    tL_channels_editForumTopic2.flags |= 8;
                    ConnectionsManager.getInstance(((BaseFragment) TopicCreateFragment.this).currentAccount).sendRequest(tL_channels_editForumTopic2, new RequestDelegate() { // from class: org.telegram.ui.TopicCreateFragment$1$$ExternalSyntheticLambda2
                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            TopicCreateFragment.1.lambda$onItemClick$3(tLObject, tL_error);
                        }
                    });
                }
                TopicCreateFragment topicCreateFragment5 = TopicCreateFragment.this;
                TLRPC.TL_forumTopic tL_forumTopic2 = topicCreateFragment5.topicForEdit;
                long j2 = topicCreateFragment5.selectedEmojiDocumentId;
                tL_forumTopic2.icon_emoji_id = j2;
                int i2 = tL_forumTopic2.flags;
                tL_forumTopic2.flags = j2 != 0 ? i2 | 1 : i2 & (-2);
                tL_forumTopic2.title = obj;
                if (topicCreateFragment5.checkBoxCell != null) {
                    tL_forumTopic2.hidden = !r12.isChecked();
                }
                TopicsController topicsController = TopicCreateFragment.this.getMessagesController().getTopicsController();
                TopicCreateFragment topicCreateFragment6 = TopicCreateFragment.this;
                topicsController.onTopicEdited(-topicCreateFragment6.chatId, topicCreateFragment6.topicForEdit);
                TopicCreateFragment.this.lambda$onBackPressed$300();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class 4 extends FrameLayout {
        ValueAnimator backAnimator;
        boolean pressed;
        float pressedProgress;

        4(Context context) {
            super(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$setPressed$0(ValueAnimator valueAnimator) {
            this.pressedProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            invalidate();
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void dispatchDraw(Canvas canvas) {
            float f = ((1.0f - this.pressedProgress) * 0.2f) + 0.8f;
            canvas.save();
            canvas.scale(f, f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f);
            super.dispatchDraw(canvas);
            canvas.restore();
            updatePressedProgress();
        }

        @Override // android.view.View
        public void setPressed(boolean z) {
            ValueAnimator valueAnimator;
            super.setPressed(z);
            if (this.pressed != z) {
                this.pressed = z;
                invalidate();
                if (z && (valueAnimator = this.backAnimator) != null) {
                    valueAnimator.removeAllListeners();
                    this.backAnimator.cancel();
                }
                if (z) {
                    return;
                }
                float f = this.pressedProgress;
                if (f != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f, 0.0f);
                    this.backAnimator = ofFloat;
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.TopicCreateFragment$4$$ExternalSyntheticLambda0
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                            TopicCreateFragment.4.this.lambda$setPressed$0(valueAnimator2);
                        }
                    });
                    this.backAnimator.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.TopicCreateFragment.4.1
                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public void onAnimationEnd(Animator animator) {
                            super.onAnimationEnd(animator);
                            4.this.backAnimator = null;
                        }
                    });
                    this.backAnimator.setInterpolator(new OvershootInterpolator(5.0f));
                    this.backAnimator.setDuration(350L);
                    this.backAnimator.start();
                }
            }
        }

        public void updatePressedProgress() {
            if (isPressed()) {
                float f = this.pressedProgress;
                if (f != 1.0f) {
                    this.pressedProgress = Utilities.clamp(f + 0.16f, 1.0f, 0.0f);
                    invalidate();
                }
            }
        }
    }

    private TopicCreateFragment(Bundle bundle) {
        super(bundle);
        this.backupImageView = new BackupImageView[2];
        this.firstSymbol = "";
        this.notificationsLocker = new AnimationNotificationsLocker();
    }

    public static TopicCreateFragment create(long j, long j2) {
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", j);
        bundle.putLong("topic_id", j2);
        return new TopicCreateFragment(bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$0(View view) {
        if (this.selectedEmojiDocumentId == 0 && this.topicForEdit == null) {
            this.iconColor = this.forumBubbleDrawable.moveNexColor();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$1(View view) {
        this.checkBoxCell.setChecked(!r2.isChecked());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$selectEmoji$2() {
        new PremiumFeatureBottomSheet(this, 11, false).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void selectEmoji(Long l, boolean z) {
        if (this.selectAnimatedEmojiDialog == null || this.replaceableIconDrawable == null) {
            return;
        }
        long longValue = l == null ? 0L : l.longValue();
        this.selectAnimatedEmojiDialog.setSelected(Long.valueOf(longValue));
        if (this.selectedEmojiDocumentId == longValue) {
            return;
        }
        if (!z && longValue != 0 && !getUserConfig().isPremium()) {
            TLRPC.Document findDocument = AnimatedEmojiDrawable.findDocument(this.currentAccount, l.longValue());
            if (findDocument != null) {
                BulletinFactory.of(this).createEmojiBulletin(findDocument, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiHint)), LocaleController.getString(R.string.PremiumMore), new Runnable() { // from class: org.telegram.ui.TopicCreateFragment$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        TopicCreateFragment.this.lambda$selectEmoji$2();
                    }
                }).show();
                return;
            }
            return;
        }
        this.selectedEmojiDocumentId = longValue;
        if (longValue != 0) {
            AnimatedEmojiDrawable animatedEmojiDrawable = new AnimatedEmojiDrawable(10, this.currentAccount, longValue);
            animatedEmojiDrawable.setColorFilter(Theme.chat_animatedEmojiTextColorFilter);
            this.backupImageView[1].setAnimatedEmojiDrawable(animatedEmojiDrawable);
            this.backupImageView[1].setImageDrawable(null);
        } else {
            LetterDrawable letterDrawable = new LetterDrawable(null, 1);
            letterDrawable.setTitle(this.firstSymbol);
            this.replaceableIconDrawable.setIcon((Drawable) letterDrawable, false);
            this.backupImageView[1].setImageDrawable(this.defaultIconDrawable);
            this.backupImageView[1].setAnimatedEmojiDrawable(null);
        }
        BackupImageView[] backupImageViewArr = this.backupImageView;
        BackupImageView backupImageView = backupImageViewArr[0];
        BackupImageView backupImageView2 = backupImageViewArr[1];
        backupImageViewArr[0] = backupImageView2;
        backupImageViewArr[1] = backupImageView;
        AndroidUtilities.updateViewVisibilityAnimated(backupImageView2, true, 0.5f, true);
        AndroidUtilities.updateViewVisibilityAnimated(this.backupImageView[1], false, 0.5f, true);
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public View createView(Context context) {
        ActionBar actionBar;
        int i;
        long j;
        if (this.topicForEdit != null) {
            actionBar = this.actionBar;
            i = R.string.EditTopic;
        } else {
            actionBar = this.actionBar;
            i = R.string.NewTopic;
        }
        actionBar.setTitle(LocaleController.getString(i));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setActionBarMenuOnItemClick(new 1());
        if (this.topicForEdit == null) {
            this.actionBar.createMenu().addItem(1, LocaleController.getString(R.string.Create).toUpperCase());
        } else {
            this.actionBar.createMenu().addItem(2, R.drawable.ic_ab_done);
        }
        SizeNotifierFrameLayout sizeNotifierFrameLayout = new SizeNotifierFrameLayout(context) { // from class: org.telegram.ui.TopicCreateFragment.2
            boolean keyboardWasShown;

            @Override // android.widget.FrameLayout, android.view.View
            protected void onMeasure(int i2, int i3) {
                measureKeyboardHeight();
                if (getKeyboardHeight() != 0 || this.keyboardWasShown) {
                    this.keyboardWasShown = true;
                    setPadding(0, 0, 0, 0);
                } else {
                    int i4 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
                    this.keyboardHeight = i4;
                    setPadding(0, 0, 0, i4);
                }
                super.onMeasure(i2, i3);
            }
        };
        this.fragmentView = sizeNotifierFrameLayout;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        sizeNotifierFrameLayout.addView(linearLayout);
        HeaderCell headerCell = new HeaderCell(context);
        TLRPC.TL_forumTopic tL_forumTopic = this.topicForEdit;
        headerCell.setText(LocaleController.getString((tL_forumTopic == null || tL_forumTopic.id != 1) ? R.string.CreateTopicTitle : R.string.CreateGeneralTopicTitle));
        FrameLayout frameLayout = new FrameLayout(context);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.editTextBoldCursor = editTextBoldCursor;
        editTextBoldCursor.setHintText(LocaleController.getString(R.string.EnterTopicName));
        this.editTextBoldCursor.setHintColor(getThemedColor(Theme.key_chat_messagePanelHint));
        this.editTextBoldCursor.setTextColor(getThemedColor(Theme.key_chat_messagePanelText));
        this.editTextBoldCursor.setPadding(AndroidUtilities.dp(0.0f), this.editTextBoldCursor.getPaddingTop(), AndroidUtilities.dp(0.0f), this.editTextBoldCursor.getPaddingBottom());
        this.editTextBoldCursor.setBackgroundDrawable(null);
        this.editTextBoldCursor.setSingleLine(true);
        EditTextBoldCursor editTextBoldCursor2 = this.editTextBoldCursor;
        editTextBoldCursor2.setInputType(editTextBoldCursor2.getInputType() | LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD_NOT_PREMIUM);
        frameLayout.addView(this.editTextBoldCursor, LayoutHelper.createFrame(-1, -1.0f, 0, 51.0f, 4.0f, 21.0f, 4.0f));
        this.editTextBoldCursor.addTextChangedListener(new TextWatcher() { // from class: org.telegram.ui.TopicCreateFragment.3
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                String trim = editable.toString().trim();
                String str = TopicCreateFragment.this.firstSymbol;
                if (trim.length() > 0) {
                    TopicCreateFragment.this.firstSymbol = trim.substring(0, 1).toUpperCase();
                } else {
                    TopicCreateFragment.this.firstSymbol = "";
                }
                if (str.equals(TopicCreateFragment.this.firstSymbol)) {
                    return;
                }
                LetterDrawable letterDrawable = new LetterDrawable(null, 1);
                letterDrawable.setTitle(TopicCreateFragment.this.firstSymbol);
                ReplaceableIconDrawable replaceableIconDrawable = TopicCreateFragment.this.replaceableIconDrawable;
                if (replaceableIconDrawable != null) {
                    replaceableIconDrawable.setIcon((Drawable) letterDrawable, true);
                }
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            }
        });
        4 r3 = new 4(context);
        r3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.TopicCreateFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TopicCreateFragment.this.lambda$createView$0(view);
            }
        });
        for (int i2 = 0; i2 < 2; i2++) {
            this.backupImageView[i2] = new BackupImageView(context);
            r3.addView(this.backupImageView[i2], LayoutHelper.createFrame(28, 28, 17));
        }
        frameLayout.addView(r3, LayoutHelper.createFrame(40, 40.0f, 16, 10.0f, 0.0f, 0.0f, 0.0f));
        linearLayout.addView(headerCell);
        linearLayout.addView(frameLayout);
        FrameLayout frameLayout2 = new FrameLayout(context);
        int i3 = R.drawable.greydivider_top;
        int i4 = Theme.key_windowBackgroundGrayShadow;
        CombinedDrawable combinedDrawable = new CombinedDrawable(new ColorDrawable(Theme.getColor(Theme.key_windowBackgroundGray)), Theme.getThemedDrawable(context, i3, Theme.getColor(i4)), 0, 0);
        combinedDrawable.setFullsize(true);
        frameLayout2.setBackgroundDrawable(combinedDrawable);
        frameLayout2.setClipChildren(false);
        TLRPC.TL_forumTopic tL_forumTopic2 = this.topicForEdit;
        if (tL_forumTopic2 == null || tL_forumTopic2.id != 1) {
            SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = new SelectAnimatedEmojiDialog(this, getContext(), false, null, 3, null) { // from class: org.telegram.ui.TopicCreateFragment.5
                private boolean firstLayout = true;

                @Override // org.telegram.ui.SelectAnimatedEmojiDialog
                protected void onEmojiSelected(View view, Long l, TLRPC.Document document, Integer num) {
                    boolean z = false;
                    if (!TextUtils.isEmpty(UserConfig.getInstance(((BaseFragment) TopicCreateFragment.this).currentAccount).defaultTopicIcons)) {
                        TLRPC.TL_messages_stickerSet stickerSetByEmojiOrName = TopicCreateFragment.this.getMediaDataController().getStickerSetByEmojiOrName(UserConfig.getInstance(((BaseFragment) TopicCreateFragment.this).currentAccount).defaultTopicIcons);
                        if ((stickerSetByEmojiOrName == null ? 0L : stickerSetByEmojiOrName.set.id) == MediaDataController.getStickerSetId(document)) {
                            z = true;
                        }
                    }
                    TopicCreateFragment.this.selectEmoji(l, z);
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // org.telegram.ui.SelectAnimatedEmojiDialog, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
                public void onLayout(boolean z, int i5, int i6, int i7, int i8) {
                    super.onLayout(z, i5, i6, i7, i8);
                    if (this.firstLayout) {
                        this.firstLayout = false;
                        TopicCreateFragment.this.selectAnimatedEmojiDialog.onShow(null);
                    }
                }
            };
            this.selectAnimatedEmojiDialog = selectAnimatedEmojiDialog;
            selectAnimatedEmojiDialog.setAnimationsEnabled(this.fragmentBeginToShow);
            this.selectAnimatedEmojiDialog.setClipChildren(false);
            frameLayout2.addView(this.selectAnimatedEmojiDialog, LayoutHelper.createFrame(-1, -1.0f, 0, 12.0f, 12.0f, 12.0f, 12.0f));
            Drawable createTopicDrawable = ForumUtilities.createTopicDrawable("", this.iconColor, false);
            this.forumBubbleDrawable = (ForumBubbleDrawable) ((CombinedDrawable) createTopicDrawable).getBackgroundDrawable();
            this.replaceableIconDrawable = new ReplaceableIconDrawable(context);
            CombinedDrawable combinedDrawable2 = new CombinedDrawable(createTopicDrawable, this.replaceableIconDrawable, 0, 0);
            combinedDrawable2.setFullsize(true);
            this.selectAnimatedEmojiDialog.setForumIconDrawable(combinedDrawable2);
            this.defaultIconDrawable = combinedDrawable2;
            this.replaceableIconDrawable.addView(this.backupImageView[0]);
            this.replaceableIconDrawable.addView(this.backupImageView[1]);
            this.backupImageView[0].setImageDrawable(this.defaultIconDrawable);
            AndroidUtilities.updateViewVisibilityAnimated(this.backupImageView[0], true, 1.0f, false);
            AndroidUtilities.updateViewVisibilityAnimated(this.backupImageView[1], false, 1.0f, false);
            this.forumBubbleDrawable.addParent(this.backupImageView[0]);
            this.forumBubbleDrawable.addParent(this.backupImageView[1]);
        } else {
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(R.drawable.msg_filled_general);
            imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_chat_inMenu), PorterDuff.Mode.MULTIPLY));
            r3.addView(imageView, LayoutHelper.createFrame(22, 22, 17));
            frameLayout2.addView(new ActionBarPopupWindow.GapView(context, getResourceProvider()), LayoutHelper.createFrame(-1, 8.0f));
            TextCheckCell2 textCheckCell2 = new TextCheckCell2(context);
            this.checkBoxCell = textCheckCell2;
            textCheckCell2.getCheckBox().setDrawIconType(0);
            this.checkBoxCell.setTextAndCheck(LocaleController.getString(R.string.EditTopicHide), !this.topicForEdit.hidden, false);
            this.checkBoxCell.setBackground(Theme.createSelectorWithBackgroundDrawable(getThemedColor(Theme.key_windowBackgroundWhite), getThemedColor(Theme.key_listSelector)));
            this.checkBoxCell.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.TopicCreateFragment$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TopicCreateFragment.this.lambda$createView$1(view);
                }
            });
            frameLayout2.addView(this.checkBoxCell, LayoutHelper.createFrame(-1, 50.0f, 48, 0.0f, 8.0f, 0.0f, 0.0f));
            TextInfoPrivacyCell textInfoPrivacyCell = new TextInfoPrivacyCell(context);
            textInfoPrivacyCell.setText(LocaleController.getString(R.string.EditTopicHideInfo));
            textInfoPrivacyCell.setBackground(Theme.getThemedDrawableByKey(getContext(), R.drawable.greydivider_bottom, i4, getResourceProvider()));
            frameLayout2.addView(textInfoPrivacyCell, LayoutHelper.createFrame(-1, -2.0f, 48, 0.0f, 58.0f, 0.0f, 0.0f));
        }
        linearLayout.addView(frameLayout2, LayoutHelper.createFrame(-1, -1.0f));
        TLRPC.TL_forumTopic tL_forumTopic3 = this.topicForEdit;
        if (tL_forumTopic3 != null) {
            this.editTextBoldCursor.setText(tL_forumTopic3.title);
            j = this.topicForEdit.icon_emoji_id;
        } else {
            j = 0;
        }
        selectEmoji(Long.valueOf(j), true);
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public boolean onFragmentCreate() {
        int i;
        this.chatId = this.arguments.getLong("chat_id");
        long j = this.arguments.getLong("topic_id", 0L);
        this.topicId = j;
        if (j != 0) {
            TLRPC.TL_forumTopic findTopic = getMessagesController().getTopicsController().findTopic(this.chatId, this.topicId);
            this.topicForEdit = findTopic;
            if (findTopic == null) {
                return false;
            }
            i = findTopic.icon_color;
        } else {
            int[] iArr = ForumBubbleDrawable.serverSupportedColor;
            i = iArr[Math.abs(Utilities.random.nextInt() % iArr.length)];
        }
        this.iconColor = i;
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public void onResume() {
        super.onResume();
        this.editTextBoldCursor.requestFocus();
        AndroidUtilities.showKeyboard(this.editTextBoldCursor);
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public void onTransitionAnimationEnd(boolean z, boolean z2) {
        super.onTransitionAnimationEnd(z, z2);
        if (!z && this.created) {
            removeSelfFromStack();
        }
        this.notificationsLocker.unlock();
        SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = this.selectAnimatedEmojiDialog;
        if (selectAnimatedEmojiDialog != null) {
            selectAnimatedEmojiDialog.setAnimationsEnabled(this.fragmentBeginToShow);
        }
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public void onTransitionAnimationStart(boolean z, boolean z2) {
        super.onTransitionAnimationStart(z, z2);
        if (z) {
            this.notificationsLocker.lock();
        }
    }

    public void showKeyboard() {
        this.editTextBoldCursor.requestFocus();
        AndroidUtilities.showKeyboard(this.editTextBoldCursor);
    }
}
