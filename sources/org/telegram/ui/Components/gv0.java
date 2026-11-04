package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gv0 implements org.telegram.ui.ActionBar.l0, org.telegram.messenger.or {
    public final /* synthetic */ xv0 a;

    public /* synthetic */ gv0(xv0 xv0Var) {
        this.a = xv0Var;
    }

    @Override // org.telegram.messenger.or
    public void a(String str) {
        xv0 xv0Var = this.a;
        new h30(xv0Var.getContext(), xv0Var.g2, null, xv0Var.J0).show();
    }

    @Override // org.telegram.ui.ActionBar.l0
    public void i(int i3) {
        String str;
        xv0 xv0Var = this.a;
        org.telegram.ui.ActionBar.d2 d2Var = xv0Var.D1;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = xv0Var.K1;
        if (tL_messages_stickerSet == null) {
            return;
        }
        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
        if (stickerSet == null || !stickerSet.emojis) {
            str = "https://" + org.telegram.messenger.hp.s1(xv0Var.a).V2 + "/addstickers/" + xv0Var.K1.set.short_name;
        } else {
            str = "https://" + org.telegram.messenger.hp.s1(xv0Var.a).V2 + "/addemoji/" + xv0Var.K1.set.short_name;
        }
        String str2 = str;
        if (i3 == 1) {
            Context context = xv0Var.F1;
            if (context == null && d2Var != null) {
                context = d2Var.getParentActivity();
            }
            if (context == null) {
                context = xv0Var.getContext();
            }
            jv0 jv0Var = new jv0(xv0Var, context, str2, str2, xv0Var.J0);
            if (d2Var == null) {
                jv0Var.show();
                return;
            }
            d2Var.showDialog(jv0Var);
            if (d2Var instanceof org.telegram.ui.wm) {
                boolean T9 = ((org.telegram.ui.wm) d2Var).T9();
                jv0Var.i0 = T9;
                jv0Var.n = T9;
                return;
            }
            return;
        }
        if (i3 == 2) {
            try {
                org.telegram.messenger.g0.g(str2);
                new fc((FrameLayout) xv0Var.b, xv0Var.J0).k(false).j();
                return;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return;
            }
        }
        if (i3 == 3) {
            if (xv0Var.J1) {
                xv0Var.L0();
                return;
            } else {
                xv0Var.N0();
                return;
            }
        }
        if (i3 == 4) {
            cw0.c(xv0Var.K1.set, xv0Var.J0, xv0Var.getContext(), new e(xv0Var, 20));
        } else if (i3 == 5) {
            cw0.b(xv0Var.K1.set, xv0Var.J0, xv0Var.getContext(), new hv0(xv0Var, 2));
        }
    }
}
