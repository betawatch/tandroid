package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class hb1 extends org.telegram.ui.Components.tk0 {
    public final /* synthetic */ jb1 c;

    public hb1(jb1 jb1Var) {
        this.c = jb1Var;
    }

    @Override // org.telegram.ui.Components.tk0
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f;
        return i10 == 3 || i10 == 2;
    }

    @Override // s4.g0
    public final int b() {
        jb1 jb1Var = this.c;
        if (jb1Var.n0) {
            return 0;
        }
        return jb1Var.m0;
    }

    @Override // s4.g0
    public final int d(int i10) {
        jb1 jb1Var = this.c;
        if (i10 == jb1Var.j0 || i10 == jb1Var.g0) {
            return 1;
        }
        if (i10 < jb1Var.h0 || i10 >= jb1Var.i0) {
            return (i10 < jb1Var.k0 || i10 >= jb1Var.l0) ? 0 : 3;
        }
        return 2;
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        int i11;
        View view = c1Var.a;
        jb1 jb1Var = this.c;
        nb1 nb1Var = jb1Var.v0;
        if (d(i10) == 1) {
            org.telegram.ui.Cells.z3 z3Var = (org.telegram.ui.Cells.z3) view;
            if (i10 == jb1Var.g0) {
                z3Var.setText(org.telegram.messenger.dd.L0(2131744019, null));
            }
            if (i10 == jb1Var.j0) {
                z3Var.setText(org.telegram.messenger.dd.L0(2131745773, null));
            }
        }
        if (d(i10) == 2) {
            org.telegram.ui.Cells.ja jaVar = (org.telegram.ui.Cells.ja) view;
            jaVar.setTopic((TLRPC.TL_forumTopic) jb1Var.e0.get(i10 - jb1Var.h0));
            jaVar.d = i10 != jb1Var.i0 - 1;
        }
        if (d(i10) == 3) {
            org.telegram.messenger.kj kjVar = (org.telegram.messenger.kj) jb1Var.f0.get(i10 - jb1Var.k0);
            kb1 kb1Var = (kb1) view;
            kb1Var.a5 = i10 != jb1Var.l0 - 1;
            i11 = ((org.telegram.ui.ActionBar.k2) nb1Var).currentAccount;
            long c22 = org.telegram.messenger.kj.c2(i11, kjVar.k, true, false);
            if (c22 == 0) {
                c22 = 1;
            }
            TLRPC.TL_forumTopic f7 = nb1Var.s.f(nb1Var.a, c22);
            if (f7 != null) {
                kb1Var.f0(f7, org.telegram.messenger.kj.B0(kjVar.k), kjVar, false, false);
                kb1Var.setTopicIcon(f7);
            } else {
                org.telegram.messenger.f8.b("cant find topic " + c22);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v5, types: [org.telegram.ui.Cells.v2, org.telegram.ui.kb1] */
    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        boolean z10;
        nb1 nb1Var = this.c.v0;
        if (i10 == 1) {
            frameLayout = new org.telegram.ui.Cells.z3(viewGroup.getContext(), null);
        } else if (i10 == 2) {
            frameLayout = new org.telegram.ui.Cells.ja(viewGroup.getContext());
        } else {
            if (i10 != 3) {
                throw new RuntimeException("unsupported view type");
            }
            ?? kb1Var = new kb1(nb1Var, viewGroup.getContext(), true);
            z10 = ((org.telegram.ui.ActionBar.k2) nb1Var).inPreviewMode;
            kb1Var.k0 = z10;
            frameLayout = kb1Var;
        }
        frameLayout.setLayoutParams(new s4.o0(-1, -2));
        return new org.telegram.ui.Components.dk0(frameLayout);
    }
}
