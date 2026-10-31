package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class z10 extends sk0 {
    public org.telegram.messenger.u3 c;
    public final int d;
    public ArrayList h;
    public org.telegram.ui.y20 n;
    public final org.telegram.ui.b50 r;
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public boolean s = false;

    public z10(org.telegram.messenger.u3 u3Var, int i10, org.telegram.ui.b50 b50Var) {
        this.c = u3Var;
        this.d = i10;
        this.r = b50Var;
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    public final void E(ArrayList arrayList, org.telegram.ui.y20 y20Var) {
        this.h = arrayList;
        this.n = y20Var;
    }

    public final void F(org.telegram.ui.u20 u20Var, boolean z10) {
        this.s = z10;
        for (int i10 = 0; i10 < u20Var.getChildCount(); i10++) {
            View childAt = u20Var.getChildAt(i10);
            if (childAt instanceof y10) {
                y10 y10Var = (y10) childAt;
                if (y10Var.getVideoParticipant() != null) {
                    y10Var.b(z10);
                }
            }
        }
    }

    public final void G(tk0 tk0Var, boolean z10) {
        if (this.c == null) {
            return;
        }
        ArrayList arrayList = this.e;
        ArrayList arrayList2 = this.f;
        if (!z10) {
            arrayList2.clear();
            org.telegram.messenger.u3 u3Var = this.c;
            if (!u3Var.b.rtmp_stream) {
                arrayList2.addAll(u3Var.g);
            }
            arrayList.clear();
            org.telegram.messenger.u3 u3Var2 = this.c;
            if (!u3Var2.b.rtmp_stream) {
                arrayList.addAll(u3Var2.f);
            }
            f();
            return;
        }
        ArrayList arrayList3 = new ArrayList(arrayList2);
        ArrayList arrayList4 = new ArrayList(arrayList);
        arrayList2.clear();
        org.telegram.messenger.u3 u3Var3 = this.c;
        if (!u3Var3.b.rtmp_stream) {
            arrayList2.addAll(u3Var3.g);
        }
        arrayList.clear();
        org.telegram.messenger.u3 u3Var4 = this.c;
        if (!u3Var4.b.rtmp_stream) {
            arrayList.addAll(u3Var4.f);
        }
        s4.n.c(new v10(this, arrayList4, arrayList3), true).c(this);
        org.telegram.messenger.i0.a4(tk0Var);
    }

    @Override // s4.g0
    public final int b() {
        return this.f.size() + this.e.size();
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        org.telegram.messenger.v3 v3Var;
        y10 y10Var = (y10) c1Var.a;
        org.telegram.messenger.v3 v3Var2 = y10Var.f;
        ArrayList arrayList = this.e;
        if (i10 < arrayList.size()) {
            v3Var = (org.telegram.messenger.v3) arrayList.get(i10);
            groupCallParticipant = ((org.telegram.messenger.v3) arrayList.get(i10)).a;
        } else {
            int size = i10 - arrayList.size();
            ArrayList arrayList2 = this.f;
            if (size >= arrayList2.size()) {
                return;
            }
            groupCallParticipant = (TLRPC.GroupCallParticipant) arrayList2.get(i10 - arrayList.size());
            v3Var = null;
        }
        y10Var.e(v3Var, groupCallParticipant);
        if (v3Var2 != null && !v3Var2.equals(v3Var) && y10Var.K && y10Var.getRenderer() != null) {
            y10Var.b(false);
            if (v3Var != null) {
                y10Var.b(true);
                return;
            }
            return;
        }
        if (y10Var.K) {
            if (y10Var.getRenderer() == null && v3Var != null && this.s) {
                y10Var.b(true);
            } else {
                if (y10Var.getRenderer() == null || v3Var != null) {
                    return;
                }
                y10Var.b(false);
            }
        }
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        return new ck0(new y10(this, viewGroup.getContext()));
    }
}
