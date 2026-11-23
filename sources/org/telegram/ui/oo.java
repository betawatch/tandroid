package org.telegram.ui;

import android.widget.LinearLayout;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class oo extends LinearLayout implements org.telegram.messenger.gs {
    public org.telegram.ui.Components.q9 a;
    public org.telegram.ui.Components.s80 b;
    public int c;

    public final void a() {
        org.telegram.ui.Components.q9 q9Var = this.a;
        int i7 = this.c;
        TLRPC.TL_messages_stickerSet r02 = org.telegram.messenger.si.d0(i7).r0("tg_placeholders_android");
        if (r02 == null) {
            r02 = org.telegram.messenger.si.d0(i7).p0("tg_placeholders_android");
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = r02;
        if (tL_messages_stickerSet != null && tL_messages_stickerSet.documents.size() >= 3) {
            q9Var.k(org.telegram.messenger.gc.b(tL_messages_stickerSet.documents.get(2)), "104_104", "tgs", this.b, tL_messages_stickerSet);
        } else {
            org.telegram.messenger.si.d0(i7).f1("tg_placeholders_android", false, tL_messages_stickerSet == null);
            q9Var.setImageDrawable(this.b);
        }
    }

    @Override // org.telegram.messenger.gs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ls.y0 && "tg_placeholders_android".equals((String) objArr[0])) {
            a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
        org.telegram.messenger.ls.f(this.c).c(this, org.telegram.messenger.ls.y0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.ls.f(this.c).n(this, org.telegram.messenger.ls.y0);
    }
}
