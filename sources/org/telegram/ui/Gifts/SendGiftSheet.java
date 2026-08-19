package org.telegram.ui.Gifts;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.util.Consumer;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.BillingResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ChatActionCell;
import org.telegram.ui.Cells.EditEmojiTextCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.BottomSheetWithRecyclerListView;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EditTextSuggestionsFix;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.MotionBackgroundDrawable;
import org.telegram.ui.Components.Premium.GiftPremiumBottomSheet$GiftTier;
import org.telegram.ui.Components.Premium.boosts.BoostDialogs;
import org.telegram.ui.Components.Premium.boosts.BoostRepository;
import org.telegram.ui.Components.Premium.boosts.PremiumPreviewGiftSentBottomSheet;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.TypefaceSpan;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundColorProviderThemed;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceColor;
import org.telegram.ui.Components.chat.ViewPositionWatcher;
import org.telegram.ui.Gifts.AuctionBidSheet;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.Stories.recorder.PreviewView;

/* loaded from: classes5.dex */
public class SendGiftSheet extends BottomSheetWithRecyclerListView implements NotificationCenter.NotificationCenterDelegate, GiftAuctionController.OnAuctionUpdateListener {
    private final TLRPC.MessageAction action;
    private final ChatActionCell actionCell;
    private UniversalAdapter adapter;
    public final AnimationNotificationsLocker animationsLock;
    public boolean anonymous;
    private GiftAuctionController.Auction auction;
    private final ButtonWithCounterView button;
    private final LinearLayout buttonContainer;
    private final ColoredImageSpan[] cachedStarSpan;
    private final LinearLayout chatLinearLayout;
    private final SizeNotifierFrameLayout chatView;
    private final Runnable closeParentSheet;
    private final int currentAccount;
    private final long dialogId;
    private final boolean forceNotUpgrade;
    private final boolean forceUpgrade;
    boolean isDismissed;
    private final TextView leftTextView;
    private final TextView leftTextView2;
    private final FrameLayout limitContainer;
    private final FrameLayout limitContainerWrapper;
    private final View limitProgressView;
    private EditEmojiTextCell messageEdit;
    private final MessageObject messageObject;
    private final String name;
    private final GiftPremiumBottomSheet$GiftTier premiumTier;
    private final boolean self;
    private final long send_paid_messages_stars;
    private int shakeDp;
    private final TextView soldTextView;
    private final TextView soldTextView2;
    private final TL_stars.StarGift starGift;
    public boolean upgrade;
    public boolean useStars;
    private final FrameLayout valueContainerView;

    public SendGiftSheet(Context context, int i, TL_stars.StarGift starGift, long j, Runnable runnable, boolean z, boolean z2) {
        this(context, i, starGift, null, j, runnable, z, z2);
    }

    public SendGiftSheet(Context context, int i, GiftPremiumBottomSheet$GiftTier giftPremiumBottomSheet$GiftTier, long j, Runnable runnable) {
        this(context, i, null, giftPremiumBottomSheet$GiftTier, j, runnable, false, false);
    }

