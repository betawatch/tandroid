package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class cw extends s4.c0 {
    public boolean I;
    public boolean J;
    public ValueAnimator K;
    public final /* synthetic */ ay L;
    public final /* synthetic */ cy M;

    public cw(cy cyVar, ay ayVar) {
        this.M = cyVar;
        this.L = ayVar;
    }

    @Override // s4.c0
    public final int R0() {
        ay ayVar = this.L;
        return (ayVar.s == 0 && this.M.h4() && ayVar.v == 2) ? 1 : 0;
    }

    @Override // s4.c0, s4.p0
    public final void b0(rf.e eVar, s4.b1 b1Var) {
        if (!BuildVars.DEBUG_PRIVATE_VERSION) {
            try {
                super.b0(eVar, b1Var);
                return;
            } catch (IndexOutOfBoundsException e) {
                FileLog.e(e);
                AndroidUtilities.runOnUIThread(new bw(this.L, 0));
                return;
            }
        }
        try {
            super.b0(eVar, b1Var);
        } catch (IndexOutOfBoundsException unused) {
            StringBuilder sb2 = new StringBuilder("Inconsistency detected. dialogsListIsFrozen=");
            cy cyVar = this.M;
            sb2.append(cyVar.S1);
            sb2.append(" lastUpdateAction=");
            sb2.append(cyVar.z3);
            throw new RuntimeException(sb2.toString());
        }
    }

    @Override // s4.c0
    public final void b1(View view, View view2, int i10, int i11) {
        this.I = true;
        super.b1(view, view2, i10, i11);
        this.I = false;
    }

    @Override // s4.p0
    public final void f0() {
        ValueAnimator valueAnimator = this.K;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.K.cancel();
        }
        ay ayVar = this.L;
        if (ayVar.a.getScrollState() != 1) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.M.T, 0.0f);
            this.K = ofFloat;
            ofFloat.addUpdateListener(new bh.b0(22, this, ayVar));
            this.K.addListener(new org.telegram.ui.Components.h31(this, 24));
            this.K.setDuration(200L);
            this.K.setInterpolator(org.telegram.ui.Components.ds.f);
            this.K.start();
        }
    }

    @Override // s4.c0
    public final void h1(int i10, int i11) {
        if (this.I) {
            i11 -= this.L.a.getPaddingTop();
        }
        super.h1(i10, i11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        if (org.telegram.ui.cy.s1(r4, r6) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        if (r11.q() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x016e, code lost:
    
        if (r8.q() == false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x01c4, code lost:
    
        if (r8.q() == false) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x024a, code lost:
    
        if (r8 > (-1)) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0076, code lost:
    
        if (r11.q() == false) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03e6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00cc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x027d  */
    @Override // s4.c0, s4.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int o0(int i10, rf.e eVar, s4.b1 b1Var) {
        boolean z10;
        boolean z11;
        int i11;
        int L0;
        boolean z12;
        int i12;
        int i13;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        int i14;
        int dp;
        View m10;
        int o02;
        boolean z13;
        fw fwVar;
        float viewOffset;
        float f7;
        org.telegram.ui.ActionBar.k kVar5;
        org.telegram.ui.ActionBar.k kVar6;
        org.telegram.ui.ActionBar.k kVar7;
        org.telegram.ui.ActionBar.k kVar8;
        cy cyVar = this.M;
        UndoView[] undoViewArr = cyVar.y0;
        ay ayVar = this.L;
        wx wxVar = ayVar.a;
        int i15 = 0;
        if (!wxVar.V1) {
            boolean z14 = wxVar.getScrollState() == 1;
            if (z14 != this.J) {
                this.J = z14;
                if (!z14) {
                }
            }
            float f10 = 0.0f;
            if (i10 > 0 && cyVar.T != 0.0f) {
                kVar7 = ((org.telegram.ui.ActionBar.r2) cyVar).actionBar;
                if (kVar7 != null) {
                    kVar8 = ((org.telegram.ui.ActionBar.r2) cyVar).actionBar;
                }
                float f11 = cyVar.T - i10;
                if (f11 < 0.0f) {
                    i15 = (int) (-f11);
                } else {
                    f10 = f11;
                }
                cy.r1(cyVar, ayVar, f10);
                return super.o0(i15, eVar, b1Var);
            }
            if (cyVar.K && cyVar.Y2 == 0) {
                kVar5 = ((org.telegram.ui.ActionBar.r2) cyVar).actionBar;
                if (kVar5 != null) {
                    kVar6 = ((org.telegram.ui.ActionBar.r2) cyVar).actionBar;
                }
                z10 = true;
                int paddingTop = ayVar.a.getPaddingTop();
                int dp2 = (z10 || cyVar.G3.c() || cyVar.R) ? paddingTop : paddingTop - AndroidUtilities.dp(81.0f);
                if (cyVar.R && ayVar.s == 0 && !cyVar.l2 && cyVar.W2 == 0) {
                    z11 = true;
                    if (cyVar.Y2 == 0 && cyVar.getMessagesController().hasHiddenArchive() && ayVar.v == 2) {
                        i11 = 1;
                        if ((i11 == 0 || (z10 && !cyVar.G3.c())) && i10 < 0) {
                            ayVar.a.setOverScrollMode(0);
                            L0 = ayVar.c.L0();
                            z12 = z11;
                            if (L0 == 0 && (m10 = ayVar.c.m(L0)) != null && m10.getBottom() - dp2 <= AndroidUtilities.dp(1.0f)) {
                                L0 = z12 ? 1 : 0;
                            }
                            if (z14) {
                                if (L0 != 0 || i11 == 0) {
                                    i12 = -1;
                                    if (((L0 == z12 && i11 != 0) || L0 == 0) && z10 && z14 && !cyVar.G3.c()) {
                                        if (cyVar.N == 0.0f) {
                                            ayVar.a.setOverScrollMode(0);
                                        } else {
                                            ayVar.a.setOverScrollMode(2);
                                        }
                                        i13 = (int) (i10 * 0.3f);
                                    }
                                } else {
                                    View m11 = ayVar.c.m(L0);
                                    float top = ((m11.getTop() - paddingTop) / m11.getMeasuredHeight()) + 1.0f;
                                    if (top > 1.0f) {
                                        top = 1.0f;
                                    }
                                    ayVar.a.setOverScrollMode(2);
                                    i13 = (int) c3.h0.D(top, 0.25f, 0.45f, i10);
                                    if (i13 > -1) {
                                        i13 = -1;
                                    }
                                    UndoView undoView = undoViewArr[0];
                                    if (undoView != null && undoView.getVisibility() == 0) {
                                        undoViewArr[0].d(z12 ? 1 : 0, z12);
                                    }
                                }
                                i12 = i13;
                                if (ayVar.s == 0) {
                                    viewOffset = ((int) ayVar.a.getViewOffset()) - i10;
                                    if (viewOffset >= 0.0f) {
                                    }
                                    ayVar.a.setViewsOffset(f7);
                                }
                                if (ayVar.s == 0) {
                                }
                                boolean z15 = z10;
                                o02 = super.o0(i12, eVar, b1Var);
                                if (o02 == 0) {
                                    cy.r1(cyVar, ayVar, cyVar.T - (cyVar.E0.getOverScrollCoef() * i10));
                                }
                                return o02;
                            }
                            View m12 = ayVar.c.m(L0);
                            if (m12 != null && L0 < 10) {
                                int i16 = 0;
                                while (i11 < L0) {
                                    gw gwVar = ayVar.d;
                                    if (((ig.l) gwVar.M.get(i11)).a == 0) {
                                        if (!((ig.l) gwVar.M.get(i11)).f || gwVar.J) {
                                            dp = AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 76.0f : 70.0f);
                                        } else {
                                            dp = AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 86.0f : 91.0f);
                                        }
                                        i14 = dp + 1;
                                    } else {
                                        i14 = 0;
                                    }
                                    i16 += i14;
                                    i11++;
                                }
                                int i17 = (-(m12.getTop() - dp2)) + i16;
                                if (!cyVar.G3.c()) {
                                    kVar3 = ((org.telegram.ui.ActionBar.r2) cyVar).actionBar;
                                    if (kVar3 != null) {
                                        kVar4 = ((org.telegram.ui.ActionBar.r2) cyVar).actionBar;
                                    }
                                    i17 -= AndroidUtilities.dp(48.0f);
                                }
                                if (z10 && ((((ValueAnimator) ayVar.b.c) != null || cyVar.E0.g()) && !cyVar.G3.c() && !cyVar.R)) {
                                    i17 += AndroidUtilities.dp(81.0f);
                                }
                                if ((((ValueAnimator) ayVar.b.c) != null || cyVar.E0.g()) && !cyVar.G3.c() && !cyVar.R) {
                                    kVar = ((org.telegram.ui.ActionBar.r2) cyVar).actionBar;
                                    if (kVar != null) {
                                        kVar2 = ((org.telegram.ui.ActionBar.r2) cyVar).actionBar;
                                    }
                                    i17 += AndroidUtilities.dp(48.0f);
                                }
                                if (i17 < Math.abs(i10)) {
                                    i12 = -i17;
                                    if (ayVar.s == 0 && ayVar.a.getViewOffset() != 0.0f && i10 > 0 && z14) {
                                        viewOffset = ((int) ayVar.a.getViewOffset()) - i10;
                                        if (viewOffset >= 0.0f) {
                                            i12 = (int) viewOffset;
                                            f7 = 0.0f;
                                        } else {
                                            f7 = viewOffset;
                                            i12 = 0;
                                        }
                                        ayVar.a.setViewsOffset(f7);
                                    }
                                    if (ayVar.s == 0 || ayVar.v == 0 || !cyVar.h4() || cyVar.R) {
                                        boolean z152 = z10;
                                        o02 = super.o0(i12, eVar, b1Var);
                                        if (o02 == 0 && i10 < 0 && z14 && !cyVar.G3.c() && z152 && cyVar.u3 == 0.0f) {
                                            cy.r1(cyVar, ayVar, cyVar.T - (cyVar.E0.getOverScrollCoef() * i10));
                                        }
                                        return o02;
                                    }
                                    int o03 = super.o0(i12, eVar, b1Var);
                                    fw fwVar2 = ayVar.n;
                                    if (fwVar2 != null) {
                                        fwVar2.a = o03;
                                    }
                                    int L02 = ayVar.c.L0();
                                    View m13 = L02 == 0 ? ayVar.c.m(L02) : null;
                                    if (L02 != 0 || m13 == null || m13.getBottom() - dp2 < AndroidUtilities.dp(4.0f)) {
                                        boolean z16 = z10;
                                        cyVar.d3 = 0L;
                                        cyVar.f3 = false;
                                        boolean z17 = ayVar.v != 2;
                                        ayVar.v = 2;
                                        if (z17 && AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
                                            AndroidUtilities.makeAccessibilityAnnouncement(LocaleController.getString(R.string.AccDescrArchivedChatsHidden));
                                        }
                                        fw fwVar3 = ayVar.n;
                                        z13 = z16;
                                        if (fwVar3 != null) {
                                            ValueAnimator valueAnimator = fwVar3.z;
                                            if (valueAnimator != null) {
                                                valueAnimator.cancel();
                                            }
                                            org.telegram.ui.Cells.p2 p2Var = fwVar3.H;
                                            if (p2Var != null) {
                                                p2Var.removeCallbacks(fwVar3.d0);
                                            }
                                            fwVar3.x = 0.0f;
                                            fwVar3.y = false;
                                            fwVar3.e0 = false;
                                            ayVar.n.f(0.0f);
                                            ayVar.n.I = ayVar.a;
                                            z13 = z16;
                                        }
                                    } else {
                                        boolean z18 = z10;
                                        if (cyVar.d3 == 0) {
                                            cyVar.d3 = System.currentTimeMillis();
                                        }
                                        if (ayVar.v == 2 && (fwVar = ayVar.n) != null) {
                                            fwVar.h();
                                        }
                                        if (z18 && !cyVar.G3.c() && !cyVar.R) {
                                            dp2 += AndroidUtilities.dp(81.0f);
                                        }
                                        float top2 = ((m13.getTop() - dp2) / m13.getMeasuredHeight()) + 1.0f;
                                        if (top2 > 1.0f) {
                                            top2 = 1.0f;
                                        }
                                        boolean z19 = z18;
                                        boolean z20 = top2 > 0.85f && System.currentTimeMillis() - cyVar.d3 > 220;
                                        if (cyVar.f3 != z20) {
                                            cyVar.f3 = z20;
                                            if (ayVar.v == 2) {
                                                try {
                                                    ayVar.a.performHapticFeedback(3, 2);
                                                } catch (Exception unused) {
                                                }
                                                fw fwVar4 = ayVar.n;
                                                if (fwVar4 != null) {
                                                    fwVar4.a(z20);
                                                }
                                            }
                                        }
                                        if (ayVar.v == 2 && i12 - o03 != 0 && i10 < 0 && z14) {
                                            ayVar.a.setViewsOffset(d3.A(i10, 0.2f, 1.0f - (ayVar.a.getViewOffset() / AndroidUtilities.dp(72.0f)), ayVar.a.getViewOffset()));
                                        }
                                        fw fwVar5 = ayVar.n;
                                        z13 = z19;
                                        if (fwVar5 != null) {
                                            fwVar5.f(top2);
                                            ayVar.n.I = ayVar.a;
                                            z13 = z19;
                                        }
                                    }
                                    if (m13 != null) {
                                        m13.invalidate();
                                    }
                                    if (ayVar.v == 1 && o03 == 0 && i10 < 0 && z14 && !cyVar.G3.c() && z13 && cyVar.u3 == 0.0f) {
                                        cy.r1(cyVar, ayVar, cyVar.T - (AndroidUtilities.lerp(0.2f, 0.5f, cyVar.E0.n0) * i10));
                                    }
                                    return o03;
                                }
                            }
                        }
                        i12 = i10;
                        if (ayVar.s == 0) {
                        }
                        if (ayVar.s == 0) {
                        }
                        boolean z1522 = z10;
                        o02 = super.o0(i12, eVar, b1Var);
                        if (o02 == 0) {
                        }
                        return o02;
                    }
                } else {
                    z11 = true;
                }
                i11 = 0;
                if (i11 == 0) {
                }
                ayVar.a.setOverScrollMode(0);
                L0 = ayVar.c.L0();
                z12 = z11;
                if (L0 == 0) {
                    L0 = z12 ? 1 : 0;
                }
                if (z14) {
                }
            }
            z10 = false;
            int paddingTop2 = ayVar.a.getPaddingTop();
            if (z10) {
            }
            if (cyVar.R) {
            }
            z11 = true;
            i11 = 0;
            if (i11 == 0) {
            }
            ayVar.a.setOverScrollMode(0);
            L0 = ayVar.c.L0();
            z12 = z11;
            if (L0 == 0) {
            }
            if (z14) {
            }
        }
        return 0;
    }

    @Override // s4.c0, s4.p0
    public final void v0(RecyclerView recyclerView, s4.b1 b1Var, int i10) {
        if (this.M.h4() && i10 == 1) {
            super.v0(recyclerView, b1Var, i10);
            return;
        }
        mi.n nVar = new mi.n(recyclerView.getContext(), 0);
        nVar.a = i10;
        w0(nVar);
    }
}
