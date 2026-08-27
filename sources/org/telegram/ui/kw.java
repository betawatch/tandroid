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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class kw extends f2.k0 {
    public boolean I;
    public boolean J;
    public ValueAnimator K;
    public final /* synthetic */ fy L;
    public final /* synthetic */ gy M;

    public kw(gy gyVar, fy fyVar) {
        this.M = gyVar;
        this.L = fyVar;
    }

    @Override // f2.k0
    public final int R0() {
        fy fyVar = this.L;
        return (fyVar.s == 0 && this.M.Z3() && fyVar.v == 2) ? 1 : 0;
    }

    @Override // f2.k0, f2.x0
    public final void b0(f2.e1 e1Var, f2.l1 l1Var) {
        if (!BuildVars.DEBUG_PRIVATE_VERSION) {
            try {
                super.b0(e1Var, l1Var);
                return;
            } catch (IndexOutOfBoundsException e9) {
                FileLog.e(e9);
                AndroidUtilities.runOnUIThread(new jw(this.L, 0));
                return;
            }
        }
        try {
            super.b0(e1Var, l1Var);
        } catch (IndexOutOfBoundsException unused) {
            StringBuilder sb2 = new StringBuilder("Inconsistency detected. dialogsListIsFrozen=");
            gy gyVar = this.M;
            sb2.append(gyVar.O1);
            sb2.append(" lastUpdateAction=");
            sb2.append(gyVar.u3);
            throw new RuntimeException(sb2.toString());
        }
    }

    @Override // f2.k0
    public final void b1(View view, View view2, int i10, int i11) {
        this.I = true;
        super.b1(view, view2, i10, i11);
        this.I = false;
    }

    @Override // f2.x0
    public final void f0() {
        ValueAnimator valueAnimator = this.K;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.K.cancel();
        }
        fy fyVar = this.L;
        if (fyVar.a.getScrollState() != 1) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.M.P, 0.0f);
            this.K = ofFloat;
            ofFloat.addUpdateListener(new ag.t2(18, this, fyVar));
            this.K.addListener(new org.telegram.ui.Components.f11(this, 24));
            this.K.setDuration(200L);
            this.K.setInterpolator(org.telegram.ui.Components.er.f);
            this.K.start();
        }
    }

    @Override // f2.k0
    public final void h1(int i10, int i11) {
        if (this.I) {
            i11 -= this.L.a.getPaddingTop();
        }
        super.h1(i10, i11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        if (org.telegram.ui.gy.r1(r4, r6) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        if (r11.t() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x016d, code lost:
    
        if (r8.t() == false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x01c3, code lost:
    
        if (r8.t() == false) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x0248, code lost:
    
        if (r8 > (-1)) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0076, code lost:
    
        if (r11.t() == false) goto L38;
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
    @Override // f2.k0, f2.x0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int o0(int i10, f2.e1 e1Var, f2.l1 l1Var) {
        boolean z10;
        int i11;
        int L0;
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
        boolean z11;
        nw nwVar;
        float viewOffset;
        float f10;
        org.telegram.ui.ActionBar.k kVar5;
        org.telegram.ui.ActionBar.k kVar6;
        org.telegram.ui.ActionBar.k kVar7;
        org.telegram.ui.ActionBar.k kVar8;
        gy gyVar = this.M;
        UndoView[] undoViewArr = gyVar.u0;
        fy fyVar = this.L;
        cy cyVar = fyVar.a;
        int i15 = 0;
        if (!cyVar.T1) {
            boolean z12 = cyVar.getScrollState() == 1;
            if (z12 != this.J) {
                this.J = z12;
                if (!z12) {
                }
            }
            float f11 = 0.0f;
            if (i10 > 0 && gyVar.P != 0.0f) {
                kVar7 = ((org.telegram.ui.ActionBar.n2) gyVar).actionBar;
                if (kVar7 != null) {
                    kVar8 = ((org.telegram.ui.ActionBar.n2) gyVar).actionBar;
                }
                float f12 = gyVar.P - i10;
                if (f12 < 0.0f) {
                    i15 = (int) (-f12);
                } else {
                    f11 = f12;
                }
                gy.q1(gyVar, fyVar, f11);
                return super.o0(i15, e1Var, l1Var);
            }
            if (gyVar.G && gyVar.T2 == 0) {
                kVar5 = ((org.telegram.ui.ActionBar.n2) gyVar).actionBar;
                if (kVar5 != null) {
                    kVar6 = ((org.telegram.ui.ActionBar.n2) gyVar).actionBar;
                }
                z10 = true;
                int paddingTop = fyVar.a.getPaddingTop();
                int dp2 = (z10 || gyVar.B3.c() || gyVar.N) ? paddingTop : paddingTop - AndroidUtilities.dp(81.0f);
                if (gyVar.N && fyVar.s == 0 && !gyVar.h2 && gyVar.R2 == 0) {
                    if (gyVar.T2 == 0 && gyVar.getMessagesController().hasHiddenArchive() && fyVar.v == 2) {
                        i11 = 1;
                        if ((i11 == 0 || (z10 && !gyVar.B3.c())) && i10 < 0) {
                            fyVar.a.setOverScrollMode(0);
                            L0 = fyVar.c.L0();
                            if (L0 == 0 && (m10 = fyVar.c.m(L0)) != null && m10.getBottom() - dp2 <= AndroidUtilities.dp(1.0f)) {
                                L0 = 1;
                            }
                            if (z12) {
                                if (L0 != 0 || i11 == 0) {
                                    i12 = -1;
                                    if (((L0 == 1 && i11 != 0) || L0 == 0) && z10 && z12 && !gyVar.B3.c()) {
                                        if (gyVar.J == 0.0f) {
                                            fyVar.a.setOverScrollMode(0);
                                        } else {
                                            fyVar.a.setOverScrollMode(2);
                                        }
                                        i13 = (int) (i10 * 0.3f);
                                    }
                                } else {
                                    View m11 = fyVar.c.m(L0);
                                    float top = ((m11.getTop() - paddingTop) / m11.getMeasuredHeight()) + 1.0f;
                                    if (top > 1.0f) {
                                        top = 1.0f;
                                    }
                                    fyVar.a.setOverScrollMode(2);
                                    i13 = (int) ((0.45f - (top * 0.25f)) * i10);
                                    if (i13 > -1) {
                                        i13 = -1;
                                    }
                                    UndoView undoView = undoViewArr[0];
                                    if (undoView != null && undoView.getVisibility() == 0) {
                                        undoViewArr[0].e(1, true);
                                    }
                                }
                                i12 = i13;
                                if (fyVar.s == 0) {
                                    viewOffset = ((int) fyVar.a.getViewOffset()) - i10;
                                    if (viewOffset >= 0.0f) {
                                    }
                                    fyVar.a.setViewsOffset(f10);
                                }
                                if (fyVar.s == 0) {
                                }
                                boolean z13 = z10;
                                o02 = super.o0(i12, e1Var, l1Var);
                                if (o02 == 0) {
                                    gy.q1(gyVar, fyVar, gyVar.P - (gyVar.A0.getOverScrollCoef() * i10));
                                }
                                return o02;
                            }
                            View m12 = fyVar.c.m(L0);
                            if (m12 != null && L0 < 10) {
                                int i16 = 0;
                                while (i11 < L0) {
                                    ow owVar = fyVar.d;
                                    if (((pf.i) owVar.I.get(i11)).a == 0) {
                                        if (!((pf.i) owVar.I.get(i11)).f || owVar.F) {
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
                                if (!gyVar.B3.c()) {
                                    kVar3 = ((org.telegram.ui.ActionBar.n2) gyVar).actionBar;
                                    if (kVar3 != null) {
                                        kVar4 = ((org.telegram.ui.ActionBar.n2) gyVar).actionBar;
                                    }
                                    i17 -= AndroidUtilities.dp(48.0f);
                                }
                                if (z10 && ((((ValueAnimator) fyVar.b.b) != null || gyVar.A0.g()) && !gyVar.B3.c() && !gyVar.N)) {
                                    i17 += AndroidUtilities.dp(81.0f);
                                }
                                if ((((ValueAnimator) fyVar.b.b) != null || gyVar.A0.g()) && !gyVar.B3.c() && !gyVar.N) {
                                    kVar = ((org.telegram.ui.ActionBar.n2) gyVar).actionBar;
                                    if (kVar != null) {
                                        kVar2 = ((org.telegram.ui.ActionBar.n2) gyVar).actionBar;
                                    }
                                    i17 += AndroidUtilities.dp(48.0f);
                                }
                                if (i17 < Math.abs(i10)) {
                                    i12 = -i17;
                                    if (fyVar.s == 0 && fyVar.a.getViewOffset() != 0.0f && i10 > 0 && z12) {
                                        viewOffset = ((int) fyVar.a.getViewOffset()) - i10;
                                        if (viewOffset >= 0.0f) {
                                            i12 = (int) viewOffset;
                                            f10 = 0.0f;
                                        } else {
                                            f10 = viewOffset;
                                            i12 = 0;
                                        }
                                        fyVar.a.setViewsOffset(f10);
                                    }
                                    if (fyVar.s == 0 || fyVar.v == 0 || !gyVar.Z3() || gyVar.N) {
                                        boolean z132 = z10;
                                        o02 = super.o0(i12, e1Var, l1Var);
                                        if (o02 == 0 && i10 < 0 && z12 && !gyVar.B3.c() && z132 && gyVar.p3 == 0.0f) {
                                            gy.q1(gyVar, fyVar, gyVar.P - (gyVar.A0.getOverScrollCoef() * i10));
                                        }
                                        return o02;
                                    }
                                    int o03 = super.o0(i12, e1Var, l1Var);
                                    nw nwVar2 = fyVar.n;
                                    if (nwVar2 != null) {
                                        nwVar2.a = o03;
                                    }
                                    int L02 = fyVar.c.L0();
                                    View m13 = L02 == 0 ? fyVar.c.m(L02) : null;
                                    if (L02 != 0 || m13 == null || m13.getBottom() - dp2 < AndroidUtilities.dp(4.0f)) {
                                        z11 = z10;
                                        gyVar.Y2 = 0L;
                                        gyVar.a3 = false;
                                        boolean z14 = fyVar.v != 2;
                                        fyVar.v = 2;
                                        if (z14 && AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
                                            AndroidUtilities.makeAccessibilityAnnouncement(LocaleController.getString(R.string.AccDescrArchivedChatsHidden));
                                        }
                                        nw nwVar3 = fyVar.n;
                                        if (nwVar3 != null) {
                                            ValueAnimator valueAnimator = nwVar3.z;
                                            if (valueAnimator != null) {
                                                valueAnimator.cancel();
                                            }
                                            org.telegram.ui.Cells.p2 p2Var = nwVar3.H;
                                            if (p2Var != null) {
                                                p2Var.removeCallbacks(nwVar3.d0);
                                            }
                                            nwVar3.x = 0.0f;
                                            nwVar3.y = false;
                                            nwVar3.e0 = false;
                                            fyVar.n.f(0.0f);
                                            fyVar.n.I = fyVar.a;
                                        }
                                    } else {
                                        boolean z15 = z10;
                                        if (gyVar.Y2 == 0) {
                                            gyVar.Y2 = System.currentTimeMillis();
                                        }
                                        if (fyVar.v == 2 && (nwVar = fyVar.n) != null) {
                                            nwVar.h();
                                        }
                                        if (z15 && !gyVar.B3.c() && !gyVar.N) {
                                            dp2 += AndroidUtilities.dp(81.0f);
                                        }
                                        float top2 = ((m13.getTop() - dp2) / m13.getMeasuredHeight()) + 1.0f;
                                        if (top2 > 1.0f) {
                                            top2 = 1.0f;
                                        }
                                        z11 = z15;
                                        boolean z16 = top2 > 0.85f && System.currentTimeMillis() - gyVar.Y2 > 220;
                                        if (gyVar.a3 != z16) {
                                            gyVar.a3 = z16;
                                            if (fyVar.v == 2) {
                                                try {
                                                    fyVar.a.performHapticFeedback(3, 2);
                                                } catch (Exception unused) {
                                                }
                                                nw nwVar4 = fyVar.n;
                                                if (nwVar4 != null) {
                                                    nwVar4.a(z16);
                                                }
                                            }
                                        }
                                        if (fyVar.v == 2 && i12 - o03 != 0 && i10 < 0 && z12) {
                                            fyVar.a.setViewsOffset(fyVar.a.getViewOffset() - ((i10 * 0.2f) * (1.0f - (fyVar.a.getViewOffset() / AndroidUtilities.dp(72.0f)))));
                                        }
                                        nw nwVar5 = fyVar.n;
                                        if (nwVar5 != null) {
                                            nwVar5.f(top2);
                                            fyVar.n.I = fyVar.a;
                                        }
                                    }
                                    if (m13 != null) {
                                        m13.invalidate();
                                    }
                                    if (fyVar.v == 1 && o03 == 0 && i10 < 0 && z12 && !gyVar.B3.c() && z11 && gyVar.p3 == 0.0f) {
                                        gy.q1(gyVar, fyVar, gyVar.P - (AndroidUtilities.lerp(0.2f, 0.5f, gyVar.A0.j0) * i10));
                                    }
                                    return o03;
                                }
                            }
                        }
                        i12 = i10;
                        if (fyVar.s == 0) {
                        }
                        if (fyVar.s == 0) {
                        }
                        boolean z1322 = z10;
                        o02 = super.o0(i12, e1Var, l1Var);
                        if (o02 == 0) {
                        }
                        return o02;
                    }
                }
                i11 = 0;
                if (i11 == 0) {
                }
                fyVar.a.setOverScrollMode(0);
                L0 = fyVar.c.L0();
                if (L0 == 0) {
                    L0 = 1;
                }
                if (z12) {
                }
            }
            z10 = false;
            int paddingTop2 = fyVar.a.getPaddingTop();
            if (z10) {
            }
            if (gyVar.N) {
            }
            i11 = 0;
            if (i11 == 0) {
            }
            fyVar.a.setOverScrollMode(0);
            L0 = fyVar.c.L0();
            if (L0 == 0) {
            }
            if (z12) {
            }
        }
        return 0;
    }

    @Override // f2.k0, f2.x0
    public final void v0(RecyclerView recyclerView, f2.l1 l1Var, int i10) {
        if (this.M.Z3() && i10 == 1) {
            super.v0(recyclerView, l1Var, i10);
            return;
        }
        sh.n nVar = new sh.n(recyclerView.getContext(), 0);
        nVar.a = i10;
        w0(nVar);
    }
}
