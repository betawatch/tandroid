package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class cv extends v4.b0 {
    public boolean I;
    public boolean J;
    public ValueAnimator K;
    public final /* synthetic */ vw L;
    public final /* synthetic */ ww M;

    public cv(ww wwVar, vw vwVar) {
        this.M = wwVar;
        this.L = vwVar;
    }

    @Override // v4.b0
    public final int R0() {
        vw vwVar = this.L;
        return (vwVar.s == 0 && this.M.l4() && vwVar.w == 2) ? 1 : 0;
    }

    @Override // v4.b0, v4.n0
    public final void b0(v4.v0 v0Var, v4.a1 a1Var) {
        boolean z9 = org.telegram.messenger.r2.a;
        try {
            super.b0(v0Var, a1Var);
        } catch (IndexOutOfBoundsException e10) {
            org.telegram.messenger.a8.g(e10, true);
            org.telegram.messenger.g0.h3(new bv(this.L, 0));
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
        vw vwVar = this.L;
        if (vwVar.a.getScrollState() != 1) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.M.T, 0.0f);
            this.K = ofFloat;
            ofFloat.addUpdateListener(new bi.de(22, this, vwVar));
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
    
        if (org.telegram.ui.ww.v1(r4, r6) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        if (r11.v() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x0184, code lost:
    
        if (r8.v() == false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x01da, code lost:
    
        if (r8.v() == false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x0261, code lost:
    
        if (r5 > (-1)) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0076, code lost:
    
        if (r11.v() == false) goto L38;
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
        fv fvVar;
        float viewOffset;
        float f11;
        org.telegram.ui.ActionBar.k kVar5;
        org.telegram.ui.ActionBar.k kVar6;
        org.telegram.ui.ActionBar.k kVar7;
        org.telegram.ui.ActionBar.k kVar8;
        ww wwVar = this.M;
        UndoView[] undoViewArr = wwVar.y0;
        vw vwVar = this.L;
        sw swVar = vwVar.a;
        int i15 = 0;
        if (!swVar.V1) {
            boolean z11 = swVar.getScrollState() == 1;
            if (z11 != this.J) {
                this.J = z11;
                if (!z11) {
                }
            }
            float f12 = 0.0f;
            if (i7 > 0 && wwVar.T != 0.0f) {
                kVar7 = ((org.telegram.ui.ActionBar.f2) wwVar).actionBar;
                if (kVar7 != null) {
                    kVar8 = ((org.telegram.ui.ActionBar.f2) wwVar).actionBar;
                }
                float f13 = wwVar.T - i7;
                if (f13 < 0.0f) {
                    i15 = (int) (-f13);
                } else {
                    f12 = f13;
                }
                ww.u1(wwVar, vwVar, f12);
                return super.o0(i15, v0Var, a1Var);
            }
            if (wwVar.K && wwVar.Y2 == 0) {
                kVar5 = ((org.telegram.ui.ActionBar.f2) wwVar).actionBar;
                if (kVar5 != null) {
                    kVar6 = ((org.telegram.ui.ActionBar.f2) wwVar).actionBar;
                }
                z9 = true;
                int paddingTop = vwVar.a.getPaddingTop();
                int L2 = (z9 || wwVar.F3.c() || wwVar.R) ? paddingTop : paddingTop - org.telegram.messenger.g0.L(81.0f);
                if (!wwVar.R && vwVar.s == 0 && !wwVar.l2 && wwVar.W2 == 0 && wwVar.Y2 == 0) {
                    org.telegram.messenger.qp messagesController = wwVar.getMessagesController();
                    messagesController.getClass();
                    if (org.telegram.messenger.iz.q1) {
                        i10 = paddingTop;
                        if (messagesController.Q.f(1 | 2305843009213693952L) != null && vwVar.w == 2) {
                            i11 = 1;
                            if ((i11 == 0 || (z9 && !wwVar.F3.c())) && i7 < 0) {
                                f10 = 1.0f;
                                vwVar.a.setOverScrollMode(0);
                                L0 = vwVar.c.L0();
                                if (L0 == 0 || (m10 = vwVar.c.m(L0)) == null) {
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
                                        View m11 = vwVar.c.m(L0);
                                        float top = ((m11.getTop() - i10) / m11.getMeasuredHeight()) + 1.0f;
                                        if (top > 1.0f) {
                                            top = 1.0f;
                                        }
                                        vwVar.a.setOverScrollMode(2);
                                        int C = (int) com.google.android.recaptcha.internal.a.C(top, 0.25f, 0.45f, i7);
                                        r8 = C <= -1 ? C : -1;
                                        UndoView undoView = undoViewArr[0];
                                        if (undoView != null && undoView.getVisibility() == 0) {
                                            boolean z12 = i12;
                                            undoViewArr[0].d(z12 ? 1 : 0, z12);
                                        }
                                    } else if (((L0 == i12 && i11 != 0) || L0 == 0) && z9 && z11 && !wwVar.F3.c()) {
                                        if (wwVar.N == 0.0f) {
                                            vwVar.a.setOverScrollMode(0);
                                        } else {
                                            vwVar.a.setOverScrollMode(2);
                                        }
                                        i13 = (int) (i7 * 0.3f);
                                    }
                                    i13 = r8;
                                    if (vwVar.s == 0) {
                                        viewOffset = ((int) vwVar.a.getViewOffset()) - i7;
                                        if (viewOffset >= 0.0f) {
                                        }
                                        vwVar.a.setViewsOffset(f11);
                                    }
                                    if (vwVar.s == 0) {
                                    }
                                    boolean z13 = z9;
                                    o02 = super.o0(i13, v0Var, a1Var);
                                    if (o02 == 0) {
                                        ww.u1(wwVar, vwVar, wwVar.T - (wwVar.E0.getOverScrollCoef() * i7));
                                    }
                                    return o02;
                                }
                                View m12 = vwVar.c.m(L0);
                                if (m12 != null && L0 < 10) {
                                    int i16 = 0;
                                    while (i11 < L0) {
                                        gv gvVar = vwVar.d;
                                        if (((jg.l) gvVar.M.get(i11)).a == 0) {
                                            if (!((jg.l) gvVar.M.get(i11)).f || gvVar.J) {
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
                                    if (!wwVar.F3.c()) {
                                        kVar3 = ((org.telegram.ui.ActionBar.f2) wwVar).actionBar;
                                        if (kVar3 != null) {
                                            kVar4 = ((org.telegram.ui.ActionBar.f2) wwVar).actionBar;
                                        }
                                        i17 -= org.telegram.messenger.g0.L(48.0f);
                                    }
                                    if (z9 && ((((ValueAnimator) vwVar.b.c) != null || wwVar.E0.g()) && !wwVar.F3.c() && !wwVar.R)) {
                                        i17 += org.telegram.messenger.g0.L(81.0f);
                                    }
                                    if ((((ValueAnimator) vwVar.b.c) != null || wwVar.E0.g()) && !wwVar.F3.c() && !wwVar.R) {
                                        kVar = ((org.telegram.ui.ActionBar.f2) wwVar).actionBar;
                                        if (kVar != null) {
                                            kVar2 = ((org.telegram.ui.ActionBar.f2) wwVar).actionBar;
                                        }
                                        i17 += org.telegram.messenger.g0.L(48.0f);
                                    }
                                    if (i17 < Math.abs(i7)) {
                                        i13 = -i17;
                                        if (vwVar.s == 0 && vwVar.a.getViewOffset() != 0.0f && i7 > 0 && z11) {
                                            viewOffset = ((int) vwVar.a.getViewOffset()) - i7;
                                            if (viewOffset >= 0.0f) {
                                                i13 = (int) viewOffset;
                                                f11 = 0.0f;
                                            } else {
                                                f11 = viewOffset;
                                                i13 = 0;
                                            }
                                            vwVar.a.setViewsOffset(f11);
                                        }
                                        if (vwVar.s == 0 || vwVar.w == 0 || !wwVar.l4() || wwVar.R) {
                                            boolean z132 = z9;
                                            o02 = super.o0(i13, v0Var, a1Var);
                                            if (o02 == 0 && i7 < 0 && z11 && !wwVar.F3.c() && z132 && wwVar.u3 == 0.0f) {
                                                ww.u1(wwVar, vwVar, wwVar.T - (wwVar.E0.getOverScrollCoef() * i7));
                                            }
                                            return o02;
                                        }
                                        int o03 = super.o0(i13, v0Var, a1Var);
                                        fv fvVar2 = vwVar.n;
                                        if (fvVar2 != null) {
                                            fvVar2.a = o03;
                                        }
                                        int L02 = vwVar.c.L0();
                                        View m13 = L02 == 0 ? vwVar.c.m(L02) : null;
                                        if (L02 != 0 || m13 == null || m13.getBottom() - L2 < org.telegram.messenger.g0.L(4.0f)) {
                                            boolean z14 = z9;
                                            wwVar.d3 = 0L;
                                            wwVar.f3 = false;
                                            boolean z15 = vwVar.w != 2;
                                            vwVar.w = 2;
                                            if (z15 && org.telegram.messenger.g0.C1()) {
                                                org.telegram.messenger.g0.i2(org.telegram.messenger.id.M0(2131754924, null));
                                            }
                                            fv fvVar3 = vwVar.n;
                                            z10 = z14;
                                            if (fvVar3 != null) {
                                                ValueAnimator valueAnimator = fvVar3.z;
                                                if (valueAnimator != null) {
                                                    valueAnimator.cancel();
                                                }
                                                org.telegram.ui.Cells.t2 t2Var = fvVar3.H;
                                                if (t2Var != null) {
                                                    t2Var.removeCallbacks(fvVar3.d0);
                                                }
                                                fvVar3.x = 0.0f;
                                                fvVar3.y = false;
                                                fvVar3.e0 = false;
                                                vwVar.n.f(0.0f);
                                                vwVar.n.I = vwVar.a;
                                                z10 = z14;
                                            }
                                        } else {
                                            if (wwVar.d3 == 0) {
                                                wwVar.d3 = System.currentTimeMillis();
                                            }
                                            if (vwVar.w == 2 && (fvVar = vwVar.n) != null) {
                                                fvVar.h();
                                            }
                                            if (z9 && !wwVar.F3.c() && !wwVar.R) {
                                                L2 += org.telegram.messenger.g0.L(81.0f);
                                            }
                                            float top2 = ((m13.getTop() - L2) / m13.getMeasuredHeight()) + f10;
                                            if (top2 > f10) {
                                                top2 = f10;
                                            }
                                            boolean z16 = z9;
                                            boolean z17 = top2 > 0.85f && System.currentTimeMillis() - wwVar.d3 > 220;
                                            if (wwVar.f3 != z17) {
                                                wwVar.f3 = z17;
                                                if (vwVar.w == 2) {
                                                    try {
                                                        vwVar.a.performHapticFeedback(3, 2);
                                                    } catch (Exception unused) {
                                                    }
                                                    fv fvVar4 = vwVar.n;
                                                    if (fvVar4 != null) {
                                                        fvVar4.a(z17);
                                                    }
                                                }
                                            }
                                            if (vwVar.w == 2 && i13 - o03 != 0 && i7 < 0 && z11) {
                                                vwVar.a.setViewsOffset(org.telegram.ui.Cells.f1.x(i7, 0.2f, f10 - (vwVar.a.getViewOffset() / org.telegram.messenger.g0.L(72.0f)), vwVar.a.getViewOffset()));
                                            }
                                            fv fvVar5 = vwVar.n;
                                            z10 = z16;
                                            if (fvVar5 != null) {
                                                fvVar5.f(top2);
                                                vwVar.n.I = vwVar.a;
                                                z10 = z16;
                                            }
                                        }
                                        if (m13 != null) {
                                            m13.invalidate();
                                        }
                                        if (vwVar.w == 1 && o03 == 0 && i7 < 0 && z11 && !wwVar.F3.c() && z10 && wwVar.u3 == 0.0f) {
                                            ww.u1(wwVar, vwVar, wwVar.T - (org.telegram.messenger.g0.T1(0.2f, 0.5f, wwVar.E0.n0) * i7));
                                        }
                                        return o03;
                                    }
                                }
                            } else {
                                f10 = 1.0f;
                            }
                            i13 = i7;
                            if (vwVar.s == 0) {
                            }
                            if (vwVar.s == 0) {
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
                        vwVar.a.setOverScrollMode(0);
                        L0 = vwVar.c.L0();
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
                vwVar.a.setOverScrollMode(0);
                L0 = vwVar.c.L0();
                if (L0 == 0) {
                }
                i12 = 1;
                if (!z11) {
                }
            }
            z9 = false;
            int paddingTop2 = vwVar.a.getPaddingTop();
            if (z9) {
            }
            if (!wwVar.R) {
                org.telegram.messenger.qp messagesController2 = wwVar.getMessagesController();
                messagesController2.getClass();
                if (org.telegram.messenger.iz.q1) {
                }
            }
            i10 = paddingTop2;
            i11 = 0;
            if (i11 == 0) {
            }
            f10 = 1.0f;
            vwVar.a.setOverScrollMode(0);
            L0 = vwVar.c.L0();
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
