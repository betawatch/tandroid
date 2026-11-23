package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class q91 extends org.telegram.ui.Components.dk0 {
    public final /* synthetic */ s91 c;

    public q91(s91 s91Var) {
        this.c = s91Var;
    }

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(v4.f1 f1Var) {
        int i7 = f1Var.f;
        return i7 == 3 || i7 == 2;
    }

    @Override // v4.i0
    public final int b() {
        s91 s91Var = this.c;
        if (s91Var.o0) {
            return 0;
        }
        return s91Var.n0;
    }

    @Override // v4.i0
    public final int d(int i7) {
        s91 s91Var = this.c;
        if (i7 == s91Var.k0 || i7 == s91Var.h0) {
            return 1;
        }
        if (i7 < s91Var.i0 || i7 >= s91Var.j0) {
            return (i7 < s91Var.l0 || i7 >= s91Var.m0) ? 0 : 3;
        }
        return 2;
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        int i10;
        View view = f1Var.a;
        s91 s91Var = this.c;
        w91 w91Var = s91Var.w0;
        if (d(i7) == 1) {
            org.telegram.ui.Cells.y3 y3Var = (org.telegram.ui.Cells.y3) view;
            if (i7 == s91Var.h0) {
                y3Var.setText(org.telegram.messenger.gd.N0(2131743749, null));
            }
            if (i7 == s91Var.k0) {
                y3Var.setText(org.telegram.messenger.gd.N0(2131745560, null));
            }
        }
        if (d(i7) == 2) {
            org.telegram.ui.Cells.ma maVar = (org.telegram.ui.Cells.ma) view;
            maVar.setTopic((TLRPC.TL_forumTopic) s91Var.f0.get(i7 - s91Var.i0));
            maVar.d = i7 != s91Var.j0 - 1;
        }
        if (d(i7) == 3) {
            org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) s91Var.g0.get(i7 - s91Var.l0);
            t91 t91Var = (t91) view;
            t91Var.b5 = i7 != s91Var.m0 - 1;
            i10 = ((org.telegram.ui.ActionBar.g2) w91Var).currentAccount;
            long b22 = org.telegram.messenger.fj.b2(i10, fjVar.k, true, false);
            if (b22 == 0) {
                b22 = 1;
            }
            TLRPC.TL_forumTopic f10 = w91Var.s.f(w91Var.a, b22);
            if (f10 != null) {
                t91Var.h0(f10, org.telegram.messenger.fj.B0(fjVar.k), fjVar, false, false);
                t91Var.setTopicIcon(f10);
            } else {
                org.telegram.messenger.a8.b("cant find topic " + b22);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v5, types: [org.telegram.ui.Cells.u2, org.telegram.ui.t91] */
    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        FrameLayout frameLayout;
        boolean z10;
        w91 w91Var = this.c.w0;
        if (i7 == 1) {
            frameLayout = new org.telegram.ui.Cells.y3(viewGroup.getContext(), null);
        } else if (i7 == 2) {
            frameLayout = new org.telegram.ui.Cells.ma(viewGroup.getContext());
        } else {
            if (i7 != 3) {
                throw new RuntimeException("unsupported view type");
            }
            ?? t91Var = new t91(w91Var, viewGroup.getContext(), true);
            z10 = ((org.telegram.ui.ActionBar.g2) w91Var).inPreviewMode;
            t91Var.l0 = z10;
            frameLayout = t91Var;
        }
        frameLayout.setLayoutParams(new v4.q0(-1, -2));
        return new org.telegram.ui.Components.mj0(frameLayout);
    }
}
