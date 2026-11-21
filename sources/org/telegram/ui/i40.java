package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class i40 extends org.telegram.ui.Components.dk0 {
    public org.telegram.messenger.t3 c;
    public final int d;
    public ArrayList f;
    public b20 h;
    public final f40 n;
    public final ArrayList e = new ArrayList();
    public boolean r = false;

    public i40(org.telegram.messenger.t3 t3Var, int i7, f40 f40Var) {
        this.c = t3Var;
        this.d = i7;
        this.n = f40Var;
    }

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(v4.f1 f1Var) {
        return false;
    }

    public final void E(org.telegram.ui.Components.voip.r rVar, boolean z10) {
        if (z10 && rVar.getRenderer() == null) {
            rVar.setRenderer(org.telegram.ui.Components.voip.y.c(this.f, this.h, null, null, rVar, rVar.getParticipant(), this.c, this.n));
        } else {
            if (z10 || rVar.getRenderer() == null) {
                return;
            }
            rVar.getRenderer().setTabletGridView(null);
            rVar.setRenderer(null);
        }
    }

    public final int F() {
        org.telegram.ui.Components.ek0 ek0Var = this.n.m4;
        int size = this.e.size();
        return size <= 1 ? ek0Var.getMeasuredHeight() : size <= 4 ? ek0Var.getMeasuredHeight() / 2 : (int) (ek0Var.getMeasuredHeight() / 2.5f);
    }

    public final void G(ArrayList arrayList, b20 b20Var) {
        this.f = arrayList;
        this.h = b20Var;
    }

    public final void H(org.telegram.ui.Components.ek0 ek0Var, boolean z10, boolean z11) {
        this.r = z10;
        if (z11) {
            for (int i7 = 0; i7 < ek0Var.getChildCount(); i7++) {
                View childAt = ek0Var.getChildAt(i7);
                if (childAt instanceof org.telegram.ui.Components.voip.r) {
                    org.telegram.ui.Components.voip.r rVar = (org.telegram.ui.Components.voip.r) childAt;
                    if (rVar.getParticipant() != null) {
                        E(rVar, z10);
                    }
                }
            }
        }
    }

    public final void I(org.telegram.ui.Components.ek0 ek0Var, boolean z10) {
        if (this.c == null) {
            return;
        }
        ArrayList arrayList = this.e;
        if (!z10) {
            arrayList.clear();
            arrayList.addAll(this.c.f);
            f();
        } else {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(arrayList);
            arrayList.clear();
            arrayList.addAll(this.c.f);
            v4.o.c(new jg.g(this, arrayList2, 4), true).c(this);
            org.telegram.messenger.g0.Z3(ek0Var);
        }
    }

    @Override // v4.i0
    public final int b() {
        return this.e.size();
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        org.telegram.ui.Components.voip.r rVar = (org.telegram.ui.Components.voip.r) f1Var.a;
        org.telegram.messenger.u3 participant = rVar.getParticipant();
        ArrayList arrayList = this.e;
        org.telegram.messenger.u3 u3Var = (org.telegram.messenger.u3) arrayList.get(i7);
        TLRPC.GroupCallParticipant groupCallParticipant = ((org.telegram.messenger.u3) arrayList.get(i7)).a;
        int size = arrayList.size();
        int i10 = 6;
        if (size > 1 && size != 2 && (size != 3 || i7 == 0 || i7 == 1)) {
            i10 = 3;
        }
        rVar.a = i10;
        rVar.b = this;
        if (rVar.getMeasuredHeight() != F()) {
            rVar.requestLayout();
        }
        org.telegram.messenger.c.a(this.d);
        TLRPC.Peer peer = this.c.J;
        rVar.d = u3Var;
        if (participant != null && !participant.equals(u3Var) && rVar.e && rVar.getRenderer() != null) {
            E(rVar, false);
            E(rVar, true);
        } else if (rVar.getRenderer() != null) {
            rVar.getRenderer().j(true);
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        return new org.telegram.ui.Components.mj0(new y30(this, viewGroup.getContext()));
    }
}
