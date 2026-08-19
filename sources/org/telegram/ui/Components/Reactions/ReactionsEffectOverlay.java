package org.telegram.ui.Components.Reactions;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Random;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ChatActionCell;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.Components.ReactionsContainerLayout;
import org.telegram.ui.Components.conference.message.GroupCallMessageCell;
import org.telegram.ui.SelectAnimatedEmojiDialog;

/* loaded from: classes5.dex */
public class ReactionsEffectOverlay {
    public static ReactionsEffectOverlay currentOverlay;
    public static ReactionsEffectOverlay currentShortOverlay;
    private static long lastHapticTime;
    private static int uniqPrefix;
    float animateInProgress;
    float animateOutProgress;
    private final int animationType;
    private View cell;
    private final FrameLayout container;
    private final int currentAccount;
    private ViewGroup decorView;
    private float dismissProgress;
    private boolean dismissed;
    private final AnimationView effectImageView;
    private final AnimationView emojiImageView;
    private final AnimationView emojiStaticImageView;
    private final long groupId;
    private ReactionsContainerLayout.ReactionHolderView holderView;
    boolean isFinished;
    public boolean isStories;
    private float lastDrawnToX;
    private float lastDrawnToY;
    private final int messageId;
    private ReactionsEffectOverlay nextReactionOverlay;
    private final ReactionsLayoutInBubble.VisibleReaction reaction;
    public long startTime;
    public boolean started;
    private boolean useWindow;
    private boolean wasScrolled;
    private WindowManager windowManager;
    public FrameLayout windowView;
    int[] loc = new int[2];
    private SelectAnimatedEmojiDialog.ImageViewEmoji holderView2 = null;
    ArrayList avatars = new ArrayList();

