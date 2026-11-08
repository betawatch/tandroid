package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class q91 extends org.telegram.ui.Components.oj0 {
    public final /* synthetic */ s91 c;

    public q91(s91 s91Var) {
        this.c = s91Var;
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        int i7 = d1Var.f;
        return i7 == 3 || i7 == 2;
    }

    @Override // v4.g0
    public final int b() {
        s91 s91Var = this.c;
        if (s91Var.n0) {
            return 0;
        }
        return s91Var.m0;
    }

    @Override // v4.g0
    public final int d(int i7) {
        s91 s91Var = this.c;
        if (i7 == s91Var.j0 || i7 == s91Var.g0) {
            return 1;
        }
        if (i7 < s91Var.h0 || i7 >= s91Var.i0) {
            return (i7 < s91Var.k0 || i7 >= s91Var.l0) ? 0 : 3;
        }
        return 2;
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        int i10;
        View view = d1Var.a;
        s91 s91Var = this.c;
        w91 w91Var = s91Var.v0;
        if (d(i7) == 1) {
            org.telegram.ui.Cells.x3 x3Var = (org.telegram.ui.Cells.x3) view;
            if (i7 == s91Var.g0) {
                x3Var.setText(org.telegram.messenger.id.M0(2131743997, null));
            }
            if (i7 == s91Var.j0) {
                x3Var.setText(org.telegram.messenger.id.M0(2131745759, null));
            }
        }
        if (d(i7) == 2) {
            org.telegram.ui.Cells.ja jaVar = (org.telegram.ui.Cells.ja) view;
            jaVar.setTopic((TLRPC.TL_forumTopic) s91Var.e0.get(i7 - s91Var.h0));
            jaVar.d = i7 != s91Var.i0 - 1;
        }
        if (d(i7) == 3) {
            org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) s91Var.f0.get(i7 - s91Var.k0);
            t91 t91Var = (t91) view;
            t91Var.a5 = i7 != s91Var.l0 - 1;
            i10 = ((org.telegram.ui.ActionBar.f2) w91Var).currentAccount;
            long c22 = org.telegram.messenger.ij.c2(i10, ijVar.k, true, false);
            if (c22 == 0) {
                c22 = 1;
            }
            TLRPC.TL_forumTopic f10 = w91Var.s.f(w91Var.a, c22);
            if (f10 != null) {
                t91Var.g0(f10, org.telegram.messenger.ij.B0(ijVar.k), ijVar, false, false);
                t91Var.setTopicIcon(f10);
            } else {
                org.telegram.messenger.a8.b("cant find topic " + c22);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v5, types: [org.telegram.ui.Cells.t2, org.telegram.ui.t91] */
    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        FrameLayout frameLayout;
        boolean z9;
        w91 w91Var = this.c.v0;
        if (i7 == 1) {
            frameLayout = new org.telegram.ui.Cells.x3(viewGroup.getContext(), null);
        } else if (i7 == 2) {
            frameLayout = new org.telegram.ui.Cells.ja(viewGroup.getContext());
        } else {
            if (i7 != 3) {
                throw new RuntimeException("unsupported view type");
            }
            ?? t91Var = new t91(w91Var, viewGroup.getContext(), true);
            z9 = ((org.telegram.ui.ActionBar.f2) w91Var).inPreviewMode;
            t91Var.k0 = z9;
            frameLayout = t91Var;
        }
        frameLayout.setLayoutParams(new v4.o0(-1, -2));
        return new org.telegram.ui.Components.xi0(frameLayout);
    }
}
