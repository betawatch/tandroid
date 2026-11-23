package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class bl implements org.telegram.ui.ActionBar.l0, org.telegram.messenger.ab, org.telegram.messenger.cb, org.telegram.ui.ActionBar.q1, jg.b {
    public final /* synthetic */ ml a;

    public /* synthetic */ bl(ml mlVar) {
        this.a = mlVar;
    }

    @Override // jg.b
    public void a() {
        ml mlVar = this.a;
        mlVar.f0 = false;
        mlVar.j0();
    }

    @Override // org.telegram.messenger.ab
    public boolean b(MotionEvent motionEvent, org.telegram.messenger.ha haVar) {
        MotionEvent motionEvent2;
        ml mlVar = this.a;
        if (mlVar.H != 0.0f) {
            motionEvent = MotionEvent.obtain(motionEvent);
            motionEvent.offsetLocation(0.0f, (-mlVar.H) / 2.0f);
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

    @Override // org.telegram.messenger.cb
    public void c(int i7) {
        View childAt;
        ml mlVar = this.a;
        di.b1 b1Var = mlVar.M;
        if (i7 != 1 || mlVar.I || b1Var.getChildCount() <= 0 || (childAt = b1Var.getChildAt(0)) == null) {
            return;
        }
        View F = b1Var.F(childAt);
        v4.f1 T = F == null ? null : b1Var.T(F);
        if (T == null || T.b() != 0) {
            return;
        }
        int L = mlVar.p0 == 0 ? 0 : org.telegram.messenger.g0.L(66.0f);
        int top = childAt.getTop();
        if (top < (-L)) {
            hi.u4 d = mlVar.E.d();
            mlVar.G = ((pb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom((org.telegram.messenger.bb) d.b, d.c);
            b1Var.w0(0, top + L, null);
        }
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
        ml.R(this.a);
    }
}
