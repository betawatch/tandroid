package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class zk implements org.telegram.ui.ActionBar.m0, org.telegram.messenger.za, org.telegram.messenger.bb, org.telegram.ui.ActionBar.r1, jg.b {
    public final /* synthetic */ kl a;

    public /* synthetic */ zk(kl klVar) {
        this.a = klVar;
    }

    @Override // jg.b
    public void a() {
        kl klVar = this.a;
        klVar.f0 = false;
        klVar.j0();
    }

    @Override // org.telegram.messenger.za
    public boolean b(MotionEvent motionEvent, org.telegram.messenger.ga gaVar) {
        MotionEvent motionEvent2;
        kl klVar = this.a;
        if (klVar.H != 0.0f) {
            motionEvent = MotionEvent.obtain(motionEvent);
            motionEvent.offsetLocation(0.0f, (-klVar.H) / 2.0f);
            motionEvent2 = motionEvent;
        } else {
            motionEvent2 = null;
        }
        boolean booleanValue = gaVar.a(motionEvent).booleanValue();
        if (motionEvent2 != null) {
            motionEvent2.recycle();
        }
        return booleanValue;
    }

    @Override // org.telegram.messenger.bb
    public void c(int i7) {
        View childAt;
        kl klVar = this.a;
        di.b1 b1Var = klVar.M;
        if (i7 != 1 || klVar.I || b1Var.getChildCount() <= 0 || (childAt = b1Var.getChildAt(0)) == null) {
            return;
        }
        View F = b1Var.F(childAt);
        v4.f1 T = F == null ? null : b1Var.T(F);
        if (T == null || T.b() != 0) {
            return;
        }
        int L = klVar.p0 == 0 ? 0 : org.telegram.messenger.g0.L(66.0f);
        int top = childAt.getTop();
        if (top < (-L)) {
            hi.u4 d = klVar.E.d();
            klVar.G = ((pb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom((org.telegram.messenger.ab) d.b, d.c);
            b1Var.w0(0, top + L, null);
        }
    }

    @Override // org.telegram.ui.ActionBar.m0
    public void g(int i7) {
        org.telegram.messenger.da daVar = this.a.E;
        if (daVar == null) {
            return;
        }
        if (i7 == 2) {
            daVar.j(0);
        } else if (i7 == 3) {
            daVar.j(1);
        } else if (i7 == 4) {
            daVar.j(2);
        }
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        kl.R(this.a);
    }
}
