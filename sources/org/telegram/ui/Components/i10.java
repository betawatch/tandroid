package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class i10 extends pj0 {
    public org.telegram.messenger.r3 c;
    public final int d;
    public ArrayList h;
    public org.telegram.ui.b20 n;
    public final org.telegram.ui.e40 r;
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public boolean s = false;

    public i10(org.telegram.messenger.r3 r3Var, int i7, org.telegram.ui.e40 e40Var) {
        this.c = r3Var;
        this.d = i7;
        this.r = e40Var;
    }

    @Override // org.telegram.ui.Components.pj0
    public final boolean D(v4.d1 d1Var) {
        return false;
    }

    public final void E(ArrayList arrayList, org.telegram.ui.b20 b20Var) {
        this.h = arrayList;
        this.n = b20Var;
    }

    public final void F(org.telegram.ui.x10 x10Var, boolean z9) {
        this.s = z9;
        for (int i7 = 0; i7 < x10Var.getChildCount(); i7++) {
            View childAt = x10Var.getChildAt(i7);
            if (childAt instanceof h10) {
                h10 h10Var = (h10) childAt;
                if (h10Var.getVideoParticipant() != null) {
                    h10Var.b(z9);
                }
            }
        }
    }

    public final void G(qj0 qj0Var, boolean z9) {
        if (this.c == null) {
            return;
        }
        ArrayList arrayList = this.e;
        ArrayList arrayList2 = this.f;
        if (!z9) {
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
        v4.o.c(new g10(this, arrayList4, arrayList3), true).c(this);
        org.telegram.messenger.g0.b4(qj0Var);
    }

    @Override // v4.g0
    public final int b() {
        return this.f.size() + this.e.size();
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        org.telegram.messenger.s3 s3Var;
        h10 h10Var = (h10) d1Var.a;
        org.telegram.messenger.s3 s3Var2 = h10Var.f;
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
        h10Var.e(s3Var, groupCallParticipant);
        if (s3Var2 != null && !s3Var2.equals(s3Var) && h10Var.K && h10Var.getRenderer() != null) {
            h10Var.b(false);
            if (s3Var != null) {
                h10Var.b(true);
                return;
            }
            return;
        }
        if (h10Var.K) {
            if (h10Var.getRenderer() == null && s3Var != null && this.s) {
                h10Var.b(true);
            } else {
                if (h10Var.getRenderer() == null || s3Var != null) {
                    return;
                }
                h10Var.b(false);
            }
        }
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        return new yi0(new h10(this, viewGroup.getContext()));
    }
}
