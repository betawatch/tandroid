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

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class hw extends s4.b0 {
    public boolean I;
    public boolean J;
    public ValueAnimator K;
    public final /* synthetic */ dy L;
    public final /* synthetic */ ey M;

    public hw(ey eyVar, dy dyVar) {
        this.M = eyVar;
        this.L = dyVar;
    }

    @Override // s4.b0
    public final int R0() {
        dy dyVar = this.L;
        return (dyVar.s == 0 && this.M.X3() && dyVar.v == 2) ? 1 : 0;
    }

    @Override // s4.b0, s4.n0
    public final void b0(qf.e eVar, s4.y0 y0Var) {
        if (!BuildVars.DEBUG_PRIVATE_VERSION) {
            try {
                super.b0(eVar, y0Var);
                return;
            } catch (IndexOutOfBoundsException e) {
                FileLog.e(e);
                AndroidUtilities.runOnUIThread(new gw(this.L, 0));
                return;
            }
        }
        try {
            super.b0(eVar, y0Var);
        } catch (IndexOutOfBoundsException unused) {
            StringBuilder sb2 = new StringBuilder("Inconsistency detected. dialogsListIsFrozen=");
            ey eyVar = this.M;
            sb2.append(eyVar.S1);
            sb2.append(" lastUpdateAction=");
            sb2.append(eyVar.z3);
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
        dy dyVar = this.L;
        if (dyVar.a.getScrollState() != 1) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.M.T, 0.0f);
            this.K = ofFloat;
            int i10 = 23;
            ofFloat.addUpdateListener(new ah.l0(i10, this, dyVar));
            this.K.addListener(new org.telegram.ui.Components.p31(this, i10));
            this.K.setDuration(200L);
            this.K.setInterpolator(org.telegram.ui.Components.bs.f);
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
    
        if (org.telegram.ui.ey.n1(r4, r6) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        if (r11.s() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x016e, code lost:
    
        if (r8.s() == false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x01c4, code lost:
    
        if (r8.s() == false) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x024a, code lost:
    
        if (r8 > (-1)) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0076, code lost:
    
        if (r11.s() == false) goto L38;
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
        kw kwVar;
        float viewOffset;
        float f7;
        org.telegram.ui.ActionBar.k kVar5;
        org.telegram.ui.ActionBar.k kVar6;
        org.telegram.ui.ActionBar.k kVar7;
        org.telegram.ui.ActionBar.k kVar8;
        ey eyVar = this.M;
        UndoView[] undoViewArr = eyVar.y0;
        dy dyVar = this.L;
        zx zxVar = dyVar.a;
        int i15 = 0;
        if (!zxVar.V1) {
            boolean z14 = zxVar.getScrollState() == 1;
            if (z14 != this.J) {
                this.J = z14;
                if (!z14) {
                }
            }
            float f10 = 0.0f;
            if (i10 > 0 && eyVar.T != 0.0f) {
                kVar7 = ((org.telegram.ui.ActionBar.o2) eyVar).actionBar;
                if (kVar7 != null) {
                    kVar8 = ((org.telegram.ui.ActionBar.o2) eyVar).actionBar;
                }
                float f11 = eyVar.T - i10;
                if (f11 < 0.0f) {
                    i15 = (int) (-f11);
                } else {
                    f10 = f11;
                }
                ey.m1(eyVar, dyVar, f10);
                return super.o0(i15, eVar, y0Var);
            }
            if (eyVar.K && eyVar.Y2 == 0) {
                kVar5 = ((org.telegram.ui.ActionBar.o2) eyVar).actionBar;
                if (kVar5 != null) {
                    kVar6 = ((org.telegram.ui.ActionBar.o2) eyVar).actionBar;
                }
                z10 = true;
                int paddingTop = dyVar.a.getPaddingTop();
                int dp2 = (z10 || eyVar.G3.c() || eyVar.R) ? paddingTop : paddingTop - AndroidUtilities.dp(81.0f);
                if (eyVar.R && dyVar.s == 0 && !eyVar.l2 && eyVar.W2 == 0) {
                    z11 = true;
                    if (eyVar.Y2 == 0 && eyVar.getMessagesController().hasHiddenArchive() && dyVar.v == 2) {
                        i11 = 1;
                        if ((i11 == 0 || (z10 && !eyVar.G3.c())) && i10 < 0) {
                            dyVar.a.setOverScrollMode(0);
                            L0 = dyVar.c.L0();
                            z12 = z11;
                            if (L0 == 0 && (m10 = dyVar.c.m(L0)) != null && m10.getBottom() - dp2 <= AndroidUtilities.dp(1.0f)) {
                                L0 = z12 ? 1 : 0;
                            }
                            if (z14) {
                                if (L0 != 0 || i11 == 0) {
                                    i12 = -1;
                                    if (((L0 == z12 && i11 != 0) || L0 == 0) && z10 && z14 && !eyVar.G3.c()) {
                                        if (eyVar.N == 0.0f) {
                                            dyVar.a.setOverScrollMode(0);
                                        } else {
                                            dyVar.a.setOverScrollMode(2);
                                        }
                                        i13 = (int) (i10 * 0.3f);
                                    }
                                } else {
                                    View m11 = dyVar.c.m(L0);
                                    float top = ((m11.getTop() - paddingTop) / m11.getMeasuredHeight()) + 1.0f;
                                    if (top > 1.0f) {
                                        top = 1.0f;
                                    }
                                    dyVar.a.setOverScrollMode(2);
                                    i13 = (int) com.google.android.gms.internal.play_billing.k3.B(top, 0.25f, 0.45f, i10);
                                    if (i13 > -1) {
                                        i13 = -1;
                                    }
                                    UndoView undoView = undoViewArr[0];
                                    if (undoView != null && undoView.getVisibility() == 0) {
                                        undoViewArr[0].d(z12 ? 1 : 0, z12);
                                    }
                                }
                                i12 = i13;
                                if (dyVar.s == 0) {
                                    viewOffset = ((int) dyVar.a.getViewOffset()) - i10;
                                    if (viewOffset >= 0.0f) {
                                    }
                                    dyVar.a.setViewsOffset(f7);
                                }
                                if (dyVar.s == 0) {
                                }
                                boolean z15 = z10;
                                o02 = super.o0(i12, eVar, y0Var);
                                if (o02 == 0) {
                                    ey.m1(eyVar, dyVar, eyVar.T - (eyVar.E0.getOverScrollCoef() * i10));
                                }
                                return o02;
                            }
                            View m12 = dyVar.c.m(L0);
                            if (m12 != null && L0 < 10) {
                                int i16 = 0;
                                while (i11 < L0) {
                                    lw lwVar = dyVar.d;
                                    if (((hg.k) lwVar.M.get(i11)).a == 0) {
                                        if (!((hg.k) lwVar.M.get(i11)).f || lwVar.J) {
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
                                if (!eyVar.G3.c()) {
                                    kVar3 = ((org.telegram.ui.ActionBar.o2) eyVar).actionBar;
                                    if (kVar3 != null) {
                                        kVar4 = ((org.telegram.ui.ActionBar.o2) eyVar).actionBar;
                                    }
                                    i17 -= AndroidUtilities.dp(48.0f);
                                }
                                if (z10 && ((((ValueAnimator) dyVar.b.c) != null || eyVar.E0.g()) && !eyVar.G3.c() && !eyVar.R)) {
                                    i17 += AndroidUtilities.dp(81.0f);
                                }
                                if ((((ValueAnimator) dyVar.b.c) != null || eyVar.E0.g()) && !eyVar.G3.c() && !eyVar.R) {
                                    kVar = ((org.telegram.ui.ActionBar.o2) eyVar).actionBar;
                                    if (kVar != null) {
                                        kVar2 = ((org.telegram.ui.ActionBar.o2) eyVar).actionBar;
                                    }
                                    i17 += AndroidUtilities.dp(48.0f);
                                }
                                if (i17 < Math.abs(i10)) {
                                    i12 = -i17;
                                    if (dyVar.s == 0 && dyVar.a.getViewOffset() != 0.0f && i10 > 0 && z14) {
                                        viewOffset = ((int) dyVar.a.getViewOffset()) - i10;
                                        if (viewOffset >= 0.0f) {
                                            i12 = (int) viewOffset;
                                            f7 = 0.0f;
                                        } else {
                                            f7 = viewOffset;
                                            i12 = 0;
                                        }
                                        dyVar.a.setViewsOffset(f7);
                                    }
                                    if (dyVar.s == 0 || dyVar.v == 0 || !eyVar.X3() || eyVar.R) {
                                        boolean z152 = z10;
                                        o02 = super.o0(i12, eVar, y0Var);
                                        if (o02 == 0 && i10 < 0 && z14 && !eyVar.G3.c() && z152 && eyVar.u3 == 0.0f) {
                                            ey.m1(eyVar, dyVar, eyVar.T - (eyVar.E0.getOverScrollCoef() * i10));
                                        }
                                        return o02;
                                    }
                                    int o03 = super.o0(i12, eVar, y0Var);
                                    kw kwVar2 = dyVar.n;
                                    if (kwVar2 != null) {
                                        kwVar2.a = o03;
                                    }
                                    int L02 = dyVar.c.L0();
                                    View m13 = L02 == 0 ? dyVar.c.m(L02) : null;
                                    if (L02 != 0 || m13 == null || m13.getBottom() - dp2 < AndroidUtilities.dp(4.0f)) {
                                        boolean z16 = z10;
                                        eyVar.d3 = 0L;
                                        eyVar.f3 = false;
                                        boolean z17 = dyVar.v != 2;
                                        dyVar.v = 2;
                                        if (z17 && AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
                                            AndroidUtilities.makeAccessibilityAnnouncement(LocaleController.getString(R.string.AccDescrArchivedChatsHidden));
                                        }
                                        kw kwVar3 = dyVar.n;
                                        z13 = z16;
                                        if (kwVar3 != null) {
                                            ValueAnimator valueAnimator = kwVar3.z;
                                            if (valueAnimator != null) {
                                                valueAnimator.cancel();
                                            }
                                            org.telegram.ui.Cells.q2 q2Var = kwVar3.H;
                                            if (q2Var != null) {
                                                q2Var.removeCallbacks(kwVar3.d0);
                                            }
                                            kwVar3.x = 0.0f;
                                            kwVar3.y = false;
                                            kwVar3.e0 = false;
                                            dyVar.n.f(0.0f);
                                            dyVar.n.I = dyVar.a;
                                            z13 = z16;
                                        }
                                    } else {
                                        boolean z18 = z10;
                                        if (eyVar.d3 == 0) {
                                            eyVar.d3 = System.currentTimeMillis();
                                        }
                                        if (dyVar.v == 2 && (kwVar = dyVar.n) != null) {
                                            kwVar.h();
                                        }
                                        if (z18 && !eyVar.G3.c() && !eyVar.R) {
                                            dp2 += AndroidUtilities.dp(81.0f);
                                        }
                                        float top2 = ((m13.getTop() - dp2) / m13.getMeasuredHeight()) + 1.0f;
                                        if (top2 > 1.0f) {
                                            top2 = 1.0f;
                                        }
                                        boolean z19 = z18;
                                        boolean z20 = top2 > 0.85f && System.currentTimeMillis() - eyVar.d3 > 220;
                                        if (eyVar.f3 != z20) {
                                            eyVar.f3 = z20;
                                            if (dyVar.v == 2) {
                                                try {
                                                    dyVar.a.performHapticFeedback(3, 2);
                                                } catch (Exception unused) {
                                                }
                                                kw kwVar4 = dyVar.n;
                                                if (kwVar4 != null) {
                                                    kwVar4.a(z20);
                                                }
                                            }
                                        }
                                        if (dyVar.v == 2 && i12 - o03 != 0 && i10 < 0 && z14) {
                                            dyVar.a.setViewsOffset(org.telegram.ui.Cells.b1.x(i10, 0.2f, 1.0f - (dyVar.a.getViewOffset() / AndroidUtilities.dp(72.0f)), dyVar.a.getViewOffset()));
                                        }
                                        kw kwVar5 = dyVar.n;
                                        z13 = z19;
                                        if (kwVar5 != null) {
                                            kwVar5.f(top2);
                                            dyVar.n.I = dyVar.a;
                                            z13 = z19;
                                        }
                                    }
                                    if (m13 != null) {
                                        m13.invalidate();
                                    }
                                    if (dyVar.v == 1 && o03 == 0 && i10 < 0 && z14 && !eyVar.G3.c() && z13 && eyVar.u3 == 0.0f) {
                                        ey.m1(eyVar, dyVar, eyVar.T - (AndroidUtilities.lerp(0.2f, 0.5f, eyVar.E0.n0) * i10));
                                    }
                                    return o03;
                                }
                            }
                        }
                        i12 = i10;
                        if (dyVar.s == 0) {
                        }
                        if (dyVar.s == 0) {
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
                dyVar.a.setOverScrollMode(0);
                L0 = dyVar.c.L0();
                z12 = z11;
                if (L0 == 0) {
                    L0 = z12 ? 1 : 0;
                }
                if (z14) {
                }
            }
            z10 = false;
            int paddingTop2 = dyVar.a.getPaddingTop();
            if (z10) {
            }
            if (eyVar.R) {
            }
            z11 = true;
            i11 = 0;
            if (i11 == 0) {
            }
            dyVar.a.setOverScrollMode(0);
            L0 = dyVar.c.L0();
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
        if (this.M.X3() && i10 == 1) {
            super.v0(recyclerView, y0Var, i10);
            return;
        }
        li.n nVar = new li.n(recyclerView.getContext(), 0);
        nVar.a = i10;
        w0(nVar);
    }
}
