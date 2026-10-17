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

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class nc0 extends org.telegram.ui.Components.jw0 implements r0.m {
    public final /* synthetic */ int w0 = 1;
    public final b2.u0 x0;
    public boolean y0;
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nc0(org.telegram.ui.Wallet.l5 l5Var, Context context) {
        super(context, null);
        this.z0 = l5Var;
        this.x0 = new b2.u0();
    }

    @Override // r0.l
    public final void E(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        fc0 fc0Var;
        org.telegram.ui.ActionBar.k kVar;
        int i13;
        org.telegram.ui.Components.im0 currentListView;
        org.telegram.ui.Components.a71 t02;
        org.telegram.ui.Wallet.h5 h5Var;
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
                org.telegram.ui.Wallet.l5 l5Var = (org.telegram.ui.Wallet.l5) this.z0;
                if (!this.y0 && (t02 = l5Var.t0()) != null) {
                    if (i11 != 0 && i12 == 0 && ((viewGroup == l5Var.a || viewGroup == t02) && (h5Var = l5Var.r0) != null && h5Var.f)) {
                        h5Var.d = true;
                    }
                    if (viewGroup != l5Var.a || i11 >= 0 || !a0()) {
                        if (viewGroup == t02 && i11 > 0) {
                            iArr[1] = d0(l5Var.a, i11) + iArr[1];
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
        org.telegram.ui.Wallet.h5 h5Var = ((org.telegram.ui.Wallet.l5) this.z0).r0;
        if (h5Var != null) {
            h5Var.e(obtain);
        }
        super.dispatchTouchEvent(obtain);
        obtain.recycle();
    }

    public boolean a0() {
        org.telegram.ui.Wallet.l5 l5Var = (org.telegram.ui.Wallet.l5) this.z0;
        ai.r rVar = l5Var.o0;
        return rVar != null && (rVar.getParent() instanceof View) && ((View) l5Var.o0.getParent()).getTop() <= l5Var.a.getPaddingTop();
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
        org.telegram.ui.Wallet.h5 h5Var;
        boolean z10;
        boolean z11;
        float f7;
        float f10;
        org.telegram.ui.Wallet.v7 v7Var;
        float f11;
        int i10;
        org.telegram.ui.Wallet.v7 v7Var2;
        switch (this.w0) {
            case 1:
                org.telegram.ui.Wallet.l5 l5Var = (org.telegram.ui.Wallet.l5) this.z0;
                org.telegram.ui.Wallet.w7 w7Var = l5Var.k0;
                char c10 = 1;
                if (w7Var != null) {
                    org.telegram.ui.Wallet.o7 o7Var = w7Var.w1;
                    LinkedHashMap linkedHashMap = w7Var.f;
                    org.telegram.ui.Wallet.o7 o7Var2 = w7Var.v1;
                    boolean z12 = false;
                    if (!w7Var.b) {
                        if (w7Var.V0 || w7Var.n0 || !w7Var.C()) {
                            z12 = w7Var.k0;
                        } else {
                            if (w7Var.c1) {
                                w7Var.h0();
                            }
                            int actionMasked = motionEvent.getActionMasked();
                            int i11 = 2;
                            if (actionMasked == 0) {
                                w7Var.removeCallbacks(o7Var2);
                                w7Var.removeCallbacks(o7Var);
                                w7Var.g0 = null;
                                w7Var.j0 = false;
                                w7Var.i0 = false;
                                w7Var.h0 = false;
                                w7Var.l0 = false;
                                w7Var.k0 = false;
                                w7Var.q0 = motionEvent.getPointerId(0);
                                float x10 = motionEvent.getX();
                                float y3 = motionEvent.getY();
                                float[] fArr = {x10, y3};
                                w7Var.s.mapPoints(fArr);
                                for (org.telegram.ui.Wallet.v7 v7Var3 : linkedHashMap.values()) {
                                    boolean z13 = z12;
                                    if (v7Var3.H == i11) {
                                        if (Utilities.dist(fArr[z13 ? 1 : 0], fArr[c10], v7Var3.e.a, v7Var3.f.a) < w7Var.W() * v7Var3.h.a * 0.48f && ((v7Var2 = w7Var.g0) == null || v7Var3.I > v7Var2.I)) {
                                            w7Var.g0 = v7Var3;
                                        }
                                        z12 = z13 ? 1 : 0;
                                        c10 = 1;
                                        i11 = 2;
                                    } else {
                                        z12 = z13 ? 1 : 0;
                                    }
                                }
                                z10 = z12;
                                org.telegram.ui.Wallet.v7 v7Var4 = w7Var.g0;
                                w7Var.p0 = v7Var4 != null ? true : z10;
                                if (v7Var4 == null) {
                                    Iterator it = linkedHashMap.values().iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            org.telegram.ui.Wallet.v7 v7Var5 = (org.telegram.ui.Wallet.v7) it.next();
                                            RectF b02 = w7Var.b0(v7Var5);
                                            if (b02 != null && b02.contains(x10, y3)) {
                                                if (org.telegram.ui.Wallet.w7.b(v7Var5)) {
                                                    w7Var.m0 = (Math.abs(x10 - b02.centerX()) >= b02.width() * 0.35f || Math.abs(y3 - b02.centerY()) >= b02.height() * 0.35f) ? z10 : true;
                                                    w7Var.g0 = v7Var5;
                                                }
                                            }
                                        }
                                    }
                                }
                                org.telegram.ui.Wallet.v7 v7Var6 = w7Var.g0;
                                if (v7Var6 == null || !((i10 = v7Var6.H) == 0 || i10 == 2)) {
                                    w7Var.g0 = null;
                                } else {
                                    w7Var.s0 = x10;
                                    w7Var.t0 = y3;
                                    SystemClock.uptimeMillis();
                                    org.telegram.ui.Wallet.v7 v7Var7 = w7Var.g0;
                                    w7Var.F0 = v7Var7.H;
                                    w7Var.B0 = v7Var7.e.b;
                                    w7Var.C0 = v7Var7.f.b;
                                    w7Var.E0 = v7Var7.i.b;
                                    w7Var.D0 = v7Var7.h.b;
                                    VelocityTracker velocityTracker = w7Var.J0;
                                    if (velocityTracker != null) {
                                        velocityTracker.recycle();
                                    }
                                    VelocityTracker obtain = VelocityTracker.obtain();
                                    w7Var.J0 = obtain;
                                    obtain.addMovement(motionEvent);
                                    w7Var.postDelayed(o7Var2, w7Var.p0 ? 450L : 500L);
                                    if (w7Var.p0) {
                                        w7Var.k0 = true;
                                        w7Var.getParent().requestDisallowInterceptTouchEvent(true);
                                        w7Var.h0();
                                        z12 = true;
                                    } else {
                                        w7Var.l0 = true;
                                        w7Var.postDelayed(o7Var, 170L);
                                    }
                                }
                                z12 = z10;
                            } else {
                                z10 = false;
                                if (w7Var.k0 || w7Var.l0) {
                                    VelocityTracker velocityTracker2 = w7Var.J0;
                                    if (velocityTracker2 != null) {
                                        velocityTracker2.addMovement(motionEvent);
                                    }
                                    int findPointerIndex = motionEvent.findPointerIndex(w7Var.q0);
                                    boolean z14 = actionMasked == 6 && motionEvent.getPointerId(motionEvent.getActionIndex()) == w7Var.q0;
                                    if (findPointerIndex >= 0) {
                                        float x11 = motionEvent.getX(findPointerIndex);
                                        float y10 = motionEvent.getY(findPointerIndex);
                                        if (w7Var.l0) {
                                            if (actionMasked != 2 || Utilities.dist(x11, y10, w7Var.s0, w7Var.t0) <= ViewConfiguration.get(w7Var.getContext()).getScaledTouchSlop()) {
                                                if (actionMasked == 1 || actionMasked == 3 || z14) {
                                                    w7Var.a();
                                                }
                                            } else if (w7Var.m0 && w7Var.g0.H == 0) {
                                                w7Var.l0 = false;
                                                w7Var.k0 = true;
                                                w7Var.removeCallbacks(o7Var);
                                                ((nc0) w7Var.d.b).Z();
                                                w7Var.getParent().requestDisallowInterceptTouchEvent(true);
                                                w7Var.Y(w7Var.g0, x11, y10);
                                                w7Var.q(w7Var.g0, x11, y10);
                                                w7Var.h0();
                                            } else {
                                                w7Var.a();
                                            }
                                            z12 = false;
                                        } else {
                                            if (actionMasked != 2 || (v7Var = w7Var.g0) == null) {
                                                z11 = false;
                                            } else {
                                                if (w7Var.i0) {
                                                    org.telegram.ui.Wallet.u7 u7Var = v7Var.e;
                                                    org.telegram.ui.Wallet.u7 u7Var2 = v7Var.h;
                                                    float[] P = w7Var.P(u7Var.a, v7Var.f.a);
                                                    float dist = Utilities.dist(x11, y10, P[0], P[1]);
                                                    if (Float.isNaN(w7Var.z0)) {
                                                        w7Var.z0 = dist;
                                                        w7Var.A0 = u7Var2.b;
                                                    }
                                                    if (Math.abs(dist - w7Var.z0) > AndroidUtilities.dp(5.0f)) {
                                                        org.telegram.ui.Wallet.u7 u7Var3 = v7Var.q;
                                                        f11 = 5.0f;
                                                        u7Var3.d = 700.0f;
                                                        u7Var3.e = 1.0f;
                                                        u7Var3.b = 1.0f;
                                                    } else {
                                                        f11 = 5.0f;
                                                    }
                                                    float dp = AndroidUtilities.dp(32.0f) / w7Var.W();
                                                    u7Var2.d = 900.0f;
                                                    u7Var2.e = 1.0f;
                                                    u7Var2.b = Math.max(dp, Math.min(1.1f, ((1.1f - dp) * ((dist - w7Var.z0) / AndroidUtilities.dp(110.0f))) + w7Var.A0));
                                                    if (dist < AndroidUtilities.dp(14.0f)) {
                                                        w7Var.w0 = Float.NaN;
                                                        z11 = false;
                                                    } else {
                                                        z11 = false;
                                                        float degrees = (float) Math.toDegrees(Math.atan2(y10 - P[1], x11 - P[0]));
                                                        if (!Float.isNaN(w7Var.w0)) {
                                                            w7Var.x0 = org.telegram.ui.Wallet.w7.c(degrees - w7Var.w0) + w7Var.x0;
                                                        }
                                                        w7Var.w0 = degrees;
                                                        float f12 = w7Var.y0 + w7Var.x0;
                                                        float round = Math.round(f12 / 90.0f) * 90;
                                                        boolean z15 = Math.abs(f12 - round) < f11;
                                                        if (z15 && !w7Var.G0) {
                                                            w7Var.performHapticFeedback(4);
                                                        }
                                                        w7Var.G0 = z15;
                                                        org.telegram.ui.Wallet.u7 u7Var4 = v7Var.i;
                                                        u7Var4.d = 900.0f;
                                                        u7Var4.e = 0.95f;
                                                        if (z15) {
                                                            f12 = round;
                                                        }
                                                        u7Var4.b = f12;
                                                    }
                                                } else {
                                                    z11 = false;
                                                    if (Utilities.dist(x11, y10, w7Var.s0, w7Var.t0) > ViewConfiguration.get(w7Var.getContext()).getScaledTouchSlop()) {
                                                        w7Var.removeCallbacks(o7Var2);
                                                        if (!w7Var.h0 && (w7Var.p0 || w7Var.g0.H == 0)) {
                                                            w7Var.Y(w7Var.g0, x11, y10);
                                                        }
                                                        if (w7Var.h0) {
                                                            w7Var.q(w7Var.g0, x11, y10);
                                                        }
                                                    }
                                                }
                                                w7Var.h0();
                                            }
                                            if (actionMasked == 1 || actionMasked == 3 || z14) {
                                                VelocityTracker velocityTracker3 = w7Var.J0;
                                                if (velocityTracker3 != null) {
                                                    velocityTracker3.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT);
                                                    f10 = w7Var.J0.getXVelocity(w7Var.q0);
                                                    f7 = w7Var.J0.getYVelocity(w7Var.q0);
                                                } else {
                                                    f7 = 0.0f;
                                                    f10 = 0.0f;
                                                }
                                                w7Var.x(f10, f7, actionMasked == 3 ? true : z11);
                                            }
                                        }
                                    } else if (w7Var.l0) {
                                        w7Var.a();
                                    } else {
                                        w7Var.x(0.0f, 0.0f, true);
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
                org.telegram.ui.Wallet.h5 h5Var2 = l5Var.r0;
                if (h5Var2 != null) {
                    h5Var2.e(motionEvent);
                }
                boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                if (motionEvent.getActionMasked() == 1 && (h5Var = l5Var.r0) != null) {
                    org.telegram.ui.Wallet.n nVar = h5Var.i;
                    org.telegram.ui.Components.u61 u61Var = h5Var.c;
                    if (u61Var != null) {
                        u61Var.removeCallbacks(nVar);
                        h5Var.c.post(nVar);
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
                org.telegram.ui.Wallet.l5 l5Var = (org.telegram.ui.Wallet.l5) this.z0;
                if (!this.y0 && i13 != 0 && (t02 = l5Var.t0()) != null) {
                    if (viewGroup != l5Var.a || !a0()) {
                        if (viewGroup == t02 && i13 < 0) {
                            iArr[1] = d0(l5Var.a, i13) + iArr[1];
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
                org.telegram.ui.Wallet.h5 h5Var = ((org.telegram.ui.Wallet.l5) this.z0).r0;
                if (h5Var != null) {
                    org.telegram.ui.Wallet.n nVar = h5Var.i;
                    org.telegram.ui.Components.u61 u61Var = h5Var.c;
                    if (u61Var != null) {
                        u61Var.removeCallbacks(nVar);
                        h5Var.c.post(nVar);
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
                org.telegram.ui.Wallet.l5 l5Var = (org.telegram.ui.Wallet.l5) this.z0;
                if (l5Var.n != size) {
                    l5Var.n = size;
                    org.telegram.ui.Wallet.y4 y4Var = l5Var.d;
                    if (y4Var != null) {
                        y4Var.requestLayout();
                    }
                    org.telegram.ui.Wallet.v4 v4Var = l5Var.e;
                    if (v4Var != null) {
                        v4Var.requestLayout();
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
        org.telegram.ui.Wallet.h5 h5Var;
        switch (this.w0) {
            case 1:
                org.telegram.ui.Wallet.l5 l5Var = (org.telegram.ui.Wallet.l5) this.z0;
                if (view != l5Var.t0() || (h5Var = l5Var.r0) == null) {
                    return false;
                }
                return h5Var.a((int) f7, (int) f10);
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
