// default package

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class aza extends be0 implements gk7 {
    public final int H;
    public int I;
    public String J;

    public aza(Context context, int i) {
        super(context);
        this.J = "tg_placeholders_android";
        this.H = i;
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.x0) {
            if (this.J.equals((String) objArr[0])) {
                u();
            }
        }
    }

    @Override // be0, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        u();
        kk7.f(this.H).b(this, kk7.x0);
    }

    @Override // be0, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        kk7.f(this.H).n(this, kk7.x0);
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
        kcb d;
        int i = this.H;
        TLRPC.TL_messages_stickerSet q0 = hq6.d0(i).q0(this.J);
        if (q0 == null) {
            q0 = hq6.d0(i).o0(this.J);
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = q0;
        if (tL_messages_stickerSet != null) {
            int size = tL_messages_stickerSet.documents.size();
            int i2 = this.I;
            if (size > i2) {
                document = tL_messages_stickerSet.documents.get(i2);
                d = document != null ? uo3.d(document.thumbs, bkb.b7, 0.2f, false) : null;
                if (d != null) {
                    d.e = 512;
                    d.f = 512;
                }
                if (document == null) {
                    n(gl5.b(document), "130_130", "tgs", d, tL_messages_stickerSet);
                    return;
                } else {
                    this.a.f();
                    hq6.d0(i).d1(this.J, false, tL_messages_stickerSet == null);
                    return;
                }
            }
        }
        document = null;
        d = document != null ? uo3.d(document.thumbs, bkb.b7, 0.2f, false) : null;
        if (d != null) {
        }
        if (document == null) {
        }
    }
}
