package org.telegram.ui.Components;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.CharacterStyle;
import android.text.style.ForegroundColorSpan;
import android.text.style.ReplacementSpan;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AiTonesController$$ExternalSyntheticLambda0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Cells.PollEditTextCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Cells.TextSelectionHelper;
import org.telegram.ui.Components.chat.ChatActivityDraftMessageMeasureController;
import org.telegram.ui.GradientClip;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PinchToZoomHelper;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.Stories.recorder.PreviewView;

/* loaded from: classes5.dex */
public class TagEditCell extends LinearLayout {
    private final AvatarDrawable avatarDrawable;
    private final BackupImageView avatarImageView;
    private final SizeNotifierFrameLayout chatView;
    private final ImageView clearImageView;
    private final int currentAccount;
    private final long dialogId;
    private final PollEditTextCell editTextCell;
    private boolean ignoreEdit;
    private boolean isAdmin;
    private boolean isOwner;
    private final AnimatedTextView limitTextView;
    private final ChatMessageCell messageCell;
    private MessageObject messageObject;
    private Utilities.Callback onRankEdited;
    private final Theme.ResourcesProvider resourcesProvider;
    private float shakeDp;

    public TagEditCell(Context context, int i, long j, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.shakeDp = -6.0f;
        this.currentAccount = i;
        this.dialogId = j;
        this.resourcesProvider = resourcesProvider;
        setOrientation(1);
        SizeNotifierFrameLayout sizeNotifierFrameLayout = new SizeNotifierFrameLayout(context) { // from class: org.telegram.ui.Components.TagEditCell.1
            @Override // org.telegram.ui.Components.SizeNotifierFrameLayout
            protected boolean isActionBarVisible() {
                return false;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // org.telegram.ui.Components.SizeNotifierFrameLayout
            public boolean isStatusBarVisible() {
                return false;
            }

            @Override // org.telegram.ui.Components.SizeNotifierFrameLayout
            protected Theme.ResourcesProvider getResourceProvider() {
                return TagEditCell.this.resourcesProvider;
            }

            @Override // android.widget.FrameLayout, android.view.View
            protected void onMeasure(int i2, int i3) {
                super.onMeasure(i2, i3);
                setMeasuredDimension(View.MeasureSpec.getSize(i2), AndroidUtilities.dp(24.0f) + TagEditCell.this.messageCell.getMeasuredHeight());
            }
        };
        this.chatView = sizeNotifierFrameLayout;
        sizeNotifierFrameLayout.setBackgroundImage(PreviewView.getBackgroundDrawable((Drawable) null, i, j, Theme.isCurrentThemeDark()), false);
        ChatMessageCell chatMessageCell = new ChatMessageCell(context, i) { // from class: org.telegram.ui.Components.TagEditCell.2
            @Override // android.view.View
            public boolean isPressed() {
                return false;
            }

            @Override // org.telegram.ui.Cells.ChatMessageCell
            public int getParentWidth() {
                int i2;
                int dp;
                if (getMeasuredWidth() != 0) {
                    i2 = getMeasuredWidth();
                    dp = AndroidUtilities.dp(24.0f);
                } else {
                    i2 = AndroidUtilities.displaySize.x;
                    dp = AndroidUtilities.dp(24.0f);
                }
                return i2 - dp;
            }
        };
        this.messageCell = chatMessageCell;
        sizeNotifierFrameLayout.addView(chatMessageCell, LayoutHelper.createFrame(-1, -2.0f, 87, 0.0f, 12.0f, 0.0f, 12.0f));
        this.avatarDrawable = new AvatarDrawable();
        BackupImageView backupImageView = new BackupImageView(context);
        this.avatarImageView = backupImageView;
        backupImageView.setRoundRadius(AndroidUtilities.dp(21.0f));
        sizeNotifierFrameLayout.addView(backupImageView, LayoutHelper.createFrame(42, 42.0f, 83, 8.0f, 0.0f, 0.0f, 12.0f));
        addView(sizeNotifierFrameLayout, LayoutHelper.createLinear(-1, -2, 7));
        PollEditTextCell pollEditTextCell = new PollEditTextCell(context, false, 0, null, resourcesProvider);
        this.editTextCell = pollEditTextCell;
        final EditTextBoldCursor textView = pollEditTextCell.getTextView();
        textView.setEnabled(true);
        textView.setSingleLine(true);
        textView.setImeOptions(6);
        pollEditTextCell.setTextRight(114);
        ImageView imageView = new ImageView(context);
        this.clearImageView = imageView;
        imageView.setImageResource(R.drawable.menu_delete_old);
        imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText, resourcesProvider), PorterDuff.Mode.SRC_IN));
        pollEditTextCell.addView(imageView, LayoutHelper.createFrame(24, 24.0f, 21, 0.0f, 0.0f, 20.0f, 0.0f));
        ScaleStateListAnimator.apply(imageView);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.TagEditCell$$ExternalSyntheticLambda8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditTextBoldCursor.this.setText("");
            }
        });
        AnimatedTextView animatedTextView = new AnimatedTextView(context, false, true, false);
        this.limitTextView = animatedTextView;
        animatedTextView.adaptWidth = false;
        animatedTextView.setTypeface(AndroidUtilities.bold());
        animatedTextView.setTextColor(Theme.getColor(Theme.key_text_RedBold, resourcesProvider));
        animatedTextView.setTextSize(AndroidUtilities.dp(14.0f));
        animatedTextView.setGravity(17);
        animatedTextView.setAllowCancel(true);
        animatedTextView.setScaleProperty(0.6f);
        pollEditTextCell.addView(animatedTextView, LayoutHelper.createFrame(56, 50.0f, 117, 0.0f, 0.0f, 44.0f, 0.0f));
        textView.addTextChangedListener(new TextWatcher() { // from class: org.telegram.ui.Components.TagEditCell.3
            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                if (TagEditCell.this.ignoreEdit) {
                    return;
                }
                String trim = editable.toString().trim();
                if (trim.length() > 16) {
                    TagEditCell.this.limitTextView.setText("-" + (trim.length() - 16));
                    trim = trim.substring(0, 16);
                } else {
                    TagEditCell.this.limitTextView.setText("");
                }
                if (TagEditCell.this.onRankEdited != null) {
                    TagEditCell.this.onRankEdited.run(trim);
                }
                if (TagEditCell.this.messageObject != null) {
                    TagEditCell.this.messageObject.forceUpdate = true;
                    TagEditCell.this.messageCell.setMessageObject(TagEditCell.this.messageObject, null, false, false, false);
                }
            }
        });
        addView(pollEditTextCell, LayoutHelper.createLinear(-1, -2, 7));
        chatMessageCell.setDelegate(new ChatMessageCell.ChatMessageCellDelegate() { // from class: org.telegram.ui.Components.TagEditCell.4
            @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
            public /* synthetic */ boolean allowAddPollOptions() {
                return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$allowAddPollOptions(this);
            }

            @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
            public /* synthetic */ boolean canDrawOutboundsContent() {
                return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$canDrawOutboundsContent(this);
            }

            @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
            public boolean canPerformActions() {
                return false;
            }

            @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
            public /* synthetic */ boolean canPerformReply() {
                boolean canPerformActions;
                canPerformActions = canPerformActions();
                return canPerformActions;
            }

            @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
            public /* synthetic */ boolean canToggleRichMessageCheckbox(ChatMessageCell chatMessageCell2) {
                return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$canToggleRichMessageCheckbox(this, chatMessageCell2);
            }

            @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
            public /* synthetic */ void didLongPress(ChatMessageCell chatMessageCell2, float f, float f2) {
                ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didLongPress(this, chatMessageCell2, f, f2);
            }

            @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
            public /* synthetic */ void didLongPressBotButton(ChatMessageCell chatMessageCell2, TLRPC.KeyboardButton keyboardButton) {
                ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didLongPressBotButton(this, chatMessageCell2, keyboardButton);
            }

            @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
            public /* synthetic */ boolean didLongPressChannelAvatar(ChatMessageCell chatMessageCell2, TLRPC.Chat chat, int i2, float f, float f2) {
                return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didLongPressChannelAvatar(this, chatMessageCell2, chat, i2, f, f2);
            }

            @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
            public /* synthetic */ void didLongPressCustomBotButton(ChatMessageCell chatMessageCell2, BotInlineKeyboard.ButtonCustom buttonCustom) {
                ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didLongPressCustomBotButton(this, chatMessageCell2, buttonCustom);
            }

            @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
            public /* synthetic */ boolean didLongPressPollOption(ChatMessageCell chatMessageCell2, TLRPC.PollAnswer pollAnswer) {
                return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didLongPressPollOption(this, chatMessageCell2, pollAnswer);
            }

            @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
            public /* synthetic */ boolean didLongPressToDoButton(ChatMessageCell chatMessageCell2, TLRPC.TodoItem todoItem) {
                return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didLongPressToDoButton(this, chatMessageCell2, todoItem);
            }

            @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
            public /* synthetic */ boolean didLongPressUserAvatar(ChatMessageCell chatMessageCell2, TLRPC.User user, float f, float f2) {
                return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didLongPressUserAvatar(this, chatMessageCell2, user, f, f2);
            }

            @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
            public /* synthetic */ void didPressAboutRevenueSharingAds() {
                ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressAboutRevenueSharingAds(this);
            }

            @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
            public /* synthetic */ void didPressAddPollOptionButton(ChatMessageCell chatMessageCell2) {
                ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressAddPollOptionButton(this, chatMessageCell2);
            }

            @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
            public /* synthetic */ void didPressAdmin(ChatMessageCell chatMessageCell2) {
                ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressAdmin(this, chatMessageCell2);
            }

            @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
            public /* synthetic */ boolean didPressAnimatedEmoji(ChatMessageCell chatMessageCell2, AnimatedEmojiSpan animatedEmojiSpan) {
                return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressAnimatedEmoji(this, chatMessageCell2, animatedEmojiSpan);
            }

            @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
            public /* synthetic */ void didPressBoostCounter(ChatMessageCell chatMessageCell2) {
                ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressBoostCounter(this, chatMessageCell2);
            }

            @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
            public /* synthetic */ void didPressBotButton(ChatMessageCell chatMessageCell2, TLRPC.KeyboardButton keyboardButton) {
                ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressBotButton(this, chatMessageCell2, keyboardButton);
            }

            @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
            public /* synthetic */ void didPressCancelSendButton(ChatMessageCell chatMessageCell2) {
                ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressCancelSendButton(this, chatMessageCell2);
            }

            @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
            public /* synthetic */ void didPressChannelAvatar(ChatMessageCell chatMessageCell2, TLRPC.Chat chat, int i2, float f, float f2, boolean z) {
                ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressChannelAvatar(this, chatMessageCell2, chat, i2, f, f2, z);
            }

            @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
            public /* synthetic */ void didPressChannelRecommendation(ChatMessageCell chatMessageCell2, TLObject tLObject, boolean z) {
                ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressChannelRecommendation(this, chatMessageCell2, tLObject, z);
            }

            @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
            public /* synthetic */ void didPressChannelRecommendationsClose(ChatMessageCell chatMessageCell2) {
                ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressChannelRecommendationsClose(this, chatMessageCell2);
            }

            @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
            public /* synthetic */ void didPressCodeCopy(ChatMessageCell chatMessageCell2, MessageObject.TextLayoutBlock textLayoutBlock) {
                ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressCodeCopy(this, chatMessageCell2, textLayoutBlock);
            }

            @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
            public /* synthetic */ void didPressCommentButton(ChatMessageCell chatMessageCell2) {
                ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressCommentButton(this, chatMessageCell2);
            }

            @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
            public /* synthetic */ void didPressCustomBotButton(ChatMessageCell chatMessageCell2, BotInlineKeyboard.ButtonCustom buttonCustom) {
                ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressCustomBotButton(this, chatMessageCell2, buttonCustom);
            }

            @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
            public /* synthetic */ void didPressEffect(ChatMessageCell chatMessageCell2) {
                ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressEffect(this, chatMessageCell2);
            }

            @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
            public /* synthetic */ void didPressExtendedMediaPreview(ChatMessageCell chatMessageCell2, TLRPC.KeyboardButton keyboardButton) {
                ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressExtendedMediaPreview(this, chatMessageCell2, keyboardButton);
            }

            @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
            public /* synthetic */ void didPressFactCheck(ChatMessageCell chatMessageCell2) {
                ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressFactCheck(this, chatMessageCell2);
            }

            @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
            public /* synthetic */ void didPressFactCheckWhat(ChatMessageCell chatMessageCell2, int i2, int i3) {
                ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressFactCheckWhat(this, chatMessageCell2, i2, i3);
            }

            @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
            public /* synthetic */ void didPressGiveawayChatButton(ChatMessageCell chatMessageCell2, int i2) {
                ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressGiveawayChatButton(this, chatMessageCell2, i2);
            }

            @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
            public /* synthetic */ void didPressGroupImage(ChatMessageCell chatMessageCell2, ImageReceiver imageReceiver, TLRPC.MessageExtendedMedia messageExtendedMedia, float f, float f2) {
                ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressGroupImage(this, chatMessageCell2, imageReceiver, messageExtendedMedia, f, f2);
            }

            @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
            public /* synthetic */ void didPressHiddenForward(ChatMessageCell chatMessageCell2) {
                ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressHiddenForward(this, chatMessageCell2);
            }

            @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
            public /* synthetic */ void didPressHint(ChatMessageCell chatMessageCell2, int i2) {
                ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressHint(this, chatMessageCell2, i2);
            }

            @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
            public /* synthetic */ void didPressImage(ChatMessageCell chatMessageCell2, float f, float f2, boolean z) {
                ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressImage(this, chatMessageCell2, f, f2, z);
            }

            @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
            public /* synthetic */ void didPressInstantButton(ChatMessageCell chatMessageCell2, int i2) {
                ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressInstantButton(this, chatMessageCell2, i2);
            }

            @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
            public /* synthetic */ void didPressMoreChannelRecommendations(ChatMessageCell chatMessageCell2) {
                ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressMoreChannelRecommendations(this, chatMessageCell2);
            }

            @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
            public /* synthetic */ void didPressOther(ChatMessageCell chatMessageCell2, float f, float f2) {
                ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressOther(this, chatMessageCell2, f, f2);
            }

            @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
            public /* synthetic */ void didPressPollMedia(ChatMessageCell chatMessageCell2, ImageReceiver imageReceiver, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, float f, float f2, int i2) {
                ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressPollMedia(this, chatMessageCell2, imageReceiver, pollAnswer, messageMedia, f, f2, i2);
            }

            @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
            public /* synthetic */ void didPressReaction(ChatMessageCell chatMessageCell2, TLRPC.ReactionCount reactionCount, boolean z, float f, float f2) {
                ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressReaction(this, chatMessageCell2, reactionCount, z, f, f2);
            }

            @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
            public /* synthetic */ void didPressReplyMessage(ChatMessageCell chatMessageCell2, int i2, float f, float f2, boolean z) {
                ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressReplyMessage(this, chatMessageCell2, i2, f, f2, z);
            }

            @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
            public /* synthetic */ void didPressRevealSensitiveContent(ChatMessageCell chatMessageCell2) {
                ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressRevealSensitiveContent(this, chatMessageCell2);
            }

            @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
            public /* synthetic */ void didPressShowMore(ChatMessageCell chatMessageCell2) {
                ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressShowMore(this, chatMessageCell2);
            }

            @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
            public /* synthetic */ void didPressSideButton(ChatMessageCell chatMessageCell2) {
                ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressSideButton(this, chatMessageCell2);
            }

            @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
            public /* synthetic */ void didPressSponsoredClose(ChatMessageCell chatMessageCell2) {
                ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressSponsoredClose(this, chatMessageCell2);
            }

            @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
            public /* synthetic */ void didPressSponsoredInfo(ChatMessageCell chatMessageCell2, float f, float f2) {
                ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressSponsoredInfo(this, chatMessageCell2, f, f2);
            }

            @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
            public /* synthetic */ void didPressSummarize(ChatMessageCell chatMessageCell2, boolean z) {
                ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressSummarize(this, chatMessageCell2, z);
            }

            @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
            public /* synthetic */ void didPressTime(ChatMessageCell chatMessageCell2) {
                ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressTime(this, chatMessageCell2);
            }

            @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
            public /* synthetic */ boolean didPressToDoButton(ChatMessageCell chatMessageCell2, TLRPC.TodoItem todoItem, boolean z) {
                return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressToDoButton(this, chatMessageCell2, todoItem, z);
            }

            @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
            public /* synthetic */ void didPressUrl(ChatMessageCell chatMessageCell2, CharacterStyle characterStyle, boolean z) {
                ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressUrl(this, chatMessageCell2, characterStyle, z);
            }

            @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
            public /* synthetic */ void didPressUserAvatar(ChatMessageCell chatMessageCell2, TLRPC.User user, float f, float f2, boolean z) {
                ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressUserAvatar(this, chatMessageCell2, user, f, f2, z);
            }

            @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
            public /* synthetic */ void didPressUserStatus(ChatMessageCell chatMessageCell2, TLRPC.User user, TLRPC.Document document, String str) {
                ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressUserStatus(this, chatMessageCell2, user, document, str);
            }

            @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
            public /* synthetic */ void didPressViaBot(ChatMessageCell chatMessageCell2, String str) {
                ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressViaBot(this, chatMessageCell2, str);
            }

            @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
            public /* synthetic */ void didPressViaBotNotInline(ChatMessageCell chatMessageCell2, long j2) {
                ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressViaBotNotInline(this, chatMessageCell2, j2);
            }

            @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
            public /* synthetic */ void didPressVoteButtons(ChatMessageCell chatMessageCell2, ArrayList arrayList, int i2, int i3, int i4) {
                ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressVoteButtons(this, chatMessageCell2, arrayList, i2, i3, i4);
            }

            @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
            public /* synthetic */ void didPressWebPage(ChatMessageCell chatMessageCell2, TLRPC.WebPage webPage, String str, boolean z) {
                Browser.openUrl(chatMessageCell2.getContext(), str);
            }

            @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
            public /* synthetic */ void didQuickShareEnd(ChatMessageCell chatMessageCell2, float f, float f2) {
                ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didQuickShareEnd(this, chatMessageCell2, f, f2);
            }

            @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
            public /* synthetic */ void didQuickShareMove(ChatMessageCell chatMessageCell2, float f, float f2) {
                ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didQuickShareMove(this, chatMessageCell2, f, f2);
            }

            @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
            public /* synthetic */ void didQuickShareStart(ChatMessageCell chatMessageCell2, float f, float f2) {
                ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didQuickShareStart(this, chatMessageCell2, f, f2);
            }

            @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
            public /* synthetic */ void didStartVideoStream(MessageObject messageObject) {
                ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didStartVideoStream(this, messageObject);
            }

            @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
            public /* synthetic */ void didTogglePollPreview(ChatMessageCell chatMessageCell2) {
                ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didTogglePollPreview(this, chatMessageCell2);
            }

            @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
            public /* synthetic */ void didToggleRichMessageCheckbox(ChatMessageCell chatMessageCell2, boolean z, Runnable runnable) {
                ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didToggleRichMessageCheckbox(this, chatMessageCell2, z, runnable);
            }

            @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
            public /* synthetic */ boolean doNotShowLoadingReply(MessageObject messageObject) {
                return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$doNotShowLoadingReply(this, messageObject);
            }

            @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
            public /* synthetic */ void drawPollMode(Canvas canvas, ChatMessageCell chatMessageCell2) {
                ChatMessageCell.ChatMessageCellDelegate.-CC.$default$drawPollMode(this, canvas, chatMessageCell2);
            }

            @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
            public /* synthetic */ void forceUpdate(ChatMessageCell chatMessageCell2, boolean z) {
                ChatMessageCell.ChatMessageCellDelegate.-CC.$default$forceUpdate(this, chatMessageCell2, z);
            }

            @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
            public /* synthetic */ void forceUpdateNoAnimation(ChatMessageCell chatMessageCell2, boolean z) {
                ChatMessageCell.ChatMessageCellDelegate.-CC.$default$forceUpdateNoAnimation(this, chatMessageCell2, z);
            }

            @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
            public /* synthetic */ int getAddPollOptionInputFieldHeight(ChatMessageCell chatMessageCell2) {
                return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$getAddPollOptionInputFieldHeight(this, chatMessageCell2);
            }

            @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
            public /* synthetic */ ChatActivityDraftMessageMeasureController getDraftMessageMeasureController() {
                return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$getDraftMessageMeasureController(this);
            }

            @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
            public /* synthetic */ PinchToZoomHelper getPinchToZoomHelper() {
                return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$getPinchToZoomHelper(this);
            }

            @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
            public /* synthetic */ String getProgressLoadingBotButtonUrl(ChatMessageCell chatMessageCell2) {
                return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$getProgressLoadingBotButtonUrl(this, chatMessageCell2);
            }

            @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
            public /* synthetic */ CharacterStyle getProgressLoadingLink(ChatMessageCell chatMessageCell2) {
                return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$getProgressLoadingLink(this, chatMessageCell2);
            }

            @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
            public /* synthetic */ TextSelectionHelper.ChatListTextSelectionHelper getTextSelectionHelper() {
                return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$getTextSelectionHelper(this);
            }

            @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
            public /* synthetic */ boolean hasSelectedMessages() {
                return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$hasSelectedMessages(this);
            }

            @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
            public /* synthetic */ void invalidateBlur() {
                ChatMessageCell.ChatMessageCellDelegate.-CC.$default$invalidateBlur(this);
            }

            @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
            public /* synthetic */ boolean isLandscape() {
                return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$isLandscape(this);
            }

            @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
            public /* synthetic */ boolean isProgressLoading(ChatMessageCell chatMessageCell2, int i2) {
                return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$isProgressLoading(this, chatMessageCell2, i2);
            }

            @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
            public /* synthetic */ boolean isReplyOrSelf() {
                return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$isReplyOrSelf(this);
            }

            @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
            public /* synthetic */ boolean keyboardIsOpened() {
                return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$keyboardIsOpened(this);
            }

            @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
            public /* synthetic */ void needOpenWebView(MessageObject messageObject, String str, String str2, String str3, String str4, int i2, int i3) {
                ChatMessageCell.ChatMessageCellDelegate.-CC.$default$needOpenWebView(this, messageObject, str, str2, str3, str4, i2, i3);
            }

            @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
            public /* synthetic */ boolean needPlayMessage(ChatMessageCell chatMessageCell2, MessageObject messageObject, boolean z) {
                return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$needPlayMessage(this, chatMessageCell2, messageObject, z);
            }

            @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
            public /* synthetic */ void needReloadPolls() {
                ChatMessageCell.ChatMessageCellDelegate.-CC.$default$needReloadPolls(this);
            }

            @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
            public /* synthetic */ void needShowPremiumBulletin(int i2) {
                ChatMessageCell.ChatMessageCellDelegate.-CC.$default$needShowPremiumBulletin(this, i2);
            }

            @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
            public /* synthetic */ boolean onAccessibilityAction(int i2, Bundle bundle) {
                return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$onAccessibilityAction(this, i2, bundle);
            }

            @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
            public /* synthetic */ void onDiceFinished() {
                ChatMessageCell.ChatMessageCellDelegate.-CC.$default$onDiceFinished(this);
            }

            @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
            public /* synthetic */ boolean openArticlePhoto(ChatMessageCell chatMessageCell2, TL_iv.PageBlock pageBlock) {
                return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$openArticlePhoto(this, chatMessageCell2, pageBlock);
            }

            @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
            public /* synthetic */ void setShouldNotRepeatSticker(MessageObject messageObject) {
                ChatMessageCell.ChatMessageCellDelegate.-CC.$default$setShouldNotRepeatSticker(this, messageObject);
            }

            @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
            public /* synthetic */ boolean shouldDrawThreadProgress(ChatMessageCell chatMessageCell2, boolean z) {
                return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$shouldDrawThreadProgress(this, chatMessageCell2, z);
            }

            @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
            public /* synthetic */ boolean shouldRepeatSticker(MessageObject messageObject) {
                return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$shouldRepeatSticker(this, messageObject);
            }

            @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
            public /* synthetic */ void videoTimerReached() {
                ChatMessageCell.ChatMessageCellDelegate.-CC.$default$videoTimerReached(this);
            }

            @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
            public boolean isAdmin(long j2) {
                return TagEditCell.this.isAdmin;
            }

            @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
            public boolean isOwner(long j2) {
                return TagEditCell.this.isOwner;
            }

            @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
            public String getAdminRank(long j2) {
                String trim = textView.getText().toString().trim();
                if (trim.length() > 16) {
                    trim = trim.substring(0, 16);
                }
                if (TagEditCell.this.isAdmin || !TextUtils.isEmpty(trim)) {
                    return trim;
                }
                return null;
            }
        });
    }

    public boolean isOverLimit() {
        EditTextBoldCursor textView = this.editTextCell.getTextView();
        if (textView.getText().toString().trim().length() <= 16) {
            return false;
        }
        float f = -this.shakeDp;
        this.shakeDp = f;
        AndroidUtilities.shakeViewSpring(textView, f);
        BotWebViewVibrationEffect.APP_ERROR.vibrate();
        return true;
    }

    public void set(TLRPC.User user, String str, boolean z, boolean z2, Utilities.Callback callback) {
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.from_id = MessagesController.getInstance(this.currentAccount).getPeer(user.id);
        tL_message.peer_id = MessagesController.getInstance(this.currentAccount).getPeer(this.dialogId);
        tL_message.message = "";
        tL_message.date = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
        tL_message.out = false;
        this.isAdmin = z;
        this.isOwner = z2;
        MessageObject messageObject = new MessageObject(this.currentAccount, tL_message, true, false);
        this.messageObject = messageObject;
        messageObject.forceAvatar = true;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("_\n_  ");
        spannableStringBuilder.setSpan(new LineSpan((int) Math.min(AndroidUtilities.displaySize.x * 0.5f, AndroidUtilities.dp(200.0f))), 0, 1, 33);
        spannableStringBuilder.setSpan(new LineSpan((int) Math.min(AndroidUtilities.displaySize.x * 0.44f, AndroidUtilities.dp(160.0f))), 2, 3, 33);
        this.messageObject.messageText = spannableStringBuilder;
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.dialogId));
        ChatMessageCell chatMessageCell = this.messageCell;
        chatMessageCell.isChat = chat != null;
        chatMessageCell.isMegagroup = ChatObject.isChannel(chat) && chat.megagroup;
        this.messageObject.generateLayout(null);
        this.messageCell.setMessageObject(this.messageObject, null, false, false, false);
        this.avatarDrawable.setInfo(user);
        this.avatarImageView.setForUserOrChat(user, this.avatarDrawable);
        this.onRankEdited = callback;
        this.ignoreEdit = true;
        this.editTextCell.setTextAndHint(str, LocaleController.getString((!TextUtils.isEmpty(str) || z) ? R.string.MemberTagHintEdit : R.string.MemberTagHintAdd), false);
        this.ignoreEdit = false;
    }

    private static final class LineSpan extends ReplacementSpan {
        private final Paint paint;
        private final int width;

        public LineSpan(int i) {
            Paint paint = new Paint(1);
            this.paint = paint;
            this.width = i;
            paint.setColor(Theme.multAlpha(Theme.getColor(Theme.key_chat_inTimeText), 0.3f));
        }

        @Override // android.text.style.ReplacementSpan
        public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
            return this.width;
        }

        @Override // android.text.style.ReplacementSpan
        public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
            float dp = ((i3 + i5) / 2.0f) + AndroidUtilities.dp(1.33f);
            float dp2 = AndroidUtilities.dp(6.66f);
            RectF rectF = AndroidUtilities.rectTmp;
            float f2 = dp2 / 2.0f;
            rectF.set(f, dp - f2, this.width + f, dp + f2);
            canvas.drawRoundRect(rectF, f2, f2, this.paint);
        }
    }

    public static void showSheet(Context context, final int i, final long j, final TLRPC.User user, String str, final boolean z, boolean z2, final Theme.ResourcesProvider resourcesProvider) {
        final MessagesController messagesController = MessagesController.getInstance(i);
        messagesController.getChat(Long.valueOf(-j));
        BottomSheet.Builder builder = new BottomSheet.Builder(context, true, resourcesProvider);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        builder.setCustomView(linearLayout);
        LinearLayout linearLayout2 = new LinearLayout(context);
        int i2 = Theme.key_windowBackgroundWhiteBlackText;
        TextView makeTextView = TextHelper.makeTextView(context, 20.0f, i2, true);
        makeTextView.setText(LocaleController.getString(R.string.MemberTagTitle));
        linearLayout2.addView(makeTextView, LayoutHelper.createLinear(0, -2, 1.0f, 19, 22, 0, 22, 0));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i2, resourcesProvider), PorterDuff.Mode.SRC_IN));
        imageView.setBackground(Theme.createSelectorDrawable(Theme.getColor(Theme.key_listSelector, resourcesProvider), 1, AndroidUtilities.dp(18.0f)));
        linearLayout2.addView(imageView, LayoutHelper.createLinear(32, 32, 21, 0, 0, 10, 0));
        linearLayout.addView(linearLayout2, LayoutHelper.createLinear(-1, -2, 0.0f, 6.0f, 0.0f, 6.0f));
        final ButtonWithCounterView round = new ButtonWithCounterView(context, resourcesProvider).setRound();
        boolean z3 = !TextUtils.isEmpty(str) || z;
        round.setText(LocaleController.getString((TextUtils.isEmpty(str) && !z && z3) ? R.string.MemberTagButtonRemove : z3 ? R.string.MemberTagButtonEdit : R.string.MemberTagButtonAdd));
        final String[] strArr = {str == null ? "" : str};
        final boolean z4 = z3;
        final TagEditCell tagEditCell = new TagEditCell(context, i, j, resourcesProvider);
        tagEditCell.setClipToOutline(true);
        tagEditCell.setOutlineProvider(new ViewOutlineProvider() { // from class: org.telegram.ui.Components.TagEditCell.5
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), AndroidUtilities.dp(16.0f));
            }
        });
        tagEditCell.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider));
        tagEditCell.set(user, str, z, z2, new Utilities.Callback() { // from class: org.telegram.ui.Components.TagEditCell$$ExternalSyntheticLambda0
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                TagEditCell.lambda$showSheet$1(strArr, round, z, z4, (String) obj);
            }
        });
        linearLayout.addView(tagEditCell, LayoutHelper.createLinear(-1, -2, 7, 12.0f, 12.0f, 12.0f, 1.66f));
        TextInfoPrivacyCell textInfoPrivacyCell = new TextInfoPrivacyCell(context, 22, resourcesProvider);
        textInfoPrivacyCell.setText(UserObject.isUserSelf(user) ? LocaleController.getString(R.string.MemberTagSelfInfo) : LocaleController.formatString(R.string.MemberTagTheirInfo, UserObject.getUserName(user)));
        linearLayout.addView(textInfoPrivacyCell, LayoutHelper.createLinear(-1, -2, 7, 0, 0, 0, 0));
        linearLayout.addView(round, LayoutHelper.createLinear(-1, 48, 7, 14, 19, 14, 12));
        final BottomSheet create = builder.create();
        create.smoothKeyboardAnimationEnabled = true;
        create.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundGray, resourcesProvider));
        final boolean z5 = (!TextUtils.isEmpty(str) || z || z2) ? false : true;
        round.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.TagEditCell$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TagEditCell.lambda$showSheet$3(ButtonWithCounterView.this, tagEditCell, messagesController, j, user, strArr, i, create, z5, resourcesProvider, view);
            }
        });
        imageView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.TagEditCell$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BottomSheet.this.lambda$new$0();
            }
        });
        create.show();
        final EditTextBoldCursor textView = tagEditCell.editTextCell.getTextView();
        textView.post(new Runnable() { // from class: org.telegram.ui.Components.TagEditCell$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                TagEditCell.lambda$showSheet$5(EditTextBoldCursor.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showSheet$1(String[] strArr, ButtonWithCounterView buttonWithCounterView, boolean z, boolean z2, String str) {
        strArr[0] = str;
        buttonWithCounterView.setText(LocaleController.getString((TextUtils.isEmpty(str) && !z && z2) ? R.string.MemberTagButtonRemove : z2 ? R.string.MemberTagButtonEdit : R.string.MemberTagButtonAdd), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showSheet$3(final ButtonWithCounterView buttonWithCounterView, TagEditCell tagEditCell, final MessagesController messagesController, final long j, final TLRPC.User user, String[] strArr, int i, final BottomSheet bottomSheet, final boolean z, final Theme.ResourcesProvider resourcesProvider, View view) {
        if (buttonWithCounterView.isLoading() || tagEditCell.isOverLimit()) {
            return;
        }
        buttonWithCounterView.setLoading(true);
        AndroidUtilities.hideKeyboard(tagEditCell.editTextCell);
        final TLRPC.TL_messages_editChatParticipantRank tL_messages_editChatParticipantRank = new TLRPC.TL_messages_editChatParticipantRank();
        tL_messages_editChatParticipantRank.peer = messagesController.getInputPeer(j);
        tL_messages_editChatParticipantRank.participant = MessagesController.getInputPeer(user);
        tL_messages_editChatParticipantRank.rank = strArr[0];
        ConnectionsManager.getInstance(i).sendRequestTyped(tL_messages_editChatParticipantRank, new AiTonesController$$ExternalSyntheticLambda0(), new Utilities.Callback2() { // from class: org.telegram.ui.Components.TagEditCell$$ExternalSyntheticLambda4
            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                TagEditCell.lambda$showSheet$2(MessagesController.this, j, user, tL_messages_editChatParticipantRank, bottomSheet, z, resourcesProvider, buttonWithCounterView, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showSheet$2(MessagesController messagesController, long j, TLRPC.User user, TLRPC.TL_messages_editChatParticipantRank tL_messages_editChatParticipantRank, BottomSheet bottomSheet, boolean z, Theme.ResourcesProvider resourcesProvider, ButtonWithCounterView buttonWithCounterView, TLRPC.Updates updates, TLRPC.TL_error tL_error) {
        if (updates == null) {
            if (tL_error != null) {
                BulletinFactory.of(bottomSheet.topBulletinContainer, resourcesProvider).showForError(tL_error);
                buttonWithCounterView.setLoading(false);
                return;
            }
            return;
        }
        messagesController.updateRank(-j, user.id, tL_messages_editChatParticipantRank.rank);
        messagesController.processUpdates(updates, false);
        bottomSheet.lambda$new$0();
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (TextUtils.isEmpty(tL_messages_editChatParticipantRank.rank) || safeLastFragment == null) {
            return;
        }
        BulletinFactory.of(safeLastFragment).createSimpleBulletin(R.raw.contact_check, LocaleController.getString(z ? R.string.TagAdded : R.string.TagEdited), tL_messages_editChatParticipantRank.rank).wrapContent().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showSheet$5(EditTextBoldCursor editTextBoldCursor) {
        editTextBoldCursor.requestFocus();
        editTextBoldCursor.setSelection(0, editTextBoldCursor.length());
        AndroidUtilities.showKeyboard(editTextBoldCursor);
    }

    public static void showInfoSheet(final Context context, final int i, final long j, final TLRPC.User user, final String str, final boolean z, final boolean z2, boolean z3, final Theme.ResourcesProvider resourcesProvider) {
        int i2;
        final String str2;
        int i3;
        final boolean[] zArr;
        BottomSheet bottomSheet;
        boolean z4;
        int i4;
        TLRPC.Chat chat = MessagesController.getInstance(i).getChat(Long.valueOf(-j));
        if (chat == null) {
            return;
        }
        BottomSheet.Builder builder = new BottomSheet.Builder(context, true, resourcesProvider);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        builder.setCustomView(linearLayout);
        int i5 = z2 ? -6988581 : z ? -12539616 : -6905171;
        BackupImageView backupImageView = new BackupImageView(context);
        backupImageView.setImageResource(R.drawable.large_user_tag);
        backupImageView.setBackground(Theme.createCircleDrawable(AndroidUtilities.dp(80.0f), i5));
        linearLayout.addView(backupImageView, LayoutHelper.createLinear(80, 80, 49, 0, 18, 0, 0));
        int i6 = Theme.key_windowBackgroundWhiteBlackText;
        TextView makeTextView = TextHelper.makeTextView(context, 20.0f, i6, true);
        makeTextView.setGravity(17);
        if (z2) {
            i2 = R.string.TagInfoOwnerTitle;
        } else {
            i2 = z ? R.string.TagInfoAdminTitle : R.string.TagInfoMemberTitle;
        }
        makeTextView.setText(LocaleController.getString(i2));
        linearLayout.addView(makeTextView, LayoutHelper.createFrame(-1, -2.0f, 49, 32.0f, 15.0f, 32.0f, 0.0f));
        TextView makeTextView2 = TextHelper.makeTextView(context, 14.0f, i6, false);
        makeTextView2.setGravity(17);
        makeTextView2.setLineSpacing(AndroidUtilities.dp(3.0f), 1.0f);
        String str3 = "";
        if (str == null) {
            if (z2) {
                i4 = R.string.ChatTagOwner;
            } else if (z) {
                i4 = R.string.ChatTagAdmin;
            } else {
                str2 = "";
            }
            str2 = LocaleController.getString(i4);
        } else {
            str2 = str;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
        if (z2 || z) {
            final int i7 = z2 ? -6988581 : -12539616;
            final Paint paint = new Paint(1);
            paint.setColor(Theme.multAlpha(i7, 0.1f));
            spannableStringBuilder.setSpan(new ReplacementSpan() { // from class: org.telegram.ui.Components.TagEditCell.6
                private float textWidth;

                @Override // android.text.style.ReplacementSpan
                public int getSize(Paint paint2, CharSequence charSequence, int i8, int i9, Paint.FontMetricsInt fontMetricsInt) {
                    float dpf2 = AndroidUtilities.dpf2(11.33f);
                    float measureText = paint2.measureText(str2);
                    this.textWidth = measureText;
                    return (int) (dpf2 + measureText);
                }

                @Override // android.text.style.ReplacementSpan
                public void draw(Canvas canvas, CharSequence charSequence, int i8, int i9, float f, int i10, int i11, int i12, Paint paint2) {
                    float f2 = (i10 + i12) / 2.0f;
                    float dp = AndroidUtilities.dp(19.0f);
                    paint2.setColor(i7);
                    float f3 = dp / 2.0f;
                    canvas.drawRoundRect(f, f2 - f3, AndroidUtilities.dp(11.33f) + this.textWidth + f, f2 + f3, f3, f3, paint);
                    canvas.drawText(str2, AndroidUtilities.dpf2(5.66f) + f, i12 - AndroidUtilities.dp(6.0f), paint2);
                }
            }, 0, spannableStringBuilder.length(), 33);
        } else {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(Theme.getColor(Theme.key_chat_inTimeText)), 0, spannableStringBuilder.length(), 33);
        }
        if (z2) {
            i3 = R.string.TagInfoOwnerText;
        } else {
            i3 = z ? R.string.TagInfoAdminText : R.string.TagInfoMemberText;
        }
        makeTextView2.setText(AndroidUtilities.replaceCharSequence("un1", AndroidUtilities.replaceTags(LocaleController.formatString(i3, UserObject.getFirstName(user), chat.title)), spannableStringBuilder));
        linearLayout.addView(makeTextView2, LayoutHelper.createFrame(-1, -2.0f, 49, 32.0f, 10.0f, 32.0f, 25.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout.addView(linearLayout2, LayoutHelper.createLinear(-1, -2, 7, 16, 0, 16, 16));
        int i8 = 0;
        while (i8 < 2) {
            final ChatMessageCell chatMessageCell = new ChatMessageCell(context, i) { // from class: org.telegram.ui.Components.TagEditCell.7
                @Override // android.view.View
                public boolean isPressed() {
                    return false;
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell
                public void updateTranslation() {
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell
                public int getParentWidth() {
                    return (AndroidUtilities.displaySize.x - AndroidUtilities.dp(128.0f)) / 2;
                }
            };
            final boolean z5 = i8 == 1;
            chatMessageCell.setDelegate(new ChatMessageCell.ChatMessageCellDelegate() { // from class: org.telegram.ui.Components.TagEditCell.8
                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ boolean allowAddPollOptions() {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$allowAddPollOptions(this);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ boolean canDrawOutboundsContent() {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$canDrawOutboundsContent(this);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public boolean canPerformActions() {
                    return false;
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ boolean canPerformReply() {
                    boolean canPerformActions;
                    canPerformActions = canPerformActions();
                    return canPerformActions;
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ boolean canToggleRichMessageCheckbox(ChatMessageCell chatMessageCell2) {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$canToggleRichMessageCheckbox(this, chatMessageCell2);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didLongPress(ChatMessageCell chatMessageCell2, float f, float f2) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didLongPress(this, chatMessageCell2, f, f2);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didLongPressBotButton(ChatMessageCell chatMessageCell2, TLRPC.KeyboardButton keyboardButton) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didLongPressBotButton(this, chatMessageCell2, keyboardButton);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ boolean didLongPressChannelAvatar(ChatMessageCell chatMessageCell2, TLRPC.Chat chat2, int i9, float f, float f2) {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didLongPressChannelAvatar(this, chatMessageCell2, chat2, i9, f, f2);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didLongPressCustomBotButton(ChatMessageCell chatMessageCell2, BotInlineKeyboard.ButtonCustom buttonCustom) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didLongPressCustomBotButton(this, chatMessageCell2, buttonCustom);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ boolean didLongPressPollOption(ChatMessageCell chatMessageCell2, TLRPC.PollAnswer pollAnswer) {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didLongPressPollOption(this, chatMessageCell2, pollAnswer);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ boolean didLongPressToDoButton(ChatMessageCell chatMessageCell2, TLRPC.TodoItem todoItem) {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didLongPressToDoButton(this, chatMessageCell2, todoItem);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ boolean didLongPressUserAvatar(ChatMessageCell chatMessageCell2, TLRPC.User user2, float f, float f2) {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didLongPressUserAvatar(this, chatMessageCell2, user2, f, f2);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressAboutRevenueSharingAds() {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressAboutRevenueSharingAds(this);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressAddPollOptionButton(ChatMessageCell chatMessageCell2) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressAddPollOptionButton(this, chatMessageCell2);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressAdmin(ChatMessageCell chatMessageCell2) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressAdmin(this, chatMessageCell2);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ boolean didPressAnimatedEmoji(ChatMessageCell chatMessageCell2, AnimatedEmojiSpan animatedEmojiSpan) {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressAnimatedEmoji(this, chatMessageCell2, animatedEmojiSpan);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressBoostCounter(ChatMessageCell chatMessageCell2) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressBoostCounter(this, chatMessageCell2);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressBotButton(ChatMessageCell chatMessageCell2, TLRPC.KeyboardButton keyboardButton) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressBotButton(this, chatMessageCell2, keyboardButton);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressCancelSendButton(ChatMessageCell chatMessageCell2) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressCancelSendButton(this, chatMessageCell2);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressChannelAvatar(ChatMessageCell chatMessageCell2, TLRPC.Chat chat2, int i9, float f, float f2, boolean z6) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressChannelAvatar(this, chatMessageCell2, chat2, i9, f, f2, z6);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressChannelRecommendation(ChatMessageCell chatMessageCell2, TLObject tLObject, boolean z6) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressChannelRecommendation(this, chatMessageCell2, tLObject, z6);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressChannelRecommendationsClose(ChatMessageCell chatMessageCell2) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressChannelRecommendationsClose(this, chatMessageCell2);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressCodeCopy(ChatMessageCell chatMessageCell2, MessageObject.TextLayoutBlock textLayoutBlock) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressCodeCopy(this, chatMessageCell2, textLayoutBlock);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressCommentButton(ChatMessageCell chatMessageCell2) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressCommentButton(this, chatMessageCell2);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressCustomBotButton(ChatMessageCell chatMessageCell2, BotInlineKeyboard.ButtonCustom buttonCustom) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressCustomBotButton(this, chatMessageCell2, buttonCustom);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressEffect(ChatMessageCell chatMessageCell2) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressEffect(this, chatMessageCell2);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressExtendedMediaPreview(ChatMessageCell chatMessageCell2, TLRPC.KeyboardButton keyboardButton) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressExtendedMediaPreview(this, chatMessageCell2, keyboardButton);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressFactCheck(ChatMessageCell chatMessageCell2) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressFactCheck(this, chatMessageCell2);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressFactCheckWhat(ChatMessageCell chatMessageCell2, int i9, int i10) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressFactCheckWhat(this, chatMessageCell2, i9, i10);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressGiveawayChatButton(ChatMessageCell chatMessageCell2, int i9) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressGiveawayChatButton(this, chatMessageCell2, i9);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressGroupImage(ChatMessageCell chatMessageCell2, ImageReceiver imageReceiver, TLRPC.MessageExtendedMedia messageExtendedMedia, float f, float f2) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressGroupImage(this, chatMessageCell2, imageReceiver, messageExtendedMedia, f, f2);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressHiddenForward(ChatMessageCell chatMessageCell2) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressHiddenForward(this, chatMessageCell2);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressHint(ChatMessageCell chatMessageCell2, int i9) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressHint(this, chatMessageCell2, i9);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressImage(ChatMessageCell chatMessageCell2, float f, float f2, boolean z6) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressImage(this, chatMessageCell2, f, f2, z6);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressInstantButton(ChatMessageCell chatMessageCell2, int i9) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressInstantButton(this, chatMessageCell2, i9);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressMoreChannelRecommendations(ChatMessageCell chatMessageCell2) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressMoreChannelRecommendations(this, chatMessageCell2);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressOther(ChatMessageCell chatMessageCell2, float f, float f2) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressOther(this, chatMessageCell2, f, f2);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressPollMedia(ChatMessageCell chatMessageCell2, ImageReceiver imageReceiver, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, float f, float f2, int i9) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressPollMedia(this, chatMessageCell2, imageReceiver, pollAnswer, messageMedia, f, f2, i9);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressReaction(ChatMessageCell chatMessageCell2, TLRPC.ReactionCount reactionCount, boolean z6, float f, float f2) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressReaction(this, chatMessageCell2, reactionCount, z6, f, f2);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressReplyMessage(ChatMessageCell chatMessageCell2, int i9, float f, float f2, boolean z6) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressReplyMessage(this, chatMessageCell2, i9, f, f2, z6);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressRevealSensitiveContent(ChatMessageCell chatMessageCell2) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressRevealSensitiveContent(this, chatMessageCell2);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressShowMore(ChatMessageCell chatMessageCell2) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressShowMore(this, chatMessageCell2);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressSideButton(ChatMessageCell chatMessageCell2) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressSideButton(this, chatMessageCell2);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressSponsoredClose(ChatMessageCell chatMessageCell2) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressSponsoredClose(this, chatMessageCell2);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressSponsoredInfo(ChatMessageCell chatMessageCell2, float f, float f2) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressSponsoredInfo(this, chatMessageCell2, f, f2);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressSummarize(ChatMessageCell chatMessageCell2, boolean z6) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressSummarize(this, chatMessageCell2, z6);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressTime(ChatMessageCell chatMessageCell2) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressTime(this, chatMessageCell2);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ boolean didPressToDoButton(ChatMessageCell chatMessageCell2, TLRPC.TodoItem todoItem, boolean z6) {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressToDoButton(this, chatMessageCell2, todoItem, z6);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressUrl(ChatMessageCell chatMessageCell2, CharacterStyle characterStyle, boolean z6) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressUrl(this, chatMessageCell2, characterStyle, z6);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressUserAvatar(ChatMessageCell chatMessageCell2, TLRPC.User user2, float f, float f2, boolean z6) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressUserAvatar(this, chatMessageCell2, user2, f, f2, z6);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressUserStatus(ChatMessageCell chatMessageCell2, TLRPC.User user2, TLRPC.Document document, String str4) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressUserStatus(this, chatMessageCell2, user2, document, str4);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressViaBot(ChatMessageCell chatMessageCell2, String str4) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressViaBot(this, chatMessageCell2, str4);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressViaBotNotInline(ChatMessageCell chatMessageCell2, long j2) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressViaBotNotInline(this, chatMessageCell2, j2);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressVoteButtons(ChatMessageCell chatMessageCell2, ArrayList arrayList, int i9, int i10, int i11) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressVoteButtons(this, chatMessageCell2, arrayList, i9, i10, i11);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressWebPage(ChatMessageCell chatMessageCell2, TLRPC.WebPage webPage, String str4, boolean z6) {
                    Browser.openUrl(chatMessageCell2.getContext(), str4);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didQuickShareEnd(ChatMessageCell chatMessageCell2, float f, float f2) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didQuickShareEnd(this, chatMessageCell2, f, f2);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didQuickShareMove(ChatMessageCell chatMessageCell2, float f, float f2) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didQuickShareMove(this, chatMessageCell2, f, f2);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didQuickShareStart(ChatMessageCell chatMessageCell2, float f, float f2) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didQuickShareStart(this, chatMessageCell2, f, f2);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didStartVideoStream(MessageObject messageObject) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didStartVideoStream(this, messageObject);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didTogglePollPreview(ChatMessageCell chatMessageCell2) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didTogglePollPreview(this, chatMessageCell2);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didToggleRichMessageCheckbox(ChatMessageCell chatMessageCell2, boolean z6, Runnable runnable) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didToggleRichMessageCheckbox(this, chatMessageCell2, z6, runnable);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ boolean doNotShowLoadingReply(MessageObject messageObject) {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$doNotShowLoadingReply(this, messageObject);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void drawPollMode(Canvas canvas, ChatMessageCell chatMessageCell2) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$drawPollMode(this, canvas, chatMessageCell2);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void forceUpdate(ChatMessageCell chatMessageCell2, boolean z6) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$forceUpdate(this, chatMessageCell2, z6);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void forceUpdateNoAnimation(ChatMessageCell chatMessageCell2, boolean z6) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$forceUpdateNoAnimation(this, chatMessageCell2, z6);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ int getAddPollOptionInputFieldHeight(ChatMessageCell chatMessageCell2) {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$getAddPollOptionInputFieldHeight(this, chatMessageCell2);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ ChatActivityDraftMessageMeasureController getDraftMessageMeasureController() {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$getDraftMessageMeasureController(this);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ PinchToZoomHelper getPinchToZoomHelper() {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$getPinchToZoomHelper(this);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ String getProgressLoadingBotButtonUrl(ChatMessageCell chatMessageCell2) {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$getProgressLoadingBotButtonUrl(this, chatMessageCell2);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ CharacterStyle getProgressLoadingLink(ChatMessageCell chatMessageCell2) {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$getProgressLoadingLink(this, chatMessageCell2);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ TextSelectionHelper.ChatListTextSelectionHelper getTextSelectionHelper() {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$getTextSelectionHelper(this);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ boolean hasSelectedMessages() {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$hasSelectedMessages(this);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void invalidateBlur() {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$invalidateBlur(this);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ boolean isLandscape() {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$isLandscape(this);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ boolean isProgressLoading(ChatMessageCell chatMessageCell2, int i9) {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$isProgressLoading(this, chatMessageCell2, i9);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ boolean isReplyOrSelf() {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$isReplyOrSelf(this);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ boolean keyboardIsOpened() {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$keyboardIsOpened(this);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void needOpenWebView(MessageObject messageObject, String str4, String str5, String str6, String str7, int i9, int i10) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$needOpenWebView(this, messageObject, str4, str5, str6, str7, i9, i10);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ boolean needPlayMessage(ChatMessageCell chatMessageCell2, MessageObject messageObject, boolean z6) {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$needPlayMessage(this, chatMessageCell2, messageObject, z6);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void needReloadPolls() {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$needReloadPolls(this);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void needShowPremiumBulletin(int i9) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$needShowPremiumBulletin(this, i9);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ boolean onAccessibilityAction(int i9, Bundle bundle) {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$onAccessibilityAction(this, i9, bundle);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void onDiceFinished() {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$onDiceFinished(this);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ boolean openArticlePhoto(ChatMessageCell chatMessageCell2, TL_iv.PageBlock pageBlock) {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$openArticlePhoto(this, chatMessageCell2, pageBlock);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void setShouldNotRepeatSticker(MessageObject messageObject) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$setShouldNotRepeatSticker(this, messageObject);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ boolean shouldDrawThreadProgress(ChatMessageCell chatMessageCell2, boolean z6) {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$shouldDrawThreadProgress(this, chatMessageCell2, z6);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ boolean shouldRepeatSticker(MessageObject messageObject) {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$shouldRepeatSticker(this, messageObject);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void videoTimerReached() {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$videoTimerReached(this);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public boolean isAdmin(long j2) {
                    return z5;
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public boolean isOwner(long j2) {
                    return z5 && z2;
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public String getAdminRank(long j2) {
                    return LocaleController.getString(z5 ? z2 ? R.string.TagInfoOwnerTitle : R.string.TagInfoAdminTitle : R.string.TagInfoMemberTitle);
                }
            });
            SizeNotifierFrameLayout sizeNotifierFrameLayout = new SizeNotifierFrameLayout(context) { // from class: org.telegram.ui.Components.TagEditCell.9
                private GradientClip clip = new GradientClip();

                @Override // org.telegram.ui.Components.SizeNotifierFrameLayout
                protected boolean isActionBarVisible() {
                    return false;
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // org.telegram.ui.Components.SizeNotifierFrameLayout
                public boolean isStatusBarVisible() {
                    return false;
                }

                @Override // org.telegram.ui.Components.SizeNotifierFrameLayout
                protected Theme.ResourcesProvider getResourceProvider() {
                    return resourcesProvider;
                }

                @Override // android.widget.FrameLayout, android.view.View
                protected void onMeasure(int i9, int i10) {
                    super.onMeasure(i9, i10);
                    chatMessageCell.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, TLObject.FLAG_30), i10);
                    setMeasuredDimension(View.MeasureSpec.getSize(i9), AndroidUtilities.dp(24.0f) + chatMessageCell.getMeasuredHeight());
                }

                @Override // android.view.ViewGroup
                protected boolean drawChild(Canvas canvas, View view, long j2) {
                    if (view == chatMessageCell) {
                        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), NotificationCenter.didReceiveSmsCode, 31);
                        boolean drawChild = super.drawChild(canvas, view, j2);
                        canvas.save();
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(0.0f, 0.0f, AndroidUtilities.dp(45.0f), getHeight());
                        this.clip.draw(canvas, rectF, 0, 1.0f);
                        canvas.restore();
                        canvas.restore();
                        return drawChild;
                    }
                    return super.drawChild(canvas, view, j2);
                }
            };
            sizeNotifierFrameLayout.setBackgroundImage(PreviewView.getBackgroundDrawable((Drawable) null, i, j, Theme.isCurrentThemeDark()), false);
            sizeNotifierFrameLayout.addView(chatMessageCell, LayoutHelper.createFrame(-1, -2.0f, 87, 0.0f, 12.0f, 0.0f, 12.0f));
            linearLayout2.addView(sizeNotifierFrameLayout, LayoutHelper.createLinear(0, -1, 1.0f, 119, i8 == 1 ? 6 : 0, 0, i8 == 0 ? 6 : 0, 0));
            sizeNotifierFrameLayout.setClipToOutline(true);
            sizeNotifierFrameLayout.setOutlineProvider(new ViewOutlineProvider() { // from class: org.telegram.ui.Components.TagEditCell.10
                @Override // android.view.ViewOutlineProvider
                public void getOutline(View view, Outline outline) {
                    outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), AndroidUtilities.dp(16.0f));
                }
            });
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            int i9 = i8;
            tL_message.from_id = MessagesController.getInstance(i).getPeer(user.id);
            tL_message.peer_id = MessagesController.getInstance(i).getPeer(j);
            tL_message.message = str3;
            tL_message.date = ConnectionsManager.getInstance(i).getCurrentTime();
            tL_message.out = false;
            MessageObject messageObject = new MessageObject(i, tL_message, true, false);
            messageObject.forceAvatar = true;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("_\n_  ");
            LinearLayout linearLayout3 = linearLayout2;
            String str4 = str3;
            spannableStringBuilder2.setSpan(new LineSpan(AndroidUtilities.dp(200.0f)), 0, 1, 33);
            spannableStringBuilder2.setSpan(new LineSpan(AndroidUtilities.dp(160.0f)), 2, 3, 33);
            messageObject.messageText = spannableStringBuilder2;
            chatMessageCell.isChat = true;
            chatMessageCell.isMegagroup = ChatObject.isChannel(chat) && chat.megagroup;
            messageObject.generateLayout(null);
            chatMessageCell.setMessageObject(messageObject, null, false, false, false);
            chatMessageCell.setTranslationX(-AndroidUtilities.dp(140.0f));
            i8 = i9 + 1;
            str3 = str4;
            linearLayout2 = linearLayout3;
        }
        ButtonWithCounterView round = new ButtonWithCounterView(context, resourcesProvider).setRound();
        boolean z6 = (ChatObject.canManageTags(chat) && (!z || ((!z2 && z3) || UserObject.isUserSelf(user)))) || (ChatObject.canManageMyTag(chat) && UserObject.isUserSelf(user));
        if (!z6 && !ChatObject.canManageTags(chat) && !chat.creator && chat.admin_rights == null && !z2) {
            TextView makeTextView3 = TextHelper.makeTextView(context, 12.0f, Theme.key_windowBackgroundWhiteGrayText, false);
            makeTextView3.setGravity(1);
            makeTextView3.setText(LocaleController.getString(R.string.CantEditTagAdmins));
            linearLayout.addView(makeTextView3, LayoutHelper.createLinear(-1, -2, 32.0f, 0.0f, 32.0f, 0.0f));
        }
        linearLayout.addView(round, LayoutHelper.createLinear(-1, 48, 7, 16, 16, 16, 16));
        final boolean[] zArr2 = new boolean[1];
        final BottomSheet create = builder.create();
        if (!z6) {
            round.setText(StarGiftSheet.replaceUnderstood(LocaleController.getString(R.string.Understood)));
            round.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.TagEditCell$$ExternalSyntheticLambda5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TagEditCell.lambda$showInfoSheet$6(BottomSheet.this, zArr2, view);
                }
            });
            zArr = zArr2;
            bottomSheet = create;
            z4 = true;
        } else {
            round.setText(LocaleController.getString(UserObject.isUserSelf(user) ? TextUtils.isEmpty(str) ? R.string.TagInfoButtonAddMyTag : R.string.TagInfoButtonEditMyTag : TextUtils.isEmpty(str) ? R.string.TagInfoButtonAddTag : R.string.TagInfoButtonEditTag));
            zArr = zArr2;
            bottomSheet = create;
            z4 = true;
            round.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.TagEditCell$$ExternalSyntheticLambda6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TagEditCell.lambda$showInfoSheet$7(BottomSheet.this, context, i, j, user, str, z, z2, resourcesProvider, zArr, view);
                }
            });
        }
        bottomSheet.smoothKeyboardAnimationEnabled = z4;
        bottomSheet.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider));
        final boolean[] zArr3 = zArr;
        bottomSheet.setOnDismissListener(new Runnable() { // from class: org.telegram.ui.Components.TagEditCell$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                TagEditCell.lambda$showInfoSheet$8(zArr3);
            }
        });
        if (MessagesController.getGlobalMainSettings().getInt("showchattagsinfo", 3) <= 0 && z6) {
            showSheet(context, i, j, user, str, z, z2, resourcesProvider);
        } else {
            bottomSheet.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showInfoSheet$6(BottomSheet bottomSheet, boolean[] zArr, View view) {
        bottomSheet.lambda$new$0();
        if (zArr[0]) {
            return;
        }
        MessagesController.getGlobalMainSettings().edit().putInt("showchattagsinfo", 0).apply();
        zArr[0] = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showInfoSheet$7(BottomSheet bottomSheet, Context context, int i, long j, TLRPC.User user, String str, boolean z, boolean z2, Theme.ResourcesProvider resourcesProvider, boolean[] zArr, View view) {
        bottomSheet.lambda$new$0();
        showSheet(context, i, j, user, str, z, z2, resourcesProvider);
        if (zArr[0]) {
            return;
        }
        MessagesController.getGlobalMainSettings().edit().putInt("showchattagsinfo", 0).apply();
        zArr[0] = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showInfoSheet$8(boolean[] zArr) {
        if (zArr[0]) {
            return;
        }
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        globalMainSettings.edit().putInt("showchattagsinfo", globalMainSettings.getInt("showchattagsinfo", 3) - 1).apply();
        zArr[0] = true;
    }
}
