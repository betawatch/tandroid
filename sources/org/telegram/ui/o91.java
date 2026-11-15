package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class o91 extends org.telegram.ui.Components.tj0 {
    public final /* synthetic */ q91 c;

    public o91(q91 q91Var) {
        this.c = q91Var;
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean D(v4.e1 e1Var) {
        int i7 = e1Var.f;
        return i7 == 3 || i7 == 2;
    }

    @Override // v4.h0
    public final int b() {
        q91 q91Var = this.c;
        if (q91Var.o0) {
            return 0;
        }
        return q91Var.n0;
    }

    @Override // v4.h0
    public final int d(int i7) {
        q91 q91Var = this.c;
        if (i7 == q91Var.k0 || i7 == q91Var.h0) {
            return 1;
        }
        if (i7 < q91Var.i0 || i7 >= q91Var.j0) {
            return (i7 < q91Var.l0 || i7 >= q91Var.m0) ? 0 : 3;
        }
        return 2;
    }

    @Override // v4.h0
    public final void t(v4.e1 e1Var, int i7) {
        int i10;
        View view = e1Var.a;
        q91 q91Var = this.c;
        u91 u91Var = q91Var.w0;
        if (d(i7) == 1) {
            org.telegram.ui.Cells.x3 x3Var = (org.telegram.ui.Cells.x3) view;
            if (i7 == q91Var.h0) {
                x3Var.setText(org.telegram.messenger.hd.M0(2131743994, null));
            }
            if (i7 == q91Var.k0) {
                x3Var.setText(org.telegram.messenger.hd.M0(2131745756, null));
            }
        }
        if (d(i7) == 2) {
            org.telegram.ui.Cells.ja jaVar = (org.telegram.ui.Cells.ja) view;
            jaVar.setTopic((TLRPC.TL_forumTopic) q91Var.f0.get(i7 - q91Var.i0));
            jaVar.d = i7 != q91Var.j0 - 1;
        }
        if (d(i7) == 3) {
            org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) q91Var.g0.get(i7 - q91Var.l0);
            r91 r91Var = (r91) view;
            r91Var.b5 = i7 != q91Var.m0 - 1;
            i10 = ((org.telegram.ui.ActionBar.e2) u91Var).currentAccount;
            long b22 = org.telegram.messenger.gj.b2(i10, gjVar.k, true, false);
            if (b22 == 0) {
                b22 = 1;
            }
            TLRPC.TL_forumTopic f10 = u91Var.s.f(u91Var.a, b22);
            if (f10 != null) {
                r91Var.h0(f10, org.telegram.messenger.gj.B0(gjVar.k), gjVar, false, false);
                r91Var.setTopicIcon(f10);
            } else {
                org.telegram.messenger.a8.b("cant find topic " + b22);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v5, types: [org.telegram.ui.Cells.t2, org.telegram.ui.r91] */
    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        FrameLayout frameLayout;
        boolean z10;
        u91 u91Var = this.c.w0;
        if (i7 == 1) {
            frameLayout = new org.telegram.ui.Cells.x3(viewGroup.getContext(), null);
        } else if (i7 == 2) {
            frameLayout = new org.telegram.ui.Cells.ja(viewGroup.getContext());
        } else {
            if (i7 != 3) {
                throw new RuntimeException("unsupported view type");
            }
            ?? r91Var = new r91(u91Var, viewGroup.getContext(), true);
            z10 = ((org.telegram.ui.ActionBar.e2) u91Var).inPreviewMode;
            r91Var.l0 = z10;
            frameLayout = r91Var;
        }
        frameLayout.setLayoutParams(new v4.p0(-1, -2));
        return new org.telegram.ui.Components.cj0(frameLayout);
    }
}
