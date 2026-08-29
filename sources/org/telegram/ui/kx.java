package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Point;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class kx implements lg.g, org.telegram.ui.Components.pn0, org.telegram.ui.Components.cl0, nh.xa, org.telegram.ui.Components.w10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fy b;

    public /* synthetic */ kx(fy fyVar, int i10) {
        this.a = i10;
        this.b = fyVar;
    }

    @Override // nh.xa
    public nh.bb a(long j10) {
        xw xwVar = this.b.A0;
        return nh.bb.c(xwVar != null ? xwVar.e(j10) : null);
    }

    @Override // org.telegram.ui.Components.cl0
    public boolean b(float f9, float f10, int i10, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.f6;
        fy fyVar = this.b;
        if (z10) {
            org.telegram.ui.Cells.f6 f6Var = (org.telegram.ui.Cells.f6) view;
            if (f6Var.j0) {
                fyVar.N4(f6Var.getDialogId(), view);
                return true;
            }
        }
        ox oxVar = fyVar.y0;
        jh.e1 e1Var = oxVar.R;
        return fyVar.o4(view, i10, f9, oxVar.U);
    }

    @Override // nh.xa
    public void c(long j10, eg.z1 z1Var) {
        fy fyVar = this.b;
        if (fyVar.A0 == null) {
            z1Var.run();
            return;
        }
        fyVar.x4(false, true);
        fyVar.M = true;
        fyVar.fragmentView.invalidate();
        if (j10 == 0 || j10 == fyVar.getUserConfig().getClientUserId()) {
            fyVar.A0.O.h1(0, 0);
        } else {
            fyVar.A0.k(j10);
        }
        fyVar.a0[0].a.getViewTreeObserver().addOnPreDrawListener(new fh.f(2, this, z1Var));
    }

    @Override // lg.g
    public void d(Canvas canvas) {
        qg.d dVar;
        qg.d dVar2;
        switch (this.a) {
            case 0:
                fy fyVar = this.b;
                int measuredWidth = fyVar.fragmentView.getMeasuredWidth();
                int measuredHeight = fyVar.fragmentView.getMeasuredHeight();
                canvas.drawColor(fyVar.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
                if (SharedConfig.chatBlurEnabled()) {
                    ax axVar = fyVar.B3;
                    ze1 ze1Var = (axVar == null || !(axVar.getFragment() instanceof ze1)) ? null : (ze1) fyVar.B3.getFragment();
                    if (ze1Var != null && ze1Var.getFragmentView() != null && !fyVar.f2 && (dVar = ze1Var.c1) != null) {
                        canvas.save();
                        canvas.translate(ze1Var.getFragmentView().getTranslationX(), ze1Var.getFragmentView().getTranslationY());
                        dVar.E0(canvas, 0.0f, 0.0f, measuredWidth, measuredHeight);
                        canvas.restore();
                    }
                    fyVar.h4.b(canvas, -3);
                    break;
                }
                break;
            default:
                fy fyVar2 = this.b;
                int measuredWidth2 = fyVar2.fragmentView.getMeasuredWidth();
                int measuredHeight2 = fyVar2.fragmentView.getMeasuredHeight();
                canvas.drawColor(fyVar2.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
                if (SharedConfig.chatBlurEnabled()) {
                    ax axVar2 = fyVar2.B3;
                    ze1 ze1Var2 = (axVar2 == null || !(axVar2.getFragment() instanceof ze1)) ? null : (ze1) fyVar2.B3.getFragment();
                    if (ze1Var2 != null && ze1Var2.getFragmentView() != null && !fyVar2.f2 && (dVar2 = ze1Var2.d1) != null) {
                        canvas.save();
                        canvas.translate(ze1Var2.getFragmentView().getTranslationX(), ze1Var2.getFragmentView().getTranslationY());
                        dVar2.E0(canvas, 0.0f, 0.0f, measuredWidth2, measuredHeight2);
                        canvas.restore();
                    }
                    fyVar2.h4.b(canvas, -2);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.pn0
    public void e(float f9) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.b.movePreviewFragment(f9);
        }
    }

    @Override // org.telegram.ui.Components.pn0
    public void f(org.telegram.ui.Cells.p2 p2Var) {
        this.b.H4(p2Var);
    }

    @Override // org.telegram.ui.Components.pn0
    public void finish() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.b.finishPreviewFragment();
        }
    }

    public void g(rf.f0 f0Var) {
        fy fyVar = this.b;
        if (fyVar.l3) {
            ox oxVar = fyVar.y0;
            if (oxVar != null) {
                oxVar.w0.remove(f0Var);
                ox oxVar2 = fyVar.y0;
                String obj = fyVar.f0.getSearchField().getText().toString();
                View currentView = oxVar2.getCurrentView();
                boolean z10 = TextUtils.isEmpty(oxVar2.G0) ? true : !oxVar2.a0;
                oxVar2.G0 = obj;
                oxVar2.O(currentView, oxVar2.getCurrentPosition(), obj, z10);
            }
            fyVar.W4(true, null, null, false, true);
            fyVar.U.a.q(fyVar.T.r);
        }
    }

    @Override // org.telegram.ui.Components.cl0
    public void h() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.b.finishPreviewFragment();
        }
    }

    @Override // lg.g
    public void q(g.x xVar) {
        switch (this.a) {
            case 0:
                int i10 = org.telegram.ui.ActionBar.g6.d6;
                fy fyVar = this.b;
                xVar.a(fyVar.getThemedColor(i10));
                xVar.b(SharedConfig.chatBlurEnabled());
                if (SharedConfig.chatBlurEnabled()) {
                    ax axVar = fyVar.B3;
                    ze1 ze1Var = (axVar == null || !(axVar.getFragment() instanceof ze1)) ? null : (ze1) fyVar.B3.getFragment();
                    if (ze1Var != null && ze1Var.getFragmentView() != null && !fyVar.f2) {
                        xVar.b = true;
                        break;
                    }
                }
                break;
            default:
                int i11 = org.telegram.ui.ActionBar.g6.d6;
                fy fyVar2 = this.b;
                xVar.a(fyVar2.getThemedColor(i11));
                xVar.b(SharedConfig.chatBlurEnabled());
                if (SharedConfig.chatBlurEnabled()) {
                    ax axVar2 = fyVar2.B3;
                    ze1 ze1Var2 = (axVar2 == null || !(axVar2.getFragment() instanceof ze1)) ? null : (ze1) fyVar2.B3.getFragment();
                    if (ze1Var2 != null && ze1Var2.getFragmentView() != null && !fyVar2.f2) {
                        xVar.b = true;
                        break;
                    }
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.cl0
    public void r(float f9) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.b.movePreviewFragment(f9);
        }
    }
}
