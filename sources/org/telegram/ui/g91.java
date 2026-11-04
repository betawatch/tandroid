package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class g91 extends org.telegram.ui.Components.sj0 {
    public final /* synthetic */ i91 c;

    public g91(i91 i91Var) {
        this.c = i91Var;
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        int i3 = d1Var.f;
        return i3 == 3 || i3 == 2;
    }

    @Override // u4.h0
    public final int b() {
        i91 i91Var = this.c;
        if (i91Var.o0) {
            return 0;
        }
        return i91Var.n0;
    }

    @Override // u4.h0
    public final int d(int i3) {
        i91 i91Var = this.c;
        if (i3 == i91Var.k0 || i3 == i91Var.h0) {
            return 1;
        }
        if (i3 < i91Var.i0 || i3 >= i91Var.j0) {
            return (i3 < i91Var.l0 || i3 >= i91Var.m0) ? 0 : 3;
        }
        return 2;
    }

    @Override // u4.h0
    public final void t(u4.d1 d1Var, int i3) {
        int i10;
        View view = d1Var.a;
        i91 i91Var = this.c;
        m91 m91Var = i91Var.w0;
        if (d(i3) == 1) {
            org.telegram.ui.Cells.x3 x3Var = (org.telegram.ui.Cells.x3) view;
            if (i3 == i91Var.h0) {
                x3Var.setText(org.telegram.messenger.bd.M0(2131744004, null));
            }
            if (i3 == i91Var.k0) {
                x3Var.setText(org.telegram.messenger.bd.M0(2131745766, null));
            }
        }
        if (d(i3) == 2) {
            org.telegram.ui.Cells.ja jaVar = (org.telegram.ui.Cells.ja) view;
            jaVar.setTopic((TLRPC.TL_forumTopic) i91Var.f0.get(i3 - i91Var.i0));
            jaVar.d = i3 != i91Var.j0 - 1;
        }
        if (d(i3) == 3) {
            org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) i91Var.g0.get(i3 - i91Var.l0);
            j91 j91Var = (j91) view;
            j91Var.b5 = i3 != i91Var.m0 - 1;
            i10 = ((org.telegram.ui.ActionBar.d2) m91Var).currentAccount;
            long c2 = org.telegram.messenger.zi.c2(i10, ziVar.k, true, false);
            if (c2 == 0) {
                c2 = 1;
            }
            TLRPC.TL_forumTopic f10 = m91Var.s.f(m91Var.a, c2);
            if (f10 != null) {
                j91Var.f0(f10, org.telegram.messenger.zi.B0(ziVar.k), ziVar, false, false);
                j91Var.setTopicIcon(f10);
            } else {
                org.telegram.messenger.a8.b("cant find topic " + c2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v5, types: [org.telegram.ui.Cells.t2, org.telegram.ui.j91] */
    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        FrameLayout frameLayout;
        boolean z10;
        m91 m91Var = this.c.w0;
        if (i3 == 1) {
            frameLayout = new org.telegram.ui.Cells.x3(viewGroup.getContext(), null);
        } else if (i3 == 2) {
            frameLayout = new org.telegram.ui.Cells.ja(viewGroup.getContext());
        } else {
            if (i3 != 3) {
                throw new RuntimeException("unsupported view type");
            }
            ?? j91Var = new j91(m91Var, viewGroup.getContext(), true);
            z10 = ((org.telegram.ui.ActionBar.d2) m91Var).inPreviewMode;
            j91Var.l0 = z10;
            frameLayout = j91Var;
        }
        frameLayout.setLayoutParams(new u4.p0(-1, -2));
        return new org.telegram.ui.Components.bj0(frameLayout);
    }
}
