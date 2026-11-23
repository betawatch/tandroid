package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class t10 extends dk0 {
    public org.telegram.messenger.t3 c;
    public final int d;
    public ArrayList h;
    public org.telegram.ui.a20 n;
    public final org.telegram.ui.e40 r;
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public boolean s = false;

    public t10(org.telegram.messenger.t3 t3Var, int i7, org.telegram.ui.e40 e40Var) {
        this.c = t3Var;
        this.d = i7;
        this.r = e40Var;
    }

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(v4.f1 f1Var) {
        return false;
    }

    public final void E(ArrayList arrayList, org.telegram.ui.a20 a20Var) {
        this.h = arrayList;
        this.n = a20Var;
    }

    public final void F(org.telegram.ui.w10 w10Var, boolean z10) {
        this.s = z10;
        for (int i7 = 0; i7 < w10Var.getChildCount(); i7++) {
            View childAt = w10Var.getChildAt(i7);
            if (childAt instanceof s10) {
                s10 s10Var = (s10) childAt;
                if (s10Var.getVideoParticipant() != null) {
                    s10Var.b(z10);
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
        v4.p.c(new r10(this, arrayList4, arrayList3), true).c(this);
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
        s10 s10Var = (s10) f1Var.a;
        org.telegram.messenger.u3 u3Var2 = s10Var.f;
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
        s10Var.e(u3Var, groupCallParticipant);
        if (u3Var2 != null && !u3Var2.equals(u3Var) && s10Var.L && s10Var.getRenderer() != null) {
            s10Var.b(false);
            if (u3Var != null) {
                s10Var.b(true);
                return;
            }
            return;
        }
        if (s10Var.L) {
            if (s10Var.getRenderer() == null && u3Var != null && this.s) {
                s10Var.b(true);
            } else {
                if (s10Var.getRenderer() == null || u3Var != null) {
                    return;
                }
                s10Var.b(false);
            }
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        return new mj0(new s10(this, viewGroup.getContext()));
    }
}