    private SendGiftSheet(final Context context, final int i, final TL_stars.StarGift starGift, final GiftPremiumBottomSheet$GiftTier giftPremiumBottomSheet$GiftTier, final long j, final Runnable runnable, final boolean z, final boolean z2) {
        super(context, null, true, false, false, false, BottomSheetWithRecyclerListView.ActionBarType.SLIDING, null);
        float f;
        long j2;
        Integer num;
        BlurredBackgroundDrawable blurredBackgroundDrawable;
        SizeNotifierFrameLayout sizeNotifierFrameLayout;
        int i2;
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        this.upgrade = false;
        this.useStars = false;
        this.shakeDp = -2;
        this.animationsLock = new AnimationNotificationsLocker();
        this.cachedStarSpan = new ColoredImageSpan[1];
        this.isDismissed = false;
        boolean z3 = j == UserConfig.getInstance(i).getClientUserId();
        this.self = z3;
        setImageReceiverNumLevel(0, 4);
        fixNavigationBar();
        this.headerPaddingTop = AndroidUtilities.dp(4.0f);
        this.headerPaddingBottom = AndroidUtilities.dp(-10.0f);
        if (z3) {
            this.anonymous = true;
        }
        this.currentAccount = i;
        this.dialogId = j;
        this.starGift = starGift;
        if (starGift == null || !starGift.auction) {
            f = 4.0f;
        } else {
            f = 4.0f;
            this.auction = GiftAuctionController.getInstance(i).subscribeToGiftAuction(starGift.id, this);
        }
        this.premiumTier = giftPremiumBottomSheet$GiftTier;
        this.closeParentSheet = runnable;
        this.forceUpgrade = z;
        this.forceNotUpgrade = z2;
        if (z) {
            this.upgrade = true;
        } else if (z2) {
            this.upgrade = false;
        }
        this.topPadding = 0.2f;
        if (j >= 0) {
            j2 = 0;
            this.name = UserObject.getForcedFirstName(MessagesController.getInstance(i).getUser(Long.valueOf(j)));
        } else {
            j2 = 0;
            TLRPC.Chat chat = MessagesController.getInstance(i).getChat(Long.valueOf(-j));
            this.name = chat == null ? "" : chat.title;
        }
        ChatActionCell chatActionCell = new ChatActionCell(context, false, this.resourcesProvider);
        this.actionCell = chatActionCell;
        chatActionCell.setDelegate(new ChatActionCell.ChatActionCellDelegate() { // from class: org.telegram.ui.Gifts.SendGiftSheet.1
            @Override // org.telegram.ui.Cells.ChatActionCell.ChatActionCellDelegate
            public /* synthetic */ boolean canDrawOutboundsContent() {
                return ChatActionCell.ChatActionCellDelegate.-CC.$default$canDrawOutboundsContent(this);
            }

            @Override // org.telegram.ui.Cells.ChatActionCell.ChatActionCellDelegate
            public /* synthetic */ void didClickButton(ChatActionCell chatActionCell2) {
                ChatActionCell.ChatActionCellDelegate.-CC.$default$didClickButton(this, chatActionCell2);
            }

            @Override // org.telegram.ui.Cells.ChatActionCell.ChatActionCellDelegate
            public /* synthetic */ void didClickImage(ChatActionCell chatActionCell2) {
                ChatActionCell.ChatActionCellDelegate.-CC.$default$didClickImage(this, chatActionCell2);
            }

            @Override // org.telegram.ui.Cells.ChatActionCell.ChatActionCellDelegate
            public /* synthetic */ boolean didLongPress(ChatActionCell chatActionCell2, float f2, float f3) {
                return ChatActionCell.ChatActionCellDelegate.-CC.$default$didLongPress(this, chatActionCell2, f2, f3);
            }

            @Override // org.telegram.ui.Cells.ChatActionCell.ChatActionCellDelegate
            public /* synthetic */ void didOpenPremiumGift(ChatActionCell chatActionCell2, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str, boolean z4) {
                ChatActionCell.ChatActionCellDelegate.-CC.$default$didOpenPremiumGift(this, chatActionCell2, tL_premiumGiftOption, str, z4);
            }

            @Override // org.telegram.ui.Cells.ChatActionCell.ChatActionCellDelegate
            public /* synthetic */ void didOpenPremiumGiftChannel(ChatActionCell chatActionCell2, String str, boolean z4) {
                ChatActionCell.ChatActionCellDelegate.-CC.$default$didOpenPremiumGiftChannel(this, chatActionCell2, str, z4);
            }

            @Override // org.telegram.ui.Cells.ChatActionCell.ChatActionCellDelegate
            public /* synthetic */ void didPressReaction(ChatActionCell chatActionCell2, TLRPC.ReactionCount reactionCount, boolean z4, float f2, float f3) {
                ChatActionCell.ChatActionCellDelegate.-CC.$default$didPressReaction(this, chatActionCell2, reactionCount, z4, f2, f3);
            }

            @Override // org.telegram.ui.Cells.ChatActionCell.ChatActionCellDelegate
            public /* synthetic */ void didPressReplyMessage(ChatActionCell chatActionCell2, int i3) {
                ChatActionCell.ChatActionCellDelegate.-CC.$default$didPressReplyMessage(this, chatActionCell2, i3);
            }

            @Override // org.telegram.ui.Cells.ChatActionCell.ChatActionCellDelegate
            public /* synthetic */ void didPressTaskLink(ChatActionCell chatActionCell2, int i3, int i4) {
                ChatActionCell.ChatActionCellDelegate.-CC.$default$didPressTaskLink(this, chatActionCell2, i3, i4);
            }

            @Override // org.telegram.ui.Cells.ChatActionCell.ChatActionCellDelegate
            public /* synthetic */ void forceUpdate(ChatActionCell chatActionCell2, boolean z4) {
                ChatActionCell.ChatActionCellDelegate.-CC.$default$forceUpdate(this, chatActionCell2, z4);
            }

            @Override // org.telegram.ui.Cells.ChatActionCell.ChatActionCellDelegate
            public /* synthetic */ BaseFragment getBaseFragment() {
                return ChatActionCell.ChatActionCellDelegate.-CC.$default$getBaseFragment(this);
            }

            @Override // org.telegram.ui.Cells.ChatActionCell.ChatActionCellDelegate
            public /* synthetic */ long getDialogId() {
                return ChatActionCell.ChatActionCellDelegate.-CC.$default$getDialogId(this);
            }

            @Override // org.telegram.ui.Cells.ChatActionCell.ChatActionCellDelegate
            public /* synthetic */ long getTopicId() {
                return ChatActionCell.ChatActionCellDelegate.-CC.$default$getTopicId(this);
            }

            @Override // org.telegram.ui.Cells.ChatActionCell.ChatActionCellDelegate
            public /* synthetic */ void needOpenInviteLink(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
                ChatActionCell.ChatActionCellDelegate.-CC.$default$needOpenInviteLink(this, tL_chatInviteExported);
            }

            @Override // org.telegram.ui.Cells.ChatActionCell.ChatActionCellDelegate
            public /* synthetic */ void needOpenUserProfile(long j3) {
                ChatActionCell.ChatActionCellDelegate.-CC.$default$needOpenUserProfile(this, j3);
            }

            @Override // org.telegram.ui.Cells.ChatActionCell.ChatActionCellDelegate
            public /* synthetic */ void needShowEffectOverlay(ChatActionCell chatActionCell2, TLRPC.Document document, TLRPC.VideoSize videoSize) {
                ChatActionCell.ChatActionCellDelegate.-CC.$default$needShowEffectOverlay(this, chatActionCell2, document, videoSize);
            }

            @Override // org.telegram.ui.Cells.ChatActionCell.ChatActionCellDelegate
            public /* synthetic */ void onTopicClick(ChatActionCell chatActionCell2) {
                ChatActionCell.ChatActionCellDelegate.-CC.$default$onTopicClick(this, chatActionCell2);
            }
        });
        SizeNotifierFrameLayout sizeNotifierFrameLayout2 = new SizeNotifierFrameLayout(context) { // from class: org.telegram.ui.Gifts.SendGiftSheet.2
            int maxHeight = -1;

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
            protected boolean useRootView() {
                return false;
            }

            @Override // android.widget.FrameLayout, android.view.View
            protected void onMeasure(int i3, int i4) {
                if (this.maxHeight != -1) {
                    super.onMeasure(i3, i4);
                    int measuredHeight = getMeasuredHeight();
                    int i5 = this.maxHeight;
                    if (measuredHeight < i5) {
                        i4 = View.MeasureSpec.makeMeasureSpec(Math.max(i5, getMeasuredHeight()), TLObject.FLAG_31);
                    }
                }
                super.onMeasure(i3, i4);
                int i6 = this.maxHeight;
                if (i6 == -1) {
                    this.maxHeight = Math.max(i6, getMeasuredHeight());
                }
            }

            @Override // android.view.ViewGroup
            protected boolean drawChild(Canvas canvas, View view, long j3) {
                if (view == this.backgroundView) {
                    return true;
                }
                return super.drawChild(canvas, view, j3);
            }

            @Override // org.telegram.ui.Components.SizeNotifierFrameLayout, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
            protected void onLayout(boolean z4, int i3, int i4, int i5, int i6) {
                super.onLayout(z4, i3, i4, i5, i6);
                SendGiftSheet.this.chatLinearLayout.setTranslationY(((i6 - i4) - SendGiftSheet.this.chatLinearLayout.getMeasuredHeight()) / 2.0f);
                SendGiftSheet.this.actionCell.setVisiblePart(SendGiftSheet.this.chatLinearLayout.getY() + SendGiftSheet.this.actionCell.getY(), getBackgroundSizeY());
            }

            @Override // org.telegram.ui.Components.SizeNotifierFrameLayout
            protected void onBackgroundViewInvalidate() {
                super.onBackgroundViewInvalidate();
                ((BottomSheetWithRecyclerListView) SendGiftSheet.this).recyclerListView.invalidate();
            }
        };
        this.chatView = sizeNotifierFrameLayout2;
        boolean z4 = z3;
        Drawable backgroundDrawable = PreviewView.getBackgroundDrawable((Drawable) null, i, j, Theme.isCurrentThemeDark());
        sizeNotifierFrameLayout2.setBackgroundImage(backgroundDrawable, false);
        BlurredBackgroundSourceColor blurredBackgroundSourceColor = new BlurredBackgroundSourceColor();
        if (backgroundDrawable instanceof ColorDrawable) {
            num = Integer.valueOf(((ColorDrawable) backgroundDrawable).getColor());
        } else {
            if (backgroundDrawable instanceof MotionBackgroundDrawable) {
                MotionBackgroundDrawable motionBackgroundDrawable = (MotionBackgroundDrawable) backgroundDrawable;
                if (motionBackgroundDrawable.getIntensity() < 0) {
                    num = -16777216;
                } else {
                    int[] colors = motionBackgroundDrawable.getColors();
                    if (colors != null && colors.length > 0) {
                        num = Integer.valueOf(colors[0]);
                    }
                }
            }
            num = null;
        }
        blurredBackgroundSourceColor.setColor(num != null ? num.intValue() : getThemedColor(Theme.key_dialogBackground));
        BlurredBackgroundDrawable createDrawable = blurredBackgroundSourceColor.createDrawable();
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        int i3 = Theme.key_dialogBackground;
        createDrawable.setColorProvider(new BlurredBackgroundColorProviderThemed(resourcesProvider, i3));
        createDrawable.setRadius(AndroidUtilities.dp(20.0f));
        createDrawable.setPadding(AndroidUtilities.dp(f));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.chatLinearLayout = linearLayout3;
        linearLayout3.setOrientation(1);
        if (starGift != null) {
            TLRPC.TL_messageActionStarGift tL_messageActionStarGift = new TLRPC.TL_messageActionStarGift();
            tL_messageActionStarGift.gift = starGift;
            blurredBackgroundDrawable = createDrawable;
            tL_messageActionStarGift.flags |= 2;
            tL_messageActionStarGift.message = new TLRPC.TL_textWithEntities();
            tL_messageActionStarGift.convert_stars = starGift.convert_stars;
            tL_messageActionStarGift.forceIn = true;
            this.action = tL_messageActionStarGift;
            sizeNotifierFrameLayout = sizeNotifierFrameLayout2;
            i2 = i3;
            linearLayout = linearLayout3;
        } else {
            blurredBackgroundDrawable = createDrawable;
            if (giftPremiumBottomSheet$GiftTier != null && giftPremiumBottomSheet$GiftTier.giftCodeOption != null) {
                TLRPC.TL_messageActionGiftCode tL_messageActionGiftCode = new TLRPC.TL_messageActionGiftCode();
                tL_messageActionGiftCode.unclaimed = true;
                tL_messageActionGiftCode.via_giveaway = false;
                tL_messageActionGiftCode.months = giftPremiumBottomSheet$GiftTier.getMonths();
                tL_messageActionGiftCode.flags |= 4;
                tL_messageActionGiftCode.currency = giftPremiumBottomSheet$GiftTier.getCurrency();
                long price = giftPremiumBottomSheet$GiftTier.getPrice();
                tL_messageActionGiftCode.amount = price;
                if (giftPremiumBottomSheet$GiftTier.googlePlayProductDetails != null) {
                    sizeNotifierFrameLayout = sizeNotifierFrameLayout2;
                    i2 = i3;
                    linearLayout2 = linearLayout3;
                    tL_messageActionGiftCode.amount = (long) (price * Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_messageActionGiftCode.currency) - 6));
                } else {
                    sizeNotifierFrameLayout = sizeNotifierFrameLayout2;
                    i2 = i3;
                    linearLayout2 = linearLayout3;
                }
                tL_messageActionGiftCode.flags |= 16;
                tL_messageActionGiftCode.message = new TLRPC.TL_textWithEntities();
                this.action = tL_messageActionGiftCode;
                linearLayout = linearLayout2;
            } else {
                sizeNotifierFrameLayout = sizeNotifierFrameLayout2;
                i2 = i3;
                if (giftPremiumBottomSheet$GiftTier != null && giftPremiumBottomSheet$GiftTier.giftOption != null) {
                    TLRPC.TL_messageActionGiftPremium tL_messageActionGiftPremium = new TLRPC.TL_messageActionGiftPremium();
                    tL_messageActionGiftPremium.months = giftPremiumBottomSheet$GiftTier.getMonths();
                    tL_messageActionGiftPremium.currency = giftPremiumBottomSheet$GiftTier.getCurrency();
                    long price2 = giftPremiumBottomSheet$GiftTier.getPrice();
                    tL_messageActionGiftPremium.amount = price2;
                    if (giftPremiumBottomSheet$GiftTier.googlePlayProductDetails != null) {
                        linearLayout = linearLayout3;
                        tL_messageActionGiftPremium.amount = (long) (price2 * Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_messageActionGiftPremium.currency) - 6));
                    } else {
                        linearLayout = linearLayout3;
                    }
                    tL_messageActionGiftPremium.flags |= 2;
                    tL_messageActionGiftPremium.message = new TLRPC.TL_textWithEntities();
                    this.action = tL_messageActionGiftPremium;
                } else {
                    throw new RuntimeException("SendGiftSheet with no star gift and no premium tier");
                }
            }
        }
        TLRPC.MessageAction messageAction = this.action;
        if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
            TLRPC.TL_messageActionStarGift tL_messageActionStarGift2 = (TLRPC.TL_messageActionStarGift) messageAction;
            boolean z5 = this.upgrade;
            tL_messageActionStarGift2.can_upgrade = z5 || (z4 && starGift != null && starGift.can_upgrade);
            tL_messageActionStarGift2.upgrade_stars = (!z4 && z5) ? starGift.upgrade_stars : j2;
            tL_messageActionStarGift2.convert_stars = z5 ? j2 : starGift.convert_stars;
        }
        TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
        tL_messageService.id = 1;
        tL_messageService.dialog_id = j;
        tL_messageService.from_id = MessagesController.getInstance(i).getPeer(UserConfig.getInstance(i).getClientUserId());
        tL_messageService.peer_id = MessagesController.getInstance(i).getPeer(j);
        tL_messageService.action = this.action;
        long sendPaidMessagesStars = starGift != null ? MessagesController.getInstance(i).getSendPaidMessagesStars(j) : j2;
        this.send_paid_messages_stars = sendPaidMessagesStars;
        MessageObject messageObject = new MessageObject(i, tL_messageService, false, false);
        this.messageObject = messageObject;
        chatActionCell.setMessageObject(messageObject, true);
        LinearLayout linearLayout4 = linearLayout;
        linearLayout4.addView(chatActionCell, LayoutHelper.createLinear(-1, -1, 119, 0, sendPaidMessagesStars > j2 ? 0 : 8, 0, 8));
        sizeNotifierFrameLayout.addView(linearLayout4, LayoutHelper.createFrame(-1, -1, 119));
        int i4 = i2;
        final BlurredBackgroundDrawable blurredBackgroundDrawable2 = blurredBackgroundDrawable;
        EditEmojiTextCell editEmojiTextCell = new EditEmojiTextCell(context, (SizeNotifierFrameLayout) this.containerView, LocaleController.getString(starGift != null ? R.string.Gift2Message : R.string.Gift2MessageOptional), true, MessagesController.getInstance(i).stargiftsMessageLengthMax, 4, this.resourcesProvider) { // from class: org.telegram.ui.Gifts.SendGiftSheet.3
            @Override // org.telegram.ui.Cells.EditEmojiTextCell
            protected void onFocusChanged(boolean z6) {
            }

            @Override // org.telegram.ui.Cells.EditEmojiTextCell, android.widget.FrameLayout, android.view.View
            protected void onMeasure(int i5, int i6) {
                setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(12.0f), 0);
                super.onMeasure(i5, i6);
            }

            @Override // android.view.ViewGroup, android.view.View
            protected void dispatchDraw(Canvas canvas) {
                blurredBackgroundDrawable2.setBounds(AndroidUtilities.dp(10.0f), 0, getMeasuredWidth() - AndroidUtilities.dp(10.0f), getMeasuredHeight());
                blurredBackgroundDrawable2.draw(canvas);
                super.dispatchDraw(canvas);
            }

            @Override // org.telegram.ui.Cells.EditEmojiTextCell
            protected void onTextChanged(CharSequence charSequence) {
                TLRPC.TL_textWithEntities tL_textWithEntities;
                if (SendGiftSheet.this.action instanceof TLRPC.TL_messageActionStarGift) {
                    TLRPC.TL_messageActionStarGift tL_messageActionStarGift3 = (TLRPC.TL_messageActionStarGift) SendGiftSheet.this.action;
                    tL_textWithEntities = new TLRPC.TL_textWithEntities();
                    tL_messageActionStarGift3.message = tL_textWithEntities;
                } else if (SendGiftSheet.this.action instanceof TLRPC.TL_messageActionGiftCode) {
                    ((TLRPC.TL_messageActionGiftCode) SendGiftSheet.this.action).flags |= 16;
                    TLRPC.TL_messageActionGiftCode tL_messageActionGiftCode2 = (TLRPC.TL_messageActionGiftCode) SendGiftSheet.this.action;
                    tL_textWithEntities = new TLRPC.TL_textWithEntities();
                    tL_messageActionGiftCode2.message = tL_textWithEntities;
                } else {
                    if (!(SendGiftSheet.this.action instanceof TLRPC.TL_messageActionGiftPremium)) {
                        return;
                    }
                    ((TLRPC.TL_messageActionGiftPremium) SendGiftSheet.this.action).flags |= 16;
                    TLRPC.TL_messageActionGiftPremium tL_messageActionGiftPremium2 = (TLRPC.TL_messageActionGiftPremium) SendGiftSheet.this.action;
                    tL_textWithEntities = new TLRPC.TL_textWithEntities();
                    tL_messageActionGiftPremium2.message = tL_textWithEntities;
                }
                CharSequence[] charSequenceArr = {SendGiftSheet.this.messageEdit.getText()};
                tL_textWithEntities.entities = MediaDataController.getInstance(i).getEntities(charSequenceArr, true);
                tL_textWithEntities.text = charSequenceArr[0].toString();
                SendGiftSheet.this.messageObject.setType();
                SendGiftSheet.this.actionCell.setMessageObject(SendGiftSheet.this.messageObject, true);
                SendGiftSheet.this.adapter.update(true);
                SendGiftSheet.this.setButtonText(true);
            }
        };
        this.messageEdit = editEmojiTextCell;
        editEmojiTextCell.editTextEmoji.getEditText().addTextChangedListener(new EditTextSuggestionsFix());
        this.messageEdit.editTextEmoji.allowEmojisForNonPremium(true);
        this.messageEdit.setShowLimitWhenNear(50);
        setEditTextEmoji(this.messageEdit.editTextEmoji);
        this.messageEdit.setShowLimitOnFocus(true);
        this.messageEdit.setDivider(false);
        this.messageEdit.hideKeyboardOnEnter();
        EditEmojiTextCell editEmojiTextCell2 = this.messageEdit;
        int i5 = this.backgroundPaddingLeft;
        editEmojiTextCell2.setPadding(i5, 0, i5, 0);
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator() { // from class: org.telegram.ui.Gifts.SendGiftSheet.4
            @Override // androidx.recyclerview.widget.DefaultItemAnimator
            protected float animateByScale(View view) {
                return 0.3f;
            }
        };
        defaultItemAnimator.setDelayAnimations(false);
        defaultItemAnimator.setSupportsChangeAnimations(false);
        defaultItemAnimator.setDurations(350L);
        defaultItemAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        defaultItemAnimator.setDelayIncrement(40L);
        this.recyclerListView.setItemAnimator(defaultItemAnimator);
        this.adapter.update(false);
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.buttonContainer = linearLayout5;
        linearLayout5.setOrientation(1);
        linearLayout5.setBackgroundColor(Theme.getColor(i4, this.resourcesProvider));
        int i6 = this.backgroundPaddingLeft;
        linearLayout5.setPadding(i6, 0, i6, 0);
        this.containerView.addView(linearLayout5, LayoutHelper.createFrame(-1, -2, 87));
        View view = new View(context);
        view.setBackgroundColor(Theme.getColor(Theme.key_dialogGrayLine, this.resourcesProvider));
        linearLayout5.addView(view, LayoutHelper.createLinear(-1.0f, 1.0f / AndroidUtilities.density, 55));
        final float clamp = Utilities.clamp(starGift == null ? 0.0f : starGift.availability_remains / starGift.availability_total, 1.0f, 0.0f);
        FrameLayout frameLayout = new FrameLayout(context);
        this.limitContainer = frameLayout;
        frameLayout.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(6.0f), Theme.getColor(Theme.key_windowBackgroundGray, this.resourcesProvider)));
        if (starGift != null && starGift.auction) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.limitContainerWrapper = frameLayout2;
            frameLayout2.addView(frameLayout, LayoutHelper.createLinear(-1, 30, 10.0f, 14.0f, 10.0f, 14.0f));
            frameLayout2.setBackgroundColor(Theme.getColor(i4, this.resourcesProvider));
        } else {
            frameLayout.setVisibility((starGift == null || !starGift.limited) ? 8 : 0);
            linearLayout5.addView(frameLayout, LayoutHelper.createLinear(-1, 30, 10.0f, 10.0f, 10.0f, 0.0f));
            this.limitContainerWrapper = null;
        }
        TextView textView = new TextView(context);
        this.leftTextView = textView;
        textView.setTextSize(1, 13.0f);
        textView.setGravity(19);
        textView.setTypeface(AndroidUtilities.bold());
        int i7 = Theme.key_windowBackgroundWhiteBlackText;
        textView.setTextColor(Theme.getColor(i7, this.resourcesProvider));
        if (starGift != null) {
            textView.setText(LocaleController.formatPluralStringComma("Gift2AvailabilityLeft", starGift.availability_remains));
        }
        frameLayout.addView(textView, LayoutHelper.createFrame(-1, -1.0f, 3, 11.0f, 0.0f, 11.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.soldTextView = textView2;
        textView2.setTextSize(1, 13.0f);
        textView2.setGravity(21);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextColor(Theme.getColor(i7, this.resourcesProvider));
        if (starGift != null) {
            textView2.setText(LocaleController.formatPluralStringComma("Gift2AvailabilitySold", starGift.availability_total - starGift.availability_remains));
        }
        frameLayout.addView(textView2, LayoutHelper.createFrame(-1, -1.0f, 5, 11.0f, 0.0f, 11.0f, 0.0f));
        View view2 = new View(context) { // from class: org.telegram.ui.Gifts.SendGiftSheet.5
            @Override // android.view.View
            protected void onMeasure(int i8, int i9) {
                if (starGift == null) {
                    super.onMeasure(i8, i9);
                } else {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) (View.MeasureSpec.getSize(i8) * clamp), TLObject.FLAG_30), i9);
                }
            }
        };
        this.limitProgressView = view2;
        view2.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(6.0f), Theme.getColor(Theme.key_featuredStickers_addButton, this.resourcesProvider)));
        frameLayout.addView(view2, LayoutHelper.createFrame(-1, -1, 119));
        FrameLayout frameLayout3 = new FrameLayout(context) { // from class: org.telegram.ui.Gifts.SendGiftSheet.6
            @Override // android.view.ViewGroup, android.view.View
            protected void dispatchDraw(Canvas canvas) {
                canvas.save();
                canvas.clipRect(0.0f, 0.0f, getWidth() * clamp, getHeight());
                super.dispatchDraw(canvas);
                canvas.restore();
            }
        };
        this.valueContainerView = frameLayout3;
        frameLayout3.setWillNotDraw(false);
        frameLayout.addView(frameLayout3, LayoutHelper.createFrame(-1, -1, 119));
        TextView textView3 = new TextView(context);
        this.leftTextView2 = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setGravity(19);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setTextColor(-1);
        if (starGift != null) {
            textView3.setText(LocaleController.formatPluralStringComma("Gift2AvailabilityLeft", starGift.availability_remains));
        }
        frameLayout3.addView(textView3, LayoutHelper.createFrame(-1, -1.0f, 3, 11.0f, 0.0f, 11.0f, 0.0f));
        TextView textView4 = new TextView(context);
        this.soldTextView2 = textView4;
        textView4.setTextSize(1, 13.0f);
        textView4.setGravity(21);
        textView4.setTypeface(AndroidUtilities.bold());
        textView4.setTextColor(-1);
        if (starGift != null) {
            textView4.setText(LocaleController.formatPluralStringComma("Gift2AvailabilitySold", starGift.availability_total - starGift.availability_remains));
        }
        frameLayout3.addView(textView4, LayoutHelper.createFrame(-1, -1.0f, 5, 11.0f, 0.0f, 11.0f, 0.0f));
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, this.resourcesProvider);
        this.button = buttonWithCounterView;
        buttonWithCounterView.setRound();
        setButtonText(false);
        linearLayout5.addView(buttonWithCounterView, LayoutHelper.createLinear(-1, 48, 119, 10, 10, 10, 10));
        buttonWithCounterView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Gifts.SendGiftSheet$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                SendGiftSheet.$r8$lambda$oJlqL9ApkwUIKqr5l2lPBSJiiT8(SendGiftSheet.this, j, context, runnable, starGift, view3);
            }
        });
        LinearLayoutManager linearLayoutManager = this.layoutManager;
        this.reverseLayout = true;
        linearLayoutManager.setReverseLayout(true);
        this.adapter.update(false);
        this.layoutManager.scrollToPositionWithOffset(this.adapter.getItemCount(), AndroidUtilities.dp(200.0f));
        RecyclerListView recyclerListView = this.recyclerListView;
        int i8 = this.backgroundPaddingLeft;
        recyclerListView.setPadding(i8, 0, i8, AndroidUtilities.dp(68 + ((starGift != null && starGift.limited && this.limitContainerWrapper == null) ? 40 : 0)));
        this.recyclerListView.addItemDecoration(new RecyclerView.ItemDecoration() { // from class: org.telegram.ui.Gifts.SendGiftSheet.7
            final PointF p = new PointF();

            @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
            public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
                float f2;
                float f3;
                float height = recyclerView.getHeight();
                if (ViewPositionWatcher.computeCoordinatesInParent(SendGiftSheet.this.chatView, ((BottomSheetWithRecyclerListView) SendGiftSheet.this).recyclerListView, this.p)) {
                    PointF pointF = this.p;
                    f3 = pointF.x;
                    height = Math.min(height, pointF.y);
                    f2 = Math.max(0.0f, this.p.y + SendGiftSheet.this.chatView.getMeasuredHeight());
                } else {
                    f2 = 0.0f;
                    f3 = 0.0f;
                }
                if (ViewPositionWatcher.computeCoordinatesInParent(SendGiftSheet.this.messageEdit, ((BottomSheetWithRecyclerListView) SendGiftSheet.this).recyclerListView, this.p)) {
                    height = Math.min(height, this.p.y);
                    f2 = Math.max(f2, this.p.y + SendGiftSheet.this.messageEdit.getMeasuredHeight() + AndroidUtilities.dp(12.0f));
                }
                if (height < f2 && SendGiftSheet.this.chatView.backgroundView != null) {
                    float height2 = (f2 - height) / SendGiftSheet.this.chatView.backgroundView.getHeight();
                    canvas.save();
                    canvas.clipRect(0.0f, height, recyclerView.getWidth(), f2);
                    canvas.translate(f3, height);
                    canvas.scale(height2, height2);
                    SendGiftSheet.this.chatView.backgroundView.draw(canvas);
                    canvas.restore();
                }
                super.onDraw(canvas, recyclerView, state);
            }
        });
        this.recyclerListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() { // from class: org.telegram.ui.Gifts.SendGiftSheet$$ExternalSyntheticLambda2
            @Override // org.telegram.ui.Components.RecyclerListView.OnItemClickListener
            public final void onItemClick(View view3, int i9) {
                SendGiftSheet.$r8$lambda$hh4_msf_hjn-FhzoAq65wNt339M(SendGiftSheet.this, z, z2, starGift, giftPremiumBottomSheet$GiftTier, view3, i9);
            }
        });
        this.actionBar.setTitle(getTitle());
    }

    public static /* synthetic */ void $r8$lambda$oJlqL9ApkwUIKqr5l2lPBSJiiT8(final SendGiftSheet sendGiftSheet, long j, Context context, Runnable runnable, TL_stars.StarGift starGift, View view) {
        if (sendGiftSheet.button.isLoading()) {
            return;
        }
        if (sendGiftSheet.auction != null) {
            AuctionBidSheet auctionBidSheet = new AuctionBidSheet(context, sendGiftSheet.resourcesProvider, new AuctionBidSheet.Params(j, sendGiftSheet.anonymous, sendGiftSheet.getMessage()), sendGiftSheet.auction);
            auctionBidSheet.show();
            auctionBidSheet.setCloseParentSheet(runnable);
            AndroidUtilities.hideKeyboard(sendGiftSheet.messageEdit);
            sendGiftSheet.dismiss();
            if (sendGiftSheet.isDismissed) {
                return;
            }
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Gifts.SendGiftSheet$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    SendGiftSheet.this.dismiss();
                }
            }, 500L);
            return;
        }
        sendGiftSheet.button.setLoading(true);
        if (sendGiftSheet.messageEdit.editTextEmoji.getEmojiPadding() > 0) {
            sendGiftSheet.messageEdit.editTextEmoji.hidePopup(true);
        } else if (sendGiftSheet.messageEdit.editTextEmoji.isKeyboardVisible()) {
            sendGiftSheet.messageEdit.editTextEmoji.closeKeyboard();
        }
        if (starGift != null) {
            sendGiftSheet.buyStarGift();
        } else {
            sendGiftSheet.buyPremiumTier();
        }
    }

    public static /* synthetic */ void $r8$lambda$hh4_msf_hjn-FhzoAq65wNt339M(SendGiftSheet sendGiftSheet, boolean z, boolean z2, TL_stars.StarGift starGift, GiftPremiumBottomSheet$GiftTier giftPremiumBottomSheet$GiftTier, View view, int i) {
        UniversalAdapter universalAdapter = sendGiftSheet.adapter;
        if (!sendGiftSheet.reverseLayout) {
            i--;
        }
        UItem item = universalAdapter.getItem(i);
        if (item == null) {
            return;
        }
        int i2 = item.id;
        if (i2 == 1) {
            boolean z3 = !sendGiftSheet.anonymous;
            sendGiftSheet.anonymous = z3;
            TLRPC.MessageAction messageAction = sendGiftSheet.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                ((TLRPC.TL_messageActionStarGift) messageAction).name_hidden = z3;
            }
            sendGiftSheet.messageObject.updateMessageText();
            sendGiftSheet.actionCell.setMessageObject(sendGiftSheet.messageObject, true);
            sendGiftSheet.adapter.update(true);
            return;
        }
        if (i2 == 2) {
            if (z || z2) {
                int i3 = -sendGiftSheet.shakeDp;
                sendGiftSheet.shakeDp = i3;
                AndroidUtilities.shakeViewSpring(view, i3);
                return;
            }
            boolean z4 = sendGiftSheet.upgrade;
            sendGiftSheet.upgrade = !z4;
            TLRPC.MessageAction messageAction2 = sendGiftSheet.action;
            if (messageAction2 instanceof TLRPC.TL_messageActionStarGift) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction2;
                tL_messageActionStarGift.can_upgrade = !z4 || (sendGiftSheet.self && starGift != null && starGift.can_upgrade);
                tL_messageActionStarGift.upgrade_stars = (sendGiftSheet.self || z4) ? 0L : sendGiftSheet.starGift.upgrade_stars;
                tL_messageActionStarGift.convert_stars = z4 ? sendGiftSheet.starGift.convert_stars : 0L;
            }
            sendGiftSheet.messageObject.updateMessageText();
            sendGiftSheet.actionCell.setMessageObject(sendGiftSheet.messageObject, true);
            sendGiftSheet.adapter.update(true);
            sendGiftSheet.setButtonText(true);
            return;
        }
        if (i2 == 3) {
            boolean z5 = sendGiftSheet.useStars;
            sendGiftSheet.useStars = !z5;
            TLRPC.MessageAction messageAction3 = sendGiftSheet.action;
            if (messageAction3 instanceof TLRPC.TL_messageActionGiftPremium) {
                TLRPC.TL_messageActionGiftPremium tL_messageActionGiftPremium = (TLRPC.TL_messageActionGiftPremium) messageAction3;
                if (!z5) {
                    tL_messageActionGiftPremium.currency = "XTR";
                    tL_messageActionGiftPremium.amount = giftPremiumBottomSheet$GiftTier.getStarsPrice();
                } else {
                    tL_messageActionGiftPremium.currency = giftPremiumBottomSheet$GiftTier.getCurrency();
                    long price = giftPremiumBottomSheet$GiftTier.getPrice();
                    tL_messageActionGiftPremium.amount = price;
                    if (giftPremiumBottomSheet$GiftTier.googlePlayProductDetails != null) {
                        tL_messageActionGiftPremium.amount = (long) (price * Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_messageActionGiftPremium.currency) - 6));
                    }
                }
            } else if (messageAction3 instanceof TLRPC.TL_messageActionGiftCode) {
                TLRPC.TL_messageActionGiftCode tL_messageActionGiftCode = (TLRPC.TL_messageActionGiftCode) messageAction3;
                if (!z5) {
                    tL_messageActionGiftCode.currency = "XTR";
                    tL_messageActionGiftCode.amount = giftPremiumBottomSheet$GiftTier.getStarsPrice();
                } else {
                    tL_messageActionGiftCode.currency = giftPremiumBottomSheet$GiftTier.getCurrency();
                    long price2 = giftPremiumBottomSheet$GiftTier.getPrice();
                    tL_messageActionGiftCode.amount = price2;
                    if (giftPremiumBottomSheet$GiftTier.googlePlayProductDetails != null) {
                        tL_messageActionGiftCode.amount = (long) (price2 * Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_messageActionGiftCode.currency) - 6));
                    }
                }
            }
            sendGiftSheet.messageObject.updateMessageText();
            sendGiftSheet.actionCell.setMessageObject(sendGiftSheet.messageObject, true);
            sendGiftSheet.adapter.update(true);
            sendGiftSheet.setButtonText(true);
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.starBalanceUpdated) {
            setButtonText(true);
            UniversalAdapter universalAdapter = this.adapter;
            if (universalAdapter == null || this.premiumTier == null) {
                return;
            }
            universalAdapter.update(true);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starBalanceUpdated);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setButtonText(boolean z) {
        if (this.auction != null) {
            int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
            if (this.auction.isUpcoming(currentTime)) {
                int i = this.auction.gift.auction_start_date - currentTime;
                this.button.setText(LocaleController.getString(R.string.Gift2AuctionPlaceAEarlyBid), z);
                this.button.setSubText(LocaleController.formatString(R.string.Gift2AuctionStartsIn, LocaleController.formatTTLString(i)), z);
                return;
            }
            TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = this.auction.auctionStateActive;
            if (tL_starGiftAuctionState != null) {
                int i2 = tL_starGiftAuctionState.end_date - currentTime;
                this.button.setText(LocaleController.getString(R.string.Gift2AuctionPlaceABid), z);
                this.button.setSubText(LocaleController.formatString(R.string.Gift2AuctionTimeLeft, LocaleController.formatTTLString(i2)), z);
                return;
            } else {
                this.button.setText(LocaleController.getString(R.string.Gift2AuctionPlaceABid), z);
                this.button.setSubText(null, z);
                return;
            }
        }
        if (this.starGift != null) {
            long j = StarsController.getInstance(this.currentAccount).getBalance().amount;
            TL_stars.StarGift starGift = this.starGift;
            long j2 = starGift.stars + (this.upgrade ? starGift.upgrade_stars : 0L) + (TextUtils.isEmpty(this.messageEdit.getText()) ? 0L : this.send_paid_messages_stars);
            this.button.setText(StarsIntroActivity.replaceStars(LocaleController.formatPluralStringComma(this.self ? "Gift2SendSelf" : "Gift2Send", (int) j2), this.cachedStarSpan), z);
            if (StarsController.getInstance(this.currentAccount).balanceAvailable() && j2 > j) {
                this.button.setSubText(LocaleController.formatPluralStringComma("Gift2SendYourBalance", (int) j), z);
                return;
            } else {
                this.button.setSubText(null, z);
                return;
            }
        }
        GiftPremiumBottomSheet$GiftTier giftPremiumBottomSheet$GiftTier = this.premiumTier;
        if (giftPremiumBottomSheet$GiftTier != null) {
            if (this.useStars) {
                this.button.setText(StarsIntroActivity.replaceStars(LocaleController.formatString(R.string.Gift2SendPremiumStars, LocaleController.formatNumber(giftPremiumBottomSheet$GiftTier.getStarsPrice(), ',')), 1.0f, this.cachedStarSpan), z);
                this.cachedStarSpan[0].spaceScaleX = 0.85f;
            } else {
                this.button.setText(new SpannableStringBuilder(LocaleController.formatString(R.string.Gift2SendPremium, this.premiumTier.getFormattedPrice())), z);
            }
            this.button.setSubText(null, z);
        }
    }

    @Override // org.telegram.messenger.GiftAuctionController.OnAuctionUpdateListener
    public void onUpdate(GiftAuctionController.Auction auction) {
        this.auction = auction;
    }

    protected BulletinFactory getParentBulletinFactory() {
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment == null) {
            return null;
        }
        return BulletinFactory.of(safeLastFragment);
    }

    private TLRPC.TL_textWithEntities getMessage() {
        if (MessagesController.getInstance(this.currentAccount).getSendPaidMessagesStars(this.dialogId) > 0) {
            return null;
        }
        TLRPC.MessageAction messageAction = this.action;
        if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
            return ((TLRPC.TL_messageActionStarGift) messageAction).message;
        }
        if (messageAction instanceof TLRPC.TL_messageActionGiftCode) {
            return ((TLRPC.TL_messageActionGiftCode) messageAction).message;
        }
        if (messageAction instanceof TLRPC.TL_messageActionGiftPremium) {
            return ((TLRPC.TL_messageActionGiftPremium) messageAction).message;
        }
        return null;
    }

    private void buyStarGift() {
        StarsController.getInstance(this.currentAccount).buyStarGift(this.starGift, this.anonymous, this.upgrade, this.dialogId, getMessage(), new Utilities.Callback2() { // from class: org.telegram.ui.Gifts.SendGiftSheet$$ExternalSyntheticLambda14
            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                SendGiftSheet.$r8$lambda$dhnddA5Unqoi5MDvSA18YYN-Zw0(SendGiftSheet.this, (Boolean) obj, (String) obj2);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$dhnddA5Unqoi5MDvSA18YYN-Zw0(SendGiftSheet sendGiftSheet, Boolean bool, String str) {
        TL_stars.StarGift starGift;
        sendGiftSheet.getClass();
        if (bool.booleanValue()) {
            Runnable runnable = sendGiftSheet.closeParentSheet;
            if (runnable != null) {
                runnable.run();
            }
            AndroidUtilities.hideKeyboard(sendGiftSheet.messageEdit);
            sendGiftSheet.dismiss();
        } else if ("STARGIFT_USAGE_LIMITED".equalsIgnoreCase(str)) {
            AndroidUtilities.hideKeyboard(sendGiftSheet.messageEdit);
            sendGiftSheet.dismiss();
            StarsController.getInstance(sendGiftSheet.currentAccount).makeStarGiftSoldOut(sendGiftSheet.starGift);
            return;
        } else if ("STARGIFT_USER_USAGE_LIMITED".equalsIgnoreCase(str)) {
            AndroidUtilities.hideKeyboard(sendGiftSheet.messageEdit);
            sendGiftSheet.dismiss();
            BulletinFactory parentBulletinFactory = sendGiftSheet.getParentBulletinFactory();
            if (parentBulletinFactory == null || (starGift = sendGiftSheet.starGift) == null || !starGift.limited_per_user) {
                return;
            }
            parentBulletinFactory.createSimpleMultiBulletin(starGift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2PerUserLimit", sendGiftSheet.starGift.per_user_total))).show();
            return;
        }
        sendGiftSheet.button.setLoading(false);
    }

    @Override // org.telegram.ui.ActionBar.BottomSheet
    public void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        this.recyclerListView.invalidateItemDecorations();
    }

    private void buyPremiumTier() {
        Object obj;
        final TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.dialogId));
        if (user == null) {
            this.button.setLoading(false);
            return;
        }
        if (this.useStars && this.premiumTier.isStarsPaymentAvailable()) {
            obj = this.premiumTier.getStarsOption();
        } else {
            GiftPremiumBottomSheet$GiftTier giftPremiumBottomSheet$GiftTier = this.premiumTier;
            Object obj2 = giftPremiumBottomSheet$GiftTier.giftCodeOption;
            if (obj2 != null) {
                obj = obj2;
            } else {
                obj = giftPremiumBottomSheet$GiftTier.giftOption;
                if (obj == null) {
                    this.button.setLoading(false);
                    return;
                }
            }
        }
        if (obj instanceof TLRPC.TL_premiumGiftCodeOption) {
            TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) obj;
            if ("XTR".equalsIgnoreCase(tL_premiumGiftCodeOption.currency)) {
                StarsController.getInstance(this.currentAccount).buyPremiumGift(this.dialogId, tL_premiumGiftCodeOption, getMessage(), new Utilities.Callback2() { // from class: org.telegram.ui.Gifts.SendGiftSheet$$ExternalSyntheticLambda7
                    @Override // org.telegram.messenger.Utilities.Callback2
                    public final void run(Object obj3, Object obj4) {
                        SendGiftSheet.$r8$lambda$SfLDjl3sTg_yGhizxJ1u2phdFys(SendGiftSheet.this, user, (Boolean) obj3, (String) obj4);
                    }
                });
                return;
            } else {
                BoostRepository.payGiftCode(new ArrayList(Arrays.asList(user)), tL_premiumGiftCodeOption, null, getMessage(), new BaseFragment() { // from class: org.telegram.ui.Gifts.SendGiftSheet.8
                    @Override // org.telegram.ui.ActionBar.BaseFragment
                    public Activity getParentActivity() {
                        Activity ownerActivity = SendGiftSheet.this.getOwnerActivity();
                        if (ownerActivity == null) {
                            ownerActivity = LaunchActivity.instance;
                        }
                        return ownerActivity == null ? AndroidUtilities.findActivity(SendGiftSheet.this.getContext()) : ownerActivity;
                    }

                    @Override // org.telegram.ui.ActionBar.BaseFragment
                    public Theme.ResourcesProvider getResourceProvider() {
                        return ((BottomSheet) SendGiftSheet.this).resourcesProvider;
                    }
                }, new Utilities.Callback() { // from class: org.telegram.ui.Gifts.SendGiftSheet$$ExternalSyntheticLambda8
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj3) {
                        SendGiftSheet.$r8$lambda$CYKjo1KJEEi00nS4T5VNCf8d6VY(SendGiftSheet.this, user, (Void) obj3);
                    }
                }, new Utilities.Callback() { // from class: org.telegram.ui.Gifts.SendGiftSheet$$ExternalSyntheticLambda9
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj3) {
                        BoostDialogs.showToastError(SendGiftSheet.this.getContext(), (TLRPC.TL_error) obj3);
                    }
                });
                return;
            }
        }
        if (obj instanceof TLRPC.TL_premiumGiftOption) {
            TLRPC.TL_premiumGiftOption tL_premiumGiftOption = (TLRPC.TL_premiumGiftOption) obj;
            if ("XTR".equalsIgnoreCase(tL_premiumGiftOption.currency)) {
                StarsController.getInstance(this.currentAccount).buyPremiumGift(this.dialogId, tL_premiumGiftOption, getMessage(), new Utilities.Callback2() { // from class: org.telegram.ui.Gifts.SendGiftSheet$$ExternalSyntheticLambda10
                    @Override // org.telegram.messenger.Utilities.Callback2
                    public final void run(Object obj3, Object obj4) {
                        SendGiftSheet.$r8$lambda$NpB2L-uAlPg-lvYe1t0TPOkAOsE(SendGiftSheet.this, user, (Boolean) obj3, (String) obj4);
                    }
                });
                return;
            }
            if (BuildVars.useInvoiceBilling()) {
                LaunchActivity launchActivity = LaunchActivity.instance;
                if (launchActivity != null) {
                    Uri parse = Uri.parse(tL_premiumGiftOption.bot_url);
                    if (parse.getHost().equals("t.me")) {
                        if (!parse.getPath().startsWith("/$") && !parse.getPath().startsWith("/invoice/")) {
                            launchActivity.setNavigateToPremiumBot(true);
                        } else {
                            launchActivity.setNavigateToPremiumGiftCallback(new Runnable() { // from class: org.telegram.ui.Gifts.SendGiftSheet$$ExternalSyntheticLambda11
                                @Override // java.lang.Runnable
                                public final void run() {
                                    SendGiftSheet.this.onGiftSuccess(false);
                                }
                            });
                        }
                    }
                    Browser.openUrl(launchActivity, this.premiumTier.giftOption.bot_url);
                    dismiss();
                    return;
                }
                return;
            }
            if (!BillingController.getInstance().isReady() || this.premiumTier.googlePlayProductDetails == null) {
                return;
            }
            final TLRPC.TL_inputStorePaymentGiftPremium tL_inputStorePaymentGiftPremium = new TLRPC.TL_inputStorePaymentGiftPremium();
            tL_inputStorePaymentGiftPremium.user_id = MessagesController.getInstance(this.currentAccount).getInputUser(user);
            tL_inputStorePaymentGiftPremium.currency = this.premiumTier.googlePlayProductDetails.getOneTimePurchaseOfferDetails().getPriceCurrencyCode();
            tL_inputStorePaymentGiftPremium.amount = (long) ((r1.getPriceAmountMicros() / Math.pow(10.0d, 6.0d)) * Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_inputStorePaymentGiftPremium.currency)));
            BillingController.getInstance().addResultListener(this.premiumTier.giftOption.store_product, new Consumer() { // from class: org.telegram.ui.Gifts.SendGiftSheet$$ExternalSyntheticLambda12
                @Override // androidx.core.util.Consumer
                public final void accept(Object obj3) {
                    SendGiftSheet.$r8$lambda$CqHN52cAUO2LkQlZAyc2gtKKXkg(SendGiftSheet.this, (BillingResult) obj3);
                }
            });
            final TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
            tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentGiftPremium;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_canPurchaseStore, new RequestDelegate() { // from class: org.telegram.ui.Gifts.SendGiftSheet$$ExternalSyntheticLambda13
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    SendGiftSheet.$r8$lambda$XVcEqs8yap_IzEFK0np8Rbyym2w(SendGiftSheet.this, tL_inputStorePaymentGiftPremium, tL_payments_canPurchaseStore, tLObject, tL_error);
                }
            });
        }
    }

    public static /* synthetic */ void $r8$lambda$SfLDjl3sTg_yGhizxJ1u2phdFys(SendGiftSheet sendGiftSheet, final TLRPC.User user, Boolean bool, String str) {
        sendGiftSheet.getClass();
        if (bool.booleanValue()) {
            Runnable runnable = sendGiftSheet.closeParentSheet;
            if (runnable != null) {
                runnable.run();
            }
            AndroidUtilities.hideKeyboard(sendGiftSheet.messageEdit);
            sendGiftSheet.dismiss();
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Gifts.SendGiftSheet$$ExternalSyntheticLambda18
                @Override // java.lang.Runnable
                public final void run() {
                    PremiumPreviewGiftSentBottomSheet.show(new ArrayList(Arrays.asList(TLRPC.User.this)));
                }
            }, 250L);
        } else if (!TextUtils.isEmpty(str)) {
            BulletinFactory.of(sendGiftSheet.topBulletinContainer, sendGiftSheet.resourcesProvider).createSimpleBulletin(R.raw.error, LocaleController.formatString(R.string.UnknownErrorCode, str)).show();
        }
        sendGiftSheet.button.setLoading(false);
    }

    public static /* synthetic */ void $r8$lambda$CYKjo1KJEEi00nS4T5VNCf8d6VY(SendGiftSheet sendGiftSheet, final TLRPC.User user, Void r6) {
        Runnable runnable = sendGiftSheet.closeParentSheet;
        if (runnable != null) {
            runnable.run();
        }
        sendGiftSheet.dismiss();
        NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationName(NotificationCenter.giftsToUserSent, new Object[0]);
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Gifts.SendGiftSheet$$ExternalSyntheticLambda15
            @Override // java.lang.Runnable
            public final void run() {
                PremiumPreviewGiftSentBottomSheet.show(new ArrayList(Arrays.asList(TLRPC.User.this)));
            }
        }, 250L);
        MessagesController.getInstance(sendGiftSheet.currentAccount).getMainSettings().edit().putBoolean("show_gift_for_" + sendGiftSheet.dialogId, true).putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + sendGiftSheet.dialogId, true).apply();
    }

    public static /* synthetic */ void $r8$lambda$NpB2L-uAlPg-lvYe1t0TPOkAOsE(SendGiftSheet sendGiftSheet, final TLRPC.User user, Boolean bool, String str) {
        sendGiftSheet.getClass();
        if (bool.booleanValue()) {
            Runnable runnable = sendGiftSheet.closeParentSheet;
            if (runnable != null) {
                runnable.run();
            }
            AndroidUtilities.hideKeyboard(sendGiftSheet.messageEdit);
            sendGiftSheet.dismiss();
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Gifts.SendGiftSheet$$ExternalSyntheticLambda17
                @Override // java.lang.Runnable
                public final void run() {
                    PremiumPreviewGiftSentBottomSheet.show(new ArrayList(Arrays.asList(TLRPC.User.this)));
                }
            }, 250L);
        } else if (!TextUtils.isEmpty(str)) {
            BulletinFactory.of(sendGiftSheet.topBulletinContainer, sendGiftSheet.resourcesProvider).createSimpleBulletin(R.raw.error, LocaleController.formatString(R.string.UnknownErrorCode, str)).show();
        }
        sendGiftSheet.button.setLoading(false);
    }

    public static /* synthetic */ void $r8$lambda$CqHN52cAUO2LkQlZAyc2gtKKXkg(final SendGiftSheet sendGiftSheet, BillingResult billingResult) {
        sendGiftSheet.getClass();
        if (billingResult.getResponseCode() == 0) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Gifts.SendGiftSheet$$ExternalSyntheticLambda19
                @Override // java.lang.Runnable
                public final void run() {
                    SendGiftSheet.this.onGiftSuccess(true);
                }
            });
        }
    }

    public static /* synthetic */ void $r8$lambda$XVcEqs8yap_IzEFK0np8Rbyym2w(final SendGiftSheet sendGiftSheet, final TLRPC.TL_inputStorePaymentGiftPremium tL_inputStorePaymentGiftPremium, final TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        sendGiftSheet.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Gifts.SendGiftSheet$$ExternalSyntheticLambda16
            @Override // java.lang.Runnable
            public final void run() {
                SendGiftSheet.$r8$lambda$xLVeke1px54zpWH2PDu-FOP9QBY(SendGiftSheet.this, tLObject, tL_inputStorePaymentGiftPremium, tL_error, tL_payments_canPurchaseStore);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$xLVeke1px54zpWH2PDu-FOP9QBY(SendGiftSheet sendGiftSheet, TLObject tLObject, TLRPC.TL_inputStorePaymentGiftPremium tL_inputStorePaymentGiftPremium, TLRPC.TL_error tL_error, TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore) {
        sendGiftSheet.getClass();
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            BillingController.getInstance().launchBillingFlow(sendGiftSheet.getBaseFragment().getParentActivity(), AccountInstance.getInstance(sendGiftSheet.currentAccount), tL_inputStorePaymentGiftPremium, Collections.singletonList(BillingFlowParams.ProductDetailsParams.newBuilder().setProductDetails(sendGiftSheet.premiumTier.googlePlayProductDetails).build()));
        } else if (tL_error != null) {
            AlertsCreator.processError(sendGiftSheet.currentAccount, tL_error, sendGiftSheet.getBaseFragment(), tL_payments_canPurchaseStore, new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onGiftSuccess(boolean z) {
        int i = 0;
        TLRPC.UserFull userFull = MessagesController.getInstance(this.currentAccount).getUserFull(this.dialogId);
        TLObject userOrChat = MessagesController.getInstance(this.currentAccount).getUserOrChat(this.dialogId);
        if (userFull != null && (userOrChat instanceof TLRPC.User)) {
            TLRPC.User user = (TLRPC.User) userOrChat;
            user.premium = true;
            MessagesController.getInstance(this.currentAccount).putUser(user, true);
            NotificationCenter.getInstance(this.currentAccount).postNotificationName(NotificationCenter.userInfoDidLoad, Long.valueOf(user.id), userFull);
        }
        if (getBaseFragment() != null) {
            ArrayList arrayList = new ArrayList(((LaunchActivity) getBaseFragment().getParentActivity()).getActionBarLayout().getFragmentStack());
            INavigationLayout parentLayout = getBaseFragment().getParentLayout();
            int size = arrayList.size();
            ChatActivity chatActivity = null;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                BaseFragment baseFragment = (BaseFragment) obj;
                if (baseFragment instanceof ChatActivity) {
                    chatActivity = (ChatActivity) baseFragment;
                    if (chatActivity.getDialogId() != this.dialogId) {
                        baseFragment.removeSelfFromStack();
                    }
                } else if (baseFragment instanceof ProfileActivity) {
                    if (z && parentLayout.getLastFragment() == baseFragment) {
                        baseFragment.finishFragment();
                    } else {
                        baseFragment.removeSelfFromStack();
                    }
                }
            }
            if (chatActivity == null || chatActivity.getDialogId() != this.dialogId) {
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", this.dialogId);
                parentLayout.presentFragment(new ChatActivity(bundle), true);
            }
        }
        dismiss();
    }

    @Override // org.telegram.ui.Components.BottomSheetWithRecyclerListView
    protected CharSequence getTitle() {
        return LocaleController.getString(this.self ? R.string.Gift2TitleSelf2 : R.string.Gift2Title);
    }

    @Override // org.telegram.ui.Components.BottomSheetWithRecyclerListView
    protected RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
        UniversalAdapter universalAdapter = new UniversalAdapter(this.recyclerListView, getContext(), this.currentAccount, 0, true, new Utilities.Callback2() { // from class: org.telegram.ui.Gifts.SendGiftSheet$$ExternalSyntheticLambda0
            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                SendGiftSheet.this.fillItems((ArrayList) obj, (UniversalAdapter) obj2);
            }
        }, this.resourcesProvider);
        this.adapter = universalAdapter;
        universalAdapter.setApplyBackground(false);
        return this.adapter;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0140  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void fillItems(ArrayList arrayList, UniversalAdapter universalAdapter) {
        String formatString;
        int i;
        String formatString2;
        CharSequence replaceArrows;
        long sendPaidMessagesStars = MessagesController.getInstance(this.currentAccount).getSendPaidMessagesStars(this.dialogId);
        arrayList.add(UItem.asCustom(-1, this.chatView));
        if (sendPaidMessagesStars <= 0) {
            arrayList.add(UItem.asCustom(-2, this.messageEdit));
            arrayList.add(UItem.asSpace(AndroidUtilities.dp(12.0f)));
        }
        TL_stars.StarGift starGift = this.starGift;
        if (starGift != null) {
            if (starGift.can_upgrade && !this.self) {
                arrayList.add(UItem.asShadow(-3, null));
                arrayList.add(UItem.asCheck(2, StarsIntroActivity.replaceStarsWithPlain(LocaleController.formatString(this.self ? R.string.Gift2UpgradeSelf : R.string.Gift2Upgrade, Integer.valueOf((int) this.starGift.upgrade_stars)), 0.78f)).setChecked(this.upgrade));
                if (this.forceNotUpgrade) {
                    replaceArrows = LocaleController.formatString(this.dialogId < 0 ? R.string.Gift2NoUpgradeChannelForcedInfo : R.string.Gift2NoUpgradeForcedInfo, this.name);
                } else if (this.forceUpgrade) {
                    replaceArrows = LocaleController.formatString(this.dialogId < 0 ? R.string.Gift2UpgradeChannelForcedInfo : R.string.Gift2UpgradeForcedInfo, this.name);
                } else {
                    if (this.self) {
                        formatString2 = LocaleController.getString(R.string.Gift2UpgradeSelfInfo);
                    } else {
                        formatString2 = LocaleController.formatString(this.dialogId >= 0 ? R.string.Gift2UpgradeInfo : R.string.Gift2UpgradeChannelInfo, this.name);
                    }
                    replaceArrows = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(formatString2, new Runnable() { // from class: org.telegram.ui.Gifts.SendGiftSheet$$ExternalSyntheticLambda3
                        @Override // java.lang.Runnable
                        public final void run() {
                            new StarGiftSheet(r0.getContext(), r0.currentAccount, r0.dialogId, r0.resourcesProvider).openAsLearnMore(r0.starGift.id, SendGiftSheet.this.name);
                        }
                    }), true);
                }
                arrayList.add(UItem.asShadow(-5, replaceArrows).setEnabled((this.forceUpgrade || this.forceNotUpgrade) ? false : true));
            } else {
                arrayList.add(UItem.asShadow(-5, null));
            }
            arrayList.add(UItem.asCheck(1, LocaleController.getString(this.self ? R.string.Gift2HideSelf : R.string.Gift2Hide)).setChecked(this.anonymous));
            if (this.self) {
                i = R.string.Gift2HideSelfInfo;
            } else if (this.dialogId < 0) {
                i = R.string.Gift2HideChannelInfo;
            } else {
                formatString = LocaleController.formatString(R.string.Gift2HideInfo, this.name);
                arrayList.add(UItem.asShadow(-6, formatString));
                if (this.limitContainerWrapper != null) {
                    int i2 = this.starGift.gifts_per_round;
                    CharSequence replaceArrows2 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("Gift2AuctionInfoLearnMore2", i2, Integer.valueOf(i2)), new Runnable() { // from class: org.telegram.ui.Gifts.SendGiftSheet$$ExternalSyntheticLambda4
                        @Override // java.lang.Runnable
                        public final void run() {
                            AuctionJoinSheet.showMoreInfo(r0.getContext(), r0.resourcesProvider, SendGiftSheet.this.starGift);
                        }
                    }), true);
                    arrayList.add(UItem.asCustom(-43, this.limitContainerWrapper));
                    arrayList.add(UItem.asShadow(-44, replaceArrows2));
                }
            }
            formatString = LocaleController.getString(i);
            arrayList.add(UItem.asShadow(-6, formatString));
            if (this.limitContainerWrapper != null) {
            }
        } else {
            if (sendPaidMessagesStars <= 0) {
                arrayList.add(UItem.asShadow(-3, LocaleController.formatString(R.string.Gift2MessagePremiumInfo, this.name)));
            }
            GiftPremiumBottomSheet$GiftTier giftPremiumBottomSheet$GiftTier = this.premiumTier;
            if (giftPremiumBottomSheet$GiftTier != null && giftPremiumBottomSheet$GiftTier.isStarsPaymentAvailable()) {
                arrayList.add(UItem.asCheck(3, StarsIntroActivity.replaceStarsWithPlain(LocaleController.formatString(R.string.Gift2MessageStars, Integer.valueOf((int) this.premiumTier.getStarsPrice())), 0.78f)).setChecked(this.useStars));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.formatNumber(StarsController.getInstance(this.currentAccount).getBalance().amount, ','));
                spannableStringBuilder.setSpan(new TypefaceSpan(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
                arrayList.add(UItem.asShadow(-7, TextUtils.concat(StarsIntroActivity.replaceStarsWithPlain(LocaleController.formatSpannable(R.string.Gift2MessageStarsInfo, spannableStringBuilder), 0.66f), " ", AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2MessageStarsInfoLink), new Runnable() { // from class: org.telegram.ui.Gifts.SendGiftSheet$$ExternalSyntheticLambda5
                    @Override // java.lang.Runnable
                    public final void run() {
                        new StarsIntroActivity.StarsOptionsSheet(r0.getContext(), SendGiftSheet.this.resourcesProvider).show();
                    }
                }), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)))));
            }
        }
        if (this.reverseLayout) {
            Collections.reverse(arrayList);
        }
    }

    @Override // org.telegram.ui.ActionBar.BottomSheet, android.app.Dialog
    public void show() {
        EditEmojiTextCell editEmojiTextCell = this.messageEdit;
        if (editEmojiTextCell != null) {
            editEmojiTextCell.editTextEmoji.onResume();
        }
        super.show();
    }

    @Override // org.telegram.ui.ActionBar.BottomSheet, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.BaseFragment.AttachedSheet
    public void dismiss() {
        if (this.messageEdit.editTextEmoji.getEmojiPadding() > 0) {
            this.messageEdit.editTextEmoji.hidePopup(true);
            return;
        }
        if (this.messageEdit.editTextEmoji.isKeyboardVisible()) {
            this.messageEdit.editTextEmoji.closeKeyboard();
            return;
        }
        EditEmojiTextCell editEmojiTextCell = this.messageEdit;
        if (editEmojiTextCell != null) {
            editEmojiTextCell.editTextEmoji.onPause();
        }
        if (this.auction != null) {
            GiftAuctionController.getInstance(this.currentAccount).unsubscribeFromGiftAuction(this.auction.giftId, this);
        }
        this.isDismissed = true;
        super.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.BottomSheet, android.app.Dialog
    public void onBackPressed() {
        if (this.messageEdit.editTextEmoji.getEmojiPadding() > 0) {
            this.messageEdit.editTextEmoji.hidePopup(true);
        } else if (this.messageEdit.editTextEmoji.isKeyboardVisible()) {
            this.messageEdit.editTextEmoji.closeKeyboard();
        } else {
            super.onBackPressed();
        }
    }
}