    static /* synthetic */ float access$216(ReactionsEffectOverlay reactionsEffectOverlay, float f) {
        float f2 = reactionsEffectOverlay.dismissProgress + f;
        reactionsEffectOverlay.dismissProgress = f2;
        return f2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0679  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x06b4  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x06d8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x06dc  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x05eb  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02cb  */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v40, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v42 */
    /* JADX WARN: Type inference failed for: r7v49 */
    /* JADX WARN: Type inference failed for: r7v50, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v54 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ReactionsEffectOverlay(Context context, BaseFragment baseFragment, ReactionsContainerLayout reactionsContainerLayout, View view, View view2, float f, float f2, ReactionsLayoutInBubble.VisibleReaction visibleReaction, int i, int i2, boolean z) {
        MessageObject messageObject;
        ReactionsLayoutInBubble.ReactionButton reactionButton;
        Context context2;
        View view3;
        ReactionsLayoutInBubble.ReactionButton reactionButton2;
        long j;
        MessageObject messageObject2;
        int i3;
        ReactionsContainerLayout reactionsContainerLayout2;
        View view4;
        BaseFragment baseFragment2;
        ChatActivity chatActivity;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        int i4;
        float f8;
        float x;
        float y;
        int round;
        int sizeForBigReaction;
        int i5;
        FrameLayout frameLayout;
        AnimationView animationView;
        AnimationView animationView2;
        TLRPC.TL_availableReaction tL_availableReaction;
        int i6;
        int i7;
        int i8;
        ?? r7;
        int i9;
        int i10;
        int i11;
        ?? r72;
        ChatActivity chatActivity2;
        Random random;
        TLRPC.TL_messageReactions tL_messageReactions;
        this.holderView = null;
        this.isStories = z;
        boolean z2 = view instanceof ChatMessageCell;
        if (z2) {
            messageObject = ((ChatMessageCell) view).getMessageObject();
            this.messageId = messageObject.getId();
            this.groupId = messageObject.getGroupId();
        } else if (view instanceof ChatActionCell) {
            messageObject = ((ChatActionCell) view).getMessageObject();
            this.messageId = messageObject.getId();
            this.groupId = 0L;
        } else {
            this.messageId = 0;
            this.groupId = 0L;
            messageObject = null;
        }
        this.reaction = visibleReaction;
        this.animationType = i2;
        this.currentAccount = i;
        this.cell = view;
        if (z2) {
            reactionButton = ((ChatMessageCell) view).getReactionButton(visibleReaction);
        } else {
            reactionButton = view instanceof ChatActionCell ? ((ChatActionCell) view).getReactionButton(visibleReaction) : null;
        }
        if (z && i2 == 2) {
            view3 = view2;
            reactionButton2 = reactionButton;
            j = 0;
            messageObject2 = messageObject;
            reactionsContainerLayout2 = reactionsContainerLayout;
            view4 = view;
            baseFragment2 = baseFragment;
            ReactionsEffectOverlay reactionsEffectOverlay = new ReactionsEffectOverlay(context, baseFragment2, reactionsContainerLayout2, view4, view3, f, f2, visibleReaction, i, 1, true);
            context2 = context;
            i3 = i;
            this.nextReactionOverlay = reactionsEffectOverlay;
            currentShortOverlay = reactionsEffectOverlay;
        } else {
            context2 = context;
            view3 = view2;
            reactionButton2 = reactionButton;
            j = 0;
            messageObject2 = messageObject;
            i3 = i;
            reactionsContainerLayout2 = reactionsContainerLayout;
            view4 = view;
            baseFragment2 = baseFragment;
        }
        ChatActivity chatActivity3 = baseFragment2 instanceof ChatActivity ? (ChatActivity) baseFragment2 : null;
        if (reactionsContainerLayout2 != null) {
            int i12 = 0;
            while (true) {
                if (i12 >= reactionsContainerLayout2.recyclerListView.getChildCount()) {
                    break;
                }
                if ((reactionsContainerLayout2.recyclerListView.getChildAt(i12) instanceof ReactionsContainerLayout.ReactionHolderView) && ((ReactionsContainerLayout.ReactionHolderView) reactionsContainerLayout2.recyclerListView.getChildAt(i12)).currentReaction.equals(this.reaction)) {
                    this.holderView = (ReactionsContainerLayout.ReactionHolderView) reactionsContainerLayout2.recyclerListView.getChildAt(i12);
                    break;
                }
                i12++;
            }
        }
        if (i2 == 1) {
            Random random2 = new Random();
            ArrayList<TLRPC.MessagePeerReaction> arrayList = (messageObject2 == null || (tL_messageReactions = messageObject2.messageOwner.reactions) == null) ? null : tL_messageReactions.recent_reactions;
            if (arrayList != null && chatActivity3 != null && chatActivity3.getDialogId() < j) {
                f3 = 0.8f;
                int i13 = 0;
                while (i13 < arrayList.size()) {
                    if (this.reaction.equals(arrayList.get(i13).reaction) && arrayList.get(i13).unread) {
                        AvatarDrawable avatarDrawable = new AvatarDrawable();
                        ImageReceiver imageReceiver = new ImageReceiver();
                        random = random2;
                        long peerId = MessageObject.getPeerId(arrayList.get(i13).peer_id);
                        if (peerId < j) {
                            TLRPC.Chat chat = MessagesController.getInstance(i3).getChat(Long.valueOf(-peerId));
                            if (chat != null) {
                                avatarDrawable.setInfo(i3, chat);
                                imageReceiver.setForUserOrChat(chat, avatarDrawable);
                                AvatarParticle avatarParticle = new AvatarParticle(this, null);
                                avatarParticle.imageReceiver = imageReceiver;
                                avatarParticle.fromX = 0.5f;
                                avatarParticle.fromY = 0.5f;
                                avatarParticle.jumpY = ((Math.abs(random.nextInt() % 100) / 100.0f) * 0.1f) + 0.3f;
                                avatarParticle.randomScale = ((Math.abs(random.nextInt() % 100) / 100.0f) * 0.4f) + 0.8f;
                                avatarParticle.randomRotation = (Math.abs(random.nextInt() % 100) * 60) / 100.0f;
                                avatarParticle.leftTime = (int) (((Math.abs(random.nextInt() % 100) / 100.0f) * 200.0f) + 400.0f);
                                if (!this.avatars.isEmpty()) {
                                    avatarParticle.toX = ((Math.abs(random.nextInt() % 100) * 0.6f) / 100.0f) + 0.2f;
                                    avatarParticle.toY = (Math.abs(random.nextInt() % 100) * 0.4f) / 100.0f;
                                    chatActivity2 = chatActivity3;
                                } else {
                                    float f9 = 0.0f;
                                    int i14 = 0;
                                    float f10 = 0.0f;
                                    float f11 = 0.0f;
                                    while (i14 < 10) {
                                        float abs = ((Math.abs(random.nextInt() % 100) * 0.6f) / 100.0f) + 0.2f;
                                        float abs2 = ((Math.abs(random.nextInt() % 100) * 0.4f) / 100.0f) + 0.2f;
                                        float f12 = 2.14748365E9f;
                                        ChatActivity chatActivity4 = chatActivity3;
                                        for (int i15 = 0; i15 < this.avatars.size(); i15++) {
                                            float f13 = ((AvatarParticle) this.avatars.get(i15)).toX - abs;
                                            float f14 = ((AvatarParticle) this.avatars.get(i15)).toY - abs2;
                                            float f15 = (f13 * f13) + (f14 * f14);
                                            if (f15 < f12) {
                                                f12 = f15;
                                            }
                                        }
                                        if (f12 > f11) {
                                            f9 = abs;
                                            f11 = f12;
                                            f10 = abs2;
                                        }
                                        i14++;
                                        chatActivity3 = chatActivity4;
                                    }
                                    chatActivity2 = chatActivity3;
                                    avatarParticle.toX = f9;
                                    avatarParticle.toY = f10;
                                }
                                this.avatars.add(avatarParticle);
                            }
                            chatActivity2 = chatActivity3;
                        } else {
                            TLRPC.User user = MessagesController.getInstance(i3).getUser(Long.valueOf(peerId));
                            if (user != null) {
                                avatarDrawable.setInfo(i3, user);
                                imageReceiver.setForUserOrChat(user, avatarDrawable);
                                AvatarParticle avatarParticle2 = new AvatarParticle(this, null);
                                avatarParticle2.imageReceiver = imageReceiver;
                                avatarParticle2.fromX = 0.5f;
                                avatarParticle2.fromY = 0.5f;
                                avatarParticle2.jumpY = ((Math.abs(random.nextInt() % 100) / 100.0f) * 0.1f) + 0.3f;
                                avatarParticle2.randomScale = ((Math.abs(random.nextInt() % 100) / 100.0f) * 0.4f) + 0.8f;
                                avatarParticle2.randomRotation = (Math.abs(random.nextInt() % 100) * 60) / 100.0f;
                                avatarParticle2.leftTime = (int) (((Math.abs(random.nextInt() % 100) / 100.0f) * 200.0f) + 400.0f);
                                if (!this.avatars.isEmpty()) {
                                }
                                this.avatars.add(avatarParticle2);
                            }
                            chatActivity2 = chatActivity3;
                        }
                    } else {
                        chatActivity2 = chatActivity3;
                        random = random2;
                    }
                    i13++;
                    i3 = i;
                    random2 = random;
                    chatActivity3 = chatActivity2;
                }
                chatActivity = chatActivity3;
                ReactionsContainerLayout.ReactionHolderView reactionHolderView = this.holderView;
                boolean z3 = reactionHolderView == null || !(f == 0.0f || f2 == 0.0f);
                if (view3 == null) {
                    view3.getLocationOnScreen(this.loc);
                    int[] iArr = this.loc;
                    x = iArr[0];
                    y = iArr[1];
                    f8 = view3.getWidth() * view3.getScaleX();
                    if (view3 instanceof SelectAnimatedEmojiDialog.ImageViewEmoji) {
                        float f16 = ((SelectAnimatedEmojiDialog.ImageViewEmoji) view3).bigReactionSelectedProgress;
                        if (f16 > 0.0f) {
                            f8 = view3.getWidth() * ((f16 * 2.0f) + 1.0f);
                            x -= (f8 - view3.getWidth()) / 2.0f;
                            y -= f8 - view3.getWidth();
                        }
                    }
                } else if (reactionHolderView != null) {
                    reactionHolderView.getLocationOnScreen(this.loc);
                    x = this.holderView.loopImageView.getX() + this.loc[0];
                    y = this.loc[1] + this.holderView.loopImageView.getY();
                    f8 = this.holderView.getScaleX() * this.holderView.loopImageView.getWidth();
                } else {
                    if (reactionButton2 != null) {
                        view4.getLocationInWindow(this.loc);
                        float f17 = this.loc[0];
                        ImageReceiver imageReceiver2 = reactionButton2.imageReceiver;
                        f4 = f17 + (imageReceiver2 == null ? 0.0f : imageReceiver2.getImageX());
                        float f18 = this.loc[1];
                        ImageReceiver imageReceiver3 = reactionButton2.imageReceiver;
                        f5 = f18 + (imageReceiver3 == null ? 0.0f : imageReceiver3.getImageY());
                        ImageReceiver imageReceiver4 = reactionButton2.imageReceiver;
                        if (imageReceiver4 != null) {
                            f8 = imageReceiver4.getImageHeight();
                            f7 = f4;
                            f6 = f5;
                            i4 = 2;
                            if (i2 == i4) {
                                int dp = AndroidUtilities.dp((z && SharedConfig.deviceIsHigh()) ? 60.0f : 34.0f);
                                sizeForBigReaction = (int) ((dp * 2.0f) / AndroidUtilities.density);
                                round = dp;
                            } else if (i2 != 1) {
                                int dp2 = AndroidUtilities.dp(350.0f);
                                Point point = AndroidUtilities.displaySize;
                                round = Math.round(Math.min(dp2, Math.min(point.x, point.y)) * f3);
                                sizeForBigReaction = sizeForBigReaction();
                            } else if (z) {
                                int dp3 = AndroidUtilities.dp(SharedConfig.deviceIsHigh() ? 240.0f : 140.0f);
                                sizeForBigReaction = SharedConfig.deviceIsHigh() ? (int) ((AndroidUtilities.dp(80.0f) * 2.0f) / AndroidUtilities.density) : sizeForAroundReaction();
                                round = dp3;
                            } else {
                                round = AndroidUtilities.dp(80.0f);
                                sizeForBigReaction = sizeForAroundReaction();
                            }
                            float f19 = f8;
                            i5 = round >> 1;
                            int i16 = sizeForBigReaction >> 1;
                            float f20 = f19 / i5;
                            this.animateInProgress = 0.0f;
                            this.animateOutProgress = 0.0f;
                            frameLayout = new FrameLayout(context2);
                            this.container = frameLayout;
                            int i17 = round;
                            int i18 = sizeForBigReaction;
                            View view5 = view4;
                            MessageObject messageObject3 = messageObject2;
                            this.windowView = new 1(context2, baseFragment, view5, z, messageObject3, chatActivity, i5, i2, z3, f20, f7, f6, visibleReaction);
                            animationView = new AnimationView(context2);
                            this.effectImageView = animationView;
                            animationView2 = new AnimationView(context2);
                            this.emojiImageView = animationView2;
                            AnimationView animationView3 = new AnimationView(context2);
                            this.emojiStaticImageView = animationView3;
                            tL_availableReaction = visibleReaction.emojicon != null ? MediaDataController.getInstance(i).getReactionsMap().get(this.reaction.emojicon) : null;
                            if (tL_availableReaction == null || visibleReaction.documentId != j) {
                                if (tL_availableReaction != null) {
                                    int i19 = 2;
                                    if (i2 != 2) {
                                        if ((i2 == 1 && LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_CHAT)) || i2 == 0) {
                                            TLRPC.Document document = i2 == 1 ? tL_availableReaction.around_animation : tL_availableReaction.effect_animation;
                                            String filterForAroundAnimation = i2 == 1 ? getFilterForAroundAnimation() : i18 + "_" + i18;
                                            ImageReceiver imageReceiver5 = animationView.getImageReceiver();
                                            StringBuilder sb = new StringBuilder();
                                            int i20 = uniqPrefix;
                                            uniqPrefix = i20 + 1;
                                            sb.append(i20);
                                            sb.append("_");
                                            sb.append(this.messageId);
                                            sb.append("_");
                                            imageReceiver5.setUniqKeyPrefix(sb.toString());
                                            animationView.setImage(ImageLocation.getForDocument(document), filterForAroundAnimation, (ImageLocation) null, (String) null, 0, (Object) null);
                                            r72 = 0;
                                            animationView.getImageReceiver().setAutoRepeat(0);
                                            animationView.getImageReceiver().setAllowStartAnimation(false);
                                        } else {
                                            r72 = 0;
                                        }
                                        if (animationView.getImageReceiver().getLottieAnimation() != null) {
                                            animationView.getImageReceiver().getLottieAnimation().setCurrentFrame((int) r72, (boolean) r72);
                                            animationView.getImageReceiver().getLottieAnimation().start();
                                        }
                                        i19 = 2;
                                    }
                                    if (i2 == i19) {
                                        TLRPC.Document document2 = z ? tL_availableReaction.select_animation : tL_availableReaction.appear_animation;
                                        ImageReceiver imageReceiver6 = animationView2.getImageReceiver();
                                        StringBuilder sb2 = new StringBuilder();
                                        int i21 = uniqPrefix;
                                        uniqPrefix = i21 + 1;
                                        sb2.append(i21);
                                        sb2.append("_");
                                        sb2.append(this.messageId);
                                        sb2.append("_");
                                        imageReceiver6.setUniqKeyPrefix(sb2.toString());
                                        animationView2.setImage(ImageLocation.getForDocument(document2), i16 + "_" + i16, (ImageLocation) null, (String) null, 0, (Object) null);
                                    } else if (i2 == 0) {
                                        TLRPC.Document document3 = tL_availableReaction.activate_animation;
                                        ImageReceiver imageReceiver7 = animationView2.getImageReceiver();
                                        StringBuilder sb3 = new StringBuilder();
                                        int i22 = uniqPrefix;
                                        uniqPrefix = i22 + 1;
                                        sb3.append(i22);
                                        sb3.append("_");
                                        sb3.append(this.messageId);
                                        sb3.append("_");
                                        imageReceiver7.setUniqKeyPrefix(sb3.toString());
                                        animationView2.setImage(ImageLocation.getForDocument(document3), i16 + "_" + i16, (ImageLocation) null, (String) null, 0, (Object) null);
                                    }
                                } else {
                                    if (i2 == 0) {
                                        i6 = i;
                                        animationView2.setAnimatedReactionDrawable(new AnimatedEmojiDrawable(1, i6, visibleReaction.documentId));
                                        i7 = 2;
                                    } else {
                                        i6 = i;
                                        i7 = 2;
                                        if (i2 == 2) {
                                            animationView2.setAnimatedReactionDrawable(new AnimatedEmojiDrawable(2, i6, visibleReaction.documentId));
                                        }
                                    }
                                    if (i2 == 0 || i2 == 1) {
                                        AnimatedEmojiDrawable animatedEmojiDrawable = new AnimatedEmojiDrawable(i7, i6, visibleReaction.documentId);
                                        if (messageObject3 != null) {
                                            if (messageObject3.shouldDrawWithoutBackground()) {
                                                i9 = messageObject3.isOutOwner() ? Theme.key_chat_outReactionButtonBackground : Theme.key_chat_inReactionButtonBackground;
                                            } else {
                                                i9 = messageObject3.isOutOwner() ? Theme.key_chat_outReactionButtonTextSelected : Theme.key_chat_inReactionButtonTextSelected;
                                            }
                                            i8 = Theme.getColor(i9, baseFragment != null ? baseFragment.getResourceProvider() : null);
                                        } else {
                                            i8 = -1;
                                        }
                                        animatedEmojiDrawable.setColorFilter(new PorterDuffColorFilter(i8, PorterDuff.Mode.SRC_IN));
                                        boolean z4 = i2 == 0;
                                        animationView.setAnimatedEmojiEffect(AnimatedEmojiEffect.createFrom(animatedEmojiDrawable, z4, !z4));
                                        r7 = 0;
                                        this.windowView.setClipChildren(false);
                                        animationView2.getImageReceiver().setAutoRepeat(r7);
                                        animationView2.getImageReceiver().setAllowStartAnimation(r7);
                                        if (animationView2.getImageReceiver().getLottieAnimation() != null) {
                                            if (i2 == 2) {
                                                animationView2.getImageReceiver().getLottieAnimation().setCurrentFrame(animationView2.getImageReceiver().getLottieAnimation().getFramesCount() - 1, (boolean) r7);
                                            } else {
                                                animationView2.getImageReceiver().getLottieAnimation().setCurrentFrame((int) r7, (boolean) r7);
                                                animationView2.getImageReceiver().getLottieAnimation().start();
                                            }
                                        }
                                        i10 = i17 - i5;
                                        i11 = i10 >> 1;
                                        i10 = i2 == 1 ? i11 : i10;
                                        frameLayout.addView(animationView2);
                                        animationView2.getLayoutParams().width = i5;
                                        animationView2.getLayoutParams().height = i5;
                                        ((FrameLayout.LayoutParams) animationView2.getLayoutParams()).topMargin = i11;
                                        ((FrameLayout.LayoutParams) animationView2.getLayoutParams()).leftMargin = i10;
                                        if (i2 != 1 && !z) {
                                            if (tL_availableReaction != null) {
                                                animationView3.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", null, "webp", tL_availableReaction, 1);
                                            }
                                            frameLayout.addView(animationView3);
                                            animationView3.getLayoutParams().width = i5;
                                            animationView3.getLayoutParams().height = i5;
                                            ((FrameLayout.LayoutParams) animationView3.getLayoutParams()).topMargin = i11;
                                            ((FrameLayout.LayoutParams) animationView3.getLayoutParams()).leftMargin = i10;
                                        }
                                        this.windowView.addView(frameLayout);
                                        frameLayout.getLayoutParams().width = i17;
                                        frameLayout.getLayoutParams().height = i17;
                                        int i23 = -i11;
                                        ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).topMargin = i23;
                                        int i24 = -i10;
                                        ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).leftMargin = i24;
                                        this.windowView.addView(animationView);
                                        animationView.getLayoutParams().width = i17;
                                        animationView.getLayoutParams().height = i17;
                                        animationView.getLayoutParams().width = i17;
                                        animationView.getLayoutParams().height = i17;
                                        ((FrameLayout.LayoutParams) animationView.getLayoutParams()).topMargin = i23;
                                        ((FrameLayout.LayoutParams) animationView.getLayoutParams()).leftMargin = i24;
                                        frameLayout.setPivotX(i10);
                                        frameLayout.setPivotY(i11);
                                    }
                                }
                                r7 = 0;
                                animationView2.getImageReceiver().setAutoRepeat(r7);
                                animationView2.getImageReceiver().setAllowStartAnimation(r7);
                                if (animationView2.getImageReceiver().getLottieAnimation() != null) {
                                }
                                i10 = i17 - i5;
                                i11 = i10 >> 1;
                                if (i2 == 1) {
                                }
                                frameLayout.addView(animationView2);
                                animationView2.getLayoutParams().width = i5;
                                animationView2.getLayoutParams().height = i5;
                                ((FrameLayout.LayoutParams) animationView2.getLayoutParams()).topMargin = i11;
                                ((FrameLayout.LayoutParams) animationView2.getLayoutParams()).leftMargin = i10;
                                if (i2 != 1) {
                                    if (tL_availableReaction != null) {
                                    }
                                    frameLayout.addView(animationView3);
                                    animationView3.getLayoutParams().width = i5;
                                    animationView3.getLayoutParams().height = i5;
                                    ((FrameLayout.LayoutParams) animationView3.getLayoutParams()).topMargin = i11;
                                    ((FrameLayout.LayoutParams) animationView3.getLayoutParams()).leftMargin = i10;
                                }
                                this.windowView.addView(frameLayout);
                                frameLayout.getLayoutParams().width = i17;
                                frameLayout.getLayoutParams().height = i17;
                                int i232 = -i11;
                                ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).topMargin = i232;
                                int i242 = -i10;
                                ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).leftMargin = i242;
                                this.windowView.addView(animationView);
                                animationView.getLayoutParams().width = i17;
                                animationView.getLayoutParams().height = i17;
                                animationView.getLayoutParams().width = i17;
                                animationView.getLayoutParams().height = i17;
                                ((FrameLayout.LayoutParams) animationView.getLayoutParams()).topMargin = i232;
                                ((FrameLayout.LayoutParams) animationView.getLayoutParams()).leftMargin = i242;
                                frameLayout.setPivotX(i10);
                                frameLayout.setPivotY(i11);
                            }
                            this.dismissed = true;
                            return;
                        }
                    } else {
                        if (view4 != null) {
                            ((View) view4.getParent()).getLocationInWindow(this.loc);
                            int[] iArr2 = this.loc;
                            f6 = iArr2[1] + f2 + (view4 instanceof ChatMessageCell ? ((ChatMessageCell) view4).starsPriceTopPadding : 0);
                            f7 = iArr2[0] + f;
                            i4 = 2;
                            f8 = 0.0f;
                            if (i2 == i4) {
                            }
                            float f192 = f8;
                            i5 = round >> 1;
                            int i162 = sizeForBigReaction >> 1;
                            float f202 = f192 / i5;
                            this.animateInProgress = 0.0f;
                            this.animateOutProgress = 0.0f;
                            frameLayout = new FrameLayout(context2);
                            this.container = frameLayout;
                            int i172 = round;
                            int i182 = sizeForBigReaction;
                            View view52 = view4;
                            MessageObject messageObject32 = messageObject2;
                            this.windowView = new 1(context2, baseFragment, view52, z, messageObject32, chatActivity, i5, i2, z3, f202, f7, f6, visibleReaction);
                            animationView = new AnimationView(context2);
                            this.effectImageView = animationView;
                            animationView2 = new AnimationView(context2);
                            this.emojiImageView = animationView2;
                            AnimationView animationView32 = new AnimationView(context2);
                            this.emojiStaticImageView = animationView32;
                            if (visibleReaction.emojicon != null) {
                            }
                            if (tL_availableReaction == null) {
                            }
                            if (tL_availableReaction != null) {
                            }
                            r7 = 0;
                            animationView2.getImageReceiver().setAutoRepeat(r7);
                            animationView2.getImageReceiver().setAllowStartAnimation(r7);
                            if (animationView2.getImageReceiver().getLottieAnimation() != null) {
                            }
                            i10 = i172 - i5;
                            i11 = i10 >> 1;
                            if (i2 == 1) {
                            }
                            frameLayout.addView(animationView2);
                            animationView2.getLayoutParams().width = i5;
                            animationView2.getLayoutParams().height = i5;
                            ((FrameLayout.LayoutParams) animationView2.getLayoutParams()).topMargin = i11;
                            ((FrameLayout.LayoutParams) animationView2.getLayoutParams()).leftMargin = i10;
                            if (i2 != 1) {
                            }
                            this.windowView.addView(frameLayout);
                            frameLayout.getLayoutParams().width = i172;
                            frameLayout.getLayoutParams().height = i172;
                            int i2322 = -i11;
                            ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).topMargin = i2322;
                            int i2422 = -i10;
                            ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).leftMargin = i2422;
                            this.windowView.addView(animationView);
                            animationView.getLayoutParams().width = i172;
                            animationView.getLayoutParams().height = i172;
                            animationView.getLayoutParams().width = i172;
                            animationView.getLayoutParams().height = i172;
                            ((FrameLayout.LayoutParams) animationView.getLayoutParams()).topMargin = i2322;
                            ((FrameLayout.LayoutParams) animationView.getLayoutParams()).leftMargin = i2422;
                            frameLayout.setPivotX(i10);
                            frameLayout.setPivotY(i11);
                        }
                        f4 = f;
                        f5 = f2;
                    }
                    f7 = f4;
                    f6 = f5;
                    i4 = 2;
                    f8 = 0.0f;
                    if (i2 == i4) {
                    }
                    float f1922 = f8;
                    i5 = round >> 1;
                    int i1622 = sizeForBigReaction >> 1;
                    float f2022 = f1922 / i5;
                    this.animateInProgress = 0.0f;
                    this.animateOutProgress = 0.0f;
                    frameLayout = new FrameLayout(context2);
                    this.container = frameLayout;
                    int i1722 = round;
                    int i1822 = sizeForBigReaction;
                    View view522 = view4;
                    MessageObject messageObject322 = messageObject2;
                    this.windowView = new 1(context2, baseFragment, view522, z, messageObject322, chatActivity, i5, i2, z3, f2022, f7, f6, visibleReaction);
                    animationView = new AnimationView(context2);
                    this.effectImageView = animationView;
                    animationView2 = new AnimationView(context2);
                    this.emojiImageView = animationView2;
                    AnimationView animationView322 = new AnimationView(context2);
                    this.emojiStaticImageView = animationView322;
                    if (visibleReaction.emojicon != null) {
                    }
                    if (tL_availableReaction == null) {
                    }
                    if (tL_availableReaction != null) {
                    }
                    r7 = 0;
                    animationView2.getImageReceiver().setAutoRepeat(r7);
                    animationView2.getImageReceiver().setAllowStartAnimation(r7);
                    if (animationView2.getImageReceiver().getLottieAnimation() != null) {
                    }
                    i10 = i1722 - i5;
                    i11 = i10 >> 1;
                    if (i2 == 1) {
                    }
                    frameLayout.addView(animationView2);
                    animationView2.getLayoutParams().width = i5;
                    animationView2.getLayoutParams().height = i5;
                    ((FrameLayout.LayoutParams) animationView2.getLayoutParams()).topMargin = i11;
                    ((FrameLayout.LayoutParams) animationView2.getLayoutParams()).leftMargin = i10;
                    if (i2 != 1) {
                    }
                    this.windowView.addView(frameLayout);
                    frameLayout.getLayoutParams().width = i1722;
                    frameLayout.getLayoutParams().height = i1722;
                    int i23222 = -i11;
                    ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).topMargin = i23222;
                    int i24222 = -i10;
                    ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).leftMargin = i24222;
                    this.windowView.addView(animationView);
                    animationView.getLayoutParams().width = i1722;
                    animationView.getLayoutParams().height = i1722;
                    animationView.getLayoutParams().width = i1722;
                    animationView.getLayoutParams().height = i1722;
                    ((FrameLayout.LayoutParams) animationView.getLayoutParams()).topMargin = i23222;
                    ((FrameLayout.LayoutParams) animationView.getLayoutParams()).leftMargin = i24222;
                    frameLayout.setPivotX(i10);
                    frameLayout.setPivotY(i11);
                }
                f6 = y;
                f7 = x;
                i4 = 2;
                if (i2 == i4) {
                }
                float f19222 = f8;
                i5 = round >> 1;
                int i16222 = sizeForBigReaction >> 1;
                float f20222 = f19222 / i5;
                this.animateInProgress = 0.0f;
                this.animateOutProgress = 0.0f;
                frameLayout = new FrameLayout(context2);
                this.container = frameLayout;
                int i17222 = round;
                int i18222 = sizeForBigReaction;
                View view5222 = view4;
                MessageObject messageObject3222 = messageObject2;
                this.windowView = new 1(context2, baseFragment, view5222, z, messageObject3222, chatActivity, i5, i2, z3, f20222, f7, f6, visibleReaction);
                animationView = new AnimationView(context2);
                this.effectImageView = animationView;
                animationView2 = new AnimationView(context2);
                this.emojiImageView = animationView2;
                AnimationView animationView3222 = new AnimationView(context2);
                this.emojiStaticImageView = animationView3222;
                if (visibleReaction.emojicon != null) {
                }
                if (tL_availableReaction == null) {
                }
                if (tL_availableReaction != null) {
                }
                r7 = 0;
                animationView2.getImageReceiver().setAutoRepeat(r7);
                animationView2.getImageReceiver().setAllowStartAnimation(r7);
                if (animationView2.getImageReceiver().getLottieAnimation() != null) {
                }
                i10 = i17222 - i5;
                i11 = i10 >> 1;
                if (i2 == 1) {
                }
                frameLayout.addView(animationView2);
                animationView2.getLayoutParams().width = i5;
                animationView2.getLayoutParams().height = i5;
                ((FrameLayout.LayoutParams) animationView2.getLayoutParams()).topMargin = i11;
                ((FrameLayout.LayoutParams) animationView2.getLayoutParams()).leftMargin = i10;
                if (i2 != 1) {
                }
                this.windowView.addView(frameLayout);
                frameLayout.getLayoutParams().width = i17222;
                frameLayout.getLayoutParams().height = i17222;
                int i232222 = -i11;
                ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).topMargin = i232222;
                int i242222 = -i10;
                ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).leftMargin = i242222;
                this.windowView.addView(animationView);
                animationView.getLayoutParams().width = i17222;
                animationView.getLayoutParams().height = i17222;
                animationView.getLayoutParams().width = i17222;
                animationView.getLayoutParams().height = i17222;
                ((FrameLayout.LayoutParams) animationView.getLayoutParams()).topMargin = i232222;
                ((FrameLayout.LayoutParams) animationView.getLayoutParams()).leftMargin = i242222;
                frameLayout.setPivotX(i10);
                frameLayout.setPivotY(i11);
            }
        }
        chatActivity = chatActivity3;
        f3 = 0.8f;
        ReactionsContainerLayout.ReactionHolderView reactionHolderView2 = this.holderView;
        if (reactionHolderView2 == null) {
        }
        if (view3 == null) {
        }
        f6 = y;
        f7 = x;
        i4 = 2;
        if (i2 == i4) {
        }
        float f192222 = f8;
        i5 = round >> 1;
        int i162222 = sizeForBigReaction >> 1;
        float f202222 = f192222 / i5;
        this.animateInProgress = 0.0f;
        this.animateOutProgress = 0.0f;
        frameLayout = new FrameLayout(context2);
        this.container = frameLayout;
        int i172222 = round;
        int i182222 = sizeForBigReaction;
        View view52222 = view4;
        MessageObject messageObject32222 = messageObject2;
        this.windowView = new 1(context2, baseFragment, view52222, z, messageObject32222, chatActivity, i5, i2, z3, f202222, f7, f6, visibleReaction);
        animationView = new AnimationView(context2);
        this.effectImageView = animationView;
        animationView2 = new AnimationView(context2);
        this.emojiImageView = animationView2;
        AnimationView animationView32222 = new AnimationView(context2);
        this.emojiStaticImageView = animationView32222;
        if (visibleReaction.emojicon != null) {
        }
        if (tL_availableReaction == null) {
        }
        if (tL_availableReaction != null) {
        }
        r7 = 0;
        animationView2.getImageReceiver().setAutoRepeat(r7);
        animationView2.getImageReceiver().setAllowStartAnimation(r7);
        if (animationView2.getImageReceiver().getLottieAnimation() != null) {
        }
        i10 = i172222 - i5;
        i11 = i10 >> 1;
        if (i2 == 1) {
        }
        frameLayout.addView(animationView2);
        animationView2.getLayoutParams().width = i5;
        animationView2.getLayoutParams().height = i5;
        ((FrameLayout.LayoutParams) animationView2.getLayoutParams()).topMargin = i11;
        ((FrameLayout.LayoutParams) animationView2.getLayoutParams()).leftMargin = i10;
        if (i2 != 1) {
        }
        this.windowView.addView(frameLayout);
        frameLayout.getLayoutParams().width = i172222;
        frameLayout.getLayoutParams().height = i172222;
        int i2322222 = -i11;
        ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).topMargin = i2322222;
        int i2422222 = -i10;
        ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).leftMargin = i2422222;
        this.windowView.addView(animationView);
        animationView.getLayoutParams().width = i172222;
        animationView.getLayoutParams().height = i172222;
        animationView.getLayoutParams().width = i172222;
        animationView.getLayoutParams().height = i172222;
        ((FrameLayout.LayoutParams) animationView.getLayoutParams()).topMargin = i2322222;
        ((FrameLayout.LayoutParams) animationView.getLayoutParams()).leftMargin = i2422222;
        frameLayout.setPivotX(i10);
        frameLayout.setPivotY(i11);
    }

    class 1 extends FrameLayout {
        final /* synthetic */ int val$animationType;
        final /* synthetic */ View val$cell;
        final /* synthetic */ ChatActivity val$chatActivity;
        final /* synthetic */ int val$emojiSize;
        final /* synthetic */ BaseFragment val$fragment;
        final /* synthetic */ boolean val$fromHolder;
        final /* synthetic */ float val$fromScale;
        final /* synthetic */ float val$fromX;
        final /* synthetic */ float val$fromY;
        final /* synthetic */ boolean val$isStories;
        final /* synthetic */ MessageObject val$messageObject;
        final /* synthetic */ ReactionsLayoutInBubble.VisibleReaction val$visibleReaction;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        1(Context context, BaseFragment baseFragment, View view, boolean z, MessageObject messageObject, ChatActivity chatActivity, int i, int i2, boolean z2, float f, float f2, float f3, ReactionsLayoutInBubble.VisibleReaction visibleReaction) {
            super(context);
            this.val$fragment = baseFragment;
            this.val$cell = view;
            this.val$isStories = z;
            this.val$messageObject = messageObject;
            this.val$chatActivity = chatActivity;
            this.val$emojiSize = i;
            this.val$animationType = i2;
            this.val$fromHolder = z2;
            this.val$fromScale = f;
            this.val$fromX = f2;
            this.val$fromY = f3;
            this.val$visibleReaction = visibleReaction;
        }

        /* JADX WARN: Code restructure failed: missing block: B:126:0x03db, code lost:
        
            if ((java.lang.System.currentTimeMillis() - r22.this$0.startTime) <= 2000) goto L173;
         */
        /* JADX WARN: Code restructure failed: missing block: B:191:0x05ba, code lost:
        
            if (((int) (r7 - ((r22.this$0.effectImageView.getImageReceiver().getLottieAnimation().getCurrentFrame() / r22.this$0.effectImageView.getImageReceiver().getLottieAnimation().getFramesCount()) * r7))) < r4.leftTime) goto L248;
         */
        /* JADX WARN: Code restructure failed: missing block: B:234:0x0413, code lost:
        
            if (r22.this$0.effectImageView.getImageReceiver().getLottieAnimation().isRunning() == false) goto L185;
         */
        /* JADX WARN: Code restructure failed: missing block: B:238:0x0428, code lost:
        
            if ((java.lang.System.currentTimeMillis() - r22.this$0.startTime) > 2000) goto L185;
         */
        /* JADX WARN: Removed duplicated region for block: B:129:0x0434  */
        /* JADX WARN: Removed duplicated region for block: B:181:0x0543  */
        /* JADX WARN: Removed duplicated region for block: B:186:0x0566  */
        /* JADX WARN: Removed duplicated region for block: B:243:0x035d  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0128  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x0136  */
        /* JADX WARN: Removed duplicated region for block: B:92:0x02e5  */
        @Override // android.view.ViewGroup, android.view.View
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        protected void dispatchDraw(Canvas canvas) {
            View view;
            int dp;
            float f;
            float f2;
            float f3;
            float f4;
            float f5;
            float f6;
            float f7;
            float f8;
            float f9;
            float f10;
            float f11;
            int i;
            float f12;
            float f13;
            float f14;
            ReactionsLayoutInBubble.ReactionButton reactionButton;
            int paddingTop;
            ChatActivity chatActivity;
            if (ReactionsEffectOverlay.this.dismissed) {
                if (ReactionsEffectOverlay.this.dismissProgress != 1.0f) {
                    ReactionsEffectOverlay.access$216(ReactionsEffectOverlay.this, 0.10666667f);
                    if (ReactionsEffectOverlay.this.dismissProgress > 1.0f) {
                        ReactionsEffectOverlay.this.dismissProgress = 1.0f;
                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.Reactions.ReactionsEffectOverlay$1$$ExternalSyntheticLambda0
                            @Override // java.lang.Runnable
                            public final void run() {
                                ReactionsEffectOverlay.this.removeCurrentView();
                            }
                        });
                    }
                }
                if (ReactionsEffectOverlay.this.dismissProgress != 1.0f) {
                    setAlpha(1.0f - ReactionsEffectOverlay.this.dismissProgress);
                    super.dispatchDraw(canvas);
                }
                invalidate();
                return;
            }
            ReactionsEffectOverlay reactionsEffectOverlay = ReactionsEffectOverlay.this;
            if (reactionsEffectOverlay.started) {
                if (reactionsEffectOverlay.holderView != null) {
                    ReactionsEffectOverlay.this.holderView.enterImageView.setAlpha(0.0f);
                    ReactionsEffectOverlay.this.holderView.pressedBackupImageView.setAlpha(0.0f);
                }
                BaseFragment baseFragment = this.val$fragment;
                if (baseFragment instanceof ChatActivity) {
                    view = ((ChatActivity) baseFragment).findCell(ReactionsEffectOverlay.this.messageId, false);
                } else {
                    view = this.val$cell;
                }
                if (this.val$isStories) {
                    dp = AndroidUtilities.dp(SharedConfig.deviceIsHigh() ? 120.0f : 50.0f);
                } else {
                    MessageObject messageObject = this.val$messageObject;
                    if (messageObject != null && messageObject.shouldDrawReactionsInLayout()) {
                        dp = AndroidUtilities.dp(20.0f);
                    } else {
                        dp = AndroidUtilities.dp(14.0f);
                    }
                }
                float f15 = dp;
                if (view != null) {
                    view.getLocationInWindow(ReactionsEffectOverlay.this.loc);
                    ReactionsEffectOverlay reactionsEffectOverlay2 = ReactionsEffectOverlay.this;
                    int[] iArr = reactionsEffectOverlay2.loc;
                    f2 = iArr[0];
                    f3 = iArr[1];
                    if (view instanceof ChatMessageCell) {
                        ChatMessageCell chatMessageCell = (ChatMessageCell) view;
                        reactionButton = chatMessageCell.getReactionButton(reactionsEffectOverlay2.reaction);
                        f = 0.10666667f;
                        if (chatMessageCell.drawPinnedBottom && !chatMessageCell.shouldDrawTimeOnMedia()) {
                            f3 += AndroidUtilities.dp(2.0f);
                        }
                        paddingTop = chatMessageCell.getPaddingTop();
                    } else {
                        f = 0.10666667f;
                        if (view instanceof ChatActionCell) {
                            reactionButton = ((ChatActionCell) view).getReactionButton(reactionsEffectOverlay2.reaction);
                            paddingTop = view.getPaddingTop();
                        } else {
                            if (view instanceof GroupCallMessageCell) {
                                f2 += ((GroupCallMessageCell) view).getReactionCenterX();
                                f3 += view.getMeasuredHeight() / 2.0f;
                            }
                            reactionButton = null;
                            if (reactionButton != null) {
                                Rect rect = reactionButton.drawingImageRect;
                                f2 += rect.left;
                                f3 += rect.top;
                            }
                            chatActivity = this.val$chatActivity;
                            if (chatActivity != null) {
                                f3 += chatActivity.drawingChatListViewYoffset;
                            }
                            ReactionsEffectOverlay.this.lastDrawnToX = f2;
                            ReactionsEffectOverlay.this.lastDrawnToY = f3;
                        }
                    }
                    f3 += paddingTop;
                    if (reactionButton != null) {
                    }
                    chatActivity = this.val$chatActivity;
                    if (chatActivity != null) {
                    }
                    ReactionsEffectOverlay.this.lastDrawnToX = f2;
                    ReactionsEffectOverlay.this.lastDrawnToY = f3;
                } else {
                    f = 0.10666667f;
                    if (!this.val$isStories) {
                        f2 = ReactionsEffectOverlay.this.lastDrawnToX;
                        f3 = ReactionsEffectOverlay.this.lastDrawnToY;
                    } else {
                        float f16 = f15 / 2.0f;
                        f2 = (getMeasuredWidth() / 2.0f) - f16;
                        f3 = (getMeasuredHeight() / 2.0f) - f16;
                    }
                }
                BaseFragment baseFragment2 = this.val$fragment;
                if (baseFragment2 != null && baseFragment2.getParentActivity() != null && this.val$fragment.getFragmentView() != null && this.val$fragment.getFragmentView().getParent() != null && this.val$fragment.getFragmentView().getVisibility() == 0 && this.val$fragment.getFragmentView() != null) {
                    this.val$fragment.getFragmentView().getLocationOnScreen(ReactionsEffectOverlay.this.loc);
                    setAlpha(((View) this.val$fragment.getFragmentView().getParent()).getAlpha());
                } else if (!this.val$isStories && !(view instanceof GroupCallMessageCell)) {
                    return;
                }
                if (view instanceof GroupCallMessageCell) {
                    f4 = this.val$emojiSize;
                } else {
                    f4 = this.val$emojiSize - f15;
                }
                float f17 = f4 / 2.0f;
                float f18 = f2 - f17;
                float f19 = f3 - f17;
                if (this.val$isStories && this.val$animationType == 0) {
                    f18 += AndroidUtilities.dp(40.0f);
                }
                if (this.val$animationType != 1 && !this.val$isStories) {
                    float f20 = ReactionsEffectOverlay.this.loc[0];
                    if (f18 < f20) {
                        f18 = f20;
                    }
                    if (this.val$emojiSize + f18 > r12 + getMeasuredWidth()) {
                        f18 = (ReactionsEffectOverlay.this.loc[0] + getMeasuredWidth()) - this.val$emojiSize;
                    }
                }
                CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.DEFAULT;
                float interpolation = cubicBezierInterpolator.getInterpolation(ReactionsEffectOverlay.this.animateOutProgress);
                if (this.val$animationType == 2) {
                    f6 = CubicBezierInterpolator.EASE_OUT_QUINT.getInterpolation(interpolation);
                    f7 = cubicBezierInterpolator.getInterpolation(interpolation);
                    f5 = 2.0f;
                } else if (this.val$fromHolder) {
                    f5 = 2.0f;
                    f6 = CubicBezierInterpolator.EASE_OUT_QUINT.getInterpolation(ReactionsEffectOverlay.this.animateInProgress);
                    f7 = cubicBezierInterpolator.getInterpolation(ReactionsEffectOverlay.this.animateInProgress);
                } else {
                    f5 = 2.0f;
                    f6 = ReactionsEffectOverlay.this.animateInProgress;
                    f7 = f6;
                }
                float f21 = 1.0f - f6;
                float f22 = (this.val$fromScale * f21) + f6;
                float f23 = f15 / this.val$emojiSize;
                if (this.val$animationType == 1) {
                    f22 = 1.0f;
                } else {
                    f18 = (f18 * f6) + (this.val$fromX * f21);
                    f19 = (f19 * f7) + (this.val$fromY * (1.0f - f7));
                }
                ReactionsEffectOverlay.this.effectImageView.setTranslationX(f18);
                ReactionsEffectOverlay.this.effectImageView.setTranslationY(f19);
                float f24 = 1.0f - interpolation;
                ReactionsEffectOverlay.this.effectImageView.setAlpha(f24);
                ReactionsEffectOverlay.this.effectImageView.setScaleX(f22);
                ReactionsEffectOverlay.this.effectImageView.setScaleY(f22);
                int i2 = this.val$animationType;
                if (i2 == 2) {
                    f22 = (this.val$fromScale * f21) + (f23 * f6);
                    f18 = (this.val$fromX * f21) + (f2 * f6);
                    f8 = this.val$fromY * (1.0f - f7);
                    f9 = f3 * f7;
                } else {
                    if (interpolation != 0.0f) {
                        f22 = (f22 * f24) + (f23 * interpolation);
                        f18 = (f18 * f24) + (f2 * interpolation);
                        f8 = f19 * f24;
                        f9 = f3 * interpolation;
                    }
                    if (i2 != 1) {
                        if (!this.val$isStories) {
                            ReactionsEffectOverlay.this.emojiStaticImageView.setAlpha(interpolation > 0.7f ? (interpolation - 0.7f) / 0.3f : 0.0f);
                        } else {
                            ReactionsEffectOverlay.this.emojiStaticImageView.setAlpha(1.0f);
                        }
                    }
                    if (this.val$animationType == 0 && this.val$isStories) {
                        ReactionsEffectOverlay.this.emojiImageView.setAlpha(f24);
                    }
                    ReactionsEffectOverlay.this.container.setTranslationX(f18);
                    ReactionsEffectOverlay.this.container.setTranslationY(f19);
                    ReactionsEffectOverlay.this.container.setScaleX(f22);
                    ReactionsEffectOverlay.this.container.setScaleY(f22);
                    super.dispatchDraw(canvas);
                    if (this.val$animationType != 1 || ReactionsEffectOverlay.this.emojiImageView.wasPlaying) {
                        ReactionsEffectOverlay reactionsEffectOverlay3 = ReactionsEffectOverlay.this;
                        f10 = reactionsEffectOverlay3.animateInProgress;
                        if (f10 != 1.0f) {
                            if (this.val$fromHolder) {
                                reactionsEffectOverlay3.animateInProgress = f10 + 0.045714285f;
                            } else {
                                reactionsEffectOverlay3.animateInProgress = f10 + 0.07272727f;
                            }
                            if (reactionsEffectOverlay3.animateInProgress > 1.0f) {
                                reactionsEffectOverlay3.animateInProgress = 1.0f;
                            }
                        }
                    }
                    if (this.val$animationType == 2 && ((!ReactionsEffectOverlay.this.wasScrolled || this.val$animationType != 0) && (this.val$animationType == 1 || !ReactionsEffectOverlay.this.emojiImageView.wasPlaying || ReactionsEffectOverlay.this.emojiImageView.getImageReceiver().getLottieAnimation() == null || ReactionsEffectOverlay.this.emojiImageView.getImageReceiver().getLottieAnimation().isRunning()))) {
                        if (this.val$visibleReaction.documentId != 0) {
                            f11 = 16.0f;
                        } else {
                            f11 = 16.0f;
                        }
                        if (this.val$animationType == 1) {
                            if (ReactionsEffectOverlay.this.effectImageView.wasPlaying) {
                                if (ReactionsEffectOverlay.this.effectImageView.getImageReceiver().getLottieAnimation() != null) {
                                }
                            }
                        }
                        if (this.val$visibleReaction.documentId != 0) {
                        }
                        if (!ReactionsEffectOverlay.this.avatars.isEmpty() && ReactionsEffectOverlay.this.effectImageView.wasPlaying) {
                            RLottieDrawable lottieAnimation = ReactionsEffectOverlay.this.effectImageView.getImageReceiver().getLottieAnimation();
                            i = 0;
                            while (i < ReactionsEffectOverlay.this.avatars.size()) {
                                AvatarParticle avatarParticle = (AvatarParticle) ReactionsEffectOverlay.this.avatars.get(i);
                                float f25 = avatarParticle.progress;
                                if (lottieAnimation != null && lottieAnimation.isRunning()) {
                                    float duration = ReactionsEffectOverlay.this.effectImageView.getImageReceiver().getLottieAnimation().getDuration();
                                }
                                float f26 = avatarParticle.outProgress;
                                if (f26 != 1.0f) {
                                    float f27 = f26 + f;
                                    avatarParticle.outProgress = f27;
                                    if (f27 > 1.0f) {
                                        avatarParticle.outProgress = 1.0f;
                                        ReactionsEffectOverlay.this.avatars.remove(i);
                                        i--;
                                        i++;
                                    }
                                }
                                if (f25 < 0.5f) {
                                    f13 = f25 / 0.5f;
                                    f12 = 1.0f;
                                } else {
                                    f12 = 1.0f;
                                    f13 = 1.0f - ((f25 - 0.5f) / 0.5f);
                                }
                                float f28 = f12 - f25;
                                float f29 = (avatarParticle.fromX * f28) + (avatarParticle.toX * f25);
                                float f30 = ((avatarParticle.fromY * f28) + (avatarParticle.toY * f25)) - (avatarParticle.jumpY * f13);
                                float f31 = avatarParticle.randomScale * f25 * (1.0f - avatarParticle.outProgress);
                                float x = ReactionsEffectOverlay.this.effectImageView.getX() + (ReactionsEffectOverlay.this.effectImageView.getWidth() * ReactionsEffectOverlay.this.effectImageView.getScaleX() * f29);
                                float y = ReactionsEffectOverlay.this.effectImageView.getY() + (ReactionsEffectOverlay.this.effectImageView.getHeight() * ReactionsEffectOverlay.this.effectImageView.getScaleY() * f30);
                                int dp2 = AndroidUtilities.dp(f11);
                                float f32 = dp2;
                                float f33 = f32 / f5;
                                ((AvatarParticle) ReactionsEffectOverlay.this.avatars.get(i)).imageReceiver.setImageCoords(x - f33, y - f33, f32, f32);
                                ((AvatarParticle) ReactionsEffectOverlay.this.avatars.get(i)).imageReceiver.setRoundRadius(dp2 >> 1);
                                canvas.save();
                                canvas.translate(0.0f, avatarParticle.globalTranslationY);
                                canvas.scale(f31, f31, x, y);
                                canvas.rotate(avatarParticle.currentRotation, x, y);
                                ((AvatarParticle) ReactionsEffectOverlay.this.avatars.get(i)).imageReceiver.draw(canvas);
                                canvas.restore();
                                float f34 = avatarParticle.progress;
                                if (f34 < 1.0f) {
                                    float f35 = f34 + 0.045714285f;
                                    avatarParticle.progress = f35;
                                    if (f35 > 1.0f) {
                                        avatarParticle.progress = 1.0f;
                                    }
                                }
                                if (f25 >= 1.0f) {
                                    avatarParticle.globalTranslationY += (AndroidUtilities.dp(20.0f) * f11) / 500.0f;
                                }
                                if (avatarParticle.incrementRotation) {
                                    float f36 = avatarParticle.currentRotation;
                                    float f37 = avatarParticle.randomRotation;
                                    float f38 = f36 + (f37 / 250.0f);
                                    avatarParticle.currentRotation = f38;
                                    if (f38 > f37) {
                                        avatarParticle.incrementRotation = false;
                                    }
                                } else {
                                    float f39 = avatarParticle.currentRotation;
                                    float f40 = avatarParticle.randomRotation;
                                    float f41 = f39 - (f40 / 250.0f);
                                    avatarParticle.currentRotation = f41;
                                    if (f41 < (-f40)) {
                                        avatarParticle.incrementRotation = true;
                                    }
                                }
                                i++;
                            }
                        }
                        invalidate();
                        return;
                    }
                    f11 = 16.0f;
                    ReactionsEffectOverlay reactionsEffectOverlay4 = ReactionsEffectOverlay.this;
                    f14 = reactionsEffectOverlay4.animateOutProgress;
                    if (f14 != 1.0f) {
                        int i3 = this.val$animationType;
                        if (i3 == 1) {
                            reactionsEffectOverlay4.animateOutProgress = 1.0f;
                        } else {
                            reactionsEffectOverlay4.animateOutProgress = f14 + (f11 / (i3 == 2 ? 350.0f : 220.0f));
                        }
                        if (reactionsEffectOverlay4.animateOutProgress > 0.7f) {
                            if (this.val$isStories && i3 == 2) {
                                if (!reactionsEffectOverlay4.isFinished) {
                                    reactionsEffectOverlay4.isFinished = true;
                                    try {
                                        performHapticFeedback(0);
                                    } catch (Exception unused) {
                                    }
                                    ((ViewGroup) getParent()).addView(ReactionsEffectOverlay.this.nextReactionOverlay.windowView);
                                    ReactionsEffectOverlay.this.nextReactionOverlay.isStories = true;
                                    ReactionsEffectOverlay.this.nextReactionOverlay.started = true;
                                    ReactionsEffectOverlay.this.nextReactionOverlay.startTime = System.currentTimeMillis();
                                    ReactionsEffectOverlay.this.nextReactionOverlay.windowView.setTag(R.id.parent_tag, 1);
                                    animate().scaleX(0.0f).scaleY(0.0f).setStartDelay(1000L).setDuration(150L).setListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.Components.Reactions.ReactionsEffectOverlay.1.1
                                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                        public void onAnimationEnd(Animator animator) {
                                            ReactionsEffectOverlay.this.removeCurrentView();
                                        }
                                    });
                                }
                            } else {
                                ReactionsEffectOverlay.startShortAnimation();
                            }
                        }
                        ReactionsEffectOverlay reactionsEffectOverlay5 = ReactionsEffectOverlay.this;
                        if (reactionsEffectOverlay5.animateOutProgress >= 1.0f) {
                            int i4 = this.val$animationType;
                            if (i4 == 0 || i4 == 2) {
                                View view2 = this.val$cell;
                                if (view2 instanceof ChatMessageCell) {
                                    ((ChatMessageCell) view2).reactionsLayoutInBubble.animateReaction(reactionsEffectOverlay5.reaction);
                                } else if (view2 instanceof ChatActionCell) {
                                    ((ChatActionCell) view2).reactionsLayoutInBubble.animateReaction(reactionsEffectOverlay5.reaction);
                                }
                            }
                            ReactionsEffectOverlay.this.animateOutProgress = 1.0f;
                            if (this.val$animationType == 1) {
                                ReactionsEffectOverlay.currentShortOverlay = null;
                            } else {
                                ReactionsEffectOverlay.currentOverlay = null;
                            }
                            View view3 = this.val$cell;
                            if (view3 != null) {
                                view3.invalidate();
                                View view4 = this.val$cell;
                                if ((view4 instanceof ChatMessageCell) && ((ChatMessageCell) view4).getCurrentMessagesGroup() != null && this.val$cell.getParent() != null) {
                                    ((View) this.val$cell.getParent()).invalidate();
                                }
                            }
                            if (!this.val$isStories || this.val$animationType != 2) {
                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.Reactions.ReactionsEffectOverlay$1$$ExternalSyntheticLambda1
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        ReactionsEffectOverlay.this.removeCurrentView();
                                    }
                                });
                            }
                        }
                    }
                    if (!ReactionsEffectOverlay.this.avatars.isEmpty()) {
                        RLottieDrawable lottieAnimation2 = ReactionsEffectOverlay.this.effectImageView.getImageReceiver().getLottieAnimation();
                        i = 0;
                        while (i < ReactionsEffectOverlay.this.avatars.size()) {
                        }
                    }
                    invalidate();
                    return;
                }
                f19 = f8 + f9;
                if (i2 != 1) {
                }
                if (this.val$animationType == 0) {
                    ReactionsEffectOverlay.this.emojiImageView.setAlpha(f24);
                }
                ReactionsEffectOverlay.this.container.setTranslationX(f18);
                ReactionsEffectOverlay.this.container.setTranslationY(f19);
                ReactionsEffectOverlay.this.container.setScaleX(f22);
                ReactionsEffectOverlay.this.container.setScaleY(f22);
                super.dispatchDraw(canvas);
                if (this.val$animationType != 1) {
                }
                ReactionsEffectOverlay reactionsEffectOverlay32 = ReactionsEffectOverlay.this;
                f10 = reactionsEffectOverlay32.animateInProgress;
                if (f10 != 1.0f) {
                }
                if (this.val$animationType == 2) {
                }
                f11 = 16.0f;
                ReactionsEffectOverlay reactionsEffectOverlay42 = ReactionsEffectOverlay.this;
                f14 = reactionsEffectOverlay42.animateOutProgress;
                if (f14 != 1.0f) {
                }
                if (!ReactionsEffectOverlay.this.avatars.isEmpty()) {
                }
                invalidate();
                return;
            }
            invalidate();
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            for (int i = 0; i < ReactionsEffectOverlay.this.avatars.size(); i++) {
                ((AvatarParticle) ReactionsEffectOverlay.this.avatars.get(i)).imageReceiver.onAttachedToWindow();
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            for (int i = 0; i < ReactionsEffectOverlay.this.avatars.size(); i++) {
                ((AvatarParticle) ReactionsEffectOverlay.this.avatars.get(i)).imageReceiver.onDetachedFromWindow();
            }
        }
    }

    public static String getFilterForAroundAnimation() {
        return sizeForAroundReaction() + "_" + sizeForAroundReaction() + "_nolimit_pcache";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeCurrentView() {
        try {
            if (this.useWindow) {
                this.windowManager.removeView(this.windowView);
            } else {
                AndroidUtilities.removeFromParent(this.windowView);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
    
        if (r22 != 2) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0068, code lost:
    
        if (r1.isShowing() == false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void show(BaseFragment baseFragment, ReactionsContainerLayout reactionsContainerLayout, View view, View view2, float f, float f2, ReactionsLayoutInBubble.VisibleReaction visibleReaction, int i, int i2) {
        if (view == null || visibleReaction == null || baseFragment == null || baseFragment.getParentActivity() == null) {
            return;
        }
        boolean z = true;
        if (MessagesController.getGlobalMainSettings().getBoolean("view_animations", true)) {
            if (i2 == 2 || i2 == 0) {
                show(baseFragment, null, view, view2, 0.0f, 0.0f, visibleReaction, i, 1);
            }
            ReactionsEffectOverlay reactionsEffectOverlay = new ReactionsEffectOverlay(baseFragment.getParentActivity(), baseFragment, reactionsContainerLayout, view, view2, f, f2, visibleReaction, i, i2, false);
            if (i2 == 1) {
                currentShortOverlay = reactionsEffectOverlay;
            } else {
                currentOverlay = reactionsEffectOverlay;
            }
            if (baseFragment instanceof ChatActivity) {
                ChatActivity chatActivity = (ChatActivity) baseFragment;
                if (i2 != 0) {
                }
                ActionBarPopupWindow actionBarPopupWindow = chatActivity.scrimPopupWindow;
                if (actionBarPopupWindow != null) {
                }
            }
            z = false;
            reactionsEffectOverlay.useWindow = z;
            if (z) {
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                layoutParams.height = -1;
                layoutParams.width = -1;
                layoutParams.type = MediaDataController.MAX_STYLE_RUNS_COUNT;
                layoutParams.flags = 65816;
                layoutParams.format = -3;
                WindowManager windowManager = baseFragment.getParentActivity().getWindowManager();
                reactionsEffectOverlay.windowManager = windowManager;
                AndroidUtilities.setPreferredMaxRefreshRate(windowManager, reactionsEffectOverlay.windowView, layoutParams);
                reactionsEffectOverlay.windowManager.addView(reactionsEffectOverlay.windowView, layoutParams);
            } else {
                FrameLayout frameLayout = (FrameLayout) baseFragment.getParentActivity().getWindow().getDecorView();
                reactionsEffectOverlay.decorView = frameLayout;
                frameLayout.addView(reactionsEffectOverlay.windowView);
            }
            view.invalidate();
            if (!(view instanceof ChatMessageCell) || ((ChatMessageCell) view).getCurrentMessagesGroup() == null || view.getParent() == null) {
                return;
            }
            ((View) view.getParent()).invalidate();
        }
    }

    public static void startAnimation() {
        ReactionsEffectOverlay reactionsEffectOverlay = currentOverlay;
        if (reactionsEffectOverlay != null) {
            reactionsEffectOverlay.started = true;
            reactionsEffectOverlay.startTime = System.currentTimeMillis();
            if (currentOverlay.animationType != 0 || System.currentTimeMillis() - lastHapticTime <= 200) {
                return;
            }
            lastHapticTime = System.currentTimeMillis();
            currentOverlay.cell.performHapticFeedback(3);
            return;
        }
        startShortAnimation();
        ReactionsEffectOverlay reactionsEffectOverlay2 = currentShortOverlay;
        if (reactionsEffectOverlay2 != null) {
            View view = reactionsEffectOverlay2.cell;
            if (view instanceof ChatMessageCell) {
                ((ChatMessageCell) view).reactionsLayoutInBubble.animateReaction(reactionsEffectOverlay2.reaction);
            } else if (view instanceof ChatActionCell) {
                ((ChatActionCell) view).reactionsLayoutInBubble.animateReaction(reactionsEffectOverlay2.reaction);
            }
        }
    }

    public static void startShortAnimation() {
        ReactionsEffectOverlay reactionsEffectOverlay = currentShortOverlay;
        if (reactionsEffectOverlay == null || reactionsEffectOverlay.started) {
            return;
        }
        reactionsEffectOverlay.started = true;
        reactionsEffectOverlay.startTime = System.currentTimeMillis();
        if (currentShortOverlay.animationType != 1 || System.currentTimeMillis() - lastHapticTime <= 200) {
            return;
        }
        lastHapticTime = System.currentTimeMillis();
        View view = currentShortOverlay.cell;
        if (view != null) {
            view.performHapticFeedback(3);
        }
    }

    public static void removeCurrent(boolean z) {
        int i = 0;
        while (i < 2) {
            ReactionsEffectOverlay reactionsEffectOverlay = i == 0 ? currentOverlay : currentShortOverlay;
            if (reactionsEffectOverlay != null) {
                if (z) {
                    reactionsEffectOverlay.removeCurrentView();
                } else {
                    reactionsEffectOverlay.dismissed = true;
                }
            }
            i++;
        }
        currentShortOverlay = null;
        currentOverlay = null;
    }

    public static boolean isPlaying(int i, long j, ReactionsLayoutInBubble.VisibleReaction visibleReaction) {
        int i2;
        ReactionsEffectOverlay reactionsEffectOverlay = currentOverlay;
        if (reactionsEffectOverlay != null && ((i2 = reactionsEffectOverlay.animationType) == 2 || i2 == 0)) {
            long j2 = reactionsEffectOverlay.groupId;
            if (((j2 != 0 && j == j2) || i == reactionsEffectOverlay.messageId) && reactionsEffectOverlay.reaction.equals(visibleReaction)) {
                return true;
            }
        }
        return false;
    }

    private class AnimationView extends BackupImageView {
        AnimatedEmojiDrawable animatedEmojiDrawable;
        boolean attached;
        AnimatedEmojiEffect emojiEffect;
        boolean wasPlaying;

        public AnimationView(Context context) {
            super(context);
            getImageReceiver().setFileLoadingPriority(3);
        }

        @Override // org.telegram.ui.Components.BackupImageView, android.view.View
        protected void onDraw(Canvas canvas) {
            AnimatedEmojiDrawable animatedEmojiDrawable = this.animatedEmojiDrawable;
            if (animatedEmojiDrawable != null) {
                animatedEmojiDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                this.animatedEmojiDrawable.setAlpha(NotificationCenter.didReceiveSmsCode);
                this.animatedEmojiDrawable.draw(canvas);
                this.wasPlaying = true;
                return;
            }
            AnimatedEmojiEffect animatedEmojiEffect = this.emojiEffect;
            if (animatedEmojiEffect != null) {
                animatedEmojiEffect.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                this.emojiEffect.draw(canvas);
                this.wasPlaying = true;
                return;
            }
            if (getImageReceiver().getLottieAnimation() != null && getImageReceiver().getLottieAnimation().isRunning()) {
                this.wasPlaying = true;
            }
            if (!this.wasPlaying && getImageReceiver().getLottieAnimation() != null && !getImageReceiver().getLottieAnimation().isRunning()) {
                if (ReactionsEffectOverlay.this.animationType == 2 && !ReactionsEffectOverlay.this.isStories) {
                    getImageReceiver().getLottieAnimation().setCurrentFrame(getImageReceiver().getLottieAnimation().getFramesCount() - 1, false);
                } else {
                    getImageReceiver().getLottieAnimation().setCurrentFrame(0, false);
                    getImageReceiver().getLottieAnimation().start();
                }
            }
            super.onDraw(canvas);
        }

        @Override // org.telegram.ui.Components.BackupImageView, android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            this.attached = true;
            AnimatedEmojiDrawable animatedEmojiDrawable = this.animatedEmojiDrawable;
            if (animatedEmojiDrawable != null) {
                animatedEmojiDrawable.addView(this);
            }
            AnimatedEmojiEffect animatedEmojiEffect = this.emojiEffect;
            if (animatedEmojiEffect != null) {
                animatedEmojiEffect.setView(this);
            }
        }

        @Override // org.telegram.ui.Components.BackupImageView, android.view.View
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            this.attached = false;
            AnimatedEmojiDrawable animatedEmojiDrawable = this.animatedEmojiDrawable;
            if (animatedEmojiDrawable != null) {
                animatedEmojiDrawable.removeView(this);
            }
            AnimatedEmojiEffect animatedEmojiEffect = this.emojiEffect;
            if (animatedEmojiEffect != null) {
                animatedEmojiEffect.removeView(this);
            }
        }

        public void setAnimatedReactionDrawable(AnimatedEmojiDrawable animatedEmojiDrawable) {
            if (animatedEmojiDrawable != null) {
                animatedEmojiDrawable.removeView(this);
            }
            this.animatedEmojiDrawable = animatedEmojiDrawable;
            if (!this.attached || animatedEmojiDrawable == null) {
                return;
            }
            animatedEmojiDrawable.addView(this);
        }

        public void setAnimatedEmojiEffect(AnimatedEmojiEffect animatedEmojiEffect) {
            this.emojiEffect = animatedEmojiEffect;
        }
    }

    public static void onScrolled(int i) {
        ReactionsEffectOverlay reactionsEffectOverlay = currentOverlay;
        if (reactionsEffectOverlay != null) {
            reactionsEffectOverlay.lastDrawnToY -= i;
            if (i != 0) {
                reactionsEffectOverlay.wasScrolled = true;
            }
        }
    }

    public static int sizeForBigReaction() {
        int dp = AndroidUtilities.dp(350.0f);
        Point point = AndroidUtilities.displaySize;
        return (int) (Math.round(Math.min(dp, Math.min(point.x, point.y)) * 0.7f) / AndroidUtilities.density);
    }

    public static int sizeForAroundReaction() {
        return (int) ((AndroidUtilities.dp(40.0f) * 2.0f) / AndroidUtilities.density);
    }

    public static void dismissAll() {
        ReactionsEffectOverlay reactionsEffectOverlay = currentOverlay;
        if (reactionsEffectOverlay != null) {
            reactionsEffectOverlay.dismissed = true;
        }
        ReactionsEffectOverlay reactionsEffectOverlay2 = currentShortOverlay;
        if (reactionsEffectOverlay2 != null) {
            reactionsEffectOverlay2.dismissed = true;
        }
    }

    private class AvatarParticle {
        float currentRotation;
        float fromX;
        float fromY;
        float globalTranslationY;
        ImageReceiver imageReceiver;
        boolean incrementRotation;
        float jumpY;
        public int leftTime;
        float outProgress;
        float progress;
        float randomRotation;
        float randomScale;
        float toX;
        float toY;

        private AvatarParticle() {
        }

        /* synthetic */ AvatarParticle(ReactionsEffectOverlay reactionsEffectOverlay, 1 r2) {
            this();
        }
    }
}
