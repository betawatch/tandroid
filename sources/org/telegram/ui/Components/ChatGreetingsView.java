package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.utils.BitmapsCache;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$DocumentAttribute;
import org.telegram.tgnet.TLRPC$TL_documentAttributeImageSize;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.ChatGreetingsView;
import org.telegram.ui.Components.Premium.PremiumButtonView;
import org.telegram.ui.Components.Premium.StarParticlesView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.Stories.recorder.HintView2;
/* loaded from: classes3.dex */
public class ChatGreetingsView extends LinearLayout {
    private int backgroundHeight;
    private final int currentAccount;
    private TextView descriptionView;
    private boolean disableBackground;
    boolean ignoreLayot;
    private Listener listener;
    public BackupImageView nextStickerToSendView;
    private TLRPC$Document preloadedGreetingsSticker;
    private TextView premiumButtonView;
    private RLottieImageView premiumIconView;
    private boolean premiumLock;
    private TextView premiumTextView;
    public boolean preview;
    private final Theme.ResourcesProvider resourcesProvider;
    public FrameLayout stickerContainer;
    public BackupImageView stickerToSendView;
    private TextView titleView;
    private AnimatorSet togglingStickersAnimator;
    private float viewTop;
    private float viewTranslationX;
    private boolean visiblePartSet;
    boolean wasDraw;

    /* loaded from: classes3.dex */
    public interface Listener {
        void onGreetings(TLRPC$Document tLRPC$Document);
    }

    public ChatGreetingsView(Context context, TLRPC$User tLRPC$User, int i, int i2, TLRPC$Document tLRPC$Document, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        setOrientation(1);
        this.currentAccount = i2;
        this.resourcesProvider = resourcesProvider;
        setPadding(0, AndroidUtilities.dp(8.0f), 0, 0);
        TextView textView = new TextView(context);
        this.titleView = textView;
        textView.setTextSize(1, 14.0f);
        this.titleView.setTypeface(AndroidUtilities.bold());
        this.titleView.setTextAlignment(4);
        this.titleView.setGravity(17);
        TextView textView2 = new TextView(context);
        this.descriptionView = textView2;
        textView2.setTextAlignment(4);
        this.descriptionView.setGravity(17);
        this.descriptionView.setTextSize(1, 14.0f);
        this.descriptionView.setGravity(1);
        this.stickerContainer = new FrameLayout(context);
        BackupImageView backupImageView = new BackupImageView(context);
        this.stickerToSendView = backupImageView;
        backupImageView.getImageReceiver().setAspectFit(true);
        this.stickerContainer.addView(this.stickerToSendView, LayoutHelper.createFrame(112, 112.0f));
        ScaleStateListAnimator.apply(this.stickerToSendView);
        BackupImageView backupImageView2 = new BackupImageView(context);
        this.nextStickerToSendView = backupImageView2;
        backupImageView2.getImageReceiver().setAspectFit(true);
        this.stickerContainer.addView(this.nextStickerToSendView, LayoutHelper.createFrame(112, 112.0f));
        this.nextStickerToSendView.setVisibility(8);
        this.nextStickerToSendView.setAlpha(0.0f);
        ScaleStateListAnimator.apply(this.nextStickerToSendView);
        updateLayout();
        updateColors();
        if (i <= 0) {
            this.titleView.setText(LocaleController.getString(R.string.NoMessages));
            this.descriptionView.setText(LocaleController.getString(R.string.NoMessagesGreetingsDescription));
        } else {
            this.titleView.setText(LocaleController.formatString("NearbyPeopleGreetingsMessage", R.string.NearbyPeopleGreetingsMessage, tLRPC$User.first_name, LocaleController.formatDistance(i, 1)));
            this.descriptionView.setText(LocaleController.getString(R.string.NearbyPeopleGreetingsDescription));
        }
        TextView textView3 = this.descriptionView;
        textView3.setMaxWidth(HintView2.cutInFancyHalf(textView3.getText(), this.descriptionView.getPaint()));
        this.stickerToSendView.setContentDescription(this.descriptionView.getText());
        this.preloadedGreetingsSticker = tLRPC$Document;
        if (tLRPC$Document == null) {
            this.preloadedGreetingsSticker = MediaDataController.getInstance(i2).getGreetingsSticker();
        }
    }

