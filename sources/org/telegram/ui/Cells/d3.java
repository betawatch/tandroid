package org.telegram.ui.Cells;

import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.hc;
import org.telegram.messenger.id;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
import org.telegram.messenger.rz;
import org.telegram.messenger.ui;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public abstract class d3 extends LinearLayout implements ls {
    public int a;
    public org.telegram.ui.Components.l9 b;
    public TextView c;
    public TextView d;
    public TextView e;

    public final void a() {
        org.telegram.ui.Components.l9 l9Var = this.b;
        int i7 = this.a;
        TLRPC.TL_messages_stickerSet p02 = ui.b0(i7).p0("tg_placeholders_android");
        if (p02 == null) {
            p02 = ui.b0(i7).n0("tg_placeholders_android");
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = p02;
        TLRPC.Document document = (tL_messages_stickerSet == null || 1 >= tL_messages_stickerSet.documents.size()) ? null : tL_messages_stickerSet.documents.get(1);
        if (document == null) {
            ui.b0(i7).c1("tg_placeholders_android", false, tL_messages_stickerSet == null);
            l9Var.getImageReceiver().f();
            return;
        }
        rz d = org.telegram.messenger.t5.d(document.thumbs, org.telegram.ui.ActionBar.k6.a7, 0.2f, false);
        if (d != null) {
            d.e = 512;
            d.f = 512;
        }
        this.b.k(hc.b(document), "130_130", "tgs", d, tL_messages_stickerSet);
        l9Var.getImageReceiver().W(2);
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == qs.y0 && "tg_placeholders_android".equals((String) objArr[0]) && getVisibility() == 0) {
            a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        qs.f(this.a).c(this, qs.y0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qs.f(this.a).n(this, qs.y0);
    }

    public void set(TLRPC.RequestPeerType requestPeerType) {
        TextView textView = this.d;
        TextView textView2 = this.c;
        TextView textView3 = this.e;
        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) {
            textView2.setText(id.M0(2131748145, null));
            textView.setText(id.M0(2131748144, null));
            textView3.setVisibility(0);
            textView3.setText(id.M0(2131751752, null));
            return;
        }
        if (!(requestPeerType instanceof TLRPC.TL_requestPeerTypeChat)) {
            textView2.setText(id.M0(2131748141, null));
            textView.setText(id.M0(2131748140, null));
            textView3.setVisibility(8);
        } else {
            textView2.setText(id.M0(2131748143, null));
            textView.setText(id.M0(2131748142, null));
            textView3.setVisibility(0);
            textView3.setText(id.M0(2131751746, null));
        }
    }
}
