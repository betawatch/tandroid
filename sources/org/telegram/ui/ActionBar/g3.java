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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.qc;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public class g3 extends Dialog implements l2 {
    private static final boolean AVOID_SYSTEM_CUTOUT_FULLSCREEN = false;
    public static final /* synthetic */ int a = 0;
    private boolean allowCustomAnimation;
    protected boolean allowNestedScroll;
    private boolean applyBottomPadding;
    private boolean applyTopPadding;
    public p2 attachedFragment;
    protected f3 backDrawable;
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
    public e3 container;
    protected ViewGroup containerView;
    protected int currentAccount;
    private float currentPanTranslationY;
    protected AnimatorSet currentSheetAnimation;
    protected int currentSheetAnimationType;
    private View customView;
    protected int customViewGravity;
    protected a3 delegate;
    protected boolean dimBehind;
    protected int dimBehindAlpha;
    private boolean disableScroll;
    private Runnable dismissRunnable;
    private boolean dismissed;
    public boolean doNotOverlayNavigationBar;
    public boolean drawDoubleNavigationBar;
    public boolean drawNavigationBar;
    private boolean focusable;
    private int focusableSoftInputMode;
    private boolean forceKeyboardOnDismiss;
    private boolean fullHeight;
    protected boolean fullWidth;
    private float hideSystemVerticalInsetsProgress;
    private int internalBackgroundColor;
    protected boolean isFullscreen;
    protected boolean isPortrait;
    private int[] itemIcons;
    private ArrayList<z2> itemViews;
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
    protected f6 resourcesProvider;
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
    private lf.t0 windowVisibilityManager;

    public g3(Context context, boolean z4) {
        this(context, null, z4, false);
    }

    public static /* synthetic */ int access$1012(g3 g3Var, int i10) {
        int i11 = g3Var.bottomInset + i10;
        g3Var.bottomInset = i11;
        return i11;
    }

    public static /* synthetic */ int access$1020(g3 g3Var, int i10) {
        int i11 = g3Var.bottomInset - i10;
        g3Var.bottomInset = i11;
        return i11;
    }

    public static int access$1400(g3 g3Var) {
        WindowInsets windowInsets;
        int i10;
        int i11;
        int i12;
        if (!g3Var.calcMandatoryInsets || (windowInsets = g3Var.lastInsets) == null) {
            return 0;
        }
        Insets systemGestureInsets = windowInsets.getSystemGestureInsets();
        if (g3Var.keyboardVisible || !g3Var.drawNavigationBar || systemGestureInsets == null) {
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

    public static /* synthetic */ int access$1510(g3 g3Var) {
        int i10 = g3Var.layoutCount;
        g3Var.layoutCount = i10 - 1;
        return i10;
    }

    public static void access$2400(g3 g3Var) {
        if (g3Var.dismissed) {
            return;
        }
        int i10 = 0;
        g3Var.containerView.setVisibility(0);
        if (g3Var.onCustomOpenAnimation()) {
            return;
        }
        if (g3Var.useHardwareLayer) {
            g3Var.container.setLayerType(2, null);
        }
        if (g3Var.transitionFromRight) {
            g3Var.containerView.setTranslationX(AndroidUtilities.dp(48.0f));
            g3Var.containerView.setAlpha(0.0f);
            g3Var.containerView.setTranslationY(0.0f);
        } else {
            g3Var.containerView.setTranslationY(Math.max(0, Math.min(AndroidUtilities.navigationBarHeight, g3Var.getBottomInset())) + AndroidUtilities.dp(10.0f) + g3Var.getContainerViewHeight() + g3Var.keyboardHeight);
        }
        g3Var.onContainerViewTranslation();
        int i11 = 1;
        g3Var.currentSheetAnimationType = 1;
        ValueAnimator valueAnimator = g3Var.navigationBarAnimation;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(g3Var.navigationBarAlpha, 1.0f);
        g3Var.navigationBarAnimation = ofFloat;
        ofFloat.addUpdateListener(new q2(g3Var, i11));
        g3Var.currentSheetAnimation = new AnimatorSet();
        ArrayList<Animator> arrayList = new ArrayList<>();
        arrayList.add(ObjectAnimator.ofFloat(g3Var.containerView, (Property<ViewGroup, Float>) View.TRANSLATION_X, 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(g3Var.containerView, (Property<ViewGroup, Float>) View.ALPHA, 1.0f));
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(g3Var.containerView, (Property<ViewGroup, Float>) View.TRANSLATION_Y, 0.0f);
        ofFloat2.addUpdateListener(new q2(g3Var, 6));
        arrayList.add(ofFloat2);
        arrayList.add(ObjectAnimator.ofInt(g3Var.backDrawable, n6.d, g3Var.dimBehind ? g3Var.dimBehindAlpha : 0));
        arrayList.add(g3Var.navigationBarAnimation);
        g3Var.appendOpenAnimator(true, arrayList);
        g3Var.currentSheetAnimation.playTogether(arrayList);
        if (g3Var.transitionFromRight) {
            g3Var.currentSheetAnimation.setDuration(250L);
            g3Var.currentSheetAnimation.setInterpolator(nr.f);
        } else {
            g3Var.currentSheetAnimation.setDuration(g3Var.openDuration);
            g3Var.currentSheetAnimation.setInterpolator(g3Var.openInterpolator);
        }
        g3Var.currentSheetAnimation.setStartDelay(g3Var.waitingKeyboard ? 0L : 20L);
        g3Var.currentSheetAnimation.setInterpolator(g3Var.openInterpolator);
        g3Var.notificationsLocker.lock();
        g3Var.currentSheetAnimation.addListener(new x2(g3Var, i10));
        if (g3Var.pauseAllHeavyOperations) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        }
        g3Var.currentSheetAnimation.start();
    }

    public static /* synthetic */ WindowInsets h(g3 g3Var, WindowInsets windowInsets) {
        g3Var.processLegacyContainerInsets(windowInsets);
        return Build.VERSION.SDK_INT >= 30 ? WindowInsets.CONSUMED : windowInsets.consumeSystemWindowInsets();
    }

    public static /* synthetic */ void i(g3 g3Var, ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        g3Var.setItemColor(g3Var.selectedPos.intValue(), intValue, intValue);
    }

    public static /* synthetic */ void j(g3 g3Var, ValueAnimator valueAnimator) {
        g3Var.hideSystemVerticalInsetsProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        g3Var.container.requestLayout();
        g3Var.containerView.requestLayout();
    }

    @Override // org.telegram.ui.ActionBar.l2
    public boolean attachedToParent() {
        e3 e3Var = this.container;
        return e3Var != null && e3Var.isAttachedToWindow();
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
    /* JADX WARN: Removed duplicated region for block: B:26:0x0165  */
    @Override // android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.l2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void dismiss() {
        long j10;
        ic icVar;
        a3 a3Var = this.delegate;
        if ((a3Var == null || a3Var.g()) && !this.dismissed) {
            int i10 = 1;
            this.dismissed = true;
            DialogInterface.OnDismissListener onDismissListener = this.onHideListener;
            if (onDismissListener != null) {
                onDismissListener.onDismiss(this);
            }
            cancelSheetAnimation();
            onDismissAnimationStart();
            int i11 = 2;
            int i12 = 0;
            if (this.skipDismissAnimation) {
                AndroidUtilities.runOnUIThread(new r2(this, i11));
            } else if (!this.allowCustomAnimation || !onCustomCloseAnimation()) {
                AndroidUtilities.hideKeyboard(this.container);
                this.currentSheetAnimationType = 2;
                ValueAnimator valueAnimator = this.navigationBarAnimation;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.navigationBarAlpha, 0.0f);
                this.navigationBarAnimation = ofFloat;
                ofFloat.addUpdateListener(new q2(this, i12));
                this.currentSheetAnimation = new AnimatorSet();
                ArrayList<Animator> arrayList = new ArrayList<>();
                ViewGroup viewGroup = this.containerView;
                if (viewGroup != null) {
                    if (this.transitionFromRight) {
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(viewGroup, (Property<ViewGroup, Float>) View.TRANSLATION_X, AndroidUtilities.dp(48.0f));
                        ofFloat2.addUpdateListener(new q2(this, 3));
                        arrayList.add(ofFloat2);
                        arrayList.add(ObjectAnimator.ofFloat(this.containerView, (Property<ViewGroup, Float>) View.ALPHA, 0.0f));
                    } else {
                        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(viewGroup, (Property<ViewGroup, Float>) View.TRANSLATION_Y, Math.max(0, Math.min(AndroidUtilities.navigationBarHeight, getBottomInset())) + AndroidUtilities.dp(10.0f) + getContainerViewHeight() + (this.forceKeyboardOnDismiss ? this.lastKeyboardHeight : this.keyboardHeight));
                        ofFloat3.addUpdateListener(new q2(this, 4));
                        arrayList.add(ofFloat3);
                    }
                }
                arrayList.add(ObjectAnimator.ofInt(this.backDrawable, n6.d, 0));
                arrayList.add(this.navigationBarAnimation);
                appendOpenAnimator(false, arrayList);
                this.currentSheetAnimation.playTogether(arrayList);
                if (this.transitionFromRight) {
                    this.currentSheetAnimation.setDuration(200L);
                    this.currentSheetAnimation.setInterpolator(nr.f);
                    j10 = 0;
                } else {
                    j10 = 250;
                    this.currentSheetAnimation.setDuration(250L);
                    this.currentSheetAnimation.setInterpolator(nr.g);
                }
                this.currentSheetAnimation.addListener(new x2(this, i10));
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                this.currentSheetAnimation.start();
                icVar = ic.w;
                if (icVar != null && icVar.l && icVar.r) {
                    if (j10 <= 0) {
                        icVar.c((long) (j10 * 0.6f), MessagesController.getGlobalMainSettings().getBoolean("view_animations", true));
                    } else {
                        icVar.b();
                    }
                }
                l(false);
            }
            j10 = 0;
            icVar = ic.w;
            if (icVar != null) {
                if (j10 <= 0) {
                }
            }
            l(false);
        }
    }

    public void dismissInternal() {
        p2 p2Var = this.attachedFragment;
        if (p2Var != null) {
            p2Var.removeSheet(this);
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
        int i11 = 1;
        this.dismissed = true;
        cancelSheetAnimation();
        this.currentSheetAnimationType = 2;
        this.currentSheetAnimation = new AnimatorSet();
        int i12 = 0;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.containerView, (Property<ViewGroup, Float>) View.TRANSLATION_Y, Math.max(0, Math.min(AndroidUtilities.navigationBarHeight, getBottomInset())) + AndroidUtilities.dp(10.0f) + getContainerViewHeight() + this.keyboardHeight);
        ofFloat.addUpdateListener(new q2(this, 2));
        this.currentSheetAnimation.playTogether(ofFloat, ObjectAnimator.ofInt(this.backDrawable, n6.d, 0));
        this.currentSheetAnimation.setDuration(this.cellType == 4 ? 330L : 180L);
        this.currentSheetAnimation.setInterpolator(nr.g);
        this.currentSheetAnimation.addListener(new y2(this, i10, i12));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        this.currentSheetAnimation.start();
        if (this.cellType != 4 || this.selectedPos == null) {
            return;
        }
        int currentTextColor = getItemViews().get(this.selectedPos.intValue()).getTextView().getCurrentTextColor();
        int currentTextColor2 = getItemViews().get(i10).getTextView().getCurrentTextColor();
        ValueAnimator ofArgb = ValueAnimator.ofArgb(currentTextColor, currentTextColor2);
        ofArgb.addUpdateListener(new q2(this, 7));
        ofArgb.setDuration(130L);
        nr nrVar = nr.f;
        ofArgb.setInterpolator(nrVar);
        ofArgb.start();
        ValueAnimator ofArgb2 = ValueAnimator.ofArgb(currentTextColor2, currentTextColor);
        ofArgb2.addUpdateListener(new ih.b(this, i10, i11));
        ofArgb2.setDuration(130L);
        ofArgb2.setInterpolator(nrVar);
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
        fixNavigationBar(getThemedColor(j6.a7));
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

    public int getBottomSheetWidth(boolean z4, int i10, int i11) {
        return z4 ? i10 : (int) Math.max(i10 * 0.8f, Math.min(AndroidUtilities.dp(480.0f), i10));
    }

    public qc getBulletinFactory() {
        return new qc(this.topBulletinContainer, this.resourcesProvider);
    }

    public e3 getContainer() {
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

    public ArrayList<z2> getItemViews() {
        return this.itemViews;
    }

    public int getLeftInset() {
        if (this.lastInsets == null) {
            return 0;
        }
        return (int) ((1.0f - this.hideSystemVerticalInsetsProgress) * r0.getSystemWindowInsetLeft());
    }

    @Override // org.telegram.ui.ActionBar.l2
    public int getNavigationBarColor(int i10) {
        float f10;
        ViewGroup viewGroup;
        if (!attachedToParent() || (viewGroup = this.containerView) == null) {
            f10 = 0.0f;
        } else if (this.transitionFromRight) {
            f10 = viewGroup.getAlpha();
        } else {
            f10 = Utilities.clamp01(1.0f - (this.containerView.getTranslationY() / ((AndroidUtilities.dp(10.0f) + (getContainerViewHeight() + this.keyboardHeight)) + (this.scrollNavBar ? Math.max(0, Math.min(AndroidUtilities.navigationBarHeight, getBottomInset())) : 0))));
        }
        return i0.a.d(f10, i10, this.navBarColor);
    }

    public f6 getResourcesProvider() {
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

    public ArrayList<l6> getThemeDescriptions() {
        return null;
    }

    public int getThemedColor(int i10) {
        return j6.v0(i10, this.resourcesProvider);
    }

    public TextView getTitleView() {
        return this.titleView;
    }

    @Override // org.telegram.ui.ActionBar.l2
    public View getWindowView() {
        return this.container;
    }

    @Override // org.telegram.ui.ActionBar.l2
    public boolean isAttachedLightStatusBar() {
        return this.useLightStatusBar;
    }

    public boolean isDismissed() {
        return this.dismissed;
    }

    public boolean isFocusable() {
        return this.focusable;
    }

    @Override // org.telegram.ui.ActionBar.l2
    public boolean isFullyVisible() {
        return false;
    }

    public boolean isKeyboardVisible() {
        return this.keyboardVisible;
    }

    @Override // org.telegram.ui.ActionBar.l2
    public boolean isShown() {
        return !this.dismissed;
    }

    public boolean isTouchOutside(float f10, float f11) {
        FrameLayout frameLayout = this.topBulletinContainer;
        if (frameLayout != null && frameLayout.getChildCount() > 0) {
            View childAt = this.topBulletinContainer.getChildAt(0);
            if (f11 >= childAt.getY() + this.topBulletinContainer.getY()) {
                if (f11 <= childAt.getY() + this.topBulletinContainer.getY() + childAt.getHeight()) {
                    if (f10 >= childAt.getX() + this.topBulletinContainer.getX()) {
                        if (f10 <= childAt.getX() + this.topBulletinContainer.getX() + childAt.getWidth()) {
                            return false;
                        }
                    }
                }
            }
        }
        return f11 < ((float) this.containerView.getTop()) || f10 < ((float) this.containerView.getLeft()) || f10 > ((float) this.containerView.getRight());
    }

    public final void k() {
        Window window;
        int i10;
        p2 p2Var = this.attachedFragment;
        if (p2Var != null) {
            p2Var.addSheet(this);
            if (this.attachedFragment.getLayoutContainer() == null) {
                return;
            }
            if (((InputMethodManager) getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.attachedFragment.getLayoutContainer().getWindowToken(), 2)) {
                AndroidUtilities.runOnUIThread(new r2(this, 0), 80L);
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
        if (this.useLightStatusBar && Build.VERSION.SDK_INT >= 23 && j6.w0(null, j6.s8, true) == -1) {
            this.container.setSystemUiVisibility(this.container.getSystemUiVisibility() | 8192);
        }
        if (this.useLightNavBar && Build.VERSION.SDK_INT >= 26) {
            AndroidUtilities.setLightNavigationBar((Dialog) this, false);
        }
        if (this.containerView == null) {
            u2 u2Var = new u2(this, getContext(), 0);
            this.containerView = u2Var;
            u2Var.setBackgroundDrawable(this.shadowDrawable);
            this.containerView.setPadding(this.backgroundPaddingLeft, ((this.applyTopPadding ? AndroidUtilities.dp(8.0f) : 0) + this.backgroundPaddingTop) - 1, this.backgroundPaddingLeft, this.applyBottomPadding ? AndroidUtilities.dp(8.0f) : 0);
        }
        this.containerView.setVisibility(4);
        this.container.addView(this.containerView, 0, k7.b6.e(-1, -2, 80));
        if (this.topBulletinContainer == null) {
            FrameLayout frameLayout = new FrameLayout(getContext());
            this.topBulletinContainer = frameLayout;
            e3 e3Var = this.container;
            e3Var.addView(frameLayout, e3Var.indexOfChild(this.containerView) + 1, k7.b6.e(-1, -2, 80));
        }
        if (this.title != null) {
            v2 v2Var = new v2(this, getContext());
            this.titleView = v2Var;
            v2Var.setText(this.title);
            if (this.bigTitle) {
                this.titleView.setTextColor(getThemedColor(j6.j5));
                this.titleView.setTextSize(1, 20.0f);
                this.titleView.setTypeface(AndroidUtilities.bold());
                this.titleView.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(this.multipleLinesTitle ? 14.0f : 6.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(8.0f));
            } else {
                this.titleView.setTextColor(getThemedColor(j6.q5));
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
            this.containerView.addView(this.titleView, k7.b6.c(this.multipleLinesTitle ? -2.0f : 48, -1));
            this.titleView.setOnTouchListener(new oh.d(1));
        } else {
            i10 = 0;
        }
        View view = this.customView;
        if (view != null) {
            if (view.getParent() != null) {
                ((ViewGroup) this.customView.getParent()).removeView(this.customView);
            }
            if (this.useBackgroundTopPadding) {
                this.containerView.addView(this.customView, k7.b6.d(-1, -2.0f, this.customViewGravity, 0.0f, i10, 0.0f, 0.0f));
            } else {
                this.containerView.setClipToPadding(false);
                this.containerView.setClipChildren(false);
                this.container.setClipToPadding(false);
                this.container.setClipChildren(false);
                float f10 = i10;
                this.containerView.addView(this.customView, k7.b6.d(-1, -2.0f, this.customViewGravity, 0.0f, f10, 0.0f, 0.0f));
                ((ViewGroup.MarginLayoutParams) this.customView.getLayoutParams()).topMargin = AndroidUtilities.dp(f10) + (-this.backgroundPaddingTop);
            }
        } else if (this.items != null) {
            int i11 = 0;
            while (true) {
                CharSequence[] charSequenceArr = this.items;
                if (i11 >= charSequenceArr.length) {
                    break;
                }
                if (charSequenceArr[i11] != null) {
                    z2 z2Var = new z2(getContext(), this.cellType, this.resourcesProvider);
                    CharSequence charSequence = this.items[i11];
                    int[] iArr = this.itemIcons;
                    z2Var.a(charSequence, iArr != null ? iArr[i11] : 0, null, this.bigTitle);
                    this.containerView.addView(z2Var, k7.b6.d(-1, 48.0f, 51, 0.0f, i10, 0.0f, 0.0f));
                    i10 += 48;
                    z2Var.setTag(Integer.valueOf(i11));
                    z2Var.setOnClickListener(new x(this, 2));
                    this.itemViews.add(z2Var);
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
            if (Build.VERSION.SDK_INT >= 28) {
                attributes.layoutInDisplayCutoutMode = 1;
            }
            window.setAttributes(attributes);
        }
    }

    public final void l(boolean z4) {
        if (this.showing == z4) {
            return;
        }
        this.showing = z4;
        if (this.openedLayerNum > 0) {
            if (z4) {
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, Integer.valueOf(this.openedLayerNum));
            } else {
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, Integer.valueOf(this.openedLayerNum));
            }
        }
    }

    public void makeAttached(p2 p2Var) {
        if (AndroidUtilities.isTablet()) {
            return;
        }
        if (p2Var == null || !p2Var.isSupportEdgeToEdge()) {
            this.attachedFragment = p2Var;
            f3 f3Var = this.backDrawable;
            if (f3Var != null) {
                f3Var.a.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
            }
        }
    }

    public lf.r0 obtainWindowVisibilityController() {
        if (this.windowVisibilityManager == null) {
            this.windowVisibilityManager = new lf.t0(getWindow());
        }
        lf.t0 t0Var = this.windowVisibilityManager;
        t0Var.getClass();
        return new lf.s0(t0Var);
    }

    @Override // org.telegram.ui.ActionBar.l2
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

    public void onContainerTranslationYChanged(float f10) {
        e3 e3Var = this.container;
        if (e3Var != null) {
            e3Var.invalidate();
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

    public boolean onScrollUp(float f10) {
        return false;
    }

    public void onSmoothContainerViewLayout(float f10) {
        e3 e3Var = this.container;
        if (e3Var != null) {
            e3Var.invalidate();
        }
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
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

    public void setAllowNestedScroll(boolean z4) {
        this.allowNestedScroll = z4;
        if (z4) {
            return;
        }
        this.containerView.setTranslationY(0.0f);
        onContainerViewTranslation();
    }

    public void setApplyBottomPadding(boolean z4) {
        this.applyBottomPadding = z4;
    }

    public void setApplyTopPadding(boolean z4) {
        this.applyTopPadding = z4;
    }

    public void setBackgroundColor(int i10) {
        this.shadowDrawable.setColorFilter(i10, PorterDuff.Mode.MULTIPLY);
        if (this.internalBackgroundColor != i10) {
            this.internalBackgroundColor = i10;
            e3 e3Var = this.container;
            if (e3Var != null) {
                int measuredHeight = e3Var.getMeasuredHeight();
                e3 e3Var2 = this.container;
                e3Var.invalidate(0, measuredHeight - e3Var2.w, e3Var2.getMeasuredWidth(), this.container.getMeasuredHeight());
            }
        }
    }

    public void setCalcMandatoryInsets(boolean z4) {
        this.calcMandatoryInsets = z4;
        this.drawNavigationBar = z4;
    }

    public void setCanDismissWithSwipe(boolean z4) {
        this.canDismissWithSwipe = z4;
    }

    public void setCanDismissWithTouchOutside(boolean z4) {
        this.canDismissWithTouchOutside = z4;
    }

    public void setCurrentPanTranslationY(float f10) {
        this.currentPanTranslationY = f10;
        this.container.invalidate();
    }

    public void setCustomView(View view) {
        this.customView = view;
    }

    public void setDelegate(a3 a3Var) {
        this.delegate = a3Var;
    }

    public g3 setDimBehind(boolean z4) {
        this.dimBehind = z4;
        return this;
    }

    public void setDimBehindAlpha(int i10) {
        this.dimBehindAlpha = i10;
    }

    public void setDisableScroll(boolean z4) {
        this.disableScroll = z4;
    }

    public void setFocusable(boolean z4) {
        if (this.focusable == z4) {
            return;
        }
        this.focusable = z4;
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

    public void setHideSystemVerticalInsets(boolean z4) {
        ValueAnimator duration = ValueAnimator.ofFloat(this.hideSystemVerticalInsetsProgress, z4 ? 1.0f : 0.0f).setDuration(180L);
        duration.setInterpolator(nr.f);
        duration.addUpdateListener(new q2(this, 5));
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
        z2 z2Var = this.itemViews.get(i10);
        z2Var.a.setTextColor(i11);
        z2Var.b.setColorFilter(new PorterDuffColorFilter(i12, PorterDuff.Mode.MULTIPLY));
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

    @Override // org.telegram.ui.ActionBar.l2
    public void setOnDismissListener(Runnable runnable) {
        if (runnable != null) {
            setOnHideListener(new t1(runnable, 1));
        }
    }

    public void setOnHideListener(DialogInterface.OnDismissListener onDismissListener) {
        this.onHideListener = onDismissListener;
    }

    public void setOpenNoDelay(boolean z4) {
        this.openNoDelay = z4;
    }

    public void setOverlayNavBarColor(int i10) {
        this.overlayDrawNavBarColor = i10;
        e3 e3Var = this.container;
        if (e3Var != null) {
            e3Var.invalidate();
        }
        if (this.attachedFragment != null) {
            LaunchActivity.D1.H(true, true, true);
            AndroidUtilities.setLightNavigationBar(getWindowView(), AndroidUtilities.computePerceivedBrightness(getNavigationBarColor(getThemedColor(j6.a7))) >= 0.721f);
        } else {
            AndroidUtilities.setNavigationBarColor(this, this.overlayDrawNavBarColor);
            AndroidUtilities.setLightNavigationBar(this, ((double) AndroidUtilities.computePerceivedBrightness(this.overlayDrawNavBarColor)) > 0.721d);
        }
    }

    public void setShowWithoutAnimation(boolean z4) {
        this.showWithoutAnimation = z4;
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

    public void setUseLightStatusBar(boolean z4) {
        this.useLightStatusBar = z4;
        if (Build.VERSION.SDK_INT >= 23) {
            int w02 = j6.w0(null, j6.s8, true);
            int systemUiVisibility = this.container.getSystemUiVisibility();
            this.container.setSystemUiVisibility((this.useLightStatusBar && w02 == -1) ? systemUiVisibility | 8192 : systemUiVisibility & (-8193));
        }
        if (this.attachedFragment != null) {
            LaunchActivity.D1.H(true, true, true);
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
            w2 w2Var = new w2(this, 0);
            this.startAnimationRunnable = w2Var;
            AndroidUtilities.runOnUIThread(w2Var, j10);
        }
    }

    public boolean showDialog(Dialog dialog) {
        return false;
    }

    public void skipDismissAnimation() {
        this.skipDismissAnimation = true;
    }

    public void smoothContainerViewLayout() {
        this.smoothContainerViewLayoutUntil = System.currentTimeMillis() + 80;
    }

    public void transitionFromRight(boolean z4) {
        this.transitionFromRight = z4;
    }

    public g3(Context context, f6 f6Var, boolean z4, boolean z10) {
        super(context, R.style.TransparentDialog);
        this.currentAccount = UserConfig.selectedAccount;
        this.useHardwareLayer = true;
        this.backDrawable = new f3();
        this.useLightStatusBar = true;
        int i10 = j6.h5;
        this.behindKeyboardColorKey = i10;
        this.canDismissWithSwipe = true;
        this.canDismissWithTouchOutside = true;
        this.allowCustomAnimation = true;
        this.statusBarHeight = AndroidUtilities.statusBarHeight;
        this.openDuration = 400;
        this.openInterpolator = nr.h;
        this.focusableSoftInputMode = 16;
        this.dimBehind = true;
        this.dimBehindAlpha = 51;
        this.allowNestedScroll = true;
        this.applyTopPadding = true;
        this.applyBottomPadding = true;
        this.itemViews = new ArrayList<>();
        this.dismissRunnable = new r2(this, 1);
        this.navigationBarAlpha = 0.0f;
        this.navBarColorKey = j6.a7;
        this.pauseAllHeavyOperations = true;
        this.notificationsLocker = new AnimationNotificationsLocker();
        this.useBackgroundTopPadding = true;
        this.customViewGravity = 51;
        this.smoothContainerViewLayoutUntil = -1L;
        this.resourcesProvider = f6Var;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 30) {
            getWindow().addFlags(-2147483392);
            if (z10) {
                this.focusableSoftInputMode = 48;
            }
        } else {
            getWindow().addFlags(-2147417856);
        }
        this.touchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        Rect rect = new Rect();
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.shadowDrawable = mutate;
        int themedColor = getThemedColor(i10);
        this.internalBackgroundColor = themedColor;
        mutate.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
        this.shadowDrawable.getPadding(rect);
        this.backgroundPaddingLeft = rect.left;
        this.backgroundPaddingTop = rect.top;
        t2 t2Var = new t2(this, getContext());
        this.container = t2Var;
        t2Var.setClipChildren(false);
        this.container.setClipToPadding(false);
        this.container.setBackground(this.backDrawable);
        this.focusable = z4;
        if (!z10) {
            this.container.setFitsSystemWindows(true);
            this.container.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: org.telegram.ui.ActionBar.s2
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    return g3.h(g3.this, windowInsets);
                }
            });
        }
        if (i11 >= 30) {
            this.container.setSystemUiVisibility(1792);
        } else {
            this.container.setSystemUiVisibility(1280);
        }
        this.backDrawable.setAlpha(0);
    }

    public void fixNavigationBar(int i10) {
        this.drawNavigationBar = !this.occupyNavigationBar;
        this.drawDoubleNavigationBar = true;
        this.scrollNavBar = true;
        this.navBarColorKey = -1;
        this.navBarColor = i10;
        setOverlayNavBarColor(i10);
    }

    @Override // android.app.Dialog
    public void setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        super.setOnDismissListener(onDismissListener);
    }

    public void setTitle(CharSequence charSequence, boolean z4) {
        this.title = charSequence;
        this.bigTitle = z4;
    }

    public void mainContainerDispatchDraw(Canvas canvas) {
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onContainerDraw(Canvas canvas) {
    }

    public void onContainerViewTranslation() {
    }

    public void onDismissAnimationStart() {
    }

    public void onInsetsChanged() {
    }

    public void onOpenAnimationEnd() {
    }

    public void onScrollUpBegin(float f10) {
    }

    public void onScrollUpEnd(float f10) {
    }

    public void onSwipeStarts() {
    }

    @Override // org.telegram.ui.ActionBar.l2
    public void setKeyboardHeightFromParent(int i10) {
    }

    public /* synthetic */ void setLastVisible(boolean z4) {
    }

    public void appendOpenAnimator(boolean z4, ArrayList<Animator> arrayList) {
    }

    @Override // org.telegram.ui.ActionBar.l2
    public void dismiss(boolean z4) {
        dismiss();
    }

    public void onContainerLayout(int i10, int i11, int i12, int i13) {
    }
}
