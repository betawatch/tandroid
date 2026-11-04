package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class e10 extends sj0 {
    public org.telegram.messenger.r3 c;
    public final int d;
    public ArrayList h;
    public org.telegram.ui.u10 n;
    public final org.telegram.ui.x30 r;
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public boolean s = false;

    public e10(org.telegram.messenger.r3 r3Var, int i3, org.telegram.ui.x30 x30Var) {
        this.c = r3Var;
        this.d = i3;
        this.r = x30Var;
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        return false;
    }

    public final void E(ArrayList arrayList, org.telegram.ui.u10 u10Var) {
        this.h = arrayList;
        this.n = u10Var;
    }

    public final void F(org.telegram.ui.q10 q10Var, boolean z10) {
        this.s = z10;
        for (int i3 = 0; i3 < q10Var.getChildCount(); i3++) {
            View childAt = q10Var.getChildAt(i3);
            if (childAt instanceof d10) {
                d10 d10Var = (d10) childAt;
                if (d10Var.getVideoParticipant() != null) {
                    d10Var.b(z10);
                }
            }
        }
    }

    public final void G(tj0 tj0Var, boolean z10) {
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
        u4.o.c(new c10(this, arrayList4, arrayList3), true).c(this);
        org.telegram.messenger.g0.b4(tj0Var);
    }

    @Override // u4.h0
    public final int b() {
        return this.f.size() + this.e.size();
    }

    @Override // u4.h0
    public final void t(u4.d1 d1Var, int i3) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        org.telegram.messenger.s3 s3Var;
        d10 d10Var = (d10) d1Var.a;
        org.telegram.messenger.s3 s3Var2 = d10Var.f;
        ArrayList arrayList = this.e;
        if (i3 < arrayList.size()) {
            s3Var = (org.telegram.messenger.s3) arrayList.get(i3);
            groupCallParticipant = ((org.telegram.messenger.s3) arrayList.get(i3)).a;
        } else {
            int size = i3 - arrayList.size();
            ArrayList arrayList2 = this.f;
            if (size >= arrayList2.size()) {
                return;
            }
            groupCallParticipant = (TLRPC.GroupCallParticipant) arrayList2.get(i3 - arrayList.size());
            s3Var = null;
        }
        d10Var.e(s3Var, groupCallParticipant);
        if (s3Var2 != null && !s3Var2.equals(s3Var) && d10Var.L && d10Var.getRenderer() != null) {
            d10Var.b(false);
            if (s3Var != null) {
                d10Var.b(true);
                return;
            }
            return;
        }
        if (d10Var.L) {
            if (d10Var.getRenderer() == null && s3Var != null && this.s) {
                d10Var.b(true);
            } else {
                if (d10Var.getRenderer() == null || s3Var != null) {
                    return;
                }
                d10Var.b(false);
            }
        }
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        return new bj0(new d10(this, viewGroup.getContext()));
    }
}
