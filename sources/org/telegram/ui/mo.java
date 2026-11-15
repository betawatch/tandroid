package org.telegram.ui;

import android.widget.LinearLayout;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class mo extends LinearLayout implements org.telegram.messenger.is {
    public org.telegram.ui.Components.i9 a;
    public org.telegram.ui.Components.f80 b;
    public int c;

    public final void a() {
        org.telegram.ui.Components.i9 i9Var = this.a;
        int i7 = this.c;
        TLRPC.TL_messages_stickerSet p02 = org.telegram.messenger.si.b0(i7).p0("tg_placeholders_android");
        if (p02 == null) {
            p02 = org.telegram.messenger.si.b0(i7).n0("tg_placeholders_android");
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = p02;
        if (tL_messages_stickerSet != null && tL_messages_stickerSet.documents.size() >= 3) {
            i9Var.k(org.telegram.messenger.gc.b(tL_messages_stickerSet.documents.get(2)), "104_104", "tgs", this.b, tL_messages_stickerSet);
        } else {
            org.telegram.messenger.si.b0(i7).c1("tg_placeholders_android", false, tL_messages_stickerSet == null);
            i9Var.setImageDrawable(this.b);
        }
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ns.y0 && "tg_placeholders_android".equals((String) objArr[0])) {
            a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
        org.telegram.messenger.ns.f(this.c).c(this, org.telegram.messenger.ns.y0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.ns.f(this.c).n(this, org.telegram.messenger.ns.y0);
    }
}
