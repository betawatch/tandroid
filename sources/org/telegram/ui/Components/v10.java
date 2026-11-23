package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class v10 extends dk0 {
    public org.telegram.messenger.t3 c;
    public final int d;
    public ArrayList h;
    public org.telegram.ui.b20 n;
    public final org.telegram.ui.f40 r;
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public boolean s = false;

    public v10(org.telegram.messenger.t3 t3Var, int i7, org.telegram.ui.f40 f40Var) {
        this.c = t3Var;
        this.d = i7;
        this.r = f40Var;
    }

    @Override // org.telegram.ui.Components.dk0
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
            if (childAt instanceof u10) {
                u10 u10Var = (u10) childAt;
                if (u10Var.getVideoParticipant() != null) {
                    u10Var.b(z10);
                }
            }
        }
    }

    public final void G(ek0 ek0Var, boolean z10) {
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
        v4.o.c(new t10(this, arrayList4, arrayList3), true).c(this);
        org.telegram.messenger.g0.Z3(ek0Var);
    }

    @Override // v4.i0
    public final int b() {
        return this.f.size() + this.e.size();
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        org.telegram.messenger.u3 u3Var;
        u10 u10Var = (u10) f1Var.a;
        org.telegram.messenger.u3 u3Var2 = u10Var.f;
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
        u10Var.e(u3Var, groupCallParticipant);
        if (u3Var2 != null && !u3Var2.equals(u3Var) && u10Var.L && u10Var.getRenderer() != null) {
            u10Var.b(false);
            if (u3Var != null) {
                u10Var.b(true);
                return;
            }
            return;
        }
        if (u10Var.L) {
            if (u10Var.getRenderer() == null && u3Var != null && this.s) {
                u10Var.b(true);
            } else {
                if (u10Var.getRenderer() == null || u3Var != null) {
                    return;
                }
                u10Var.b(false);
            }
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        return new mj0(new u10(this, viewGroup.getContext()));
    }
}
