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
import j7.i8;
import j7.r7;
import java.util.Iterator;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
    private final c2.d0 mRouter;
    private c2.w mSelector;
    static final SparseArray<Drawable.ConstantState> sRemoteIndicatorCache = new SparseArray<>(2);
    private static final int[] CHECKED_STATE_SET = {R.attr.state_checked};
    private static final int[] CHECKABLE_STATE_SET = {R.attr.state_checkable};

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MediaRouteButton(Context context, AttributeSet attributeSet, int i10) {
        super(r7 != 0 ? new ContextThemeWrapper(r0, r7) : r0, attributeSet, i10);
        Drawable.ConstantState constantState;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, j7.z.e(context));
        int g10 = j7.z.g(contextThemeWrapper, org.telegram.messenger.beta.R.attr.mediaRouteTheme);
        this.mSelector = c2.w.c;
        this.mDialogFactory = x.a;
        Context context2 = getContext();
        int[] iArr = b2.a.a;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        r0.j0.j(this, context2, iArr, attributeSet, obtainStyledAttributes, i10);
        if (isInEditMode()) {
            this.mRouter = null;
            this.mCallback = null;
            this.mRemoteIndicator = r7.b(context2, obtainStyledAttributes.getResourceId(3, 0));
            return;
        }
        this.mRouter = c2.d0.d(context2);
        this.mCallback = new a(this);
        c2.b0 f10 = c2.d0.f();
        int i11 = !f10.d() ? f10.i : 0;
        this.mConnectionState = i11;
        this.mLastConnectionState = i11;
        this.mButtonTint = obtainStyledAttributes.getColorStateList(4);
        this.mMinWidth = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.mMinHeight = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        int resourceId = obtainStyledAttributes.getResourceId(3, 0);
        this.mRemoteIndicatorResIdToLoad = obtainStyledAttributes.getResourceId(2, 0);
        obtainStyledAttributes.recycle();
        int i12 = this.mRemoteIndicatorResIdToLoad;
        if (i12 != 0 && (constantState = sRemoteIndicatorCache.get(i12)) != null) {
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

    private boolean showDialogForType(int i10) {
        androidx.fragment.app.j0 fragmentManager = getFragmentManager();
        if (fragmentManager == null) {
            throw new IllegalStateException("The activity must be a subclass of FragmentActivity");
        }
        this.mRouter.getClass();
        if (c2.d0.f().d()) {
            if (fragmentManager.D(CHOOSER_FRAGMENT_TAG) != null) {
                Log.w(TAG, "showDialog(): Route chooser dialog already showing!");
                return false;
            }
            this.mDialogFactory.getClass();
            j jVar = new j();
            c2.w wVar = this.mSelector;
            if (wVar == null) {
                throw new IllegalArgumentException("selector must not be null");
            }
            jVar.P();
            if (!jVar.z0.equals(wVar)) {
                jVar.z0 = wVar;
                Bundle bundle = jVar.f;
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putBundle("selector", wVar.a);
                jVar.M(bundle);
                g.s sVar = jVar.y0;
                if (sVar != null) {
                    if (jVar.x0) {
                        ((e0) sVar).f(wVar);
                    } else {
                        ((i) sVar).h(wVar);
                    }
                }
            }
            if (i10 == 2) {
                if (jVar.y0 != null) {
                    throw new IllegalStateException("This must be called before creating dialog");
                }
                jVar.x0 = true;
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
        w wVar2 = new w();
        c2.w wVar3 = this.mSelector;
        if (wVar3 == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (wVar2.z0 == null) {
            Bundle bundle2 = wVar2.f;
            if (bundle2 != null) {
                wVar2.z0 = c2.w.b(bundle2.getBundle("selector"));
            }
            if (wVar2.z0 == null) {
                wVar2.z0 = c2.w.c;
            }
        }
        if (!wVar2.z0.equals(wVar3)) {
            wVar2.z0 = wVar3;
            Bundle bundle3 = wVar2.f;
            if (bundle3 == null) {
                bundle3 = new Bundle();
            }
            bundle3.putBundle("selector", wVar3.a);
            wVar2.M(bundle3);
            g.s sVar2 = wVar2.y0;
            if (sVar2 != null && wVar2.x0) {
                ((p0) sVar2).i(wVar3);
            }
        }
        if (i10 == 2) {
            if (wVar2.y0 != null) {
                throw new IllegalStateException("This must be called before creating dialog");
            }
            wVar2.x0 = true;
        }
        androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(fragmentManager);
        aVar2.f(0, wVar2, CONTROLLER_FRAGMENT_TAG);
        aVar2.e(true, true);
        return true;
    }

    private void updateContentDescription() {
        int i10 = this.mConnectionState;
        String string = getContext().getString(i10 != 1 ? i10 != 2 ? org.telegram.messenger.beta.R.string.mr_cast_button_disconnected : org.telegram.messenger.beta.R.string.mr_cast_button_connected : org.telegram.messenger.beta.R.string.mr_cast_button_connecting);
        setContentDescription(string);
        if (!this.mCheatSheetEnabled || TextUtils.isEmpty(string)) {
            string = null;
        }
        k7.m.a(this, string);
    }

    @Override // android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.mRemoteIndicator != null) {
            this.mRemoteIndicator.setState(getDrawableState());
            if (this.mRemoteIndicator.getCurrent() instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) this.mRemoteIndicator.getCurrent();
                int i10 = this.mConnectionState;
                if (i10 == 1 || this.mLastConnectionState != i10) {
                    if (!animationDrawable.isRunning()) {
                        animationDrawable.start();
                    }
                } else if (i10 == 2 && !animationDrawable.isRunning()) {
                    animationDrawable.selectDrawable(animationDrawable.getNumberOfFrames() - 1);
                }
            }
            invalidate();
        }
        this.mLastConnectionState = this.mConnectionState;
    }

    @Deprecated
    public void enableDynamicGroup() {
        c2.f0 f0Var;
        this.mRouter.getClass();
        c2.d0.b();
        c2.g0 g0Var = c2.d0.c().u;
        if (g0Var == null) {
            f0Var = new c2.f0();
        } else {
            c2.f0 f0Var2 = new c2.f0();
            Bundle bundle = g0Var.e;
            f0Var2.a = g0Var.a;
            f0Var2.c = g0Var.c;
            f0Var2.d = g0Var.d;
            f0Var2.b = g0Var.b;
            f0Var2.e = bundle == null ? null : new Bundle(bundle);
            f0Var = f0Var2;
        }
        f0Var.a = 2;
        c2.d0 d0Var = this.mRouter;
        c2.g0 g0Var2 = new c2.g0(f0Var);
        d0Var.getClass();
        c2.d0.i(g0Var2);
    }

    public x getDialogFactory() {
        return this.mDialogFactory;
    }

    public c2.w getRouteSelector() {
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
    public int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        if (this.mRouter != null && !this.mIsFixedIcon) {
            int i11 = this.mConnectionState;
            if (i11 == 1) {
                View.mergeDrawableStates(onCreateDrawableState, CHECKABLE_STATE_SET);
                return onCreateDrawableState;
            }
            if (i11 == 2) {
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
            int i10 = (((width - paddingLeft) - intrinsicWidth) / 2) + paddingLeft;
            int i11 = (((height - paddingTop) - intrinsicHeight) / 2) + paddingTop;
            this.mRemoteIndicator.setBounds(i10, i11, intrinsicWidth + i10, intrinsicHeight + i11);
            this.mRemoteIndicator.draw(canvas);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int i12;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int i13 = this.mMinWidth;
        Drawable drawable = this.mRemoteIndicator;
        int i14 = 0;
        if (drawable != null) {
            i12 = getPaddingRight() + getPaddingLeft() + drawable.getIntrinsicWidth();
        } else {
            i12 = 0;
        }
        int max = Math.max(i13, i12);
        int i15 = this.mMinHeight;
        Drawable drawable2 = this.mRemoteIndicator;
        if (drawable2 != null) {
            i14 = getPaddingBottom() + getPaddingTop() + drawable2.getIntrinsicHeight();
        }
        int max2 = Math.max(i15, i14);
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
        c2.b0 f10 = c2.d0.f();
        int i10 = !f10.d() ? f10.i : 0;
        if (this.mConnectionState != i10) {
            this.mConnectionState = i10;
            updateContentDescription();
            refreshDrawableState();
        }
        if (i10 == 1) {
            loadRemoteIndicatorIfNeeded();
        }
    }

    public void setCheatSheetEnabled(boolean z4) {
        if (z4 != this.mCheatSheetEnabled) {
            this.mCheatSheetEnabled = z4;
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
                drawable = i8.d(drawable.mutate());
                drawable.setTintList(this.mButtonTint);
            }
            drawable.setCallback(this);
            drawable.setState(getDrawableState());
            drawable.setVisible(getVisibility() == 0, false);
        }
        this.mRemoteIndicator = drawable;
        refreshDrawableState();
    }

    public void setRouteSelector(c2.w wVar) {
        if (wVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (this.mSelector.equals(wVar)) {
            return;
        }
        if (this.mAttachedToWindow) {
            if (!this.mSelector.d()) {
                this.mRouter.h(this.mCallback);
            }
            if (!wVar.d()) {
                this.mRouter.a(wVar, this.mCallback, 0);
            }
        }
        this.mSelector = wVar;
        refreshRoute();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        Drawable drawable = this.mRemoteIndicator;
        if (drawable != null) {
            drawable.setVisible(i10 == 0, false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00f6, code lost:
    
        if (r3 != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0093, code lost:
    
        if (j7.a0.a(r3) != false) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00fb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean showDialog() {
        boolean a2;
        ApplicationInfo applicationInfo;
        boolean z4;
        ApplicationInfo applicationInfo2;
        boolean z10 = false;
        if (!this.mAttachedToWindow) {
            return false;
        }
        this.mRouter.getClass();
        c2.d0.b();
        c2.g0 g0Var = c2.d0.c().u;
        if (g0Var == null) {
            return showDialogForType(1);
        }
        if (g0Var.c) {
            if (c2.d0.c == null ? false : c2.d0.c().f()) {
                Context context = getContext();
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 34) {
                    if (i10 >= 30) {
                        MediaRouter2 a10 = r0.a(context);
                        if (i10 >= 34) {
                            a2 = s0.a(a10);
                            if (!a2) {
                                if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                                    Intent putExtra = new Intent("android.settings.BLUETOOTH_SETTINGS").addFlags(268468224).putExtra("EXTRA_CONNECTION_ONLY", true).putExtra("android.bluetooth.devicepicker.extra.FILTER_TYPE", 1);
                                    Iterator<ResolveInfo> it = context.getPackageManager().queryIntentActivities(putExtra, 0).iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            z4 = false;
                                            break;
                                        }
                                        ActivityInfo activityInfo = it.next().activityInfo;
                                        if (activityInfo != null && (applicationInfo2 = activityInfo.applicationInfo) != null && (applicationInfo2.flags & 129) != 0) {
                                            context.startActivity(putExtra);
                                            z4 = true;
                                            break;
                                        }
                                    }
                                }
                                if (z10) {
                                    return true;
                                }
                            }
                            z10 = true;
                            if (z10) {
                            }
                        }
                    }
                    a2 = false;
                    if (!a2) {
                    }
                    z10 = true;
                    if (z10) {
                    }
                } else if (i10 >= 31) {
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
                    z10 = true;
                    if (z10) {
                    }
                } else {
                    if (i10 == 30) {
                        a2 = j7.a0.a(context);
                        if (!a2) {
                        }
                        z10 = true;
                        if (z10) {
                        }
                    }
                    a2 = false;
                    if (!a2) {
                    }
                    z10 = true;
                    if (z10) {
                    }
                }
            }
        }
        return showDialogForType(g0Var.a);
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.mRemoteIndicator;
    }

    @Deprecated
    public void setAlwaysVisible(boolean z4) {
    }

    public MediaRouteButton(Context context) {
        this(context, null);
    }

    public MediaRouteButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, org.telegram.messenger.beta.R.attr.mediaRouteButtonStyle);
    }
}
