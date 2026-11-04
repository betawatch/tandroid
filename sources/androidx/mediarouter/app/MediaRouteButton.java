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
import b8.ae;
import b8.d1;
import b8.e1;
import b8.oc;
import java.util.Iterator;
import org.telegram.messenger.hs;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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
    private v mDialogFactory;
    boolean mIsFixedIcon;
    private int mLastConnectionState;
    private int mMinHeight;
    private int mMinWidth;
    private Drawable mRemoteIndicator;
    b mRemoteIndicatorLoader;
    private int mRemoteIndicatorResIdToLoad;
    private final r4.y mRouter;
    private r4.r mSelector;
    static final SparseArray<Drawable.ConstantState> sRemoteIndicatorCache = new SparseArray<>(2);
    private static final int[] CHECKED_STATE_SET = {R.attr.state_checked};
    private static final int[] CHECKABLE_STATE_SET = {R.attr.state_checkable};

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MediaRouteButton(Context context, AttributeSet attributeSet, int i3) {
        super(r7 != 0 ? new ContextThemeWrapper(r0, r7) : r0, attributeSet, i3);
        Drawable.ConstantState constantState;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, d1.e(context));
        int g7 = d1.g(contextThemeWrapper, org.telegram.messenger.beta.R.attr.mediaRouteTheme);
        this.mSelector = r4.r.c;
        this.mDialogFactory = v.a;
        Context context2 = getContext();
        int[] iArr = q4.a.a;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i3, 0);
        r0.i0.i(this, context2, iArr, attributeSet, obtainStyledAttributes, i3);
        if (isInEditMode()) {
            this.mRouter = null;
            this.mCallback = null;
            this.mRemoteIndicator = oc.b(context2, obtainStyledAttributes.getResourceId(3, 0));
            return;
        }
        this.mRouter = r4.y.d(context2);
        this.mCallback = new a(this);
        r4.w f10 = r4.y.f();
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

    private boolean showDialogForType(int i3) {
        androidx.fragment.app.j0 fragmentManager = getFragmentManager();
        if (fragmentManager == null) {
            throw new IllegalStateException("The activity must be a subclass of FragmentActivity");
        }
        this.mRouter.getClass();
        if (r4.y.f().d()) {
            if (fragmentManager.D(CHOOSER_FRAGMENT_TAG) != null) {
                Log.w(TAG, "showDialog(): Route chooser dialog already showing!");
                return false;
            }
            this.mDialogFactory.getClass();
            h hVar = new h();
            r4.r rVar = this.mSelector;
            if (rVar == null) {
                throw new IllegalArgumentException("selector must not be null");
            }
            hVar.P();
            if (!hVar.D0.equals(rVar)) {
                hVar.D0 = rVar;
                Bundle bundle = hVar.f;
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putBundle("selector", rVar.a);
                hVar.M(bundle);
                g.u uVar = hVar.C0;
                if (uVar != null) {
                    if (hVar.B0) {
                        ((c0) uVar).f(rVar);
                    } else {
                        ((g) uVar).h(rVar);
                    }
                }
            }
            if (i3 == 2) {
                if (hVar.C0 != null) {
                    throw new IllegalStateException("This must be called before creating dialog");
                }
                hVar.B0 = true;
            }
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(fragmentManager);
            aVar.f(0, hVar, CHOOSER_FRAGMENT_TAG);
            aVar.e(true, true);
            return true;
        }
        if (fragmentManager.D(CONTROLLER_FRAGMENT_TAG) != null) {
            Log.w(TAG, "showDialog(): Route controller dialog already showing!");
            return false;
        }
        this.mDialogFactory.getClass();
        u uVar2 = new u();
        r4.r rVar2 = this.mSelector;
        if (rVar2 == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (uVar2.D0 == null) {
            Bundle bundle2 = uVar2.f;
            if (bundle2 != null) {
                uVar2.D0 = r4.r.b(bundle2.getBundle("selector"));
            }
            if (uVar2.D0 == null) {
                uVar2.D0 = r4.r.c;
            }
        }
        if (!uVar2.D0.equals(rVar2)) {
            uVar2.D0 = rVar2;
            Bundle bundle3 = uVar2.f;
            if (bundle3 == null) {
                bundle3 = new Bundle();
            }
            bundle3.putBundle("selector", rVar2.a);
            uVar2.M(bundle3);
            g.u uVar3 = uVar2.C0;
            if (uVar3 != null && uVar2.B0) {
                ((o0) uVar3).i(rVar2);
            }
        }
        if (i3 == 2) {
            if (uVar2.C0 != null) {
                throw new IllegalStateException("This must be called before creating dialog");
            }
            uVar2.B0 = true;
        }
        androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(fragmentManager);
        aVar2.f(0, uVar2, CONTROLLER_FRAGMENT_TAG);
        aVar2.e(true, true);
        return true;
    }

    private void updateContentDescription() {
        int i3 = this.mConnectionState;
        String string = getContext().getString(i3 != 1 ? i3 != 2 ? org.telegram.messenger.beta.R.string.mr_cast_button_disconnected : org.telegram.messenger.beta.R.string.mr_cast_button_connected : org.telegram.messenger.beta.R.string.mr_cast_button_connecting);
        setContentDescription(string);
        if (!this.mCheatSheetEnabled || TextUtils.isEmpty(string)) {
            string = null;
        }
        ae.a(this, string);
    }

    @Override // android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.mRemoteIndicator != null) {
            this.mRemoteIndicator.setState(getDrawableState());
            if (this.mRemoteIndicator.getCurrent() instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) this.mRemoteIndicator.getCurrent();
                int i3 = this.mConnectionState;
                if (i3 == 1 || this.mLastConnectionState != i3) {
                    if (!animationDrawable.isRunning()) {
                        animationDrawable.start();
                    }
                } else if (i3 == 2 && !animationDrawable.isRunning()) {
                    animationDrawable.selectDrawable(animationDrawable.getNumberOfFrames() - 1);
                }
            }
            invalidate();
        }
        this.mLastConnectionState = this.mConnectionState;
    }

    @Deprecated
    public void enableDynamicGroup() {
        r4.z zVar;
        this.mRouter.getClass();
        r4.y.b();
        r4.a0 a0Var = r4.y.c().u;
        if (a0Var == null) {
            zVar = new r4.z();
        } else {
            r4.z zVar2 = new r4.z();
            Bundle bundle = a0Var.e;
            zVar2.a = a0Var.a;
            zVar2.c = a0Var.c;
            zVar2.d = a0Var.d;
            zVar2.b = a0Var.b;
            zVar2.e = bundle == null ? null : new Bundle(bundle);
            zVar = zVar2;
        }
        zVar.a = 2;
        r4.y yVar = this.mRouter;
        r4.a0 a0Var2 = new r4.a0(zVar);
        yVar.getClass();
        r4.y.i(a0Var2);
    }

    public v getDialogFactory() {
        return this.mDialogFactory;
    }

    public r4.r getRouteSelector() {
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
    public int[] onCreateDrawableState(int i3) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i3 + 1);
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
            int i3 = (((width - paddingLeft) - intrinsicWidth) / 2) + paddingLeft;
            int i10 = (((height - paddingTop) - intrinsicHeight) / 2) + paddingTop;
            this.mRemoteIndicator.setBounds(i3, i10, intrinsicWidth + i3, intrinsicHeight + i10);
            this.mRemoteIndicator.draw(canvas);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i3, int i10) {
        int i11;
        int size = View.MeasureSpec.getSize(i3);
        int size2 = View.MeasureSpec.getSize(i10);
        int mode = View.MeasureSpec.getMode(i3);
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
        r4.w f10 = r4.y.f();
        int i3 = !f10.d() ? f10.i : 0;
        if (this.mConnectionState != i3) {
            this.mConnectionState = i3;
            updateContentDescription();
            refreshDrawableState();
        }
        if (i3 == 1) {
            loadRemoteIndicatorIfNeeded();
        }
    }

    public void setCheatSheetEnabled(boolean z10) {
        if (z10 != this.mCheatSheetEnabled) {
            this.mCheatSheetEnabled = z10;
            updateContentDescription();
        }
    }

    public void setDialogFactory(v vVar) {
        if (vVar == null) {
            throw new IllegalArgumentException("factory must not be null");
        }
        this.mDialogFactory = vVar;
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
                drawable = drawable.mutate();
                drawable.setTintList(this.mButtonTint);
            }
            drawable.setCallback(this);
            drawable.setState(getDrawableState());
            drawable.setVisible(getVisibility() == 0, false);
        }
        this.mRemoteIndicator = drawable;
        refreshDrawableState();
    }

    public void setRouteSelector(r4.r rVar) {
        if (rVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (this.mSelector.equals(rVar)) {
            return;
        }
        if (this.mAttachedToWindow) {
            if (!this.mSelector.d()) {
                this.mRouter.h(this.mCallback);
            }
            if (!rVar.d()) {
                this.mRouter.a(rVar, this.mCallback, 0);
            }
        }
        this.mSelector = rVar;
        refreshRoute();
    }

    @Override // android.view.View
    public void setVisibility(int i3) {
        super.setVisibility(i3);
        Drawable drawable = this.mRemoteIndicator;
        if (drawable != null) {
            drawable.setVisible(i3 == 0, false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00f5, code lost:
    
        if (r3 != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0092, code lost:
    
        if (b8.e1.a(r3) != false) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00fa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean showDialog() {
        boolean a10;
        ApplicationInfo applicationInfo;
        boolean z10;
        ApplicationInfo applicationInfo2;
        boolean z11 = false;
        if (!this.mAttachedToWindow) {
            return false;
        }
        this.mRouter.getClass();
        r4.y.b();
        r4.a0 a0Var = r4.y.c().u;
        if (a0Var == null) {
            return showDialogForType(1);
        }
        if (a0Var.c) {
            if (r4.y.c == null ? false : r4.y.c().f()) {
                Context context = getContext();
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 34) {
                    if (i3 >= 30) {
                        MediaRouter2 a11 = q0.a(context);
                        if (i3 >= 34) {
                            a10 = r0.a(a11);
                            if (!a10) {
                                if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                                    Intent putExtra = new Intent("android.settings.BLUETOOTH_SETTINGS").addFlags(268468224).putExtra("EXTRA_CONNECTION_ONLY", true).putExtra("android.bluetooth.devicepicker.extra.FILTER_TYPE", 1);
                                    Iterator<ResolveInfo> it = context.getPackageManager().queryIntentActivities(putExtra, 0).iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            z10 = false;
                                            break;
                                        }
                                        ActivityInfo activityInfo = it.next().activityInfo;
                                        if (activityInfo != null && (applicationInfo2 = activityInfo.applicationInfo) != null && (applicationInfo2.flags & hs.N1) != 0) {
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
                    a10 = false;
                    if (!a10) {
                    }
                    z11 = true;
                    if (z11) {
                    }
                } else if (i3 >= 31) {
                    Intent putExtra2 = new Intent().setAction("com.android.systemui.action.LAUNCH_MEDIA_OUTPUT_DIALOG").setPackage("com.android.systemui").putExtra("package_name", context.getPackageName());
                    Iterator<ResolveInfo> it2 = context.getPackageManager().queryBroadcastReceivers(putExtra2, 0).iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            ActivityInfo activityInfo2 = it2.next().activityInfo;
                            if (activityInfo2 != null && (applicationInfo = activityInfo2.applicationInfo) != null && (applicationInfo.flags & hs.N1) != 0) {
                                context.sendBroadcast(putExtra2);
                                break;
                            }
                        }
                    }
                    a10 = true;
                    if (!a10) {
                    }
                    z11 = true;
                    if (z11) {
                    }
                } else {
                    if (i3 == 30) {
                        a10 = e1.a(context);
                        if (!a10) {
                        }
                        z11 = true;
                        if (z11) {
                        }
                    }
                    a10 = false;
                    if (!a10) {
                    }
                    z11 = true;
                    if (z11) {
                    }
                }
            }
        }
        return showDialogForType(a0Var.a);
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
