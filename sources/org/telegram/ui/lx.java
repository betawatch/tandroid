package org.telegram.ui;

import android.graphics.Point;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class lx implements org.telegram.ui.Components.ap0, org.telegram.ui.Components.dm0, fi.jb, org.telegram.ui.Components.l20 {
    public final /* synthetic */ ey a;

    public /* synthetic */ lx(ey eyVar) {
        this.a = eyVar;
    }

    @Override // org.telegram.ui.Components.ap0
    public void a(float f7) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.a.movePreviewFragment(f7);
        }
    }

    @Override // fi.jb
    public fi.nb b(long j10) {
        sw swVar = this.a.E0;
        return fi.nb.c(swVar != null ? swVar.e(j10) : null);
    }

    @Override // fi.jb
    public void c(long j10, bi.r3 r3Var) {
        ey eyVar = this.a;
        if (eyVar.E0 == null) {
            r3Var.run();
            return;
        }
        eyVar.F4(false, true);
        eyVar.Q = true;
        eyVar.fragmentView.invalidate();
        if (j10 == 0 || j10 == eyVar.getUserConfig().getClientUserId()) {
            eyVar.E0.S.h1(0, 0);
        } else {
            eyVar.E0.k(j10);
        }
        eyVar.e0[0].a.getViewTreeObserver().addOnPreDrawListener(new bm(1, this, r3Var));
    }

    @Override // org.telegram.ui.Components.ap0
    public void d(org.telegram.ui.Cells.p2 p2Var) {
        this.a.P4(p2Var);
    }

    @Override // org.telegram.ui.Components.dm0
    public boolean e(float f7, float f10, int i10, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.m6;
        ey eyVar = this.a;
        if (z10) {
            org.telegram.ui.Cells.m6 m6Var = (org.telegram.ui.Cells.m6) view;
            if (m6Var.n0) {
                eyVar.V4(m6Var.getDialogId(), view);
                return true;
            }
        }
        mx mxVar = eyVar.C0;
        bi.r1 r1Var = mxVar.a0;
        return eyVar.w4(view, i10, f7, mxVar.d0);
    }

    public void f(ig.p0 p0Var) {
        ey eyVar = this.a;
        if (eyVar.q3) {
            mx mxVar = eyVar.C0;
            if (mxVar != null) {
                mxVar.C0.remove(p0Var);
                mx mxVar2 = eyVar.C0;
                String obj = eyVar.j0.getSearchField().getText().toString();
                View currentView = mxVar2.getCurrentView();
                boolean z10 = TextUtils.isEmpty(mxVar2.M0) ? true : !mxVar2.g0;
                mxVar2.M0 = obj;
                mxVar2.P(currentView, mxVar2.getCurrentPosition(), obj, z10);
            }
            eyVar.f5(true, null, null, false, true);
            eyVar.Y.a.l(eyVar.X.r);
        }
    }

    @Override // org.telegram.ui.Components.ap0
    public void finish() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.a.finishPreviewFragment();
        }
    }

    @Override // org.telegram.ui.Components.dm0
    public void g() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.a.finishPreviewFragment();
        }
    }

    @Override // org.telegram.ui.Components.dm0
    public void o(float f7) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.a.movePreviewFragment(f7);
        }
    }
}
