package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jy0 implements org.telegram.ui.ActionBar.k6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.p2 b;

    public /* synthetic */ jy0(int i10, org.telegram.ui.ActionBar.p2 p2Var) {
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
                l11 l11Var = (l11) p2Var;
                org.telegram.ui.Components.rl0 rl0Var = l11Var.a;
                if (rl0Var != null) {
                    int childCount = rl0Var.getChildCount();
                    while (i11 < childCount) {
                        View childAt = l11Var.a.getChildAt(i11);
                        if (childAt instanceof org.telegram.ui.Cells.ta) {
                            ((org.telegram.ui.Cells.ta) childAt).b();
                        }
                        i11++;
                    }
                    break;
                }
                break;
            case 2:
                d21 d21Var = (d21) p2Var;
                if (d21Var.h != null && ((valueAnimator = d21Var.D) == null || !valueAnimator.isRunning())) {
                    d21Var.h.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, d21Var.C ? org.telegram.ui.ActionBar.j6.q6 : org.telegram.ui.ActionBar.j6.z6, false));
                }
                if (d21Var.a != null) {
                    int i12 = 0;
                    while (true) {
                        EditTextBoldCursor[] editTextBoldCursorArr = d21Var.a;
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
                u21 u21Var = (u21) p2Var;
                u21Var.getClass();
                u21Var.setNavigationBarColor(u21Var.getThemedColor(org.telegram.ui.ActionBar.j6.a7));
                break;
            case 4:
                b31 b31Var = (b31) p2Var;
                b31Var.a.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.a7, false));
                b31Var.c.l();
                break;
            case 5:
                oa1 oa1Var = (oa1) p2Var;
                p91 p91Var = oa1Var.P;
                if (p91Var != null) {
                    int childCount2 = p91Var.getChildCount();
                    for (int i13 = 0; i13 < childCount2; i13++) {
                        oa1.l0(oa1Var.P.getChildAt(i13));
                    }
                    int hiddenChildCount = oa1Var.P.getHiddenChildCount();
                    for (int i14 = 0; i14 < hiddenChildCount; i14++) {
                        oa1.l0(oa1Var.P.V(i14));
                    }
                    int cachedChildCount = oa1Var.P.getCachedChildCount();
                    for (int i15 = 0; i15 < cachedChildCount; i15++) {
                        oa1.l0(oa1Var.P.P(i15));
                    }
                    int attachedScrapChildCount = oa1Var.P.getAttachedScrapChildCount();
                    while (i11 < attachedScrapChildCount) {
                        oa1.l0(oa1Var.P.O(i11));
                        i11++;
                    }
                    oa1Var.P.getRecycledViewPool().a();
                }
                vf.f fVar = oa1Var.X;
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
                    } else if (childAt2 instanceof so0) {
                        ((so0) childAt2).a();
                    }
                }
                for (int i17 = 0; i17 < themeActivity.b.getCachedChildCount(); i17++) {
                    View P = themeActivity.b.P(i17);
                    if (P instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) P).getAdapter().l();
                    } else if (P instanceof so0) {
                        ((so0) P).a();
                    }
                }
                for (int i18 = 0; i18 < themeActivity.b.getHiddenChildCount(); i18++) {
                    View V = themeActivity.b.V(i18);
                    if (V instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) V).getAdapter().l();
                    } else if (V instanceof so0) {
                        ((so0) V).a();
                    }
                }
                while (i11 < themeActivity.b.getAttachedScrapChildCount()) {
                    View O = themeActivity.b.O(i11);
                    if (O instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) O).getAdapter().l();
                    } else if (O instanceof so0) {
                        ((so0) O).a();
                    }
                    i11++;
                }
                break;
            case 7:
                jd1.W((jd1) p2Var);
                break;
            case 8:
                ge1 ge1Var = (ge1) p2Var;
                org.telegram.ui.Components.rl0 rl0Var2 = ge1Var.a;
                if (rl0Var2 != null) {
                    int childCount3 = rl0Var2.getChildCount();
                    for (int i19 = 0; i19 < childCount3; i19++) {
                        View childAt3 = ge1Var.a.getChildAt(i19);
                        if (childAt3 instanceof org.telegram.ui.Cells.f4) {
                            ((org.telegram.ui.Cells.f4) childAt3).f(0);
                        }
                    }
                }
                org.telegram.ui.Components.rl0 rl0Var3 = ge1Var.b;
                if (rl0Var3 != null) {
                    int childCount4 = rl0Var3.getChildCount();
                    for (int i20 = 0; i20 < childCount4; i20++) {
                        View childAt4 = ge1Var.b.getChildAt(i20);
                        if (childAt4 instanceof org.telegram.ui.Cells.f4) {
                            ((org.telegram.ui.Cells.f4) childAt4).f(0);
                        }
                    }
                }
                ge1Var.c.setBackground(org.telegram.ui.ActionBar.z5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.j6.Oh));
                ge1Var.C.setProgressColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.h6, false));
                break;
            case 9:
                sf1.X((sf1) p2Var);
                break;
            default:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) p2Var;
                org.telegram.ui.Components.rl0 rl0Var4 = usersSelectActivity.d;
                if (rl0Var4 != null) {
                    int childCount5 = rl0Var4.getChildCount();
                    for (int i21 = 0; i21 < childCount5; i21++) {
                        View childAt5 = usersSelectActivity.d.getChildAt(i21);
                        if (childAt5 instanceof org.telegram.ui.Cells.f4) {
                            ((org.telegram.ui.Cells.f4) childAt5).f(0);
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
