package org.telegram.ui.Cells;

import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.fc;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.lz;
import org.telegram.messenger.ri;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public abstract class e3 extends LinearLayout implements fs {
    public int a;
    public org.telegram.ui.Components.q9 b;
    public TextView c;
    public TextView d;
    public TextView e;

    public final void a() {
        org.telegram.ui.Components.q9 q9Var = this.b;
        int i7 = this.a;
        TLRPC.TL_messages_stickerSet r02 = ri.d0(i7).r0("tg_placeholders_android");
        if (r02 == null) {
            r02 = ri.d0(i7).p0("tg_placeholders_android");
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = r02;
        TLRPC.Document document = (tL_messages_stickerSet == null || 1 >= tL_messages_stickerSet.documents.size()) ? null : tL_messages_stickerSet.documents.get(1);
        if (document == null) {
            ri.d0(i7).f1("tg_placeholders_android", false, tL_messages_stickerSet == null);
            q9Var.getImageReceiver().f();
            return;
        }
        lz d = org.telegram.messenger.u5.d(document.thumbs, org.telegram.ui.ActionBar.n6.a7, 0.2f, false);
        if (d != null) {
            d.e = 512;
            d.f = 512;
        }
        this.b.k(fc.b(document), "130_130", "tgs", d, tL_messages_stickerSet);
        q9Var.getImageReceiver().W(2);
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ks.y0 && "tg_placeholders_android".equals((String) objArr[0]) && getVisibility() == 0) {
            a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ks.f(this.a).c(this, ks.y0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ks.f(this.a).n(this, ks.y0);
    }

    public void set(TLRPC.RequestPeerType requestPeerType) {
        TextView textView = this.d;
        TextView textView2 = this.c;
        TextView textView3 = this.e;
        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) {
            textView2.setText(gd.M0(2131747952, null));
            textView.setText(gd.M0(2131747951, null));
            textView3.setVisibility(0);
            textView3.setText(gd.M0(2131751741, null));
            return;
        }
        if (!(requestPeerType instanceof TLRPC.TL_requestPeerTypeChat)) {
            textView2.setText(gd.M0(2131747948, null));
            textView.setText(gd.M0(2131747947, null));
            textView3.setVisibility(8);
        } else {
            textView2.setText(gd.M0(2131747950, null));
            textView.setText(gd.M0(2131747949, null));
            textView3.setVisibility(0);
            textView3.setText(gd.M0(2131751735, null));
        }
    }
}
