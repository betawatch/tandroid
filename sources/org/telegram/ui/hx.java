package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Point;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class hx implements bh.h, org.telegram.ui.Components.so0, org.telegram.ui.Components.am0, ei.mb, org.telegram.ui.Components.j20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cy b;

    public /* synthetic */ hx(cy cyVar, int i10) {
        this.a = i10;
        this.b = cyVar;
    }

    @Override // bh.h
    public void J(bh.a aVar) {
        switch (this.a) {
            case 0:
                int i10 = org.telegram.ui.ActionBar.h6.d6;
                cy cyVar = this.b;
                aVar.a(cyVar.getThemedColor(i10));
                aVar.b(SharedConfig.chatBlurEnabled());
                if (SharedConfig.chatBlurEnabled()) {
                    ww wwVar = cyVar.G3;
                    re1 re1Var = (wwVar == null || !(wwVar.getFragment() instanceof re1)) ? null : (re1) cyVar.G3.getFragment();
                    if (re1Var != null && re1Var.getFragmentView() != null && !cyVar.j2) {
                        aVar.a = true;
                        break;
                    }
                }
                break;
            default:
                int i11 = org.telegram.ui.ActionBar.h6.d6;
                cy cyVar2 = this.b;
                aVar.a(cyVar2.getThemedColor(i11));
                aVar.b(SharedConfig.chatBlurEnabled());
                if (SharedConfig.chatBlurEnabled()) {
                    ww wwVar2 = cyVar2.G3;
                    re1 re1Var2 = (wwVar2 == null || !(wwVar2.getFragment() instanceof re1)) ? null : (re1) cyVar2.G3.getFragment();
                    if (re1Var2 != null && re1Var2.getFragmentView() != null && !cyVar2.j2) {
                        aVar.a = true;
                        break;
                    }
                }
                break;
        }
    }

    @Override // ei.mb
    public ei.qb a(long j10) {
        tw twVar = this.b.E0;
        return ei.qb.c(twVar != null ? twVar.e(j10) : null);
    }

    @Override // bh.h
    public void b(Canvas canvas) {
        gh.d dVar;
        gh.d dVar2;
        switch (this.a) {
            case 0:
                cy cyVar = this.b;
                int measuredWidth = cyVar.fragmentView.getMeasuredWidth();
                int measuredHeight = cyVar.fragmentView.getMeasuredHeight();
                canvas.drawColor(cyVar.getThemedColor(org.telegram.ui.ActionBar.h6.d6));
                if (SharedConfig.chatBlurEnabled()) {
                    ww wwVar = cyVar.G3;
                    re1 re1Var = (wwVar == null || !(wwVar.getFragment() instanceof re1)) ? null : (re1) cyVar.G3.getFragment();
                    if (re1Var != null && re1Var.getFragmentView() != null && !cyVar.j2 && (dVar = re1Var.g1) != null) {
                        canvas.save();
                        canvas.translate(re1Var.getFragmentView().getTranslationX(), re1Var.getFragmentView().getTranslationY());
                        dVar.y(canvas, 0.0f, 0.0f, measuredWidth, measuredHeight);
                        canvas.restore();
                    }
                    cyVar.l4.b(canvas, -3);
                    break;
                }
                break;
            default:
                cy cyVar2 = this.b;
                int measuredWidth2 = cyVar2.fragmentView.getMeasuredWidth();
                int measuredHeight2 = cyVar2.fragmentView.getMeasuredHeight();
                canvas.drawColor(cyVar2.getThemedColor(org.telegram.ui.ActionBar.h6.d6));
                if (SharedConfig.chatBlurEnabled()) {
                    ww wwVar2 = cyVar2.G3;
                    re1 re1Var2 = (wwVar2 == null || !(wwVar2.getFragment() instanceof re1)) ? null : (re1) cyVar2.G3.getFragment();
                    if (re1Var2 != null && re1Var2.getFragmentView() != null && !cyVar2.j2 && (dVar2 = re1Var2.h1) != null) {
                        canvas.save();
                        canvas.translate(re1Var2.getFragmentView().getTranslationX(), re1Var2.getFragmentView().getTranslationY());
                        dVar2.y(canvas, 0.0f, 0.0f, measuredWidth2, measuredHeight2);
                        canvas.restore();
                    }
                    cyVar2.l4.b(canvas, -2);
                    break;
                }
                break;
        }
    }

    @Override // ei.mb
    public void c(long j10, ai.v3 v3Var) {
        cy cyVar = this.b;
        if (cyVar.E0 == null) {
            v3Var.run();
            return;
        }
        cyVar.v4(false, true);
        cyVar.Q = true;
        cyVar.fragmentView.invalidate();
        if (j10 == 0 || j10 == cyVar.getUserConfig().getClientUserId()) {
            cyVar.E0.S.h1(0, 0);
        } else {
            cyVar.E0.k(j10);
        }
        cyVar.e0[0].a.getViewTreeObserver().addOnPreDrawListener(new xl(1, this, v3Var));
    }

    @Override // org.telegram.ui.Components.am0
    public boolean d(float f7, float f10, int i10, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.h6;
        cy cyVar = this.b;
        if (z10) {
            org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) view;
            if (h6Var.n0) {
                cyVar.L4(h6Var.getDialogId(), view);
                return true;
            }
        }
        lx lxVar = cyVar.C0;
        ai.u1 u1Var = lxVar.V;
        return cyVar.m4(view, i10, f7, lxVar.b0);
    }

    @Override // org.telegram.ui.Components.so0
    public void e(float f7) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.b.movePreviewFragment(f7);
        }
    }

    @Override // org.telegram.ui.Components.so0
    public void f(org.telegram.ui.Cells.r2 r2Var) {
        this.b.F4(r2Var);
    }

    @Override // org.telegram.ui.Components.so0
    public void finish() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.b.finishPreviewFragment();
        }
    }

    public void g(hg.o0 o0Var) {
        cy cyVar = this.b;
        if (cyVar.q3) {
            lx lxVar = cyVar.C0;
            if (lxVar != null) {
                lxVar.A0.remove(o0Var);
                lx lxVar2 = cyVar.C0;
                String obj = cyVar.j0.getSearchField().getText().toString();
                View currentView = lxVar2.getCurrentView();
                boolean z10 = TextUtils.isEmpty(lxVar2.K0) ? true : !lxVar2.e0;
                lxVar2.K0 = obj;
                lxVar2.O(currentView, lxVar2.getCurrentPosition(), obj, z10);
            }
            cyVar.U4(true, null, null, false, true);
            cyVar.Y.a.q(cyVar.X.r);
        }
    }

    @Override // org.telegram.ui.Components.am0
    public void h() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.b.finishPreviewFragment();
        }
    }

    @Override // org.telegram.ui.Components.am0
    public void o(float f7) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.b.movePreviewFragment(f7);
        }
    }
}
