package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class cz0 implements org.telegram.ui.ActionBar.h6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.m2 b;

    public /* synthetic */ cz0(int i10, org.telegram.ui.ActionBar.m2 m2Var) {
        this.a = i10;
        this.b = m2Var;
    }

    @Override // org.telegram.ui.ActionBar.h6
    public final /* synthetic */ void a(float f7) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.ActionBar.h6
    public final void b() {
        ValueAnimator valueAnimator;
        int i10 = this.a;
        int i11 = 0;
        org.telegram.ui.ActionBar.m2 m2Var = this.b;
        switch (i10) {
            case 0:
                ProfileActivity.V((ProfileActivity) m2Var);
                break;
            case 1:
                c21 c21Var = (c21) m2Var;
                org.telegram.ui.Components.mm0 mm0Var = c21Var.a;
                if (mm0Var != null) {
                    int childCount = mm0Var.getChildCount();
                    while (i11 < childCount) {
                        View childAt = c21Var.a.getChildAt(i11);
                        if (childAt instanceof org.telegram.ui.Cells.wa) {
                            ((org.telegram.ui.Cells.wa) childAt).b();
                        }
                        i11++;
                    }
                    break;
                }
                break;
            case 2:
                v21 v21Var = (v21) m2Var;
                if (v21Var.h != null && ((valueAnimator = v21Var.G) == null || !valueAnimator.isRunning())) {
                    v21Var.h.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, v21Var.F ? org.telegram.ui.ActionBar.g6.q6 : org.telegram.ui.ActionBar.g6.z6, false));
                }
                if (v21Var.a != null) {
                    int i12 = 0;
                    while (true) {
                        EditTextBoldCursor[] editTextBoldCursorArr = v21Var.a;
                        if (i12 >= editTextBoldCursorArr.length) {
                            break;
                        } else {
                            editTextBoldCursorArr[i12].setLineColors(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.k6, false), org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.l6, false), org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.p7, false));
                            i12++;
                        }
                    }
                }
                break;
            case 3:
                l31 l31Var = (l31) m2Var;
                l31Var.getClass();
                l31Var.setNavigationBarColor(l31Var.getThemedColor(org.telegram.ui.ActionBar.g6.a7));
                break;
            case 4:
                s31 s31Var = (s31) m2Var;
                s31Var.a.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.a7, false));
                s31Var.c.l();
                break;
            case 5:
                hb1 hb1Var = (hb1) m2Var;
                ia1 ia1Var = hb1Var.S;
                if (ia1Var != null) {
                    int childCount2 = ia1Var.getChildCount();
                    for (int i13 = 0; i13 < childCount2; i13++) {
                        hb1.l0(hb1Var.S.getChildAt(i13));
                    }
                    int hiddenChildCount = hb1Var.S.getHiddenChildCount();
                    for (int i14 = 0; i14 < hiddenChildCount; i14++) {
                        hb1.l0(hb1Var.S.V(i14));
                    }
                    int cachedChildCount = hb1Var.S.getCachedChildCount();
                    for (int i15 = 0; i15 < cachedChildCount; i15++) {
                        hb1.l0(hb1Var.S.P(i15));
                    }
                    int attachedScrapChildCount = hb1Var.S.getAttachedScrapChildCount();
                    while (i11 < attachedScrapChildCount) {
                        hb1.l0(hb1Var.S.O(i11));
                        i11++;
                    }
                    hb1Var.S.getRecycledViewPool().a();
                }
                jg.f fVar = hb1Var.a0;
                if (fVar != null) {
                    fVar.a = true;
                    break;
                }
                break;
            case 6:
                ThemeActivity themeActivity = (ThemeActivity) m2Var;
                for (int i16 = 0; i16 < themeActivity.b.getChildCount(); i16++) {
                    View childAt2 = themeActivity.b.getChildAt(i16);
                    if (childAt2 instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) childAt2).getAdapter().l();
                    } else if (childAt2 instanceof lp0) {
                        ((lp0) childAt2).a();
                    }
                }
                for (int i17 = 0; i17 < themeActivity.b.getCachedChildCount(); i17++) {
                    View P = themeActivity.b.P(i17);
                    if (P instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) P).getAdapter().l();
                    } else if (P instanceof lp0) {
                        ((lp0) P).a();
                    }
                }
                for (int i18 = 0; i18 < themeActivity.b.getHiddenChildCount(); i18++) {
                    View V = themeActivity.b.V(i18);
                    if (V instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) V).getAdapter().l();
                    } else if (V instanceof lp0) {
                        ((lp0) V).a();
                    }
                }
                while (i11 < themeActivity.b.getAttachedScrapChildCount()) {
                    View O = themeActivity.b.O(i11);
                    if (O instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) O).getAdapter().l();
                    } else if (O instanceof lp0) {
                        ((lp0) O).a();
                    }
                    i11++;
                }
                break;
            case 7:
                ce1.X((ce1) m2Var);
                break;
            case 8:
                af1 af1Var = (af1) m2Var;
                org.telegram.ui.Components.mm0 mm0Var2 = af1Var.a;
                if (mm0Var2 != null) {
                    int childCount3 = mm0Var2.getChildCount();
                    for (int i19 = 0; i19 < childCount3; i19++) {
                        View childAt3 = af1Var.a.getChildAt(i19);
                        if (childAt3 instanceof org.telegram.ui.Cells.g4) {
                            ((org.telegram.ui.Cells.g4) childAt3).f(0);
                        }
                    }
                }
                org.telegram.ui.Components.mm0 mm0Var3 = af1Var.b;
                if (mm0Var3 != null) {
                    int childCount4 = mm0Var3.getChildCount();
                    for (int i20 = 0; i20 < childCount4; i20++) {
                        View childAt4 = af1Var.b.getChildAt(i20);
                        if (childAt4 instanceof org.telegram.ui.Cells.g4) {
                            ((org.telegram.ui.Cells.g4) childAt4).f(0);
                        }
                    }
                }
                af1Var.c.setBackground(org.telegram.ui.ActionBar.w5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.g6.Oh));
                af1Var.F.setProgressColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.h6, false));
                break;
            case 9:
                lg1.X((lg1) m2Var);
                break;
            default:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) m2Var;
                org.telegram.ui.Components.mm0 mm0Var4 = usersSelectActivity.d;
                if (mm0Var4 != null) {
                    int childCount5 = mm0Var4.getChildCount();
                    for (int i21 = 0; i21 < childCount5; i21++) {
                        View childAt5 = usersSelectActivity.d.getChildAt(i21);
                        if (childAt5 instanceof org.telegram.ui.Cells.g4) {
                            ((org.telegram.ui.Cells.g4) childAt5).f(0);
                        }
                    }
                    break;
                }
                break;
        }
    }

    private final /* synthetic */ void c(float f7) {
    }

    private final /* synthetic */ void d(float f7) {
    }

    private final /* synthetic */ void e(float f7) {
    }

    private final /* synthetic */ void f(float f7) {
    }

    private final /* synthetic */ void g(float f7) {
    }

    private final /* synthetic */ void h(float f7) {
    }

    private final /* synthetic */ void i(float f7) {
    }

    private final /* synthetic */ void j(float f7) {
    }

    private final /* synthetic */ void k(float f7) {
    }

    private final /* synthetic */ void l(float f7) {
    }

    private final /* synthetic */ void m(float f7) {
    }
}