    public void setPremiumLock(boolean z, long j) {
        String str;
        String formatString;
        TLRPC$User user;
        if (this.premiumLock == z) {
            return;
        }
        this.premiumLock = z;
        if (z) {
            if (this.premiumIconView == null) {
                RLottieImageView rLottieImageView = new RLottieImageView(getContext());
                this.premiumIconView = rLottieImageView;
                rLottieImageView.setScaleType(ImageView.ScaleType.CENTER);
                this.premiumIconView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                this.premiumIconView.setBackground(Theme.createCircleDrawable(AndroidUtilities.dp(78.0f), 469762048));
                this.premiumIconView.setAnimation(R.raw.large_message_lock, 80, 80);
                this.premiumIconView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.ChatGreetingsView$$ExternalSyntheticLambda3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ChatGreetingsView.this.lambda$setPremiumLock$0(view);
                    }
                });
            }
            this.premiumIconView.playAnimation();
            if (this.premiumTextView == null) {
                TextView textView = new TextView(getContext());
                this.premiumTextView = textView;
                textView.setTextAlignment(4);
                this.premiumTextView.setGravity(17);
                this.premiumTextView.setTextSize(1, 13.0f);
            }
            if (j >= 0 && (user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j))) != null) {
                str = UserObject.getUserName(user);
            } else {
                str = "";
            }
            if (MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked()) {
                formatString = LocaleController.formatString(R.string.MessageLockedPremiumLocked, str);
            } else {
                formatString = LocaleController.formatString(R.string.MessageLockedPremium, str);
            }
            this.premiumTextView.setText(AndroidUtilities.replaceTags(formatString));
            TextView textView2 = this.premiumTextView;
            textView2.setMaxWidth(HintView2.cutInFancyHalf(textView2.getText(), this.premiumTextView.getPaint()));
            TextView textView3 = this.premiumTextView;
            int i = Theme.key_chat_serviceText;
            textView3.setTextColor(getThemedColor(i));
            this.premiumTextView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            if (this.premiumButtonView == null) {
                TextView textView4 = new TextView(getContext()) { // from class: org.telegram.ui.Components.ChatGreetingsView.1
                    private final Path clipPath = new Path();
                    StarParticlesView.Drawable starParticlesDrawable;

                    @Override // android.widget.TextView, android.view.View
                    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
                        super.onLayout(z2, i2, i3, i4, i5);
                        StarParticlesView.Drawable drawable = new StarParticlesView.Drawable(10);
                        this.starParticlesDrawable = drawable;
                        drawable.type = 100;
                        drawable.isCircle = false;
                        drawable.roundEffect = true;
                        drawable.useRotate = false;
                        drawable.useBlur = true;
                        drawable.checkBounds = true;
                        drawable.size1 = 1;
                        drawable.k3 = 0.98f;
                        drawable.k2 = 0.98f;
                        drawable.k1 = 0.98f;
                        drawable.paused = false;
                        drawable.speedScale = 0.0f;
                        drawable.minLifeTime = 750L;
                        drawable.randLifeTime = 750;
                        drawable.init();
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                        this.starParticlesDrawable.rect.set(rectF);
                        this.starParticlesDrawable.rect2.set(rectF);
                        this.starParticlesDrawable.resetPositions();
                        this.clipPath.reset();
                        this.clipPath.addRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, Path.Direction.CW);
                    }

                    @Override // android.widget.TextView, android.view.View
                    protected void onDraw(Canvas canvas) {
                        if (this.starParticlesDrawable != null) {
                            canvas.save();
                            canvas.clipPath(this.clipPath);
                            this.starParticlesDrawable.onDraw(canvas);
                            canvas.restore();
                            invalidate();
                        }
                        super.onDraw(canvas);
                    }
                };
                this.premiumButtonView = textView4;
                textView4.setTextAlignment(4);
                this.premiumButtonView.setGravity(17);
                this.premiumButtonView.setTypeface(AndroidUtilities.bold());
                this.premiumButtonView.setTextSize(1, 14.0f);
                this.premiumButtonView.setPadding(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(6.66f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(7.0f));
                this.premiumButtonView.setBackground(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(15.0f), 503316480, AndroidUtilities.DARK_STATUS_BAR_OVERLAY));
                ScaleStateListAnimator.apply(this.premiumButtonView);
            }
            this.premiumButtonView.setText(LocaleController.getString(R.string.MessagePremiumUnlock));
            this.premiumButtonView.setTextColor(getThemedColor(i));
            this.premiumButtonView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.ChatGreetingsView$$ExternalSyntheticLambda4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ChatGreetingsView.lambda$setPremiumLock$1(view);
                }
            });
        }
        updateLayout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setPremiumLock$0(View view) {
        this.premiumIconView.setProgress(0.0f);
        this.premiumIconView.playAnimation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setPremiumLock$1(View view) {
        BaseFragment lastFragment = LaunchActivity.getLastFragment();
        if (lastFragment != null) {
            lastFragment.presentFragment(new PremiumPreviewFragment("contact"));
        }
    }

    private void updateLayout() {
        removeAllViews();
        if (this.premiumLock) {
            addView(this.premiumIconView, LayoutHelper.createLinear(78, 78, 49, 20, 9, 20, 9));
            boolean premiumFeaturesBlocked = MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked();
            addView(this.premiumTextView, LayoutHelper.createLinear(-2, -2, 49, 20, 0, 20, premiumFeaturesBlocked ? 13 : 9));
            if (premiumFeaturesBlocked) {
                return;
            }
            addView(this.premiumButtonView, LayoutHelper.createLinear(-2, 30, 49, 20, 2, 20, 13));
            return;
        }
        addView(this.titleView, LayoutHelper.createLinear(-2, -2, 1, 20, 6, 20, 6));
        addView(this.descriptionView, LayoutHelper.createLinear(-2, -2, 1, 20, 6, 20, 6));
        addView(this.stickerContainer, LayoutHelper.createLinear(112, 112, 1, 16, 10, 16, 16));
    }

    public void setSticker(final TLRPC$Document tLRPC$Document) {
        if (tLRPC$Document == null) {
            return;
        }
        this.wasDraw = true;
        this.nextStickerToSendView.clearImage();
        SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tLRPC$Document, Theme.key_chat_serviceBackground, 1.0f);
        if (svgThumb != null) {
            this.stickerToSendView.setImage(ImageLocation.getForDocument(tLRPC$Document), createFilter(tLRPC$Document), svgThumb, 0, tLRPC$Document);
        } else {
            this.stickerToSendView.setImage(ImageLocation.getForDocument(tLRPC$Document), createFilter(tLRPC$Document), ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(tLRPC$Document.thumbs, 90), tLRPC$Document), (String) null, 0, tLRPC$Document);
        }
        this.stickerToSendView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.ChatGreetingsView$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChatGreetingsView.this.lambda$setSticker$2(tLRPC$Document, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setSticker$2(TLRPC$Document tLRPC$Document, View view) {
        Listener listener = this.listener;
        if (listener != null) {
            listener.onGreetings(tLRPC$Document);
        }
    }

    public void setSticker(String str) {
        if (str == null) {
            return;
        }
        this.wasDraw = true;
        this.nextStickerToSendView.clearImage();
        this.stickerToSendView.setImage(ImageLocation.getForPath(str), "256_256", (ImageLocation) null, (String) null, 0, (Object) null);
    }

    public void setNextSticker(final TLRPC$Document tLRPC$Document, Runnable runnable) {
        if (tLRPC$Document == null) {
            return;
        }
        AnimatorSet animatorSet = this.togglingStickersAnimator;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.nextStickerToSendView.getImageReceiver().setDelegate(new 2(runnable));
        SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tLRPC$Document, Theme.key_chat_serviceBackground, 1.0f);
        if (svgThumb != null) {
            this.nextStickerToSendView.setImage(ImageLocation.getForDocument(tLRPC$Document), createFilter(tLRPC$Document), svgThumb, 0, tLRPC$Document);
        } else {
            this.nextStickerToSendView.setImage(ImageLocation.getForDocument(tLRPC$Document), createFilter(tLRPC$Document), ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(tLRPC$Document.thumbs, 90), tLRPC$Document), (String) null, 0, tLRPC$Document);
        }
        this.nextStickerToSendView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.ChatGreetingsView$$ExternalSyntheticLambda5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChatGreetingsView.this.lambda$setNextSticker$3(tLRPC$Document, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class 2 implements ImageReceiver.ImageReceiverDelegate {
        final /* synthetic */ Runnable val$whenDone;
        private boolean waited;

        @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
        public void didSetImage(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        }

        @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
        public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
            ImageReceiver.ImageReceiverDelegate.-CC.$default$onAnimationReady(this, imageReceiver);
        }

        2(Runnable runnable) {
            this.val$whenDone = runnable;
        }

        @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
        public void didSetImageBitmap(int i, String str, Drawable drawable) {
            RLottieDrawable rLottieDrawable;
            BitmapsCache bitmapsCache;
            if (this.waited) {
                return;
            }
            if ((i == 0 || i == 3) && drawable != null) {
                this.waited = true;
                if (!(drawable instanceof RLottieDrawable) || (bitmapsCache = (rLottieDrawable = (RLottieDrawable) drawable).bitmapsCache) == null || !bitmapsCache.needGenCache()) {
                    ChatGreetingsView.this.toggleToNextSticker();
                    Runnable runnable = this.val$whenDone;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                final Runnable runnable2 = this.val$whenDone;
                rLottieDrawable.whenCacheDone = new Runnable() { // from class: org.telegram.ui.Components.ChatGreetingsView$2$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ChatGreetingsView.2.this.lambda$didSetImageBitmap$0(runnable2);
                    }
                };
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$didSetImageBitmap$0(Runnable runnable) {
            ChatGreetingsView.this.toggleToNextSticker();
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setNextSticker$3(TLRPC$Document tLRPC$Document, View view) {
        Listener listener = this.listener;
        if (listener != null) {
            listener.onGreetings(tLRPC$Document);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void toggleToNextSticker() {
        AnimatorSet animatorSet = this.togglingStickersAnimator;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.nextStickerToSendView.setVisibility(0);
        this.stickerToSendView.setVisibility(0);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.togglingStickersAnimator = animatorSet2;
        animatorSet2.setDuration(420L);
        this.togglingStickersAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        this.togglingStickersAnimator.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.Components.ChatGreetingsView.3
            private boolean cancelled;

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (this.cancelled) {
                    return;
                }
                ChatGreetingsView chatGreetingsView = ChatGreetingsView.this;
                BackupImageView backupImageView = chatGreetingsView.stickerToSendView;
                chatGreetingsView.stickerToSendView = chatGreetingsView.nextStickerToSendView;
                chatGreetingsView.nextStickerToSendView = backupImageView;
                backupImageView.setVisibility(8);
                ChatGreetingsView.this.nextStickerToSendView.setAlpha(0.0f);
                ChatGreetingsView.this.stickerToSendView.setVisibility(0);
                ChatGreetingsView.this.stickerToSendView.setAlpha(1.0f);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                this.cancelled = true;
            }
        });
        AnimatorSet animatorSet3 = this.togglingStickersAnimator;
        BackupImageView backupImageView = this.nextStickerToSendView;
        Property property = View.ALPHA;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(backupImageView, property, 0.0f, 1.0f);
        BackupImageView backupImageView2 = this.nextStickerToSendView;
        Property property2 = View.SCALE_X;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(backupImageView2, property2, 0.7f, 1.0f);
        BackupImageView backupImageView3 = this.nextStickerToSendView;
        Property property3 = View.SCALE_Y;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(backupImageView3, property3, 0.7f, 1.0f);
        BackupImageView backupImageView4 = this.nextStickerToSendView;
        Property property4 = View.TRANSLATION_Y;
        animatorSet3.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(backupImageView4, property4, -AndroidUtilities.dp(24.0f), 0.0f), ObjectAnimator.ofFloat(this.stickerToSendView, property, 1.0f, 0.0f), ObjectAnimator.ofFloat(this.stickerToSendView, property2, 1.0f, 0.7f), ObjectAnimator.ofFloat(this.stickerToSendView, property3, 1.0f, 0.7f), ObjectAnimator.ofFloat(this.stickerToSendView, property4, 0.0f, AndroidUtilities.dp(24.0f)));
        this.togglingStickersAnimator.start();
    }

    public static String createFilter(TLRPC$Document tLRPC$Document) {
        float min;
        float f;
        int i;
        int i2;
        if (AndroidUtilities.isTablet()) {
            min = AndroidUtilities.getMinTabletSide();
            f = 0.4f;
        } else {
            android.graphics.Point point = AndroidUtilities.displaySize;
            min = Math.min(point.x, point.y);
            f = 0.5f;
        }
        float f2 = min * f;
        int i3 = 0;
        while (true) {
            if (i3 >= tLRPC$Document.attributes.size()) {
                i = 0;
                i2 = 0;
                break;
            }
            TLRPC$DocumentAttribute tLRPC$DocumentAttribute = tLRPC$Document.attributes.get(i3);
            if (tLRPC$DocumentAttribute instanceof TLRPC$TL_documentAttributeImageSize) {
                i = tLRPC$DocumentAttribute.w;
                i2 = tLRPC$DocumentAttribute.h;
                break;
            }
            i3++;
        }
        if (MessageObject.isAnimatedStickerDocument(tLRPC$Document, true) && i == 0 && i2 == 0) {
            i = LiteMode.FLAG_CALLS_ANIMATIONS;
            i2 = LiteMode.FLAG_CALLS_ANIMATIONS;
        }
        if (i == 0) {
            i2 = (int) f2;
            i = i2 + AndroidUtilities.dp(100.0f);
        }
        int i4 = (int) (i2 * (f2 / i));
        int i5 = (int) f2;
        float f3 = i4;
        if (f3 > f2) {
            i5 = (int) (i5 * (f2 / f3));
            i4 = i5;
        }
        float f4 = i5;
        float f5 = AndroidUtilities.density;
        return String.format(Locale.US, "%d_%d", Integer.valueOf((int) (f4 / f5)), Integer.valueOf((int) (i4 / f5)));
    }

    private void updateColors() {
        TextView textView = this.titleView;
        int i = Theme.key_chat_serviceText;
        textView.setTextColor(getThemedColor(i));
        this.descriptionView.setTextColor(getThemedColor(i));
    }

    public void setListener(Listener listener) {
        this.listener = listener;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        this.ignoreLayot = true;
        if (!this.preview) {
            this.descriptionView.setVisibility(0);
        }
        this.stickerToSendView.setVisibility(0);
        super.onMeasure(i, i2);
        if (getMeasuredHeight() > View.MeasureSpec.getSize(i2) && !this.preview) {
            this.descriptionView.setVisibility(8);
            this.stickerToSendView.setVisibility(8);
        } else {
            if (!this.preview) {
                this.descriptionView.setVisibility(0);
            }
            this.stickerToSendView.setVisibility(0);
        }
        this.ignoreLayot = false;
        super.onMeasure(i, i2);
    }

    public void setPreview(CharSequence charSequence, CharSequence charSequence2) {
        int i;
        this.preview = true;
        TextView textView = this.titleView;
        if (TextUtils.isEmpty(charSequence == null ? null : charSequence.toString().trim())) {
            charSequence = LocaleController.getString(R.string.NoMessages);
        }
        textView.setText(charSequence);
        TextView textView2 = this.descriptionView;
        if (TextUtils.isEmpty(charSequence2 != null ? charSequence2.toString().trim() : null)) {
            charSequence2 = LocaleController.getString(R.string.NoMessagesGreetingsDescription);
        }
        textView2.setText(charSequence2);
        TextView textView3 = this.descriptionView;
        if (textView3.getText().length() > 60) {
            i = Math.min((int) (AndroidUtilities.displaySize.x * 0.5f), HintView2.cutInFancyHalf(this.descriptionView.getText(), this.descriptionView.getPaint()));
        } else {
            i = (int) (AndroidUtilities.displaySize.x * 0.5f);
        }
        textView3.setMaxWidth(i);
    }

    public void setVisiblePart(float f, int i) {
        this.visiblePartSet = true;
        this.backgroundHeight = i;
        this.viewTop = f;
        this.viewTranslationX = 0.0f;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        if (!this.disableBackground) {
            Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
            if (resourcesProvider != null) {
                resourcesProvider.applyServiceShaderMatrix(getMeasuredWidth(), this.backgroundHeight, this.viewTranslationX, this.viewTop + AndroidUtilities.dp(4.0f));
            } else {
                Theme.applyServiceShaderMatrix(getMeasuredWidth(), this.backgroundHeight, this.viewTranslationX, this.viewTop + AndroidUtilities.dp(4.0f));
            }
            if (Build.VERSION.SDK_INT >= 21) {
                canvas.drawRoundRect(0.0f, 0.0f, getWidth(), getHeight(), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), Theme.getThemePaint("paintChatActionBackground", this.resourcesProvider));
            }
        }
        if (!this.wasDraw) {
            this.wasDraw = true;
            setSticker(this.preloadedGreetingsSticker);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.ignoreLayot) {
            return;
        }
        super.requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        fetchSticker();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    private void fetchSticker() {
        if (this.preloadedGreetingsSticker == null) {
            TLRPC$Document greetingsSticker = MediaDataController.getInstance(this.currentAccount).getGreetingsSticker();
            this.preloadedGreetingsSticker = greetingsSticker;
            if (this.wasDraw) {
                setSticker(greetingsSticker);
            }
        }
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        super.setBackground(drawable);
        this.disableBackground = true;
    }

    private int getThemedColor(int i) {
        return Theme.getColor(i, this.resourcesProvider);
    }

    public static void showPremiumSheet(Context context, int i, long j, Theme.ResourcesProvider resourcesProvider) {
        String str;
        final BottomSheet bottomSheet = new BottomSheet(context, false, resourcesProvider);
        bottomSheet.fixNavigationBar(Theme.getColor(Theme.key_dialogBackground, resourcesProvider));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        RLottieImageView rLottieImageView = new RLottieImageView(context);
        rLottieImageView.setScaleType(ImageView.ScaleType.CENTER);
        rLottieImageView.setAnimation(R.raw.large_message_lock, 80, 80);
        rLottieImageView.playAnimation();
        rLottieImageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        rLottieImageView.setBackground(Theme.createCircleDrawable(AndroidUtilities.dp(80.0f), Theme.getColor(Theme.key_featuredStickers_addButton, resourcesProvider)));
        linearLayout.addView(rLottieImageView, LayoutHelper.createLinear(80, 80, 1, 0, 16, 0, 16));
        boolean premiumFeaturesBlocked = MessagesController.getInstance(i).premiumFeaturesBlocked();
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        int i2 = Theme.key_dialogTextBlack;
        textView.setTextColor(Theme.getColor(i2, resourcesProvider));
        textView.setTextSize(1, 20.0f);
        textView.setText(LocaleController.getString(premiumFeaturesBlocked ? R.string.PremiumMessageHeaderLocked : R.string.PremiumMessageHeader));
        linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2, 1, 12, 0, 12, 0));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        textView2.setTextColor(Theme.getColor(i2, resourcesProvider));
        textView2.setTextSize(1, 14.0f);
        if (j <= 0) {
            str = "";
        } else {
            str = UserObject.getFirstName(MessagesController.getInstance(i).getUser(Long.valueOf(j)));
        }
        textView2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(premiumFeaturesBlocked ? R.string.PremiumMessageTextLocked : R.string.PremiumMessageText, str, str)));
        linearLayout.addView(textView2, LayoutHelper.createLinear(-1, -2, 1, 12, 9, 12, 19));
        if (!premiumFeaturesBlocked) {
            PremiumButtonView premiumButtonView = new PremiumButtonView(context, true, resourcesProvider);
            premiumButtonView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.ChatGreetingsView$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ChatGreetingsView.lambda$showPremiumSheet$4(BottomSheet.this, view);
                }
            });
            premiumButtonView.setOverlayText(LocaleController.getString(R.string.PremiumMessageButton), false, false);
            linearLayout.addView(premiumButtonView, LayoutHelper.createLinear(-1, 48, 1, 0, 0, 0, 4));
        }
        bottomSheet.setCustomView(linearLayout);
        bottomSheet.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showPremiumSheet$4(BottomSheet bottomSheet, View view) {
        BaseFragment lastFragment = LaunchActivity.getLastFragment();
        if (lastFragment != null) {
            lastFragment.presentFragment(new PremiumPreviewFragment("contact"));
            bottomSheet.dismiss();
        }
    }
}
