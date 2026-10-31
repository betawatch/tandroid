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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class jh0 extends FrameLayout {
    public static final /* synthetic */ int R = 0;
    public int D;
    public boolean E;
    public gr F;
    public ac0 G;
    public ac0 H;
    public org.telegram.ui.fb0 I;
    public hh0 J;
    public TextView K;
    public boolean L;
    public TLRPC.User M;
    public int N;
    public boolean O;
    public gh0 P;
    public org.telegram.ui.cb0 Q;
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
    public fh0 w;
    public boolean x;
    public int y;

    public final void a() {
        fh0 fh0Var = this.w;
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
        animatorSet2.playTogether(ObjectAnimator.ofFloat(fh0Var, (Property<fh0, Float>) View.TRANSLATION_Y, org.telegram.messenger.i0.L(10.0f) + fh0Var.getMeasuredHeight()));
        if (this.E) {
            float measuredHeight = fh0Var.getMeasuredHeight();
            this.s.setDuration(Math.max(60, (int) (((measuredHeight - fh0Var.getTranslationY()) * 250.0f) / measuredHeight)));
            this.E = false;
        } else {
            this.s.setDuration(250L);
        }
        this.s.setInterpolator(gr.f);
        this.s.addListener(new ih0(this, 2));
        org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.j1, 512);
        this.s.start();
    }

    public final boolean b(MotionEvent motionEvent, boolean z10) {
        fh0 fh0Var = this.w;
        int i10 = 0;
        if (!this.r) {
            if (motionEvent == null || (!(motionEvent.getAction() == 0 || motionEvent.getAction() == 2) || this.f || this.e || motionEvent.getPointerCount() != 1)) {
                if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.d) {
                    if (this.a == null) {
                        this.a = VelocityTracker.obtain();
                    }
                    float abs = Math.abs((int) (motionEvent.getX() - this.b));
                    float y3 = ((int) motionEvent.getY()) - this.c;
                    this.a.addMovement(motionEvent);
                    if (this.e && !this.f && y3 > 0.0f && y3 / 3.0f > Math.abs(abs) && Math.abs(y3) >= this.D) {
                        this.c = (int) motionEvent.getY();
                        this.e = false;
                        this.f = true;
                        requestDisallowInterceptTouchEvent(true);
                    } else if (this.f) {
                        float translationY = fh0Var.getTranslationY() + y3;
                        fh0Var.setTranslationY(translationY >= 0.0f ? translationY : 0.0f);
                        this.c = (int) motionEvent.getY();
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.d && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                    if (this.a == null) {
                        this.a = VelocityTracker.obtain();
                    }
                    this.a.computeCurrentVelocity(1000);
                    float translationY2 = fh0Var.getTranslationY();
                    if (this.f || translationY2 != 0.0f) {
                        float xVelocity = this.a.getXVelocity();
                        float yVelocity = this.a.getYVelocity();
                        if ((fh0Var.getTranslationY() >= org.telegram.messenger.i0.a1(false, 0.8f) || (yVelocity >= 3500.0f && Math.abs(yVelocity) >= Math.abs(xVelocity))) && (yVelocity >= 0.0f || Math.abs(yVelocity) < 3500.0f)) {
                            this.E = true;
                            a();
                        } else {
                            AnimatorSet animatorSet = new AnimatorSet();
                            this.h = animatorSet;
                            animatorSet.playTogether(ObjectAnimator.ofFloat(fh0Var, (Property<fh0, Float>) View.TRANSLATION_Y, 0.0f));
                            this.h.setDuration((int) ((Math.max(0.0f, r6) / org.telegram.messenger.i0.a1(false, 0.8f)) * 150.0f));
                            this.h.setInterpolator(gr.g);
                            this.h.addListener(new ih0(this, i10));
                            org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.j1, 512);
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
                int y10 = (int) motionEvent.getY();
                this.c = y10;
                if (y10 < fh0Var.getTop() || this.b < fh0Var.getLeft() || this.b > fh0Var.getRight()) {
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

    /* JADX WARN: Removed duplicated region for block: B:29:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x016f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(boolean z10) {
        boolean z11;
        TextView textView = this.K;
        TLRPC.User user = this.M;
        hh0 hh0Var = this.J;
        float value = getValue();
        String y3 = org.telegram.messenger.cd.y(value, 2, Boolean.valueOf(this.O));
        int i10 = (int) value;
        org.telegram.ui.yb0 yb0Var = this.I.b;
        ArrayList arrayList = yb0Var.p0;
        m4.c cVar = yb0Var.M;
        if (cVar != null) {
            cVar.H0(i10);
            if (z10) {
                m2.t tVar = (m2.t) ((t7.u) org.telegram.messenger.w0.k()).onCreateLatLngBoundsBuilder();
                tVar.D(new org.telegram.messenger.cb(yb0Var.E0.getLatitude(), yb0Var.E0.getLongitude()));
                try {
                    int max = Math.max(i10, org.telegram.messenger.zs.Z3);
                    org.telegram.messenger.cb a2 = tVar.l().a();
                    double d = max;
                    org.telegram.messenger.cb A0 = org.telegram.ui.yb0.A0(a2, d, d);
                    double d10 = -max;
                    tVar.D(org.telegram.ui.yb0.A0(a2, d10, d10));
                    tVar.D(A0);
                    org.telegram.messenger.ea l4 = tVar.l();
                    try {
                        yb0Var.G.q(org.telegram.messenger.i0.L(70.0f), 0, org.telegram.messenger.i0.L(70.0f), ((int) ((yb0Var.P.getCustomView().getMeasuredHeight() - org.telegram.messenger.i0.L(40.0f)) + yb0Var.Q.getTranslationY())) + yb0Var.i0 + yb0Var.d0);
                        yb0Var.G.c(((t7.u) org.telegram.messenger.w0.k()).newCameraUpdateLatLngBounds(l4, 0), 500);
                    } catch (Exception e) {
                        org.telegram.messenger.f8.g(e, true);
                    }
                } catch (Exception unused) {
                }
            }
        }
        if (!org.telegram.messenger.o5.z(yb0Var.n0)) {
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                org.telegram.ui.sb0 sb0Var = (org.telegram.ui.sb0) arrayList.get(i11);
                if (sb0Var.b != null && !org.telegram.messenger.h20.B(sb0Var.c)) {
                    TLRPC.GeoPoint geoPoint = sb0Var.b.media.geo;
                    Location location = new Location("network");
                    location.setLatitude(geoPoint.lat);
                    location.setLongitude(geoPoint._long);
                    if (yb0Var.E0.distanceTo(location) > i10) {
                    }
                }
            }
            z11 = false;
            if (z11 && user != null) {
                textView.setText(org.telegram.messenger.cd.a0("LocationNotifiationCloser", null, 2131748763, y3));
                if (hh0Var.getTag() == null) {
                    hh0Var.setTag(1);
                    hh0Var.animate().setDuration(180L).alpha(0.0f).scaleX(0.5f).scaleY(0.5f).start();
                    textView.animate().setDuration(180L).alpha(1.0f).scaleX(1.0f).scaleY(1.0f).start();
                    return;
                }
                return;
            }
            if (user != null) {
                hh0Var.setText(org.telegram.messenger.cd.a0("LocationNotifiationButtonGroup", null, 2131748765, y3));
            } else {
                hh0Var.setText(org.telegram.messenger.cd.a0("LocationNotifiationButtonUser", null, 2131748764, TextUtils.ellipsize(org.telegram.messenger.h20.j(user, true), hh0Var.getPaint(), Math.max(org.telegram.messenger.i0.L(10.0f), (int) (((this.N - org.telegram.messenger.i0.L(94.0f)) * 1.5f) - ((int) Math.ceil(hh0Var.getPaint().measureText(org.telegram.messenger.cd.L0(2131748764, null)))))), TextUtils.TruncateAt.END), y3));
            }
            if (hh0Var.getTag() == null) {
                hh0Var.setTag(null);
                hh0Var.animate().setDuration(180L).alpha(1.0f).scaleX(1.0f).scaleY(1.0f).start();
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
        if (hh0Var.getTag() == null) {
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
        float f7;
        float value = this.G.getValue() * 1000;
        int value2 = this.H.getValue();
        boolean z10 = this.O;
        if (z10) {
            if (value2 == 1) {
                f7 = 47.349f;
            }
        } else if (value2 == 1) {
            f7 = 50.0f;
        }
        float f10 = value + f7;
        return z10 ? f10 * 1.60934f : f10;
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
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20 = i13 - i11;
        fh0 fh0Var = this.w;
        int measuredHeight = i20 - fh0Var.getMeasuredHeight();
        int i21 = i12 - i10;
        int measuredWidth = (i21 - fh0Var.getMeasuredWidth()) / 2;
        fh0Var.layout(measuredWidth, measuredHeight, fh0Var.getMeasuredWidth() + measuredWidth, fh0Var.getMeasuredHeight() + measuredHeight);
        int childCount = getChildCount();
        for (int i22 = 0; i22 < childCount; i22++) {
            View childAt = getChildAt(i22);
            if (childAt.getVisibility() != 8 && childAt != fh0Var) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth2 = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                int i23 = layoutParams.gravity;
                if (i23 == -1) {
                    i23 = 51;
                }
                int i24 = i23 & org.telegram.messenger.zs.x1;
                int i25 = i23 & 7;
                if (i25 == 1) {
                    i14 = ((i21 - measuredWidth2) / 2) + layoutParams.leftMargin;
                    i15 = layoutParams.rightMargin;
                } else if (i25 != 5) {
                    i16 = layoutParams.leftMargin;
                    if (i24 != 16) {
                        i17 = ((i20 - measuredHeight2) / 2) + layoutParams.topMargin;
                        i18 = layoutParams.bottomMargin;
                    } else if (i24 != 80) {
                        i19 = layoutParams.topMargin;
                        childAt.layout(i16, i19, measuredWidth2 + i16, measuredHeight2 + i19);
                    } else {
                        i17 = i20 - measuredHeight2;
                        i18 = layoutParams.bottomMargin;
                    }
                    i19 = i17 - i18;
                    childAt.layout(i16, i19, measuredWidth2 + i16, measuredHeight2 + i19);
                } else {
                    i14 = i12 - measuredWidth2;
                    i15 = layoutParams.rightMargin;
                }
                i16 = i14 - i15;
                if (i24 != 16) {
                }
                i19 = i17 - i18;
                childAt.layout(i16, i19, measuredWidth2 + i16, measuredHeight2 + i19);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        getRootView();
        getWindowVisibleDisplayFrame(this.n);
        setMeasuredDimension(size, size2);
        fh0 fh0Var = this.w;
        fh0Var.measure(View.MeasureSpec.makeMeasureSpec((this.y * 2) + size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_31));
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8 && childAt != fh0Var) {
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
