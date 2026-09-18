package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Point;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class cy implements ah.k, org.telegram.ui.Components.vn0, org.telegram.ui.Components.dl0, ci.fc, org.telegram.ui.Components.a20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wy b;

    public /* synthetic */ cy(wy wyVar, int i10) {
        this.a = i10;
        this.b = wyVar;
    }

    @Override // ci.fc
    public ci.jc a(long j3) {
        nx nxVar = this.b.E0;
        return ci.jc.c(nxVar != null ? nxVar.e(j3) : null);
    }

    @Override // ah.k
    public void b(Canvas canvas) {
        fh.d dVar;
        fh.d dVar2;
        switch (this.a) {
            case 0:
                wy wyVar = this.b;
                int measuredWidth = wyVar.fragmentView.getMeasuredWidth();
                int measuredHeight = wyVar.fragmentView.getMeasuredHeight();
                canvas.drawColor(wyVar.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                if (SharedConfig.chatBlurEnabled()) {
                    qx qxVar = wyVar.F3;
                    fg1 fg1Var = (qxVar == null || !(qxVar.getFragment() instanceof fg1)) ? null : (fg1) wyVar.F3.getFragment();
                    if (fg1Var != null && fg1Var.getFragmentView() != null && !wyVar.j2 && (dVar = fg1Var.g1) != null) {
                        canvas.save();
                        canvas.translate(fg1Var.getFragmentView().getTranslationX(), fg1Var.getFragmentView().getTranslationY());
                        dVar.y(canvas, 0.0f, 0.0f, measuredWidth, measuredHeight);
                        canvas.restore();
                    }
                    wyVar.k4.b(canvas, -3);
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
                    fg1 fg1Var2 = (qxVar2 == null || !(qxVar2.getFragment() instanceof fg1)) ? null : (fg1) wyVar2.F3.getFragment();
                    if (fg1Var2 != null && fg1Var2.getFragmentView() != null && !wyVar2.j2 && (dVar2 = fg1Var2.h1) != null) {
                        canvas.save();
                        canvas.translate(fg1Var2.getFragmentView().getTranslationX(), fg1Var2.getFragmentView().getTranslationY());
                        dVar2.y(canvas, 0.0f, 0.0f, measuredWidth2, measuredHeight2);
                        canvas.restore();
                    }
                    wyVar2.k4.b(canvas, -2);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.dl0
    public boolean c(float f7, float f10, int i10, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.h6;
        wy wyVar = this.b;
        if (z10) {
            org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) view;
            if (h6Var.n0) {
                wyVar.N4(h6Var.getDialogId(), view);
                return true;
            }
        }
        gy gyVar = wyVar.C0;
        ai.w0 w0Var = gyVar.W;
        return wyVar.o4(view, i10, f7, gyVar.c0);
    }

    @Override // ci.fc
    public void d(long j3, ai.j jVar) {
        wy wyVar = this.b;
        if (wyVar.E0 == null) {
            jVar.run();
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
        wyVar.e0[0].a.getViewTreeObserver().addOnPreDrawListener(new hm(1, this, jVar));
    }

    @Override // org.telegram.ui.Components.vn0
    public void e(float f7) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.b.movePreviewFragment(f7);
        }
    }

    @Override // org.telegram.ui.Components.vn0
    public void f(org.telegram.ui.Cells.r2 r2Var) {
        this.b.H4(r2Var);
    }

    @Override // org.telegram.ui.Components.vn0
    public void finish() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.b.finishPreviewFragment();
        }
    }

    @Override // org.telegram.ui.Components.dl0
    public void g() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.b.finishPreviewFragment();
        }
    }

    public void h(gg.q0 q0Var) {
        wy wyVar = this.b;
        if (wyVar.p3) {
            gy gyVar = wyVar.C0;
            if (gyVar != null) {
                gyVar.B0.remove(q0Var);
                gy gyVar2 = wyVar.C0;
                String obj = wyVar.j0.getSearchField().getText().toString();
                View currentView = gyVar2.getCurrentView();
                boolean z10 = TextUtils.isEmpty(gyVar2.L0) ? true : !gyVar2.f0;
                gyVar2.L0 = obj;
                gyVar2.P(currentView, gyVar2.getCurrentPosition(), obj, z10);
            }
            wyVar.W4(true, null, null, false, true);
            wyVar.Y.a.q(wyVar.X.r);
        }
    }

    @Override // ah.k
    public void m(ah.a aVar) {
        switch (this.a) {
            case 0:
                int i10 = org.telegram.ui.ActionBar.j6.d6;
                wy wyVar = this.b;
                aVar.a(wyVar.getThemedColor(i10));
                aVar.b(SharedConfig.chatBlurEnabled());
                if (SharedConfig.chatBlurEnabled()) {
                    qx qxVar = wyVar.F3;
                    fg1 fg1Var = (qxVar == null || !(qxVar.getFragment() instanceof fg1)) ? null : (fg1) wyVar.F3.getFragment();
                    if (fg1Var != null && fg1Var.getFragmentView() != null && !wyVar.j2) {
                        aVar.a = true;
                        break;
                    }
                }
                break;
            default:
                int i11 = org.telegram.ui.ActionBar.j6.d6;
                wy wyVar2 = this.b;
                aVar.a(wyVar2.getThemedColor(i11));
                aVar.b(SharedConfig.chatBlurEnabled());
                if (SharedConfig.chatBlurEnabled()) {
                    qx qxVar2 = wyVar2.F3;
                    fg1 fg1Var2 = (qxVar2 == null || !(qxVar2.getFragment() instanceof fg1)) ? null : (fg1) wyVar2.F3.getFragment();
                    if (fg1Var2 != null && fg1Var2.getFragmentView() != null && !wyVar2.j2) {
                        aVar.a = true;
                        break;
                    }
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.dl0
    public void q(float f7) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.b.movePreviewFragment(f7);
        }
    }
}
