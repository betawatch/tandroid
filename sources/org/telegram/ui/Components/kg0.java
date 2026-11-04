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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class kg0 extends FrameLayout {
    public static final /* synthetic */ int S = 0;
    public int E;
    public boolean F;
    public xq G;
    public cb0 H;
    public cb0 I;
    public org.telegram.ui.x90 J;
    public ig0 K;
    public TextView L;
    public boolean M;
    public TLRPC.User N;
    public int O;
    public boolean P;
    public hg0 Q;
    public org.telegram.ui.u90 R;
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
    public gg0 w;
    public boolean x;
    public int y;

    public final void a() {
        gg0 gg0Var = this.w;
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
        animatorSet2.playTogether(ObjectAnimator.ofFloat(gg0Var, (Property<gg0, Float>) View.TRANSLATION_Y, org.telegram.messenger.g0.L(10.0f) + gg0Var.getMeasuredHeight()));
        if (this.F) {
            float measuredHeight = gg0Var.getMeasuredHeight();
            this.s.setDuration(Math.max(60, (int) (((measuredHeight - gg0Var.getTranslationY()) * 250.0f) / measuredHeight)));
            this.F = false;
        } else {
            this.s.setDuration(250L);
        }
        this.s.setInterpolator(xq.f);
        this.s.addListener(new jg0(this, 2));
        org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.j1, 512);
        this.s.start();
    }

    public final boolean b(MotionEvent motionEvent, boolean z10) {
        gg0 gg0Var = this.w;
        int i3 = 0;
        if (!this.r) {
            if (motionEvent == null || (!(motionEvent.getAction() == 0 || motionEvent.getAction() == 2) || this.f || this.e || motionEvent.getPointerCount() != 1)) {
                if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.d) {
                    if (this.a == null) {
                        this.a = VelocityTracker.obtain();
                    }
                    float abs = Math.abs((int) (motionEvent.getX() - this.b));
                    float y9 = ((int) motionEvent.getY()) - this.c;
                    this.a.addMovement(motionEvent);
                    if (this.e && !this.f && y9 > 0.0f && y9 / 3.0f > Math.abs(abs) && Math.abs(y9) >= this.E) {
                        this.c = (int) motionEvent.getY();
                        this.e = false;
                        this.f = true;
                        requestDisallowInterceptTouchEvent(true);
                    } else if (this.f) {
                        float translationY = gg0Var.getTranslationY() + y9;
                        gg0Var.setTranslationY(translationY >= 0.0f ? translationY : 0.0f);
                        this.c = (int) motionEvent.getY();
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.d && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                    if (this.a == null) {
                        this.a = VelocityTracker.obtain();
                    }
                    this.a.computeCurrentVelocity(1000);
                    float translationY2 = gg0Var.getTranslationY();
                    if (this.f || translationY2 != 0.0f) {
                        float xVelocity = this.a.getXVelocity();
                        float yVelocity = this.a.getYVelocity();
                        if ((gg0Var.getTranslationY() >= org.telegram.messenger.g0.a1(false, 0.8f) || (yVelocity >= 3500.0f && Math.abs(yVelocity) >= Math.abs(xVelocity))) && (yVelocity >= 0.0f || Math.abs(yVelocity) < 3500.0f)) {
                            this.F = true;
                            a();
                        } else {
                            AnimatorSet animatorSet = new AnimatorSet();
                            this.h = animatorSet;
                            animatorSet.playTogether(ObjectAnimator.ofFloat(gg0Var, (Property<gg0, Float>) View.TRANSLATION_Y, 0.0f));
                            this.h.setDuration((int) ((Math.max(0.0f, r6) / org.telegram.messenger.g0.a1(false, 0.8f)) * 150.0f));
                            this.h.setInterpolator(xq.g);
                            this.h.addListener(new jg0(this, i3));
                            org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.j1, 512);
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
                if (y10 < gg0Var.getTop() || this.b < gg0Var.getLeft() || this.b > gg0Var.getRight()) {
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

    /* JADX WARN: Removed duplicated region for block: B:30:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x016d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(boolean z10) {
        boolean z11;
        TextView textView = this.L;
        TLRPC.User user = this.N;
        ig0 ig0Var = this.K;
        float value = getValue();
        String y9 = org.telegram.messenger.bd.y(value, 2, Boolean.valueOf(this.P));
        int i3 = (int) value;
        org.telegram.ui.la0 la0Var = this.J.b;
        ArrayList arrayList = la0Var.o0;
        m2.t tVar = la0Var.L;
        if (tVar != null) {
            tVar.e1(i3);
            if (z10) {
                gi.w5 w5Var = (gi.w5) ((mb.b) org.telegram.messenger.t0.k()).onCreateLatLngBoundsBuilder();
                w5Var.V(new org.telegram.messenger.va(la0Var.z0.getLatitude(), la0Var.z0.getLongitude()));
                try {
                    int max = Math.max(i3, org.telegram.messenger.hs.Z3);
                    org.telegram.messenger.va a10 = w5Var.R().a();
                    double d = max;
                    org.telegram.messenger.va z02 = org.telegram.ui.la0.z0(a10, d, d);
                    double d10 = -max;
                    w5Var.V(org.telegram.ui.la0.z0(a10, d10, d10));
                    w5Var.V(z02);
                    org.telegram.messenger.x9 R = w5Var.R();
                    try {
                        la0Var.F.o(org.telegram.messenger.g0.L(70.0f), 0, org.telegram.messenger.g0.L(70.0f), ((int) ((la0Var.O.getCustomView().getMeasuredHeight() - org.telegram.messenger.g0.L(40.0f)) + la0Var.P.getTranslationY())) + la0Var.h0 + la0Var.c0);
                        la0Var.F.c(((mb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLngBounds(R, 0));
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                } catch (Exception unused) {
                }
            }
        }
        if (!org.telegram.messenger.m5.z(la0Var.m0)) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                org.telegram.ui.ha0 ha0Var = (org.telegram.ui.ha0) arrayList.get(i10);
                if (ha0Var.b != null && !org.telegram.messenger.l10.B(ha0Var.c)) {
                    TLRPC.GeoPoint geoPoint = ha0Var.b.media.geo;
                    Location location = new Location("network");
                    location.setLatitude(geoPoint.lat);
                    location.setLongitude(geoPoint._long);
                    if (la0Var.z0.distanceTo(location) > i3) {
                    }
                }
            }
            z11 = false;
            if (z11 && user != null) {
                textView.setText(org.telegram.messenger.bd.a0("LocationNotifiationCloser", null, 2131748761, y9));
                if (ig0Var.getTag() == null) {
                    ig0Var.setTag(1);
                    ig0Var.animate().setDuration(180L).alpha(0.0f).scaleX(0.5f).scaleY(0.5f).start();
                    textView.animate().setDuration(180L).alpha(1.0f).scaleX(1.0f).scaleY(1.0f).start();
                    return;
                }
                return;
            }
            if (user != null) {
                ig0Var.setText(org.telegram.messenger.bd.a0("LocationNotifiationButtonGroup", null, 2131748763, y9));
            } else {
                ig0Var.setText(org.telegram.messenger.bd.a0("LocationNotifiationButtonUser", null, 2131748762, TextUtils.ellipsize(org.telegram.messenger.l10.j(user, true), ig0Var.getPaint(), Math.max(org.telegram.messenger.g0.L(10.0f), (int) (((this.O - org.telegram.messenger.g0.L(94.0f)) * 1.5f) - ((int) Math.ceil(ig0Var.getPaint().measureText(org.telegram.messenger.bd.M0(2131748762, null)))))), TextUtils.TruncateAt.END), y9));
            }
            if (ig0Var.getTag() == null) {
                ig0Var.setTag(null);
                ig0Var.animate().setDuration(180L).alpha(1.0f).scaleX(1.0f).scaleY(1.0f).start();
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
        if (ig0Var.getTag() == null) {
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
        return this.Q;
    }

    public boolean getRadiusSet() {
        return this.M;
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
        float value = this.H.getValue() * 1000;
        int value2 = this.I.getValue();
        boolean z10 = this.P;
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
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19 = i12 - i10;
        gg0 gg0Var = this.w;
        int measuredHeight = i19 - gg0Var.getMeasuredHeight();
        int i20 = i11 - i3;
        int measuredWidth = (i20 - gg0Var.getMeasuredWidth()) / 2;
        gg0Var.layout(measuredWidth, measuredHeight, gg0Var.getMeasuredWidth() + measuredWidth, gg0Var.getMeasuredHeight() + measuredHeight);
        int childCount = getChildCount();
        for (int i21 = 0; i21 < childCount; i21++) {
            View childAt = getChildAt(i21);
            if (childAt.getVisibility() != 8 && childAt != gg0Var) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth2 = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                int i22 = layoutParams.gravity;
                if (i22 == -1) {
                    i22 = 51;
                }
                int i23 = i22 & org.telegram.messenger.hs.x1;
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
    public final void onMeasure(int i3, int i10) {
        int size = View.MeasureSpec.getSize(i3);
        int size2 = View.MeasureSpec.getSize(i10);
        getRootView();
        getWindowVisibleDisplayFrame(this.n);
        setMeasuredDimension(size, size2);
        gg0 gg0Var = this.w;
        gg0Var.measure(View.MeasureSpec.makeMeasureSpec((this.y * 2) + size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_31));
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8 && childAt != gg0Var) {
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
