package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Point;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ix implements ig.g, org.telegram.ui.Components.dn0, org.telegram.ui.Components.pk0, kh.nb, org.telegram.ui.Components.l10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ dy b;

    public /* synthetic */ ix(dy dyVar, int i9) {
        this.a = i9;
        this.b = dyVar;
    }

    @Override // kh.nb
    public kh.rb a(long j10) {
        vw vwVar = this.b.A0;
        return kh.rb.c(vwVar != null ? vwVar.e(j10) : null);
    }

    @Override // kh.nb
    public void b(long j10, bg.i2 i2Var) {
        dy dyVar = this.b;
        if (dyVar.A0 == null) {
            i2Var.run();
            return;
        }
        dyVar.x4(false, true);
        dyVar.M = true;
        dyVar.fragmentView.invalidate();
        if (j10 == 0 || j10 == dyVar.getUserConfig().getClientUserId()) {
            dyVar.A0.O.h1(0, 0);
        } else {
            dyVar.A0.k(j10);
        }
        dyVar.a0[0].a.getViewTreeObserver().addOnPreDrawListener(new ch.f(2, this, i2Var));
    }

    @Override // org.telegram.ui.Components.pk0
    public boolean c(float f10, float f11, int i9, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.h6;
        dy dyVar = this.b;
        if (z10) {
            org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) view;
            if (h6Var.j0) {
                dyVar.N4(h6Var.getDialogId(), view);
                return true;
            }
        }
        mx mxVar = dyVar.y0;
        gh.f1 f1Var = mxVar.R;
        return dyVar.o4(view, i9, f10, mxVar.U);
    }

    @Override // org.telegram.ui.Components.dn0
    public void d(float f10) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.b.movePreviewFragment(f10);
        }
    }

    public void e(of.m0 m0Var) {
        dy dyVar = this.b;
        if (dyVar.l3) {
            mx mxVar = dyVar.y0;
            if (mxVar != null) {
                mxVar.w0.remove(m0Var);
                mx mxVar2 = dyVar.y0;
                String obj = dyVar.f0.getSearchField().getText().toString();
                View currentView = mxVar2.getCurrentView();
                boolean z10 = TextUtils.isEmpty(mxVar2.G0) ? true : !mxVar2.a0;
                mxVar2.G0 = obj;
                mxVar2.O(currentView, mxVar2.getCurrentPosition(), obj, z10);
            }
            dyVar.W4(true, null, null, false, true);
            dyVar.U.a.q(dyVar.T.r);
        }
    }

    @Override // org.telegram.ui.Components.dn0
    public void f(org.telegram.ui.Cells.r2 r2Var) {
        this.b.H4(r2Var);
    }

    @Override // org.telegram.ui.Components.dn0
    public void finish() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.b.finishPreviewFragment();
        }
    }

    @Override // org.telegram.ui.Components.pk0
    public void j() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.b.finishPreviewFragment();
        }
    }

    @Override // ig.g
    public void k(Canvas canvas) {
        ng.d dVar;
        ng.d dVar2;
        switch (this.a) {
            case 0:
                dy dyVar = this.b;
                int measuredWidth = dyVar.fragmentView.getMeasuredWidth();
                int measuredHeight = dyVar.fragmentView.getMeasuredHeight();
                canvas.drawColor(dyVar.getThemedColor(org.telegram.ui.ActionBar.f6.d6));
                if (SharedConfig.chatBlurEnabled()) {
                    yw ywVar = dyVar.B3;
                    we1 we1Var = (ywVar == null || !(ywVar.getFragment() instanceof we1)) ? null : (we1) dyVar.B3.getFragment();
                    if (we1Var != null && we1Var.getFragmentView() != null && !dyVar.f2 && (dVar = we1Var.c1) != null) {
                        canvas.save();
                        canvas.translate(we1Var.getFragmentView().getTranslationX(), we1Var.getFragmentView().getTranslationY());
                        dVar.T0(canvas, 0.0f, 0.0f, measuredWidth, measuredHeight);
                        canvas.restore();
                    }
                    dyVar.h4.b(canvas, -3);
                    break;
                }
                break;
            default:
                dy dyVar2 = this.b;
                int measuredWidth2 = dyVar2.fragmentView.getMeasuredWidth();
                int measuredHeight2 = dyVar2.fragmentView.getMeasuredHeight();
                canvas.drawColor(dyVar2.getThemedColor(org.telegram.ui.ActionBar.f6.d6));
                if (SharedConfig.chatBlurEnabled()) {
                    yw ywVar2 = dyVar2.B3;
                    we1 we1Var2 = (ywVar2 == null || !(ywVar2.getFragment() instanceof we1)) ? null : (we1) dyVar2.B3.getFragment();
                    if (we1Var2 != null && we1Var2.getFragmentView() != null && !dyVar2.f2 && (dVar2 = we1Var2.d1) != null) {
                        canvas.save();
                        canvas.translate(we1Var2.getFragmentView().getTranslationX(), we1Var2.getFragmentView().getTranslationY());
                        dVar2.T0(canvas, 0.0f, 0.0f, measuredWidth2, measuredHeight2);
                        canvas.restore();
                    }
                    dyVar2.h4.b(canvas, -2);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.pk0
    public void u(float f10) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.b.movePreviewFragment(f10);
        }
    }

    @Override // ig.g
    public void x0(g.x xVar) {
        switch (this.a) {
            case 0:
                int i9 = org.telegram.ui.ActionBar.f6.d6;
                dy dyVar = this.b;
                xVar.a(dyVar.getThemedColor(i9));
                xVar.b(SharedConfig.chatBlurEnabled());
                if (SharedConfig.chatBlurEnabled()) {
                    yw ywVar = dyVar.B3;
                    we1 we1Var = (ywVar == null || !(ywVar.getFragment() instanceof we1)) ? null : (we1) dyVar.B3.getFragment();
                    if (we1Var != null && we1Var.getFragmentView() != null && !dyVar.f2) {
                        xVar.b = true;
                        break;
                    }
                }
                break;
            default:
                int i10 = org.telegram.ui.ActionBar.f6.d6;
                dy dyVar2 = this.b;
                xVar.a(dyVar2.getThemedColor(i10));
                xVar.b(SharedConfig.chatBlurEnabled());
                if (SharedConfig.chatBlurEnabled()) {
                    yw ywVar2 = dyVar2.B3;
                    we1 we1Var2 = (ywVar2 == null || !(ywVar2.getFragment() instanceof we1)) ? null : (we1) dyVar2.B3.getFragment();
                    if (we1Var2 != null && we1Var2.getFragmentView() != null && !dyVar2.f2) {
                        xVar.b = true;
                        break;
                    }
                }
                break;
        }
    }
}
