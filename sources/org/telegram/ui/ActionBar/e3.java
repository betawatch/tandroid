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
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.s6;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.eb0;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public class e3 extends Dialog implements i2 {
    private static final boolean AVOID_SYSTEM_CUTOUT_FULLSCREEN = false;
    public static final /* synthetic */ int a = 0;
    private boolean allowCustomAnimation;
    protected boolean allowNestedScroll;
    private boolean applyBottomPadding;
    private boolean applyTopPadding;
    public m2 attachedFragment;
    protected d3 backDrawable;
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
    public final c3 container;
    protected ViewGroup containerView;
    protected int currentAccount;
    private float currentPanTranslationY;
    protected AnimatorSet currentSheetAnimation;
    protected int currentSheetAnimationType;
    private View customView;
    protected int customViewGravity;
    protected y2 delegate;
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
    private ArrayList<x2> itemViews;
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
    protected d6 resourcesProvider;
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
    private yf.k0 windowVisibilityManager;

    public e3(Context context, d6 d6Var, boolean z10, boolean z11) {
        this(z11 ? 2 : 1, context, d6Var, z10);
    }

    public static /* synthetic */ int access$1012(e3 e3Var, int i10) {
        int i11 = e3Var.bottomInset + i10;
        e3Var.bottomInset = i11;
        return i11;
    }

    public static /* synthetic */ int access$1020(e3 e3Var, int i10) {
        int i11 = e3Var.bottomInset - i10;
        e3Var.bottomInset = i11;
        return i11;
    }

    public static int access$1400(e3 e3Var) {
        WindowInsets windowInsets;
        int i10;
        int i11;
        int i12;
        if (!e3Var.calcMandatoryInsets || (windowInsets = e3Var.lastInsets) == null) {
            return 0;
        }
        Insets systemGestureInsets = windowInsets.getSystemGestureInsets();
        if (e3Var.keyboardVisible || !e3Var.drawNavigationBar || systemGestureInsets == null) {
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

    public static /* synthetic */ int access$1510(e3 e3Var) {
        int i10 = e3Var.layoutCount;
        e3Var.layoutCount = i10 - 1;
        return i10;
    }

    public static void access$2400(e3 e3Var) {
        if (e3Var.dismissed) {
            return;
        }
        int i10 = 0;
        e3Var.containerView.setVisibility(0);
        if (e3Var.onCustomOpenAnimation()) {
            return;
        }
        if (e3Var.useHardwareLayer) {
            e3Var.container.setLayerType(2, null);
        }
        if (e3Var.transitionFromRight) {
            e3Var.containerView.setTranslationX(AndroidUtilities.dp(48.0f));
            e3Var.containerView.setAlpha(0.0f);
            e3Var.containerView.setTranslationY(0.0f);
        } else {
            e3Var.containerView.setTranslationY(Math.max(0, Math.min(AndroidUtilities.navigationBarHeight, e3Var.getBottomInset())) + AndroidUtilities.dp(10.0f) + e3Var.getContainerViewHeight() + e3Var.keyboardHeight);
        }
        e3Var.onContainerViewTranslation();
        int i11 = 1;
        e3Var.currentSheetAnimationType = 1;
        ValueAnimator valueAnimator = e3Var.navigationBarAnimation;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(e3Var.navigationBarAlpha, 1.0f);
        e3Var.navigationBarAnimation = ofFloat;
        ofFloat.addUpdateListener(new o2(e3Var, i11));
        e3Var.currentSheetAnimation = new AnimatorSet();
        ArrayList<Animator> arrayList = new ArrayList<>();
        arrayList.add(ObjectAnimator.ofFloat(e3Var.containerView, (Property<ViewGroup, Float>) View.TRANSLATION_X, 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(e3Var.containerView, (Property<ViewGroup, Float>) View.ALPHA, 1.0f));
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(e3Var.containerView, (Property<ViewGroup, Float>) View.TRANSLATION_Y, 0.0f);
        ofFloat2.addUpdateListener(new o2(e3Var, 6));
        arrayList.add(ofFloat2);
        arrayList.add(ObjectAnimator.ofInt(e3Var.backDrawable, s6.d, e3Var.dimBehind ? e3Var.dimBehindAlpha : 0));
        arrayList.add(e3Var.navigationBarAnimation);
        e3Var.appendOpenAnimator(true, arrayList);
        e3Var.currentSheetAnimation.playTogether(arrayList);
        if (e3Var.transitionFromRight) {
            e3Var.currentSheetAnimation.setDuration(250L);
            e3Var.currentSheetAnimation.setInterpolator(rr.f);
        } else {
            e3Var.currentSheetAnimation.setDuration(e3Var.openDuration);
            e3Var.currentSheetAnimation.setInterpolator(e3Var.openInterpolator);
        }
        e3Var.currentSheetAnimation.setStartDelay(e3Var.waitingKeyboard ? 0L : 20L);
        e3Var.currentSheetAnimation.setInterpolator(e3Var.openInterpolator);
        e3Var.notificationsLocker.lock();
        e3Var.currentSheetAnimation.addListener(new v2(e3Var, i10));
        if (e3Var.pauseAllHeavyOperations) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        }
        e3Var.currentSheetAnimation.start();
    }

    public static /* synthetic */ DialogInterface.OnClickListener access$2802(e3 e3Var, DialogInterface.OnClickListener onClickListener) {
        e3Var.onClickListener = onClickListener;
        return onClickListener;
    }

    public static /* synthetic */ CharSequence[] access$3002(e3 e3Var, CharSequence[] charSequenceArr) {
        e3Var.items = charSequenceArr;
        return charSequenceArr;
    }

    public static /* synthetic */ CharSequence access$3202(e3 e3Var, CharSequence charSequence) {
        e3Var.title = charSequence;
        return charSequence;
    }

    public static /* synthetic */ boolean access$3302(e3 e3Var, boolean z10) {
        e3Var.bigTitle = z10;
        return z10;
    }

    public static /* synthetic */ WindowInsets h(e3 e3Var, WindowInsets windowInsets) {
        e3Var.processLegacyContainerInsets(windowInsets);
        return Build.VERSION.SDK_INT >= 30 ? WindowInsets.CONSUMED : windowInsets.consumeSystemWindowInsets();
    }

    public static /* synthetic */ void i(e3 e3Var, ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        e3Var.setItemColor(e3Var.selectedPos.intValue(), intValue, intValue);
    }

    public static /* synthetic */ void j(e3 e3Var, ValueAnimator valueAnimator) {
        e3Var.hideSystemVerticalInsetsProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        e3Var.container.requestLayout();
        e3Var.containerView.requestLayout();
    }

    @Override // org.telegram.ui.ActionBar.i2
    public boolean attachedToParent() {
        c3 c3Var = this.container;
        return c3Var != null && c3Var.isAttachedToWindow();
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
    @Override // android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.i2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void dismiss() {
        long j3;
        qc qcVar;
        y2 y2Var = this.delegate;
        if ((y2Var == null || y2Var.g()) && !this.dismissed) {
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
                AndroidUtilities.runOnUIThread(new n2(this, i11));
            } else if (!this.allowCustomAnimation || !onCustomCloseAnimation()) {
                AndroidUtilities.hideKeyboard(this.container);
                this.currentSheetAnimationType = 2;
                ValueAnimator valueAnimator = this.navigationBarAnimation;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.navigationBarAlpha, 0.0f);
                this.navigationBarAnimation = ofFloat;
                ofFloat.addUpdateListener(new o2(this, i11));
                this.currentSheetAnimation = new AnimatorSet();
                ArrayList<Animator> arrayList = new ArrayList<>();
                ViewGroup viewGroup = this.containerView;
                if (viewGroup != null) {
                    if (this.transitionFromRight) {
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(viewGroup, (Property<ViewGroup, Float>) View.TRANSLATION_X, AndroidUtilities.dp(48.0f));
                        ofFloat2.addUpdateListener(new o2(this, 3));
                        arrayList.add(ofFloat2);
                        arrayList.add(ObjectAnimator.ofFloat(this.containerView, (Property<ViewGroup, Float>) View.ALPHA, 0.0f));
                    } else {
                        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(viewGroup, (Property<ViewGroup, Float>) View.TRANSLATION_Y, Math.max(0, Math.min(AndroidUtilities.navigationBarHeight, getBottomInset())) + AndroidUtilities.dp(10.0f) + getContainerViewHeight() + (this.forceKeyboardOnDismiss ? this.lastKeyboardHeight : this.keyboardHeight));
                        ofFloat3.addUpdateListener(new o2(this, 4));
                        arrayList.add(ofFloat3);
                    }
                }
                arrayList.add(ObjectAnimator.ofInt(this.backDrawable, s6.d, 0));
                arrayList.add(this.navigationBarAnimation);
                appendOpenAnimator(false, arrayList);
                this.currentSheetAnimation.playTogether(arrayList);
                if (this.transitionFromRight) {
                    this.currentSheetAnimation.setDuration(200L);
                    this.currentSheetAnimation.setInterpolator(rr.f);
                    j3 = 0;
                } else {
                    j3 = 250;
                    this.currentSheetAnimation.setDuration(250L);
                    this.currentSheetAnimation.setInterpolator(rr.g);
                }
                this.currentSheetAnimation.addListener(new v2(this, i10));
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                this.currentSheetAnimation.start();
                qcVar = qc.w;
                if (qcVar != null && qcVar.l && qcVar.r) {
                    if (j3 <= 0) {
                        qcVar.c((long) (j3 * 0.6f), MessagesController.getGlobalMainSettings().getBoolean("view_animations", true));
                    } else {
                        qcVar.b();
                    }
                }
                l(false);
            }
            j3 = 0;
            qcVar = qc.w;
            if (qcVar != null) {
                if (j3 <= 0) {
                }
            }
            l(false);
        }
    }

    public void dismissInternal() {
        m2 m2Var = this.attachedFragment;
        if (m2Var != null) {
            m2Var.removeSheet(this);
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
        ofFloat.addUpdateListener(new o2(this, 2));
        this.currentSheetAnimation.playTogether(ofFloat, ObjectAnimator.ofInt(this.backDrawable, s6.d, 0));
        this.currentSheetAnimation.setDuration(this.cellType == 4 ? 330L : 180L);
        this.currentSheetAnimation.setInterpolator(rr.g);
        this.currentSheetAnimation.addListener(new w2(this, i10, i11));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        this.currentSheetAnimation.start();
        if (this.cellType != 4 || this.selectedPos == null) {
            return;
        }
        int currentTextColor = getItemViews().get(this.selectedPos.intValue()).getTextView().getCurrentTextColor();
        int currentTextColor2 = getItemViews().get(i10).getTextView().getCurrentTextColor();
        ValueAnimator ofArgb = ValueAnimator.ofArgb(currentTextColor, currentTextColor2);
        ofArgb.addUpdateListener(new o2(this, 7));
        ofArgb.setDuration(130L);
        rr rrVar = rr.f;
        ofArgb.setInterpolator(rrVar);
        ofArgb.start();
        ValueAnimator ofArgb2 = ValueAnimator.ofArgb(currentTextColor2, currentTextColor);
        ofArgb2.addUpdateListener(new p2(this, i10, i11));
        ofArgb2.setDuration(130L);
        ofArgb2.setInterpolator(rrVar);
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
        fixNavigationBar(getThemedColor(h6.a7));
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

    @Override // org.telegram.ui.ActionBar.i2
    public xc getBulletinFactory() {
        return new xc(this.topBulletinContainer, this.resourcesProvider);
    }

    public c3 getContainer() {
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

    public ArrayList<x2> getItemViews() {
        return this.itemViews;
    }

    public int getLeftInset() {
        if (this.lastInsets == null) {
            return 0;
        }
        return (int) ((1.0f - this.hideSystemVerticalInsetsProgress) * r0.getSystemWindowInsetLeft());
    }

    @Override // org.telegram.ui.ActionBar.i2
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
        return i0.a.d(f7, i10, this.navBarColor);
    }

    public d6 getResourcesProvider() {
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

    public ArrayList<j6> getThemeDescriptions() {
        return null;
    }

    public int getThemedColor(int i10) {
        return h6.v0(i10, this.resourcesProvider);
    }

    public TextView getTitleView() {
        return this.titleView;
    }

    @Override // org.telegram.ui.ActionBar.i2
    public View getWindowView() {
        return this.container;
    }

    @Override // org.telegram.ui.ActionBar.i2
    public boolean isAttachedLightStatusBar() {
        return this.useLightStatusBar;
    }

    public boolean isDismissed() {
        return this.dismissed;
    }

    public boolean isFocusable() {
        return this.focusable;
    }

    @Override // org.telegram.ui.ActionBar.i2
    public boolean isFullyVisible() {
        return false;
    }

    public boolean isKeyboardVisible() {
        return this.keyboardVisible;
    }

    @Override // org.telegram.ui.ActionBar.i2
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
        m2 m2Var = this.attachedFragment;
        if (m2Var != null) {
            m2Var.addSheet(this);
            if (this.attachedFragment.getLayoutContainer() == null) {
                return;
            }
            if (((InputMethodManager) getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.attachedFragment.getLayoutContainer().getWindowToken(), 2)) {
                AndroidUtilities.runOnUIThread(new n2(this, 1), 80L);
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
        if (this.useLightStatusBar && Build.VERSION.SDK_INT >= 23 && h6.w0(null, h6.s8, true) == -1) {
            this.container.setSystemUiVisibility(this.container.getSystemUiVisibility() | 8192);
        }
        if (this.useLightNavBar && Build.VERSION.SDK_INT >= 26) {
            AndroidUtilities.setLightNavigationBar((Dialog) this, false);
        }
        if (this.containerView == null) {
            s2 s2Var = new s2(this, getContext(), 0);
            this.containerView = s2Var;
            s2Var.setBackgroundDrawable(this.shadowDrawable);
            this.containerView.setPadding(this.backgroundPaddingLeft, ((this.applyTopPadding ? AndroidUtilities.dp(8.0f) : 0) + this.backgroundPaddingTop) - 1, this.backgroundPaddingLeft, this.applyBottomPadding ? AndroidUtilities.dp(8.0f) : 0);
        }
        this.containerView.setVisibility(4);
        this.container.addView(this.containerView, 0, w7.y5.e(-1, -2, 80));
        if (this.topBulletinContainer == null) {
            FrameLayout frameLayout = new FrameLayout(getContext());
            this.topBulletinContainer = frameLayout;
            c3 c3Var = this.container;
            c3Var.addView(frameLayout, c3Var.indexOfChild(this.containerView) + 1, w7.y5.e(-1, -2, 80));
        }
        if (this.title != null) {
            t2 t2Var = new t2(this, getContext());
            this.titleView = t2Var;
            t2Var.setText(this.title);
            if (this.bigTitle) {
                this.titleView.setTextColor(getThemedColor(h6.j5));
                this.titleView.setTextSize(1, 20.0f);
                this.titleView.setTypeface(AndroidUtilities.bold());
                this.titleView.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(this.multipleLinesTitle ? 14.0f : 6.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(8.0f));
            } else {
                this.titleView.setTextColor(getThemedColor(h6.q5));
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
            this.containerView.addView(this.titleView, w7.y5.c(this.multipleLinesTitle ? -2.0f : 48, -1));
            this.titleView.setOnTouchListener(new bi.d(1));
        } else {
            i10 = 0;
        }
        View view = this.customView;
        if (view != null) {
            if (view.getParent() != null) {
                ((ViewGroup) this.customView.getParent()).removeView(this.customView);
            }
            if (this.useBackgroundTopPadding) {
                this.containerView.addView(this.customView, w7.y5.d(-1, -2.0f, this.customViewGravity, 0.0f, i10, 0.0f, 0.0f));
            } else {
                this.containerView.setClipToPadding(false);
                this.containerView.setClipChildren(false);
                this.container.setClipToPadding(false);
                this.container.setClipChildren(false);
                float f7 = i10;
                this.containerView.addView(this.customView, w7.y5.d(-1, -2.0f, this.customViewGravity, 0.0f, f7, 0.0f, 0.0f));
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
                    x2 x2Var = new x2(getContext(), this.cellType, this.resourcesProvider);
                    CharSequence charSequence = this.items[i11];
                    int[] iArr = this.itemIcons;
                    x2Var.a(charSequence, iArr != null ? iArr[i11] : 0, null, this.bigTitle);
                    this.containerView.addView(x2Var, w7.y5.d(-1, 48.0f, 51, 0.0f, i10, 0.0f, 0.0f));
                    i10 += 48;
                    x2Var.setTag(Integer.valueOf(i11));
                    x2Var.setOnClickListener(new w(this, 2));
                    this.itemViews.add(x2Var);
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

    public void makeAttached(m2 m2Var) {
        if (AndroidUtilities.isTablet()) {
            return;
        }
        if (m2Var == null || !m2Var.isSupportEdgeToEdge()) {
            this.attachedFragment = m2Var;
            d3 d3Var = this.backDrawable;
            if (d3Var != null) {
                d3Var.a.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
            }
        }
    }

    public yf.j0 obtainWindowVisibilityController() {
        if (this.windowVisibilityManager == null) {
            this.windowVisibilityManager = new yf.k0(getWindow());
        }
        yf.k0 k0Var = this.windowVisibilityManager;
        k0Var.getClass();
        return new eb0(k0Var);
    }

    @Override // org.telegram.ui.ActionBar.i2
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
        c3 c3Var = this.container;
        if (c3Var != null) {
            c3Var.invalidate();
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
        c3 c3Var = this.container;
        if (c3Var != null) {
            c3Var.invalidate();
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
            c3 c3Var = this.container;
            if (c3Var != null) {
                int measuredHeight = c3Var.getMeasuredHeight();
                c3 c3Var2 = this.container;
                c3Var.invalidate(0, measuredHeight - c3Var2.w, c3Var2.getMeasuredWidth(), this.container.getMeasuredHeight());
            }
        }
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

    public void setDelegate(y2 y2Var) {
        this.delegate = y2Var;
    }

    public e3 setDimBehind(boolean z10) {
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
        duration.setInterpolator(rr.f);
        duration.addUpdateListener(new o2(this, 5));
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
        x2 x2Var = this.itemViews.get(i10);
        x2Var.a.setTextColor(i11);
        x2Var.b.setColorFilter(new PorterDuffColorFilter(i12, PorterDuff.Mode.MULTIPLY));
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

    @Override // org.telegram.ui.ActionBar.i2
    public void setOnDismissListener(Runnable runnable) {
        if (runnable != null) {
            setOnHideListener(new q1(runnable, 1));
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
        c3 c3Var = this.container;
        if (c3Var != null) {
            c3Var.invalidate();
        }
        if (this.attachedFragment != null) {
            LaunchActivity.G1.H(true, true, true);
            AndroidUtilities.setLightNavigationBar(getWindowView(), AndroidUtilities.computePerceivedBrightness(getNavigationBarColor(getThemedColor(h6.a7))) >= 0.721f);
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
        if (Build.VERSION.SDK_INT >= 23) {
            int w02 = h6.w0(null, h6.s8, true);
            int systemUiVisibility = this.container.getSystemUiVisibility();
            this.container.setSystemUiVisibility((this.useLightStatusBar && w02 == -1) ? systemUiVisibility | 8192 : systemUiVisibility & (-8193));
        }
        if (this.attachedFragment != null) {
            LaunchActivity.G1.H(true, true, true);
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
            long j3 = this.openNoDelay ? 0L : 150L;
            if (this.waitingKeyboard) {
                j3 = 500;
            }
            u2 u2Var = new u2(this, 0);
            this.startAnimationRunnable = u2Var;
            AndroidUtilities.runOnUIThread(u2Var, j3);
        }
    }

    @Override // org.telegram.ui.ActionBar.i2
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

    public e3(Context context, boolean z10) {
        this(1, context, (d6) null, z10);
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

    public void setTitle(CharSequence charSequence, boolean z10) {
        this.title = charSequence;
        this.bigTitle = z10;
    }

    public e3(int i10, Context context, d6 d6Var, boolean z10) {
        super(context, R.style.TransparentDialog);
        this.currentAccount = UserConfig.selectedAccount;
        this.useHardwareLayer = true;
        this.backDrawable = new d3();
        this.useLightStatusBar = true;
        int i11 = h6.h5;
        this.behindKeyboardColorKey = i11;
        this.canDismissWithSwipe = true;
        this.canDismissWithTouchOutside = true;
        this.allowCustomAnimation = true;
        this.statusBarHeight = AndroidUtilities.statusBarHeight;
        this.openDuration = 400;
        this.openInterpolator = rr.h;
        this.focusableSoftInputMode = 16;
        this.dimBehind = true;
        this.dimBehindAlpha = 51;
        this.allowNestedScroll = true;
        this.applyTopPadding = true;
        this.applyBottomPadding = true;
        this.itemViews = new ArrayList<>();
        this.dismissRunnable = new n2(this, 2);
        this.navigationBarAlpha = 0.0f;
        this.navBarColorKey = h6.a7;
        this.pauseAllHeavyOperations = true;
        this.notificationsLocker = new AnimationNotificationsLocker();
        this.useBackgroundTopPadding = true;
        this.customViewGravity = 51;
        this.smoothContainerViewLayoutUntil = -1L;
        this.resourcesProvider = d6Var;
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
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.shadowDrawable = mutate;
        int themedColor = getThemedColor(i11);
        this.internalBackgroundColor = themedColor;
        mutate.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
        this.shadowDrawable.getPadding(rect);
        this.backgroundPaddingLeft = rect.left;
        this.backgroundPaddingTop = rect.top;
        r2 r2Var = new r2(this, getContext());
        this.container = r2Var;
        r2Var.setClipChildren(false);
        r2Var.setClipToPadding(false);
        r2Var.setBackground(this.backDrawable);
        this.focusable = z10;
        if (i10 == 1) {
            r2Var.setFitsSystemWindows(true);
            r2Var.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: org.telegram.ui.ActionBar.q2
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    return e3.h(e3.this, windowInsets);
                }
            });
        }
        if (i12 >= 30) {
            r2Var.setSystemUiVisibility(1792);
        } else {
            r2Var.setSystemUiVisibility(1280);
        }
        this.backDrawable.setAlpha(0);
        if (i10 == 3) {
            n nVar = new n(this, 6);
            WeakHashMap weakHashMap = r0.i0.a;
            r0.a0.j(r2Var, nVar);
        }
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

    public void onScrollUpBegin(float f7) {
    }

    public void onScrollUpEnd(float f7) {
    }

    public void onSwipeStarts() {
    }

    @Override // org.telegram.ui.ActionBar.i2
    public void setKeyboardHeightFromParent(int i10) {
    }

    public /* synthetic */ void setLastVisible(boolean z10) {
    }

    public void appendOpenAnimator(boolean z10, ArrayList<Animator> arrayList) {
    }

    public r0.l1 onApplyWindowInsetsToRoot(View view, r0.l1 l1Var) {
        return l1Var;
    }

    @Override // org.telegram.ui.ActionBar.i2
    public void dismiss(boolean z10) {
        dismiss();
    }

    public void onContainerLayout(int i10, int i11, int i12, int i13) {
    }
}
