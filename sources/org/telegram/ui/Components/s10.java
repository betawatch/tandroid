package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class s10 extends bk0 {
    public org.telegram.messenger.t3 c;
    public final int d;
    public ArrayList h;
    public org.telegram.ui.b20 n;
    public final org.telegram.ui.f40 r;
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public boolean s = false;

    public s10(org.telegram.messenger.t3 t3Var, int i7, org.telegram.ui.f40 f40Var) {
        this.c = t3Var;
        this.d = i7;
        this.r = f40Var;
    }

    @Override // org.telegram.ui.Components.bk0
    public final boolean D(v4.f1 f1Var) {
        return false;
    }

    public final void E(ArrayList arrayList, org.telegram.ui.b20 b20Var) {
        this.h = arrayList;
        this.n = b20Var;
    }

    public final void F(org.telegram.ui.x10 x10Var, boolean z10) {
        this.s = z10;
        for (int i7 = 0; i7 < x10Var.getChildCount(); i7++) {
            View childAt = x10Var.getChildAt(i7);
            if (childAt instanceof r10) {
                r10 r10Var = (r10) childAt;
                if (r10Var.getVideoParticipant() != null) {
                    r10Var.b(z10);
                }
            }
        }
    }

    public final void G(ck0 ck0Var, boolean z10) {
        if (this.c == null) {
            return;
        }
        ArrayList arrayList = this.e;
        ArrayList arrayList2 = this.f;
        if (!z10) {
            arrayList2.clear();
            org.telegram.messenger.t3 t3Var = this.c;
            if (!t3Var.b.rtmp_stream) {
                arrayList2.addAll(t3Var.g);
            }
            arrayList.clear();
            org.telegram.messenger.t3 t3Var2 = this.c;
            if (!t3Var2.b.rtmp_stream) {
                arrayList.addAll(t3Var2.f);
            }
            f();
            return;
        }
        ArrayList arrayList3 = new ArrayList(arrayList2);
        ArrayList arrayList4 = new ArrayList(arrayList);
        arrayList2.clear();
        org.telegram.messenger.t3 t3Var3 = this.c;
        if (!t3Var3.b.rtmp_stream) {
            arrayList2.addAll(t3Var3.g);
        }
        arrayList.clear();
        org.telegram.messenger.t3 t3Var4 = this.c;
        if (!t3Var4.b.rtmp_stream) {
            arrayList.addAll(t3Var4.f);
        }
        v4.o.c(new q10(this, arrayList4, arrayList3), true).c(this);
        org.telegram.messenger.g0.Z3(ck0Var);
    }

    @Override // v4.i0
    public final int b() {
        return this.f.size() + this.e.size();
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        org.telegram.messenger.u3 u3Var;
        r10 r10Var = (r10) f1Var.a;
        org.telegram.messenger.u3 u3Var2 = r10Var.f;
        ArrayList arrayList = this.e;
        if (i7 < arrayList.size()) {
            u3Var = (org.telegram.messenger.u3) arrayList.get(i7);
            groupCallParticipant = ((org.telegram.messenger.u3) arrayList.get(i7)).a;
        } else {
            int size = i7 - arrayList.size();
            ArrayList arrayList2 = this.f;
            if (size >= arrayList2.size()) {
                return;
            }
            groupCallParticipant = (TLRPC.GroupCallParticipant) arrayList2.get(i7 - arrayList.size());
            u3Var = null;
        }
        r10Var.e(u3Var, groupCallParticipant);
        if (u3Var2 != null && !u3Var2.equals(u3Var) && r10Var.L && r10Var.getRenderer() != null) {
            r10Var.b(false);
            if (u3Var != null) {
                r10Var.b(true);
                return;
            }
            return;
        }
        if (r10Var.L) {
            if (r10Var.getRenderer() == null && u3Var != null && this.s) {
                r10Var.b(true);
            } else {
                if (r10Var.getRenderer() == null || u3Var != null) {
                    return;
                }
                r10Var.b(false);
            }
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        return new kj0(new r10(this, viewGroup.getContext()));
    }
}
