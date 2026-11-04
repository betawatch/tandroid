package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jk implements org.telegram.ui.ActionBar.l0, org.telegram.messenger.ua, org.telegram.messenger.wa, org.telegram.ui.ActionBar.p1, kg.b {
    public final /* synthetic */ uk a;

    public /* synthetic */ jk(uk ukVar) {
        this.a = ukVar;
    }

    @Override // kg.b
    public void a() {
        uk ukVar = this.a;
        ukVar.f0 = false;
        ukVar.j0();
    }

    @Override // org.telegram.messenger.ua
    public boolean b(MotionEvent motionEvent, org.telegram.messenger.ca caVar) {
        MotionEvent motionEvent2;
        uk ukVar = this.a;
        if (ukVar.H != 0.0f) {
            motionEvent = MotionEvent.obtain(motionEvent);
            motionEvent.offsetLocation(0.0f, (-ukVar.H) / 2.0f);
            motionEvent2 = motionEvent;
        } else {
            motionEvent2 = null;
        }
        boolean booleanValue = caVar.a(motionEvent).booleanValue();
        if (motionEvent2 != null) {
            motionEvent2.recycle();
        }
        return booleanValue;
    }

    @Override // org.telegram.messenger.wa
    public void c(int i3) {
        View childAt;
        uk ukVar = this.a;
        ci.j1 j1Var = ukVar.M;
        if (i3 != 1 || ukVar.I || j1Var.getChildCount() <= 0 || (childAt = j1Var.getChildAt(0)) == null) {
            return;
        }
        View F = j1Var.F(childAt);
        u4.d1 T = F == null ? null : j1Var.T(F);
        if (T == null || T.b() != 0) {
            return;
        }
        int L = ukVar.p0 == 0 ? 0 : org.telegram.messenger.g0.L(66.0f);
        int top = childAt.getTop();
        if (top < (-L)) {
            gi.w4 d = ukVar.E.d();
            ukVar.G = ((mb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom((org.telegram.messenger.va) d.b, d.c);
            j1Var.w0(0, top + L, null);
        }
    }

    @Override // org.telegram.ui.ActionBar.p1
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        uk.Q(this.a);
    }

    @Override // org.telegram.ui.ActionBar.l0
    public void i(int i3) {
        org.telegram.messenger.z9 z9Var = this.a.E;
        if (z9Var == null) {
            return;
        }
        if (i3 == 2) {
            z9Var.j(0);
        } else if (i3 == 3) {
            z9Var.j(1);
        } else if (i3 == 4) {
            z9Var.j(2);
        }
    }
}
