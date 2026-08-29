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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class jw extends f2.j0 {
    public boolean I;
    public boolean J;
    public ValueAnimator K;
    public final /* synthetic */ ey L;
    public final /* synthetic */ fy M;

    public jw(fy fyVar, ey eyVar) {
        this.M = fyVar;
        this.L = eyVar;
    }

    @Override // f2.j0
    public final int R0() {
        ey eyVar = this.L;
        return (eyVar.s == 0 && this.M.Z3() && eyVar.v == 2) ? 1 : 0;
    }

    @Override // f2.j0, f2.w0
    public final void b0(f2.d1 d1Var, f2.k1 k1Var) {
        if (!BuildVars.DEBUG_PRIVATE_VERSION) {
            try {
                super.b0(d1Var, k1Var);
                return;
            } catch (IndexOutOfBoundsException e10) {
                FileLog.e(e10);
                AndroidUtilities.runOnUIThread(new iw(this.L, 0));
                return;
            }
        }
        try {
            super.b0(d1Var, k1Var);
        } catch (IndexOutOfBoundsException unused) {
            StringBuilder sb2 = new StringBuilder("Inconsistency detected. dialogsListIsFrozen=");
            fy fyVar = this.M;
            sb2.append(fyVar.O1);
            sb2.append(" lastUpdateAction=");
            sb2.append(fyVar.u3);
            throw new RuntimeException(sb2.toString());
        }
    }

    @Override // f2.j0
    public final void b1(View view, View view2, int i10, int i11) {
        this.I = true;
        super.b1(view, view2, i10, i11);
        this.I = false;
    }

    @Override // f2.w0
    public final void f0() {
        ValueAnimator valueAnimator = this.K;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.K.cancel();
        }
        ey eyVar = this.L;
        if (eyVar.a.getScrollState() != 1) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.M.P, 0.0f);
            this.K = ofFloat;
            ofFloat.addUpdateListener(new bg.b3(19, this, eyVar));
            this.K.addListener(new org.telegram.ui.Components.p11(this, 24));
            this.K.setDuration(200L);
            this.K.setInterpolator(org.telegram.ui.Components.jr.f);
            this.K.start();
        }
    }

    @Override // f2.j0
    public final void h1(int i10, int i11) {
        if (this.I) {
            i11 -= this.L.a.getPaddingTop();
        }
        super.h1(i10, i11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        if (org.telegram.ui.fy.r1(r4, r6) != false) goto L15;
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
    @Override // f2.j0, f2.w0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int o0(int i10, f2.d1 d1Var, f2.k1 k1Var) {
        boolean z10;
        int i11;
        int L0;
        int i12;
        int i13;
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        org.telegram.ui.ActionBar.l lVar3;
        org.telegram.ui.ActionBar.l lVar4;
        int i14;
        int dp;
        View m10;
        int o02;
        boolean z11;
        mw mwVar;
        float viewOffset;
        float f9;
        org.telegram.ui.ActionBar.l lVar5;
        org.telegram.ui.ActionBar.l lVar6;
        org.telegram.ui.ActionBar.l lVar7;
        org.telegram.ui.ActionBar.l lVar8;
        fy fyVar = this.M;
        UndoView[] undoViewArr = fyVar.u0;
        ey eyVar = this.L;
        ay ayVar = eyVar.a;
        int i15 = 0;
        if (!ayVar.T1) {
            boolean z12 = ayVar.getScrollState() == 1;
            if (z12 != this.J) {
                this.J = z12;
                if (!z12) {
                }
            }
            float f10 = 0.0f;
            if (i10 > 0 && fyVar.P != 0.0f) {
                lVar7 = ((org.telegram.ui.ActionBar.o2) fyVar).actionBar;
                if (lVar7 != null) {
                    lVar8 = ((org.telegram.ui.ActionBar.o2) fyVar).actionBar;
                }
                float f11 = fyVar.P - i10;
                if (f11 < 0.0f) {
                    i15 = (int) (-f11);
                } else {
                    f10 = f11;
                }
                fy.q1(fyVar, eyVar, f10);
                return super.o0(i15, d1Var, k1Var);
            }
            if (fyVar.G && fyVar.T2 == 0) {
                lVar5 = ((org.telegram.ui.ActionBar.o2) fyVar).actionBar;
                if (lVar5 != null) {
                    lVar6 = ((org.telegram.ui.ActionBar.o2) fyVar).actionBar;
                }
                z10 = true;
                int paddingTop = eyVar.a.getPaddingTop();
                int dp2 = (z10 || fyVar.B3.c() || fyVar.N) ? paddingTop : paddingTop - AndroidUtilities.dp(81.0f);
                if (fyVar.N && eyVar.s == 0 && !fyVar.h2 && fyVar.R2 == 0) {
                    if (fyVar.T2 == 0 && fyVar.getMessagesController().hasHiddenArchive() && eyVar.v == 2) {
                        i11 = 1;
                        if ((i11 == 0 || (z10 && !fyVar.B3.c())) && i10 < 0) {
                            eyVar.a.setOverScrollMode(0);
                            L0 = eyVar.c.L0();
                            if (L0 == 0 && (m10 = eyVar.c.m(L0)) != null && m10.getBottom() - dp2 <= AndroidUtilities.dp(1.0f)) {
                                L0 = 1;
                            }
                            if (z12) {
                                if (L0 != 0 || i11 == 0) {
                                    i12 = -1;
                                    if (((L0 == 1 && i11 != 0) || L0 == 0) && z10 && z12 && !fyVar.B3.c()) {
                                        if (fyVar.J == 0.0f) {
                                            eyVar.a.setOverScrollMode(0);
                                        } else {
                                            eyVar.a.setOverScrollMode(2);
                                        }
                                        i13 = (int) (i10 * 0.3f);
                                    }
                                } else {
                                    View m11 = eyVar.c.m(L0);
                                    float top = ((m11.getTop() - paddingTop) / m11.getMeasuredHeight()) + 1.0f;
                                    if (top > 1.0f) {
                                        top = 1.0f;
                                    }
                                    eyVar.a.setOverScrollMode(2);
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
                                if (eyVar.s == 0) {
                                    viewOffset = ((int) eyVar.a.getViewOffset()) - i10;
                                    if (viewOffset >= 0.0f) {
                                    }
                                    eyVar.a.setViewsOffset(f9);
                                }
                                if (eyVar.s == 0) {
                                }
                                boolean z13 = z10;
                                o02 = super.o0(i12, d1Var, k1Var);
                                if (o02 == 0) {
                                    fy.q1(fyVar, eyVar, fyVar.P - (fyVar.A0.getOverScrollCoef() * i10));
                                }
                                return o02;
                            }
                            View m12 = eyVar.c.m(L0);
                            if (m12 != null && L0 < 10) {
                                int i16 = 0;
                                while (i11 < L0) {
                                    nw nwVar = eyVar.d;
                                    if (((rf.j) nwVar.I.get(i11)).a == 0) {
                                        if (!((rf.j) nwVar.I.get(i11)).f || nwVar.F) {
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
                                if (!fyVar.B3.c()) {
                                    lVar3 = ((org.telegram.ui.ActionBar.o2) fyVar).actionBar;
                                    if (lVar3 != null) {
                                        lVar4 = ((org.telegram.ui.ActionBar.o2) fyVar).actionBar;
                                    }
                                    i17 -= AndroidUtilities.dp(48.0f);
                                }
                                if (z10 && ((((ValueAnimator) eyVar.b.c) != null || fyVar.A0.g()) && !fyVar.B3.c() && !fyVar.N)) {
                                    i17 += AndroidUtilities.dp(81.0f);
                                }
                                if ((((ValueAnimator) eyVar.b.c) != null || fyVar.A0.g()) && !fyVar.B3.c() && !fyVar.N) {
                                    lVar = ((org.telegram.ui.ActionBar.o2) fyVar).actionBar;
                                    if (lVar != null) {
                                        lVar2 = ((org.telegram.ui.ActionBar.o2) fyVar).actionBar;
                                    }
                                    i17 += AndroidUtilities.dp(48.0f);
                                }
                                if (i17 < Math.abs(i10)) {
                                    i12 = -i17;
                                    if (eyVar.s == 0 && eyVar.a.getViewOffset() != 0.0f && i10 > 0 && z12) {
                                        viewOffset = ((int) eyVar.a.getViewOffset()) - i10;
                                        if (viewOffset >= 0.0f) {
                                            i12 = (int) viewOffset;
                                            f9 = 0.0f;
                                        } else {
                                            f9 = viewOffset;
                                            i12 = 0;
                                        }
                                        eyVar.a.setViewsOffset(f9);
                                    }
                                    if (eyVar.s == 0 || eyVar.v == 0 || !fyVar.Z3() || fyVar.N) {
                                        boolean z132 = z10;
                                        o02 = super.o0(i12, d1Var, k1Var);
                                        if (o02 == 0 && i10 < 0 && z12 && !fyVar.B3.c() && z132 && fyVar.p3 == 0.0f) {
                                            fy.q1(fyVar, eyVar, fyVar.P - (fyVar.A0.getOverScrollCoef() * i10));
                                        }
                                        return o02;
                                    }
                                    int o03 = super.o0(i12, d1Var, k1Var);
                                    mw mwVar2 = eyVar.n;
                                    if (mwVar2 != null) {
                                        mwVar2.a = o03;
                                    }
                                    int L02 = eyVar.c.L0();
                                    View m13 = L02 == 0 ? eyVar.c.m(L02) : null;
                                    if (L02 != 0 || m13 == null || m13.getBottom() - dp2 < AndroidUtilities.dp(4.0f)) {
                                        z11 = z10;
                                        fyVar.Y2 = 0L;
                                        fyVar.a3 = false;
                                        boolean z14 = eyVar.v != 2;
                                        eyVar.v = 2;
                                        if (z14 && AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
                                            AndroidUtilities.makeAccessibilityAnnouncement(LocaleController.getString(R.string.AccDescrArchivedChatsHidden));
                                        }
                                        mw mwVar3 = eyVar.n;
                                        if (mwVar3 != null) {
                                            ValueAnimator valueAnimator = mwVar3.z;
                                            if (valueAnimator != null) {
                                                valueAnimator.cancel();
                                            }
                                            org.telegram.ui.Cells.p2 p2Var = mwVar3.H;
                                            if (p2Var != null) {
                                                p2Var.removeCallbacks(mwVar3.d0);
                                            }
                                            mwVar3.x = 0.0f;
                                            mwVar3.y = false;
                                            mwVar3.e0 = false;
                                            eyVar.n.f(0.0f);
                                            eyVar.n.I = eyVar.a;
                                        }
                                    } else {
                                        boolean z15 = z10;
                                        if (fyVar.Y2 == 0) {
                                            fyVar.Y2 = System.currentTimeMillis();
                                        }
                                        if (eyVar.v == 2 && (mwVar = eyVar.n) != null) {
                                            mwVar.h();
                                        }
                                        if (z15 && !fyVar.B3.c() && !fyVar.N) {
                                            dp2 += AndroidUtilities.dp(81.0f);
                                        }
                                        float top2 = ((m13.getTop() - dp2) / m13.getMeasuredHeight()) + 1.0f;
                                        if (top2 > 1.0f) {
                                            top2 = 1.0f;
                                        }
                                        z11 = z15;
                                        boolean z16 = top2 > 0.85f && System.currentTimeMillis() - fyVar.Y2 > 220;
                                        if (fyVar.a3 != z16) {
                                            fyVar.a3 = z16;
                                            if (eyVar.v == 2) {
                                                try {
                                                    eyVar.a.performHapticFeedback(3, 2);
                                                } catch (Exception unused) {
                                                }
                                                mw mwVar4 = eyVar.n;
                                                if (mwVar4 != null) {
                                                    mwVar4.a(z16);
                                                }
                                            }
                                        }
                                        if (eyVar.v == 2 && i12 - o03 != 0 && i10 < 0 && z12) {
                                            eyVar.a.setViewsOffset(eyVar.a.getViewOffset() - ((i10 * 0.2f) * (1.0f - (eyVar.a.getViewOffset() / AndroidUtilities.dp(72.0f)))));
                                        }
                                        mw mwVar5 = eyVar.n;
                                        if (mwVar5 != null) {
                                            mwVar5.f(top2);
                                            eyVar.n.I = eyVar.a;
                                        }
                                    }
                                    if (m13 != null) {
                                        m13.invalidate();
                                    }
                                    if (eyVar.v == 1 && o03 == 0 && i10 < 0 && z12 && !fyVar.B3.c() && z11 && fyVar.p3 == 0.0f) {
                                        fy.q1(fyVar, eyVar, fyVar.P - (AndroidUtilities.lerp(0.2f, 0.5f, fyVar.A0.j0) * i10));
                                    }
                                    return o03;
                                }
                            }
                        }
                        i12 = i10;
                        if (eyVar.s == 0) {
                        }
                        if (eyVar.s == 0) {
                        }
                        boolean z1322 = z10;
                        o02 = super.o0(i12, d1Var, k1Var);
                        if (o02 == 0) {
                        }
                        return o02;
                    }
                }
                i11 = 0;
                if (i11 == 0) {
                }
                eyVar.a.setOverScrollMode(0);
                L0 = eyVar.c.L0();
                if (L0 == 0) {
                    L0 = 1;
                }
                if (z12) {
                }
            }
            z10 = false;
            int paddingTop2 = eyVar.a.getPaddingTop();
            if (z10) {
            }
            if (fyVar.N) {
            }
            i11 = 0;
            if (i11 == 0) {
            }
            eyVar.a.setOverScrollMode(0);
            L0 = eyVar.c.L0();
            if (L0 == 0) {
            }
            if (z12) {
            }
        }
        return 0;
    }

    @Override // f2.j0, f2.w0
    public final void v0(RecyclerView recyclerView, f2.k1 k1Var, int i10) {
        if (this.M.Z3() && i10 == 1) {
            super.v0(recyclerView, k1Var, i10);
            return;
        }
        uh.n nVar = new uh.n(recyclerView.getContext(), 0);
        nVar.a = i10;
        w0(nVar);
    }
}
