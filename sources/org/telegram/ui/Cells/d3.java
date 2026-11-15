package org.telegram.ui.Cells;

import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.gc;
import org.telegram.messenger.hd;
import org.telegram.messenger.is;
import org.telegram.messenger.ns;
import org.telegram.messenger.pz;
import org.telegram.messenger.si;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public abstract class d3 extends LinearLayout implements is {
    public int a;
    public org.telegram.ui.Components.i9 b;
    public TextView c;
    public TextView d;
    public TextView e;

    public final void a() {
        org.telegram.ui.Components.i9 i9Var = this.b;
        int i7 = this.a;
        TLRPC.TL_messages_stickerSet p02 = si.b0(i7).p0("tg_placeholders_android");
        if (p02 == null) {
            p02 = si.b0(i7).n0("tg_placeholders_android");
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = p02;
        TLRPC.Document document = (tL_messages_stickerSet == null || 1 >= tL_messages_stickerSet.documents.size()) ? null : tL_messages_stickerSet.documents.get(1);
        if (document == null) {
            si.b0(i7).c1("tg_placeholders_android", false, tL_messages_stickerSet == null);
            i9Var.getImageReceiver().f();
            return;
        }
        pz d = org.telegram.messenger.t5.d(document.thumbs, org.telegram.ui.ActionBar.j6.a7, 0.2f, false);
        if (d != null) {
            d.e = 512;
            d.f = 512;
        }
        this.b.k(gc.b(document), "130_130", "tgs", d, tL_messages_stickerSet);
        i9Var.getImageReceiver().W(2);
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ns.y0 && "tg_placeholders_android".equals((String) objArr[0]) && getVisibility() == 0) {
            a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ns.f(this.a).c(this, ns.y0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ns.f(this.a).n(this, ns.y0);
    }

    public void set(TLRPC.RequestPeerType requestPeerType) {
        TextView textView = this.d;
        TextView textView2 = this.c;
        TextView textView3 = this.e;
        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) {
            textView2.setText(hd.M0(2131748144, null));
            textView.setText(hd.M0(2131748143, null));
            textView3.setVisibility(0);
            textView3.setText(hd.M0(2131751752, null));
            return;
        }
        if (!(requestPeerType instanceof TLRPC.TL_requestPeerTypeChat)) {
            textView2.setText(hd.M0(2131748140, null));
            textView.setText(hd.M0(2131748139, null));
            textView3.setVisibility(8);
        } else {
            textView2.setText(hd.M0(2131748142, null));
            textView.setText(hd.M0(2131748141, null));
            textView3.setVisibility(0);
            textView3.setText(hd.M0(2131751746, null));
        }
    }
}
