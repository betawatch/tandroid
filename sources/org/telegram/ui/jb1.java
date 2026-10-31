package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class jb1 extends org.telegram.ui.Components.sk0 {
    public final /* synthetic */ lb1 c;

    public jb1(lb1 lb1Var) {
        this.c = lb1Var;
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f;
        return i10 == 3 || i10 == 2;
    }

    @Override // s4.g0
    public final int b() {
        lb1 lb1Var = this.c;
        if (lb1Var.n0) {
            return 0;
        }
        return lb1Var.m0;
    }

    @Override // s4.g0
    public final int d(int i10) {
        lb1 lb1Var = this.c;
        if (i10 == lb1Var.j0 || i10 == lb1Var.g0) {
            return 1;
        }
        if (i10 < lb1Var.h0 || i10 >= lb1Var.i0) {
            return (i10 < lb1Var.k0 || i10 >= lb1Var.l0) ? 0 : 3;
        }
        return 2;
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        int i11;
        View view = c1Var.a;
        lb1 lb1Var = this.c;
        pb1 pb1Var = lb1Var.v0;
        if (d(i10) == 1) {
            org.telegram.ui.Cells.z3 z3Var = (org.telegram.ui.Cells.z3) view;
            if (i10 == lb1Var.g0) {
                z3Var.setText(org.telegram.messenger.cd.L0(2131744019, null));
            }
            if (i10 == lb1Var.j0) {
                z3Var.setText(org.telegram.messenger.cd.L0(2131745773, null));
            }
        }
        if (d(i10) == 2) {
            org.telegram.ui.Cells.ja jaVar = (org.telegram.ui.Cells.ja) view;
            jaVar.setTopic((TLRPC.TL_forumTopic) lb1Var.e0.get(i10 - lb1Var.h0));
            jaVar.d = i10 != lb1Var.i0 - 1;
        }
        if (d(i10) == 3) {
            org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) lb1Var.f0.get(i10 - lb1Var.k0);
            mb1 mb1Var = (mb1) view;
            mb1Var.a5 = i10 != lb1Var.l0 - 1;
            i11 = ((org.telegram.ui.ActionBar.k2) pb1Var).currentAccount;
            long c22 = org.telegram.messenger.jj.c2(i11, jjVar.k, true, false);
            if (c22 == 0) {
                c22 = 1;
            }
            TLRPC.TL_forumTopic f7 = pb1Var.s.f(pb1Var.a, c22);
            if (f7 != null) {
                mb1Var.f0(f7, org.telegram.messenger.jj.B0(jjVar.k), jjVar, false, false);
                mb1Var.setTopicIcon(f7);
            } else {
                org.telegram.messenger.f8.b("cant find topic " + c22);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v5, types: [org.telegram.ui.Cells.v2, org.telegram.ui.mb1] */
    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        boolean z10;
        pb1 pb1Var = this.c.v0;
        if (i10 == 1) {
            frameLayout = new org.telegram.ui.Cells.z3(viewGroup.getContext(), null);
        } else if (i10 == 2) {
            frameLayout = new org.telegram.ui.Cells.ja(viewGroup.getContext());
        } else {
            if (i10 != 3) {
                throw new RuntimeException("unsupported view type");
            }
            ?? mb1Var = new mb1(pb1Var, viewGroup.getContext(), true);
            z10 = ((org.telegram.ui.ActionBar.k2) pb1Var).inPreviewMode;
            mb1Var.k0 = z10;
            frameLayout = mb1Var;
        }
        frameLayout.setLayoutParams(new s4.o0(-1, -2));
        return new org.telegram.ui.Components.ck0(frameLayout);
    }
}
