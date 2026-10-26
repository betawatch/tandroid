package org.telegram.ui;

import android.graphics.Point;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ix implements org.telegram.ui.Components.zo0, org.telegram.ui.Components.cm0, fi.jb, org.telegram.ui.Components.l20 {
    public final /* synthetic */ cy a;

    public /* synthetic */ ix(cy cyVar) {
        this.a = cyVar;
    }

    @Override // org.telegram.ui.Components.zo0
    public void a(float f7) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.a.movePreviewFragment(f7);
        }
    }

    @Override // fi.jb
    public fi.nb b(long j10) {
        qw qwVar = this.a.E0;
        return fi.nb.c(qwVar != null ? qwVar.e(j10) : null);
    }

    @Override // fi.jb
    public void c(long j10, bi.r3 r3Var) {
        cy cyVar = this.a;
        if (cyVar.E0 == null) {
            r3Var.run();
            return;
        }
        cyVar.F4(false, true);
        cyVar.Q = true;
        cyVar.fragmentView.invalidate();
        if (j10 == 0 || j10 == cyVar.getUserConfig().getClientUserId()) {
            cyVar.E0.S.h1(0, 0);
        } else {
            cyVar.E0.k(j10);
        }
        cyVar.e0[0].a.getViewTreeObserver().addOnPreDrawListener(new zl(1, this, r3Var));
    }

    @Override // org.telegram.ui.Components.zo0
    public void d(org.telegram.ui.Cells.p2 p2Var) {
        this.a.P4(p2Var);
    }

    @Override // org.telegram.ui.Components.cm0
    public boolean e(float f7, float f10, int i10, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.m6;
        cy cyVar = this.a;
        if (z10) {
            org.telegram.ui.Cells.m6 m6Var = (org.telegram.ui.Cells.m6) view;
            if (m6Var.n0) {
                cyVar.V4(m6Var.getDialogId(), view);
                return true;
            }
        }
        jx jxVar = cyVar.C0;
        bi.r1 r1Var = jxVar.a0;
        return cyVar.w4(view, i10, f7, jxVar.d0);
    }

    public void f(ig.p0 p0Var) {
        cy cyVar = this.a;
        if (cyVar.q3) {
            jx jxVar = cyVar.C0;
            if (jxVar != null) {
                jxVar.C0.remove(p0Var);
                jx jxVar2 = cyVar.C0;
                String obj = cyVar.j0.getSearchField().getText().toString();
                View currentView = jxVar2.getCurrentView();
                boolean z10 = TextUtils.isEmpty(jxVar2.M0) ? true : !jxVar2.g0;
                jxVar2.M0 = obj;
                jxVar2.P(currentView, jxVar2.getCurrentPosition(), obj, z10);
            }
            cyVar.f5(true, null, null, false, true);
            cyVar.Y.a.l(cyVar.X.r);
        }
    }

    @Override // org.telegram.ui.Components.zo0
    public void finish() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.a.finishPreviewFragment();
        }
    }

    @Override // org.telegram.ui.Components.cm0
    public void g() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.a.finishPreviewFragment();
        }
    }

    @Override // org.telegram.ui.Components.cm0
    public void o(float f7) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.a.movePreviewFragment(f7);
        }
    }
}
