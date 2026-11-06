package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class p91 extends org.telegram.ui.Components.oj0 {
    public final /* synthetic */ r91 c;

    public p91(r91 r91Var) {
        this.c = r91Var;
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        int i7 = d1Var.f;
        return i7 == 3 || i7 == 2;
    }

    @Override // v4.g0
    public final int b() {
        r91 r91Var = this.c;
        if (r91Var.n0) {
            return 0;
        }
        return r91Var.m0;
    }

    @Override // v4.g0
    public final int d(int i7) {
        r91 r91Var = this.c;
        if (i7 == r91Var.j0 || i7 == r91Var.g0) {
            return 1;
        }
        if (i7 < r91Var.h0 || i7 >= r91Var.i0) {
            return (i7 < r91Var.k0 || i7 >= r91Var.l0) ? 0 : 3;
        }
        return 2;
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        int i10;
        View view = d1Var.a;
        r91 r91Var = this.c;
        v91 v91Var = r91Var.v0;
        if (d(i7) == 1) {
            org.telegram.ui.Cells.x3 x3Var = (org.telegram.ui.Cells.x3) view;
            if (i7 == r91Var.g0) {
                x3Var.setText(org.telegram.messenger.hd.M0(2131743995, null));
            }
            if (i7 == r91Var.j0) {
                x3Var.setText(org.telegram.messenger.hd.M0(2131745757, null));
            }
        }
        if (d(i7) == 2) {
            org.telegram.ui.Cells.ja jaVar = (org.telegram.ui.Cells.ja) view;
            jaVar.setTopic((TLRPC.TL_forumTopic) r91Var.e0.get(i7 - r91Var.h0));
            jaVar.d = i7 != r91Var.i0 - 1;
        }
        if (d(i7) == 3) {
            org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) r91Var.f0.get(i7 - r91Var.k0);
            s91 s91Var = (s91) view;
            s91Var.a5 = i7 != r91Var.l0 - 1;
            i10 = ((org.telegram.ui.ActionBar.f2) v91Var).currentAccount;
            long c22 = org.telegram.messenger.ij.c2(i10, ijVar.k, true, false);
            if (c22 == 0) {
                c22 = 1;
            }
            TLRPC.TL_forumTopic f10 = v91Var.s.f(v91Var.a, c22);
            if (f10 != null) {
                s91Var.g0(f10, org.telegram.messenger.ij.B0(ijVar.k), ijVar, false, false);
                s91Var.setTopicIcon(f10);
            } else {
                org.telegram.messenger.a8.b("cant find topic " + c22);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v5, types: [org.telegram.ui.Cells.t2, org.telegram.ui.s91] */
    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        FrameLayout frameLayout;
        boolean z9;
        v91 v91Var = this.c.v0;
        if (i7 == 1) {
            frameLayout = new org.telegram.ui.Cells.x3(viewGroup.getContext(), null);
        } else if (i7 == 2) {
            frameLayout = new org.telegram.ui.Cells.ja(viewGroup.getContext());
        } else {
            if (i7 != 3) {
                throw new RuntimeException("unsupported view type");
            }
            ?? s91Var = new s91(v91Var, viewGroup.getContext(), true);
            z9 = ((org.telegram.ui.ActionBar.f2) v91Var).inPreviewMode;
            s91Var.k0 = z9;
            frameLayout = s91Var;
        }
        frameLayout.setLayoutParams(new v4.o0(-1, -2));
        return new org.telegram.ui.Components.xi0(frameLayout);
    }
}
