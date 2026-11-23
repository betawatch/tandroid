package org.telegram.ui.Cells;

import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.gc;
import org.telegram.messenger.gs;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.mz;
import org.telegram.messenger.si;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public abstract class e3 extends LinearLayout implements gs {
    public int a;
    public org.telegram.ui.Components.q9 b;
    public TextView c;
    public TextView d;
    public TextView e;

    public final void a() {
        org.telegram.ui.Components.q9 q9Var = this.b;
        int i7 = this.a;
        TLRPC.TL_messages_stickerSet r02 = si.d0(i7).r0("tg_placeholders_android");
        if (r02 == null) {
            r02 = si.d0(i7).p0("tg_placeholders_android");
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = r02;
        TLRPC.Document document = (tL_messages_stickerSet == null || 1 >= tL_messages_stickerSet.documents.size()) ? null : tL_messages_stickerSet.documents.get(1);
        if (document == null) {
            si.d0(i7).f1("tg_placeholders_android", false, tL_messages_stickerSet == null);
            q9Var.getImageReceiver().f();
            return;
        }
        mz d = org.telegram.messenger.u5.d(document.thumbs, org.telegram.ui.ActionBar.m6.a7, 0.2f, false);
        if (d != null) {
            d.e = 512;
            d.f = 512;
        }
        this.b.k(gc.b(document), "130_130", "tgs", d, tL_messages_stickerSet);
        q9Var.getImageReceiver().W(2);
    }

    @Override // org.telegram.messenger.gs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ls.y0 && "tg_placeholders_android".equals((String) objArr[0]) && getVisibility() == 0) {
            a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ls.f(this.a).c(this, ls.y0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ls.f(this.a).n(this, ls.y0);
    }

    public void set(TLRPC.RequestPeerType requestPeerType) {
        TextView textView = this.d;
        TextView textView2 = this.c;
        TextView textView3 = this.e;
        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) {
            textView2.setText(hd.N0(2131747951, null));
            textView.setText(hd.N0(2131747950, null));
            textView3.setVisibility(0);
            textView3.setText(hd.N0(2131751740, null));
            return;
        }
        if (!(requestPeerType instanceof TLRPC.TL_requestPeerTypeChat)) {
            textView2.setText(hd.N0(2131747947, null));
            textView.setText(hd.N0(2131747946, null));
            textView3.setVisibility(8);
        } else {
            textView2.setText(hd.N0(2131747949, null));
            textView.setText(hd.N0(2131747948, null));
            textView3.setVisibility(0);
            textView3.setText(hd.N0(2131751734, null));
        }
    }
}
