package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class ev extends v4.b0 {
    public boolean I;
    public boolean J;
    public ValueAnimator K;
    public final /* synthetic */ xw L;
    public final /* synthetic */ yw M;

    public ev(yw ywVar, xw xwVar) {
        this.M = ywVar;
        this.L = xwVar;
    }

    @Override // v4.b0
    public final int R0() {
        xw xwVar = this.L;
        return (xwVar.s == 0 && this.M.l4() && xwVar.w == 2) ? 1 : 0;
    }

    @Override // v4.b0, v4.n0
    public final void b0(v4.v0 v0Var, v4.a1 a1Var) {
        boolean z9 = org.telegram.messenger.r2.a;
        try {
            super.b0(v0Var, a1Var);
        } catch (IndexOutOfBoundsException e10) {
            org.telegram.messenger.a8.g(e10, true);
            org.telegram.messenger.g0.h3(new dv(this.L, 0));
        }
    }

    @Override // v4.b0
    public final void b1(View view, View view2, int i7, int i10) {
        this.I = true;
        super.b1(view, view2, i7, i10);
        this.I = false;
    }

    @Override // v4.n0
    public final void f0() {
        ValueAnimator valueAnimator = this.K;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.K.cancel();
        }
        xw xwVar = this.L;
        if (xwVar.a.getScrollState() != 1) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.M.T, 0.0f);
            this.K = ofFloat;
            ofFloat.addUpdateListener(new bi.de(22, this, xwVar));
            this.K.addListener(new va(this, 24));
            this.K.setDuration(200L);
            this.K.setInterpolator(org.telegram.ui.Components.xq.f);
            this.K.start();
        }
    }

    @Override // v4.b0
    public final void h1(int i7, int i10) {
        if (this.I) {
            i10 -= this.L.a.getPaddingTop();
        }
        super.h1(i7, i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        if (org.telegram.ui.yw.v1(r4, r6) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        if (r11.w() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x0184, code lost:
    
        if (r8.w() == false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x01da, code lost:
    
        if (r8.w() == false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x0261, code lost:
    
        if (r5 > (-1)) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0076, code lost:
    
        if (r11.w() == false) goto L38;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0403 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0294  */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1 */
    /* JADX WARN: Type inference failed for: r21v3 */
    /* JADX WARN: Type inference failed for: r21v4 */
    @Override // v4.b0, v4.n0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int o0(int i7, v4.v0 v0Var, v4.a1 a1Var) {
        boolean z9;
        int i10;
        int i11;
        float f10;
        int L0;
        int i12;
        int i13;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        int i14;
        int L;
        View m10;
        int o02;
        boolean z10;
        hv hvVar;
        float viewOffset;
        float f11;
        org.telegram.ui.ActionBar.k kVar5;
        org.telegram.ui.ActionBar.k kVar6;
        org.telegram.ui.ActionBar.k kVar7;
        org.telegram.ui.ActionBar.k kVar8;
        yw ywVar = this.M;
        UndoView[] undoViewArr = ywVar.y0;
        xw xwVar = this.L;
        uw uwVar = xwVar.a;
        int i15 = 0;
        if (!uwVar.V1) {
            boolean z11 = uwVar.getScrollState() == 1;
            if (z11 != this.J) {
                this.J = z11;
                if (!z11) {
                }
            }
            float f12 = 0.0f;
            if (i7 > 0 && ywVar.T != 0.0f) {
                kVar7 = ((org.telegram.ui.ActionBar.f2) ywVar).actionBar;
                if (kVar7 != null) {
                    kVar8 = ((org.telegram.ui.ActionBar.f2) ywVar).actionBar;
                }
                float f13 = ywVar.T - i7;
                if (f13 < 0.0f) {
                    i15 = (int) (-f13);
                } else {
                    f12 = f13;
                }
                yw.u1(ywVar, xwVar, f12);
                return super.o0(i15, v0Var, a1Var);
            }
            if (ywVar.K && ywVar.Z2 == 0) {
                kVar5 = ((org.telegram.ui.ActionBar.f2) ywVar).actionBar;
                if (kVar5 != null) {
                    kVar6 = ((org.telegram.ui.ActionBar.f2) ywVar).actionBar;
                }
                z9 = true;
                int paddingTop = xwVar.a.getPaddingTop();
                int L2 = (z9 || ywVar.G3.c() || ywVar.R) ? paddingTop : paddingTop - org.telegram.messenger.g0.L(81.0f);
                if (!ywVar.R && xwVar.s == 0 && !ywVar.m2 && ywVar.X2 == 0 && ywVar.Z2 == 0) {
                    org.telegram.messenger.qp messagesController = ywVar.getMessagesController();
                    messagesController.getClass();
                    if (org.telegram.messenger.iz.q1) {
                        i10 = paddingTop;
                        if (messagesController.Q.f(1 | 2305843009213693952L) != null && xwVar.w == 2) {
                            i11 = 1;
                            if ((i11 == 0 || (z9 && !ywVar.G3.c())) && i7 < 0) {
                                f10 = 1.0f;
                                xwVar.a.setOverScrollMode(0);
                                L0 = xwVar.c.L0();
                                if (L0 == 0 || (m10 = xwVar.c.m(L0)) == null) {
                                    i12 = 1;
                                } else {
                                    char c10 = 1;
                                    i12 = c10;
                                    if (m10.getBottom() - L2 <= org.telegram.messenger.g0.L(1.0f)) {
                                        L0 = 1;
                                        i12 = c10;
                                    }
                                }
                                if (!z11) {
                                    if (L0 == 0 && i11 != 0) {
                                        View m11 = xwVar.c.m(L0);
                                        float top = ((m11.getTop() - i10) / m11.getMeasuredHeight()) + 1.0f;
                                        if (top > 1.0f) {
                                            top = 1.0f;
                                        }
                                        xwVar.a.setOverScrollMode(2);
                                        int C = (int) com.google.android.recaptcha.internal.a.C(top, 0.25f, 0.45f, i7);
                                        r8 = C <= -1 ? C : -1;
                                        UndoView undoView = undoViewArr[0];
                                        if (undoView != null && undoView.getVisibility() == 0) {
                                            boolean z12 = i12;
                                            undoViewArr[0].d(z12 ? 1 : 0, z12);
                                        }
                                    } else if (((L0 == i12 && i11 != 0) || L0 == 0) && z9 && z11 && !ywVar.G3.c()) {
                                        if (ywVar.N == 0.0f) {
                                            xwVar.a.setOverScrollMode(0);
                                        } else {
                                            xwVar.a.setOverScrollMode(2);
                                        }
                                        i13 = (int) (i7 * 0.3f);
                                    }
                                    i13 = r8;
                                    if (xwVar.s == 0) {
                                        viewOffset = ((int) xwVar.a.getViewOffset()) - i7;
                                        if (viewOffset >= 0.0f) {
                                        }
                                        xwVar.a.setViewsOffset(f11);
                                    }
                                    if (xwVar.s == 0) {
                                    }
                                    boolean z13 = z9;
                                    o02 = super.o0(i13, v0Var, a1Var);
                                    if (o02 == 0) {
                                        yw.u1(ywVar, xwVar, ywVar.T - (ywVar.E0.getOverScrollCoef() * i7));
                                    }
                                    return o02;
                                }
                                View m12 = xwVar.c.m(L0);
                                if (m12 != null && L0 < 10) {
                                    int i16 = 0;
                                    while (i11 < L0) {
                                        iv ivVar = xwVar.d;
                                        if (((jg.l) ivVar.M.get(i11)).a == 0) {
                                            if (!((jg.l) ivVar.M.get(i11)).f || ivVar.J) {
                                                L = org.telegram.messenger.g0.L(org.telegram.messenger.iz.p1 ? 76.0f : 70.0f);
                                            } else {
                                                L = org.telegram.messenger.g0.L(org.telegram.messenger.iz.p1 ? 86.0f : 91.0f);
                                            }
                                            i14 = L + 1;
                                        } else {
                                            i14 = 0;
                                        }
                                        i16 += i14;
                                        i11++;
                                    }
                                    int i17 = (-(m12.getTop() - L2)) + i16;
                                    if (!ywVar.G3.c()) {
                                        kVar3 = ((org.telegram.ui.ActionBar.f2) ywVar).actionBar;
                                        if (kVar3 != null) {
                                            kVar4 = ((org.telegram.ui.ActionBar.f2) ywVar).actionBar;
                                        }
                                        i17 -= org.telegram.messenger.g0.L(48.0f);
                                    }
                                    if (z9 && ((((ValueAnimator) xwVar.b.c) != null || ywVar.E0.g()) && !ywVar.G3.c() && !ywVar.R)) {
                                        i17 += org.telegram.messenger.g0.L(81.0f);
                                    }
                                    if ((((ValueAnimator) xwVar.b.c) != null || ywVar.E0.g()) && !ywVar.G3.c() && !ywVar.R) {
                                        kVar = ((org.telegram.ui.ActionBar.f2) ywVar).actionBar;
                                        if (kVar != null) {
                                            kVar2 = ((org.telegram.ui.ActionBar.f2) ywVar).actionBar;
                                        }
                                        i17 += org.telegram.messenger.g0.L(48.0f);
                                    }
                                    if (i17 < Math.abs(i7)) {
                                        i13 = -i17;
                                        if (xwVar.s == 0 && xwVar.a.getViewOffset() != 0.0f && i7 > 0 && z11) {
                                            viewOffset = ((int) xwVar.a.getViewOffset()) - i7;
                                            if (viewOffset >= 0.0f) {
                                                i13 = (int) viewOffset;
                                                f11 = 0.0f;
                                            } else {
                                                f11 = viewOffset;
                                                i13 = 0;
                                            }
                                            xwVar.a.setViewsOffset(f11);
                                        }
                                        if (xwVar.s == 0 || xwVar.w == 0 || !ywVar.l4() || ywVar.R) {
                                            boolean z132 = z9;
                                            o02 = super.o0(i13, v0Var, a1Var);
                                            if (o02 == 0 && i7 < 0 && z11 && !ywVar.G3.c() && z132 && ywVar.v3 == 0.0f) {
                                                yw.u1(ywVar, xwVar, ywVar.T - (ywVar.E0.getOverScrollCoef() * i7));
                                            }
                                            return o02;
                                        }
                                        int o03 = super.o0(i13, v0Var, a1Var);
                                        hv hvVar2 = xwVar.n;
                                        if (hvVar2 != null) {
                                            hvVar2.a = o03;
                                        }
                                        int L02 = xwVar.c.L0();
                                        View m13 = L02 == 0 ? xwVar.c.m(L02) : null;
                                        if (L02 != 0 || m13 == null || m13.getBottom() - L2 < org.telegram.messenger.g0.L(4.0f)) {
                                            boolean z14 = z9;
                                            ywVar.e3 = 0L;
                                            ywVar.g3 = false;
                                            boolean z15 = xwVar.w != 2;
                                            xwVar.w = 2;
                                            if (z15 && org.telegram.messenger.g0.C1()) {
                                                org.telegram.messenger.g0.i2(org.telegram.messenger.id.M0(2131754924, null));
                                            }
                                            hv hvVar3 = xwVar.n;
                                            z10 = z14;
                                            if (hvVar3 != null) {
                                                ValueAnimator valueAnimator = hvVar3.z;
                                                if (valueAnimator != null) {
                                                    valueAnimator.cancel();
                                                }
                                                org.telegram.ui.Cells.t2 t2Var = hvVar3.H;
                                                if (t2Var != null) {
                                                    t2Var.removeCallbacks(hvVar3.d0);
                                                }
                                                hvVar3.x = 0.0f;
                                                hvVar3.y = false;
                                                hvVar3.e0 = false;
                                                xwVar.n.f(0.0f);
                                                xwVar.n.I = xwVar.a;
                                                z10 = z14;
                                            }
                                        } else {
                                            if (ywVar.e3 == 0) {
                                                ywVar.e3 = System.currentTimeMillis();
                                            }
                                            if (xwVar.w == 2 && (hvVar = xwVar.n) != null) {
                                                hvVar.h();
                                            }
                                            if (z9 && !ywVar.G3.c() && !ywVar.R) {
                                                L2 += org.telegram.messenger.g0.L(81.0f);
                                            }
                                            float top2 = ((m13.getTop() - L2) / m13.getMeasuredHeight()) + f10;
                                            if (top2 > f10) {
                                                top2 = f10;
                                            }
                                            boolean z16 = z9;
                                            boolean z17 = top2 > 0.85f && System.currentTimeMillis() - ywVar.e3 > 220;
                                            if (ywVar.g3 != z17) {
                                                ywVar.g3 = z17;
                                                if (xwVar.w == 2) {
                                                    try {
                                                        xwVar.a.performHapticFeedback(3, 2);
                                                    } catch (Exception unused) {
                                                    }
                                                    hv hvVar4 = xwVar.n;
                                                    if (hvVar4 != null) {
                                                        hvVar4.a(z17);
                                                    }
                                                }
                                            }
                                            if (xwVar.w == 2 && i13 - o03 != 0 && i7 < 0 && z11) {
                                                xwVar.a.setViewsOffset(org.telegram.ui.Cells.f1.x(i7, 0.2f, f10 - (xwVar.a.getViewOffset() / org.telegram.messenger.g0.L(72.0f)), xwVar.a.getViewOffset()));
                                            }
                                            hv hvVar5 = xwVar.n;
                                            z10 = z16;
                                            if (hvVar5 != null) {
                                                hvVar5.f(top2);
                                                xwVar.n.I = xwVar.a;
                                                z10 = z16;
                                            }
                                        }
                                        if (m13 != null) {
                                            m13.invalidate();
                                        }
                                        if (xwVar.w == 1 && o03 == 0 && i7 < 0 && z11 && !ywVar.G3.c() && z10 && ywVar.v3 == 0.0f) {
                                            yw.u1(ywVar, xwVar, ywVar.T - (org.telegram.messenger.g0.T1(0.2f, 0.5f, ywVar.E0.n0) * i7));
                                        }
                                        return o03;
                                    }
                                }
                            } else {
                                f10 = 1.0f;
                            }
                            i13 = i7;
                            if (xwVar.s == 0) {
                            }
                            if (xwVar.s == 0) {
                            }
                            boolean z1322 = z9;
                            o02 = super.o0(i13, v0Var, a1Var);
                            if (o02 == 0) {
                            }
                            return o02;
                        }
                        i11 = 0;
                        if (i11 == 0) {
                        }
                        f10 = 1.0f;
                        xwVar.a.setOverScrollMode(0);
                        L0 = xwVar.c.L0();
                        if (L0 == 0) {
                        }
                        i12 = 1;
                        if (!z11) {
                        }
                    }
                }
                i10 = paddingTop;
                i11 = 0;
                if (i11 == 0) {
                }
                f10 = 1.0f;
                xwVar.a.setOverScrollMode(0);
                L0 = xwVar.c.L0();
                if (L0 == 0) {
                }
                i12 = 1;
                if (!z11) {
                }
            }
            z9 = false;
            int paddingTop2 = xwVar.a.getPaddingTop();
            if (z9) {
            }
            if (!ywVar.R) {
                org.telegram.messenger.qp messagesController2 = ywVar.getMessagesController();
                messagesController2.getClass();
                if (org.telegram.messenger.iz.q1) {
                }
            }
            i10 = paddingTop2;
            i11 = 0;
            if (i11 == 0) {
            }
            f10 = 1.0f;
            xwVar.a.setOverScrollMode(0);
            L0 = xwVar.c.L0();
            if (L0 == 0) {
            }
            i12 = 1;
            if (!z11) {
            }
        }
        return 0;
    }

    @Override // v4.b0, v4.n0
    public final void v0(RecyclerView recyclerView, v4.a1 a1Var, int i7) {
        if (this.M.l4() && i7 == 1) {
            super.v0(recyclerView, a1Var, i7);
            return;
        }
        mi.m mVar = new mi.m(recyclerView.getContext(), 0);
        mVar.a = i7;
        w0(mVar);
    }
}
