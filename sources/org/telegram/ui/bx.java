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

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class bx extends s4.b0 {
    public boolean I;
    public boolean J;
    public ValueAnimator K;
    public final /* synthetic */ xy L;
    public final /* synthetic */ yy M;

    public bx(yy yyVar, xy xyVar) {
        this.M = yyVar;
        this.L = xyVar;
    }

    @Override // s4.b0
    public final int R0() {
        xy xyVar = this.L;
        return (xyVar.s == 0 && this.M.W3() && xyVar.v == 2) ? 1 : 0;
    }

    @Override // s4.b0, s4.n0
    public final void b0(qf.e eVar, s4.y0 y0Var) {
        if (!BuildVars.DEBUG_PRIVATE_VERSION) {
            try {
                super.b0(eVar, y0Var);
                return;
            } catch (IndexOutOfBoundsException e) {
                FileLog.e(e);
                AndroidUtilities.runOnUIThread(new ax(this.L, 0));
                return;
            }
        }
        try {
            super.b0(eVar, y0Var);
        } catch (IndexOutOfBoundsException unused) {
            StringBuilder sb2 = new StringBuilder("Inconsistency detected. dialogsListIsFrozen=");
            yy yyVar = this.M;
            sb2.append(yyVar.S1);
            sb2.append(" lastUpdateAction=");
            sb2.append(yyVar.y3);
            throw new RuntimeException(sb2.toString());
        }
    }

    @Override // s4.b0
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
        xy xyVar = this.L;
        if (xyVar.a.getScrollState() != 1) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.M.T, 0.0f);
            this.K = ofFloat;
            ofFloat.addUpdateListener(new ah.l0(22, this, xyVar));
            this.K.addListener(new org.telegram.ui.Components.u61(this, 20));
            this.K.setDuration(200L);
            this.K.setInterpolator(org.telegram.ui.Components.es.f);
            this.K.start();
        }
    }

    @Override // s4.b0
    public final void h1(int i10, int i11) {
        if (this.I) {
            i11 -= this.L.a.getPaddingTop();
        }
        super.h1(i10, i11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        if (org.telegram.ui.yy.o1(r4, r6) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        if (r11.t() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x016e, code lost:
    
        if (r8.t() == false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x01c4, code lost:
    
        if (r8.t() == false) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x024a, code lost:
    
        if (r8 > (-1)) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0076, code lost:
    
        if (r11.t() == false) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03e5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00cc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x027d  */
    @Override // s4.b0, s4.n0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int o0(int i10, qf.e eVar, s4.y0 y0Var) {
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
        ex exVar;
        float viewOffset;
        float f7;
        org.telegram.ui.ActionBar.k kVar5;
        org.telegram.ui.ActionBar.k kVar6;
        org.telegram.ui.ActionBar.k kVar7;
        org.telegram.ui.ActionBar.k kVar8;
        yy yyVar = this.M;
        UndoView[] undoViewArr = yyVar.y0;
        xy xyVar = this.L;
        uy uyVar = xyVar.a;
        int i15 = 0;
        if (!uyVar.V1) {
            boolean z14 = uyVar.getScrollState() == 1;
            if (z14 != this.J) {
                this.J = z14;
                if (!z14) {
                }
            }
            float f10 = 0.0f;
            if (i10 > 0 && yyVar.T != 0.0f) {
                kVar7 = ((org.telegram.ui.ActionBar.m2) yyVar).actionBar;
                if (kVar7 != null) {
                    kVar8 = ((org.telegram.ui.ActionBar.m2) yyVar).actionBar;
                }
                float f11 = yyVar.T - i10;
                if (f11 < 0.0f) {
                    i15 = (int) (-f11);
                } else {
                    f10 = f11;
                }
                yy.n1(yyVar, xyVar, f10);
                return super.o0(i15, eVar, y0Var);
            }
            if (yyVar.K && yyVar.X2 == 0) {
                kVar5 = ((org.telegram.ui.ActionBar.m2) yyVar).actionBar;
                if (kVar5 != null) {
                    kVar6 = ((org.telegram.ui.ActionBar.m2) yyVar).actionBar;
                }
                z10 = true;
                int paddingTop = xyVar.a.getPaddingTop();
                int dp2 = (z10 || yyVar.F3.c() || yyVar.R) ? paddingTop : paddingTop - AndroidUtilities.dp(81.0f);
                if (yyVar.R && xyVar.s == 0 && !yyVar.l2 && yyVar.V2 == 0) {
                    z11 = true;
                    if (yyVar.X2 == 0 && yyVar.getMessagesController().hasHiddenArchive() && xyVar.v == 2) {
                        i11 = 1;
                        if ((i11 == 0 || (z10 && !yyVar.F3.c())) && i10 < 0) {
                            xyVar.a.setOverScrollMode(0);
                            L0 = xyVar.c.L0();
                            z12 = z11;
                            if (L0 == 0 && (m10 = xyVar.c.m(L0)) != null && m10.getBottom() - dp2 <= AndroidUtilities.dp(1.0f)) {
                                L0 = z12 ? 1 : 0;
                            }
                            if (z14) {
                                if (L0 != 0 || i11 == 0) {
                                    i12 = -1;
                                    if (((L0 == z12 && i11 != 0) || L0 == 0) && z10 && z14 && !yyVar.F3.c()) {
                                        if (yyVar.N == 0.0f) {
                                            xyVar.a.setOverScrollMode(0);
                                        } else {
                                            xyVar.a.setOverScrollMode(2);
                                        }
                                        i13 = (int) (i10 * 0.3f);
                                    }
                                } else {
                                    View m11 = xyVar.c.m(L0);
                                    float top = ((m11.getTop() - paddingTop) / m11.getMeasuredHeight()) + 1.0f;
                                    if (top > 1.0f) {
                                        top = 1.0f;
                                    }
                                    xyVar.a.setOverScrollMode(2);
                                    i13 = (int) com.google.android.gms.internal.play_billing.k3.B(top, 0.25f, 0.45f, i10);
                                    if (i13 > -1) {
                                        i13 = -1;
                                    }
                                    UndoView undoView = undoViewArr[0];
                                    if (undoView != null && undoView.getVisibility() == 0) {
                                        undoViewArr[0].e(z12 ? 1 : 0, z12);
                                    }
                                }
                                i12 = i13;
                                if (xyVar.s == 0) {
                                    viewOffset = ((int) xyVar.a.getViewOffset()) - i10;
                                    if (viewOffset >= 0.0f) {
                                    }
                                    xyVar.a.setViewsOffset(f7);
                                }
                                if (xyVar.s == 0) {
                                }
                                boolean z15 = z10;
                                o02 = super.o0(i12, eVar, y0Var);
                                if (o02 == 0) {
                                    yy.n1(yyVar, xyVar, yyVar.T - (yyVar.E0.getOverScrollCoef() * i10));
                                }
                                return o02;
                            }
                            View m12 = xyVar.c.m(L0);
                            if (m12 != null && L0 < 10) {
                                int i16 = 0;
                                while (i11 < L0) {
                                    fx fxVar = xyVar.d;
                                    if (((hg.k) fxVar.M.get(i11)).a == 0) {
                                        if (!((hg.k) fxVar.M.get(i11)).f || fxVar.J) {
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
                                if (!yyVar.F3.c()) {
                                    kVar3 = ((org.telegram.ui.ActionBar.m2) yyVar).actionBar;
                                    if (kVar3 != null) {
                                        kVar4 = ((org.telegram.ui.ActionBar.m2) yyVar).actionBar;
                                    }
                                    i17 -= AndroidUtilities.dp(48.0f);
                                }
                                if (z10 && ((((ValueAnimator) xyVar.b.c) != null || yyVar.E0.g()) && !yyVar.F3.c() && !yyVar.R)) {
                                    i17 += AndroidUtilities.dp(81.0f);
                                }
                                if ((((ValueAnimator) xyVar.b.c) != null || yyVar.E0.g()) && !yyVar.F3.c() && !yyVar.R) {
                                    kVar = ((org.telegram.ui.ActionBar.m2) yyVar).actionBar;
                                    if (kVar != null) {
                                        kVar2 = ((org.telegram.ui.ActionBar.m2) yyVar).actionBar;
                                    }
                                    i17 += AndroidUtilities.dp(48.0f);
                                }
                                if (i17 < Math.abs(i10)) {
                                    i12 = -i17;
                                    if (xyVar.s == 0 && xyVar.a.getViewOffset() != 0.0f && i10 > 0 && z14) {
                                        viewOffset = ((int) xyVar.a.getViewOffset()) - i10;
                                        if (viewOffset >= 0.0f) {
                                            i12 = (int) viewOffset;
                                            f7 = 0.0f;
                                        } else {
                                            f7 = viewOffset;
                                            i12 = 0;
                                        }
                                        xyVar.a.setViewsOffset(f7);
                                    }
                                    if (xyVar.s == 0 || xyVar.v == 0 || !yyVar.W3() || yyVar.R) {
                                        boolean z152 = z10;
                                        o02 = super.o0(i12, eVar, y0Var);
                                        if (o02 == 0 && i10 < 0 && z14 && !yyVar.F3.c() && z152 && yyVar.t3 == 0.0f) {
                                            yy.n1(yyVar, xyVar, yyVar.T - (yyVar.E0.getOverScrollCoef() * i10));
                                        }
                                        return o02;
                                    }
                                    int o03 = super.o0(i12, eVar, y0Var);
                                    ex exVar2 = xyVar.n;
                                    if (exVar2 != null) {
                                        exVar2.a = o03;
                                    }
                                    int L02 = xyVar.c.L0();
                                    View m13 = L02 == 0 ? xyVar.c.m(L02) : null;
                                    if (L02 != 0 || m13 == null || m13.getBottom() - dp2 < AndroidUtilities.dp(4.0f)) {
                                        boolean z16 = z10;
                                        yyVar.c3 = 0L;
                                        yyVar.e3 = false;
                                        boolean z17 = xyVar.v != 2;
                                        xyVar.v = 2;
                                        if (z17 && AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
                                            AndroidUtilities.makeAccessibilityAnnouncement(LocaleController.getString(R.string.AccDescrArchivedChatsHidden));
                                        }
                                        ex exVar3 = xyVar.n;
                                        z13 = z16;
                                        if (exVar3 != null) {
                                            ValueAnimator valueAnimator = exVar3.z;
                                            if (valueAnimator != null) {
                                                valueAnimator.cancel();
                                            }
                                            org.telegram.ui.Cells.s2 s2Var = exVar3.H;
                                            if (s2Var != null) {
                                                s2Var.removeCallbacks(exVar3.d0);
                                            }
                                            exVar3.x = 0.0f;
                                            exVar3.y = false;
                                            exVar3.e0 = false;
                                            xyVar.n.f(0.0f);
                                            xyVar.n.I = xyVar.a;
                                            z13 = z16;
                                        }
                                    } else {
                                        boolean z18 = z10;
                                        if (yyVar.c3 == 0) {
                                            yyVar.c3 = System.currentTimeMillis();
                                        }
                                        if (xyVar.v == 2 && (exVar = xyVar.n) != null) {
                                            exVar.h();
                                        }
                                        if (z18 && !yyVar.F3.c() && !yyVar.R) {
                                            dp2 += AndroidUtilities.dp(81.0f);
                                        }
                                        float top2 = ((m13.getTop() - dp2) / m13.getMeasuredHeight()) + 1.0f;
                                        if (top2 > 1.0f) {
                                            top2 = 1.0f;
                                        }
                                        boolean z19 = z18;
                                        boolean z20 = top2 > 0.85f && System.currentTimeMillis() - yyVar.c3 > 220;
                                        if (yyVar.e3 != z20) {
                                            yyVar.e3 = z20;
                                            if (xyVar.v == 2) {
                                                try {
                                                    xyVar.a.performHapticFeedback(3, 2);
                                                } catch (Exception unused) {
                                                }
                                                ex exVar4 = xyVar.n;
                                                if (exVar4 != null) {
                                                    exVar4.a(z20);
                                                }
                                            }
                                        }
                                        if (xyVar.v == 2 && i12 - o03 != 0 && i10 < 0 && z14) {
                                            xyVar.a.setViewsOffset(xyVar.a.getViewOffset() - ((i10 * 0.2f) * (1.0f - (xyVar.a.getViewOffset() / AndroidUtilities.dp(72.0f)))));
                                        }
                                        ex exVar5 = xyVar.n;
                                        z13 = z19;
                                        if (exVar5 != null) {
                                            exVar5.f(top2);
                                            xyVar.n.I = xyVar.a;
                                            z13 = z19;
                                        }
                                    }
                                    if (m13 != null) {
                                        m13.invalidate();
                                    }
                                    if (xyVar.v == 1 && o03 == 0 && i10 < 0 && z14 && !yyVar.F3.c() && z13 && yyVar.t3 == 0.0f) {
                                        yy.n1(yyVar, xyVar, yyVar.T - (AndroidUtilities.lerp(0.2f, 0.5f, yyVar.E0.n0) * i10));
                                    }
                                    return o03;
                                }
                            }
                        }
                        i12 = i10;
                        if (xyVar.s == 0) {
                        }
                        if (xyVar.s == 0) {
                        }
                        boolean z1522 = z10;
                        o02 = super.o0(i12, eVar, y0Var);
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
                xyVar.a.setOverScrollMode(0);
                L0 = xyVar.c.L0();
                z12 = z11;
                if (L0 == 0) {
                    L0 = z12 ? 1 : 0;
                }
                if (z14) {
                }
            }
            z10 = false;
            int paddingTop2 = xyVar.a.getPaddingTop();
            if (z10) {
            }
            if (yyVar.R) {
            }
            z11 = true;
            i11 = 0;
            if (i11 == 0) {
            }
            xyVar.a.setOverScrollMode(0);
            L0 = xyVar.c.L0();
            z12 = z11;
            if (L0 == 0) {
            }
            if (z14) {
            }
        }
        return 0;
    }

    @Override // s4.b0, s4.n0
    public final void v0(RecyclerView recyclerView, s4.y0 y0Var, int i10) {
        if (this.M.W3() && i10 == 1) {
            super.v0(recyclerView, y0Var, i10);
            return;
        }
        ki.o oVar = new ki.o(recyclerView.getContext(), 0);
        oVar.a = i10;
        w0(oVar);
    }
}
