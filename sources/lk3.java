// default package

import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public abstract class lk3 extends LinearLayout implements gk7 {
    public int a;
    public be0 b;
    public TextView c;
    public TextView d;
    public TextView e;

    public final void a() {
        be0 be0Var = this.b;
        int i = this.a;
        TLRPC.TL_messages_stickerSet q0 = hq6.d0(i).q0("tg_placeholders_android");
        if (q0 == null) {
            q0 = hq6.d0(i).o0("tg_placeholders_android");
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = q0;
        TLRPC.Document document = (tL_messages_stickerSet == null || 1 >= tL_messages_stickerSet.documents.size()) ? null : tL_messages_stickerSet.documents.get(1);
        if (document == null) {
            hq6.d0(i).d1("tg_placeholders_android", false, tL_messages_stickerSet == null);
            be0Var.getImageReceiver().f();
            return;
        }
        kcb d = uo3.d(document.thumbs, bkb.Z6, 0.2f, false);
        if (d != null) {
            d.e = 512;
            d.f = 512;
        }
        this.b.n(gl5.b(document), "130_130", "tgs", d, tL_messages_stickerSet);
        be0Var.getImageReceiver().M(2);
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.x0 && "tg_placeholders_android".equals((String) objArr[0]) && getVisibility() == 0) {
            a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        kk7.f(this.a).b(this, kk7.x0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        kk7.f(this.a).n(this, kk7.x0);
    }

    public void set(TLRPC.RequestPeerType requestPeerType) {
        TextView textView = this.c;
        TextView textView2 = this.d;
        TextView textView3 = this.e;
        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) {
            textView.setText(k96.M0(2131747952, null));
            textView2.setText(k96.M0(2131747951, null));
            textView3.setVisibility(0);
            textView3.setText(k96.M0(2131751740, null));
            return;
        }
        if (!(requestPeerType instanceof TLRPC.TL_requestPeerTypeChat)) {
            textView.setText(k96.M0(2131747948, null));
            textView2.setText(k96.M0(2131747947, null));
            textView3.setVisibility(8);
        } else {
            textView.setText(k96.M0(2131747950, null));
            textView2.setText(k96.M0(2131747949, null));
            textView3.setVisibility(0);
            textView3.setText(k96.M0(2131751734, null));
        }
    }
}
