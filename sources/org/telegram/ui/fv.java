package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class fv extends v4.c0 {
    public boolean I;
    public boolean J;
    public ValueAnimator K;
    public final /* synthetic */ ax L;
    public final /* synthetic */ bx M;

    public fv(bx bxVar, ax axVar) {
        this.M = bxVar;
        this.L = axVar;
    }

    @Override // v4.c0
    public final int R0() {
        ax axVar = this.L;
        return (axVar.s == 0 && this.M.n4() && axVar.w == 2) ? 1 : 0;
    }

    @Override // v4.c0, v4.p0
    public final void b0(v4.x0 x0Var, v4.c1 c1Var) {
        boolean z10 = org.telegram.messenger.s2.a;
        try {
            super.b0(x0Var, c1Var);
        } catch (IndexOutOfBoundsException e10) {
            org.telegram.messenger.a8.g(e10, true);
            org.telegram.messenger.g0.g3(new ev(this.L, 0));
        }
    }

    @Override // v4.c0
    public final void b1(View view, View view2, int i7, int i10) {
        this.I = true;
        super.b1(view, view2, i7, i10);
        this.I = false;
    }

    @Override // v4.p0
    public final void f0() {
        ValueAnimator valueAnimator = this.K;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.K.cancel();
        }
        ax axVar = this.L;
        if (axVar.a.getScrollState() != 1) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.M.U, 0.0f);
            this.K = ofFloat;
            ofFloat.addUpdateListener(new ch.w(21, this, axVar));
            this.K.addListener(new org.telegram.ui.Cells.x9(this, 25));
            this.K.setDuration(200L);
            this.K.setInterpolator(org.telegram.ui.Components.kr.f);
            this.K.start();
        }
    }

    @Override // v4.c0
    public final void h1(int i7, int i10) {
        if (this.I) {
            i10 -= this.L.a.getPaddingTop();
        }
        super.h1(i7, i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        if (org.telegram.ui.bx.w1(r4, r6) != false) goto L15;
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
    @Override // v4.c0, v4.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int o0(int i7, v4.x0 x0Var, v4.c1 c1Var) {
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
        iv ivVar;
        float viewOffset;
        float f11;
        org.telegram.ui.ActionBar.k kVar5;
        org.telegram.ui.ActionBar.k kVar6;
        org.telegram.ui.ActionBar.k kVar7;
        org.telegram.ui.ActionBar.k kVar8;
        bx bxVar = this.M;
        UndoView[] undoViewArr = bxVar.z0;
        ax axVar = this.L;
        xw xwVar = axVar.a;
        int i15 = 0;
        if (!xwVar.W1) {
            boolean z12 = xwVar.getScrollState() == 1;
            if (z12 != this.J) {
                this.J = z12;
                if (!z12) {
                }
            }
            float f12 = 0.0f;
            if (i7 > 0 && bxVar.U != 0.0f) {
                kVar7 = ((org.telegram.ui.ActionBar.g2) bxVar).actionBar;
                if (kVar7 != null) {
                    kVar8 = ((org.telegram.ui.ActionBar.g2) bxVar).actionBar;
                }
                float f13 = bxVar.U - i7;
                if (f13 < 0.0f) {
                    i15 = (int) (-f13);
                } else {
                    f12 = f13;
                }
                bx.v1(bxVar, axVar, f12);
                return super.o0(i15, x0Var, c1Var);
            }
            if (bxVar.L && bxVar.a3 == 0) {
                kVar5 = ((org.telegram.ui.ActionBar.g2) bxVar).actionBar;
                if (kVar5 != null) {
                    kVar6 = ((org.telegram.ui.ActionBar.g2) bxVar).actionBar;
                }
                z10 = true;
                int paddingTop = axVar.a.getPaddingTop();
                int L2 = (z10 || bxVar.H3.c() || bxVar.S) ? paddingTop : paddingTop - org.telegram.messenger.g0.L(81.0f);
                if (!bxVar.S && axVar.s == 0 && !bxVar.n2 && bxVar.Y2 == 0 && bxVar.a3 == 0) {
                    org.telegram.messenger.mp messagesController = bxVar.getMessagesController();
                    messagesController.getClass();
                    if (org.telegram.messenger.bz.q1) {
                        i10 = paddingTop;
                        if (messagesController.R.f(1 | 2305843009213693952L) != null && axVar.w == 2) {
                            i11 = 1;
                            if ((i11 == 0 || (z10 && !bxVar.H3.c())) && i7 < 0) {
                                f10 = 1.0f;
                                axVar.a.setOverScrollMode(0);
                                L0 = axVar.c.L0();
                                if (L0 == 0 || (m10 = axVar.c.m(L0)) == null) {
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
                                        View m11 = axVar.c.m(L0);
                                        float top = ((m11.getTop() - i10) / m11.getMeasuredHeight()) + 1.0f;
                                        if (top > 1.0f) {
                                            top = 1.0f;
                                        }
                                        axVar.a.setOverScrollMode(2);
                                        int C = (int) com.google.android.gms.internal.vision.e2.C(top, 0.25f, 0.45f, i7);
                                        r8 = C <= -1 ? C : -1;
                                        UndoView undoView = undoViewArr[0];
                                        if (undoView != null && undoView.getVisibility() == 0) {
                                            boolean z13 = i12;
                                            undoViewArr[0].d(z13 ? 1 : 0, z13);
                                        }
                                    } else if (((L0 == i12 && i11 != 0) || L0 == 0) && z10 && z12 && !bxVar.H3.c()) {
                                        if (bxVar.O == 0.0f) {
                                            axVar.a.setOverScrollMode(0);
                                        } else {
                                            axVar.a.setOverScrollMode(2);
                                        }
                                        i13 = (int) (i7 * 0.3f);
                                    }
                                    i13 = r8;
                                    if (axVar.s == 0) {
                                        viewOffset = ((int) axVar.a.getViewOffset()) - i7;
                                        if (viewOffset >= 0.0f) {
                                        }
                                        axVar.a.setViewsOffset(f11);
                                    }
                                    if (axVar.s == 0) {
                                    }
                                    boolean z14 = z10;
                                    o02 = super.o0(i13, x0Var, c1Var);
                                    if (o02 == 0) {
                                        bx.v1(bxVar, axVar, bxVar.U - (bxVar.F0.getOverScrollCoef() * i7));
                                    }
                                    return o02;
                                }
                                View m12 = axVar.c.m(L0);
                                if (m12 != null && L0 < 10) {
                                    int i16 = 0;
                                    while (i11 < L0) {
                                        jv jvVar = axVar.d;
                                        if (((jg.k) jvVar.N.get(i11)).a == 0) {
                                            if (!((jg.k) jvVar.N.get(i11)).f || jvVar.K) {
                                                L = org.telegram.messenger.g0.L(org.telegram.messenger.bz.p1 ? 76.0f : 70.0f);
                                            } else {
                                                L = org.telegram.messenger.g0.L(org.telegram.messenger.bz.p1 ? 86.0f : 91.0f);
                                            }
                                            i14 = L + 1;
                                        } else {
                                            i14 = 0;
                                        }
                                        i16 += i14;
                                        i11++;
                                    }
                                    int i17 = (-(m12.getTop() - L2)) + i16;
                                    if (!bxVar.H3.c()) {
                                        kVar3 = ((org.telegram.ui.ActionBar.g2) bxVar).actionBar;
                                        if (kVar3 != null) {
                                            kVar4 = ((org.telegram.ui.ActionBar.g2) bxVar).actionBar;
                                        }
                                        i17 -= org.telegram.messenger.g0.L(48.0f);
                                    }
                                    if (z10 && ((((ValueAnimator) axVar.b.c) != null || bxVar.F0.g()) && !bxVar.H3.c() && !bxVar.S)) {
                                        i17 += org.telegram.messenger.g0.L(81.0f);
                                    }
                                    if ((((ValueAnimator) axVar.b.c) != null || bxVar.F0.g()) && !bxVar.H3.c() && !bxVar.S) {
                                        kVar = ((org.telegram.ui.ActionBar.g2) bxVar).actionBar;
                                        if (kVar != null) {
                                            kVar2 = ((org.telegram.ui.ActionBar.g2) bxVar).actionBar;
                                        }
                                        i17 += org.telegram.messenger.g0.L(48.0f);
                                    }
                                    if (i17 < Math.abs(i7)) {
                                        i13 = -i17;
                                        if (axVar.s == 0 && axVar.a.getViewOffset() != 0.0f && i7 > 0 && z12) {
                                            viewOffset = ((int) axVar.a.getViewOffset()) - i7;
                                            if (viewOffset >= 0.0f) {
                                                i13 = (int) viewOffset;
                                                f11 = 0.0f;
                                            } else {
                                                f11 = viewOffset;
                                                i13 = 0;
                                            }
                                            axVar.a.setViewsOffset(f11);
                                        }
                                        if (axVar.s == 0 || axVar.w == 0 || !bxVar.n4() || bxVar.S) {
                                            boolean z142 = z10;
                                            o02 = super.o0(i13, x0Var, c1Var);
                                            if (o02 == 0 && i7 < 0 && z12 && !bxVar.H3.c() && z142 && bxVar.w3 == 0.0f) {
                                                bx.v1(bxVar, axVar, bxVar.U - (bxVar.F0.getOverScrollCoef() * i7));
                                            }
                                            return o02;
                                        }
                                        int o03 = super.o0(i13, x0Var, c1Var);
                                        iv ivVar2 = axVar.n;
                                        if (ivVar2 != null) {
                                            ivVar2.a = o03;
                                        }
                                        int L02 = axVar.c.L0();
                                        View m13 = L02 == 0 ? axVar.c.m(L02) : null;
                                        if (L02 != 0 || m13 == null || m13.getBottom() - L2 < org.telegram.messenger.g0.L(4.0f)) {
                                            boolean z15 = z10;
                                            bxVar.f3 = 0L;
                                            bxVar.h3 = false;
                                            boolean z16 = axVar.w != 2;
                                            axVar.w = 2;
                                            if (z16 && org.telegram.messenger.g0.C1()) {
                                                org.telegram.messenger.g0.i2(org.telegram.messenger.gd.N0(2131754924, null));
                                            }
                                            iv ivVar3 = axVar.n;
                                            z11 = z15;
                                            if (ivVar3 != null) {
                                                ValueAnimator valueAnimator = ivVar3.z;
                                                if (valueAnimator != null) {
                                                    valueAnimator.cancel();
                                                }
                                                org.telegram.ui.Cells.u2 u2Var = ivVar3.H;
                                                if (u2Var != null) {
                                                    u2Var.removeCallbacks(ivVar3.d0);
                                                }
                                                ivVar3.x = 0.0f;
                                                ivVar3.y = false;
                                                ivVar3.e0 = false;
                                                axVar.n.f(0.0f);
                                                axVar.n.I = axVar.a;
                                                z11 = z15;
                                            }
                                        } else {
                                            if (bxVar.f3 == 0) {
                                                bxVar.f3 = System.currentTimeMillis();
                                            }
                                            if (axVar.w == 2 && (ivVar = axVar.n) != null) {
                                                ivVar.h();
                                            }
                                            if (z10 && !bxVar.H3.c() && !bxVar.S) {
                                                L2 += org.telegram.messenger.g0.L(81.0f);
                                            }
                                            float top2 = ((m13.getTop() - L2) / m13.getMeasuredHeight()) + f10;
                                            if (top2 > f10) {
                                                top2 = f10;
                                            }
                                            boolean z17 = z10;
                                            boolean z18 = top2 > 0.85f && System.currentTimeMillis() - bxVar.f3 > 220;
                                            if (bxVar.h3 != z18) {
                                                bxVar.h3 = z18;
                                                if (axVar.w == 2) {
                                                    try {
                                                        axVar.a.performHapticFeedback(3, 2);
                                                    } catch (Exception unused) {
                                                    }
                                                    iv ivVar4 = axVar.n;
                                                    if (ivVar4 != null) {
                                                        ivVar4.a(z18);
                                                    }
                                                }
                                            }
                                            if (axVar.w == 2 && i13 - o03 != 0 && i7 < 0 && z12) {
                                                axVar.a.setViewsOffset(org.telegram.ui.Cells.c0.z(i7, 0.2f, f10 - (axVar.a.getViewOffset() / org.telegram.messenger.g0.L(72.0f)), axVar.a.getViewOffset()));
                                            }
                                            iv ivVar5 = axVar.n;
                                            z11 = z17;
                                            if (ivVar5 != null) {
                                                ivVar5.f(top2);
                                                axVar.n.I = axVar.a;
                                                z11 = z17;
                                            }
                                        }
                                        if (m13 != null) {
                                            m13.invalidate();
                                        }
                                        if (axVar.w == 1 && o03 == 0 && i7 < 0 && z12 && !bxVar.H3.c() && z11 && bxVar.w3 == 0.0f) {
                                            bx.v1(bxVar, axVar, bxVar.U - (org.telegram.messenger.g0.T1(0.2f, 0.5f, bxVar.F0.o0) * i7));
                                        }
                                        return o03;
                                    }
                                }
                            } else {
                                f10 = 1.0f;
                            }
                            i13 = i7;
                            if (axVar.s == 0) {
                            }
                            if (axVar.s == 0) {
                            }
                            boolean z1422 = z10;
                            o02 = super.o0(i13, x0Var, c1Var);
                            if (o02 == 0) {
                            }
                            return o02;
                        }
                        i11 = 0;
                        if (i11 == 0) {
                        }
                        f10 = 1.0f;
                        axVar.a.setOverScrollMode(0);
                        L0 = axVar.c.L0();
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
                axVar.a.setOverScrollMode(0);
                L0 = axVar.c.L0();
                if (L0 == 0) {
                }
                i12 = 1;
                if (!z12) {
                }
            }
            z10 = false;
            int paddingTop2 = axVar.a.getPaddingTop();
            if (z10) {
            }
            if (!bxVar.S) {
                org.telegram.messenger.mp messagesController2 = bxVar.getMessagesController();
                messagesController2.getClass();
                if (org.telegram.messenger.bz.q1) {
                }
            }
            i10 = paddingTop2;
            i11 = 0;
            if (i11 == 0) {
            }
            f10 = 1.0f;
            axVar.a.setOverScrollMode(0);
            L0 = axVar.c.L0();
            if (L0 == 0) {
            }
            i12 = 1;
            if (!z12) {
            }
        }
        return 0;
    }

    @Override // v4.c0, v4.p0
    public final void v0(RecyclerView recyclerView, v4.c1 c1Var, int i7) {
        if (this.M.n4() && i7 == 1) {
            super.v0(recyclerView, c1Var, i7);
            return;
        }
        pi.l lVar = new pi.l(recyclerView.getContext(), 0);
        lVar.a = i7;
        w0(lVar);
    }
}
