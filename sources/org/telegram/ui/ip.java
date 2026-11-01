package org.telegram.ui;

import android.widget.LinearLayout;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class ip extends LinearLayout implements org.telegram.messenger.vs {
    public org.telegram.ui.Components.g9 a;
    public org.telegram.ui.Components.v80 b;
    public int c;

    public final void a() {
        org.telegram.ui.Components.g9 g9Var = this.a;
        int i10 = this.c;
        TLRPC.TL_messages_stickerSet p02 = org.telegram.messenger.vi.b0(i10).p0("tg_placeholders_android");
        if (p02 == null) {
            p02 = org.telegram.messenger.vi.b0(i10).n0("tg_placeholders_android");
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = p02;
        if (tL_messages_stickerSet != null && tL_messages_stickerSet.documents.size() >= 3) {
            g9Var.k(org.telegram.messenger.jc.b(tL_messages_stickerSet.documents.get(2)), "104_104", "tgs", this.b, tL_messages_stickerSet);
        } else {
            org.telegram.messenger.vi.b0(i10).c1("tg_placeholders_android", false, tL_messages_stickerSet == null);
            g9Var.setImageDrawable(this.b);
        }
    }

    @Override // org.telegram.messenger.vs
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.at.y0 && "tg_placeholders_android".equals((String) objArr[0])) {
            a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
        org.telegram.messenger.at.f(this.c).c(this, org.telegram.messenger.at.y0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.at.f(this.c).n(this, org.telegram.messenger.at.y0);
    }
}
