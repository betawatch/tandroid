package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mw0 implements org.telegram.ui.ActionBar.o0, org.telegram.messenger.gs {
    public final /* synthetic */ dx0 a;

    public /* synthetic */ mw0(dx0 dx0Var) {
        this.a = dx0Var;
    }

    @Override // org.telegram.messenger.gs
    public void a(String str) {
        dx0 dx0Var = this.a;
        new d40(dx0Var.getContext(), dx0Var.f2, null, dx0Var.I0).show();
    }

    @Override // org.telegram.ui.ActionBar.o0
    public void k(int i10) {
        String str;
        dx0 dx0Var = this.a;
        org.telegram.ui.ActionBar.k2 k2Var = dx0Var.C1;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = dx0Var.J1;
        if (tL_messages_stickerSet == null) {
            return;
        }
        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
        if (stickerSet == null || !stickerSet.emojis) {
            str = "https://" + org.telegram.messenger.wp.r1(dx0Var.a).U2 + "/addstickers/" + dx0Var.J1.set.short_name;
        } else {
            str = "https://" + org.telegram.messenger.wp.r1(dx0Var.a).U2 + "/addemoji/" + dx0Var.J1.set.short_name;
        }
        String str2 = str;
        if (i10 == 1) {
            Context context = dx0Var.E1;
            if (context == null && k2Var != null) {
                context = k2Var.getParentActivity();
            }
            if (context == null) {
                context = dx0Var.getContext();
            }
            pw0 pw0Var = new pw0(dx0Var, context, str2, str2, dx0Var.I0);
            if (k2Var == null) {
                pw0Var.show();
                return;
            }
            k2Var.showDialog(pw0Var);
            if (k2Var instanceof org.telegram.ui.un) {
                boolean O9 = ((org.telegram.ui.un) k2Var).O9();
                pw0Var.h0 = O9;
                pw0Var.n = O9;
                return;
            }
            return;
        }
        if (i10 == 2) {
            try {
                org.telegram.messenger.i0.g(str2);
                new cc((FrameLayout) dx0Var.b, dx0Var.I0).k(false).j();
                return;
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
                return;
            }
        }
        if (i10 == 3) {
            if (dx0Var.I1) {
                dx0Var.L0();
                return;
            } else {
                dx0Var.N0();
                return;
            }
        }
        if (i10 == 4) {
            ix0.c(dx0Var.J1.set, dx0Var.I0, dx0Var.getContext(), new d(dx0Var, 20));
        } else if (i10 == 5) {
            ix0.b(dx0Var.J1.set, dx0Var.I0, dx0Var.getContext(), new nw0(dx0Var, 2));
        }
    }
}
