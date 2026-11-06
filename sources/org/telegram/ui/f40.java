package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class f40 extends org.telegram.ui.Components.oj0 {
    public org.telegram.messenger.r3 c;
    public final int d;
    public ArrayList f;
    public z10 h;
    public final c40 n;
    public final ArrayList e = new ArrayList();
    public boolean r = false;

    public f40(org.telegram.messenger.r3 r3Var, int i7, c40 c40Var) {
        this.c = r3Var;
        this.d = i7;
        this.n = c40Var;
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        return false;
    }

    public final void E(org.telegram.ui.Components.voip.r rVar, boolean z9) {
        if (z9 && rVar.getRenderer() == null) {
            rVar.setRenderer(org.telegram.ui.Components.voip.y.c(this.f, this.h, null, null, rVar, rVar.getParticipant(), this.c, this.n));
        } else {
            if (z9 || rVar.getRenderer() == null) {
                return;
            }
            rVar.getRenderer().setTabletGridView(null);
            rVar.setRenderer(null);
        }
    }

    public final int F() {
        org.telegram.ui.Components.pj0 pj0Var = this.n.e4;
        int size = this.e.size();
        return size <= 1 ? pj0Var.getMeasuredHeight() : size <= 4 ? pj0Var.getMeasuredHeight() / 2 : (int) (pj0Var.getMeasuredHeight() / 2.5f);
    }

    public final void G(ArrayList arrayList, z10 z10Var) {
        this.f = arrayList;
        this.h = z10Var;
    }

    public final void H(org.telegram.ui.Components.pj0 pj0Var, boolean z9, boolean z10) {
        this.r = z9;
        if (z10) {
            for (int i7 = 0; i7 < pj0Var.getChildCount(); i7++) {
                View childAt = pj0Var.getChildAt(i7);
                if (childAt instanceof org.telegram.ui.Components.voip.r) {
                    org.telegram.ui.Components.voip.r rVar = (org.telegram.ui.Components.voip.r) childAt;
                    if (rVar.getParticipant() != null) {
                        E(rVar, z9);
                    }
                }
            }
        }
    }

    public final void I(org.telegram.ui.Components.pj0 pj0Var, boolean z9) {
        if (this.c == null) {
            return;
        }
        ArrayList arrayList = this.e;
        if (!z9) {
            arrayList.clear();
            arrayList.addAll(this.c.f);
            f();
        } else {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(arrayList);
            arrayList.clear();
            arrayList.addAll(this.c.f);
            v4.o.c(new jg.h(this, arrayList2, 4), true).c(this);
            org.telegram.messenger.g0.b4(pj0Var);
        }
    }

    @Override // v4.g0
    public final int b() {
        return this.e.size();
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        org.telegram.ui.Components.voip.r rVar = (org.telegram.ui.Components.voip.r) d1Var.a;
        org.telegram.messenger.s3 participant = rVar.getParticipant();
        ArrayList arrayList = this.e;
        org.telegram.messenger.s3 s3Var = (org.telegram.messenger.s3) arrayList.get(i7);
        TLRPC.GroupCallParticipant groupCallParticipant = ((org.telegram.messenger.s3) arrayList.get(i7)).a;
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
        rVar.d = s3Var;
        if (participant != null && !participant.equals(s3Var) && rVar.e && rVar.getRenderer() != null) {
            E(rVar, false);
            E(rVar, true);
        } else if (rVar.getRenderer() != null) {
            rVar.getRenderer().j(true);
        }
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        return new org.telegram.ui.Components.xi0(new v30(this, viewGroup.getContext()));
    }
}
