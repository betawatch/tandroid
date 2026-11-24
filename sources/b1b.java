// default package

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class b1b extends bf0 implements jm7 {
    public final int H;
    public int I;
    public String J;

    public b1b(Context context, int i) {
        super(context);
        this.J = "tg_placeholders_android";
        this.H = i;
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.y0) {
            if (this.J.equals((String) objArr[0])) {
                u();
            }
        }
    }

    @Override // bf0, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        u();
        nm7.f(this.H).b(this, nm7.y0);
    }

    @Override // bf0, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        nm7.f(this.H).n(this, nm7.y0);
    }

    public void setStickerNum(int i) {
        if (this.I != i) {
            this.I = i;
            u();
        }
    }

    public void setStickerPackName(String str) {
        this.J = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u() {
        TLRPC.Document document;
        meb d;
        int i = this.H;
        TLRPC.TL_messages_stickerSet q0 = hs6.d0(i).q0(this.J);
        if (q0 == null) {
            q0 = hs6.d0(i).o0(this.J);
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = q0;
        if (tL_messages_stickerSet != null) {
            int size = tL_messages_stickerSet.documents.size();
            int i2 = this.I;
            if (size > i2) {
                document = tL_messages_stickerSet.documents.get(i2);
                d = document != null ? eq3.d(document.thumbs, cmb.b7, 0.2f, false) : null;
                if (d != null) {
                    d.e = 512;
                    d.f = 512;
                }
                if (document == null) {
                    n(gn5.b(document), "130_130", "tgs", d, tL_messages_stickerSet);
                    return;
                } else {
                    this.a.f();
                    hs6.d0(i).d1(this.J, false, tL_messages_stickerSet == null);
                    return;
                }
            }
        }
        document = null;
        d = document != null ? eq3.d(document.thumbs, cmb.b7, 0.2f, false) : null;
        if (d != null) {
        }
        if (document == null) {
        }
    }
}
