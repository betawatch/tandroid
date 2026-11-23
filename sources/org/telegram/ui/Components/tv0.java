package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class tv0 implements org.telegram.ui.ActionBar.l0, org.telegram.messenger.rr {
    public final /* synthetic */ jw0 a;

    public /* synthetic */ tv0(jw0 jw0Var) {
        this.a = jw0Var;
    }

    @Override // org.telegram.messenger.rr
    public void a(String str) {
        jw0 jw0Var = this.a;
        new w30(jw0Var.getContext(), jw0Var.j2, null, jw0Var.J0).show();
    }

    @Override // org.telegram.ui.ActionBar.l0
    public void h(int i7) {
        String str;
        jw0 jw0Var = this.a;
        org.telegram.ui.ActionBar.g2 g2Var = jw0Var.G1;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = jw0Var.N1;
        if (tL_messages_stickerSet == null) {
            return;
        }
        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
        if (stickerSet == null || !stickerSet.emojis) {
            str = "https://" + org.telegram.messenger.mp.u1(jw0Var.a).X2 + "/addstickers/" + jw0Var.N1.set.short_name;
        } else {
            str = "https://" + org.telegram.messenger.mp.u1(jw0Var.a).X2 + "/addemoji/" + jw0Var.N1.set.short_name;
        }
        String str2 = str;
        if (i7 == 1) {
            Context context = jw0Var.I1;
            if (context == null && g2Var != null) {
                context = g2Var.getParentActivity();
            }
            if (context == null) {
                context = jw0Var.getContext();
            }
            vv0 vv0Var = new vv0(jw0Var, context, str2, str2, jw0Var.J0);
            if (g2Var == null) {
                vv0Var.show();
                return;
            }
            g2Var.showDialog(vv0Var);
            if (g2Var instanceof org.telegram.ui.bn) {
                boolean V9 = ((org.telegram.ui.bn) g2Var).V9();
                vv0Var.i0 = V9;
                vv0Var.n = V9;
                return;
            }
            return;
        }
        if (i7 == 2) {
            try {
                org.telegram.messenger.g0.g(str2);
                new kc((FrameLayout) jw0Var.b, jw0Var.J0).k(false).j();
                return;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return;
            }
        }
        if (i7 == 3) {
            if (jw0Var.M1) {
                jw0Var.M0();
                return;
            } else {
                jw0Var.O0();
                return;
            }
        }
        if (i7 == 4) {
            ow0.c(jw0Var.N1.set, jw0Var.J0, jw0Var.getContext(), new d(jw0Var, 21));
        } else if (i7 == 5) {
            ow0.b(jw0Var.N1.set, jw0Var.J0, jw0Var.getContext(), new uv0(jw0Var, 2));
        }
    }
}
