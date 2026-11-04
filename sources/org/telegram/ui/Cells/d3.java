package org.telegram.ui.Cells;

import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.ac;
import org.telegram.messenger.bd;
import org.telegram.messenger.cs;
import org.telegram.messenger.hs;
import org.telegram.messenger.jz;
import org.telegram.messenger.li;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class d3 extends LinearLayout implements cs {
    public int a;
    public org.telegram.ui.Components.k9 b;
    public TextView c;
    public TextView d;
    public TextView e;

    public final void a() {
        org.telegram.ui.Components.k9 k9Var = this.b;
        int i3 = this.a;
        TLRPC.TL_messages_stickerSet p02 = li.b0(i3).p0("tg_placeholders_android");
        if (p02 == null) {
            p02 = li.b0(i3).n0("tg_placeholders_android");
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = p02;
        TLRPC.Document document = (tL_messages_stickerSet == null || 1 >= tL_messages_stickerSet.documents.size()) ? null : tL_messages_stickerSet.documents.get(1);
        if (document == null) {
            li.b0(i3).c1("tg_placeholders_android", false, tL_messages_stickerSet == null);
            k9Var.getImageReceiver().f();
            return;
        }
        jz d = org.telegram.messenger.t5.d(document.thumbs, org.telegram.ui.ActionBar.k6.a7, 0.2f, false);
        if (d != null) {
            d.e = 512;
            d.f = 512;
        }
        this.b.k(ac.b(document), "130_130", "tgs", d, tL_messages_stickerSet);
        k9Var.getImageReceiver().W(2);
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == hs.y0 && "tg_placeholders_android".equals((String) objArr[0]) && getVisibility() == 0) {
            a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        hs.f(this.a).c(this, hs.y0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        hs.f(this.a).n(this, hs.y0);
    }

    public void set(TLRPC.RequestPeerType requestPeerType) {
        TextView textView = this.d;
        TextView textView2 = this.c;
        TextView textView3 = this.e;
        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) {
            textView2.setText(bd.M0(2131748152, null));
            textView.setText(bd.M0(2131748151, null));
            textView3.setVisibility(0);
            textView3.setText(bd.M0(2131751752, null));
            return;
        }
        if (!(requestPeerType instanceof TLRPC.TL_requestPeerTypeChat)) {
            textView2.setText(bd.M0(2131748148, null));
            textView.setText(bd.M0(2131748147, null));
            textView3.setVisibility(8);
        } else {
            textView2.setText(bd.M0(2131748150, null));
            textView.setText(bd.M0(2131748149, null));
            textView3.setVisibility(0);
            textView3.setText(bd.M0(2131751746, null));
        }
    }
}
