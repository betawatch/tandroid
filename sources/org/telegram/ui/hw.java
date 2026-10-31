package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class hw extends s4.a0 {
    public boolean I;
    public boolean J;
    public ValueAnimator K;
    public final /* synthetic */ zx L;
    public final /* synthetic */ ay M;

    public hw(ay ayVar, zx zxVar) {
        this.M = ayVar;
        this.L = zxVar;
    }

    @Override // s4.a0
    public final int R0() {
        zx zxVar = this.L;
        return (zxVar.s == 0 && this.M.k4() && zxVar.w == 2) ? 1 : 0;
    }

    @Override // s4.a0, s4.n0
    public final void b0(hf.e eVar, s4.z0 z0Var) {
        boolean z10 = org.telegram.messenger.v2.a;
        try {
            super.b0(eVar, z0Var);
        } catch (IndexOutOfBoundsException e) {
            org.telegram.messenger.f8.g(e, true);
            org.telegram.messenger.i0.g3(new gw(this.L, 0));
        }
    }

    @Override // s4.a0
    public final void b1(View view, View view2, int i10, int i11) {
        this.I = true;
        super.b1(view, view2, i10, i11);
        this.I = false;
    }

    @Override // s4.n0
    public final void f0() {
        ValueAnimator valueAnimator = this.K;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.K.cancel();
        }
        zx zxVar = this.L;
        if (zxVar.a.getScrollState() != 1) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.M.T, 0.0f);
            this.K = ofFloat;
            ofFloat.addUpdateListener(new ag.p2(21, this, zxVar));
            this.K.addListener(new org.telegram.ui.Components.voip.h2(this, 5));
            this.K.setDuration(200L);
            this.K.setInterpolator(org.telegram.ui.Components.gr.f);
            this.K.start();
        }
    }

    @Override // s4.a0
    public final void h1(int i10, int i11) {
        if (this.I) {
            i11 -= this.L.a.getPaddingTop();
        }
        super.h1(i10, i11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        if (org.telegram.ui.ay.u1(r4, r6) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        if (r11.u() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x0184, code lost:
    
        if (r8.u() == false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x01da, code lost:
    
        if (r8.u() == false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x0261, code lost:
    
        if (r5 > (-1)) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0076, code lost:
    
        if (r11.u() == false) goto L38;
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
    @Override // s4.a0, s4.n0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int o0(int i10, hf.e eVar, s4.z0 z0Var) {
        boolean z10;
        int i11;
        int i12;
        float f7;
        int L0;
        int i13;
        int i14;
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        org.telegram.ui.ActionBar.l lVar3;
        org.telegram.ui.ActionBar.l lVar4;
        int i15;
        int L;
        View m10;
        int o02;
        boolean z11;
        kw kwVar;
        float viewOffset;
        float f10;
        org.telegram.ui.ActionBar.l lVar5;
        org.telegram.ui.ActionBar.l lVar6;
        org.telegram.ui.ActionBar.l lVar7;
        org.telegram.ui.ActionBar.l lVar8;
        ay ayVar = this.M;
        UndoView[] undoViewArr = ayVar.y0;
        zx zxVar = this.L;
        wx wxVar = zxVar.a;
        int i16 = 0;
        if (!wxVar.V1) {
            boolean z12 = wxVar.getScrollState() == 1;
            if (z12 != this.J) {
                this.J = z12;
                if (!z12) {
                }
            }
            float f11 = 0.0f;
            if (i10 > 0 && ayVar.T != 0.0f) {
                lVar7 = ((org.telegram.ui.ActionBar.k2) ayVar).actionBar;
                if (lVar7 != null) {
                    lVar8 = ((org.telegram.ui.ActionBar.k2) ayVar).actionBar;
                }
                float f12 = ayVar.T - i10;
                if (f12 < 0.0f) {
                    i16 = (int) (-f12);
                } else {
                    f11 = f12;
                }
                ay.t1(ayVar, zxVar, f11);
                return super.o0(i16, eVar, z0Var);
            }
            if (ayVar.K && ayVar.Y2 == 0) {
                lVar5 = ((org.telegram.ui.ActionBar.k2) ayVar).actionBar;
                if (lVar5 != null) {
                    lVar6 = ((org.telegram.ui.ActionBar.k2) ayVar).actionBar;
                }
                z10 = true;
                int paddingTop = zxVar.a.getPaddingTop();
                int L2 = (z10 || ayVar.F3.c() || ayVar.R) ? paddingTop : paddingTop - org.telegram.messenger.i0.L(81.0f);
                if (!ayVar.R && zxVar.s == 0 && !ayVar.l2 && ayVar.W2 == 0 && ayVar.Y2 == 0) {
                    org.telegram.messenger.vp messagesController = ayVar.getMessagesController();
                    messagesController.getClass();
                    if (org.telegram.messenger.tz.q1) {
                        i11 = paddingTop;
                        if (messagesController.Q.f(1 | 2305843009213693952L) != null && zxVar.w == 2) {
                            i12 = 1;
                            if ((i12 == 0 || (z10 && !ayVar.F3.c())) && i10 < 0) {
                                f7 = 1.0f;
                                zxVar.a.setOverScrollMode(0);
                                L0 = zxVar.c.L0();
                                if (L0 == 0 || (m10 = zxVar.c.m(L0)) == null) {
                                    i13 = 1;
                                } else {
                                    char c10 = 1;
                                    i13 = c10;
                                    if (m10.getBottom() - L2 <= org.telegram.messenger.i0.L(1.0f)) {
                                        L0 = 1;
                                        i13 = c10;
                                    }
                                }
                                if (!z12) {
                                    if (L0 == 0 && i12 != 0) {
                                        View m11 = zxVar.c.m(L0);
                                        float top = ((m11.getTop() - i11) / m11.getMeasuredHeight()) + 1.0f;
                                        if (top > 1.0f) {
                                            top = 1.0f;
                                        }
                                        zxVar.a.setOverScrollMode(2);
                                        int D = (int) c3.i0.D(top, 0.25f, 0.45f, i10);
                                        r8 = D <= -1 ? D : -1;
                                        UndoView undoView = undoViewArr[0];
                                        if (undoView != null && undoView.getVisibility() == 0) {
                                            boolean z13 = i13;
                                            undoViewArr[0].d(z13 ? 1 : 0, z13);
                                        }
                                    } else if (((L0 == i13 && i12 != 0) || L0 == 0) && z10 && z12 && !ayVar.F3.c()) {
                                        if (ayVar.N == 0.0f) {
                                            zxVar.a.setOverScrollMode(0);
                                        } else {
                                            zxVar.a.setOverScrollMode(2);
                                        }
                                        i14 = (int) (i10 * 0.3f);
                                    }
                                    i14 = r8;
                                    if (zxVar.s == 0) {
                                        viewOffset = ((int) zxVar.a.getViewOffset()) - i10;
                                        if (viewOffset >= 0.0f) {
                                        }
                                        zxVar.a.setViewsOffset(f10);
                                    }
                                    if (zxVar.s == 0) {
                                    }
                                    boolean z14 = z10;
                                    o02 = super.o0(i14, eVar, z0Var);
                                    if (o02 == 0) {
                                        ay.t1(ayVar, zxVar, ayVar.T - (ayVar.E0.getOverScrollCoef() * i10));
                                    }
                                    return o02;
                                }
                                View m12 = zxVar.c.m(L0);
                                if (m12 != null && L0 < 10) {
                                    int i17 = 0;
                                    while (i12 < L0) {
                                        lw lwVar = zxVar.d;
                                        if (((zf.k) lwVar.M.get(i12)).a == 0) {
                                            if (!((zf.k) lwVar.M.get(i12)).f || lwVar.J) {
                                                L = org.telegram.messenger.i0.L(org.telegram.messenger.tz.p1 ? 76.0f : 70.0f);
                                            } else {
                                                L = org.telegram.messenger.i0.L(org.telegram.messenger.tz.p1 ? 86.0f : 91.0f);
                                            }
                                            i15 = L + 1;
                                        } else {
                                            i15 = 0;
                                        }
                                        i17 += i15;
                                        i12++;
                                    }
                                    int i18 = (-(m12.getTop() - L2)) + i17;
                                    if (!ayVar.F3.c()) {
                                        lVar3 = ((org.telegram.ui.ActionBar.k2) ayVar).actionBar;
                                        if (lVar3 != null) {
                                            lVar4 = ((org.telegram.ui.ActionBar.k2) ayVar).actionBar;
                                        }
                                        i18 -= org.telegram.messenger.i0.L(48.0f);
                                    }
                                    if (z10 && ((((ValueAnimator) zxVar.b.c) != null || ayVar.E0.g()) && !ayVar.F3.c() && !ayVar.R)) {
                                        i18 += org.telegram.messenger.i0.L(81.0f);
                                    }
                                    if ((((ValueAnimator) zxVar.b.c) != null || ayVar.E0.g()) && !ayVar.F3.c() && !ayVar.R) {
                                        lVar = ((org.telegram.ui.ActionBar.k2) ayVar).actionBar;
                                        if (lVar != null) {
                                            lVar2 = ((org.telegram.ui.ActionBar.k2) ayVar).actionBar;
                                        }
                                        i18 += org.telegram.messenger.i0.L(48.0f);
                                    }
                                    if (i18 < Math.abs(i10)) {
                                        i14 = -i18;
                                        if (zxVar.s == 0 && zxVar.a.getViewOffset() != 0.0f && i10 > 0 && z12) {
                                            viewOffset = ((int) zxVar.a.getViewOffset()) - i10;
                                            if (viewOffset >= 0.0f) {
                                                i14 = (int) viewOffset;
                                                f10 = 0.0f;
                                            } else {
                                                f10 = viewOffset;
                                                i14 = 0;
                                            }
                                            zxVar.a.setViewsOffset(f10);
                                        }
                                        if (zxVar.s == 0 || zxVar.w == 0 || !ayVar.k4() || ayVar.R) {
                                            boolean z142 = z10;
                                            o02 = super.o0(i14, eVar, z0Var);
                                            if (o02 == 0 && i10 < 0 && z12 && !ayVar.F3.c() && z142 && ayVar.u3 == 0.0f) {
                                                ay.t1(ayVar, zxVar, ayVar.T - (ayVar.E0.getOverScrollCoef() * i10));
                                            }
                                            return o02;
                                        }
                                        int o03 = super.o0(i14, eVar, z0Var);
                                        kw kwVar2 = zxVar.n;
                                        if (kwVar2 != null) {
                                            kwVar2.a = o03;
                                        }
                                        int L02 = zxVar.c.L0();
                                        View m13 = L02 == 0 ? zxVar.c.m(L02) : null;
                                        if (L02 != 0 || m13 == null || m13.getBottom() - L2 < org.telegram.messenger.i0.L(4.0f)) {
                                            boolean z15 = z10;
                                            ayVar.d3 = 0L;
                                            ayVar.f3 = false;
                                            boolean z16 = zxVar.w != 2;
                                            zxVar.w = 2;
                                            if (z16 && org.telegram.messenger.i0.C1()) {
                                                org.telegram.messenger.i0.i2(org.telegram.messenger.cd.L0(2131754924, null));
                                            }
                                            kw kwVar3 = zxVar.n;
                                            z11 = z15;
                                            if (kwVar3 != null) {
                                                ValueAnimator valueAnimator = kwVar3.z;
                                                if (valueAnimator != null) {
                                                    valueAnimator.cancel();
                                                }
                                                org.telegram.ui.Cells.v2 v2Var = kwVar3.H;
                                                if (v2Var != null) {
                                                    v2Var.removeCallbacks(kwVar3.d0);
                                                }
                                                kwVar3.x = 0.0f;
                                                kwVar3.y = false;
                                                kwVar3.e0 = false;
                                                zxVar.n.f(0.0f);
                                                zxVar.n.I = zxVar.a;
                                                z11 = z15;
                                            }
                                        } else {
                                            if (ayVar.d3 == 0) {
                                                ayVar.d3 = System.currentTimeMillis();
                                            }
                                            if (zxVar.w == 2 && (kwVar = zxVar.n) != null) {
                                                kwVar.h();
                                            }
                                            if (z10 && !ayVar.F3.c() && !ayVar.R) {
                                                L2 += org.telegram.messenger.i0.L(81.0f);
                                            }
                                            float top2 = ((m13.getTop() - L2) / m13.getMeasuredHeight()) + f7;
                                            if (top2 > f7) {
                                                top2 = f7;
                                            }
                                            boolean z17 = z10;
                                            boolean z18 = top2 > 0.85f && System.currentTimeMillis() - ayVar.d3 > 220;
                                            if (ayVar.f3 != z18) {
                                                ayVar.f3 = z18;
                                                if (zxVar.w == 2) {
                                                    try {
                                                        zxVar.a.performHapticFeedback(3, 2);
                                                    } catch (Exception unused) {
                                                    }
                                                    kw kwVar4 = zxVar.n;
                                                    if (kwVar4 != null) {
                                                        kwVar4.a(z18);
                                                    }
                                                }
                                            }
                                            if (zxVar.w == 2 && i14 - o03 != 0 && i10 < 0 && z12) {
                                                zxVar.a.setViewsOffset(org.telegram.ui.Cells.f1.x(i10, 0.2f, f7 - (zxVar.a.getViewOffset() / org.telegram.messenger.i0.L(72.0f)), zxVar.a.getViewOffset()));
                                            }
                                            kw kwVar5 = zxVar.n;
                                            z11 = z17;
                                            if (kwVar5 != null) {
                                                kwVar5.f(top2);
                                                zxVar.n.I = zxVar.a;
                                                z11 = z17;
                                            }
                                        }
                                        if (m13 != null) {
                                            m13.invalidate();
                                        }
                                        if (zxVar.w == 1 && o03 == 0 && i10 < 0 && z12 && !ayVar.F3.c() && z11 && ayVar.u3 == 0.0f) {
                                            ay.t1(ayVar, zxVar, ayVar.T - (org.telegram.messenger.i0.T1(0.2f, 0.5f, ayVar.E0.n0) * i10));
                                        }
                                        return o03;
                                    }
                                }
                            } else {
                                f7 = 1.0f;
                            }
                            i14 = i10;
                            if (zxVar.s == 0) {
                            }
                            if (zxVar.s == 0) {
                            }
                            boolean z1422 = z10;
                            o02 = super.o0(i14, eVar, z0Var);
                            if (o02 == 0) {
                            }
                            return o02;
                        }
                        i12 = 0;
                        if (i12 == 0) {
                        }
                        f7 = 1.0f;
                        zxVar.a.setOverScrollMode(0);
                        L0 = zxVar.c.L0();
                        if (L0 == 0) {
                        }
                        i13 = 1;
                        if (!z12) {
                        }
                    }
                }
                i11 = paddingTop;
                i12 = 0;
                if (i12 == 0) {
                }
                f7 = 1.0f;
                zxVar.a.setOverScrollMode(0);
                L0 = zxVar.c.L0();
                if (L0 == 0) {
                }
                i13 = 1;
                if (!z12) {
                }
            }
            z10 = false;
            int paddingTop2 = zxVar.a.getPaddingTop();
            if (z10) {
            }
            if (!ayVar.R) {
                org.telegram.messenger.vp messagesController2 = ayVar.getMessagesController();
                messagesController2.getClass();
                if (org.telegram.messenger.tz.q1) {
                }
            }
            i11 = paddingTop2;
            i12 = 0;
            if (i12 == 0) {
            }
            f7 = 1.0f;
            zxVar.a.setOverScrollMode(0);
            L0 = zxVar.c.L0();
            if (L0 == 0) {
            }
            i13 = 1;
            if (!z12) {
            }
        }
        return 0;
    }

    @Override // s4.a0, s4.n0
    public final void v0(RecyclerView recyclerView, s4.z0 z0Var, int i10) {
        if (this.M.k4() && i10 == 1) {
            super.v0(recyclerView, z0Var, i10);
            return;
        }
        ci.p pVar = new ci.p(recyclerView.getContext(), 0);
        pVar.a = i10;
        w0(pVar);
    }
}
