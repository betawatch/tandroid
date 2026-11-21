package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class uv0 implements org.telegram.ui.ActionBar.l0, org.telegram.messenger.rr {
    public final /* synthetic */ kw0 a;

    public /* synthetic */ uv0(kw0 kw0Var) {
        this.a = kw0Var;
    }

    @Override // org.telegram.messenger.rr
    public void a(String str) {
        kw0 kw0Var = this.a;
        new z30(kw0Var.getContext(), kw0Var.j2, null, kw0Var.J0).show();
    }

    @Override // org.telegram.ui.ActionBar.l0
    public void g(int i7) {
        String str;
        kw0 kw0Var = this.a;
        org.telegram.ui.ActionBar.g2 g2Var = kw0Var.G1;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = kw0Var.N1;
        if (tL_messages_stickerSet == null) {
            return;
        }
        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
        if (stickerSet == null || !stickerSet.emojis) {
            str = "https://" + org.telegram.messenger.mp.u1(kw0Var.a).X2 + "/addstickers/" + kw0Var.N1.set.short_name;
        } else {
            str = "https://" + org.telegram.messenger.mp.u1(kw0Var.a).X2 + "/addemoji/" + kw0Var.N1.set.short_name;
        }
        String str2 = str;
        if (i7 == 1) {
            Context context = kw0Var.I1;
            if (context == null && g2Var != null) {
                context = g2Var.getParentActivity();
            }
            if (context == null) {
                context = kw0Var.getContext();
            }
            wv0 wv0Var = new wv0(kw0Var, context, str2, str2, kw0Var.J0);
            if (g2Var == null) {
                wv0Var.show();
                return;
            }
            g2Var.showDialog(wv0Var);
            if (g2Var instanceof org.telegram.ui.bn) {
                boolean V9 = ((org.telegram.ui.bn) g2Var).V9();
                wv0Var.i0 = V9;
                wv0Var.n = V9;
                return;
            }
            return;
        }
        if (i7 == 2) {
            try {
                org.telegram.messenger.g0.g(str2);
                new lc((FrameLayout) kw0Var.b, kw0Var.J0).k(false).j();
                return;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return;
            }
        }
        if (i7 == 3) {
            if (kw0Var.M1) {
                kw0Var.M0();
                return;
            } else {
                kw0Var.O0();
                return;
            }
        }
        if (i7 == 4) {
            pw0.c(kw0Var.N1.set, kw0Var.J0, kw0Var.getContext(), new d(kw0Var, 21));
        } else if (i7 == 5) {
            pw0.b(kw0Var.N1.set, kw0Var.J0, kw0Var.getContext(), new vv0(kw0Var, 2));
        }
    }
}
