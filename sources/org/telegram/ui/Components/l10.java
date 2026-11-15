package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class l10 extends tj0 {
    public org.telegram.messenger.r3 c;
    public final int d;
    public ArrayList h;
    public org.telegram.ui.y10 n;
    public final org.telegram.ui.c40 r;
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public boolean s = false;

    public l10(org.telegram.messenger.r3 r3Var, int i7, org.telegram.ui.c40 c40Var) {
        this.c = r3Var;
        this.d = i7;
        this.r = c40Var;
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean D(v4.e1 e1Var) {
        return false;
    }

    public final void E(ArrayList arrayList, org.telegram.ui.y10 y10Var) {
        this.h = arrayList;
        this.n = y10Var;
    }

    public final void F(org.telegram.ui.u10 u10Var, boolean z10) {
        this.s = z10;
        for (int i7 = 0; i7 < u10Var.getChildCount(); i7++) {
            View childAt = u10Var.getChildAt(i7);
            if (childAt instanceof k10) {
                k10 k10Var = (k10) childAt;
                if (k10Var.getVideoParticipant() != null) {
                    k10Var.b(z10);
                }
            }
        }
    }

    public final void G(uj0 uj0Var, boolean z10) {
        if (this.c == null) {
            return;
        }
        ArrayList arrayList = this.e;
        ArrayList arrayList2 = this.f;
        if (!z10) {
            arrayList2.clear();
            org.telegram.messenger.r3 r3Var = this.c;
            if (!r3Var.b.rtmp_stream) {
                arrayList2.addAll(r3Var.g);
            }
            arrayList.clear();
            org.telegram.messenger.r3 r3Var2 = this.c;
            if (!r3Var2.b.rtmp_stream) {
                arrayList.addAll(r3Var2.f);
            }
            f();
            return;
        }
        ArrayList arrayList3 = new ArrayList(arrayList2);
        ArrayList arrayList4 = new ArrayList(arrayList);
        arrayList2.clear();
        org.telegram.messenger.r3 r3Var3 = this.c;
        if (!r3Var3.b.rtmp_stream) {
            arrayList2.addAll(r3Var3.g);
        }
        arrayList.clear();
        org.telegram.messenger.r3 r3Var4 = this.c;
        if (!r3Var4.b.rtmp_stream) {
            arrayList.addAll(r3Var4.f);
        }
        v4.o.c(new j10(this, arrayList4, arrayList3), true).c(this);
        org.telegram.messenger.g0.a4(uj0Var);
    }

    @Override // v4.h0
    public final int b() {
        return this.f.size() + this.e.size();
    }

    @Override // v4.h0
    public final void t(v4.e1 e1Var, int i7) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        org.telegram.messenger.s3 s3Var;
        k10 k10Var = (k10) e1Var.a;
        org.telegram.messenger.s3 s3Var2 = k10Var.f;
        ArrayList arrayList = this.e;
        if (i7 < arrayList.size()) {
            s3Var = (org.telegram.messenger.s3) arrayList.get(i7);
            groupCallParticipant = ((org.telegram.messenger.s3) arrayList.get(i7)).a;
        } else {
            int size = i7 - arrayList.size();
            ArrayList arrayList2 = this.f;
            if (size >= arrayList2.size()) {
                return;
            }
            groupCallParticipant = (TLRPC.GroupCallParticipant) arrayList2.get(i7 - arrayList.size());
            s3Var = null;
        }
        k10Var.e(s3Var, groupCallParticipant);
        if (s3Var2 != null && !s3Var2.equals(s3Var) && k10Var.L && k10Var.getRenderer() != null) {
            k10Var.b(false);
            if (s3Var != null) {
                k10Var.b(true);
                return;
            }
            return;
        }
        if (k10Var.L) {
            if (k10Var.getRenderer() == null && s3Var != null && this.s) {
                k10Var.b(true);
            } else {
                if (k10Var.getRenderer() == null || s3Var != null) {
                    return;
                }
                k10Var.b(false);
            }
        }
    }

    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        return new cj0(new k10(this, viewGroup.getContext()));
    }
}
