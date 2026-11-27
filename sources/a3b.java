// default package

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class a3b extends de0 implements fn7 {
    public final int H;
    public int I;
    public String J;

    public a3b(Context context, int i) {
        super(context);
        this.J = "tg_placeholders_android";
        this.H = i;
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.y0) {
            if (this.J.equals((String) objArr[0])) {
                u();
            }
        }
    }

    @Override // de0, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        u();
        jn7.f(this.H).b(this, jn7.y0);
    }

    @Override // de0, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        jn7.f(this.H).n(this, jn7.y0);
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
        ggb d;
        int i = this.H;
        TLRPC.TL_messages_stickerSet q0 = ls6.d0(i).q0(this.J);
        if (q0 == null) {
            q0 = ls6.d0(i).o0(this.J);
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = q0;
        if (tL_messages_stickerSet != null) {
            int size = tL_messages_stickerSet.documents.size();
            int i2 = this.I;
            if (size > i2) {
                document = tL_messages_stickerSet.documents.get(i2);
                d = document != null ? lp3.d(document.thumbs, aob.c7, 0.2f, false) : null;
                if (d != null) {
                    d.e = 512;
                    d.f = 512;
                }
                if (document == null) {
                    n(jn5.b(document), "130_130", "tgs", d, tL_messages_stickerSet);
                    return;
                } else {
                    this.a.f();
                    ls6.d0(i).d1(this.J, false, tL_messages_stickerSet == null);
                    return;
                }
            }
        }
        document = null;
        d = document != null ? lp3.d(document.thumbs, aob.c7, 0.2f, false) : null;
        if (d != null) {
        }
        if (document == null) {
        }
    }
}
