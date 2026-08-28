package androidx.mediarouter.app;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.media.MediaRouter2;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.View;
import f7.q8;
import f7.t7;
import java.util.Iterator;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class MediaRouteButton extends View {
    private static final String CHOOSER_FRAGMENT_TAG = "android.support.v7.mediarouter:MediaRouteChooserDialogFragment";
    private static final int CONNECTION_STATE_CONNECTED = 2;
    private static final int CONNECTION_STATE_CONNECTING = 1;
    private static final int CONNECTION_STATE_DISCONNECTED = 0;
    private static final String CONTROLLER_FRAGMENT_TAG = "android.support.v7.mediarouter:MediaRouteControllerDialogFragment";
    private static final String TAG = "MediaRouteButton";
    private boolean mAttachedToWindow;
    private ColorStateList mButtonTint;
    private final a mCallback;
    private boolean mCheatSheetEnabled;
    private int mConnectionState;
    private x mDialogFactory;
    boolean mIsFixedIcon;
    private int mLastConnectionState;
    private int mMinHeight;
    private int mMinWidth;
    private Drawable mRemoteIndicator;
    b mRemoteIndicatorLoader;
    private int mRemoteIndicatorResIdToLoad;
    private final c2.c0 mRouter;
    private c2.v mSelector;
    static final SparseArray<Drawable.ConstantState> sRemoteIndicatorCache = new SparseArray<>(2);
    private static final int[] CHECKED_STATE_SET = {R.attr.state_checked};
    private static final int[] CHECKABLE_STATE_SET = {R.attr.state_checkable};

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MediaRouteButton(Context context, AttributeSet attributeSet, int i9) {
        super(r7 != 0 ? new ContextThemeWrapper(r0, r7) : r0, attributeSet, i9);
        Drawable.ConstantState constantState;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, f7.d0.e(context));
        int g10 = f7.d0.g(contextThemeWrapper, org.telegram.messenger.beta.R.attr.mediaRouteTheme);
        this.mSelector = c2.v.c;
        this.mDialogFactory = x.a;
        Context context2 = getContext();
        int[] iArr = b2.a.a;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i9, 0);
        r0.j0.j(this, context2, iArr, attributeSet, obtainStyledAttributes, i9);
        if (isInEditMode()) {
            this.mRouter = null;
            this.mCallback = null;
            this.mRemoteIndicator = t7.b(context2, obtainStyledAttributes.getResourceId(3, 0));
            return;
        }
        this.mRouter = c2.c0.d(context2);
        this.mCallback = new a(this);
        c2.a0 f10 = c2.c0.f();
        int i10 = !f10.d() ? f10.i : 0;
        this.mConnectionState = i10;
        this.mLastConnectionState = i10;
        this.mButtonTint = obtainStyledAttributes.getColorStateList(4);
        this.mMinWidth = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.mMinHeight = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        int resourceId = obtainStyledAttributes.getResourceId(3, 0);
        this.mRemoteIndicatorResIdToLoad = obtainStyledAttributes.getResourceId(2, 0);
        obtainStyledAttributes.recycle();
        int i11 = this.mRemoteIndicatorResIdToLoad;
        if (i11 != 0 && (constantState = sRemoteIndicatorCache.get(i11)) != null) {
            setRemoteIndicatorDrawable(constantState.newDrawable());
        }
        if (this.mRemoteIndicator == null) {
            if (resourceId != 0) {
                Drawable.ConstantState constantState2 = sRemoteIndicatorCache.get(resourceId);
                if (constantState2 != null) {
                    setRemoteIndicatorDrawableInternal(constantState2.newDrawable());
                } else {
                    b bVar = new b(this, resourceId, getContext());
                    this.mRemoteIndicatorLoader = bVar;
                    bVar.executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
                }
            } else {
                loadRemoteIndicatorIfNeeded();
            }
        }
        updateContentDescription();
        setClickable(true);
    }

    private Activity getActivity() {
        for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    private androidx.fragment.app.j0 getFragmentManager() {
        Activity activity = getActivity();
        if (activity instanceof androidx.fragment.app.v) {
            return ((androidx.fragment.app.v) activity).s();
        }
        return null;
    }

    private void loadRemoteIndicatorIfNeeded() {
        if (this.mRemoteIndicatorResIdToLoad > 0) {
            b bVar = this.mRemoteIndicatorLoader;
            if (bVar != null) {
                bVar.cancel(false);
            }
            b bVar2 = new b(this, this.mRemoteIndicatorResIdToLoad, getContext());
            this.mRemoteIndicatorLoader = bVar2;
            this.mRemoteIndicatorResIdToLoad = 0;
            bVar2.executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
        }
    }

    private boolean showDialogForType(int i9) {
        androidx.fragment.app.j0 fragmentManager = getFragmentManager();
        if (fragmentManager == null) {
            throw new IllegalStateException("The activity must be a subclass of FragmentActivity");
        }
        this.mRouter.getClass();
        if (c2.c0.f().d()) {
            if (fragmentManager.D(CHOOSER_FRAGMENT_TAG) != null) {
                Log.w(TAG, "showDialog(): Route chooser dialog already showing!");
                return false;
            }
            this.mDialogFactory.getClass();
            j jVar = new j();
            c2.v vVar = this.mSelector;
            if (vVar == null) {
                throw new IllegalArgumentException("selector must not be null");
            }
            jVar.P();
            if (!jVar.y0.equals(vVar)) {
                jVar.y0 = vVar;
                Bundle bundle = jVar.f;
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putBundle("selector", vVar.a);
                jVar.M(bundle);
                g.s sVar = jVar.x0;
                if (sVar != null) {
                    if (jVar.w0) {
                        ((e0) sVar).f(vVar);
                    } else {
                        ((i) sVar).h(vVar);
                    }
                }
            }
            if (i9 == 2) {
                if (jVar.x0 != null) {
                    throw new IllegalStateException("This must be called before creating dialog");
                }
                jVar.w0 = true;
            }
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(fragmentManager);
            aVar.f(0, jVar, CHOOSER_FRAGMENT_TAG);
            aVar.e(true, true);
            return true;
        }
        if (fragmentManager.D(CONTROLLER_FRAGMENT_TAG) != null) {
            Log.w(TAG, "showDialog(): Route controller dialog already showing!");
            return false;
        }
        this.mDialogFactory.getClass();
        w wVar = new w();
        c2.v vVar2 = this.mSelector;
        if (vVar2 == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (wVar.y0 == null) {
            Bundle bundle2 = wVar.f;
            if (bundle2 != null) {
                wVar.y0 = c2.v.b(bundle2.getBundle("selector"));
            }
            if (wVar.y0 == null) {
                wVar.y0 = c2.v.c;
            }
        }
        if (!wVar.y0.equals(vVar2)) {
            wVar.y0 = vVar2;
            Bundle bundle3 = wVar.f;
            if (bundle3 == null) {
                bundle3 = new Bundle();
            }
            bundle3.putBundle("selector", vVar2.a);
            wVar.M(bundle3);
            g.s sVar2 = wVar.x0;
            if (sVar2 != null && wVar.w0) {
                ((p0) sVar2).i(vVar2);
            }
        }
        if (i9 == 2) {
            if (wVar.x0 != null) {
                throw new IllegalStateException("This must be called before creating dialog");
            }
            wVar.w0 = true;
        }
        androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(fragmentManager);
        aVar2.f(0, wVar, CONTROLLER_FRAGMENT_TAG);
        aVar2.e(true, true);
        return true;
    }

    private void updateContentDescription() {
        int i9 = this.mConnectionState;
        String string = getContext().getString(i9 != 1 ? i9 != 2 ? org.telegram.messenger.beta.R.string.mr_cast_button_disconnected : org.telegram.messenger.beta.R.string.mr_cast_button_connected : org.telegram.messenger.beta.R.string.mr_cast_button_connecting);
        setContentDescription(string);
        if (!this.mCheatSheetEnabled || TextUtils.isEmpty(string)) {
            string = null;
        }
        g7.m.a(this, string);
    }

    @Override // android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.mRemoteIndicator != null) {
            this.mRemoteIndicator.setState(getDrawableState());
            if (this.mRemoteIndicator.getCurrent() instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) this.mRemoteIndicator.getCurrent();
                int i9 = this.mConnectionState;
                if (i9 == 1 || this.mLastConnectionState != i9) {
                    if (!animationDrawable.isRunning()) {
                        animationDrawable.start();
                    }
                } else if (i9 == 2 && !animationDrawable.isRunning()) {
                    animationDrawable.selectDrawable(animationDrawable.getNumberOfFrames() - 1);
                }
            }
            invalidate();
        }
        this.mLastConnectionState = this.mConnectionState;
    }

    @Deprecated
    public void enableDynamicGroup() {
        c2.e0 e0Var;
        this.mRouter.getClass();
        c2.c0.b();
        c2.f0 f0Var = c2.c0.c().u;
        if (f0Var == null) {
            e0Var = new c2.e0();
        } else {
            c2.e0 e0Var2 = new c2.e0();
            Bundle bundle = f0Var.e;
            e0Var2.a = f0Var.a;
            e0Var2.c = f0Var.c;
            e0Var2.d = f0Var.d;
            e0Var2.b = f0Var.b;
            e0Var2.e = bundle == null ? null : new Bundle(bundle);
            e0Var = e0Var2;
        }
        e0Var.a = 2;
        c2.c0 c0Var = this.mRouter;
        c2.f0 f0Var2 = new c2.f0(e0Var);
        c0Var.getClass();
        c2.c0.i(f0Var2);
    }

    public x getDialogFactory() {
        return this.mDialogFactory;
    }

    public c2.v getRouteSelector() {
        return this.mSelector;
    }

    @Override // android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.mRemoteIndicator;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode()) {
            return;
        }
        this.mAttachedToWindow = true;
        if (!this.mSelector.d()) {
            this.mRouter.a(this.mSelector, this.mCallback, 0);
        }
        refreshRoute();
    }

    @Override // android.view.View
    public int[] onCreateDrawableState(int i9) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i9 + 1);
        if (this.mRouter != null && !this.mIsFixedIcon) {
            int i10 = this.mConnectionState;
            if (i10 == 1) {
                View.mergeDrawableStates(onCreateDrawableState, CHECKABLE_STATE_SET);
                return onCreateDrawableState;
            }
            if (i10 == 2) {
                View.mergeDrawableStates(onCreateDrawableState, CHECKED_STATE_SET);
                return onCreateDrawableState;
            }
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        if (!isInEditMode()) {
            this.mAttachedToWindow = false;
            if (!this.mSelector.d()) {
                this.mRouter.h(this.mCallback);
            }
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.mRemoteIndicator != null) {
            int paddingLeft = getPaddingLeft();
            int width = getWidth() - getPaddingRight();
            int paddingTop = getPaddingTop();
            int height = getHeight() - getPaddingBottom();
            int intrinsicWidth = this.mRemoteIndicator.getIntrinsicWidth();
            int intrinsicHeight = this.mRemoteIndicator.getIntrinsicHeight();
            int i9 = (((width - paddingLeft) - intrinsicWidth) / 2) + paddingLeft;
            int i10 = (((height - paddingTop) - intrinsicHeight) / 2) + paddingTop;
            this.mRemoteIndicator.setBounds(i9, i10, intrinsicWidth + i9, intrinsicHeight + i10);
            this.mRemoteIndicator.draw(canvas);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i9, int i10) {
        int i11;
        int size = View.MeasureSpec.getSize(i9);
        int size2 = View.MeasureSpec.getSize(i10);
        int mode = View.MeasureSpec.getMode(i9);
        int mode2 = View.MeasureSpec.getMode(i10);
        int i12 = this.mMinWidth;
        Drawable drawable = this.mRemoteIndicator;
        int i13 = 0;
        if (drawable != null) {
            i11 = getPaddingRight() + getPaddingLeft() + drawable.getIntrinsicWidth();
        } else {
            i11 = 0;
        }
        int max = Math.max(i12, i11);
        int i14 = this.mMinHeight;
        Drawable drawable2 = this.mRemoteIndicator;
        if (drawable2 != null) {
            i13 = getPaddingBottom() + getPaddingTop() + drawable2.getIntrinsicHeight();
        }
        int max2 = Math.max(i14, i13);
        if (mode == Integer.MIN_VALUE) {
            size = Math.min(size, max);
        } else if (mode != 1073741824) {
            size = max;
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(size2, max2);
        } else if (mode2 != 1073741824) {
            size2 = max2;
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    public boolean performClick() {
        boolean performClick = super.performClick();
        if (!performClick) {
            playSoundEffect(0);
        }
        loadRemoteIndicatorIfNeeded();
        return showDialog() || performClick;
    }

    public void refreshRoute() {
        this.mRouter.getClass();
        c2.a0 f10 = c2.c0.f();
        int i9 = !f10.d() ? f10.i : 0;
        if (this.mConnectionState != i9) {
            this.mConnectionState = i9;
            updateContentDescription();
            refreshDrawableState();
        }
        if (i9 == 1) {
            loadRemoteIndicatorIfNeeded();
        }
    }

    public void setCheatSheetEnabled(boolean z10) {
        if (z10 != this.mCheatSheetEnabled) {
            this.mCheatSheetEnabled = z10;
            updateContentDescription();
        }
    }

    public void setDialogFactory(x xVar) {
        if (xVar == null) {
            throw new IllegalArgumentException("factory must not be null");
        }
        this.mDialogFactory = xVar;
    }

    public void setRemoteIndicatorDrawable(Drawable drawable) {
        this.mRemoteIndicatorResIdToLoad = 0;
        setRemoteIndicatorDrawableInternal(drawable);
    }

    public void setRemoteIndicatorDrawableInternal(Drawable drawable) {
        b bVar = this.mRemoteIndicatorLoader;
        if (bVar != null) {
            bVar.cancel(false);
        }
        Drawable drawable2 = this.mRemoteIndicator;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.mRemoteIndicator);
        }
        if (drawable != null) {
            if (this.mButtonTint != null) {
                drawable = q8.d(drawable.mutate());
                drawable.setTintList(this.mButtonTint);
            }
            drawable.setCallback(this);
            drawable.setState(getDrawableState());
            drawable.setVisible(getVisibility() == 0, false);
        }
        this.mRemoteIndicator = drawable;
        refreshDrawableState();
    }

    public void setRouteSelector(c2.v vVar) {
        if (vVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (this.mSelector.equals(vVar)) {
            return;
        }
        if (this.mAttachedToWindow) {
            if (!this.mSelector.d()) {
                this.mRouter.h(this.mCallback);
            }
            if (!vVar.d()) {
                this.mRouter.a(vVar, this.mCallback, 0);
            }
        }
        this.mSelector = vVar;
        refreshRoute();
    }

    @Override // android.view.View
    public void setVisibility(int i9) {
        super.setVisibility(i9);
        Drawable drawable = this.mRemoteIndicator;
        if (drawable != null) {
            drawable.setVisible(i9 == 0, false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00f6, code lost:
    
        if (r3 != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0093, code lost:
    
        if (f7.e0.a(r3) != false) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00fb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean showDialog() {
        boolean a2;
        ApplicationInfo applicationInfo;
        boolean z10;
        ApplicationInfo applicationInfo2;
        boolean z11 = false;
        if (!this.mAttachedToWindow) {
            return false;
        }
        this.mRouter.getClass();
        c2.c0.b();
        c2.f0 f0Var = c2.c0.c().u;
        if (f0Var == null) {
            return showDialogForType(1);
        }
        if (f0Var.c) {
            if (c2.c0.c == null ? false : c2.c0.c().f()) {
                Context context = getContext();
                int i9 = Build.VERSION.SDK_INT;
                if (i9 >= 34) {
                    if (i9 >= 30) {
                        MediaRouter2 a3 = r0.a(context);
                        if (i9 >= 34) {
                            a2 = s0.a(a3);
                            if (!a2) {
                                if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                                    Intent putExtra = new Intent("android.settings.BLUETOOTH_SETTINGS").addFlags(268468224).putExtra("EXTRA_CONNECTION_ONLY", true).putExtra("android.bluetooth.devicepicker.extra.FILTER_TYPE", 1);
                                    Iterator<ResolveInfo> it = context.getPackageManager().queryIntentActivities(putExtra, 0).iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            z10 = false;
                                            break;
                                        }
                                        ActivityInfo activityInfo = it.next().activityInfo;
                                        if (activityInfo != null && (applicationInfo2 = activityInfo.applicationInfo) != null && (applicationInfo2.flags & 129) != 0) {
                                            context.startActivity(putExtra);
                                            z10 = true;
                                            break;
                                        }
                                    }
                                }
                                if (z11) {
                                    return true;
                                }
                            }
                            z11 = true;
                            if (z11) {
                            }
                        }
                    }
                    a2 = false;
                    if (!a2) {
                    }
                    z11 = true;
                    if (z11) {
                    }
                } else if (i9 >= 31) {
                    Intent putExtra2 = new Intent().setAction("com.android.systemui.action.LAUNCH_MEDIA_OUTPUT_DIALOG").setPackage("com.android.systemui").putExtra("package_name", context.getPackageName());
                    Iterator<ResolveInfo> it2 = context.getPackageManager().queryBroadcastReceivers(putExtra2, 0).iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            ActivityInfo activityInfo2 = it2.next().activityInfo;
                            if (activityInfo2 != null && (applicationInfo = activityInfo2.applicationInfo) != null && (applicationInfo.flags & 129) != 0) {
                                context.sendBroadcast(putExtra2);
                                break;
                            }
                        }
                    }
                    a2 = true;
                    if (!a2) {
                    }
                    z11 = true;
                    if (z11) {
                    }
                } else {
                    if (i9 == 30) {
                        a2 = f7.e0.a(context);
                        if (!a2) {
                        }
                        z11 = true;
                        if (z11) {
                        }
                    }
                    a2 = false;
                    if (!a2) {
                    }
                    z11 = true;
                    if (z11) {
                    }
                }
            }
        }
        return showDialogForType(f0Var.a);
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.mRemoteIndicator;
    }

    @Deprecated
    public void setAlwaysVisible(boolean z10) {
    }

    public MediaRouteButton(Context context) {
        this(context, null);
    }

    public MediaRouteButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, org.telegram.messenger.beta.R.attr.mediaRouteButtonStyle);
    }
}
