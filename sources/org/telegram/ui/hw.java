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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class hw extends f2.m0 {
    public boolean I;
    public boolean J;
    public ValueAnimator K;
    public final /* synthetic */ cy L;
    public final /* synthetic */ dy M;

    public hw(dy dyVar, cy cyVar) {
        this.M = dyVar;
        this.L = cyVar;
    }

    @Override // f2.m0
    public final int R0() {
        cy cyVar = this.L;
        return (cyVar.s == 0 && this.M.Z3() && cyVar.v == 2) ? 1 : 0;
    }

    @Override // f2.m0, f2.z0
    public final void b0(f2.g1 g1Var, f2.n1 n1Var) {
        if (!BuildVars.DEBUG_PRIVATE_VERSION) {
            try {
                super.b0(g1Var, n1Var);
                return;
            } catch (IndexOutOfBoundsException e10) {
                FileLog.e(e10);
                AndroidUtilities.runOnUIThread(new gw(this.L, 0));
                return;
            }
        }
        try {
            super.b0(g1Var, n1Var);
        } catch (IndexOutOfBoundsException unused) {
            StringBuilder sb2 = new StringBuilder("Inconsistency detected. dialogsListIsFrozen=");
            dy dyVar = this.M;
            sb2.append(dyVar.O1);
            sb2.append(" lastUpdateAction=");
            sb2.append(dyVar.u3);
            throw new RuntimeException(sb2.toString());
        }
    }

    @Override // f2.m0
    public final void b1(View view, View view2, int i9, int i10) {
        this.I = true;
        super.b1(view, view2, i9, i10);
        this.I = false;
    }

    @Override // f2.z0
    public final void f0() {
        ValueAnimator valueAnimator = this.K;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.K.cancel();
        }
        cy cyVar = this.L;
        if (cyVar.a.getScrollState() != 1) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.M.P, 0.0f);
            this.K = ofFloat;
            ofFloat.addUpdateListener(new f2.g(17, this, cyVar));
            this.K.addListener(new org.telegram.ui.Components.y11(this, 22));
            this.K.setDuration(200L);
            this.K.setInterpolator(org.telegram.ui.Components.gr.f);
            this.K.start();
        }
    }

    @Override // f2.m0
    public final void h1(int i9, int i10) {
        if (this.I) {
            i10 -= this.L.a.getPaddingTop();
        }
        super.h1(i9, i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        if (org.telegram.ui.dy.r1(r4, r6) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        if (r11.s() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x016d, code lost:
    
        if (r8.s() == false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x01c3, code lost:
    
        if (r8.s() == false) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x0248, code lost:
    
        if (r8 > (-1)) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0076, code lost:
    
        if (r11.s() == false) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03e6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00cc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x027a  */
    @Override // f2.m0, f2.z0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int o0(int i9, f2.g1 g1Var, f2.n1 n1Var) {
        boolean z10;
        int i10;
        int L0;
        int i11;
        int i12;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        int i13;
        int dp;
        View m10;
        int o02;
        boolean z11;
        kw kwVar;
        float viewOffset;
        float f10;
        org.telegram.ui.ActionBar.k kVar5;
        org.telegram.ui.ActionBar.k kVar6;
        org.telegram.ui.ActionBar.k kVar7;
        org.telegram.ui.ActionBar.k kVar8;
        dy dyVar = this.M;
        UndoView[] undoViewArr = dyVar.u0;
        cy cyVar = this.L;
        yx yxVar = cyVar.a;
        int i14 = 0;
        if (!yxVar.T1) {
            boolean z12 = yxVar.getScrollState() == 1;
            if (z12 != this.J) {
                this.J = z12;
                if (!z12) {
                }
            }
            float f11 = 0.0f;
            if (i9 > 0 && dyVar.P != 0.0f) {
                kVar7 = ((org.telegram.ui.ActionBar.o2) dyVar).actionBar;
                if (kVar7 != null) {
                    kVar8 = ((org.telegram.ui.ActionBar.o2) dyVar).actionBar;
                }
                float f12 = dyVar.P - i9;
                if (f12 < 0.0f) {
                    i14 = (int) (-f12);
                } else {
                    f11 = f12;
                }
                dy.q1(dyVar, cyVar, f11);
                return super.o0(i14, g1Var, n1Var);
            }
            if (dyVar.G && dyVar.T2 == 0) {
                kVar5 = ((org.telegram.ui.ActionBar.o2) dyVar).actionBar;
                if (kVar5 != null) {
                    kVar6 = ((org.telegram.ui.ActionBar.o2) dyVar).actionBar;
                }
                z10 = true;
                int paddingTop = cyVar.a.getPaddingTop();
                int dp2 = (z10 || dyVar.B3.c() || dyVar.N) ? paddingTop : paddingTop - AndroidUtilities.dp(81.0f);
                if (dyVar.N && cyVar.s == 0 && !dyVar.h2 && dyVar.R2 == 0) {
                    if (dyVar.T2 == 0 && dyVar.getMessagesController().hasHiddenArchive() && cyVar.v == 2) {
                        i10 = 1;
                        if ((i10 == 0 || (z10 && !dyVar.B3.c())) && i9 < 0) {
                            cyVar.a.setOverScrollMode(0);
                            L0 = cyVar.c.L0();
                            if (L0 == 0 && (m10 = cyVar.c.m(L0)) != null && m10.getBottom() - dp2 <= AndroidUtilities.dp(1.0f)) {
                                L0 = 1;
                            }
                            if (z12) {
                                if (L0 != 0 || i10 == 0) {
                                    i11 = -1;
                                    if (((L0 == 1 && i10 != 0) || L0 == 0) && z10 && z12 && !dyVar.B3.c()) {
                                        if (dyVar.J == 0.0f) {
                                            cyVar.a.setOverScrollMode(0);
                                        } else {
                                            cyVar.a.setOverScrollMode(2);
                                        }
                                        i12 = (int) (i9 * 0.3f);
                                    }
                                } else {
                                    View m11 = cyVar.c.m(L0);
                                    float top = ((m11.getTop() - paddingTop) / m11.getMeasuredHeight()) + 1.0f;
                                    if (top > 1.0f) {
                                        top = 1.0f;
                                    }
                                    cyVar.a.setOverScrollMode(2);
                                    i12 = (int) ((0.45f - (top * 0.25f)) * i9);
                                    if (i12 > -1) {
                                        i12 = -1;
                                    }
                                    UndoView undoView = undoViewArr[0];
                                    if (undoView != null && undoView.getVisibility() == 0) {
                                        undoViewArr[0].e(1, true);
                                    }
                                }
                                i11 = i12;
                                if (cyVar.s == 0) {
                                    viewOffset = ((int) cyVar.a.getViewOffset()) - i9;
                                    if (viewOffset >= 0.0f) {
                                    }
                                    cyVar.a.setViewsOffset(f10);
                                }
                                if (cyVar.s == 0) {
                                }
                                boolean z13 = z10;
                                o02 = super.o0(i11, g1Var, n1Var);
                                if (o02 == 0) {
                                    dy.q1(dyVar, cyVar, dyVar.P - (dyVar.A0.getOverScrollCoef() * i9));
                                }
                                return o02;
                            }
                            View m12 = cyVar.c.m(L0);
                            if (m12 != null && L0 < 10) {
                                int i15 = 0;
                                while (i10 < L0) {
                                    lw lwVar = cyVar.d;
                                    if (((of.k) lwVar.I.get(i10)).a == 0) {
                                        if (!((of.k) lwVar.I.get(i10)).f || lwVar.F) {
                                            dp = AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 76.0f : 70.0f);
                                        } else {
                                            dp = AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 86.0f : 91.0f);
                                        }
                                        i13 = dp + 1;
                                    } else {
                                        i13 = 0;
                                    }
                                    i15 += i13;
                                    i10++;
                                }
                                int i16 = (-(m12.getTop() - dp2)) + i15;
                                if (!dyVar.B3.c()) {
                                    kVar3 = ((org.telegram.ui.ActionBar.o2) dyVar).actionBar;
                                    if (kVar3 != null) {
                                        kVar4 = ((org.telegram.ui.ActionBar.o2) dyVar).actionBar;
                                    }
                                    i16 -= AndroidUtilities.dp(48.0f);
                                }
                                if (z10 && ((((ValueAnimator) cyVar.b.b) != null || dyVar.A0.g()) && !dyVar.B3.c() && !dyVar.N)) {
                                    i16 += AndroidUtilities.dp(81.0f);
                                }
                                if ((((ValueAnimator) cyVar.b.b) != null || dyVar.A0.g()) && !dyVar.B3.c() && !dyVar.N) {
                                    kVar = ((org.telegram.ui.ActionBar.o2) dyVar).actionBar;
                                    if (kVar != null) {
                                        kVar2 = ((org.telegram.ui.ActionBar.o2) dyVar).actionBar;
                                    }
                                    i16 += AndroidUtilities.dp(48.0f);
                                }
                                if (i16 < Math.abs(i9)) {
                                    i11 = -i16;
                                    if (cyVar.s == 0 && cyVar.a.getViewOffset() != 0.0f && i9 > 0 && z12) {
                                        viewOffset = ((int) cyVar.a.getViewOffset()) - i9;
                                        if (viewOffset >= 0.0f) {
                                            i11 = (int) viewOffset;
                                            f10 = 0.0f;
                                        } else {
                                            f10 = viewOffset;
                                            i11 = 0;
                                        }
                                        cyVar.a.setViewsOffset(f10);
                                    }
                                    if (cyVar.s == 0 || cyVar.v == 0 || !dyVar.Z3() || dyVar.N) {
                                        boolean z132 = z10;
                                        o02 = super.o0(i11, g1Var, n1Var);
                                        if (o02 == 0 && i9 < 0 && z12 && !dyVar.B3.c() && z132 && dyVar.p3 == 0.0f) {
                                            dy.q1(dyVar, cyVar, dyVar.P - (dyVar.A0.getOverScrollCoef() * i9));
                                        }
                                        return o02;
                                    }
                                    int o03 = super.o0(i11, g1Var, n1Var);
                                    kw kwVar2 = cyVar.n;
                                    if (kwVar2 != null) {
                                        kwVar2.a = o03;
                                    }
                                    int L02 = cyVar.c.L0();
                                    View m13 = L02 == 0 ? cyVar.c.m(L02) : null;
                                    if (L02 != 0 || m13 == null || m13.getBottom() - dp2 < AndroidUtilities.dp(4.0f)) {
                                        z11 = z10;
                                        dyVar.Y2 = 0L;
                                        dyVar.a3 = false;
                                        boolean z14 = cyVar.v != 2;
                                        cyVar.v = 2;
                                        if (z14 && AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
                                            AndroidUtilities.makeAccessibilityAnnouncement(LocaleController.getString(R.string.AccDescrArchivedChatsHidden));
                                        }
                                        kw kwVar3 = cyVar.n;
                                        if (kwVar3 != null) {
                                            ValueAnimator valueAnimator = kwVar3.z;
                                            if (valueAnimator != null) {
                                                valueAnimator.cancel();
                                            }
                                            org.telegram.ui.Cells.r2 r2Var = kwVar3.H;
                                            if (r2Var != null) {
                                                r2Var.removeCallbacks(kwVar3.d0);
                                            }
                                            kwVar3.x = 0.0f;
                                            kwVar3.y = false;
                                            kwVar3.e0 = false;
                                            cyVar.n.f(0.0f);
                                            cyVar.n.I = cyVar.a;
                                        }
                                    } else {
                                        boolean z15 = z10;
                                        if (dyVar.Y2 == 0) {
                                            dyVar.Y2 = System.currentTimeMillis();
                                        }
                                        if (cyVar.v == 2 && (kwVar = cyVar.n) != null) {
                                            kwVar.h();
                                        }
                                        if (z15 && !dyVar.B3.c() && !dyVar.N) {
                                            dp2 += AndroidUtilities.dp(81.0f);
                                        }
                                        float top2 = ((m13.getTop() - dp2) / m13.getMeasuredHeight()) + 1.0f;
                                        if (top2 > 1.0f) {
                                            top2 = 1.0f;
                                        }
                                        z11 = z15;
                                        boolean z16 = top2 > 0.85f && System.currentTimeMillis() - dyVar.Y2 > 220;
                                        if (dyVar.a3 != z16) {
                                            dyVar.a3 = z16;
                                            if (cyVar.v == 2) {
                                                try {
                                                    cyVar.a.performHapticFeedback(3, 2);
                                                } catch (Exception unused) {
                                                }
                                                kw kwVar4 = cyVar.n;
                                                if (kwVar4 != null) {
                                                    kwVar4.a(z16);
                                                }
                                            }
                                        }
                                        if (cyVar.v == 2 && i11 - o03 != 0 && i9 < 0 && z12) {
                                            cyVar.a.setViewsOffset(cyVar.a.getViewOffset() - ((i9 * 0.2f) * (1.0f - (cyVar.a.getViewOffset() / AndroidUtilities.dp(72.0f)))));
                                        }
                                        kw kwVar5 = cyVar.n;
                                        if (kwVar5 != null) {
                                            kwVar5.f(top2);
                                            cyVar.n.I = cyVar.a;
                                        }
                                    }
                                    if (m13 != null) {
                                        m13.invalidate();
                                    }
                                    if (cyVar.v == 1 && o03 == 0 && i9 < 0 && z12 && !dyVar.B3.c() && z11 && dyVar.p3 == 0.0f) {
                                        dy.q1(dyVar, cyVar, dyVar.P - (AndroidUtilities.lerp(0.2f, 0.5f, dyVar.A0.j0) * i9));
                                    }
                                    return o03;
                                }
                            }
                        }
                        i11 = i9;
                        if (cyVar.s == 0) {
                        }
                        if (cyVar.s == 0) {
                        }
                        boolean z1322 = z10;
                        o02 = super.o0(i11, g1Var, n1Var);
                        if (o02 == 0) {
                        }
                        return o02;
                    }
                }
                i10 = 0;
                if (i10 == 0) {
                }
                cyVar.a.setOverScrollMode(0);
                L0 = cyVar.c.L0();
                if (L0 == 0) {
                    L0 = 1;
                }
                if (z12) {
                }
            }
            z10 = false;
            int paddingTop2 = cyVar.a.getPaddingTop();
            if (z10) {
            }
            if (dyVar.N) {
            }
            i10 = 0;
            if (i10 == 0) {
            }
            cyVar.a.setOverScrollMode(0);
            L0 = cyVar.c.L0();
            if (L0 == 0) {
            }
            if (z12) {
            }
        }
        return 0;
    }

    @Override // f2.m0, f2.z0
    public final void v0(RecyclerView recyclerView, f2.n1 n1Var, int i9) {
        if (this.M.Z3() && i9 == 1) {
            super.v0(recyclerView, n1Var, i9);
            return;
        }
        rh.n nVar = new rh.n(recyclerView.getContext(), 0);
        nVar.a = i9;
        w0(nVar);
    }
}
