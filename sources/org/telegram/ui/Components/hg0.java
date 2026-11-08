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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class hg0 extends FrameLayout {
    public static final /* synthetic */ int R = 0;
    public int D;
    public boolean E;
    public xq F;
    public hb0 G;
    public hb0 H;
    public org.telegram.ui.aa0 I;
    public fg0 J;
    public TextView K;
    public boolean L;
    public TLRPC.User M;
    public int N;
    public boolean O;
    public eg0 P;
    public org.telegram.ui.x90 Q;
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
    public dg0 w;
    public boolean x;
    public int y;

    public final void a() {
        dg0 dg0Var = this.w;
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
        animatorSet2.playTogether(ObjectAnimator.ofFloat(dg0Var, (Property<dg0, Float>) View.TRANSLATION_Y, org.telegram.messenger.g0.L(10.0f) + dg0Var.getMeasuredHeight()));
        if (this.E) {
            float measuredHeight = dg0Var.getMeasuredHeight();
            this.s.setDuration(Math.max(60, (int) (((measuredHeight - dg0Var.getTranslationY()) * 250.0f) / measuredHeight)));
            this.E = false;
        } else {
            this.s.setDuration(250L);
        }
        this.s.setInterpolator(xq.f);
        this.s.addListener(new gg0(this, 2));
        org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.j1, 512);
        this.s.start();
    }

    public final boolean b(MotionEvent motionEvent, boolean z9) {
        dg0 dg0Var = this.w;
        int i7 = 0;
        if (!this.r) {
            if (motionEvent == null || (!(motionEvent.getAction() == 0 || motionEvent.getAction() == 2) || this.f || this.e || motionEvent.getPointerCount() != 1)) {
                if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.d) {
                    if (this.a == null) {
                        this.a = VelocityTracker.obtain();
                    }
                    float abs = Math.abs((int) (motionEvent.getX() - this.b));
                    float y10 = ((int) motionEvent.getY()) - this.c;
                    this.a.addMovement(motionEvent);
                    if (this.e && !this.f && y10 > 0.0f && y10 / 3.0f > Math.abs(abs) && Math.abs(y10) >= this.D) {
                        this.c = (int) motionEvent.getY();
                        this.e = false;
                        this.f = true;
                        requestDisallowInterceptTouchEvent(true);
                    } else if (this.f) {
                        float translationY = dg0Var.getTranslationY() + y10;
                        dg0Var.setTranslationY(translationY >= 0.0f ? translationY : 0.0f);
                        this.c = (int) motionEvent.getY();
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.d && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                    if (this.a == null) {
                        this.a = VelocityTracker.obtain();
                    }
                    this.a.computeCurrentVelocity(1000);
                    float translationY2 = dg0Var.getTranslationY();
                    if (this.f || translationY2 != 0.0f) {
                        float xVelocity = this.a.getXVelocity();
                        float yVelocity = this.a.getYVelocity();
                        if ((dg0Var.getTranslationY() >= org.telegram.messenger.g0.a1(false, 0.8f) || (yVelocity >= 3500.0f && Math.abs(yVelocity) >= Math.abs(xVelocity))) && (yVelocity >= 0.0f || Math.abs(yVelocity) < 3500.0f)) {
                            this.E = true;
                            a();
                        } else {
                            AnimatorSet animatorSet = new AnimatorSet();
                            this.h = animatorSet;
                            animatorSet.playTogether(ObjectAnimator.ofFloat(dg0Var, (Property<dg0, Float>) View.TRANSLATION_Y, 0.0f));
                            this.h.setDuration((int) ((Math.max(0.0f, r6) / org.telegram.messenger.g0.a1(false, 0.8f)) * 150.0f));
                            this.h.setInterpolator(xq.g);
                            this.h.addListener(new gg0(this, i7));
                            org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.j1, 512);
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
                if (y11 < dg0Var.getTop() || this.b < dg0Var.getLeft() || this.b > dg0Var.getRight()) {
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
            if ((!z9 && this.e) || this.f) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x016d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(boolean z9) {
        boolean z10;
        TextView textView = this.K;
        TLRPC.User user = this.M;
        fg0 fg0Var = this.J;
        float value = getValue();
        String y10 = org.telegram.messenger.id.y(value, 2, Boolean.valueOf(this.O));
        int i7 = (int) value;
        org.telegram.ui.pa0 pa0Var = this.I.b;
        ArrayList arrayList = pa0Var.n0;
        m4.d0 d0Var = pa0Var.K;
        if (d0Var != null) {
            d0Var.V0(i7);
            if (z9) {
                g6.d0 d0Var2 = (g6.d0) ((nb.a) org.telegram.messenger.t0.k()).onCreateLatLngBoundsBuilder();
                d0Var2.X(new org.telegram.messenger.cb(pa0Var.y0.getLatitude(), pa0Var.y0.getLongitude()));
                try {
                    int max = Math.max(i7, org.telegram.messenger.qs.Z3);
                    org.telegram.messenger.cb a10 = d0Var2.R().a();
                    double d = max;
                    org.telegram.messenger.cb z02 = org.telegram.ui.pa0.z0(a10, d, d);
                    double d2 = -max;
                    d0Var2.X(org.telegram.ui.pa0.z0(a10, d2, d2));
                    d0Var2.X(z02);
                    org.telegram.messenger.da R2 = d0Var2.R();
                    try {
                        pa0Var.E.o(org.telegram.messenger.g0.L(70.0f), 0, org.telegram.messenger.g0.L(70.0f), ((int) ((pa0Var.N.getCustomView().getMeasuredHeight() - org.telegram.messenger.g0.L(40.0f)) + pa0Var.O.getTranslationY())) + pa0Var.g0 + pa0Var.b0);
                        pa0Var.E.c(((nb.a) org.telegram.messenger.t0.k()).newCameraUpdateLatLngBounds(R2, 0));
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                } catch (Exception unused) {
                }
            }
        }
        if (!org.telegram.messenger.m5.z(pa0Var.l0)) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                org.telegram.ui.la0 la0Var = (org.telegram.ui.la0) arrayList.get(i10);
                if (la0Var.b != null && !org.telegram.messenger.t10.B(la0Var.c)) {
                    TLRPC.GeoPoint geoPoint = la0Var.b.media.geo;
                    Location location = new Location("network");
                    location.setLatitude(geoPoint.lat);
                    location.setLongitude(geoPoint._long);
                    if (pa0Var.y0.distanceTo(location) > i7) {
                    }
                }
            }
            z10 = false;
            if (z10 && user != null) {
                textView.setText(org.telegram.messenger.id.a0("LocationNotifiationCloser", null, 2131748754, y10));
                if (fg0Var.getTag() == null) {
                    fg0Var.setTag(1);
                    fg0Var.animate().setDuration(180L).alpha(0.0f).scaleX(0.5f).scaleY(0.5f).start();
                    textView.animate().setDuration(180L).alpha(1.0f).scaleX(1.0f).scaleY(1.0f).start();
                    return;
                }
                return;
            }
            if (user != null) {
                fg0Var.setText(org.telegram.messenger.id.a0("LocationNotifiationButtonGroup", null, 2131748756, y10));
            } else {
                fg0Var.setText(org.telegram.messenger.id.a0("LocationNotifiationButtonUser", null, 2131748755, TextUtils.ellipsize(org.telegram.messenger.t10.j(user, true), fg0Var.getPaint(), Math.max(org.telegram.messenger.g0.L(10.0f), (int) (((this.N - org.telegram.messenger.g0.L(94.0f)) * 1.5f) - ((int) Math.ceil(fg0Var.getPaint().measureText(org.telegram.messenger.id.M0(2131748755, null)))))), TextUtils.TruncateAt.END), y10));
            }
            if (fg0Var.getTag() == null) {
                fg0Var.setTag(null);
                fg0Var.animate().setDuration(180L).alpha(1.0f).scaleX(1.0f).scaleY(1.0f).start();
                textView.animate().setDuration(180L).alpha(0.0f).scaleX(0.5f).scaleY(0.5f).start();
                return;
            }
            return;
        }
        z10 = true;
        if (z10) {
        }
        if (user != null) {
        }
        if (fg0Var.getTag() == null) {
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
        return this.P;
    }

    public boolean getRadiusSet() {
        return this.L;
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
        float value = this.G.getValue() * 1000;
        int value2 = this.H.getValue();
        boolean z9 = this.O;
        if (z9) {
            if (value2 == 1) {
                f10 = 47.349f;
            }
        } else if (value2 == 1) {
            f10 = 50.0f;
        }
        float f11 = value + f10;
        return z9 ? f11 * 1.60934f : f11;
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
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19 = i12 - i10;
        dg0 dg0Var = this.w;
        int measuredHeight = i19 - dg0Var.getMeasuredHeight();
        int i20 = i11 - i7;
        int measuredWidth = (i20 - dg0Var.getMeasuredWidth()) / 2;
        dg0Var.layout(measuredWidth, measuredHeight, dg0Var.getMeasuredWidth() + measuredWidth, dg0Var.getMeasuredHeight() + measuredHeight);
        int childCount = getChildCount();
        for (int i21 = 0; i21 < childCount; i21++) {
            View childAt = getChildAt(i21);
            if (childAt.getVisibility() != 8 && childAt != dg0Var) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth2 = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                int i22 = layoutParams.gravity;
                if (i22 == -1) {
                    i22 = 51;
                }
                int i23 = i22 & org.telegram.messenger.qs.x1;
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
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        getRootView();
        getWindowVisibleDisplayFrame(this.n);
        setMeasuredDimension(size, size2);
        dg0 dg0Var = this.w;
        dg0Var.measure(View.MeasureSpec.makeMeasureSpec((this.y * 2) + size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_31));
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8 && childAt != dg0Var) {
                measureChildWithMargins(childAt, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), 0, View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30), 0);
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.r || b(motionEvent, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z9) {
        if (this.e && !this.f) {
            onTouchEvent(null);
        }
        super.requestDisallowInterceptTouchEvent(z9);
    }
}
