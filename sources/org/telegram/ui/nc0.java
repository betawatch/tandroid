package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class nc0 extends org.telegram.ui.Components.vw0 implements r0.m {
    public final /* synthetic */ int l0 = 1;
    public final b2.v0 m0;
    public boolean n0;
    public final /* synthetic */ org.telegram.ui.ActionBar.r2 o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nc0(org.telegram.ui.Wallet.m5 m5Var, Context context) {
        super(context, null);
        this.o0 = m5Var;
        this.m0 = new b2.v0();
    }

    public void X() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        org.telegram.ui.Wallet.i5 i5Var = ((org.telegram.ui.Wallet.m5) this.o0).q0;
        if (i5Var != null) {
            i5Var.e(obtain);
        }
        super.dispatchTouchEvent(obtain);
        obtain.recycle();
    }

    public boolean Y() {
        org.telegram.ui.Wallet.m5 m5Var = (org.telegram.ui.Wallet.m5) this.o0;
        bi.r rVar = m5Var.n0;
        return rVar != null && (rVar.getParent() instanceof View) && ((View) m5Var.n0.getParent()).getTop() <= m5Var.a.getPaddingTop();
    }

    /* JADX WARN: Finally extract failed */
    public int b0(org.telegram.ui.Components.r71 r71Var, int i10) {
        int[] iArr = {0};
        org.telegram.ui.Components.ml mlVar = new org.telegram.ui.Components.ml(iArr, 20);
        this.n0 = true;
        r71Var.j(mlVar);
        try {
            r71Var.scrollBy(0, i10);
            ArrayList arrayList = r71Var.w0;
            if (arrayList != null) {
                arrayList.remove(mlVar);
            }
            this.n0 = false;
            return iArr[0];
        } catch (Throwable th2) {
            ArrayList arrayList2 = r71Var.w0;
            if (arrayList2 != null) {
                arrayList2.remove(mlVar);
            }
            this.n0 = false;
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0171  */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v6 */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.Wallet.i5 i5Var;
        org.telegram.ui.Wallet.r5 r5Var;
        float f7;
        float f10;
        org.telegram.ui.Wallet.s7 s7Var;
        boolean z10;
        boolean z11;
        boolean z12;
        org.telegram.ui.Wallet.s7 s7Var2;
        float f11;
        Iterator it;
        org.telegram.ui.Wallet.s7 s7Var3;
        org.telegram.ui.Wallet.s7 s7Var4;
        int i10;
        switch (this.l0) {
            case 1:
                org.telegram.ui.Wallet.m5 m5Var = (org.telegram.ui.Wallet.m5) this.o0;
                org.telegram.ui.Wallet.t7 t7Var = m5Var.j0;
                int i11 = 1;
                if (t7Var != null) {
                    org.telegram.ui.Wallet.l7 l7Var = t7Var.B1;
                    LinkedHashMap linkedHashMap = t7Var.f;
                    org.telegram.ui.Wallet.l7 l7Var2 = t7Var.A1;
                    boolean z13 = false;
                    if (!t7Var.b && ((r5Var = t7Var.c.y) == null || !r5Var.a || t7Var.p0 || t7Var.q0)) {
                        if (t7Var.a1 || t7Var.s0 || !t7Var.A()) {
                            z13 = t7Var.p0;
                        } else {
                            if (t7Var.h1) {
                                t7Var.f0();
                            }
                            int actionMasked = motionEvent.getActionMasked();
                            if (actionMasked == 0) {
                                t7Var.removeCallbacks(l7Var2);
                                t7Var.removeCallbacks(l7Var);
                                t7Var.g0 = null;
                                t7Var.o0 = false;
                                t7Var.i0 = false;
                                t7Var.n0 = false;
                                t7Var.m0 = false;
                                t7Var.q0 = false;
                                t7Var.p0 = false;
                                t7Var.v0 = motionEvent.getPointerId(0);
                                float x9 = motionEvent.getX();
                                float y3 = motionEvent.getY();
                                float[] fArr = {x9, y3};
                                t7Var.s.mapPoints(fArr);
                                org.telegram.ui.Wallet.s7 s7Var5 = t7Var.h0;
                                if (s7Var5 != null && s7Var5.H == 2) {
                                    float P = (t7Var.P(s7Var5) * 0.5f) + AndroidUtilities.dp(9.0f);
                                    double radians = Math.toRadians(s7Var5.i.a);
                                    int i12 = -1;
                                    while (i12 <= i11) {
                                        int i13 = i11;
                                        float f12 = i12 * P;
                                        double d = radians;
                                        float[] L = t7Var.L((((float) Math.cos(d)) * f12) + s7Var5.e.a + s7Var5.n.a, (f12 * ((float) Math.sin(d))) + s7Var5.f.a + s7Var5.o.a);
                                        if (Utilities.dist(x9, y3, L[0], L[i13 == true ? 1 : 0]) < AndroidUtilities.dp(22.0f)) {
                                            z12 = i13 == true ? 1 : 0;
                                            z11 = i13;
                                            t7Var.i0 = z12;
                                            if (z12) {
                                                float f13 = fArr[0];
                                                float f14 = fArr[z11];
                                                Iterator it2 = linkedHashMap.values().iterator();
                                                org.telegram.ui.Wallet.s7 s7Var6 = null;
                                                while (it2.hasNext()) {
                                                    org.telegram.ui.Wallet.s7 s7Var7 = (org.telegram.ui.Wallet.s7) it2.next();
                                                    if (s7Var7.H != 2 || Utilities.dist(f13, f14, s7Var7.e.a, s7Var7.f.a) >= t7Var.P(s7Var7) * 0.44f) {
                                                        f11 = f14;
                                                        it = it2;
                                                    } else {
                                                        if (s7Var6 != null) {
                                                            f11 = f14;
                                                            it = it2;
                                                            if (s7Var7.I <= s7Var6.I) {
                                                            }
                                                        } else {
                                                            f11 = f14;
                                                            it = it2;
                                                        }
                                                        s7Var6 = s7Var7;
                                                    }
                                                    f14 = f11;
                                                    it2 = it;
                                                }
                                                s7Var2 = s7Var6;
                                            } else {
                                                s7Var2 = t7Var.h0;
                                            }
                                            t7Var.g0 = s7Var2;
                                            if (!t7Var.i0 && s7Var2 != t7Var.h0) {
                                                t7Var.h0 = null;
                                                t7Var.f0();
                                            }
                                            s7Var3 = t7Var.g0;
                                            t7Var.u0 = s7Var3 == null ? z11 : false;
                                            if (s7Var3 == null) {
                                                Iterator it3 = linkedHashMap.values().iterator();
                                                while (true) {
                                                    if (it3.hasNext()) {
                                                        org.telegram.ui.Wallet.s7 s7Var8 = (org.telegram.ui.Wallet.s7) it3.next();
                                                        RectF Z = t7Var.Z(s7Var8);
                                                        if (Z != null && Z.contains(x9, y3)) {
                                                            if (org.telegram.ui.Wallet.t7.b(s7Var8)) {
                                                                t7Var.r0 = (Math.abs(x9 - Z.centerX()) >= Z.width() * 0.35f || Math.abs(y3 - Z.centerY()) >= Z.height() * 0.35f) ? false : z11;
                                                                t7Var.g0 = s7Var8;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            s7Var4 = t7Var.g0;
                                            if (s7Var4 == null && ((i10 = s7Var4.H) == 0 || i10 == 2)) {
                                                t7Var.x0 = x9;
                                                t7Var.y0 = y3;
                                                SystemClock.uptimeMillis();
                                                org.telegram.ui.Wallet.s7 s7Var9 = t7Var.g0;
                                                t7Var.K0 = s7Var9.H;
                                                t7Var.G0 = s7Var9.e.b;
                                                t7Var.H0 = s7Var9.f.b;
                                                t7Var.J0 = s7Var9.i.b;
                                                t7Var.I0 = s7Var9.h.b;
                                                VelocityTracker velocityTracker = t7Var.O0;
                                                if (velocityTracker != null) {
                                                    velocityTracker.recycle();
                                                }
                                                VelocityTracker obtain = VelocityTracker.obtain();
                                                t7Var.O0 = obtain;
                                                obtain.addMovement(motionEvent);
                                                if (t7Var.i0) {
                                                    t7Var.B0 = Float.NaN;
                                                    t7Var.E0 = Float.NaN;
                                                    t7Var.C0 = 0.0f;
                                                    org.telegram.ui.Wallet.s7 s7Var10 = t7Var.g0;
                                                    t7Var.D0 = s7Var10.i.b;
                                                    t7Var.L0 = false;
                                                    long j10 = t7Var.N0 + 1;
                                                    t7Var.N0 = j10;
                                                    s7Var10.I = j10;
                                                    t7Var.M(s7Var10, x9, y3);
                                                } else {
                                                    t7Var.postDelayed(l7Var2, t7Var.u0 ? 450L : 500L);
                                                }
                                                if (t7Var.u0) {
                                                    boolean z14 = z11;
                                                    t7Var.p0 = z14;
                                                    t7Var.getParent().requestDisallowInterceptTouchEvent(z14);
                                                    t7Var.f0();
                                                    z13 = z14;
                                                } else {
                                                    t7Var.q0 = z11;
                                                    t7Var.postDelayed(l7Var, 170L);
                                                }
                                            } else {
                                                t7Var.g0 = null;
                                            }
                                            z13 = false;
                                        } else {
                                            i12 += 2;
                                            i11 = i13 == true ? 1 : 0;
                                            radians = d;
                                        }
                                    }
                                }
                                z11 = i11;
                                z12 = false;
                                t7Var.i0 = z12;
                                if (z12) {
                                }
                                t7Var.g0 = s7Var2;
                                if (!t7Var.i0) {
                                    t7Var.h0 = null;
                                    t7Var.f0();
                                }
                                s7Var3 = t7Var.g0;
                                t7Var.u0 = s7Var3 == null ? z11 : false;
                                if (s7Var3 == null) {
                                }
                                s7Var4 = t7Var.g0;
                                if (s7Var4 == null) {
                                }
                                t7Var.g0 = null;
                                z13 = false;
                            } else {
                                if (t7Var.p0 || t7Var.q0) {
                                    VelocityTracker velocityTracker2 = t7Var.O0;
                                    if (velocityTracker2 != null) {
                                        velocityTracker2.addMovement(motionEvent);
                                    }
                                    int findPointerIndex = motionEvent.findPointerIndex(t7Var.v0);
                                    boolean z15 = actionMasked == 6 && motionEvent.getPointerId(motionEvent.getActionIndex()) == t7Var.v0;
                                    if (findPointerIndex >= 0) {
                                        float x10 = motionEvent.getX(findPointerIndex);
                                        float y10 = motionEvent.getY(findPointerIndex);
                                        if (t7Var.q0) {
                                            if (actionMasked != 2 || Utilities.dist(x10, y10, t7Var.x0, t7Var.y0) <= ViewConfiguration.get(t7Var.getContext()).getScaledTouchSlop()) {
                                                z10 = false;
                                                if (actionMasked == 1 || actionMasked == 3 || z15) {
                                                    t7Var.a();
                                                }
                                            } else if (t7Var.r0 && t7Var.g0.H == 0) {
                                                t7Var.q0 = false;
                                                t7Var.p0 = true;
                                                t7Var.removeCallbacks(l7Var);
                                                ((nc0) t7Var.d.b).X();
                                                t7Var.getParent().requestDisallowInterceptTouchEvent(true);
                                                t7Var.W(t7Var.g0, x10, y10);
                                                t7Var.q(t7Var.g0, x10, y10);
                                                t7Var.f0();
                                            } else {
                                                z10 = false;
                                                t7Var.a();
                                            }
                                            z13 = z10;
                                        } else {
                                            if (actionMasked == 2 && (s7Var = t7Var.g0) != null) {
                                                if (t7Var.n0 || t7Var.i0) {
                                                    t7Var.M(s7Var, x10, y10);
                                                } else if (Utilities.dist(x10, y10, t7Var.x0, t7Var.y0) > ViewConfiguration.get(t7Var.getContext()).getScaledTouchSlop()) {
                                                    t7Var.removeCallbacks(l7Var2);
                                                    if (!t7Var.m0 && (t7Var.u0 || t7Var.g0.H == 0)) {
                                                        t7Var.W(t7Var.g0, x10, y10);
                                                    }
                                                    if (t7Var.m0) {
                                                        t7Var.q(t7Var.g0, x10, y10);
                                                    }
                                                }
                                                t7Var.f0();
                                            }
                                            if (actionMasked == 1 || actionMasked == 3 || z15) {
                                                VelocityTracker velocityTracker3 = t7Var.O0;
                                                if (velocityTracker3 != null) {
                                                    velocityTracker3.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT);
                                                    f7 = t7Var.O0.getXVelocity(t7Var.v0);
                                                    f10 = t7Var.O0.getYVelocity(t7Var.v0);
                                                } else {
                                                    f7 = 0.0f;
                                                    f10 = 0.0f;
                                                }
                                                t7Var.w(f7, f10, actionMasked == 3);
                                            }
                                        }
                                    } else if (t7Var.q0) {
                                        t7Var.a();
                                    } else {
                                        t7Var.w(0.0f, 0.0f, true);
                                    }
                                    z13 = true;
                                }
                                z13 = false;
                            }
                        }
                    }
                    if (z13) {
                        return true;
                    }
                }
                org.telegram.ui.Wallet.i5 i5Var2 = m5Var.q0;
                if (i5Var2 != null) {
                    i5Var2.e(motionEvent);
                }
                boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                if (motionEvent.getActionMasked() == 1 && (i5Var = m5Var.q0) != null) {
                    org.telegram.ui.Wallet.m mVar = i5Var.i;
                    org.telegram.ui.Components.l71 l71Var = i5Var.c;
                    if (l71Var != null) {
                        l71Var.removeCallbacks(mVar);
                        i5Var.c.post(mVar);
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
        org.telegram.ui.ActionBar.j5 j5Var;
        org.telegram.ui.ActionBar.j5 j5Var2;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.l0) {
            case 0:
                boolean drawChild = super.drawChild(canvas, view, j10);
                pc0 pc0Var = (pc0) this.o0;
                kVar = ((org.telegram.ui.ActionBar.r2) pc0Var).actionBar;
                if (view == kVar) {
                    j5Var = ((org.telegram.ui.ActionBar.r2) pc0Var).parentLayout;
                    if (j5Var != null) {
                        j5Var2 = ((org.telegram.ui.ActionBar.r2) pc0Var).parentLayout;
                        kVar2 = ((org.telegram.ui.ActionBar.r2) pc0Var).actionBar;
                        ((ActionBarLayout) j5Var2).q(canvas, kVar2.getMeasuredHeight());
                    }
                }
                return drawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        switch (this.l0) {
            case 1:
                return this.m0.b();
            default:
                return super.getNestedScrollAxes();
        }
    }

    @Override // r0.l
    public final void m(int i10, View view) {
        switch (this.l0) {
            case 0:
                this.m0.a = 0;
                break;
            default:
                b2.v0 v0Var = this.m0;
                if (i10 == 1) {
                    v0Var.b = 0;
                } else {
                    v0Var.a = 0;
                }
                org.telegram.ui.Wallet.i5 i5Var = ((org.telegram.ui.Wallet.m5) this.o0).q0;
                if (i5Var != null) {
                    org.telegram.ui.Wallet.m mVar = i5Var.i;
                    org.telegram.ui.Components.l71 l71Var = i5Var.c;
                    if (l71Var != null) {
                        l71Var.removeCallbacks(mVar);
                        i5Var.c.post(mVar);
                        break;
                    }
                }
                break;
        }
    }

    @Override // r0.m
    public final void n(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        fc0 fc0Var;
        org.telegram.ui.Components.r71 u02;
        switch (this.l0) {
            case 0:
                pc0 pc0Var = (pc0) this.o0;
                try {
                    if (view == pc0Var.U && (fc0Var = pc0Var.J0) != null && fc0Var.isAttachedToWindow()) {
                        org.telegram.ui.Components.mm0 currentListView = pc0Var.J0.getCurrentListView();
                        int top = pc0Var.J0.getTop();
                        if (currentListView != null && top == 0) {
                            iArr[1] = i13;
                            currentListView.scrollBy(0, i13);
                            break;
                        }
                    }
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    AndroidUtilities.runOnUIThread(new p00(this, 19));
                    return;
                }
                break;
            default:
                org.telegram.ui.Wallet.m5 m5Var = (org.telegram.ui.Wallet.m5) this.o0;
                if (!this.n0 && i13 != 0 && (u02 = m5Var.u0()) != null) {
                    if (view != m5Var.a || !Y()) {
                        if (view == u02 && i13 < 0) {
                            iArr[1] = b0(m5Var.a, i13) + iArr[1];
                            break;
                        }
                    } else {
                        iArr[1] = b0(u02, i13) + iArr[1];
                        break;
                    }
                }
                break;
        }
    }

    @Override // r0.l
    public final void o(View view, int i10, int i11, int i12, int i13, int i14) {
        switch (this.l0) {
            case 0:
                break;
            default:
                n(view, i10, i11, i12, i13, i14, new int[2]);
                break;
        }
    }

    @Override // org.telegram.ui.Components.vw0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.l0) {
            case 0:
                pc0 pc0Var = (pc0) this.o0;
                super.onLayout(z10, i10, i11, i12, i13);
                if (!z10) {
                    pc0Var.B0(true);
                    break;
                } else {
                    pc0Var.l0(this.n0);
                    this.n0 = false;
                    break;
                }
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.l0) {
            case 1:
                int size = (int) (View.MeasureSpec.getSize(i11) * 0.75f);
                org.telegram.ui.Wallet.m5 m5Var = (org.telegram.ui.Wallet.m5) this.o0;
                if (m5Var.r != size) {
                    m5Var.r = size;
                    org.telegram.ui.Wallet.y4 y4Var = m5Var.e;
                    if (y4Var != null) {
                        y4Var.requestLayout();
                    }
                    org.telegram.ui.Wallet.v4 v4Var = m5Var.f;
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
        org.telegram.ui.Wallet.i5 i5Var;
        switch (this.l0) {
            case 1:
                org.telegram.ui.Wallet.m5 m5Var = (org.telegram.ui.Wallet.m5) this.o0;
                if (view != m5Var.u0() || (i5Var = m5Var.q0) == null) {
                    return false;
                }
                return i5Var.a((int) f7, (int) f10);
            default:
                return super.onNestedPreFling(view, f7, f10);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        switch (this.l0) {
            case 0:
                break;
            default:
                super.onStopNestedScroll(view);
                break;
        }
    }

    @Override // r0.l
    public final boolean p(View view, View view2, int i10, int i11) {
        switch (this.l0) {
            case 0:
                if (((pc0) this.o0).J0 == null || i10 != 2) {
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
        switch (this.l0) {
            case 0:
                this.m0.a = i10;
                break;
            default:
                b2.v0 v0Var = this.m0;
                if (i11 != 1) {
                    v0Var.a = i10;
                    break;
                } else {
                    v0Var.b = i10;
                    break;
                }
        }
    }

    @Override // r0.l
    public final void t(View view, int i10, int i11, int[] iArr, int i12) {
        fc0 fc0Var;
        org.telegram.ui.ActionBar.k kVar;
        int i13;
        org.telegram.ui.Components.mm0 currentListView;
        org.telegram.ui.Components.r71 u02;
        org.telegram.ui.Wallet.i5 i5Var;
        switch (this.l0) {
            case 0:
                pc0 pc0Var = (pc0) this.o0;
                if (view == pc0Var.U && (fc0Var = pc0Var.J0) != null && fc0Var.isAttachedToWindow()) {
                    kVar = ((org.telegram.ui.ActionBar.r2) pc0Var).actionBar;
                    boolean z10 = kVar.n0;
                    int top = pc0Var.J0.getTop();
                    boolean z11 = false;
                    if (i11 >= 0) {
                        if (z10) {
                            org.telegram.ui.Components.mm0 currentListView2 = pc0Var.J0.getCurrentListView();
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
                        if (top <= 0 && (currentListView = pc0Var.J0.getCurrentListView()) != null) {
                            int L0 = ((s4.c0) currentListView.getLayoutManager()).L0();
                            if (L0 != -1) {
                                s4.e1 K = currentListView.K(L0);
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
                org.telegram.ui.Wallet.m5 m5Var = (org.telegram.ui.Wallet.m5) this.o0;
                if (!this.n0 && (u02 = m5Var.u0()) != null) {
                    if (i11 != 0 && i12 == 0 && ((view == m5Var.a || view == u02) && (i5Var = m5Var.q0) != null && i5Var.f)) {
                        i5Var.d = true;
                    }
                    if (view != m5Var.a || i11 >= 0 || !Y()) {
                        if (view == u02 && i11 > 0) {
                            iArr[1] = b0(m5Var.a, i11) + iArr[1];
                            break;
                        }
                    } else {
                        iArr[1] = b0(u02, i11) + iArr[1];
                        break;
                    }
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nc0(pc0 pc0Var, Context context) {
        super(context, null);
        this.o0 = pc0Var;
        this.n0 = true;
        this.m0 = new b2.v0();
    }

    private final void a0(View view) {
    }

    private final void Z(View view, int i10, int i11, int i12, int i13, int i14) {
    }
}
