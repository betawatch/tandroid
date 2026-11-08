package org.telegram.ui;

import android.widget.LinearLayout;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class lo extends LinearLayout implements org.telegram.messenger.ls {
    public org.telegram.ui.Components.l9 a;
    public org.telegram.ui.Components.c80 b;
    public int c;

    public final void a() {
        org.telegram.ui.Components.l9 l9Var = this.a;
        int i7 = this.c;
        TLRPC.TL_messages_stickerSet p02 = org.telegram.messenger.ui.b0(i7).p0("tg_placeholders_android");
        if (p02 == null) {
            p02 = org.telegram.messenger.ui.b0(i7).n0("tg_placeholders_android");
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = p02;
        if (tL_messages_stickerSet != null && tL_messages_stickerSet.documents.size() >= 3) {
            l9Var.k(org.telegram.messenger.hc.b(tL_messages_stickerSet.documents.get(2)), "104_104", "tgs", this.b, tL_messages_stickerSet);
        } else {
            org.telegram.messenger.ui.b0(i7).c1("tg_placeholders_android", false, tL_messages_stickerSet == null);
            l9Var.setImageDrawable(this.b);
        }
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.y0 && "tg_placeholders_android".equals((String) objArr[0])) {
            a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
        org.telegram.messenger.qs.f(this.c).c(this, org.telegram.messenger.qs.y0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.qs.f(this.c).n(this, org.telegram.messenger.qs.y0);
    }
}
