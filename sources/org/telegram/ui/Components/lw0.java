package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class lw0 implements org.telegram.ui.ActionBar.o0, org.telegram.messenger.fs {
    public final /* synthetic */ cx0 a;

    public /* synthetic */ lw0(cx0 cx0Var) {
        this.a = cx0Var;
    }

    @Override // org.telegram.messenger.fs
    public void a(String str) {
        cx0 cx0Var = this.a;
        new d40(cx0Var.getContext(), cx0Var.f2, null, cx0Var.I0).show();
    }

    @Override // org.telegram.ui.ActionBar.o0
    public void k(int i10) {
        String str;
        cx0 cx0Var = this.a;
        org.telegram.ui.ActionBar.k2 k2Var = cx0Var.C1;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = cx0Var.J1;
        if (tL_messages_stickerSet == null) {
            return;
        }
        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
        if (stickerSet == null || !stickerSet.emojis) {
            str = "https://" + org.telegram.messenger.vp.r1(cx0Var.a).U2 + "/addstickers/" + cx0Var.J1.set.short_name;
        } else {
            str = "https://" + org.telegram.messenger.vp.r1(cx0Var.a).U2 + "/addemoji/" + cx0Var.J1.set.short_name;
        }
        String str2 = str;
        if (i10 == 1) {
            Context context = cx0Var.E1;
            if (context == null && k2Var != null) {
                context = k2Var.getParentActivity();
            }
            if (context == null) {
                context = cx0Var.getContext();
            }
            ow0 ow0Var = new ow0(cx0Var, context, str2, str2, cx0Var.I0);
            if (k2Var == null) {
                ow0Var.show();
                return;
            }
            k2Var.showDialog(ow0Var);
            if (k2Var instanceof org.telegram.ui.un) {
                boolean J9 = ((org.telegram.ui.un) k2Var).J9();
                ow0Var.h0 = J9;
                ow0Var.n = J9;
                return;
            }
            return;
        }
        if (i10 == 2) {
            try {
                org.telegram.messenger.i0.g(str2);
                new cc((FrameLayout) cx0Var.b, cx0Var.I0).k(false).j();
                return;
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
                return;
            }
        }
        if (i10 == 3) {
            if (cx0Var.I1) {
                cx0Var.L0();
                return;
            } else {
                cx0Var.N0();
                return;
            }
        }
        if (i10 == 4) {
            hx0.c(cx0Var.J1.set, cx0Var.I0, cx0Var.getContext(), new d(cx0Var, 20));
        } else if (i10 == 5) {
            hx0.b(cx0Var.J1.set, cx0Var.I0, cx0Var.getContext(), new mw0(cx0Var, 2));
        }
    }
}
