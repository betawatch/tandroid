package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cy0 implements org.telegram.ui.ActionBar.k6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.p2 b;

    public /* synthetic */ cy0(int i10, org.telegram.ui.ActionBar.p2 p2Var) {
        this.a = i10;
        this.b = p2Var;
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void a(float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void b() {
        ValueAnimator valueAnimator;
        int i10 = this.a;
        int i11 = 0;
        org.telegram.ui.ActionBar.p2 p2Var = this.b;
        switch (i10) {
            case 0:
                ProfileActivity.V((ProfileActivity) p2Var);
                break;
            case 1:
                e11 e11Var = (e11) p2Var;
                org.telegram.ui.Components.sl0 sl0Var = e11Var.a;
                if (sl0Var != null) {
                    int childCount = sl0Var.getChildCount();
                    while (i11 < childCount) {
                        View childAt = e11Var.a.getChildAt(i11);
                        if (childAt instanceof org.telegram.ui.Cells.ua) {
                            ((org.telegram.ui.Cells.ua) childAt).b();
                        }
                        i11++;
                    }
                    break;
                }
                break;
            case 2:
                w11 w11Var = (w11) p2Var;
                if (w11Var.h != null && ((valueAnimator = w11Var.E) == null || !valueAnimator.isRunning())) {
                    w11Var.h.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, w11Var.D ? org.telegram.ui.ActionBar.j6.q6 : org.telegram.ui.ActionBar.j6.z6, false));
                }
                if (w11Var.a != null) {
                    int i12 = 0;
                    while (true) {
                        EditTextBoldCursor[] editTextBoldCursorArr = w11Var.a;
                        if (i12 >= editTextBoldCursorArr.length) {
                            break;
                        } else {
                            editTextBoldCursorArr[i12].setLineColors(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.k6, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.l6, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.p7, false));
                            i12++;
                        }
                    }
                }
                break;
            case 3:
                m21 m21Var = (m21) p2Var;
                m21Var.getClass();
                m21Var.setNavigationBarColor(m21Var.getThemedColor(org.telegram.ui.ActionBar.j6.a7));
                break;
            case 4:
                u21 u21Var = (u21) p2Var;
                u21Var.a.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.a7, false));
                u21Var.c.l();
                break;
            case 5:
                ga1 ga1Var = (ga1) p2Var;
                h91 h91Var = ga1Var.P;
                if (h91Var != null) {
                    int childCount2 = h91Var.getChildCount();
                    for (int i13 = 0; i13 < childCount2; i13++) {
                        ga1.l0(ga1Var.P.getChildAt(i13));
                    }
                    int hiddenChildCount = ga1Var.P.getHiddenChildCount();
                    for (int i14 = 0; i14 < hiddenChildCount; i14++) {
                        ga1.l0(ga1Var.P.V(i14));
                    }
                    int cachedChildCount = ga1Var.P.getCachedChildCount();
                    for (int i15 = 0; i15 < cachedChildCount; i15++) {
                        ga1.l0(ga1Var.P.P(i15));
                    }
                    int attachedScrapChildCount = ga1Var.P.getAttachedScrapChildCount();
                    while (i11 < attachedScrapChildCount) {
                        ga1.l0(ga1Var.P.O(i11));
                        i11++;
                    }
                    ga1Var.P.getRecycledViewPool().a();
                }
                vf.f fVar = ga1Var.X;
                if (fVar != null) {
                    fVar.g = true;
                    break;
                }
                break;
            case 6:
                ThemeActivity themeActivity = (ThemeActivity) p2Var;
                for (int i16 = 0; i16 < themeActivity.b.getChildCount(); i16++) {
                    View childAt2 = themeActivity.b.getChildAt(i16);
                    if (childAt2 instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) childAt2).getAdapter().l();
                    } else if (childAt2 instanceof oo0) {
                        ((oo0) childAt2).a();
                    }
                }
                for (int i17 = 0; i17 < themeActivity.b.getCachedChildCount(); i17++) {
                    View P = themeActivity.b.P(i17);
                    if (P instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) P).getAdapter().l();
                    } else if (P instanceof oo0) {
                        ((oo0) P).a();
                    }
                }
                for (int i18 = 0; i18 < themeActivity.b.getHiddenChildCount(); i18++) {
                    View V = themeActivity.b.V(i18);
                    if (V instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) V).getAdapter().l();
                    } else if (V instanceof oo0) {
                        ((oo0) V).a();
                    }
                }
                while (i11 < themeActivity.b.getAttachedScrapChildCount()) {
                    View O = themeActivity.b.O(i11);
                    if (O instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) O).getAdapter().l();
                    } else if (O instanceof oo0) {
                        ((oo0) O).a();
                    }
                    i11++;
                }
                break;
            case 7:
                cd1.W((cd1) p2Var);
                break;
            case 8:
                yd1 yd1Var = (yd1) p2Var;
                org.telegram.ui.Components.sl0 sl0Var2 = yd1Var.a;
                if (sl0Var2 != null) {
                    int childCount3 = sl0Var2.getChildCount();
                    for (int i19 = 0; i19 < childCount3; i19++) {
                        View childAt3 = yd1Var.a.getChildAt(i19);
                        if (childAt3 instanceof org.telegram.ui.Cells.g4) {
                            ((org.telegram.ui.Cells.g4) childAt3).f(0);
                        }
                    }
                }
                org.telegram.ui.Components.sl0 sl0Var3 = yd1Var.b;
                if (sl0Var3 != null) {
                    int childCount4 = sl0Var3.getChildCount();
                    for (int i20 = 0; i20 < childCount4; i20++) {
                        View childAt4 = yd1Var.b.getChildAt(i20);
                        if (childAt4 instanceof org.telegram.ui.Cells.g4) {
                            ((org.telegram.ui.Cells.g4) childAt4).f(0);
                        }
                    }
                }
                yd1Var.c.setBackground(org.telegram.ui.ActionBar.z5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.j6.Oh));
                yd1Var.C.setProgressColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.h6, false));
                break;
            case 9:
                kf1.X((kf1) p2Var);
                break;
            default:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) p2Var;
                org.telegram.ui.Components.sl0 sl0Var4 = usersSelectActivity.d;
                if (sl0Var4 != null) {
                    int childCount5 = sl0Var4.getChildCount();
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

    private final /* synthetic */ void c(float f10) {
    }

    private final /* synthetic */ void d(float f10) {
    }

    private final /* synthetic */ void e(float f10) {
    }

    private final /* synthetic */ void f(float f10) {
    }

    private final /* synthetic */ void g(float f10) {
    }

    private final /* synthetic */ void h(float f10) {
    }

    private final /* synthetic */ void i(float f10) {
    }

    private final /* synthetic */ void j(float f10) {
    }

    private final /* synthetic */ void k(float f10) {
    }

    private final /* synthetic */ void l(float f10) {
    }

    private final /* synthetic */ void m(float f10) {
    }
}
