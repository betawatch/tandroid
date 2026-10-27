package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Property;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.animation.Interpolator;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.wc;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public class k3 extends Dialog implements n2 {
    private static final boolean AVOID_SYSTEM_CUTOUT_FULLSCREEN = false;
    public static final /* synthetic */ int a = 0;
    private boolean allowCustomAnimation;
    protected boolean allowNestedScroll;
    private boolean applyBottomPadding;
    private boolean applyTopPadding;
    public r2 attachedFragment;
    protected j3 backDrawable;
    private int backgroundColorKey;
    protected int backgroundPaddingLeft;
    protected int backgroundPaddingTop;
    protected int behindKeyboardColor;
    protected int behindKeyboardColorKey;
    private boolean bigTitle;
    private int bottomInset;
    protected boolean calcMandatoryInsets;
    private boolean canDismissWithSwipe;
    private boolean canDismissWithTouchOutside;
    private int cellType;
    public final h3 container;
    protected ViewGroup containerView;
    protected int currentAccount;
    private float currentPanTranslationY;
    protected AnimatorSet currentSheetAnimation;
    protected int currentSheetAnimationType;
    private View customView;
    protected int customViewGravity;
    protected d3 delegate;
    protected boolean dimBehind;
    protected int dimBehindAlpha;
    private boolean disableScroll;
    private Runnable dismissRunnable;
    private boolean dismissed;
    private boolean dispatchingThemeColors;
    public boolean doNotOverlayNavigationBar;
    public boolean drawDoubleNavigationBar;
    public boolean drawNavigationBar;
    private int fixedNavBarColorKey;
    private boolean focusable;
    private int focusableSoftInputMode;
    private boolean forceKeyboardOnDismiss;
    private boolean fullHeight;
    protected boolean fullWidth;
    protected final oi.q glassEngine;
    private float hideSystemVerticalInsetsProgress;
    private int internalBackgroundColor;
    protected boolean isFullscreen;
    protected boolean isPortrait;
    private int[] itemIcons;
    private ArrayList<c3> itemViews;
    private CharSequence[] items;
    public ValueAnimator keyboardContentAnimator;
    protected int keyboardHeight;
    protected boolean keyboardVisible;
    private WindowInsets lastInsets;
    private int lastKeyboardHeight;
    private int layoutCount;
    private int leftInset;
    private boolean multipleLinesTitle;
    protected int navBarColor;
    protected int navBarColorKey;
    protected float navigationBarAlpha;
    protected ValueAnimator navigationBarAnimation;
    protected int navigationBarHeight;
    protected View nestedScrollChild;
    private AnimationNotificationsLocker notificationsLocker;
    public boolean occupyNavigationBar;
    public boolean occupyNavigationBarWithoutKeyboard;
    private DialogInterface.OnClickListener onClickListener;
    private DialogInterface.OnDismissListener onHideListener;
    public int openDuration;
    public Interpolator openInterpolator;
    private boolean openNoDelay;
    protected int openedLayerNum;
    private int overlayDrawNavBarColor;
    public boolean pauseAllHeavyOperations;
    protected int playingImagesLayerNum;
    protected u6 resourcesProvider;
    private int rightInset;
    public boolean scrollNavBar;
    private Integer selectedPos;
    protected Drawable shadowDrawable;
    private boolean showWithoutAnimation;
    boolean showing;
    private boolean skipDismissAnimation;
    private long smoothContainerViewLayoutUntil;
    public boolean smoothKeyboardAnimationEnabled;
    public boolean smoothKeyboardByBottom;
    protected Runnable startAnimationRunnable;
    private int statusBarHeight;
    private int tag;
    private PorterDuffColorFilter themedBackgroundFilter;
    private CharSequence title;
    private TextView titleView;
    public FrameLayout topBulletinContainer;
    private int touchSlop;
    private boolean transitionFromRight;
    public boolean useBackgroundTopPadding;
    private boolean useFastDismiss;
    protected boolean useHardwareLayer;
    protected boolean useLightNavBar;
    protected boolean useLightStatusBar;
    protected boolean useSmoothKeyboard;
    protected boolean waitingKeyboard;
    private ag.c1 windowVisibilityManager;

    public k3(Context context, u6 u6Var, boolean z10, boolean z11) {
        this(z11 ? 2 : 1, context, u6Var, z10);
    }

    public static void access$000(k3 k3Var) {
        int themedColor;
        Drawable drawable;
        int themedColor2;
        if (k3Var.backgroundColorKey >= 0 && (drawable = k3Var.shadowDrawable) != null && k3Var.themedBackgroundFilter != null && drawable.getColorFilter() == k3Var.themedBackgroundFilter && (themedColor2 = k3Var.getThemedColor(k3Var.backgroundColorKey)) != k3Var.internalBackgroundColor) {
            Drawable drawable2 = k3Var.shadowDrawable;
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(themedColor2, PorterDuff.Mode.MULTIPLY);
            k3Var.themedBackgroundFilter = porterDuffColorFilter;
            drawable2.setColorFilter(porterDuffColorFilter);
            k3Var.internalBackgroundColor = themedColor2;
            h3 h3Var = k3Var.container;
            if (h3Var != null) {
                h3Var.invalidate();
            }
            ViewGroup viewGroup = k3Var.containerView;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        int i10 = k3Var.fixedNavBarColorKey;
        if (i10 < 0 || k3Var.navBarColorKey >= 0 || k3Var.overlayDrawNavBarColor != k3Var.navBarColor || (themedColor = k3Var.getThemedColor(i10)) == k3Var.navBarColor) {
            return;
        }
        k3Var.navBarColor = themedColor;
        k3Var.overlayDrawNavBarColor = themedColor;
        h3 h3Var2 = k3Var.container;
        if (h3Var2 != null) {
            h3Var2.invalidate();
        }
        boolean z10 = ((double) AndroidUtilities.computePerceivedBrightness(themedColor)) > 0.721d;
        if (k3Var.attachedFragment != null) {
            AndroidUtilities.setLightNavigationBar(k3Var.getWindowView(), z10);
        } else {
            AndroidUtilities.setNavigationBarColor((Dialog) k3Var, themedColor, false);
            AndroidUtilities.setLightNavigationBar(k3Var, z10);
        }
    }

    public static /* synthetic */ int access$1112(k3 k3Var, int i10) {
        int i11 = k3Var.bottomInset + i10;
        k3Var.bottomInset = i11;
        return i11;
    }

    public static /* synthetic */ int access$1120(k3 k3Var, int i10) {
        int i11 = k3Var.bottomInset - i10;
        k3Var.bottomInset = i11;
        return i11;
    }

    public static int access$1500(k3 k3Var) {
        WindowInsets windowInsets;
        int i10;
        int i11;
        int i12;
        if (!k3Var.calcMandatoryInsets || (windowInsets = k3Var.lastInsets) == null) {
            return 0;
        }
        Insets systemGestureInsets = windowInsets.getSystemGestureInsets();
        if (k3Var.keyboardVisible || !k3Var.drawNavigationBar || systemGestureInsets == null) {
            return 0;
        }
        i10 = systemGestureInsets.left;
        if (i10 == 0) {
            i12 = systemGestureInsets.right;
            if (i12 == 0) {
                return 0;
            }
        }
        i11 = systemGestureInsets.bottom;
        return i11;
    }

    public static /* synthetic */ int access$1610(k3 k3Var) {
        int i10 = k3Var.layoutCount;
        k3Var.layoutCount = i10 - 1;
        return i10;
    }

    public static void access$2500(k3 k3Var) {
        if (k3Var.dismissed) {
            return;
        }
        int i10 = 0;
        k3Var.containerView.setVisibility(0);
        if (k3Var.onCustomOpenAnimation()) {
            return;
        }
        if (k3Var.useHardwareLayer) {
            k3Var.container.setLayerType(2, null);
        }
        if (k3Var.transitionFromRight) {
            k3Var.containerView.setTranslationX(AndroidUtilities.dp(48.0f));
            k3Var.containerView.setAlpha(0.0f);
            k3Var.containerView.setTranslationY(0.0f);
        } else {
            k3Var.containerView.setTranslationY(Math.max(0, Math.min(AndroidUtilities.navigationBarHeight, k3Var.getBottomInset())) + AndroidUtilities.dp(10.0f) + k3Var.getContainerViewHeight() + k3Var.keyboardHeight);
        }
        k3Var.onContainerViewTranslation();
        int i11 = 1;
        k3Var.currentSheetAnimationType = 1;
        ValueAnimator valueAnimator = k3Var.navigationBarAnimation;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(k3Var.navigationBarAlpha, 1.0f);
        k3Var.navigationBarAnimation = ofFloat;
        ofFloat.addUpdateListener(new t2(k3Var, i11));
        k3Var.currentSheetAnimation = new AnimatorSet();
        ArrayList<Animator> arrayList = new ArrayList<>();
        arrayList.add(ObjectAnimator.ofFloat(k3Var.containerView, (Property<ViewGroup, Float>) View.TRANSLATION_X, 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(k3Var.containerView, (Property<ViewGroup, Float>) View.ALPHA, 1.0f));
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(k3Var.containerView, (Property<ViewGroup, Float>) View.TRANSLATION_Y, 0.0f);
        ofFloat2.addUpdateListener(new t2(k3Var, 6));
        arrayList.add(ofFloat2);
        arrayList.add(ObjectAnimator.ofInt(k3Var.backDrawable, org.telegram.ui.Components.v6.d, k3Var.dimBehind ? k3Var.dimBehindAlpha : 0));
        arrayList.add(k3Var.navigationBarAnimation);
        k3Var.appendOpenAnimator(true, arrayList);
        k3Var.currentSheetAnimation.playTogether(arrayList);
        if (k3Var.transitionFromRight) {
            k3Var.currentSheetAnimation.setDuration(250L);
            k3Var.currentSheetAnimation.setInterpolator(ds.f);
        } else {
            k3Var.currentSheetAnimation.setDuration(k3Var.openDuration);
            k3Var.currentSheetAnimation.setInterpolator(k3Var.openInterpolator);
        }
        k3Var.currentSheetAnimation.setStartDelay(k3Var.waitingKeyboard ? 0L : 20L);
        k3Var.currentSheetAnimation.setInterpolator(k3Var.openInterpolator);
        k3Var.notificationsLocker.lock();
        k3Var.currentSheetAnimation.addListener(new a3(k3Var, i10));
        if (k3Var.pauseAllHeavyOperations) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        }
        k3Var.currentSheetAnimation.start();
    }

    public static /* synthetic */ DialogInterface.OnClickListener access$2902(k3 k3Var, DialogInterface.OnClickListener onClickListener) {
        k3Var.onClickListener = onClickListener;
        return onClickListener;
    }

    public static /* synthetic */ CharSequence[] access$3102(k3 k3Var, CharSequence[] charSequenceArr) {
        k3Var.items = charSequenceArr;
        return charSequenceArr;
    }

    public static /* synthetic */ CharSequence access$3302(k3 k3Var, CharSequence charSequence) {
        k3Var.title = charSequence;
        return charSequence;
    }

    public static /* synthetic */ boolean access$3402(k3 k3Var, boolean z10) {
        k3Var.bigTitle = z10;
        return z10;
    }

    public static /* synthetic */ WindowInsets h(k3 k3Var, WindowInsets windowInsets) {
        k3Var.processLegacyContainerInsets(windowInsets);
        return Build.VERSION.SDK_INT >= 30 ? WindowInsets.CONSUMED : windowInsets.consumeSystemWindowInsets();
    }

    public static /* synthetic */ void i(k3 k3Var, ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        k3Var.setItemColor(k3Var.selectedPos.intValue(), intValue, intValue);
    }

    public static /* synthetic */ void j(k3 k3Var, ValueAnimator valueAnimator) {
        k3Var.hideSystemVerticalInsetsProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        k3Var.container.requestLayout();
        k3Var.containerView.requestLayout();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public boolean attachedToParent() {
        h3 h3Var = this.container;
        return h3Var != null && h3Var.isAttachedToWindow();
    }

    public boolean canDismissWithSwipe() {
        return this.canDismissWithSwipe;
    }

    public boolean canDismissWithTouchOutside() {
        return this.canDismissWithTouchOutside;
    }

    public boolean canSwipeToBack(MotionEvent motionEvent) {
        return false;
    }

    public void cancelSheetAnimation() {
        AnimatorSet animatorSet = this.currentSheetAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.currentSheetAnimation = null;
        }
        this.currentSheetAnimationType = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0164  */
    @Override // android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.n2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void dismiss() {
        long j10;
        qc qcVar;
        d3 d3Var = this.delegate;
        if ((d3Var == null || d3Var.g()) && !this.dismissed) {
            int i10 = 1;
            this.dismissed = true;
            DialogInterface.OnDismissListener onDismissListener = this.onHideListener;
            if (onDismissListener != null) {
                onDismissListener.onDismiss(this);
            }
            cancelSheetAnimation();
            onDismissAnimationStart();
            int i11 = 0;
            if (this.skipDismissAnimation) {
                AndroidUtilities.runOnUIThread(new s2(this, i11));
            } else if (!this.allowCustomAnimation || !onCustomCloseAnimation()) {
                AndroidUtilities.hideKeyboard(this.container);
                this.currentSheetAnimationType = 2;
                ValueAnimator valueAnimator = this.navigationBarAnimation;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.navigationBarAlpha, 0.0f);
                this.navigationBarAnimation = ofFloat;
                ofFloat.addUpdateListener(new t2(this, i11));
                this.currentSheetAnimation = new AnimatorSet();
                ArrayList<Animator> arrayList = new ArrayList<>();
                ViewGroup viewGroup = this.containerView;
                if (viewGroup != null) {
                    if (this.transitionFromRight) {
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(viewGroup, (Property<ViewGroup, Float>) View.TRANSLATION_X, AndroidUtilities.dp(48.0f));
                        ofFloat2.addUpdateListener(new t2(this, 3));
                        arrayList.add(ofFloat2);
                        arrayList.add(ObjectAnimator.ofFloat(this.containerView, (Property<ViewGroup, Float>) View.ALPHA, 0.0f));
                    } else {
                        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(viewGroup, (Property<ViewGroup, Float>) View.TRANSLATION_Y, Math.max(0, Math.min(AndroidUtilities.navigationBarHeight, getBottomInset())) + AndroidUtilities.dp(10.0f) + getContainerViewHeight() + (this.forceKeyboardOnDismiss ? this.lastKeyboardHeight : this.keyboardHeight));
                        ofFloat3.addUpdateListener(new t2(this, 4));
                        arrayList.add(ofFloat3);
                    }
                }
                arrayList.add(ObjectAnimator.ofInt(this.backDrawable, org.telegram.ui.Components.v6.d, 0));
                arrayList.add(this.navigationBarAnimation);
                appendOpenAnimator(false, arrayList);
                this.currentSheetAnimation.playTogether(arrayList);
                if (this.transitionFromRight) {
                    this.currentSheetAnimation.setDuration(200L);
                    this.currentSheetAnimation.setInterpolator(ds.f);
                    j10 = 0;
                } else {
                    j10 = 250;
                    this.currentSheetAnimation.setDuration(250L);
                    this.currentSheetAnimation.setInterpolator(ds.g);
                }
                this.currentSheetAnimation.addListener(new a3(this, i10));
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                this.currentSheetAnimation.start();
                qcVar = qc.x;
                if (qcVar != null && qcVar.m && qcVar.s) {
                    if (j10 <= 0) {
                        qcVar.c((long) (j10 * 0.6f), MessagesController.getGlobalMainSettings().getBoolean("view_animations", true));
                    } else {
                        qcVar.b();
                    }
                }
                l(false);
            }
            j10 = 0;
            qcVar = qc.x;
            if (qcVar != null) {
                if (j10 <= 0) {
                }
            }
            l(false);
        }
    }

    public void dismissInternal() {
        r2 r2Var = this.attachedFragment;
        if (r2Var != null) {
            r2Var.removeSheet(this);
            AndroidUtilities.removeFromParent(this.container);
        } else {
            try {
                super.dismiss();
            } catch (Exception e) {
                FileLog.e((Throwable) e, false);
            }
        }
    }

    public void dismissWithButtonClick(int i10) {
        if (this.dismissed) {
            return;
        }
        this.dismissed = true;
        cancelSheetAnimation();
        this.currentSheetAnimationType = 2;
        this.currentSheetAnimation = new AnimatorSet();
        int i11 = 0;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.containerView, (Property<ViewGroup, Float>) View.TRANSLATION_Y, Math.max(0, Math.min(AndroidUtilities.navigationBarHeight, getBottomInset())) + AndroidUtilities.dp(10.0f) + getContainerViewHeight() + this.keyboardHeight);
        ofFloat.addUpdateListener(new t2(this, 2));
        this.currentSheetAnimation.playTogether(ofFloat, ObjectAnimator.ofInt(this.backDrawable, org.telegram.ui.Components.v6.d, 0));
        this.currentSheetAnimation.setDuration(this.cellType == 4 ? 330L : 180L);
        this.currentSheetAnimation.setInterpolator(ds.g);
        this.currentSheetAnimation.addListener(new b3(this, i10, i11));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        this.currentSheetAnimation.start();
        if (this.cellType != 4 || this.selectedPos == null) {
            return;
        }
        int currentTextColor = getItemViews().get(this.selectedPos.intValue()).getTextView().getCurrentTextColor();
        int currentTextColor2 = getItemViews().get(i10).getTextView().getCurrentTextColor();
        ValueAnimator ofArgb = ValueAnimator.ofArgb(currentTextColor, currentTextColor2);
        ofArgb.addUpdateListener(new t2(this, 7));
        ofArgb.setDuration(130L);
        ds dsVar = ds.f;
        ofArgb.setInterpolator(dsVar);
        ofArgb.start();
        ValueAnimator ofArgb2 = ValueAnimator.ofArgb(currentTextColor2, currentTextColor);
        ofArgb2.addUpdateListener(new u2(this, i10, i11));
        ofArgb2.setDuration(130L);
        ofArgb2.setInterpolator(dsVar);
        ofArgb2.start();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.dismissed) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void fixNavigationBar() {
        fixNavigationBarKey(y6.a7);
    }

    public void fixNavigationBarKey(int i10) {
        fixNavigationBar(getThemedColor(i10));
        this.fixedNavBarColorKey = i10;
    }

    public void forceKeyboardOnDismiss() {
        this.forceKeyboardOnDismiss = true;
    }

    public Drawable getBackDrawable() {
        return this.backDrawable;
    }

    public int getBackgroundPaddingLeft() {
        return this.backgroundPaddingLeft;
    }

    public int getBackgroundPaddingTop() {
        return this.backgroundPaddingTop;
    }

    public int getBottomInset() {
        return (int) ((1.0f - this.hideSystemVerticalInsetsProgress) * this.bottomInset);
    }

    public int getBottomSheetWidth(boolean z10, int i10, int i11) {
        return z10 ? i10 : (int) Math.max(i10 * 0.8f, Math.min(AndroidUtilities.dp(480.0f), i10));
    }

    public wc getBulletinFactory() {
        return new wc(this.topBulletinContainer, this.resourcesProvider);
    }

    public h3 getContainer() {
        return this.container;
    }

    public ViewGroup getContainerView() {
        return this.containerView;
    }

    public int getContainerViewHeight() {
        ViewGroup viewGroup = this.containerView;
        if (viewGroup == null) {
            return 0;
        }
        return viewGroup.getMeasuredHeight();
    }

    public int getCurrentAccount() {
        return this.currentAccount;
    }

    public ArrayList<c3> getItemViews() {
        return this.itemViews;
    }

    public int getLeftInset() {
        if (this.lastInsets == null) {
            return 0;
        }
        return (int) ((1.0f - this.hideSystemVerticalInsetsProgress) * r0.getSystemWindowInsetLeft());
    }

    @Override // org.telegram.ui.ActionBar.n2
    public int getNavigationBarColor(int i10) {
        float f7;
        ViewGroup viewGroup;
        if (!attachedToParent() || (viewGroup = this.containerView) == null) {
            f7 = 0.0f;
        } else if (this.transitionFromRight) {
            f7 = viewGroup.getAlpha();
        } else {
            f7 = Utilities.clamp01(1.0f - (this.containerView.getTranslationY() / ((AndroidUtilities.dp(10.0f) + (getContainerViewHeight() + this.keyboardHeight)) + (this.scrollNavBar ? Math.max(0, Math.min(AndroidUtilities.navigationBarHeight, getBottomInset())) : 0))));
        }
        return i0.a.f(f7, i10, this.navBarColor);
    }

    public u6 getResourcesProvider() {
        return this.resourcesProvider;
    }

    public int getRightInset() {
        if (this.lastInsets == null) {
            return 0;
        }
        return (int) ((1.0f - this.hideSystemVerticalInsetsProgress) * r0.getSystemWindowInsetRight());
    }

    public int getSheetAnimationType() {
        return this.currentSheetAnimationType;
    }

    public ViewGroup getSheetContainer() {
        return this.containerView;
    }

    public int getStatusBarHeight() {
        return (int) ((1.0f - this.hideSystemVerticalInsetsProgress) * this.statusBarHeight);
    }

    public int getSystemBottomInset() {
        WindowInsets windowInsets = this.lastInsets;
        if (windowInsets != null) {
            return windowInsets.getSystemWindowInsetBottom();
        }
        return 0;
    }

    public int getTag() {
        return this.tag;
    }

    public int getTargetOpenTranslationY() {
        return 0;
    }

    public ArrayList<h7> getThemeDescriptions() {
        return null;
    }

    public int getThemedColor(int i10) {
        return y6.w0(i10, this.resourcesProvider);
    }

    public TextView getTitleView() {
        return this.titleView;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public View getWindowView() {
        return this.container;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public boolean isAttachedLightStatusBar() {
        return this.useLightStatusBar;
    }

    public boolean isDismissed() {
        return this.dismissed;
    }

    public boolean isFocusable() {
        return this.focusable;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public boolean isFullyVisible() {
        return false;
    }

    public boolean isKeyboardVisible() {
        return this.keyboardVisible;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public boolean isShown() {
        return !this.dismissed;
    }

    public boolean isTouchOutside(float f7, float f10) {
        FrameLayout frameLayout = this.topBulletinContainer;
        if (frameLayout != null && frameLayout.getChildCount() > 0) {
            View childAt = this.topBulletinContainer.getChildAt(0);
            if (f10 >= childAt.getY() + this.topBulletinContainer.getY()) {
                if (f10 <= childAt.getY() + this.topBulletinContainer.getY() + childAt.getHeight()) {
                    if (f7 >= childAt.getX() + this.topBulletinContainer.getX()) {
                        if (f7 <= childAt.getX() + this.topBulletinContainer.getX() + childAt.getWidth()) {
                            return false;
                        }
                    }
                }
            }
        }
        return f10 < ((float) this.containerView.getTop()) || f7 < ((float) this.containerView.getLeft()) || f7 > ((float) this.containerView.getRight());
    }

    public final void k() {
        Window window;
        int i10;
        r2 r2Var = this.attachedFragment;
        if (r2Var != null) {
            r2Var.addSheet(this);
            if (this.attachedFragment.getLayoutContainer() == null) {
                return;
            }
            if (((InputMethodManager) getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.attachedFragment.getLayoutContainer().getWindowToken(), 2)) {
                AndroidUtilities.runOnUIThread(new s2(this, 1), 80L);
            } else {
                AndroidUtilities.removeFromParent(this.container);
                this.attachedFragment.getLayoutContainer().addView(this.container);
            }
            window = null;
        } else {
            window = getWindow();
            window.setWindowAnimations(R.style.DialogNoAnimation);
            setContentView(this.container, new ViewGroup.LayoutParams(-1, -1));
        }
        if (this.useLightStatusBar && y6.x0(null, y6.s8, true) == -1) {
            this.container.setSystemUiVisibility(this.container.getSystemUiVisibility() | 8192);
        }
        if (this.useLightNavBar && Build.VERSION.SDK_INT >= 26) {
            AndroidUtilities.setLightNavigationBar((Dialog) this, false);
        }
        if (this.containerView == null) {
            x2 x2Var = new x2(this, getContext(), 0);
            this.containerView = x2Var;
            x2Var.setBackgroundDrawable(this.shadowDrawable);
            this.containerView.setPadding(this.backgroundPaddingLeft, ((this.applyTopPadding ? AndroidUtilities.dp(8.0f) : 0) + this.backgroundPaddingTop) - 1, this.backgroundPaddingLeft, this.applyBottomPadding ? AndroidUtilities.dp(8.0f) : 0);
        }
        this.containerView.setVisibility(4);
        this.container.addView(this.containerView, 0, kb1.i(-1, -2, 80));
        if (this.topBulletinContainer == null) {
            FrameLayout frameLayout = new FrameLayout(getContext());
            this.topBulletinContainer = frameLayout;
            h3 h3Var = this.container;
            h3Var.addView(frameLayout, h3Var.indexOfChild(this.containerView) + 1, kb1.i(-1, -2, 80));
        }
        if (this.title != null) {
            y2 y2Var = new y2(this, getContext());
            this.titleView = y2Var;
            y2Var.setText(this.title);
            if (this.bigTitle) {
                f7.V(this.titleView, y6.j5, this.resourcesProvider);
                this.titleView.setTextSize(1, 20.0f);
                this.titleView.setTypeface(AndroidUtilities.bold());
                this.titleView.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(this.multipleLinesTitle ? 14.0f : 6.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(8.0f));
            } else {
                f7.V(this.titleView, y6.q5, this.resourcesProvider);
                this.titleView.setTextSize(1, 16.0f);
                this.titleView.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(this.multipleLinesTitle ? 8.0f : 0.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
            }
            if (this.multipleLinesTitle) {
                this.titleView.setSingleLine(false);
                this.titleView.setMaxLines(5);
                this.titleView.setEllipsize(TextUtils.TruncateAt.END);
            } else {
                this.titleView.setLines(1);
                this.titleView.setSingleLine(true);
                this.titleView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
            }
            this.titleView.setGravity(16);
            i10 = 48;
            this.containerView.addView(this.titleView, kb1.g(this.multipleLinesTitle ? -2.0f : 48, -1));
            this.titleView.setOnTouchListener(new ei.d(1));
        } else {
            i10 = 0;
        }
        View view = this.customView;
        if (view != null) {
            if (view.getParent() != null) {
                ((ViewGroup) this.customView.getParent()).removeView(this.customView);
            }
            if (this.useBackgroundTopPadding) {
                this.containerView.addView(this.customView, kb1.h(-1, -2.0f, this.customViewGravity, 0.0f, i10, 0.0f, 0.0f));
            } else {
                this.containerView.setClipToPadding(false);
                this.containerView.setClipChildren(false);
                this.container.setClipToPadding(false);
                this.container.setClipChildren(false);
                float f7 = i10;
                this.containerView.addView(this.customView, kb1.h(-1, -2.0f, this.customViewGravity, 0.0f, f7, 0.0f, 0.0f));
                ((ViewGroup.MarginLayoutParams) this.customView.getLayoutParams()).topMargin = AndroidUtilities.dp(f7) + (-this.backgroundPaddingTop);
            }
        } else if (this.items != null) {
            int i11 = 0;
            while (true) {
                CharSequence[] charSequenceArr = this.items;
                if (i11 >= charSequenceArr.length) {
                    break;
                }
                if (charSequenceArr[i11] != null) {
                    c3 c3Var = new c3(getContext(), this.cellType, this.resourcesProvider);
                    CharSequence charSequence = this.items[i11];
                    int[] iArr = this.itemIcons;
                    c3Var.a(charSequence, iArr != null ? iArr[i11] : 0, null, this.bigTitle);
                    this.containerView.addView(c3Var, kb1.h(-1, 48.0f, 51, 0.0f, i10, 0.0f, 0.0f));
                    i10 += 48;
                    c3Var.setTag(Integer.valueOf(i11));
                    c3Var.setOnClickListener(new x(this, 2));
                    this.itemViews.add(c3Var);
                }
                i11++;
            }
        }
        if (this.attachedFragment == null && window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            attributes.gravity = 51;
            attributes.dimAmount = 0.0f;
            int i12 = attributes.flags & (-3);
            attributes.flags = i12;
            if (this.focusable) {
                attributes.softInputMode = this.focusableSoftInputMode;
            } else {
                attributes.flags = i12 | 131072;
            }
            if (this.isFullscreen) {
                attributes.flags |= -2147416832;
                this.container.setSystemUiVisibility(1284);
            }
            attributes.height = -1;
            AndroidUtilities.applyEdgeToEdgeLayoutParams(attributes);
            window.setAttributes(attributes);
        }
    }

    public final void l(boolean z10) {
        if (this.showing == z10) {
            return;
        }
        this.showing = z10;
        if (this.openedLayerNum > 0) {
            if (z10) {
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, Integer.valueOf(this.openedLayerNum));
            } else {
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, Integer.valueOf(this.openedLayerNum));
            }
        }
    }

    public void makeAttached(r2 r2Var) {
        if (AndroidUtilities.isTablet()) {
            return;
        }
        if (r2Var == null || !r2Var.isSupportEdgeToEdge()) {
            this.attachedFragment = r2Var;
            j3 j3Var = this.backDrawable;
            if (j3Var != null) {
                j3Var.a.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
            }
        }
    }

    public ag.a1 obtainWindowVisibilityController() {
        if (this.windowVisibilityManager == null) {
            this.windowVisibilityManager = new ag.c1(getWindow());
        }
        ag.c1 c1Var = this.windowVisibilityManager;
        c1Var.getClass();
        return new ag.b1(c1Var, 0);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public boolean onAttachedBackPressed() {
        onBackPressed();
        return true;
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        if (this.attachedFragment == null) {
            super.onBackPressed();
        } else {
            dismiss();
        }
    }

    public boolean onContainerTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public void onContainerTranslationYChanged(float f7) {
        h3 h3Var = this.container;
        if (h3Var != null) {
            h3Var.invalidate();
        }
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        k();
    }

    public boolean onCustomCloseAnimation() {
        return false;
    }

    public boolean onCustomLayout(View view, int i10, int i11, int i12, int i13) {
        return false;
    }

    public boolean onCustomMeasure(View view, int i10, int i11) {
        return false;
    }

    public boolean onCustomOpenAnimation() {
        return false;
    }

    public void onDismissWithTouchOutside() {
        dismiss();
    }

    public boolean onScrollUp(float f7) {
        return false;
    }

    public void onSmoothContainerViewLayout(float f7) {
        h3 h3Var = this.container;
        if (h3Var != null) {
            h3Var.invalidate();
        }
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onThemeColorsChanged() {
        if (!(this instanceof p6) || this.dispatchingThemeColors) {
            return;
        }
        this.dispatchingThemeColors = true;
        try {
            ((p6) this).updateColors();
        } catch (Exception e) {
            FileLog.e(e);
        } finally {
            this.dispatchingThemeColors = false;
        }
    }

    public void processLegacyContainerInsets(WindowInsets windowInsets) {
        if (windowInsets == null) {
            return;
        }
        int systemWindowInsetTop = windowInsets.getSystemWindowInsetTop();
        if ((systemWindowInsetTop != 0 || AndroidUtilities.isInMultiwindow) && this.statusBarHeight != systemWindowInsetTop) {
            this.statusBarHeight = systemWindowInsetTop;
        }
        this.lastInsets = windowInsets;
        this.container.requestLayout();
        onInsetsChanged();
    }

    public void release() {
        dismissInternal();
    }

    public void setAllowNestedScroll(boolean z10) {
        this.allowNestedScroll = z10;
        if (z10) {
            return;
        }
        this.containerView.setTranslationY(0.0f);
        onContainerViewTranslation();
    }

    public void setApplyBottomPadding(boolean z10) {
        this.applyBottomPadding = z10;
    }

    public void setApplyTopPadding(boolean z10) {
        this.applyTopPadding = z10;
    }

    public void setBackgroundColor(int i10) {
        this.shadowDrawable.setColorFilter(i10, PorterDuff.Mode.MULTIPLY);
        if (this.internalBackgroundColor != i10) {
            this.internalBackgroundColor = i10;
            h3 h3Var = this.container;
            if (h3Var != null) {
                int measuredHeight = h3Var.getMeasuredHeight();
                h3 h3Var2 = this.container;
                h3Var.invalidate(0, measuredHeight - h3Var2.w, h3Var2.getMeasuredWidth(), this.container.getMeasuredHeight());
            }
        }
    }

    public void setBackgroundColorKey(int i10) {
        setBackgroundColor(getThemedColor(i10));
        Drawable drawable = this.shadowDrawable;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(this.internalBackgroundColor, PorterDuff.Mode.MULTIPLY);
        this.themedBackgroundFilter = porterDuffColorFilter;
        drawable.setColorFilter(porterDuffColorFilter);
        this.backgroundColorKey = i10;
    }

    public void setCalcMandatoryInsets(boolean z10) {
        this.calcMandatoryInsets = z10;
        this.drawNavigationBar = z10;
    }

    public void setCanDismissWithSwipe(boolean z10) {
        this.canDismissWithSwipe = z10;
    }

    public void setCanDismissWithTouchOutside(boolean z10) {
        this.canDismissWithTouchOutside = z10;
    }

    public void setCurrentPanTranslationY(float f7) {
        this.currentPanTranslationY = f7;
        this.container.invalidate();
    }

    public void setCustomView(View view) {
        this.customView = view;
    }

    public void setDelegate(d3 d3Var) {
        this.delegate = d3Var;
    }

    public k3 setDimBehind(boolean z10) {
        this.dimBehind = z10;
        return this;
    }

    public void setDimBehindAlpha(int i10) {
        this.dimBehindAlpha = i10;
    }

    public void setDisableScroll(boolean z10) {
        this.disableScroll = z10;
    }

    public void setFocusable(boolean z10) {
        if (this.focusable == z10) {
            return;
        }
        this.focusable = z10;
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        if (this.focusable) {
            attributes.softInputMode = this.focusableSoftInputMode;
            attributes.flags &= -131073;
        } else {
            attributes.softInputMode = 48;
            attributes.flags |= 131072;
        }
        window.setAttributes(attributes);
    }

    public void setHideSystemVerticalInsets(boolean z10) {
        ValueAnimator duration = ValueAnimator.ofFloat(this.hideSystemVerticalInsetsProgress, z10 ? 1.0f : 0.0f).setDuration(180L);
        duration.setInterpolator(ds.f);
        duration.addUpdateListener(new t2(this, 5));
        duration.start();
    }

    public void setImageReceiverNumLevel(int i10, int i11) {
        this.playingImagesLayerNum = i10;
        this.openedLayerNum = i11;
    }

    public void setItemColor(int i10, int i11, int i12) {
        if (i10 < 0 || i10 >= this.itemViews.size()) {
            return;
        }
        c3 c3Var = this.itemViews.get(i10);
        c3Var.a.setTextColor(i11);
        c3Var.b.setColorFilter(new PorterDuffColorFilter(i12, PorterDuff.Mode.MULTIPLY));
    }

    public void setItemText(int i10, CharSequence charSequence) {
        if (i10 < 0 || i10 >= this.itemViews.size()) {
            return;
        }
        this.itemViews.get(i10).a.setText(charSequence);
    }

    public void setItems(CharSequence[] charSequenceArr, int[] iArr, DialogInterface.OnClickListener onClickListener) {
        this.items = charSequenceArr;
        this.itemIcons = iArr;
        this.onClickListener = onClickListener;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public void setOnDismissListener(Runnable runnable) {
        if (runnable != null) {
            setOnHideListener(new s1(runnable, 1));
        }
    }

    public void setOnHideListener(DialogInterface.OnDismissListener onDismissListener) {
        this.onHideListener = onDismissListener;
    }

    public void setOpenNoDelay(boolean z10) {
        this.openNoDelay = z10;
    }

    public void setOverlayNavBarColor(int i10) {
        this.overlayDrawNavBarColor = i10;
        h3 h3Var = this.container;
        if (h3Var != null) {
            h3Var.invalidate();
        }
        if (this.attachedFragment != null) {
            LaunchActivity.I1.H(true, true, true);
            AndroidUtilities.setLightNavigationBar(getWindowView(), AndroidUtilities.computePerceivedBrightness(getNavigationBarColor(getThemedColor(y6.a7))) >= 0.721f);
        } else {
            AndroidUtilities.setNavigationBarColor(this, this.overlayDrawNavBarColor);
            AndroidUtilities.setLightNavigationBar(this, ((double) AndroidUtilities.computePerceivedBrightness(this.overlayDrawNavBarColor)) > 0.721d);
        }
    }

    public void setShowWithoutAnimation(boolean z10) {
        this.showWithoutAnimation = z10;
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        setTitle(charSequence, false);
    }

    public void setTitleColor(int i10) {
        TextView textView = this.titleView;
        if (textView == null) {
            return;
        }
        textView.setTextColor(i10);
    }

    public void setUseLightStatusBar(boolean z10) {
        this.useLightStatusBar = z10;
        int x02 = y6.x0(null, y6.s8, true);
        int systemUiVisibility = this.container.getSystemUiVisibility();
        this.container.setSystemUiVisibility((this.useLightStatusBar && x02 == -1) ? systemUiVisibility | 8192 : systemUiVisibility & (-8193));
        if (this.attachedFragment != null) {
            LaunchActivity.I1.H(true, true, true);
        }
    }

    public boolean shouldOverlayCameraViewOverNavBar() {
        return false;
    }

    @Override // android.app.Dialog
    public void show() {
        if (AndroidUtilities.isSafeToShow(getContext())) {
            if (this.attachedFragment != null) {
                k();
            } else {
                super.show();
            }
            l(true);
            if (this.focusable) {
                getWindow().setSoftInputMode(this.focusableSoftInputMode);
            }
            this.dismissed = false;
            cancelSheetAnimation();
            this.containerView.measure(View.MeasureSpec.makeMeasureSpec((this.backgroundPaddingLeft * 2) + AndroidUtilities.displaySize.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, TLObject.FLAG_31));
            if (this.showWithoutAnimation) {
                this.backDrawable.setAlpha(this.dimBehind ? this.dimBehindAlpha : 0);
                this.containerView.setTranslationY(0.0f);
                onContainerViewTranslation();
                return;
            }
            this.backDrawable.setAlpha(0);
            this.layoutCount = 2;
            this.containerView.setTranslationY(((1.0f - this.hideSystemVerticalInsetsProgress) * AndroidUtilities.statusBarHeight) + r1.getMeasuredHeight() + (this.scrollNavBar ? Math.max(0, Math.min(AndroidUtilities.navigationBarHeight, getBottomInset())) : 0));
            onContainerViewTranslation();
            long j10 = this.openNoDelay ? 0L : 150L;
            if (this.waitingKeyboard) {
                j10 = 500;
            }
            z2 z2Var = new z2(this, 0);
            this.startAnimationRunnable = z2Var;
            AndroidUtilities.runOnUIThread(z2Var, j10);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public boolean showDialog(Dialog dialog) {
        return false;
    }

    public void skipDismissAnimation() {
        this.skipDismissAnimation = true;
    }

    public void smoothContainerViewLayout() {
        this.smoothContainerViewLayoutUntil = System.currentTimeMillis() + 80;
    }

    public void transitionFromRight(boolean z10) {
        this.transitionFromRight = z10;
    }

    public k3(Context context, boolean z10) {
        this(1, context, (u6) null, z10);
    }

    public void fixNavigationBar(int i10) {
        this.drawNavigationBar = !this.occupyNavigationBar;
        this.drawDoubleNavigationBar = true;
        this.scrollNavBar = true;
        this.navBarColorKey = -1;
        this.fixedNavBarColorKey = -1;
        this.navBarColor = i10;
        setOverlayNavBarColor(i10);
    }

    @Override // android.app.Dialog
    public void setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        super.setOnDismissListener(onDismissListener);
    }

    public void setTitle(CharSequence charSequence, boolean z10) {
        this.title = charSequence;
        this.bigTitle = z10;
    }

    public k3(int i10, Context context, u6 u6Var, boolean z10) {
        super(context, R.style.TransparentDialog);
        this.currentAccount = UserConfig.selectedAccount;
        this.useHardwareLayer = true;
        this.backDrawable = new j3();
        this.useLightStatusBar = true;
        int i11 = y6.h5;
        this.behindKeyboardColorKey = i11;
        this.canDismissWithSwipe = true;
        this.canDismissWithTouchOutside = true;
        this.allowCustomAnimation = true;
        this.statusBarHeight = AndroidUtilities.statusBarHeight;
        this.openDuration = 400;
        this.openInterpolator = ds.h;
        this.focusableSoftInputMode = 16;
        this.dimBehind = true;
        this.dimBehindAlpha = 51;
        this.allowNestedScroll = true;
        this.applyTopPadding = true;
        this.applyBottomPadding = true;
        this.itemViews = new ArrayList<>();
        this.dismissRunnable = new s2(this, 2);
        this.navigationBarAlpha = 0.0f;
        this.navBarColorKey = y6.a7;
        this.pauseAllHeavyOperations = true;
        this.notificationsLocker = new AnimationNotificationsLocker();
        this.useBackgroundTopPadding = true;
        this.customViewGravity = 51;
        this.glassEngine = new oi.q();
        this.fixedNavBarColorKey = -1;
        this.backgroundColorKey = i11;
        this.smoothContainerViewLayoutUntil = -1L;
        this.resourcesProvider = u6Var;
        if (i10 == 3) {
            AndroidUtilities.enableEdgeToEdge(getWindow());
            this.drawNavigationBar = false;
            this.doNotOverlayNavigationBar = false;
            this.drawDoubleNavigationBar = false;
        }
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 30) {
            getWindow().addFlags(-2147483392);
            if (i10 != 1) {
                this.focusableSoftInputMode = 48;
            }
        } else {
            getWindow().addFlags(-2147417856);
        }
        this.touchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        Rect rect = new Rect();
        i3 i3Var = new i3(context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate());
        this.shadowDrawable = i3Var;
        int themedColor = getThemedColor(i11);
        this.internalBackgroundColor = themedColor;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY);
        this.themedBackgroundFilter = porterDuffColorFilter;
        i3Var.setColorFilter(porterDuffColorFilter);
        this.shadowDrawable.getPadding(rect);
        this.backgroundPaddingLeft = rect.left;
        this.backgroundPaddingTop = rect.top;
        w2 w2Var = new w2(this, getContext());
        this.container = w2Var;
        w2Var.setClipChildren(false);
        w2Var.setClipToPadding(false);
        w2Var.setBackground(this.backDrawable);
        this.focusable = z10;
        if (i10 == 1) {
            w2Var.setFitsSystemWindows(true);
            w2Var.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: org.telegram.ui.ActionBar.v2
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    return k3.h(k3.this, windowInsets);
                }
            });
        }
        if (i12 >= 30) {
            w2Var.setSystemUiVisibility(1792);
        } else {
            w2Var.setSystemUiVisibility(1280);
        }
        this.backDrawable.setAlpha(0);
        if (i10 == 3) {
            p pVar = new p(this, 5);
            WeakHashMap weakHashMap = r0.i0.a;
            r0.a0.i(w2Var, pVar);
        }
    }

    public void onContainerViewTranslation() {
    }

    public void onDismissAnimationStart() {
    }

    public void onInsetsChanged() {
    }

    public void onOpenAnimationEnd() {
    }

    public void onSwipeStarts() {
    }

    public void addThemeColorKeys(HashSet<Integer> hashSet) {
    }

    public void mainContainerDispatchDraw(Canvas canvas) {
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onContainerDraw(Canvas canvas) {
    }

    public void onScrollUpBegin(float f7) {
    }

    public void onScrollUpEnd(float f7) {
    }

    @Override // org.telegram.ui.ActionBar.n2
    public void setKeyboardHeightFromParent(int i10) {
    }

    public /* synthetic */ void setLastVisible(boolean z10) {
    }

    public void appendOpenAnimator(boolean z10, ArrayList<Animator> arrayList) {
    }

    public r0.k1 onApplyWindowInsetsToRoot(View view, r0.k1 k1Var) {
        return k1Var;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public void dismiss(boolean z10) {
        dismiss();
    }

    public void onContainerLayout(int i10, int i11, int i12, int i13) {
    }
}
