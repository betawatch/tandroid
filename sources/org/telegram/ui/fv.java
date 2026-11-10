package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class fv extends v4.b0 {
    public boolean I;
    public boolean J;
    public ValueAnimator K;
    public final /* synthetic */ yw L;
    public final /* synthetic */ zw M;

    public fv(zw zwVar, yw ywVar) {
        this.M = zwVar;
        this.L = ywVar;
    }

    @Override // v4.b0
    public final int R0() {
        yw ywVar = this.L;
        return (ywVar.s == 0 && this.M.l4() && ywVar.w == 2) ? 1 : 0;
    }

    @Override // v4.b0, v4.n0
    public final void b0(v4.v0 v0Var, v4.a1 a1Var) {
        boolean z9 = org.telegram.messenger.r2.a;
        try {
            super.b0(v0Var, a1Var);
        } catch (IndexOutOfBoundsException e10) {
            org.telegram.messenger.a8.g(e10, true);
            org.telegram.messenger.g0.h3(new ev(this.L, 0));
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
        yw ywVar = this.L;
        if (ywVar.a.getScrollState() != 1) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.M.T, 0.0f);
            this.K = ofFloat;
            ofFloat.addUpdateListener(new bi.de(22, this, ywVar));
            this.K.addListener(new va(this, 24));
            this.K.setDuration(200L);
            this.K.setInterpolator(org.telegram.ui.Components.wq.f);
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
    
        if (org.telegram.ui.zw.v1(r4, r6) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        if (r11.x() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x0184, code lost:
    
        if (r8.x() == false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x01da, code lost:
    
        if (r8.x() == false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x0261, code lost:
    
        if (r5 > (-1)) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0076, code lost:
    
        if (r11.x() == false) goto L38;
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
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        org.telegram.ui.ActionBar.l lVar3;
        org.telegram.ui.ActionBar.l lVar4;
        int i14;
        int L;
        View m10;
        int o02;
        boolean z10;
        iv ivVar;
        float viewOffset;
        float f11;
        org.telegram.ui.ActionBar.l lVar5;
        org.telegram.ui.ActionBar.l lVar6;
        org.telegram.ui.ActionBar.l lVar7;
        org.telegram.ui.ActionBar.l lVar8;
        zw zwVar = this.M;
        UndoView[] undoViewArr = zwVar.y0;
        yw ywVar = this.L;
        vw vwVar = ywVar.a;
        int i15 = 0;
        if (!vwVar.V1) {
            boolean z11 = vwVar.getScrollState() == 1;
            if (z11 != this.J) {
                this.J = z11;
                if (!z11) {
                }
            }
            float f12 = 0.0f;
            if (i7 > 0 && zwVar.T != 0.0f) {
                lVar7 = ((org.telegram.ui.ActionBar.f2) zwVar).actionBar;
                if (lVar7 != null) {
                    lVar8 = ((org.telegram.ui.ActionBar.f2) zwVar).actionBar;
                }
                float f13 = zwVar.T - i7;
                if (f13 < 0.0f) {
                    i15 = (int) (-f13);
                } else {
                    f12 = f13;
                }
                zw.u1(zwVar, ywVar, f12);
                return super.o0(i15, v0Var, a1Var);
            }
            if (zwVar.K && zwVar.Z2 == 0) {
                lVar5 = ((org.telegram.ui.ActionBar.f2) zwVar).actionBar;
                if (lVar5 != null) {
                    lVar6 = ((org.telegram.ui.ActionBar.f2) zwVar).actionBar;
                }
                z9 = true;
                int paddingTop = ywVar.a.getPaddingTop();
                int L2 = (z9 || zwVar.G3.c() || zwVar.R) ? paddingTop : paddingTop - org.telegram.messenger.g0.L(81.0f);
                if (!zwVar.R && ywVar.s == 0 && !zwVar.m2 && zwVar.X2 == 0 && zwVar.Z2 == 0) {
                    org.telegram.messenger.qp messagesController = zwVar.getMessagesController();
                    messagesController.getClass();
                    if (org.telegram.messenger.iz.q1) {
                        i10 = paddingTop;
                        if (messagesController.Q.f(1 | 2305843009213693952L) != null && ywVar.w == 2) {
                            i11 = 1;
                            if ((i11 == 0 || (z9 && !zwVar.G3.c())) && i7 < 0) {
                                f10 = 1.0f;
                                ywVar.a.setOverScrollMode(0);
                                L0 = ywVar.c.L0();
                                if (L0 == 0 || (m10 = ywVar.c.m(L0)) == null) {
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
                                        View m11 = ywVar.c.m(L0);
                                        float top = ((m11.getTop() - i10) / m11.getMeasuredHeight()) + 1.0f;
                                        if (top > 1.0f) {
                                            top = 1.0f;
                                        }
                                        ywVar.a.setOverScrollMode(2);
                                        int C = (int) com.google.android.recaptcha.internal.a.C(top, 0.25f, 0.45f, i7);
                                        r8 = C <= -1 ? C : -1;
                                        UndoView undoView = undoViewArr[0];
                                        if (undoView != null && undoView.getVisibility() == 0) {
                                            boolean z12 = i12;
                                            undoViewArr[0].d(z12 ? 1 : 0, z12);
                                        }
                                    } else if (((L0 == i12 && i11 != 0) || L0 == 0) && z9 && z11 && !zwVar.G3.c()) {
                                        if (zwVar.N == 0.0f) {
                                            ywVar.a.setOverScrollMode(0);
                                        } else {
                                            ywVar.a.setOverScrollMode(2);
                                        }
                                        i13 = (int) (i7 * 0.3f);
                                    }
                                    i13 = r8;
                                    if (ywVar.s == 0) {
                                        viewOffset = ((int) ywVar.a.getViewOffset()) - i7;
                                        if (viewOffset >= 0.0f) {
                                        }
                                        ywVar.a.setViewsOffset(f11);
                                    }
                                    if (ywVar.s == 0) {
                                    }
                                    boolean z13 = z9;
                                    o02 = super.o0(i13, v0Var, a1Var);
                                    if (o02 == 0) {
                                        zw.u1(zwVar, ywVar, zwVar.T - (zwVar.E0.getOverScrollCoef() * i7));
                                    }
                                    return o02;
                                }
                                View m12 = ywVar.c.m(L0);
                                if (m12 != null && L0 < 10) {
                                    int i16 = 0;
                                    while (i11 < L0) {
                                        jv jvVar = ywVar.d;
                                        if (((jg.l) jvVar.M.get(i11)).a == 0) {
                                            if (!((jg.l) jvVar.M.get(i11)).f || jvVar.J) {
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
                                    if (!zwVar.G3.c()) {
                                        lVar3 = ((org.telegram.ui.ActionBar.f2) zwVar).actionBar;
                                        if (lVar3 != null) {
                                            lVar4 = ((org.telegram.ui.ActionBar.f2) zwVar).actionBar;
                                        }
                                        i17 -= org.telegram.messenger.g0.L(48.0f);
                                    }
                                    if (z9 && ((((ValueAnimator) ywVar.b.c) != null || zwVar.E0.g()) && !zwVar.G3.c() && !zwVar.R)) {
                                        i17 += org.telegram.messenger.g0.L(81.0f);
                                    }
                                    if ((((ValueAnimator) ywVar.b.c) != null || zwVar.E0.g()) && !zwVar.G3.c() && !zwVar.R) {
                                        lVar = ((org.telegram.ui.ActionBar.f2) zwVar).actionBar;
                                        if (lVar != null) {
                                            lVar2 = ((org.telegram.ui.ActionBar.f2) zwVar).actionBar;
                                        }
                                        i17 += org.telegram.messenger.g0.L(48.0f);
                                    }
                                    if (i17 < Math.abs(i7)) {
                                        i13 = -i17;
                                        if (ywVar.s == 0 && ywVar.a.getViewOffset() != 0.0f && i7 > 0 && z11) {
                                            viewOffset = ((int) ywVar.a.getViewOffset()) - i7;
                                            if (viewOffset >= 0.0f) {
                                                i13 = (int) viewOffset;
                                                f11 = 0.0f;
                                            } else {
                                                f11 = viewOffset;
                                                i13 = 0;
                                            }
                                            ywVar.a.setViewsOffset(f11);
                                        }
                                        if (ywVar.s == 0 || ywVar.w == 0 || !zwVar.l4() || zwVar.R) {
                                            boolean z132 = z9;
                                            o02 = super.o0(i13, v0Var, a1Var);
                                            if (o02 == 0 && i7 < 0 && z11 && !zwVar.G3.c() && z132 && zwVar.v3 == 0.0f) {
                                                zw.u1(zwVar, ywVar, zwVar.T - (zwVar.E0.getOverScrollCoef() * i7));
                                            }
                                            return o02;
                                        }
                                        int o03 = super.o0(i13, v0Var, a1Var);
                                        iv ivVar2 = ywVar.n;
                                        if (ivVar2 != null) {
                                            ivVar2.a = o03;
                                        }
                                        int L02 = ywVar.c.L0();
                                        View m13 = L02 == 0 ? ywVar.c.m(L02) : null;
                                        if (L02 != 0 || m13 == null || m13.getBottom() - L2 < org.telegram.messenger.g0.L(4.0f)) {
                                            boolean z14 = z9;
                                            zwVar.e3 = 0L;
                                            zwVar.g3 = false;
                                            boolean z15 = ywVar.w != 2;
                                            ywVar.w = 2;
                                            if (z15 && org.telegram.messenger.g0.C1()) {
                                                org.telegram.messenger.g0.i2(org.telegram.messenger.id.M0(2131754924, null));
                                            }
                                            iv ivVar3 = ywVar.n;
                                            z10 = z14;
                                            if (ivVar3 != null) {
                                                ValueAnimator valueAnimator = ivVar3.z;
                                                if (valueAnimator != null) {
                                                    valueAnimator.cancel();
                                                }
                                                org.telegram.ui.Cells.t2 t2Var = ivVar3.H;
                                                if (t2Var != null) {
                                                    t2Var.removeCallbacks(ivVar3.d0);
                                                }
                                                ivVar3.x = 0.0f;
                                                ivVar3.y = false;
                                                ivVar3.e0 = false;
                                                ywVar.n.f(0.0f);
                                                ywVar.n.I = ywVar.a;
                                                z10 = z14;
                                            }
                                        } else {
                                            if (zwVar.e3 == 0) {
                                                zwVar.e3 = System.currentTimeMillis();
                                            }
                                            if (ywVar.w == 2 && (ivVar = ywVar.n) != null) {
                                                ivVar.h();
                                            }
                                            if (z9 && !zwVar.G3.c() && !zwVar.R) {
                                                L2 += org.telegram.messenger.g0.L(81.0f);
                                            }
                                            float top2 = ((m13.getTop() - L2) / m13.getMeasuredHeight()) + f10;
                                            if (top2 > f10) {
                                                top2 = f10;
                                            }
                                            boolean z16 = z9;
                                            boolean z17 = top2 > 0.85f && System.currentTimeMillis() - zwVar.e3 > 220;
                                            if (zwVar.g3 != z17) {
                                                zwVar.g3 = z17;
                                                if (ywVar.w == 2) {
                                                    try {
                                                        ywVar.a.performHapticFeedback(3, 2);
                                                    } catch (Exception unused) {
                                                    }
                                                    iv ivVar4 = ywVar.n;
                                                    if (ivVar4 != null) {
                                                        ivVar4.a(z17);
                                                    }
                                                }
                                            }
                                            if (ywVar.w == 2 && i13 - o03 != 0 && i7 < 0 && z11) {
                                                ywVar.a.setViewsOffset(org.telegram.ui.Cells.f1.x(i7, 0.2f, f10 - (ywVar.a.getViewOffset() / org.telegram.messenger.g0.L(72.0f)), ywVar.a.getViewOffset()));
                                            }
                                            iv ivVar5 = ywVar.n;
                                            z10 = z16;
                                            if (ivVar5 != null) {
                                                ivVar5.f(top2);
                                                ywVar.n.I = ywVar.a;
                                                z10 = z16;
                                            }
                                        }
                                        if (m13 != null) {
                                            m13.invalidate();
                                        }
                                        if (ywVar.w == 1 && o03 == 0 && i7 < 0 && z11 && !zwVar.G3.c() && z10 && zwVar.v3 == 0.0f) {
                                            zw.u1(zwVar, ywVar, zwVar.T - (org.telegram.messenger.g0.T1(0.2f, 0.5f, zwVar.E0.n0) * i7));
                                        }
                                        return o03;
                                    }
                                }
                            } else {
                                f10 = 1.0f;
                            }
                            i13 = i7;
                            if (ywVar.s == 0) {
                            }
                            if (ywVar.s == 0) {
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
                        ywVar.a.setOverScrollMode(0);
                        L0 = ywVar.c.L0();
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
                ywVar.a.setOverScrollMode(0);
                L0 = ywVar.c.L0();
                if (L0 == 0) {
                }
                i12 = 1;
                if (!z11) {
                }
            }
            z9 = false;
            int paddingTop2 = ywVar.a.getPaddingTop();
            if (z9) {
            }
            if (!zwVar.R) {
                org.telegram.messenger.qp messagesController2 = zwVar.getMessagesController();
                messagesController2.getClass();
                if (org.telegram.messenger.iz.q1) {
                }
            }
            i10 = paddingTop2;
            i11 = 0;
            if (i11 == 0) {
            }
            f10 = 1.0f;
            ywVar.a.setOverScrollMode(0);
            L0 = ywVar.c.L0();
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
