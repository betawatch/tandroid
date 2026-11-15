package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class dv extends v4.b0 {
    public boolean I;
    public boolean J;
    public ValueAnimator K;
    public final /* synthetic */ xw L;
    public final /* synthetic */ yw M;

    public dv(yw ywVar, xw xwVar) {
        this.M = ywVar;
        this.L = xwVar;
    }

    @Override // v4.b0
    public final int R0() {
        xw xwVar = this.L;
        return (xwVar.s == 0 && this.M.l4() && xwVar.w == 2) ? 1 : 0;
    }

    @Override // v4.b0, v4.o0
    public final void b0(v4.w0 w0Var, v4.b1 b1Var) {
        boolean z10 = org.telegram.messenger.r2.a;
        try {
            super.b0(w0Var, b1Var);
        } catch (IndexOutOfBoundsException e10) {
            org.telegram.messenger.a8.g(e10, true);
            org.telegram.messenger.g0.h3(new cv(this.L, 0));
        }
    }

    @Override // v4.b0
    public final void b1(View view, View view2, int i7, int i10) {
        this.I = true;
        super.b1(view, view2, i7, i10);
        this.I = false;
    }

    @Override // v4.o0
    public final void f0() {
        ValueAnimator valueAnimator = this.K;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.K.cancel();
        }
        xw xwVar = this.L;
        if (xwVar.a.getScrollState() != 1) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.M.U, 0.0f);
            this.K = ofFloat;
            ofFloat.addUpdateListener(new ch.v(21, this, xwVar));
            this.K.addListener(new org.telegram.ui.Cells.w9(this, 25));
            this.K.setDuration(200L);
            this.K.setInterpolator(org.telegram.ui.Components.er.f);
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
    @Override // v4.b0, v4.o0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int o0(int i7, v4.w0 w0Var, v4.b1 b1Var) {
        boolean z10;
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
        boolean z11;
        gv gvVar;
        float viewOffset;
        float f11;
        org.telegram.ui.ActionBar.k kVar5;
        org.telegram.ui.ActionBar.k kVar6;
        org.telegram.ui.ActionBar.k kVar7;
        org.telegram.ui.ActionBar.k kVar8;
        yw ywVar = this.M;
        UndoView[] undoViewArr = ywVar.z0;
        xw xwVar = this.L;
        uw uwVar = xwVar.a;
        int i15 = 0;
        if (!uwVar.W1) {
            boolean z12 = uwVar.getScrollState() == 1;
            if (z12 != this.J) {
                this.J = z12;
                if (!z12) {
                }
            }
            float f12 = 0.0f;
            if (i7 > 0 && ywVar.U != 0.0f) {
                kVar7 = ((org.telegram.ui.ActionBar.e2) ywVar).actionBar;
                if (kVar7 != null) {
                    kVar8 = ((org.telegram.ui.ActionBar.e2) ywVar).actionBar;
                }
                float f13 = ywVar.U - i7;
                if (f13 < 0.0f) {
                    i15 = (int) (-f13);
                } else {
                    f12 = f13;
                }
                yw.u1(ywVar, xwVar, f12);
                return super.o0(i15, w0Var, b1Var);
            }
            if (ywVar.L && ywVar.a3 == 0) {
                kVar5 = ((org.telegram.ui.ActionBar.e2) ywVar).actionBar;
                if (kVar5 != null) {
                    kVar6 = ((org.telegram.ui.ActionBar.e2) ywVar).actionBar;
                }
                z10 = true;
                int paddingTop = xwVar.a.getPaddingTop();
                int L2 = (z10 || ywVar.H3.c() || ywVar.S) ? paddingTop : paddingTop - org.telegram.messenger.g0.L(81.0f);
                if (!ywVar.S && xwVar.s == 0 && !ywVar.n2 && ywVar.Y2 == 0 && ywVar.a3 == 0) {
                    org.telegram.messenger.np messagesController = ywVar.getMessagesController();
                    messagesController.getClass();
                    if (org.telegram.messenger.gz.q1) {
                        i10 = paddingTop;
                        if (messagesController.R.f(1 | 2305843009213693952L) != null && xwVar.w == 2) {
                            i11 = 1;
                            if ((i11 == 0 || (z10 && !ywVar.H3.c())) && i7 < 0) {
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
                                if (!z12) {
                                    if (L0 == 0 && i11 != 0) {
                                        View m11 = xwVar.c.m(L0);
                                        float top = ((m11.getTop() - i10) / m11.getMeasuredHeight()) + 1.0f;
                                        if (top > 1.0f) {
                                            top = 1.0f;
                                        }
                                        xwVar.a.setOverScrollMode(2);
                                        int C = (int) com.google.android.gms.internal.vision.e2.C(top, 0.25f, 0.45f, i7);
                                        r8 = C <= -1 ? C : -1;
                                        UndoView undoView = undoViewArr[0];
                                        if (undoView != null && undoView.getVisibility() == 0) {
                                            boolean z13 = i12;
                                            undoViewArr[0].d(z13 ? 1 : 0, z13);
                                        }
                                    } else if (((L0 == i12 && i11 != 0) || L0 == 0) && z10 && z12 && !ywVar.H3.c()) {
                                        if (ywVar.O == 0.0f) {
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
                                    boolean z14 = z10;
                                    o02 = super.o0(i13, w0Var, b1Var);
                                    if (o02 == 0) {
                                        yw.u1(ywVar, xwVar, ywVar.U - (ywVar.F0.getOverScrollCoef() * i7));
                                    }
                                    return o02;
                                }
                                View m12 = xwVar.c.m(L0);
                                if (m12 != null && L0 < 10) {
                                    int i16 = 0;
                                    while (i11 < L0) {
                                        hv hvVar = xwVar.d;
                                        if (((jg.k) hvVar.N.get(i11)).a == 0) {
                                            if (!((jg.k) hvVar.N.get(i11)).f || hvVar.K) {
                                                L = org.telegram.messenger.g0.L(org.telegram.messenger.gz.p1 ? 76.0f : 70.0f);
                                            } else {
                                                L = org.telegram.messenger.g0.L(org.telegram.messenger.gz.p1 ? 86.0f : 91.0f);
                                            }
                                            i14 = L + 1;
                                        } else {
                                            i14 = 0;
                                        }
                                        i16 += i14;
                                        i11++;
                                    }
                                    int i17 = (-(m12.getTop() - L2)) + i16;
                                    if (!ywVar.H3.c()) {
                                        kVar3 = ((org.telegram.ui.ActionBar.e2) ywVar).actionBar;
                                        if (kVar3 != null) {
                                            kVar4 = ((org.telegram.ui.ActionBar.e2) ywVar).actionBar;
                                        }
                                        i17 -= org.telegram.messenger.g0.L(48.0f);
                                    }
                                    if (z10 && ((((ValueAnimator) xwVar.b.c) != null || ywVar.F0.g()) && !ywVar.H3.c() && !ywVar.S)) {
                                        i17 += org.telegram.messenger.g0.L(81.0f);
                                    }
                                    if ((((ValueAnimator) xwVar.b.c) != null || ywVar.F0.g()) && !ywVar.H3.c() && !ywVar.S) {
                                        kVar = ((org.telegram.ui.ActionBar.e2) ywVar).actionBar;
                                        if (kVar != null) {
                                            kVar2 = ((org.telegram.ui.ActionBar.e2) ywVar).actionBar;
                                        }
                                        i17 += org.telegram.messenger.g0.L(48.0f);
                                    }
                                    if (i17 < Math.abs(i7)) {
                                        i13 = -i17;
                                        if (xwVar.s == 0 && xwVar.a.getViewOffset() != 0.0f && i7 > 0 && z12) {
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
                                        if (xwVar.s == 0 || xwVar.w == 0 || !ywVar.l4() || ywVar.S) {
                                            boolean z142 = z10;
                                            o02 = super.o0(i13, w0Var, b1Var);
                                            if (o02 == 0 && i7 < 0 && z12 && !ywVar.H3.c() && z142 && ywVar.w3 == 0.0f) {
                                                yw.u1(ywVar, xwVar, ywVar.U - (ywVar.F0.getOverScrollCoef() * i7));
                                            }
                                            return o02;
                                        }
                                        int o03 = super.o0(i13, w0Var, b1Var);
                                        gv gvVar2 = xwVar.n;
                                        if (gvVar2 != null) {
                                            gvVar2.a = o03;
                                        }
                                        int L02 = xwVar.c.L0();
                                        View m13 = L02 == 0 ? xwVar.c.m(L02) : null;
                                        if (L02 != 0 || m13 == null || m13.getBottom() - L2 < org.telegram.messenger.g0.L(4.0f)) {
                                            boolean z15 = z10;
                                            ywVar.f3 = 0L;
                                            ywVar.h3 = false;
                                            boolean z16 = xwVar.w != 2;
                                            xwVar.w = 2;
                                            if (z16 && org.telegram.messenger.g0.C1()) {
                                                org.telegram.messenger.g0.i2(org.telegram.messenger.hd.M0(2131754924, null));
                                            }
                                            gv gvVar3 = xwVar.n;
                                            z11 = z15;
                                            if (gvVar3 != null) {
                                                ValueAnimator valueAnimator = gvVar3.z;
                                                if (valueAnimator != null) {
                                                    valueAnimator.cancel();
                                                }
                                                org.telegram.ui.Cells.t2 t2Var = gvVar3.H;
                                                if (t2Var != null) {
                                                    t2Var.removeCallbacks(gvVar3.d0);
                                                }
                                                gvVar3.x = 0.0f;
                                                gvVar3.y = false;
                                                gvVar3.e0 = false;
                                                xwVar.n.f(0.0f);
                                                xwVar.n.I = xwVar.a;
                                                z11 = z15;
                                            }
                                        } else {
                                            if (ywVar.f3 == 0) {
                                                ywVar.f3 = System.currentTimeMillis();
                                            }
                                            if (xwVar.w == 2 && (gvVar = xwVar.n) != null) {
                                                gvVar.h();
                                            }
                                            if (z10 && !ywVar.H3.c() && !ywVar.S) {
                                                L2 += org.telegram.messenger.g0.L(81.0f);
                                            }
                                            float top2 = ((m13.getTop() - L2) / m13.getMeasuredHeight()) + f10;
                                            if (top2 > f10) {
                                                top2 = f10;
                                            }
                                            boolean z17 = z10;
                                            boolean z18 = top2 > 0.85f && System.currentTimeMillis() - ywVar.f3 > 220;
                                            if (ywVar.h3 != z18) {
                                                ywVar.h3 = z18;
                                                if (xwVar.w == 2) {
                                                    try {
                                                        xwVar.a.performHapticFeedback(3, 2);
                                                    } catch (Exception unused) {
                                                    }
                                                    gv gvVar4 = xwVar.n;
                                                    if (gvVar4 != null) {
                                                        gvVar4.a(z18);
                                                    }
                                                }
                                            }
                                            if (xwVar.w == 2 && i13 - o03 != 0 && i7 < 0 && z12) {
                                                xwVar.a.setViewsOffset(org.telegram.ui.Cells.y0.x(i7, 0.2f, f10 - (xwVar.a.getViewOffset() / org.telegram.messenger.g0.L(72.0f)), xwVar.a.getViewOffset()));
                                            }
                                            gv gvVar5 = xwVar.n;
                                            z11 = z17;
                                            if (gvVar5 != null) {
                                                gvVar5.f(top2);
                                                xwVar.n.I = xwVar.a;
                                                z11 = z17;
                                            }
                                        }
                                        if (m13 != null) {
                                            m13.invalidate();
                                        }
                                        if (xwVar.w == 1 && o03 == 0 && i7 < 0 && z12 && !ywVar.H3.c() && z11 && ywVar.w3 == 0.0f) {
                                            yw.u1(ywVar, xwVar, ywVar.U - (org.telegram.messenger.g0.T1(0.2f, 0.5f, ywVar.F0.o0) * i7));
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
                            boolean z1422 = z10;
                            o02 = super.o0(i13, w0Var, b1Var);
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
                        if (!z12) {
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
                if (!z12) {
                }
            }
            z10 = false;
            int paddingTop2 = xwVar.a.getPaddingTop();
            if (z10) {
            }
            if (!ywVar.S) {
                org.telegram.messenger.np messagesController2 = ywVar.getMessagesController();
                messagesController2.getClass();
                if (org.telegram.messenger.gz.q1) {
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
            if (!z12) {
            }
        }
        return 0;
    }

    @Override // v4.b0, v4.o0
    public final void v0(RecyclerView recyclerView, v4.b1 b1Var, int i7) {
        if (this.M.l4() && i7 == 1) {
            super.v0(recyclerView, b1Var, i7);
            return;
        }
        pi.l lVar = new pi.l(recyclerView.getContext(), 0);
        lVar.a = i7;
        w0(lVar);
    }
}
