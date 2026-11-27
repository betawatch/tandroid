// default package

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
import org.telegram.messenger.a;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class bx8 extends FrameLayout {
    public int E;
    public boolean F;
    public k43 G;
    public hq7 H;
    public hq7 I;
    public cc6 J;
    public zw8 K;
    public TextView L;
    public boolean M;
    public TLRPC.User N;
    public int O;
    public boolean P;
    public yw8 Q;
    public dc6 R;
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
    public xw8 w;
    public boolean x;
    public int y;

    public final void a() {
        xw8 xw8Var = this.w;
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
        animatorSet2.playTogether(ObjectAnimator.ofFloat(xw8Var, (Property<xw8, Float>) View.TRANSLATION_Y, hl.L(10.0f) + xw8Var.getMeasuredHeight()));
        if (this.F) {
            float measuredHeight = xw8Var.getMeasuredHeight();
            this.s.setDuration(Math.max(60, (int) (((measuredHeight - xw8Var.getTranslationY()) * 250.0f) / measuredHeight)));
            this.F = false;
        } else {
            this.s.setDuration(250L);
        }
        this.s.setInterpolator(k43.f);
        this.s.addListener(new ax8(this, (byte) 2));
        jn7.e().k(jn7.j1, 512);
        this.s.start();
    }

    public final boolean b(MotionEvent motionEvent, boolean z) {
        xw8 xw8Var = this.w;
        byte b = 0;
        if (!this.r) {
            if (motionEvent == null || (!(motionEvent.getAction() == 0 || motionEvent.getAction() == 2) || this.f || this.e || motionEvent.getPointerCount() != 1)) {
                if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.d) {
                    if (this.a == null) {
                        this.a = VelocityTracker.obtain();
                    }
                    float abs = Math.abs((int) (motionEvent.getX() - this.b));
                    float y = ((int) motionEvent.getY()) - this.c;
                    this.a.addMovement(motionEvent);
                    if (this.e && !this.f && y > 0.0f && y / 3.0f > Math.abs(abs) && Math.abs(y) >= this.E) {
                        this.c = (int) motionEvent.getY();
                        this.e = false;
                        this.f = true;
                        requestDisallowInterceptTouchEvent(true);
                    } else if (this.f) {
                        float translationY = xw8Var.getTranslationY() + y;
                        xw8Var.setTranslationY(translationY >= 0.0f ? translationY : 0.0f);
                        this.c = (int) motionEvent.getY();
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.d && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                    VelocityTracker velocityTracker = this.a;
                    if (velocityTracker == null) {
                        velocityTracker = VelocityTracker.obtain();
                        this.a = velocityTracker;
                    }
                    velocityTracker.computeCurrentVelocity(1000);
                    float translationY2 = xw8Var.getTranslationY();
                    if (this.f || translationY2 != 0.0f) {
                        float xVelocity = this.a.getXVelocity();
                        float yVelocity = this.a.getYVelocity();
                        if ((xw8Var.getTranslationY() >= hl.Z0(false, 0.8f) || (yVelocity >= 3500.0f && Math.abs(yVelocity) >= Math.abs(xVelocity))) && (yVelocity >= 0.0f || Math.abs(yVelocity) < 3500.0f)) {
                            this.F = true;
                            a();
                        } else {
                            AnimatorSet animatorSet = new AnimatorSet();
                            this.h = animatorSet;
                            animatorSet.playTogether(ObjectAnimator.ofFloat(xw8Var, (Property<xw8, Float>) View.TRANSLATION_Y, 0.0f));
                            this.h.setDuration((int) ((Math.max(0.0f, r6) / hl.Z0(false, 0.8f)) * 150.0f));
                            this.h.setInterpolator(k43.g);
                            this.h.addListener(new ax8(this, b));
                            jn7.e().k(jn7.j1, 512);
                            this.h.start();
                        }
                        this.f = false;
                    } else {
                        this.e = false;
                        this.f = false;
                    }
                    VelocityTracker velocityTracker2 = this.a;
                    if (velocityTracker2 != null) {
                        velocityTracker2.recycle();
                        this.a = null;
                    }
                    this.d = -1;
                }
            } else {
                this.b = (int) motionEvent.getX();
                int y2 = (int) motionEvent.getY();
                this.c = y2;
                if (y2 < xw8Var.getTop() || this.b < xw8Var.getLeft() || this.b > xw8Var.getRight()) {
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
                VelocityTracker velocityTracker3 = this.a;
                if (velocityTracker3 != null) {
                    velocityTracker3.clear();
                }
            }
            if ((!z && this.e) || this.f) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x016c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(boolean z) {
        boolean z2;
        TextView textView = this.L;
        TLRPC.User user = this.N;
        zw8 zw8Var = this.K;
        float value = getValue();
        String y = ob6.y(value, 2, Boolean.valueOf(this.P));
        int i = (int) value;
        uc6 uc6Var = this.J.b;
        ArrayList arrayList = uc6Var.o0;
        ym4 ym4Var = uc6Var.L;
        if (ym4Var != null) {
            ym4Var.R0(i);
            if (z) {
                kj4 kj4Var = (kj4) ((z3f) a.j()).onCreateLatLngBoundsBuilder();
                kj4Var.T(new ak5(uc6Var.z0.getLatitude(), uc6Var.z0.getLongitude()));
                try {
                    int max = Math.max(i, jn7.Y3);
                    ak5 a = kj4Var.d().a();
                    double d = max;
                    ak5 z0 = uc6.z0(a, d, d);
                    double d2 = -max;
                    kj4Var.T(uc6.z0(a, d2, d2));
                    kj4Var.T(z0);
                    v05 d3 = kj4Var.d();
                    try {
                        uc6Var.F.n(hl.L(70.0f), 0, hl.L(70.0f), ((int) ((uc6Var.O.getCustomView().getMeasuredHeight() - hl.L(40.0f)) + uc6Var.P.getTranslationY())) + uc6Var.h0 + uc6Var.c0);
                        uc6Var.F.c(((z3f) a.j()).newCameraUpdateLatLngBounds(d3, 0));
                    } catch (Exception e) {
                        cc4.g(e, true);
                    }
                } catch (Exception unused) {
                }
            }
        }
        if (!wf3.y(uc6Var.m0)) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                pc6 pc6Var = (pc6) arrayList.get(i2);
                if (pc6Var.b != null && !lbc.D(pc6Var.c)) {
                    TLRPC.GeoPoint geoPoint = pc6Var.b.media.geo;
                    Location location = new Location("network");
                    location.setLatitude(geoPoint.lat);
                    location.setLongitude(geoPoint._long);
                    if (uc6Var.z0.distanceTo(location) > i) {
                    }
                }
            }
            z2 = false;
            if (z2 && user != null) {
                textView.setText(ob6.a0("LocationNotifiationCloser", null, 2131748507, y));
                if (zw8Var.getTag() == null) {
                    zw8Var.setTag(1);
                    zw8Var.animate().setDuration(180L).alpha(0.0f).scaleX(0.5f).scaleY(0.5f).start();
                    textView.animate().setDuration(180L).alpha(1.0f).scaleX(1.0f).scaleY(1.0f).start();
                    return;
                }
                return;
            }
            if (user != null) {
                zw8Var.setText(ob6.a0("LocationNotifiationButtonGroup", null, 2131748509, y));
            } else {
                zw8Var.setText(ob6.a0("LocationNotifiationButtonUser", null, 2131748508, TextUtils.ellipsize(lbc.k(user, true), zw8Var.getPaint(), Math.max(hl.L(10.0f), (int) (((this.O - hl.L(94.0f)) * 1.5f) - ((int) Math.ceil(zw8Var.getPaint().measureText(ob6.M0(2131748508, null)))))), TextUtils.TruncateAt.END), y));
            }
            if (zw8Var.getTag() == null) {
                zw8Var.setTag(null);
                zw8Var.animate().setDuration(180L).alpha(1.0f).scaleX(1.0f).scaleY(1.0f).start();
                textView.animate().setDuration(180L).alpha(0.0f).scaleX(0.5f).scaleY(0.5f).start();
                return;
            }
            return;
        }
        z2 = true;
        if (z2) {
        }
        if (user != null) {
        }
        if (zw8Var.getTag() == null) {
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
    
        if (r1 > 1) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
    
        r1 = r1 * 100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        r1 = r1 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0023, code lost:
    
        if (r1 > 1) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public float getValue() {
        float f;
        float value = this.H.getValue() * 1000;
        int value2 = this.I.getValue();
        boolean z = this.P;
        if (z) {
            if (value2 == 1) {
                f = 47.349f;
            }
        } else if (value2 == 1) {
            f = 50.0f;
        }
        float f2 = value + f;
        return z ? f2 * 1.60934f : f2;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.r || b(motionEvent, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11 = i4 - i2;
        xw8 xw8Var = this.w;
        int measuredHeight = i11 - xw8Var.getMeasuredHeight();
        int i12 = i3 - i;
        int measuredWidth = (i12 - xw8Var.getMeasuredWidth()) / 2;
        xw8Var.layout(measuredWidth, measuredHeight, xw8Var.getMeasuredWidth() + measuredWidth, xw8Var.getMeasuredHeight() + measuredHeight);
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8 && childAt != xw8Var) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth2 = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                int i14 = layoutParams.gravity;
                if (i14 == -1) {
                    i14 = 51;
                }
                int i15 = i14 & jn7.w1;
                int i16 = i14 & 7;
                if (i16 == 1) {
                    i5 = ((i12 - measuredWidth2) / 2) + layoutParams.leftMargin;
                    i6 = layoutParams.rightMargin;
                } else if (i16 != 5) {
                    i7 = layoutParams.leftMargin;
                    if (i15 != 16) {
                        i8 = ((i11 - measuredHeight2) / 2) + layoutParams.topMargin;
                        i9 = layoutParams.bottomMargin;
                    } else if (i15 != 80) {
                        i10 = layoutParams.topMargin;
                        childAt.layout(i7, i10, measuredWidth2 + i7, measuredHeight2 + i10);
                    } else {
                        i8 = i11 - measuredHeight2;
                        i9 = layoutParams.bottomMargin;
                    }
                    i10 = i8 - i9;
                    childAt.layout(i7, i10, measuredWidth2 + i7, measuredHeight2 + i10);
                } else {
                    i5 = i3 - measuredWidth2;
                    i6 = layoutParams.rightMargin;
                }
                i7 = i5 - i6;
                if (i15 != 16) {
                }
                i10 = i8 - i9;
                childAt.layout(i7, i10, measuredWidth2 + i7, measuredHeight2 + i10);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        bx8 bx8Var;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        getRootView();
        getWindowVisibleDisplayFrame(this.n);
        setMeasuredDimension(size, size2);
        xw8 xw8Var = this.w;
        xw8Var.measure(View.MeasureSpec.makeMeasureSpec((this.y << 1) + size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_31));
        int childCount = getChildCount();
        int i3 = 0;
        while (i3 < childCount) {
            View childAt = this.getChildAt(i3);
            if (childAt.getVisibility() == 8 || childAt == xw8Var) {
                bx8Var = this;
            } else {
                bx8Var = this;
                bx8Var.measureChildWithMargins(childAt, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), 0, View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30), 0);
            }
            i3++;
            this = bx8Var;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.r || b(motionEvent, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        if (this.e && !this.f) {
            onTouchEvent(null);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }
}
