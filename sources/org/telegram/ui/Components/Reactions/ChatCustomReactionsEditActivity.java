package org.telegram.ui.Components.Reactions;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.LayoutTransition;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.math.MathUtils;
import com.google.android.exoplayer2.util.Consumer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.AdjustPanLayoutHelper;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.SlideIntChooseView;
import org.telegram.ui.Cells.TextCheckCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Reactions.ChatCustomReactionsEditActivity;
import org.telegram.ui.Components.SectionsScrollView;
import org.telegram.ui.SelectAnimatedEmojiDialog;

/* loaded from: classes5.dex */
public class ChatCustomReactionsEditActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    private UpdateReactionsButton actionButton;
    private FrameLayout actionButtonContainer;
    private ImageView actionButtonContainerGradient;
    private BackSpaceButtonView backSpaceButtonView;
    private TL_stories.TL_premium_boostsStatus boostsStatus;
    private FrameLayout bottomDialogLayout;
    private final long chatId;
    private LinearLayout contentLayout;
    private TLRPC.Chat currentChat;
    private int currentReactionsCount;
    private CustomReactionEditText editText;
    private TextCheckCell enableReactionsCell;
    private final TLRPC.ChatFull info;
    private boolean initialPaid;
    private boolean isPaused;
    private boolean paid;
    private TextCheckCell paidCheckCell;
    private int reactionsCount;
    private SectionsScrollView scrollView;
    private SelectAnimatedEmojiDialog selectAnimatedEmojiDialog;
    private int selectedCustomReactions;
    private SlideIntChooseView slideView;
    private LinearLayout switchLayout;
    private final HashMap selectedEmojisMap = new LinkedHashMap();
    private final List selectedEmojisIds = new ArrayList();
    private final HashMap initialSelectedEmojis = new LinkedHashMap();
    private final List allAvailableReactions = new ArrayList();
    private final int maxReactionsCount = getMessagesController().boostsChannelLevelMax;
    private boolean emojiKeyboardVisible = false;
    private int selectedType = -1;
    private final Runnable checkAfterFastDeleteRunnable = new Runnable() { // from class: org.telegram.ui.Components.Reactions.ChatCustomReactionsEditActivity$$ExternalSyntheticLambda9
        @Override // java.lang.Runnable
        public final void run() {
            ChatCustomReactionsEditActivity.this.checkMaxCustomReactions(false);
        }
    };

    public ChatCustomReactionsEditActivity(long j, TLRPC.ChatFull chatFull) {
        this.chatId = j;
        this.info = chatFull;
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public boolean onFragmentCreate() {
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.chatId));
        this.currentChat = chat;
        if (chat == null) {
            TLRPC.Chat chatSync = MessagesStorage.getInstance(this.currentAccount).getChatSync(this.chatId);
            this.currentChat = chatSync;
            if (chatSync == null) {
                return false;
            }
            getMessagesController().putChat(this.currentChat, true);
        }
        if (this.info == null) {
            return false;
        }
        getMessagesController().getBoostsController().getBoostsStats(-this.chatId, new Consumer() { // from class: org.telegram.ui.Components.Reactions.ChatCustomReactionsEditActivity$$ExternalSyntheticLambda13
            @Override // com.google.android.exoplayer2.util.Consumer
            public final void accept(Object obj) {
                ChatCustomReactionsEditActivity.$r8$lambda$POZ-TsX4le8JLvspVQot4FTX6GM(ChatCustomReactionsEditActivity.this, (TL_stories.TL_premium_boostsStatus) obj);
            }
        });
        getNotificationCenter().addObserver(this, NotificationCenter.reactionsDidLoad);
        this.allAvailableReactions.addAll(getMediaDataController().getEnabledReactionsList());
        NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.stopAllHeavyOperations, 512);
        getNotificationCenter().addObserver(this, NotificationCenter.dialogDeleted);
        return super.onFragmentCreate();
    }

    public static /* synthetic */ void $r8$lambda$POZ-TsX4le8JLvspVQot4FTX6GM(ChatCustomReactionsEditActivity chatCustomReactionsEditActivity, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus) {
        chatCustomReactionsEditActivity.boostsStatus = tL_premium_boostsStatus;
        if (chatCustomReactionsEditActivity.selectedEmojisMap.keySet().equals(chatCustomReactionsEditActivity.initialSelectedEmojis.keySet())) {
            return;
        }
        chatCustomReactionsEditActivity.checkMaxCustomReactions(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x03a4 A[EDGE_INSN: B:49:0x03a4->B:50:0x03a4 BREAK  A[LOOP:1: B:39:0x0355->B:52:0x0355], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0355 A[SYNTHETIC] */
    @Override // org.telegram.ui.ActionBar.BaseFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public View createView(Context context) {
        this.actionBar.setTitle(LocaleController.getString(R.string.Reactions));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        boolean z = true;
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() { // from class: org.telegram.ui.Components.Reactions.ChatCustomReactionsEditActivity.1
            @Override // org.telegram.ui.ActionBar.ActionBar.ActionBarMenuOnItemClick
            public void onItemClick(int i) {
                if (i != -1 || ChatCustomReactionsEditActivity.this.checkChangesBeforeExit(true)) {
                    return;
                }
                ChatCustomReactionsEditActivity.this.finishFragment();
            }
        });
        this.contentLayout = new SectionsScrollView.SectionsLinearLayout(context);
        SectionsScrollView sectionsScrollView = new SectionsScrollView(context, this.contentLayout, this.resourceProvider);
        this.scrollView = sectionsScrollView;
        sectionsScrollView.setFillViewport(true);
        this.actionBar.setAdaptiveBackground(this.scrollView);
        FrameLayout frameLayout = new FrameLayout(context) { // from class: org.telegram.ui.Components.Reactions.ChatCustomReactionsEditActivity.2
            final AdjustPanLayoutHelper adjustPanLayoutHelper = new 1(this);

            class 1 extends AdjustPanLayoutHelper {
                @Override // org.telegram.ui.ActionBar.AdjustPanLayoutHelper
                protected boolean applyTranslation() {
                    return false;
                }

                @Override // org.telegram.ui.ActionBar.AdjustPanLayoutHelper
                protected void onTransitionEnd() {
                }

                1(View view) {
                    super(view);
                }

                @Override // org.telegram.ui.ActionBar.AdjustPanLayoutHelper
                protected void onTransitionStart(final boolean z, int i) {
                    ChatCustomReactionsEditActivity.this.actionButtonContainer.setVisibility(0);
                    ChatCustomReactionsEditActivity.this.actionButtonContainer.animate().alpha(!z ? 1.0f : 0.0f).withEndAction(new Runnable() { // from class: org.telegram.ui.Components.Reactions.ChatCustomReactionsEditActivity$2$1$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            ChatCustomReactionsEditActivity.2.1.$r8$lambda$z0cRhqJZEOP7oUROx3MjUC_dizg(ChatCustomReactionsEditActivity.2.1.this, z);
                        }
                    }).start();
                }

                public static /* synthetic */ void $r8$lambda$z0cRhqJZEOP7oUROx3MjUC_dizg(1 r0, boolean z) {
                    if (z) {
                        ChatCustomReactionsEditActivity.this.actionButtonContainer.setVisibility(4);
                    } else {
                        r0.getClass();
                    }
                }

                @Override // org.telegram.ui.ActionBar.AdjustPanLayoutHelper
                protected void onPanTranslationUpdate(float f, float f2, boolean z) {
                    if (ChatCustomReactionsEditActivity.this.getParentLayout() != null) {
                        ChatCustomReactionsEditActivity.this.getParentLayout().isPreviewOpenAnimationInProgress();
                    }
                }

                @Override // org.telegram.ui.ActionBar.AdjustPanLayoutHelper
                protected boolean heightAnimationEnabled() {
                    return (((BaseFragment) ChatCustomReactionsEditActivity.this).inPreviewMode || AndroidUtilities.isTablet() || ((BaseFragment) ChatCustomReactionsEditActivity.this).inBubbleMode || AndroidUtilities.isInMultiwindow || ChatCustomReactionsEditActivity.this.getParentLayout() == null) ? false : true;
                }
            }

            @Override // android.view.ViewGroup, android.view.View
            protected void onAttachedToWindow() {
                super.onAttachedToWindow();
                this.adjustPanLayoutHelper.onAttach();
            }

            @Override // android.view.ViewGroup, android.view.View
            protected void onDetachedFromWindow() {
                super.onDetachedFromWindow();
                this.adjustPanLayoutHelper.onDetach();
            }
        };
        this.contentLayout.setOrientation(1);
        this.scrollView.addView(this.contentLayout);
        TextCheckCell textCheckCell = new TextCheckCell(context);
        this.enableReactionsCell = textCheckCell;
        textCheckCell.setHeight(56);
        TextCheckCell textCheckCell2 = this.enableReactionsCell;
        textCheckCell2.setBackgroundColor(Theme.getColor(textCheckCell2.isChecked() ? Theme.key_windowBackgroundChecked : Theme.key_windowBackgroundUnchecked));
        this.enableReactionsCell.setTypeface(AndroidUtilities.bold());
        this.enableReactionsCell.setColors(Theme.key_windowBackgroundCheckText, Theme.key_switchTrackBlue, Theme.key_switchTrackBlueChecked, Theme.key_switchTrackBlueThumb, Theme.key_switchTrackBlueThumbChecked);
        this.enableReactionsCell.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.Reactions.ChatCustomReactionsEditActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChatCustomReactionsEditActivity.$r8$lambda$AHE-6gpV7lQiQfO8NX-S8DX9ZMc(ChatCustomReactionsEditActivity.this, view);
            }
        });
        this.contentLayout.addView(this.enableReactionsCell, LayoutHelper.createLinear(-1, -2));
        TextInfoPrivacyCell textInfoPrivacyCell = new TextInfoPrivacyCell(context, 12, this.resourceProvider);
        int i = Theme.key_windowBackgroundWhiteGrayText4;
        textInfoPrivacyCell.setTextColor(Theme.getColor(i));
        textInfoPrivacyCell.setTopPadding(12);
        textInfoPrivacyCell.setBottomPadding(16);
        textInfoPrivacyCell.setText(LocaleController.getString(R.string.ReactionAddEmojiFromAnyPack));
        this.contentLayout.addView(textInfoPrivacyCell, LayoutHelper.createLinear(-1, -2));
        HeaderCell headerCell = new HeaderCell(context);
        headerCell.setText(LocaleController.getString(R.string.AvailableReactions));
        headerCell.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
        headerCell.setTextSize(15.0f);
        headerCell.setTopMargin(14);
        LinearLayout linearLayout = new LinearLayout(context);
        this.switchLayout = linearLayout;
        linearLayout.setOrientation(1);
        this.contentLayout.addView(this.switchLayout, LayoutHelper.createFrame(-1, -2.0f));
        this.switchLayout.addView(headerCell, LayoutHelper.createLinear(-1, -2));
        CustomReactionEditText customReactionEditText = new CustomReactionEditText(context, getResourceProvider(), this.maxReactionsCount) { // from class: org.telegram.ui.Components.Reactions.ChatCustomReactionsEditActivity.3
            @Override // org.telegram.ui.Components.EditTextCaption
            protected void onLineCountChanged(int i2, int i3) {
                if (i3 > i2) {
                    ChatCustomReactionsEditActivity.this.scrollView.smoothScrollBy(0, AndroidUtilities.dp(30.0f));
                }
            }

            @Override // org.telegram.ui.Components.EditTextCaption, android.widget.EditText, android.widget.TextView
            public boolean onTextContextMenuItem(int i2) {
                if (i2 == R.id.menu_delete || i2 == 16908320) {
                    return ChatCustomReactionsEditActivity.this.deleteSelectedEmojis();
                }
                if (i2 == 16908322 || i2 == 16908321) {
                    return false;
                }
                return super.onTextContextMenuItem(i2);
            }
        };
        this.editText = customReactionEditText;
        customReactionEditText.setOnFocused(new Runnable() { // from class: org.telegram.ui.Components.Reactions.ChatCustomReactionsEditActivity$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                ChatCustomReactionsEditActivity.this.showKeyboard();
            }
        });
        this.switchLayout.addView(this.editText, LayoutHelper.createLinear(-1, -2));
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(200L);
        layoutTransition.enableTransitionType(4);
        this.switchLayout.setLayoutTransition(layoutTransition);
        TextInfoPrivacyCell textInfoPrivacyCell2 = new TextInfoPrivacyCell(context, 12, this.resourceProvider);
        textInfoPrivacyCell2.setTextColor(Theme.getColor(i));
        textInfoPrivacyCell2.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ReactionCreateOwnPack), Theme.key_chat_messageLinkIn, 0, new Runnable() { // from class: org.telegram.ui.Components.Reactions.ChatCustomReactionsEditActivity$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                Browser.openUrl(ChatCustomReactionsEditActivity.this.getContext(), "https://t.me/stickers");
            }
        }, getResourceProvider()));
        this.switchLayout.addView(textInfoPrivacyCell2, LayoutHelper.createLinear(-1, -2));
        HeaderCell headerCell2 = new HeaderCell(context, this.resourceProvider);
        headerCell2.setText(LocaleController.getString(R.string.MaximumReactionsHeader));
        this.switchLayout.addView(headerCell2, LayoutHelper.createLinear(-1, -2));
        this.slideView = new SlideIntChooseView(context, this.resourceProvider);
        TLRPC.ChatFull chatFull = this.info;
        if (!(chatFull instanceof TLRPC.TL_chatFull) ? (chatFull.flags2 & 8192) != 0 : (chatFull.flags & 1048576) != 0) {
            int i2 = chatFull.reactions_limit;
            this.reactionsCount = i2;
            this.currentReactionsCount = i2;
        } else {
            int i3 = getMessagesController().reactionsUniqMax;
            this.reactionsCount = i3;
            this.currentReactionsCount = i3;
        }
        this.slideView.set(this.reactionsCount, SlideIntChooseView.Options.make(0, "MaximumReactionsValue", 1, getMessagesController().reactionsUniqMax), new Utilities.Callback() { // from class: org.telegram.ui.Components.Reactions.ChatCustomReactionsEditActivity$$ExternalSyntheticLambda4
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                ChatCustomReactionsEditActivity.$r8$lambda$PhCFVI-WDtAS8gSu2-gN0K4wNPU(ChatCustomReactionsEditActivity.this, (Integer) obj);
            }
        });
        this.switchLayout.addView(this.slideView, LayoutHelper.createLinear(-1, -2));
        TextInfoPrivacyCell textInfoPrivacyCell3 = new TextInfoPrivacyCell(context, 12, this.resourceProvider);
        textInfoPrivacyCell3.setTopPadding(12);
        textInfoPrivacyCell3.setBottomPadding(16);
        textInfoPrivacyCell3.setText(LocaleController.getString(R.string.MaximumReactionsInfo));
        this.switchLayout.addView(textInfoPrivacyCell3, LayoutHelper.createLinear(-1, -2));
        if (this.info.paid_media_allowed) {
            TextCheckCell textCheckCell3 = new TextCheckCell(context);
            this.paidCheckCell = textCheckCell3;
            textCheckCell3.setTextAndCheck(LocaleController.getString(R.string.ChannelEnablePaidReactions), false, false);
            this.switchLayout.addView(this.paidCheckCell, LayoutHelper.createLinear(-1, -2));
            this.paidCheckCell.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.Reactions.ChatCustomReactionsEditActivity$$ExternalSyntheticLambda5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ChatCustomReactionsEditActivity.this.toggleStarsEnabled();
                }
            });
            TextInfoPrivacyCell textInfoPrivacyCell4 = new TextInfoPrivacyCell(context, 12, this.resourceProvider);
            textInfoPrivacyCell4.setTextColor(Theme.getColor(i));
            textInfoPrivacyCell4.setTopPadding(12);
            textInfoPrivacyCell4.setBottomPadding(70);
            textInfoPrivacyCell4.setText(AndroidUtilities.withLearnMore(LocaleController.getString(R.string.ChannelEnablePaidReactionsInfo), new Runnable() { // from class: org.telegram.ui.Components.Reactions.ChatCustomReactionsEditActivity$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    Browser.openUrl(ChatCustomReactionsEditActivity.this.getContext(), LocaleController.getString(R.string.ChannelEnablePaidReactionsInfoLink));
                }
            }));
            this.switchLayout.addView(textInfoPrivacyCell4, LayoutHelper.createLinear(-1, -2));
        } else {
            textInfoPrivacyCell3.setBottomPadding(70);
        }
        this.actionButtonContainer = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        this.actionButtonContainerGradient = imageView;
        imageView.setImageResource(R.drawable.gradient_bottom);
        this.actionButtonContainerGradient.setScaleType(ImageView.ScaleType.FIT_XY);
        ImageView imageView2 = this.actionButtonContainerGradient;
        int i4 = Theme.key_windowBackgroundGray;
        imageView2.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i4, this.resourceProvider), PorterDuff.Mode.SRC_ATOP));
        this.actionButtonContainer.addView(this.actionButtonContainerGradient, LayoutHelper.createFrame(-1, -1, 119));
        UpdateReactionsButton updateReactionsButton = new UpdateReactionsButton(context, getResourceProvider());
        this.actionButton = updateReactionsButton;
        updateReactionsButton.setRound();
        this.actionButton.setDefaultState();
        this.actionButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.Reactions.ChatCustomReactionsEditActivity$$ExternalSyntheticLambda7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChatCustomReactionsEditActivity.$r8$lambda$kQYQp4t6tzhJZmJUdTeWwi96JIM(ChatCustomReactionsEditActivity.this, view);
            }
        });
        frameLayout.addView(this.scrollView);
        frameLayout.addView(this.actionButtonContainer, LayoutHelper.createFrame(-1, 74.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        this.actionButtonContainer.addView(this.actionButton, LayoutHelper.createFrame(-1, 48.0f, 80, 13.0f, 13.0f, 13.0f, 13.0f));
        frameLayout.setBackgroundColor(Theme.getColor(i4));
        FrameLayout frameLayout2 = new FrameLayout(context) { // from class: org.telegram.ui.Components.Reactions.ChatCustomReactionsEditActivity.4
            @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
            protected void onLayout(boolean z2, int i5, int i6, int i7, int i8) {
                super.onLayout(z2, i5, i6, i7, i8);
                if (ChatCustomReactionsEditActivity.this.emojiKeyboardVisible && z2) {
                    ChatCustomReactionsEditActivity.this.actionButtonContainer.setTranslationY(-ChatCustomReactionsEditActivity.this.bottomDialogLayout.getMeasuredHeight());
                    ChatCustomReactionsEditActivity chatCustomReactionsEditActivity = ChatCustomReactionsEditActivity.this;
                    chatCustomReactionsEditActivity.updateScrollViewMarginBottom(chatCustomReactionsEditActivity.bottomDialogLayout.getMeasuredHeight());
                }
            }
        };
        this.bottomDialogLayout = frameLayout2;
        frameLayout2.setVisibility(4);
        frameLayout.addView(this.bottomDialogLayout, LayoutHelper.createFrame(-1, -2, 80));
        TLRPC.ChatFull chatFull2 = this.info;
        TLRPC.ChatReactions chatReactions = chatFull2.available_reactions;
        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            Iterator it = this.allAvailableReactions.iterator();
            int i5 = 0;
            while (it.hasNext()) {
                ReactionsUtils.addReactionToEditText((TLRPC.TL_availableReaction) it.next(), this.selectedEmojisMap, this.selectedEmojisIds, spannableStringBuilder, this.selectAnimatedEmojiDialog, this.editText.getFontMetricsInt());
                i5++;
                if (i5 >= this.maxReactionsCount) {
                    break;
                }
            }
            this.editText.append(spannableStringBuilder);
            setCheckedEnableReactionCell(0, this.paid, false);
        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            ArrayList<TLRPC.Reaction> arrayList = ((TLRPC.TL_chatReactionsSome) chatReactions).reactions;
            int size = arrayList.size();
            int i6 = 0;
            int i7 = 0;
            while (i6 < size) {
                TLRPC.Reaction reaction = arrayList.get(i6);
                i6++;
                TLRPC.Reaction reaction2 = reaction;
                if (reaction2 instanceof TLRPC.TL_reactionEmoji) {
                    TLRPC.TL_availableReaction tL_availableReaction = getMediaDataController().getReactionsMap().get(((TLRPC.TL_reactionEmoji) reaction2).emoticon);
                    if (tL_availableReaction == null) {
                        continue;
                    } else {
                        ReactionsUtils.addReactionToEditText(tL_availableReaction, this.selectedEmojisMap, this.selectedEmojisIds, spannableStringBuilder2, this.selectAnimatedEmojiDialog, this.editText.getFontMetricsInt());
                    }
                } else {
                    if (reaction2 instanceof TLRPC.TL_reactionCustomEmoji) {
                        ReactionsUtils.addReactionToEditText((TLRPC.TL_reactionCustomEmoji) reaction2, this.selectedEmojisMap, this.selectedEmojisIds, spannableStringBuilder2, this.selectAnimatedEmojiDialog, this.editText.getFontMetricsInt());
                    }
                    if (i7 < this.maxReactionsCount) {
                        break;
                    }
                }
                i7++;
                if (i7 < this.maxReactionsCount) {
                }
            }
            this.editText.append(spannableStringBuilder2);
            setCheckedEnableReactionCell(1, this.paid, false);
        } else {
            boolean z2 = chatReactions instanceof TLRPC.TL_chatReactionsNone;
            if (z2 && chatFull2.paid_media_allowed && chatFull2.paid_reactions_available) {
                setCheckedEnableReactionCell(2, this.paid, false);
            } else if (z2) {
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                Iterator it2 = this.allAvailableReactions.iterator();
                int i8 = 0;
                while (it2.hasNext()) {
                    ReactionsUtils.addReactionToEditText((TLRPC.TL_availableReaction) it2.next(), this.selectedEmojisMap, this.selectedEmojisIds, spannableStringBuilder3, this.selectAnimatedEmojiDialog, this.editText.getFontMetricsInt());
                    i8++;
                    if (i8 >= this.maxReactionsCount) {
                        break;
                    }
                }
                this.editText.append(spannableStringBuilder3);
                setCheckedEnableReactionCell(2, this.paid, false);
            }
        }
        TextCheckCell textCheckCell4 = this.enableReactionsCell;
        String string = LocaleController.getString(R.string.EnableReactions);
        if (this.selectedType == 2 && !this.paid) {
            z = false;
        }
        textCheckCell4.setTextAndCheck(string, z, false);
        this.editText.addReactionsSpan();
        TLRPC.ChatFull chatFull3 = this.info;
        if (chatFull3.paid_media_allowed && chatFull3.paid_reactions_available) {
            toggleStarsEnabled();
        }
        this.initialSelectedEmojis.putAll(this.selectedEmojisMap);
        this.initialPaid = this.paid;
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public static /* synthetic */ void $r8$lambda$AHE-6gpV7lQiQfO8NX-S8DX9ZMc(ChatCustomReactionsEditActivity chatCustomReactionsEditActivity, View view) {
        TextCheckCell textCheckCell;
        if (chatCustomReactionsEditActivity.enableReactionsCell.isChecked() && (textCheckCell = chatCustomReactionsEditActivity.paidCheckCell) != null && textCheckCell.isChecked()) {
            chatCustomReactionsEditActivity.toggleStarsEnabled();
        }
        chatCustomReactionsEditActivity.setCheckedEnableReactionCell(chatCustomReactionsEditActivity.enableReactionsCell.isChecked() ? 2 : 1, chatCustomReactionsEditActivity.enableReactionsCell.isChecked() ? false : chatCustomReactionsEditActivity.paid, true);
    }

    public static /* synthetic */ void $r8$lambda$PhCFVI-WDtAS8gSu2-gN0K4wNPU(ChatCustomReactionsEditActivity chatCustomReactionsEditActivity, Integer num) {
        chatCustomReactionsEditActivity.getClass();
        chatCustomReactionsEditActivity.reactionsCount = num.intValue();
    }

    public static /* synthetic */ void $r8$lambda$kQYQp4t6tzhJZmJUdTeWwi96JIM(final ChatCustomReactionsEditActivity chatCustomReactionsEditActivity, View view) {
        if (chatCustomReactionsEditActivity.actionButton.isLoading()) {
            return;
        }
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = chatCustomReactionsEditActivity.boostsStatus;
        if (tL_premium_boostsStatus != null) {
            int i = tL_premium_boostsStatus.level;
            int i2 = chatCustomReactionsEditActivity.selectedCustomReactions;
            if (i < i2) {
                ReactionsUtils.showLimitReachedDialogForReactions(-chatCustomReactionsEditActivity.chatId, i2, tL_premium_boostsStatus);
                return;
            }
        }
        TextCheckCell textCheckCell = chatCustomReactionsEditActivity.paidCheckCell;
        Boolean valueOf = (textCheckCell == null || !chatCustomReactionsEditActivity.info.paid_media_allowed) ? null : Boolean.valueOf(textCheckCell.isChecked());
        chatCustomReactionsEditActivity.actionButton.setLoading(true);
        MessagesController messagesController = chatCustomReactionsEditActivity.getMessagesController();
        long j = chatCustomReactionsEditActivity.chatId;
        int i3 = chatCustomReactionsEditActivity.selectedType;
        List<TLRPC.Reaction> grabReactions = chatCustomReactionsEditActivity.grabReactions(false);
        int i4 = chatCustomReactionsEditActivity.reactionsCount;
        chatCustomReactionsEditActivity.currentReactionsCount = i4;
        messagesController.setCustomChatReactions(j, i3, grabReactions, i4, valueOf, new Utilities.Callback() { // from class: org.telegram.ui.Components.Reactions.ChatCustomReactionsEditActivity$$ExternalSyntheticLambda17
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                ChatCustomReactionsEditActivity.$r8$lambda$m80USuPtTcEqs2cOzQgqYVmyx4E(ChatCustomReactionsEditActivity.this, (TLRPC.TL_error) obj);
            }
        }, new Runnable() { // from class: org.telegram.ui.Components.Reactions.ChatCustomReactionsEditActivity$$ExternalSyntheticLambda18
            @Override // java.lang.Runnable
            public final void run() {
                ChatCustomReactionsEditActivity.this.finishFragment();
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$m80USuPtTcEqs2cOzQgqYVmyx4E(final ChatCustomReactionsEditActivity chatCustomReactionsEditActivity, final TLRPC.TL_error tL_error) {
        if (chatCustomReactionsEditActivity.isFinishing()) {
            return;
        }
        chatCustomReactionsEditActivity.actionButton.setLoading(false);
        if (tL_error.text.equals("CHAT_NOT_MODIFIED")) {
            chatCustomReactionsEditActivity.finishFragment();
        } else {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.Reactions.ChatCustomReactionsEditActivity$$ExternalSyntheticLambda20
                @Override // java.lang.Runnable
                public final void run() {
                    ChatCustomReactionsEditActivity.$r8$lambda$AySnEt7RrsN2eHiBFYPWJS-N-Gg(ChatCustomReactionsEditActivity.this, tL_error);
                }
            }, chatCustomReactionsEditActivity.boostsStatus == null ? 200L : 0L);
        }
    }

    public static /* synthetic */ void $r8$lambda$AySnEt7RrsN2eHiBFYPWJS-N-Gg(ChatCustomReactionsEditActivity chatCustomReactionsEditActivity, TLRPC.TL_error tL_error) {
        if (chatCustomReactionsEditActivity.boostsStatus != null && tL_error.text.equals("BOOSTS_REQUIRED")) {
            ReactionsUtils.showLimitReachedDialogForReactions(-chatCustomReactionsEditActivity.chatId, chatCustomReactionsEditActivity.selectedCustomReactions, chatCustomReactionsEditActivity.boostsStatus);
            return;
        }
        String str = tL_error.text;
        if (str.equals("REACTIONS_TOO_MANY")) {
            str = LocaleController.formatPluralString("ReactionMaxCountError", chatCustomReactionsEditActivity.maxReactionsCount, new Object[0]);
        }
        BulletinFactory.of(chatCustomReactionsEditActivity).createErrorBulletin(str).show();
    }

    private void initSelectAnimatedEmojiDialog() {
        if (this.selectAnimatedEmojiDialog != null) {
            return;
        }
        5 r2 = new 5(this, getContext(), false, null, 6, false, getResourceProvider(), 16, Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, getResourceProvider()));
        this.selectAnimatedEmojiDialog = r2;
        r2.setAnimationsEnabled(false);
        this.selectAnimatedEmojiDialog.setClipChildren(false);
        this.selectAnimatedEmojiDialog.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
        this.bottomDialogLayout.addView(this.selectAnimatedEmojiDialog, LayoutHelper.createFrame(-1, -2, 80));
        BackSpaceButtonView backSpaceButtonView = new BackSpaceButtonView(getContext(), getResourceProvider());
        this.backSpaceButtonView = backSpaceButtonView;
        backSpaceButtonView.setOnBackspace(new Utilities.Callback() { // from class: org.telegram.ui.Components.Reactions.ChatCustomReactionsEditActivity$$ExternalSyntheticLambda15
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                ChatCustomReactionsEditActivity.$r8$lambda$NigpBWauH3zWZVvm_JKFiHW6tsQ(ChatCustomReactionsEditActivity.this, (Boolean) obj);
            }
        });
        this.bottomDialogLayout.addView(this.backSpaceButtonView, LayoutHelper.createFrame(-1, -2.0f, 85, 0.0f, 0.0f, 8.0f, 8.0f));
        Iterator it = this.selectedEmojisIds.iterator();
        while (it.hasNext()) {
            this.selectAnimatedEmojiDialog.setMultiSelected((Long) it.next(), false);
        }
    }

    class 5 extends SelectAnimatedEmojiDialog {
        private boolean firstLayout;

        5(BaseFragment baseFragment, Context context, boolean z, Integer num, int i, boolean z2, Theme.ResourcesProvider resourcesProvider, int i2, int i3) {
            super(baseFragment, context, z, num, i, z2, resourcesProvider, i2, i3);
            this.firstLayout = true;
            setDrawBackground(false);
        }

        @Override // org.telegram.ui.SelectAnimatedEmojiDialog, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            if (this.firstLayout) {
                this.firstLayout = false;
                ChatCustomReactionsEditActivity.this.selectAnimatedEmojiDialog.onShow(null);
            }
        }

        @Override // org.telegram.ui.SelectAnimatedEmojiDialog
        protected void onEmojiSelected(View view, Long l, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
            if (ChatCustomReactionsEditActivity.this.selectedEmojisMap.containsKey(l)) {
                ChatCustomReactionsEditActivity.this.selectedEmojisIds.remove(l);
                final AnimatedEmojiSpan animatedEmojiSpan = (AnimatedEmojiSpan) ChatCustomReactionsEditActivity.this.selectedEmojisMap.remove(l);
                animatedEmojiSpan.setRemoved(new Runnable() { // from class: org.telegram.ui.Components.Reactions.ChatCustomReactionsEditActivity$5$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ChatCustomReactionsEditActivity.5.$r8$lambda$caeh1DVe26QMo7kEMSoIGrj8TFo(ChatCustomReactionsEditActivity.5.this, animatedEmojiSpan);
                    }
                });
                ChatCustomReactionsEditActivity.this.animateChangesInNextRows(animatedEmojiSpan);
                ChatCustomReactionsEditActivity.this.selectAnimatedEmojiDialog.setMultiSelected(l, true);
                ChatCustomReactionsEditActivity.this.checkMaxCustomReactions(false);
                return;
            }
            if (ChatCustomReactionsEditActivity.this.selectedEmojisMap.size() - (ChatCustomReactionsEditActivity.this.selectedEmojisMap.containsKey(-1L) ? 1 : 0) >= ChatCustomReactionsEditActivity.this.maxReactionsCount) {
                BulletinFactory.of(ChatCustomReactionsEditActivity.this).createErrorBulletin(LocaleController.formatPluralString("ReactionMaxCountError", ChatCustomReactionsEditActivity.this.maxReactionsCount, new Object[0])).show();
                return;
            }
            try {
                int editTextSelectionEnd = ChatCustomReactionsEditActivity.this.editText.getEditTextSelectionEnd();
                SpannableString spannableString = new SpannableString("b");
                AnimatedEmojiSpan createAnimatedEmojiSpan = ReactionsUtils.createAnimatedEmojiSpan(document, l, ChatCustomReactionsEditActivity.this.editText.getFontMetricsInt());
                createAnimatedEmojiSpan.cacheType = AnimatedEmojiDrawable.getCacheTypeForEnterView();
                createAnimatedEmojiSpan.setAdded();
                ChatCustomReactionsEditActivity.this.selectedEmojisIds.add(MathUtils.clamp(editTextSelectionEnd, 0, ChatCustomReactionsEditActivity.this.selectedEmojisIds.size()), l);
                ChatCustomReactionsEditActivity.this.selectedEmojisMap.put(l, createAnimatedEmojiSpan);
                spannableString.setSpan(createAnimatedEmojiSpan, 0, spannableString.length(), 33);
                ChatCustomReactionsEditActivity.this.editText.getText().insert(editTextSelectionEnd, spannableString);
                ChatCustomReactionsEditActivity.this.editText.setSelection(editTextSelectionEnd + spannableString.length());
                ChatCustomReactionsEditActivity.this.selectAnimatedEmojiDialog.setMultiSelected(l, true);
                ChatCustomReactionsEditActivity.this.checkMaxCustomReactions(true);
                ChatCustomReactionsEditActivity.this.animateChangesInNextRows(createAnimatedEmojiSpan);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }

        public static /* synthetic */ void $r8$lambda$caeh1DVe26QMo7kEMSoIGrj8TFo(5 r5, AnimatedEmojiSpan animatedEmojiSpan) {
            r5.getClass();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ChatCustomReactionsEditActivity.this.editText.getText());
            for (AnimatedEmojiSpan animatedEmojiSpan2 : (AnimatedEmojiSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), AnimatedEmojiSpan.class)) {
                if (animatedEmojiSpan2 == animatedEmojiSpan) {
                    int editTextSelectionEnd = ChatCustomReactionsEditActivity.this.editText.getEditTextSelectionEnd();
                    int spanEnd = spannableStringBuilder.getSpanEnd(animatedEmojiSpan2);
                    int spanStart = spannableStringBuilder.getSpanStart(animatedEmojiSpan2);
                    ChatCustomReactionsEditActivity.this.editText.getText().delete(spanStart, spanEnd);
                    int i = spanEnd - spanStart;
                    CustomReactionEditText customReactionEditText = ChatCustomReactionsEditActivity.this.editText;
                    if (spanEnd <= editTextSelectionEnd) {
                        editTextSelectionEnd -= i;
                    }
                    customReactionEditText.setSelection(editTextSelectionEnd);
                    return;
                }
            }
        }
    }

    public static /* synthetic */ void $r8$lambda$NigpBWauH3zWZVvm_JKFiHW6tsQ(final ChatCustomReactionsEditActivity chatCustomReactionsEditActivity, Boolean bool) {
        TextCheckCell textCheckCell;
        if (chatCustomReactionsEditActivity.deleteSelectedEmojis()) {
            return;
        }
        final int editTextSelectionEnd = chatCustomReactionsEditActivity.editText.getEditTextSelectionEnd();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(chatCustomReactionsEditActivity.editText.getText());
        for (final AnimatedEmojiSpan animatedEmojiSpan : (AnimatedEmojiSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), AnimatedEmojiSpan.class)) {
            if (spannableStringBuilder.getSpanEnd(animatedEmojiSpan) == editTextSelectionEnd) {
                chatCustomReactionsEditActivity.selectedEmojisMap.remove(Long.valueOf(animatedEmojiSpan.documentId));
                chatCustomReactionsEditActivity.selectedEmojisIds.remove(Long.valueOf(animatedEmojiSpan.documentId));
                chatCustomReactionsEditActivity.selectAnimatedEmojiDialog.unselect(Long.valueOf(animatedEmojiSpan.documentId));
                if (animatedEmojiSpan.documentId == -1 && (textCheckCell = chatCustomReactionsEditActivity.paidCheckCell) != null) {
                    textCheckCell.setChecked(false);
                    chatCustomReactionsEditActivity.editText.setMaxLength(chatCustomReactionsEditActivity.maxReactionsCount);
                }
                if (bool.booleanValue()) {
                    chatCustomReactionsEditActivity.editText.dispatchKeyEvent(new KeyEvent(0, 67));
                    AndroidUtilities.cancelRunOnUIThread(chatCustomReactionsEditActivity.checkAfterFastDeleteRunnable);
                    AndroidUtilities.runOnUIThread(chatCustomReactionsEditActivity.checkAfterFastDeleteRunnable, 350L);
                    return;
                } else {
                    animatedEmojiSpan.setRemoved(new Runnable() { // from class: org.telegram.ui.Components.Reactions.ChatCustomReactionsEditActivity$$ExternalSyntheticLambda19
                        @Override // java.lang.Runnable
                        public final void run() {
                            ChatCustomReactionsEditActivity.$r8$lambda$LuEiPB51fqiMfG3pGL1dWnTm5U4(ChatCustomReactionsEditActivity.this, animatedEmojiSpan, editTextSelectionEnd);
                        }
                    });
                    chatCustomReactionsEditActivity.animateChangesInNextRows(animatedEmojiSpan);
                    chatCustomReactionsEditActivity.checkMaxCustomReactions(false);
                    return;
                }
            }
        }
    }

    public static /* synthetic */ void $r8$lambda$LuEiPB51fqiMfG3pGL1dWnTm5U4(ChatCustomReactionsEditActivity chatCustomReactionsEditActivity, AnimatedEmojiSpan animatedEmojiSpan, int i) {
        Editable text = chatCustomReactionsEditActivity.editText.getText();
        int spanStart = text.getSpanStart(animatedEmojiSpan);
        int spanEnd = text.getSpanEnd(animatedEmojiSpan);
        int i2 = spanEnd - spanStart;
        if (spanStart == -1 || spanEnd == -1) {
            return;
        }
        chatCustomReactionsEditActivity.editText.getText().delete(spanStart, spanEnd);
        CustomReactionEditText customReactionEditText = chatCustomReactionsEditActivity.editText;
        customReactionEditText.setSelection(Math.min(i - i2, customReactionEditText.getText().length()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void animateChangesInNextRows(AnimatedEmojiSpan animatedEmojiSpan) {
        Editable text = this.editText.getText();
        Layout layout = this.editText.getLayout();
        int lineForOffset = layout.getLineForOffset(text.getSpanStart(animatedEmojiSpan)) + 1;
        if (lineForOffset < layout.getLineCount()) {
            AnimatedEmojiSpan[] animatedEmojiSpanArr = (AnimatedEmojiSpan[]) text.getSpans(layout.getLineStart(lineForOffset), text.length(), AnimatedEmojiSpan.class);
            for (AnimatedEmojiSpan animatedEmojiSpan2 : animatedEmojiSpanArr) {
                animatedEmojiSpan2.setAnimateChanges();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean deleteSelectedEmojis() {
        int editTextSelectionEnd = this.editText.getEditTextSelectionEnd();
        int editTextSelectionStart = this.editText.getEditTextSelectionStart();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.editText.getText());
        if (!this.editText.hasSelection()) {
            return false;
        }
        AnimatedEmojiSpan[] animatedEmojiSpanArr = (AnimatedEmojiSpan[]) spannableStringBuilder.getSpans(editTextSelectionStart, editTextSelectionEnd, AnimatedEmojiSpan.class);
        for (AnimatedEmojiSpan animatedEmojiSpan : animatedEmojiSpanArr) {
            this.selectedEmojisMap.remove(Long.valueOf(animatedEmojiSpan.documentId));
            this.selectedEmojisIds.remove(Long.valueOf(animatedEmojiSpan.documentId));
            this.selectAnimatedEmojiDialog.unselect(Long.valueOf(animatedEmojiSpan.documentId));
        }
        this.editText.dispatchKeyEvent(new KeyEvent(0, 67));
        checkMaxCustomReactions(false);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public boolean canBeginSlide() {
        if (checkChangesBeforeExit(true)) {
            return false;
        }
        return super.canBeginSlide();
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public void onTransitionAnimationEnd(boolean z, boolean z2) {
        super.onTransitionAnimationEnd(z, z2);
        if (z && this.selectedType != 2) {
            this.editText.setFocusableInTouchMode(true);
        }
        if (!z || z2) {
            return;
        }
        initSelectAnimatedEmojiDialog();
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.Reactions.ChatCustomReactionsEditActivity$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.startAllHeavyOperations, 512);
            }
        }, 200L);
    }

    private void setCheckedEnableReactionCell(int i, boolean z, boolean z2) {
        if (this.selectedType == i && this.paid == z) {
            return;
        }
        this.paid = z;
        boolean z3 = i == 1 || i == 0 || z;
        this.enableReactionsCell.setChecked(z3);
        int color = Theme.getColor(z3 ? Theme.key_windowBackgroundChecked : Theme.key_windowBackgroundUnchecked);
        if (!z2) {
            this.enableReactionsCell.setBackgroundColor(color);
        } else if (z3) {
            this.enableReactionsCell.setBackgroundColorAnimated(true, color);
        } else {
            this.enableReactionsCell.setBackgroundColorAnimatedReverse(color);
        }
        this.selectedType = i;
        if (i != 1 && i != 0 && !z) {
            if (z2) {
                closeKeyboard();
                this.actionButtonContainer.animate().setListener(null).cancel();
                this.switchLayout.animate().setListener(null).cancel();
                ViewPropertyAnimator duration = this.actionButtonContainer.animate().alpha(0.0f).setDuration(350L);
                CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.DEFAULT;
                duration.setInterpolator(cubicBezierInterpolator).setListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.Components.Reactions.ChatCustomReactionsEditActivity.7
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        ChatCustomReactionsEditActivity.this.actionButtonContainer.setVisibility(4);
                    }
                }).start();
                this.switchLayout.animate().alpha(0.0f).setDuration(350L).setInterpolator(cubicBezierInterpolator).setListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.Components.Reactions.ChatCustomReactionsEditActivity.8
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        ChatCustomReactionsEditActivity.this.editText.setFocusableInTouchMode(false);
                        ChatCustomReactionsEditActivity.this.switchLayout.setVisibility(4);
                    }
                }).start();
                return;
            }
            this.switchLayout.setVisibility(4);
            this.actionButtonContainer.setVisibility(4);
            return;
        }
        this.switchLayout.setVisibility(0);
        this.actionButtonContainer.setVisibility(0);
        if (z2) {
            this.actionButtonContainer.animate().setListener(null).cancel();
            this.switchLayout.animate().setListener(null).cancel();
            ViewPropertyAnimator duration2 = this.switchLayout.animate().alpha(1.0f).setDuration(350L);
            CubicBezierInterpolator cubicBezierInterpolator2 = CubicBezierInterpolator.DEFAULT;
            duration2.setInterpolator(cubicBezierInterpolator2).setListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.Components.Reactions.ChatCustomReactionsEditActivity.6
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    ChatCustomReactionsEditActivity.this.editText.setFocusableInTouchMode(true);
                }
            }).start();
            this.actionButtonContainer.animate().alpha(1.0f).setDuration(350L).setInterpolator(cubicBezierInterpolator2).start();
            if (this.selectedEmojisMap.isEmpty()) {
                this.selectAnimatedEmojiDialog.clearSelectedDocuments();
                this.editText.setText("");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                Iterator it = this.allAvailableReactions.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    ReactionsUtils.addReactionToEditText((TLRPC.TL_availableReaction) it.next(), this.selectedEmojisMap, this.selectedEmojisIds, spannableStringBuilder, this.selectAnimatedEmojiDialog, this.editText.getFontMetricsInt());
                    i2++;
                    if (i2 >= this.maxReactionsCount) {
                        break;
                    }
                }
                this.editText.append(spannableStringBuilder);
                this.editText.addReactionsSpan();
                this.selectAnimatedEmojiDialog.notifyDataSetChanged();
                checkMaxCustomReactions(false);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        AndroidUtilities.cancelRunOnUIThread(this.checkAfterFastDeleteRunnable);
        if (this.selectedType == 2 && this.reactionsCount != this.currentReactionsCount) {
            getMessagesController().setCustomChatReactions(this.chatId, this.selectedType, grabReactions(false), this.reactionsCount, null, null, null);
        }
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public void onResume() {
        super.onResume();
        if (this.isPaused) {
            this.isPaused = false;
            this.editText.setFocusable(true);
            this.editText.setFocusableInTouchMode(true);
            if (this.emojiKeyboardVisible) {
                this.editText.removeReactionsSpan(false);
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.Reactions.ChatCustomReactionsEditActivity$$ExternalSyntheticLambda12
                    @Override // java.lang.Runnable
                    public final void run() {
                        ChatCustomReactionsEditActivity.this.editText.requestFocus();
                    }
                }, 250L);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public void onPause() {
        this.isPaused = true;
        this.editText.setFocusable(false);
        super.onPause();
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public boolean onBackPressed(boolean z) {
        if (this.emojiKeyboardVisible) {
            if (z) {
                closeKeyboard();
            }
            return false;
        }
        if (checkChangesBeforeExit(z)) {
            return false;
        }
        return super.onBackPressed(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean checkChangesBeforeExit(boolean z) {
        boolean z2 = !this.selectedEmojisMap.keySet().equals(this.initialSelectedEmojis.keySet());
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.boostsStatus;
        if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < this.selectedCustomReactions) {
            z2 = false;
        }
        boolean z3 = this.initialPaid == this.paid ? z2 : true;
        if (z && z3) {
            AlertDialog.Builder builder = new AlertDialog.Builder(getContext(), getResourceProvider());
            builder.setTitle(LocaleController.getString("UnsavedChanges", R.string.UnsavedChanges));
            builder.setMessage(LocaleController.getString("ReactionApplyChangesDialog", R.string.ReactionApplyChangesDialog));
            builder.setPositiveButton(LocaleController.getString("ApplyTheme", R.string.ApplyTheme), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.Components.Reactions.ChatCustomReactionsEditActivity$$ExternalSyntheticLambda10
                @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                public final void onClick(AlertDialog alertDialog, int i) {
                    ChatCustomReactionsEditActivity.this.actionButton.performClick();
                }
            });
            builder.setNegativeButton(LocaleController.getString(R.string.Discard), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.Components.Reactions.ChatCustomReactionsEditActivity$$ExternalSyntheticLambda11
                @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                public final void onClick(AlertDialog alertDialog, int i) {
                    ChatCustomReactionsEditActivity.this.finishFragment();
                }
            });
            builder.show();
        }
        return z3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkMaxCustomReactions(boolean z) {
        if (this.boostsStatus == null) {
            return;
        }
        if (this.selectedType == 0) {
            this.selectedType = 1;
        }
        int size = grabReactions(true).size();
        this.selectedCustomReactions = size;
        if (this.boostsStatus.level < size) {
            if (z) {
                BulletinFactory.of(this).createSimpleBulletin(R.raw.chats_infotip, AndroidUtilities.replaceTags(LocaleController.formatPluralString("ReactionReachLvlForReactionShort", size, Integer.valueOf(size)))).show();
            }
            this.actionButton.setLvlRequiredState(this.selectedCustomReactions);
            return;
        }
        this.actionButton.removeLvlRequiredState();
    }

    private List grabReactions(boolean z) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Long l : this.selectedEmojisIds) {
            if (l.longValue() != -1) {
                Iterator it = this.allAvailableReactions.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji = new TLRPC.TL_reactionCustomEmoji();
                        tL_reactionCustomEmoji.document_id = l.longValue();
                        arrayList.add(tL_reactionCustomEmoji);
                        arrayList2.add(tL_reactionCustomEmoji);
                        break;
                    }
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) it.next();
                    if (l.longValue() == tL_availableReaction.activate_animation.id) {
                        TLRPC.TL_reactionEmoji tL_reactionEmoji = new TLRPC.TL_reactionEmoji();
                        tL_reactionEmoji.emoticon = tL_availableReaction.reaction;
                        arrayList.add(tL_reactionEmoji);
                        break;
                    }
                }
            }
        }
        return z ? arrayList2 : arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showKeyboard() {
        if (this.emojiKeyboardVisible) {
            return;
        }
        this.emojiKeyboardVisible = true;
        NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.stopAllHeavyOperations, 512);
        updateScrollViewMarginBottom(this.bottomDialogLayout.getMeasuredHeight());
        this.bottomDialogLayout.setVisibility(0);
        this.bottomDialogLayout.setTranslationY(r0.getMeasuredHeight());
        this.bottomDialogLayout.animate().setListener(null).cancel();
        this.bottomDialogLayout.animate().translationY(0.0f).withLayer().setDuration(350L).setInterpolator(CubicBezierInterpolator.DEFAULT).setUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.Reactions.ChatCustomReactionsEditActivity$$ExternalSyntheticLambda14
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ChatCustomReactionsEditActivity chatCustomReactionsEditActivity = ChatCustomReactionsEditActivity.this;
                chatCustomReactionsEditActivity.actionButtonContainer.setTranslationY((-((Float) valueAnimator.getAnimatedValue()).floatValue()) * chatCustomReactionsEditActivity.bottomDialogLayout.getMeasuredHeight());
            }
        }).setListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.Components.Reactions.ChatCustomReactionsEditActivity.9
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.startAllHeavyOperations, 512);
            }
        }).start();
    }

    private boolean closeKeyboard() {
        if (!this.emojiKeyboardVisible) {
            return false;
        }
        this.emojiKeyboardVisible = false;
        if (isClearFocusNotWorking()) {
            this.switchLayout.setFocusableInTouchMode(true);
            this.switchLayout.requestFocus();
        } else {
            this.editText.clearFocus();
        }
        updateScrollViewMarginBottom(0);
        NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.stopAllHeavyOperations, 512);
        this.bottomDialogLayout.animate().setListener(null).cancel();
        this.bottomDialogLayout.animate().translationY(this.bottomDialogLayout.getMeasuredHeight()).setDuration(350L).withLayer().setInterpolator(CubicBezierInterpolator.DEFAULT).setUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.Reactions.ChatCustomReactionsEditActivity$$ExternalSyntheticLambda8
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ChatCustomReactionsEditActivity chatCustomReactionsEditActivity = ChatCustomReactionsEditActivity.this;
                chatCustomReactionsEditActivity.actionButtonContainer.setTranslationY((-(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue())) * chatCustomReactionsEditActivity.bottomDialogLayout.getMeasuredHeight());
            }
        }).setListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.Components.Reactions.ChatCustomReactionsEditActivity.10
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.startAllHeavyOperations, 512);
                ChatCustomReactionsEditActivity.this.bottomDialogLayout.setVisibility(4);
                if (ChatCustomReactionsEditActivity.this.isClearFocusNotWorking()) {
                    ChatCustomReactionsEditActivity.this.switchLayout.setFocusableInTouchMode(false);
                }
            }
        }).start();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isClearFocusNotWorking() {
        return Build.MODEL.toLowerCase().startsWith("zte") && Build.VERSION.SDK_INT <= 28;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateScrollViewMarginBottom(int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.scrollView.getLayoutParams();
        marginLayoutParams.bottomMargin = i;
        this.scrollView.setLayoutParams(marginLayoutParams);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.dialogDeleted && ((Long) objArr[0]).longValue() == (-this.chatId)) {
            INavigationLayout iNavigationLayout = this.parentLayout;
            if (iNavigationLayout != null && iNavigationLayout.getLastFragment() == this) {
                finishFragment();
            } else {
                removeSelfFromStack();
            }
        }
    }

    public void toggleStarsEnabled() {
        long j = -1;
        if (this.paidCheckCell.isChecked()) {
            this.paidCheckCell.setChecked(false);
            this.selectedEmojisIds.remove((Object) (-1L));
            final AnimatedEmojiSpan animatedEmojiSpan = (AnimatedEmojiSpan) this.selectedEmojisMap.remove(-1L);
            if (animatedEmojiSpan != null) {
                animatedEmojiSpan.setRemoved(new Runnable() { // from class: org.telegram.ui.Components.Reactions.ChatCustomReactionsEditActivity$$ExternalSyntheticLambda16
                    @Override // java.lang.Runnable
                    public final void run() {
                        ChatCustomReactionsEditActivity.$r8$lambda$oKS2dSeSU13cGR6EW5dejJNs4g8(ChatCustomReactionsEditActivity.this, animatedEmojiSpan);
                    }
                });
            }
            animateChangesInNextRows(animatedEmojiSpan);
            this.selectAnimatedEmojiDialog.setMultiSelected(-1L, true);
            checkMaxCustomReactions(false);
            this.editText.setMaxLength(this.maxReactionsCount);
            setCheckedEnableReactionCell(this.selectedType, this.paid, true);
        } else {
            this.paidCheckCell.setChecked(true);
            try {
                this.editText.setMaxLength(this.maxReactionsCount + 1);
                SpannableString spannableString = new SpannableString("b");
                AnimatedEmojiSpan animatedEmojiSpan2 = new AnimatedEmojiSpan(j, null) { // from class: org.telegram.ui.Components.Reactions.ChatCustomReactionsEditActivity.11
                    private final Bitmap bitmap;

                    {
                        Bitmap createBitmap = Bitmap.createBitmap(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), Bitmap.Config.ARGB_8888);
                        this.bitmap = createBitmap;
                        Drawable mutate = ChatCustomReactionsEditActivity.this.getContext().getResources().getDrawable(R.drawable.star_small_inner).mutate();
                        mutate.setBounds(0, 0, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
                        mutate.draw(new Canvas(createBitmap));
                    }

                    @Override // org.telegram.ui.Components.AnimatedEmojiSpan, android.text.style.ReplacementSpan
                    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
                        super.draw(canvas, charSequence, i, i2, f, i3, i4, i5, paint);
                        canvas.save();
                        canvas.translate(f, ((i3 + i5) / 2.0f) - AndroidUtilities.dp(12.0f));
                        float f2 = this.extraScale;
                        canvas.scale(f2, f2, f + AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
                        canvas.drawBitmap(this.bitmap, 0.0f, 0.0f, (Paint) null);
                        canvas.restore();
                    }

                    @Override // org.telegram.ui.Components.AnimatedEmojiSpan, android.text.style.ReplacementSpan
                    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
                        return super.getSize(paint, charSequence, i, i2, fontMetricsInt) + AndroidUtilities.dp(5.0f);
                    }
                };
                animatedEmojiSpan2.cacheType = AnimatedEmojiDrawable.getCacheTypeForEnterView();
                animatedEmojiSpan2.setAdded();
                this.selectedEmojisIds.add(0, -1L);
                this.selectedEmojisMap.put(-1L, animatedEmojiSpan2);
                spannableString.setSpan(animatedEmojiSpan2, 0, spannableString.length(), 33);
                this.editText.getText().insert(0, spannableString);
                this.selectAnimatedEmojiDialog.setMultiSelected(-1L, true);
                checkMaxCustomReactions(true);
                animateChangesInNextRows(animatedEmojiSpan2);
            } catch (Exception e) {
                FileLog.e(e);
            }
            setCheckedEnableReactionCell(this.selectedType, true, true);
        }
        this.editText.updateAnimatedEmoji(true);
    }

    public static /* synthetic */ void $r8$lambda$oKS2dSeSU13cGR6EW5dejJNs4g8(ChatCustomReactionsEditActivity chatCustomReactionsEditActivity, AnimatedEmojiSpan animatedEmojiSpan) {
        chatCustomReactionsEditActivity.getClass();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(chatCustomReactionsEditActivity.editText.getText());
        for (AnimatedEmojiSpan animatedEmojiSpan2 : (AnimatedEmojiSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), AnimatedEmojiSpan.class)) {
            if (animatedEmojiSpan2 == animatedEmojiSpan) {
                int editTextSelectionEnd = chatCustomReactionsEditActivity.editText.getEditTextSelectionEnd();
                int spanEnd = spannableStringBuilder.getSpanEnd(animatedEmojiSpan2);
                int spanStart = spannableStringBuilder.getSpanStart(animatedEmojiSpan2);
                chatCustomReactionsEditActivity.editText.getText().delete(spanStart, spanEnd);
                int i = spanEnd - spanStart;
                CustomReactionEditText customReactionEditText = chatCustomReactionsEditActivity.editText;
                if (spanEnd <= editTextSelectionEnd) {
                    editTextSelectionEnd -= i;
                }
                customReactionEditText.setSelection(editTextSelectionEnd);
                return;
            }
        }
    }
}
