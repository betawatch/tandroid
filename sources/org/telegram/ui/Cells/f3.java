package org.telegram.ui.Cells;

import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.c00;
import org.telegram.messenger.cd;
import org.telegram.messenger.ic;
import org.telegram.messenger.ui;
import org.telegram.messenger.us;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class f3 extends LinearLayout implements us {
    public int a;
    public org.telegram.ui.Components.g9 b;
    public TextView c;
    public TextView d;
    public TextView e;

    public final void a() {
        org.telegram.ui.Components.g9 g9Var = this.b;
        int i10 = this.a;
        TLRPC.TL_messages_stickerSet p02 = ui.b0(i10).p0("tg_placeholders_android");
        if (p02 == null) {
            p02 = ui.b0(i10).n0("tg_placeholders_android");
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = p02;
        TLRPC.Document document = (tL_messages_stickerSet == null || 1 >= tL_messages_stickerSet.documents.size()) ? null : tL_messages_stickerSet.documents.get(1);
        if (document == null) {
            ui.b0(i10).c1("tg_placeholders_android", false, tL_messages_stickerSet == null);
            g9Var.getImageReceiver().f();
            return;
        }
        c00 d = org.telegram.messenger.v5.d(document.thumbs, org.telegram.ui.ActionBar.t6.a7, 0.2f, false);
        if (d != null) {
            d.e = 512;
            d.f = 512;
        }
        this.b.k(ic.b(document), "130_130", "tgs", d, tL_messages_stickerSet);
        g9Var.getImageReceiver().W(2);
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == zs.y0 && "tg_placeholders_android".equals((String) objArr[0]) && getVisibility() == 0) {
            a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        zs.f(this.a).c(this, zs.y0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        zs.f(this.a).n(this, zs.y0);
    }

    public void set(TLRPC.RequestPeerType requestPeerType) {
        TextView textView = this.d;
        TextView textView2 = this.c;
        TextView textView3 = this.e;
        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) {
            textView2.setText(cd.L0(2131748160, null));
            textView.setText(cd.L0(2131748159, null));
            textView3.setVisibility(0);
            textView3.setText(cd.L0(2131751752, null));
            return;
        }
        if (!(requestPeerType instanceof TLRPC.TL_requestPeerTypeChat)) {
            textView2.setText(cd.L0(2131748156, null));
            textView.setText(cd.L0(2131748155, null));
            textView3.setVisibility(8);
        } else {
            textView2.setText(cd.L0(2131748158, null));
            textView.setText(cd.L0(2131748157, null));
            textView3.setVisibility(0);
            textView3.setText(cd.L0(2131751746, null));
        }
    }
}
