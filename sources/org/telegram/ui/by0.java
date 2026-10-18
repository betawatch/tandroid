package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class by0 implements org.telegram.ui.ActionBar.i6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 b;

    public /* synthetic */ by0(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.a = i10;
        this.b = n2Var;
    }

    @Override // org.telegram.ui.ActionBar.i6
    public final /* synthetic */ void a(float f7) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.ActionBar.i6
    public final void b() {
        ValueAnimator valueAnimator;
        int i10 = this.a;
        int i11 = 0;
        org.telegram.ui.ActionBar.n2 n2Var = this.b;
        switch (i10) {
            case 0:
                ProfileActivity.n0((ProfileActivity) n2Var);
                break;
            case 1:
                b11 b11Var = (b11) n2Var;
                org.telegram.ui.Components.im0 im0Var = b11Var.a;
                if (im0Var != null) {
                    int childCount = im0Var.getChildCount();
                    while (i11 < childCount) {
                        View childAt = b11Var.a.getChildAt(i11);
                        if (childAt instanceof org.telegram.ui.Cells.ua) {
                            ((org.telegram.ui.Cells.ua) childAt).b();
                        }
                        i11++;
                    }
                    break;
                }
                break;
            case 2:
                u11 u11Var = (u11) n2Var;
                if (u11Var.h != null && ((valueAnimator = u11Var.G) == null || !valueAnimator.isRunning())) {
                    u11Var.h.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, u11Var.F ? org.telegram.ui.ActionBar.h6.q6 : org.telegram.ui.ActionBar.h6.z6, false));
                }
                if (u11Var.a != null) {
                    int i12 = 0;
                    while (true) {
                        EditTextBoldCursor[] editTextBoldCursorArr = u11Var.a;
                        if (i12 >= editTextBoldCursorArr.length) {
                            break;
                        } else {
                            editTextBoldCursorArr[i12].setLineColors(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.k6, false), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.l6, false), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.p7, false));
                            i12++;
                        }
                    }
                }
                break;
            case 3:
                b21 b21Var = (b21) n2Var;
                b21Var.a.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.a7, false));
                b21Var.c.l();
                break;
            case 4:
                r91 r91Var = (r91) n2Var;
                s81 s81Var = r91Var.S;
                if (s81Var != null) {
                    int childCount2 = s81Var.getChildCount();
                    for (int i13 = 0; i13 < childCount2; i13++) {
                        r91.l0(r91Var.S.getChildAt(i13));
                    }
                    int hiddenChildCount = r91Var.S.getHiddenChildCount();
                    for (int i14 = 0; i14 < hiddenChildCount; i14++) {
                        r91.l0(r91Var.S.V(i14));
                    }
                    int cachedChildCount = r91Var.S.getCachedChildCount();
                    for (int i15 = 0; i15 < cachedChildCount; i15++) {
                        r91.l0(r91Var.S.P(i15));
                    }
                    int attachedScrapChildCount = r91Var.S.getAttachedScrapChildCount();
                    while (i11 < attachedScrapChildCount) {
                        r91.l0(r91Var.S.O(i11));
                        i11++;
                    }
                    r91Var.S.getRecycledViewPool().a();
                }
                jg.f fVar = r91Var.a0;
                if (fVar != null) {
                    fVar.a = true;
                    break;
                }
                break;
            case 5:
                ThemeActivity themeActivity = (ThemeActivity) n2Var;
                for (int i16 = 0; i16 < themeActivity.b.getChildCount(); i16++) {
                    View childAt2 = themeActivity.b.getChildAt(i16);
                    if (childAt2 instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) childAt2).getAdapter().l();
                    } else if (childAt2 instanceof po0) {
                        ((po0) childAt2).a();
                    }
                }
                for (int i17 = 0; i17 < themeActivity.b.getCachedChildCount(); i17++) {
                    View P = themeActivity.b.P(i17);
                    if (P instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) P).getAdapter().l();
                    } else if (P instanceof po0) {
                        ((po0) P).a();
                    }
                }
                for (int i18 = 0; i18 < themeActivity.b.getHiddenChildCount(); i18++) {
                    View V = themeActivity.b.V(i18);
                    if (V instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) V).getAdapter().l();
                    } else if (V instanceof po0) {
                        ((po0) V).a();
                    }
                }
                while (i11 < themeActivity.b.getAttachedScrapChildCount()) {
                    View O = themeActivity.b.O(i11);
                    if (O instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) O).getAdapter().l();
                    } else if (O instanceof po0) {
                        ((po0) O).a();
                    }
                    i11++;
                }
                break;
            case 6:
                mc1.X((mc1) n2Var);
                break;
            case 7:
                id1 id1Var = (id1) n2Var;
                org.telegram.ui.Components.im0 im0Var2 = id1Var.a;
                if (im0Var2 != null) {
                    int childCount3 = im0Var2.getChildCount();
                    for (int i19 = 0; i19 < childCount3; i19++) {
                        View childAt3 = id1Var.a.getChildAt(i19);
                        if (childAt3 instanceof org.telegram.ui.Cells.f4) {
                            ((org.telegram.ui.Cells.f4) childAt3).f(0);
                        }
                    }
                }
                org.telegram.ui.Components.im0 im0Var3 = id1Var.b;
                if (im0Var3 != null) {
                    int childCount4 = im0Var3.getChildCount();
                    for (int i20 = 0; i20 < childCount4; i20++) {
                        View childAt4 = id1Var.b.getChildAt(i20);
                        if (childAt4 instanceof org.telegram.ui.Cells.f4) {
                            ((org.telegram.ui.Cells.f4) childAt4).f(0);
                        }
                    }
                }
                id1Var.c.setBackground(org.telegram.ui.ActionBar.x5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.h6.Oh));
                id1Var.F.setProgressColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.h6, false));
                break;
            case 8:
                te1.X((te1) n2Var);
                break;
            default:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) n2Var;
                org.telegram.ui.Components.im0 im0Var4 = usersSelectActivity.d;
                if (im0Var4 != null) {
                    int childCount5 = im0Var4.getChildCount();
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
}
