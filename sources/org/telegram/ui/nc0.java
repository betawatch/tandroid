package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class nc0 extends org.telegram.ui.Components.jw0 implements r0.m {
    public final /* synthetic */ int w0 = 1;
    public final b2.u0 x0;
    public boolean y0;
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nc0(org.telegram.ui.Wallet.m5 m5Var, Context context) {
        super(context, null);
        this.z0 = m5Var;
        this.x0 = new b2.u0();
    }

    @Override // r0.l
    public final void E(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        fc0 fc0Var;
        org.telegram.ui.ActionBar.k kVar;
        int i13;
        org.telegram.ui.Components.im0 currentListView;
        org.telegram.ui.Components.a71 t02;
        org.telegram.ui.Wallet.i5 i5Var;
        switch (this.w0) {
            case 0:
                pc0 pc0Var = (pc0) this.z0;
                if (viewGroup == pc0Var.U && (fc0Var = pc0Var.K0) != null && fc0Var.isAttachedToWindow()) {
                    kVar = ((org.telegram.ui.ActionBar.n2) pc0Var).actionBar;
                    boolean z10 = kVar.n0;
                    int top = pc0Var.K0.getTop();
                    boolean z11 = false;
                    if (i11 >= 0) {
                        if (z10) {
                            org.telegram.ui.Components.im0 currentListView2 = pc0Var.K0.getCurrentListView();
                            iArr[1] = i11;
                            if (top > 0) {
                                iArr[1] = 0;
                            }
                            if (currentListView2 != null && (i13 = iArr[1]) > 0) {
                                currentListView2.scrollBy(0, i13);
                                break;
                            }
                        }
                    } else {
                        if (top <= 0 && (currentListView = pc0Var.K0.getCurrentListView()) != null) {
                            int L0 = ((s4.b0) currentListView.getLayoutManager()).L0();
                            if (L0 != -1) {
                                s4.b1 K = currentListView.K(L0);
                                int top2 = K != null ? K.a.getTop() : -1;
                                int paddingTop = currentListView.getPaddingTop();
                                if (top2 != paddingTop || L0 != 0) {
                                    iArr[1] = L0 != 0 ? i11 : Math.max(i11, top2 - paddingTop);
                                    currentListView.scrollBy(0, i11);
                                    z11 = true;
                                }
                            }
                        }
                        if (z10) {
                            if (!z11 && top < 0) {
                                iArr[1] = i11 - Math.max(top, i11);
                                break;
                            } else {
                                iArr[1] = i11;
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                org.telegram.ui.Wallet.m5 m5Var = (org.telegram.ui.Wallet.m5) this.z0;
                if (!this.y0 && (t02 = m5Var.t0()) != null) {
                    if (i11 != 0 && i12 == 0 && ((viewGroup == m5Var.a || viewGroup == t02) && (i5Var = m5Var.r0) != null && i5Var.f)) {
                        i5Var.d = true;
                    }
                    if (viewGroup != m5Var.a || i11 >= 0 || !a0()) {
                        if (viewGroup == t02 && i11 > 0) {
                            iArr[1] = d0(m5Var.a, i11) + iArr[1];
                            break;
                        }
                    } else {
                        iArr[1] = d0(t02, i11) + iArr[1];
                        break;
                    }
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.jw0
    public void L(Canvas canvas, ArrayList arrayList) {
        switch (this.w0) {
            case 0:
                pc0 pc0Var = (pc0) this.z0;
                if (pc0Var.K0 != null) {
                    canvas.save();
                    canvas.translate(0.0f, pc0Var.U.getY());
                    pc0Var.K0.Q(canvas, arrayList);
                    canvas.restore();
                    break;
                }
                break;
        }
    }

    public void Z() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        org.telegram.ui.Wallet.i5 i5Var = ((org.telegram.ui.Wallet.m5) this.z0).r0;
        if (i5Var != null) {
            i5Var.e(obtain);
        }
        super.dispatchTouchEvent(obtain);
        obtain.recycle();
    }

    public boolean a0() {
        org.telegram.ui.Wallet.m5 m5Var = (org.telegram.ui.Wallet.m5) this.z0;
        ai.r rVar = m5Var.o0;
        return rVar != null && (rVar.getParent() instanceof View) && ((View) m5Var.o0.getParent()).getTop() <= m5Var.a.getPaddingTop();
    }

    @Override // r0.l
    public final void b(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
        switch (this.w0) {
            case 0:
                break;
            default:
                i(viewGroup, i10, i11, i12, i13, i14, new int[2]);
                break;
        }
    }

    /* JADX WARN: Finally extract failed */
    public int d0(org.telegram.ui.Components.a71 a71Var, int i10) {
        int[] iArr = {0};
        org.telegram.ui.Components.kv kvVar = new org.telegram.ui.Components.kv(iArr, 15);
        this.y0 = true;
        a71Var.j(kvVar);
        try {
            a71Var.scrollBy(0, i10);
            ArrayList arrayList = a71Var.w0;
            if (arrayList != null) {
                arrayList.remove(kvVar);
            }
            this.y0 = false;
            return iArr[0];
        } catch (Throwable th2) {
            ArrayList arrayList2 = a71Var.w0;
            if (arrayList2 != null) {
                arrayList2.remove(kvVar);
            }
            this.y0 = false;
            throw th2;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.Wallet.i5 i5Var;
        boolean z10;
        boolean z11;
        float f7;
        float f10;
        org.telegram.ui.Wallet.y7 y7Var;
        float f11;
        int i10;
        org.telegram.ui.Wallet.y7 y7Var2;
        switch (this.w0) {
            case 1:
                org.telegram.ui.Wallet.m5 m5Var = (org.telegram.ui.Wallet.m5) this.z0;
                org.telegram.ui.Wallet.z7 z7Var = m5Var.k0;
                char c10 = 1;
                if (z7Var != null) {
                    org.telegram.ui.Wallet.r7 r7Var = z7Var.w1;
                    LinkedHashMap linkedHashMap = z7Var.f;
                    org.telegram.ui.Wallet.r7 r7Var2 = z7Var.v1;
                    boolean z12 = false;
                    if (!z7Var.b) {
                        if (z7Var.V0 || z7Var.n0 || !z7Var.C()) {
                            z12 = z7Var.k0;
                        } else {
                            if (z7Var.c1) {
                                z7Var.h0();
                            }
                            int actionMasked = motionEvent.getActionMasked();
                            int i11 = 2;
                            if (actionMasked == 0) {
                                z7Var.removeCallbacks(r7Var2);
                                z7Var.removeCallbacks(r7Var);
                                z7Var.g0 = null;
                                z7Var.j0 = false;
                                z7Var.i0 = false;
                                z7Var.h0 = false;
                                z7Var.l0 = false;
                                z7Var.k0 = false;
                                z7Var.q0 = motionEvent.getPointerId(0);
                                float x10 = motionEvent.getX();
                                float y3 = motionEvent.getY();
                                float[] fArr = {x10, y3};
                                z7Var.s.mapPoints(fArr);
                                for (org.telegram.ui.Wallet.y7 y7Var3 : linkedHashMap.values()) {
                                    boolean z13 = z12;
                                    if (y7Var3.H == i11) {
                                        if (Utilities.dist(fArr[z13 ? 1 : 0], fArr[c10], y7Var3.e.a, y7Var3.f.a) < z7Var.W() * y7Var3.h.a * 0.48f && ((y7Var2 = z7Var.g0) == null || y7Var3.I > y7Var2.I)) {
                                            z7Var.g0 = y7Var3;
                                        }
                                        z12 = z13 ? 1 : 0;
                                        c10 = 1;
                                        i11 = 2;
                                    } else {
                                        z12 = z13 ? 1 : 0;
                                    }
                                }
                                z10 = z12;
                                org.telegram.ui.Wallet.y7 y7Var4 = z7Var.g0;
                                z7Var.p0 = y7Var4 != null ? true : z10;
                                if (y7Var4 == null) {
                                    Iterator it = linkedHashMap.values().iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            org.telegram.ui.Wallet.y7 y7Var5 = (org.telegram.ui.Wallet.y7) it.next();
                                            RectF b02 = z7Var.b0(y7Var5);
                                            if (b02 != null && b02.contains(x10, y3)) {
                                                if (org.telegram.ui.Wallet.z7.b(y7Var5)) {
                                                    z7Var.m0 = (Math.abs(x10 - b02.centerX()) >= b02.width() * 0.35f || Math.abs(y3 - b02.centerY()) >= b02.height() * 0.35f) ? z10 : true;
                                                    z7Var.g0 = y7Var5;
                                                }
                                            }
                                        }
                                    }
                                }
                                org.telegram.ui.Wallet.y7 y7Var6 = z7Var.g0;
                                if (y7Var6 == null || !((i10 = y7Var6.H) == 0 || i10 == 2)) {
                                    z7Var.g0 = null;
                                } else {
                                    z7Var.s0 = x10;
                                    z7Var.t0 = y3;
                                    SystemClock.uptimeMillis();
                                    org.telegram.ui.Wallet.y7 y7Var7 = z7Var.g0;
                                    z7Var.F0 = y7Var7.H;
                                    z7Var.B0 = y7Var7.e.b;
                                    z7Var.C0 = y7Var7.f.b;
                                    z7Var.E0 = y7Var7.i.b;
                                    z7Var.D0 = y7Var7.h.b;
                                    VelocityTracker velocityTracker = z7Var.J0;
                                    if (velocityTracker != null) {
                                        velocityTracker.recycle();
                                    }
                                    VelocityTracker obtain = VelocityTracker.obtain();
                                    z7Var.J0 = obtain;
                                    obtain.addMovement(motionEvent);
                                    z7Var.postDelayed(r7Var2, z7Var.p0 ? 450L : 500L);
                                    if (z7Var.p0) {
                                        z7Var.k0 = true;
                                        z7Var.getParent().requestDisallowInterceptTouchEvent(true);
                                        z7Var.h0();
                                        z12 = true;
                                    } else {
                                        z7Var.l0 = true;
                                        z7Var.postDelayed(r7Var, 170L);
                                    }
                                }
                                z12 = z10;
                            } else {
                                z10 = false;
                                if (z7Var.k0 || z7Var.l0) {
                                    VelocityTracker velocityTracker2 = z7Var.J0;
                                    if (velocityTracker2 != null) {
                                        velocityTracker2.addMovement(motionEvent);
                                    }
                                    int findPointerIndex = motionEvent.findPointerIndex(z7Var.q0);
                                    boolean z14 = actionMasked == 6 && motionEvent.getPointerId(motionEvent.getActionIndex()) == z7Var.q0;
                                    if (findPointerIndex >= 0) {
                                        float x11 = motionEvent.getX(findPointerIndex);
                                        float y10 = motionEvent.getY(findPointerIndex);
                                        if (z7Var.l0) {
                                            if (actionMasked != 2 || Utilities.dist(x11, y10, z7Var.s0, z7Var.t0) <= ViewConfiguration.get(z7Var.getContext()).getScaledTouchSlop()) {
                                                if (actionMasked == 1 || actionMasked == 3 || z14) {
                                                    z7Var.a();
                                                }
                                            } else if (z7Var.m0 && z7Var.g0.H == 0) {
                                                z7Var.l0 = false;
                                                z7Var.k0 = true;
                                                z7Var.removeCallbacks(r7Var);
                                                ((nc0) z7Var.d.b).Z();
                                                z7Var.getParent().requestDisallowInterceptTouchEvent(true);
                                                z7Var.Y(z7Var.g0, x11, y10);
                                                z7Var.q(z7Var.g0, x11, y10);
                                                z7Var.h0();
                                            } else {
                                                z7Var.a();
                                            }
                                            z12 = false;
                                        } else {
                                            if (actionMasked != 2 || (y7Var = z7Var.g0) == null) {
                                                z11 = false;
                                            } else {
                                                if (z7Var.i0) {
                                                    org.telegram.ui.Wallet.x7 x7Var = y7Var.e;
                                                    org.telegram.ui.Wallet.x7 x7Var2 = y7Var.h;
                                                    float[] P = z7Var.P(x7Var.a, y7Var.f.a);
                                                    float dist = Utilities.dist(x11, y10, P[0], P[1]);
                                                    if (Float.isNaN(z7Var.z0)) {
                                                        z7Var.z0 = dist;
                                                        z7Var.A0 = x7Var2.b;
                                                    }
                                                    if (Math.abs(dist - z7Var.z0) > AndroidUtilities.dp(5.0f)) {
                                                        org.telegram.ui.Wallet.x7 x7Var3 = y7Var.q;
                                                        f11 = 5.0f;
                                                        x7Var3.d = 700.0f;
                                                        x7Var3.e = 1.0f;
                                                        x7Var3.b = 1.0f;
                                                    } else {
                                                        f11 = 5.0f;
                                                    }
                                                    float dp = AndroidUtilities.dp(32.0f) / z7Var.W();
                                                    x7Var2.d = 900.0f;
                                                    x7Var2.e = 1.0f;
                                                    x7Var2.b = Math.max(dp, Math.min(1.1f, ((1.1f - dp) * ((dist - z7Var.z0) / AndroidUtilities.dp(110.0f))) + z7Var.A0));
                                                    if (dist < AndroidUtilities.dp(14.0f)) {
                                                        z7Var.w0 = Float.NaN;
                                                        z11 = false;
                                                    } else {
                                                        z11 = false;
                                                        float degrees = (float) Math.toDegrees(Math.atan2(y10 - P[1], x11 - P[0]));
                                                        if (!Float.isNaN(z7Var.w0)) {
                                                            z7Var.x0 = org.telegram.ui.Wallet.z7.c(degrees - z7Var.w0) + z7Var.x0;
                                                        }
                                                        z7Var.w0 = degrees;
                                                        float f12 = z7Var.y0 + z7Var.x0;
                                                        float round = Math.round(f12 / 90.0f) * 90;
                                                        boolean z15 = Math.abs(f12 - round) < f11;
                                                        if (z15 && !z7Var.G0) {
                                                            z7Var.performHapticFeedback(4);
                                                        }
                                                        z7Var.G0 = z15;
                                                        org.telegram.ui.Wallet.x7 x7Var4 = y7Var.i;
                                                        x7Var4.d = 900.0f;
                                                        x7Var4.e = 0.95f;
                                                        if (z15) {
                                                            f12 = round;
                                                        }
                                                        x7Var4.b = f12;
                                                    }
                                                } else {
                                                    z11 = false;
                                                    if (Utilities.dist(x11, y10, z7Var.s0, z7Var.t0) > ViewConfiguration.get(z7Var.getContext()).getScaledTouchSlop()) {
                                                        z7Var.removeCallbacks(r7Var2);
                                                        if (!z7Var.h0 && (z7Var.p0 || z7Var.g0.H == 0)) {
                                                            z7Var.Y(z7Var.g0, x11, y10);
                                                        }
                                                        if (z7Var.h0) {
                                                            z7Var.q(z7Var.g0, x11, y10);
                                                        }
                                                    }
                                                }
                                                z7Var.h0();
                                            }
                                            if (actionMasked == 1 || actionMasked == 3 || z14) {
                                                VelocityTracker velocityTracker3 = z7Var.J0;
                                                if (velocityTracker3 != null) {
                                                    velocityTracker3.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT);
                                                    f10 = z7Var.J0.getXVelocity(z7Var.q0);
                                                    f7 = z7Var.J0.getYVelocity(z7Var.q0);
                                                } else {
                                                    f7 = 0.0f;
                                                    f10 = 0.0f;
                                                }
                                                z7Var.x(f10, f7, actionMasked == 3 ? true : z11);
                                            }
                                        }
                                    } else if (z7Var.l0) {
                                        z7Var.a();
                                    } else {
                                        z7Var.x(0.0f, 0.0f, true);
                                    }
                                    z12 = true;
                                }
                                z12 = z10;
                            }
                        }
                    }
                    if (z12) {
                        return true;
                    }
                }
                org.telegram.ui.Wallet.i5 i5Var2 = m5Var.r0;
                if (i5Var2 != null) {
                    i5Var2.e(motionEvent);
                }
                boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                if (motionEvent.getActionMasked() == 1 && (i5Var = m5Var.r0) != null) {
                    org.telegram.ui.Wallet.n nVar = i5Var.i;
                    org.telegram.ui.Components.u61 u61Var = i5Var.c;
                    if (u61Var != null) {
                        u61Var.removeCallbacks(nVar);
                        i5Var.c.post(nVar);
                    }
                }
                return dispatchTouchEvent;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.d5 d5Var;
        org.telegram.ui.ActionBar.d5 d5Var2;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.w0) {
            case 0:
                boolean drawChild = super.drawChild(canvas, view, j10);
                pc0 pc0Var = (pc0) this.z0;
                kVar = ((org.telegram.ui.ActionBar.n2) pc0Var).actionBar;
                if (view == kVar) {
                    d5Var = ((org.telegram.ui.ActionBar.n2) pc0Var).parentLayout;
                    if (d5Var != null) {
                        d5Var2 = ((org.telegram.ui.ActionBar.n2) pc0Var).parentLayout;
                        kVar2 = ((org.telegram.ui.ActionBar.n2) pc0Var).actionBar;
                        ((ActionBarLayout) d5Var2).q(canvas, kVar2.getMeasuredHeight());
                    }
                }
                return drawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        switch (this.w0) {
            case 1:
                return this.x0.b();
            default:
                return super.getNestedScrollAxes();
        }
    }

    @Override // r0.m
    public final void i(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        fc0 fc0Var;
        org.telegram.ui.Components.a71 t02;
        switch (this.w0) {
            case 0:
                pc0 pc0Var = (pc0) this.z0;
                try {
                    if (viewGroup == pc0Var.U && (fc0Var = pc0Var.K0) != null && fc0Var.isAttachedToWindow()) {
                        org.telegram.ui.Components.im0 currentListView = pc0Var.K0.getCurrentListView();
                        int top = pc0Var.K0.getTop();
                        if (currentListView != null && top == 0) {
                            iArr[1] = i13;
                            currentListView.scrollBy(0, i13);
                            break;
                        }
                    }
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    AndroidUtilities.runOnUIThread(new fz(this, 18));
                    return;
                }
                break;
            default:
                org.telegram.ui.Wallet.m5 m5Var = (org.telegram.ui.Wallet.m5) this.z0;
                if (!this.y0 && i13 != 0 && (t02 = m5Var.t0()) != null) {
                    if (viewGroup != m5Var.a || !a0()) {
                        if (viewGroup == t02 && i13 < 0) {
                            iArr[1] = d0(m5Var.a, i13) + iArr[1];
                            break;
                        }
                    } else {
                        iArr[1] = d0(t02, i13) + iArr[1];
                        break;
                    }
                }
                break;
        }
    }

    @Override // r0.l
    public final void n(int i10, View view) {
        switch (this.w0) {
            case 0:
                this.x0.a = 0;
                break;
            default:
                b2.u0 u0Var = this.x0;
                if (i10 == 1) {
                    u0Var.b = 0;
                } else {
                    u0Var.a = 0;
                }
                org.telegram.ui.Wallet.i5 i5Var = ((org.telegram.ui.Wallet.m5) this.z0).r0;
                if (i5Var != null) {
                    org.telegram.ui.Wallet.n nVar = i5Var.i;
                    org.telegram.ui.Components.u61 u61Var = i5Var.c;
                    if (u61Var != null) {
                        u61Var.removeCallbacks(nVar);
                        i5Var.c.post(nVar);
                        break;
                    }
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.jw0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.w0) {
            case 0:
                pc0 pc0Var = (pc0) this.z0;
                super.onLayout(z10, i10, i11, i12, i13);
                if (!z10) {
                    pc0Var.z0(true);
                    break;
                } else {
                    pc0Var.j0(this.y0);
                    this.y0 = false;
                    break;
                }
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.w0) {
            case 1:
                int size = (int) (View.MeasureSpec.getSize(i11) * 0.75f);
                org.telegram.ui.Wallet.m5 m5Var = (org.telegram.ui.Wallet.m5) this.z0;
                if (m5Var.n != size) {
                    m5Var.n = size;
                    org.telegram.ui.Wallet.z4 z4Var = m5Var.d;
                    if (z4Var != null) {
                        z4Var.requestLayout();
                    }
                    org.telegram.ui.Wallet.w4 w4Var = m5Var.e;
                    if (w4Var != null) {
                        w4Var.requestLayout();
                    }
                }
                super.onMeasure(i10, i11);
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f7, float f10) {
        org.telegram.ui.Wallet.i5 i5Var;
        switch (this.w0) {
            case 1:
                org.telegram.ui.Wallet.m5 m5Var = (org.telegram.ui.Wallet.m5) this.z0;
                if (view != m5Var.t0() || (i5Var = m5Var.r0) == null) {
                    return false;
                }
                return i5Var.a((int) f7, (int) f10);
            default:
                return super.onNestedPreFling(view, f7, f10);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        switch (this.w0) {
            case 0:
                break;
            default:
                super.onStopNestedScroll(view);
                break;
        }
    }

    @Override // r0.l
    public final boolean p(View view, View view2, int i10, int i11) {
        switch (this.w0) {
            case 0:
                if (((pc0) this.z0).K0 == null || i10 != 2) {
                }
                break;
            default:
                if ((i10 & 2) != 0) {
                }
                break;
        }
        return false;
    }

    @Override // r0.l
    public final void s(View view, View view2, int i10, int i11) {
        switch (this.w0) {
            case 0:
                this.x0.a = i10;
                break;
            default:
                b2.u0 u0Var = this.x0;
                if (i11 != 1) {
                    u0Var.a = i10;
                    break;
                } else {
                    u0Var.b = i10;
                    break;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nc0(pc0 pc0Var, Context context) {
        super(context, null);
        this.z0 = pc0Var;
        this.y0 = true;
        this.x0 = new b2.u0();
    }

    private final void c0(View view) {
    }

    private final void b0(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
    }
}
