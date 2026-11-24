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
import java.util.Iterator;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
    private at6 mDialogFactory;
    boolean mIsFixedIcon;
    private int mLastConnectionState;
    private int mMinHeight;
    private int mMinWidth;
    private Drawable mRemoteIndicator;
    b mRemoteIndicatorLoader;
    private int mRemoteIndicatorResIdToLoad;
    private final gu6 mRouter;
    private yt6 mSelector;
    static final SparseArray<Drawable.ConstantState> sRemoteIndicatorCache = new SparseArray<>(2);
    private static final int[] CHECKED_STATE_SET = {R.attr.state_checked};
    private static final int[] CHECKABLE_STATE_SET = {R.attr.state_checkable};

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MediaRouteButton(Context context, AttributeSet attributeSet, int i) {
        super(r7 != 0 ? new ContextThemeWrapper(r0, r7) : r0, attributeSet, i);
        Drawable.ConstantState constantState;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, voe.e(context));
        int g = voe.g(contextThemeWrapper, org.telegram.messenger.beta.R.attr.mediaRouteTheme);
        this.mSelector = yt6.c;
        this.mDialogFactory = at6.a;
        Context context2 = getContext();
        int[] iArr = iy8.a;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i, 0);
        jdc.j(this, context2, iArr, attributeSet, obtainStyledAttributes, i);
        if (isInEditMode()) {
            this.mRouter = null;
            this.mCallback = null;
            this.mRemoteIndicator = hmd.a(context2, obtainStyledAttributes.getResourceId(3, 0));
            return;
        }
        this.mRouter = gu6.d(context2);
        this.mCallback = new a(this);
        eu6 f = gu6.f();
        int i2 = !f.d() ? f.i : 0;
        this.mConnectionState = i2;
        this.mLastConnectionState = i2;
        this.mButtonTint = obtainStyledAttributes.getColorStateList(4);
        this.mMinWidth = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.mMinHeight = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        int resourceId = obtainStyledAttributes.getResourceId(3, 0);
        this.mRemoteIndicatorResIdToLoad = obtainStyledAttributes.getResourceId(2, 0);
        obtainStyledAttributes.recycle();
        int i3 = this.mRemoteIndicatorResIdToLoad;
        if (i3 != 0 && (constantState = sRemoteIndicatorCache.get(i3)) != null) {
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

    private go4 getFragmentManager() {
        Activity activity = getActivity();
        if (activity instanceof en4) {
            return ((en4) activity).u();
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

    private boolean showDialogForType(int i) {
        go4 fragmentManager = getFragmentManager();
        if (fragmentManager == null) {
            sc8.j("The activity must be a subclass of FragmentActivity");
            return false;
        }
        this.mRouter.getClass();
        if (gu6.f().d()) {
            if (fragmentManager.D(CHOOSER_FRAGMENT_TAG) != null) {
                Log.w(TAG, "showDialog(): Route chooser dialog already showing!");
                return false;
            }
            this.mDialogFactory.getClass();
            ks6 ks6Var = new ks6();
            yt6 yt6Var = this.mSelector;
            if (yt6Var == null) {
                w26.j("selector must not be null");
                return false;
            }
            ks6Var.Q();
            if (!ks6Var.D0.equals(yt6Var)) {
                ks6Var.D0 = yt6Var;
                Bundle bundle = ks6Var.f;
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putBundle("selector", yt6Var.a);
                ks6Var.N(bundle);
                dp dpVar = ks6Var.C0;
                if (dpVar != null) {
                    if (ks6Var.B0) {
                        ((gt6) dpVar).f(yt6Var);
                    } else {
                        ((js6) dpVar).h(yt6Var);
                    }
                }
            }
            if (i == 2) {
                if (ks6Var.C0 != null) {
                    sc8.j("This must be called before creating dialog");
                    return false;
                }
                ks6Var.B0 = true;
            }
            id0 id0Var = new id0(fragmentManager);
            id0Var.f(0, ks6Var, CHOOSER_FRAGMENT_TAG);
            id0Var.e(true, true);
            return true;
        }
        if (fragmentManager.D(CONTROLLER_FRAGMENT_TAG) != null) {
            Log.w(TAG, "showDialog(): Route controller dialog already showing!");
            return false;
        }
        this.mDialogFactory.getClass();
        xs6 xs6Var = new xs6();
        yt6 yt6Var2 = this.mSelector;
        if (yt6Var2 == null) {
            w26.j("selector must not be null");
            return false;
        }
        yt6 yt6Var3 = xs6Var.D0;
        if (yt6Var3 == null) {
            Bundle bundle2 = xs6Var.f;
            if (bundle2 != null) {
                yt6Var3 = yt6.b(bundle2.getBundle("selector"));
                xs6Var.D0 = yt6Var3;
            }
            yt6 yt6Var4 = yt6Var3;
            if (yt6Var3 == null) {
                yt6Var3 = yt6.c;
                xs6Var.D0 = yt6Var3;
            } else {
                yt6Var3 = yt6Var4;
            }
        }
        if (!yt6Var3.equals(yt6Var2)) {
            xs6Var.D0 = yt6Var2;
            Bundle bundle3 = xs6Var.f;
            if (bundle3 == null) {
                bundle3 = new Bundle();
            }
            bundle3.putBundle("selector", yt6Var2.a);
            xs6Var.N(bundle3);
            dp dpVar2 = xs6Var.C0;
            if (dpVar2 != null && xs6Var.B0) {
                ((rt6) dpVar2).i(yt6Var2);
            }
        }
        if (i == 2) {
            if (xs6Var.C0 != null) {
                sc8.j("This must be called before creating dialog");
                return false;
            }
            xs6Var.B0 = true;
        }
        id0 id0Var2 = new id0(fragmentManager);
        id0Var2.f(0, xs6Var, CONTROLLER_FRAGMENT_TAG);
        id0Var2.e(true, true);
        return true;
    }

    private void updateContentDescription() {
        int i = this.mConnectionState;
        String string = getContext().getString(i != 1 ? i != 2 ? org.telegram.messenger.beta.R.string.mr_cast_button_disconnected : org.telegram.messenger.beta.R.string.mr_cast_button_connected : org.telegram.messenger.beta.R.string.mr_cast_button_connecting);
        setContentDescription(string);
        if (!this.mCheatSheetEnabled || TextUtils.isEmpty(string)) {
            string = null;
        }
        uve.a(this, string);
    }

    @Override // android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.mRemoteIndicator != null) {
            this.mRemoteIndicator.setState(getDrawableState());
            if (this.mRemoteIndicator.getCurrent() instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) this.mRemoteIndicator.getCurrent();
                int i = this.mConnectionState;
                if (i == 1 || this.mLastConnectionState != i) {
                    if (!animationDrawable.isRunning()) {
                        animationDrawable.start();
                    }
                } else if (i == 2 && !animationDrawable.isRunning()) {
                    animationDrawable.selectDrawable(animationDrawable.getNumberOfFrames() - 1);
                }
            }
            invalidate();
        }
        this.mLastConnectionState = this.mConnectionState;
    }

    @Deprecated
    public void enableDynamicGroup() {
        hu6 hu6Var;
        this.mRouter.getClass();
        gu6.b();
        iu6 iu6Var = gu6.c().u;
        if (iu6Var == null) {
            hu6Var = new hu6();
        } else {
            hu6 hu6Var2 = new hu6();
            Bundle bundle = iu6Var.e;
            hu6Var2.a = iu6Var.a;
            hu6Var2.c = iu6Var.c;
            hu6Var2.d = iu6Var.d;
            hu6Var2.b = iu6Var.b;
            hu6Var2.e = bundle == null ? null : new Bundle(bundle);
            hu6Var = hu6Var2;
        }
        hu6Var.a = (byte) 2;
        gu6 gu6Var = this.mRouter;
        iu6 iu6Var2 = new iu6(hu6Var);
        gu6Var.getClass();
        gu6.i(iu6Var2);
    }

    public at6 getDialogFactory() {
        return this.mDialogFactory;
    }

    public yt6 getRouteSelector() {
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
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.mRouter != null && !this.mIsFixedIcon) {
            int i2 = this.mConnectionState;
            if (i2 == 1) {
                View.mergeDrawableStates(onCreateDrawableState, CHECKABLE_STATE_SET);
                return onCreateDrawableState;
            }
            if (i2 == 2) {
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
            int i = (((width - paddingLeft) - intrinsicWidth) / 2) + paddingLeft;
            int i2 = (((height - paddingTop) - intrinsicHeight) / 2) + paddingTop;
            this.mRemoteIndicator.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
            this.mRemoteIndicator.draw(canvas);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int i4 = this.mMinWidth;
        Drawable drawable = this.mRemoteIndicator;
        int i5 = 0;
        if (drawable != null) {
            i3 = getPaddingRight() + getPaddingLeft() + drawable.getIntrinsicWidth();
        } else {
            i3 = 0;
        }
        int max = Math.max(i4, i3);
        int i6 = this.mMinHeight;
        Drawable drawable2 = this.mRemoteIndicator;
        if (drawable2 != null) {
            i5 = getPaddingBottom() + getPaddingTop() + drawable2.getIntrinsicHeight();
        }
        int max2 = Math.max(i6, i5);
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
        eu6 f = gu6.f();
        int i = !f.d() ? f.i : 0;
        if (this.mConnectionState != i) {
            this.mConnectionState = i;
            updateContentDescription();
            refreshDrawableState();
        }
        if (i == 1) {
            loadRemoteIndicatorIfNeeded();
        }
    }

    public void setCheatSheetEnabled(boolean z) {
        if (z != this.mCheatSheetEnabled) {
            this.mCheatSheetEnabled = z;
            updateContentDescription();
        }
    }

    public void setDialogFactory(at6 at6Var) {
        if (at6Var != null) {
            this.mDialogFactory = at6Var;
        } else {
            w26.j("factory must not be null");
        }
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

    public void setRouteSelector(yt6 yt6Var) {
        if (yt6Var == null) {
            w26.j("selector must not be null");
            return;
        }
        if (this.mSelector.equals(yt6Var)) {
            return;
        }
        if (this.mAttachedToWindow) {
            if (!this.mSelector.d()) {
                this.mRouter.h(this.mCallback);
            }
            if (!yt6Var.d()) {
                this.mRouter.a(yt6Var, this.mCallback, 0);
            }
        }
        this.mSelector = yt6Var;
        refreshRoute();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        Drawable drawable = this.mRemoteIndicator;
        if (drawable != null) {
            drawable.setVisible(i == 0, false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0091, code lost:
    
        if (wue.a(r3) != false) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean showDialog() {
        boolean a;
        ApplicationInfo applicationInfo;
        ApplicationInfo applicationInfo2;
        if (!this.mAttachedToWindow) {
            return false;
        }
        this.mRouter.getClass();
        gu6.b();
        iu6 iu6Var = gu6.c().u;
        if (iu6Var == null) {
            return showDialogForType(1);
        }
        if (iu6Var.c) {
            if (gu6.c == null ? false : gu6.c().f()) {
                Context context = getContext();
                int i = Build.VERSION.SDK_INT;
                if (i >= 34) {
                    if (i >= 30) {
                        MediaRouter2 a2 = edb.a(context);
                        if (i >= 34) {
                            a = fdb.a(a2);
                            if (a) {
                                return true;
                            }
                            if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                                Intent putExtra = new Intent("android.settings.BLUETOOTH_SETTINGS").addFlags(268468224).putExtra("EXTRA_CONNECTION_ONLY", true).putExtra("android.bluetooth.devicepicker.extra.FILTER_TYPE", 1);
                                Iterator<ResolveInfo> it = context.getPackageManager().queryIntentActivities(putExtra, 0).iterator();
                                while (it.hasNext()) {
                                    ActivityInfo activityInfo = it.next().activityInfo;
                                    if (activityInfo != null && (applicationInfo2 = activityInfo.applicationInfo) != null && (applicationInfo2.flags & kk7.M1) != 0) {
                                        context.startActivity(putExtra);
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                    a = false;
                    if (a) {
                    }
                } else if (i >= 31) {
                    Intent putExtra2 = new Intent().setAction("com.android.systemui.action.LAUNCH_MEDIA_OUTPUT_DIALOG").setPackage("com.android.systemui").putExtra("package_name", context.getPackageName());
                    Iterator<ResolveInfo> it2 = context.getPackageManager().queryBroadcastReceivers(putExtra2, 0).iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            ActivityInfo activityInfo2 = it2.next().activityInfo;
                            if (activityInfo2 != null && (applicationInfo = activityInfo2.applicationInfo) != null && (applicationInfo.flags & kk7.M1) != 0) {
                                context.sendBroadcast(putExtra2);
                                break;
                            }
                        }
                    }
                    a = true;
                    if (a) {
                    }
                } else {
                    if (i == 30) {
                        a = wue.a(context);
                        if (a) {
                        }
                    }
                    a = false;
                    if (a) {
                    }
                }
            }
        }
        return showDialogForType(iu6Var.a);
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.mRemoteIndicator;
    }

    @Deprecated
    public void setAlwaysVisible(boolean z) {
    }

    public MediaRouteButton(Context context) {
        this(context, null);
    }

    public MediaRouteButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, org.telegram.messenger.beta.R.attr.mediaRouteButtonStyle);
    }
}
