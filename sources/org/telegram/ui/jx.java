package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Point;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class jx implements bh.h, org.telegram.ui.Components.ro0, org.telegram.ui.Components.zl0, ei.mb, org.telegram.ui.Components.j20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ey b;

    public /* synthetic */ jx(ey eyVar, int i10) {
        this.a = i10;
        this.b = eyVar;
    }

    @Override // bh.h
    public void H(bh.a aVar) {
        switch (this.a) {
            case 0:
                int i10 = org.telegram.ui.ActionBar.h6.d6;
                ey eyVar = this.b;
                aVar.a(eyVar.getThemedColor(i10));
                aVar.b(SharedConfig.chatBlurEnabled());
                if (SharedConfig.chatBlurEnabled()) {
                    yw ywVar = eyVar.G3;
                    te1 te1Var = (ywVar == null || !(ywVar.getFragment() instanceof te1)) ? null : (te1) eyVar.G3.getFragment();
                    if (te1Var != null && te1Var.getFragmentView() != null && !eyVar.j2) {
                        aVar.a = true;
                        break;
                    }
                }
                break;
            default:
                int i11 = org.telegram.ui.ActionBar.h6.d6;
                ey eyVar2 = this.b;
                aVar.a(eyVar2.getThemedColor(i11));
                aVar.b(SharedConfig.chatBlurEnabled());
                if (SharedConfig.chatBlurEnabled()) {
                    yw ywVar2 = eyVar2.G3;
                    te1 te1Var2 = (ywVar2 == null || !(ywVar2.getFragment() instanceof te1)) ? null : (te1) eyVar2.G3.getFragment();
                    if (te1Var2 != null && te1Var2.getFragmentView() != null && !eyVar2.j2) {
                        aVar.a = true;
                        break;
                    }
                }
                break;
        }
    }

    @Override // ei.mb
    public ei.qb a(long j10) {
        vw vwVar = this.b.E0;
        return ei.qb.c(vwVar != null ? vwVar.e(j10) : null);
    }

    @Override // ei.mb
    public void b(long j10, ai.t3 t3Var) {
        ey eyVar = this.b;
        if (eyVar.E0 == null) {
            t3Var.run();
            return;
        }
        eyVar.v4(false, true);
        eyVar.Q = true;
        eyVar.fragmentView.invalidate();
        if (j10 == 0 || j10 == eyVar.getUserConfig().getClientUserId()) {
            eyVar.E0.S.h1(0, 0);
        } else {
            eyVar.E0.k(j10);
        }
        eyVar.e0[0].a.getViewTreeObserver().addOnPreDrawListener(new zl(1, this, t3Var));
    }

    public void c(hg.o0 o0Var) {
        ey eyVar = this.b;
        if (eyVar.q3) {
            nx nxVar = eyVar.C0;
            if (nxVar != null) {
                nxVar.A0.remove(o0Var);
                nx nxVar2 = eyVar.C0;
                String obj = eyVar.j0.getSearchField().getText().toString();
                View currentView = nxVar2.getCurrentView();
                boolean z10 = TextUtils.isEmpty(nxVar2.K0) ? true : !nxVar2.e0;
                nxVar2.K0 = obj;
                nxVar2.O(currentView, nxVar2.getCurrentPosition(), obj, z10);
            }
            eyVar.U4(true, null, null, false, true);
            eyVar.Y.a.q(eyVar.X.r);
        }
    }

    @Override // org.telegram.ui.Components.zl0
    public boolean d(float f7, float f10, int i10, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.h6;
        ey eyVar = this.b;
        if (z10) {
            org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) view;
            if (h6Var.n0) {
                eyVar.L4(h6Var.getDialogId(), view);
                return true;
            }
        }
        nx nxVar = eyVar.C0;
        ai.u1 u1Var = nxVar.V;
        return eyVar.m4(view, i10, f7, nxVar.b0);
    }

    @Override // org.telegram.ui.Components.ro0
    public void e(float f7) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.b.movePreviewFragment(f7);
        }
    }

    @Override // org.telegram.ui.Components.ro0
    public void f(org.telegram.ui.Cells.r2 r2Var) {
        this.b.F4(r2Var);
    }

    @Override // org.telegram.ui.Components.ro0
    public void finish() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.b.finishPreviewFragment();
        }
    }

    @Override // org.telegram.ui.Components.zl0
    public void h() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.b.finishPreviewFragment();
        }
    }

    @Override // org.telegram.ui.Components.zl0
    public void o(float f7) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.b.movePreviewFragment(f7);
        }
    }

    @Override // bh.h
    public void r(Canvas canvas) {
        gh.d dVar;
        gh.d dVar2;
        switch (this.a) {
            case 0:
                ey eyVar = this.b;
                int measuredWidth = eyVar.fragmentView.getMeasuredWidth();
                int measuredHeight = eyVar.fragmentView.getMeasuredHeight();
                canvas.drawColor(eyVar.getThemedColor(org.telegram.ui.ActionBar.h6.d6));
                if (SharedConfig.chatBlurEnabled()) {
                    yw ywVar = eyVar.G3;
                    te1 te1Var = (ywVar == null || !(ywVar.getFragment() instanceof te1)) ? null : (te1) eyVar.G3.getFragment();
                    if (te1Var != null && te1Var.getFragmentView() != null && !eyVar.j2 && (dVar = te1Var.g1) != null) {
                        canvas.save();
                        canvas.translate(te1Var.getFragmentView().getTranslationX(), te1Var.getFragmentView().getTranslationY());
                        dVar.y(canvas, 0.0f, 0.0f, measuredWidth, measuredHeight);
                        canvas.restore();
                    }
                    eyVar.l4.b(canvas, -3);
                    break;
                }
                break;
            default:
                ey eyVar2 = this.b;
                int measuredWidth2 = eyVar2.fragmentView.getMeasuredWidth();
                int measuredHeight2 = eyVar2.fragmentView.getMeasuredHeight();
                canvas.drawColor(eyVar2.getThemedColor(org.telegram.ui.ActionBar.h6.d6));
                if (SharedConfig.chatBlurEnabled()) {
                    yw ywVar2 = eyVar2.G3;
                    te1 te1Var2 = (ywVar2 == null || !(ywVar2.getFragment() instanceof te1)) ? null : (te1) eyVar2.G3.getFragment();
                    if (te1Var2 != null && te1Var2.getFragmentView() != null && !eyVar2.j2 && (dVar2 = te1Var2.h1) != null) {
                        canvas.save();
                        canvas.translate(te1Var2.getFragmentView().getTranslationX(), te1Var2.getFragmentView().getTranslationY());
                        dVar2.y(canvas, 0.0f, 0.0f, measuredWidth2, measuredHeight2);
                        canvas.restore();
                    }
                    eyVar2.l4.b(canvas, -2);
                    break;
                }
                break;
        }
    }
}
