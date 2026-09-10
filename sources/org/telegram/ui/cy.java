package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Point;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class cy implements zg.g, org.telegram.ui.Components.do0, org.telegram.ui.Components.ml0, bi.sd, org.telegram.ui.Components.j20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wy b;

    public /* synthetic */ cy(wy wyVar, int i10) {
        this.a = i10;
        this.b = wyVar;
    }

    @Override // bi.sd
    public bi.xd a(long j3) {
        nx nxVar = this.b.E0;
        return bi.xd.c(nxVar != null ? nxVar.e(j3) : null);
    }

    @Override // bi.sd
    public void b(long j3, bi.va vaVar) {
        wy wyVar = this.b;
        if (wyVar.E0 == null) {
            vaVar.run();
            return;
        }
        wyVar.x4(false, true);
        wyVar.Q = true;
        wyVar.fragmentView.invalidate();
        if (j3 == 0 || j3 == wyVar.getUserConfig().getClientUserId()) {
            wyVar.E0.S.h1(0, 0);
        } else {
            wyVar.E0.k(j3);
        }
        wyVar.e0[0].a.getViewTreeObserver().addOnPreDrawListener(new jm(1, this, vaVar));
    }

    @Override // org.telegram.ui.Components.ml0
    public boolean c(float f7, float f10, int i10, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.j6;
        wy wyVar = this.b;
        if (z10) {
            org.telegram.ui.Cells.j6 j6Var = (org.telegram.ui.Cells.j6) view;
            if (j6Var.n0) {
                wyVar.N4(j6Var.getDialogId(), view);
                return true;
            }
        }
        gy gyVar = wyVar.C0;
        bi.y1 y1Var = gyVar.V;
        return wyVar.o4(view, i10, f7, gyVar.b0);
    }

    @Override // zg.g
    public void d(Canvas canvas) {
        eh.d dVar;
        eh.d dVar2;
        switch (this.a) {
            case 0:
                wy wyVar = this.b;
                int measuredWidth = wyVar.fragmentView.getMeasuredWidth();
                int measuredHeight = wyVar.fragmentView.getMeasuredHeight();
                canvas.drawColor(wyVar.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                if (SharedConfig.chatBlurEnabled()) {
                    qx qxVar = wyVar.F3;
                    ig1 ig1Var = (qxVar == null || !(qxVar.getFragment() instanceof ig1)) ? null : (ig1) wyVar.F3.getFragment();
                    if (ig1Var != null && ig1Var.getFragmentView() != null && !wyVar.j2 && (dVar = ig1Var.g1) != null) {
                        canvas.save();
                        canvas.translate(ig1Var.getFragmentView().getTranslationX(), ig1Var.getFragmentView().getTranslationY());
                        dVar.u(canvas, 0.0f, 0.0f, measuredWidth, measuredHeight);
                        canvas.restore();
                    }
                    wyVar.l4.b(canvas, -3);
                    break;
                }
                break;
            default:
                wy wyVar2 = this.b;
                int measuredWidth2 = wyVar2.fragmentView.getMeasuredWidth();
                int measuredHeight2 = wyVar2.fragmentView.getMeasuredHeight();
                canvas.drawColor(wyVar2.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                if (SharedConfig.chatBlurEnabled()) {
                    qx qxVar2 = wyVar2.F3;
                    ig1 ig1Var2 = (qxVar2 == null || !(qxVar2.getFragment() instanceof ig1)) ? null : (ig1) wyVar2.F3.getFragment();
                    if (ig1Var2 != null && ig1Var2.getFragmentView() != null && !wyVar2.j2 && (dVar2 = ig1Var2.h1) != null) {
                        canvas.save();
                        canvas.translate(ig1Var2.getFragmentView().getTranslationX(), ig1Var2.getFragmentView().getTranslationY());
                        dVar2.u(canvas, 0.0f, 0.0f, measuredWidth2, measuredHeight2);
                        canvas.restore();
                    }
                    wyVar2.l4.b(canvas, -2);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.do0
    public void e(float f7) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.b.movePreviewFragment(f7);
        }
    }

    @Override // org.telegram.ui.Components.do0
    public void f(org.telegram.ui.Cells.r2 r2Var) {
        this.b.H4(r2Var);
    }

    @Override // org.telegram.ui.Components.do0
    public void finish() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.b.finishPreviewFragment();
        }
    }

    public void g(fg.q0 q0Var) {
        wy wyVar = this.b;
        if (wyVar.p3) {
            gy gyVar = wyVar.C0;
            if (gyVar != null) {
                gyVar.A0.remove(q0Var);
                gy gyVar2 = wyVar.C0;
                String obj = wyVar.j0.getSearchField().getText().toString();
                View currentView = gyVar2.getCurrentView();
                boolean z10 = TextUtils.isEmpty(gyVar2.K0) ? true : !gyVar2.e0;
                gyVar2.K0 = obj;
                gyVar2.O(currentView, gyVar2.getCurrentPosition(), obj, z10);
            }
            wyVar.W4(true, null, null, false, true);
            wyVar.Y.a.q(wyVar.X.r);
        }
    }

    @Override // org.telegram.ui.Components.ml0
    public void h() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.b.finishPreviewFragment();
        }
    }

    @Override // org.telegram.ui.Components.ml0
    public void p(float f7) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.b.movePreviewFragment(f7);
        }
    }

    @Override // zg.g
    public void u(g.z zVar) {
        switch (this.a) {
            case 0:
                int i10 = org.telegram.ui.ActionBar.j6.d6;
                wy wyVar = this.b;
                zVar.a(wyVar.getThemedColor(i10));
                zVar.b(SharedConfig.chatBlurEnabled());
                if (SharedConfig.chatBlurEnabled()) {
                    qx qxVar = wyVar.F3;
                    ig1 ig1Var = (qxVar == null || !(qxVar.getFragment() instanceof ig1)) ? null : (ig1) wyVar.F3.getFragment();
                    if (ig1Var != null && ig1Var.getFragmentView() != null && !wyVar.j2) {
                        zVar.b = true;
                        break;
                    }
                }
                break;
            default:
                int i11 = org.telegram.ui.ActionBar.j6.d6;
                wy wyVar2 = this.b;
                zVar.a(wyVar2.getThemedColor(i11));
                zVar.b(SharedConfig.chatBlurEnabled());
                if (SharedConfig.chatBlurEnabled()) {
                    qx qxVar2 = wyVar2.F3;
                    ig1 ig1Var2 = (qxVar2 == null || !(qxVar2.getFragment() instanceof ig1)) ? null : (ig1) wyVar2.F3.getFragment();
                    if (ig1Var2 != null && ig1Var2.getFragmentView() != null && !wyVar2.j2) {
                        zVar.b = true;
                        break;
                    }
                }
                break;
        }
    }
}
