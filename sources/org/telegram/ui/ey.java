package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Point;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class ey implements bh.h, org.telegram.ui.Components.vo0, org.telegram.ui.Components.dm0, di.bc, org.telegram.ui.Components.n20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yy b;

    public /* synthetic */ ey(yy yyVar, int i10) {
        this.a = i10;
        this.b = yyVar;
    }

    @Override // di.bc
    public di.fc a(long j10) {
        px pxVar = this.b.E0;
        return di.fc.c(pxVar != null ? pxVar.e(j10) : null);
    }

    @Override // di.bc
    public void b(long j10, bi.g gVar) {
        yy yyVar = this.b;
        if (yyVar.E0 == null) {
            gVar.run();
            return;
        }
        yyVar.u4(false, true);
        yyVar.Q = true;
        yyVar.fragmentView.invalidate();
        if (j10 == 0 || j10 == yyVar.getUserConfig().getClientUserId()) {
            yyVar.E0.S.h1(0, 0);
        } else {
            yyVar.E0.k(j10);
        }
        yyVar.e0[0].a.getViewTreeObserver().addOnPreDrawListener(new lm(1, this, gVar));
    }

    public void c(hg.p0 p0Var) {
        yy yyVar = this.b;
        if (yyVar.p3) {
            iy iyVar = yyVar.C0;
            if (iyVar != null) {
                iyVar.A0.remove(p0Var);
                iy iyVar2 = yyVar.C0;
                String obj = yyVar.j0.getSearchField().getText().toString();
                View currentView = iyVar2.getCurrentView();
                boolean z10 = TextUtils.isEmpty(iyVar2.K0) ? true : !iyVar2.e0;
                iyVar2.K0 = obj;
                iyVar2.O(currentView, iyVar2.getCurrentPosition(), obj, z10);
            }
            yyVar.T4(true, null, null, false, true);
            yyVar.Y.a.q(yyVar.X.r);
        }
    }

    @Override // org.telegram.ui.Components.dm0
    public boolean d(float f7, float f10, int i10, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.i6;
        yy yyVar = this.b;
        if (z10) {
            org.telegram.ui.Cells.i6 i6Var = (org.telegram.ui.Cells.i6) view;
            if (i6Var.n0) {
                yyVar.K4(i6Var.getDialogId(), view);
                return true;
            }
        }
        iy iyVar = yyVar.C0;
        bi.o0 o0Var = iyVar.V;
        return yyVar.l4(view, i10, f7, iyVar.b0);
    }

    @Override // org.telegram.ui.Components.vo0
    public void e(float f7) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.b.movePreviewFragment(f7);
        }
    }

    @Override // org.telegram.ui.Components.vo0
    public void f(org.telegram.ui.Cells.s2 s2Var) {
        this.b.E4(s2Var);
    }

    @Override // org.telegram.ui.Components.vo0
    public void finish() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.b.finishPreviewFragment();
        }
    }

    @Override // org.telegram.ui.Components.dm0
    public void h() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.b.finishPreviewFragment();
        }
    }

    @Override // bh.h
    public void m0(bh.a aVar) {
        switch (this.a) {
            case 0:
                int i10 = org.telegram.ui.ActionBar.g6.d6;
                yy yyVar = this.b;
                aVar.a(yyVar.getThemedColor(i10));
                aVar.b(SharedConfig.chatBlurEnabled());
                if (SharedConfig.chatBlurEnabled()) {
                    sx sxVar = yyVar.F3;
                    lg1 lg1Var = (sxVar == null || !(sxVar.getFragment() instanceof lg1)) ? null : (lg1) yyVar.F3.getFragment();
                    if (lg1Var != null && lg1Var.getFragmentView() != null && !yyVar.j2) {
                        aVar.a = true;
                        break;
                    }
                }
                break;
            default:
                int i11 = org.telegram.ui.ActionBar.g6.d6;
                yy yyVar2 = this.b;
                aVar.a(yyVar2.getThemedColor(i11));
                aVar.b(SharedConfig.chatBlurEnabled());
                if (SharedConfig.chatBlurEnabled()) {
                    sx sxVar2 = yyVar2.F3;
                    lg1 lg1Var2 = (sxVar2 == null || !(sxVar2.getFragment() instanceof lg1)) ? null : (lg1) yyVar2.F3.getFragment();
                    if (lg1Var2 != null && lg1Var2.getFragmentView() != null && !yyVar2.j2) {
                        aVar.a = true;
                        break;
                    }
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.dm0
    public void q(float f7) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.b.movePreviewFragment(f7);
        }
    }

    @Override // bh.h
    public void v(Canvas canvas) {
        gh.d dVar;
        gh.d dVar2;
        switch (this.a) {
            case 0:
                yy yyVar = this.b;
                int measuredWidth = yyVar.fragmentView.getMeasuredWidth();
                int measuredHeight = yyVar.fragmentView.getMeasuredHeight();
                canvas.drawColor(yyVar.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
                if (SharedConfig.chatBlurEnabled()) {
                    sx sxVar = yyVar.F3;
                    lg1 lg1Var = (sxVar == null || !(sxVar.getFragment() instanceof lg1)) ? null : (lg1) yyVar.F3.getFragment();
                    if (lg1Var != null && lg1Var.getFragmentView() != null && !yyVar.j2 && (dVar = lg1Var.g1) != null) {
                        canvas.save();
                        canvas.translate(lg1Var.getFragmentView().getTranslationX(), lg1Var.getFragmentView().getTranslationY());
                        dVar.v(canvas, 0.0f, 0.0f, measuredWidth, measuredHeight);
                        canvas.restore();
                    }
                    yyVar.k4.b(canvas, -3);
                    break;
                }
                break;
            default:
                yy yyVar2 = this.b;
                int measuredWidth2 = yyVar2.fragmentView.getMeasuredWidth();
                int measuredHeight2 = yyVar2.fragmentView.getMeasuredHeight();
                canvas.drawColor(yyVar2.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
                if (SharedConfig.chatBlurEnabled()) {
                    sx sxVar2 = yyVar2.F3;
                    lg1 lg1Var2 = (sxVar2 == null || !(sxVar2.getFragment() instanceof lg1)) ? null : (lg1) yyVar2.F3.getFragment();
                    if (lg1Var2 != null && lg1Var2.getFragmentView() != null && !yyVar2.j2 && (dVar2 = lg1Var2.h1) != null) {
                        canvas.save();
                        canvas.translate(lg1Var2.getFragmentView().getTranslationX(), lg1Var2.getFragmentView().getTranslationY());
                        dVar2.v(canvas, 0.0f, 0.0f, measuredWidth2, measuredHeight2);
                        canvas.restore();
                    }
                    yyVar2.k4.b(canvas, -2);
                    break;
                }
                break;
        }
    }
}
