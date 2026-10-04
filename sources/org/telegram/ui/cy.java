package org.telegram.ui;

import android.graphics.Point;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class cy implements org.telegram.ui.Components.mo0, org.telegram.ui.Components.pl0, ci.bc, org.telegram.ui.Components.e20 {
    public final /* synthetic */ uy a;

    public /* synthetic */ cy(uy uyVar) {
        this.a = uyVar;
    }

    @Override // ci.bc
    public ci.fc a(long j3) {
        jx jxVar = this.a.E0;
        return ci.fc.c(jxVar != null ? jxVar.e(j3) : null);
    }

    @Override // ci.bc
    public void b(long j3, ai.j jVar) {
        uy uyVar = this.a;
        if (uyVar.E0 == null) {
            jVar.run();
            return;
        }
        uyVar.G4(false, true);
        uyVar.Q = true;
        uyVar.fragmentView.invalidate();
        if (j3 == 0 || j3 == uyVar.getUserConfig().getClientUserId()) {
            uyVar.E0.S.h1(0, 0);
        } else {
            uyVar.E0.k(j3);
        }
        uyVar.e0[0].a.getViewTreeObserver().addOnPreDrawListener(new dm(1, this, jVar));
    }

    @Override // org.telegram.ui.Components.pl0
    public boolean c(float f7, float f10, int i10, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.i6;
        uy uyVar = this.a;
        if (z10) {
            org.telegram.ui.Cells.i6 i6Var = (org.telegram.ui.Cells.i6) view;
            if (i6Var.n0) {
                uyVar.W4(i6Var.getDialogId(), view);
                return true;
            }
        }
        dy dyVar = uyVar.C0;
        ai.w0 w0Var = dyVar.W;
        return uyVar.x4(view, i10, f7, dyVar.c0);
    }

    public void d(gg.q0 q0Var) {
        uy uyVar = this.a;
        if (uyVar.p3) {
            dy dyVar = uyVar.C0;
            if (dyVar != null) {
                dyVar.B0.remove(q0Var);
                dy dyVar2 = uyVar.C0;
                String obj = uyVar.j0.getSearchField().getText().toString();
                View currentView = dyVar2.getCurrentView();
                boolean z10 = TextUtils.isEmpty(dyVar2.L0) ? true : !dyVar2.f0;
                dyVar2.L0 = obj;
                dyVar2.Q(currentView, dyVar2.getCurrentPosition(), obj, z10);
            }
            uyVar.f5(true, null, null, false, true);
            uyVar.Y.a.q(uyVar.X.r);
        }
    }

    @Override // org.telegram.ui.Components.mo0
    public void e(float f7) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.a.movePreviewFragment(f7);
        }
    }

    @Override // org.telegram.ui.Components.mo0
    public void f(org.telegram.ui.Cells.s2 s2Var) {
        this.a.Q4(s2Var);
    }

    @Override // org.telegram.ui.Components.mo0
    public void finish() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.a.finishPreviewFragment();
        }
    }

    @Override // org.telegram.ui.Components.pl0
    public void i() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.a.finishPreviewFragment();
        }
    }

    @Override // org.telegram.ui.Components.pl0
    public void q(float f7) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.a.movePreviewFragment(f7);
        }
    }
}
