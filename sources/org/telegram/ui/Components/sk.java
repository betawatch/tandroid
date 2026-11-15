package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class sk implements org.telegram.ui.ActionBar.l0, org.telegram.messenger.ab, org.telegram.messenger.cb, org.telegram.ui.ActionBar.q1, jg.b {
    public final /* synthetic */ dl a;

    public /* synthetic */ sk(dl dlVar) {
        this.a = dlVar;
    }

    @Override // jg.b
    public void a() {
        dl dlVar = this.a;
        dlVar.f0 = false;
        dlVar.j0();
    }

    @Override // org.telegram.messenger.cb
    public void b(int i7) {
        View childAt;
        dl dlVar = this.a;
        di.c1 c1Var = dlVar.M;
        if (i7 != 1 || dlVar.I || c1Var.getChildCount() <= 0 || (childAt = c1Var.getChildAt(0)) == null) {
            return;
        }
        View F = c1Var.F(childAt);
        v4.e1 T = F == null ? null : c1Var.T(F);
        if (T == null || T.b() != 0) {
            return;
        }
        int L = dlVar.p0 == 0 ? 0 : org.telegram.messenger.g0.L(66.0f);
        int top = childAt.getTop();
        if (top < (-L)) {
            hi.w4 d = dlVar.E.d();
            dlVar.G = ((pb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom((org.telegram.messenger.bb) d.b, d.c);
            c1Var.w0(0, top + L, null);
        }
    }

    @Override // org.telegram.messenger.ab
    public boolean c(MotionEvent motionEvent, org.telegram.messenger.ha haVar) {
        MotionEvent motionEvent2;
        dl dlVar = this.a;
        if (dlVar.H != 0.0f) {
            motionEvent = MotionEvent.obtain(motionEvent);
            motionEvent.offsetLocation(0.0f, (-dlVar.H) / 2.0f);
            motionEvent2 = motionEvent;
        } else {
            motionEvent2 = null;
        }
        boolean booleanValue = haVar.a(motionEvent).booleanValue();
        if (motionEvent2 != null) {
            motionEvent2.recycle();
        }
        return booleanValue;
    }

    @Override // org.telegram.ui.ActionBar.l0
    public void g(int i7) {
        org.telegram.messenger.ea eaVar = this.a.E;
        if (eaVar == null) {
            return;
        }
        if (i7 == 2) {
            eaVar.j(0);
        } else if (i7 == 3) {
            eaVar.j(1);
        } else if (i7 == 4) {
            eaVar.j(2);
        }
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        dl.R(this.a);
    }
}
