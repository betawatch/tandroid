// default package

import android.widget.LinearLayout;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class bb2 extends LinearLayout implements jm7 {
    public bf0 a;
    public ua6 b;
    public int c;

    public final void a() {
        bf0 bf0Var = this.a;
        int i = this.c;
        TLRPC.TL_messages_stickerSet q0 = hs6.d0(i).q0("tg_placeholders_android");
        if (q0 == null) {
            q0 = hs6.d0(i).o0("tg_placeholders_android");
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = q0;
        if (tL_messages_stickerSet != null && tL_messages_stickerSet.documents.size() >= 3) {
            bf0Var.n(gn5.b(tL_messages_stickerSet.documents.get(2)), "104_104", "tgs", this.b, tL_messages_stickerSet);
        } else {
            hs6.d0(i).d1("tg_placeholders_android", false, tL_messages_stickerSet == null);
            bf0Var.setImageDrawable(this.b);
        }
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.y0 && "tg_placeholders_android".equals((String) objArr[0])) {
            a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
        nm7.f(this.c).b(this, nm7.y0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        nm7.f(this.c).n(this, nm7.y0);
    }
}
