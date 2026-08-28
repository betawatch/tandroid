package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Rect;
import android.location.Location;
import android.text.TextUtils;
import android.util.Property;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.IMapsProvider;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class qh0 extends FrameLayout {
    public static final /* synthetic */ int N = 0;
    public boolean A;
    public gr B;
    public bc0 C;
    public bc0 D;
    public org.telegram.ui.vb0 E;
    public oh0 F;
    public TextView G;
    public boolean H;
    public TLRPC.User I;
    public int J;
    public boolean K;
    public nh0 L;
    public org.telegram.ui.xb0 M;
    public VelocityTracker a;
    public int b;
    public int c;
    public int d;
    public boolean e;
    public boolean f;
    public AnimatorSet h;
    public Rect n;
    public boolean r;
    public AnimatorSet s;
    public mh0 v;
    public boolean w;
    public int x;
    public int y;

    public final void a() {
        mh0 mh0Var = this.v;
        if (this.r) {
            return;
        }
        this.r = true;
        AnimatorSet animatorSet = this.s;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.s = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.s = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(mh0Var, (Property<mh0, Float>) View.TRANSLATION_Y, AndroidUtilities.dp(10.0f) + mh0Var.getMeasuredHeight()));
        if (this.A) {
            float measuredHeight = mh0Var.getMeasuredHeight();
            this.s.setDuration(Math.max(60, (int) (((measuredHeight - mh0Var.getTranslationY()) * 250.0f) / measuredHeight)));
            this.A = false;
        } else {
            this.s.setDuration(250L);
        }
        this.s.setInterpolator(gr.f);
        this.s.addListener(new ph0(this, 2));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        this.s.start();
    }

    public final boolean b(MotionEvent motionEvent, boolean z10) {
        mh0 mh0Var = this.v;
        int i9 = 0;
        if (!this.r) {
            if (motionEvent == null || (!(motionEvent.getAction() == 0 || motionEvent.getAction() == 2) || this.f || this.e || motionEvent.getPointerCount() != 1)) {
                if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.d) {
                    if (this.a == null) {
                        this.a = VelocityTracker.obtain();
                    }
                    float abs = Math.abs((int) (motionEvent.getX() - this.b));
                    float y10 = ((int) motionEvent.getY()) - this.c;
                    this.a.addMovement(motionEvent);
                    if (this.e && !this.f && y10 > 0.0f && y10 / 3.0f > Math.abs(abs) && Math.abs(y10) >= this.y) {
                        this.c = (int) motionEvent.getY();
                        this.e = false;
                        this.f = true;
                        requestDisallowInterceptTouchEvent(true);
                    } else if (this.f) {
                        float translationY = mh0Var.getTranslationY() + y10;
                        mh0Var.setTranslationY(translationY >= 0.0f ? translationY : 0.0f);
                        this.c = (int) motionEvent.getY();
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.d && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                    if (this.a == null) {
                        this.a = VelocityTracker.obtain();
                    }
                    this.a.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT);
                    float translationY2 = mh0Var.getTranslationY();
                    if (this.f || translationY2 != 0.0f) {
                        float xVelocity = this.a.getXVelocity();
                        float yVelocity = this.a.getYVelocity();
                        if ((mh0Var.getTranslationY() >= AndroidUtilities.getPixelsInCM(0.8f, false) || (yVelocity >= 3500.0f && Math.abs(yVelocity) >= Math.abs(xVelocity))) && (yVelocity >= 0.0f || Math.abs(yVelocity) < 3500.0f)) {
                            this.A = true;
                            a();
                        } else {
                            AnimatorSet animatorSet = new AnimatorSet();
                            this.h = animatorSet;
                            animatorSet.playTogether(ObjectAnimator.ofFloat(mh0Var, (Property<mh0, Float>) View.TRANSLATION_Y, 0.0f));
                            this.h.setDuration((int) ((Math.max(0.0f, r6) / AndroidUtilities.getPixelsInCM(0.8f, false)) * 150.0f));
                            this.h.setInterpolator(gr.g);
                            this.h.addListener(new ph0(this, i9));
                            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                            this.h.start();
                        }
                        this.f = false;
                    } else {
                        this.e = false;
                        this.f = false;
                    }
                    VelocityTracker velocityTracker = this.a;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                        this.a = null;
                    }
                    this.d = -1;
                }
            } else {
                this.b = (int) motionEvent.getX();
                int y11 = (int) motionEvent.getY();
                this.c = y11;
                if (y11 < mh0Var.getTop() || this.b < mh0Var.getLeft() || this.b > mh0Var.getRight()) {
                    requestDisallowInterceptTouchEvent(true);
                    a();
                    return true;
                }
                this.d = motionEvent.getPointerId(0);
                this.e = true;
                AnimatorSet animatorSet2 = this.h;
                if (animatorSet2 != null) {
                    animatorSet2.cancel();
                    this.h = null;
                }
                VelocityTracker velocityTracker2 = this.a;
                if (velocityTracker2 != null) {
                    velocityTracker2.clear();
                }
            }
            if ((!z10 && this.e) || this.f) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0161  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(boolean z10) {
        boolean z11;
        TextView textView = this.G;
        TLRPC.User user = this.I;
        oh0 oh0Var = this.F;
        float value = getValue();
        String formatDistance = LocaleController.formatDistance(value, 2, Boolean.valueOf(this.K));
        int i9 = (int) value;
        org.telegram.ui.pc0 pc0Var = this.E.b;
        ArrayList arrayList = pc0Var.c0;
        IMapsProvider.ICircle iCircle = pc0Var.K;
        if (iCircle != null) {
            iCircle.setRadius(i9);
            if (z10) {
                IMapsProvider.ILatLngBoundsBuilder onCreateLatLngBoundsBuilder = ApplicationLoader.getMapsProvider().onCreateLatLngBoundsBuilder();
                onCreateLatLngBoundsBuilder.include(new IMapsProvider.LatLng(pc0Var.s0.getLatitude(), pc0Var.s0.getLongitude()));
                try {
                    int max = Math.max(i9, MediaDataController.MAX_LINKS_COUNT);
                    IMapsProvider.LatLng center = onCreateLatLngBoundsBuilder.build().getCenter();
                    double d = max;
                    IMapsProvider.LatLng o02 = org.telegram.ui.pc0.o0(center, d, d);
                    double d9 = -max;
                    onCreateLatLngBoundsBuilder.include(org.telegram.ui.pc0.o0(center, d9, d9));
                    onCreateLatLngBoundsBuilder.include(o02);
                    IMapsProvider.ILatLngBounds build = onCreateLatLngBoundsBuilder.build();
                    try {
                        pc0Var.E.setPadding(AndroidUtilities.dp(70.0f), 0, AndroidUtilities.dp(70.0f), (int) ((pc0Var.N.getCustomView().getMeasuredHeight() - AndroidUtilities.dp(40.0f)) + pc0Var.O.getTranslationY()));
                        pc0Var.E.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngBounds(build, 0), 500, null);
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                } catch (Exception unused) {
                }
            }
        }
        if (!DialogObject.isChatDialog(pc0Var.a0)) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                org.telegram.ui.jc0 jc0Var = (org.telegram.ui.jc0) arrayList.get(i10);
                if (jc0Var.b != null && !UserObject.isUserSelf(jc0Var.c)) {
                    TLRPC.GeoPoint geoPoint = jc0Var.b.media.geo;
                    Location location = new Location("network");
                    location.setLatitude(geoPoint.lat);
                    location.setLongitude(geoPoint._long);
                    if (pc0Var.s0.distanceTo(location) > i9) {
                    }
                }
            }
            z11 = false;
            if (z11 && user != null) {
                textView.setText(LocaleController.formatString("LocationNotifiationCloser", R.string.LocationNotifiationCloser, formatDistance));
                if (oh0Var.getTag() == null) {
                    oh0Var.setTag(1);
                    oh0Var.animate().setDuration(180L).alpha(0.0f).scaleX(0.5f).scaleY(0.5f).start();
                    textView.animate().setDuration(180L).alpha(1.0f).scaleX(1.0f).scaleY(1.0f).start();
                    return;
                }
                return;
            }
            if (user != null) {
                oh0Var.setText(LocaleController.formatString("LocationNotifiationButtonGroup", R.string.LocationNotifiationButtonGroup, formatDistance));
            } else {
                oh0Var.setText(LocaleController.formatString("LocationNotifiationButtonUser", R.string.LocationNotifiationButtonUser, TextUtils.ellipsize(UserObject.getFirstName(user), oh0Var.getPaint(), Math.max(AndroidUtilities.dp(10.0f), (int) (((this.J - AndroidUtilities.dp(94.0f)) * 1.5f) - ((int) Math.ceil(oh0Var.getPaint().measureText(LocaleController.getString(R.string.LocationNotifiationButtonUser)))))), TextUtils.TruncateAt.END), formatDistance));
            }
            if (oh0Var.getTag() == null) {
                oh0Var.setTag(null);
                oh0Var.animate().setDuration(180L).alpha(1.0f).scaleX(1.0f).scaleY(1.0f).start();
                textView.animate().setDuration(180L).alpha(0.0f).scaleX(0.5f).scaleY(0.5f).start();
                return;
            }
            return;
        }
        z11 = true;
        if (z11) {
        }
        if (user != null) {
        }
        if (oh0Var.getTag() == null) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.r) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public View getCustomView() {
        return this.L;
    }

    public boolean getRadiusSet() {
        return this.H;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001b, code lost:
    
        if (r1 > 1) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
    
        r1 = r1 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001f, code lost:
    
        r1 = r1 * 100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0028, code lost:
    
        if (r1 > 1) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public float getValue() {
        float f10;
        float value = this.C.getValue() * MediaDataController.MAX_STYLE_RUNS_COUNT;
        int value2 = this.D.getValue();
        boolean z10 = this.K;
        if (z10) {
            if (value2 == 1) {
                f10 = 47.349f;
            }
        } else if (value2 == 1) {
            f10 = 50.0f;
        }
        float f11 = value + f10;
        return z10 ? f11 * 1.60934f : f11;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.r || b(motionEvent, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19 = i12 - i10;
        mh0 mh0Var = this.v;
        int measuredHeight = i19 - mh0Var.getMeasuredHeight();
        int i20 = i11 - i9;
        int measuredWidth = (i20 - mh0Var.getMeasuredWidth()) / 2;
        mh0Var.layout(measuredWidth, measuredHeight, mh0Var.getMeasuredWidth() + measuredWidth, mh0Var.getMeasuredHeight() + measuredHeight);
        int childCount = getChildCount();
        for (int i21 = 0; i21 < childCount; i21++) {
            View childAt = getChildAt(i21);
            if (childAt.getVisibility() != 8 && childAt != mh0Var) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth2 = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                int i22 = layoutParams.gravity;
                if (i22 == -1) {
                    i22 = 51;
                }
                int i23 = i22 & 112;
                int i24 = i22 & 7;
                if (i24 == 1) {
                    i13 = ((i20 - measuredWidth2) / 2) + layoutParams.leftMargin;
                    i14 = layoutParams.rightMargin;
                } else if (i24 != 5) {
                    i15 = layoutParams.leftMargin;
                    if (i23 != 16) {
                        i16 = ((i19 - measuredHeight2) / 2) + layoutParams.topMargin;
                        i17 = layoutParams.bottomMargin;
                    } else if (i23 != 80) {
                        i18 = layoutParams.topMargin;
                        childAt.layout(i15, i18, measuredWidth2 + i15, measuredHeight2 + i18);
                    } else {
                        i16 = i19 - measuredHeight2;
                        i17 = layoutParams.bottomMargin;
                    }
                    i18 = i16 - i17;
                    childAt.layout(i15, i18, measuredWidth2 + i15, measuredHeight2 + i18);
                } else {
                    i13 = i11 - measuredWidth2;
                    i14 = layoutParams.rightMargin;
                }
                i15 = i13 - i14;
                if (i23 != 16) {
                }
                i18 = i16 - i17;
                childAt.layout(i15, i18, measuredWidth2 + i15, measuredHeight2 + i18);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        int size = View.MeasureSpec.getSize(i9);
        int size2 = View.MeasureSpec.getSize(i10);
        getRootView();
        getWindowVisibleDisplayFrame(this.n);
        setMeasuredDimension(size, size2);
        mh0 mh0Var = this.v;
        mh0Var.measure(View.MeasureSpec.makeMeasureSpec((this.x * 2) + size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_31));
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8 && childAt != mh0Var) {
                measureChildWithMargins(childAt, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), 0, View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30), 0);
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.r || b(motionEvent, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        if (this.e && !this.f) {
            onTouchEvent(null);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }
}
