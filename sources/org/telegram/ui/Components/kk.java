package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kk implements org.telegram.ui.ActionBar.m0, org.telegram.messenger.bb, org.telegram.messenger.db, org.telegram.ui.ActionBar.r1, jg.b {
    public final /* synthetic */ wk a;

    public /* synthetic */ kk(wk wkVar) {
        this.a = wkVar;
    }

    @Override // jg.b
    public void a() {
        wk wkVar = this.a;
        wkVar.e0 = false;
        wkVar.j0();
    }

    @Override // org.telegram.messenger.bb
    public boolean b(MotionEvent motionEvent, org.telegram.messenger.ia iaVar) {
        MotionEvent motionEvent2;
        wk wkVar = this.a;
        if (wkVar.G != 0.0f) {
            motionEvent = MotionEvent.obtain(motionEvent);
            motionEvent.offsetLocation(0.0f, (-wkVar.G) / 2.0f);
            motionEvent2 = motionEvent;
        } else {
            motionEvent2 = null;
        }
        boolean booleanValue = iaVar.a(motionEvent).booleanValue();
        if (motionEvent2 != null) {
            motionEvent2.recycle();
        }
        return booleanValue;
    }

    @Override // org.telegram.messenger.db
    public void c(int i7) {
        View childAt;
        wk wkVar = this.a;
        bi.q1 q1Var = wkVar.L;
        if (i7 != 1 || wkVar.H || q1Var.getChildCount() <= 0 || (childAt = q1Var.getChildAt(0)) == null) {
            return;
        }
        View F = q1Var.F(childAt);
        v4.d1 T = F == null ? null : q1Var.T(F);
        if (T == null || T.b() != 0) {
            return;
        }
        int L = wkVar.o0 == 0 ? 0 : org.telegram.messenger.g0.L(66.0f);
        int top = childAt.getTop();
        if (top < (-L)) {
            fi.y4 d = wkVar.D.d();
            wkVar.F = ((nb.a) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom((org.telegram.messenger.cb) d.b, d.c);
            q1Var.w0(0, top + L, null);
        }
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        wk.Q(this.a);
    }

    @Override // org.telegram.ui.ActionBar.m0
    public void i(int i7) {
        org.telegram.messenger.fa faVar = this.a.D;
        if (faVar == null) {
            return;
        }
        if (i7 == 2) {
            faVar.j(0);
        } else if (i7 == 3) {
            faVar.j(1);
        } else if (i7 == 4) {
            faVar.j(2);
        }
    }
}
