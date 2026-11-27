// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class kna implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ TLRPC.Document b;
    public final /* synthetic */ int c;
    public final /* synthetic */ r47 d;
    public final /* synthetic */ wb2 e;
    public final /* synthetic */ TLRPC.TL_messages_stickerSet f;

    public /* synthetic */ kna(TLRPC.Document document, int i, r47 r47Var, wb2 wb2Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, byte b) {
        this.a = b;
        this.b = document;
        this.c = i;
        this.d = r47Var;
        this.e = wb2Var;
        this.f = tL_messages_stickerSet;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.f;
        wb2 wb2Var = this.e;
        r47 r47Var = this.d;
        int i = this.c;
        TLRPC.Document document = this.b;
        switch (b) {
            case 0:
                lq3.q(i).a(xb4.r(null, document), r47Var, wb2Var);
                xb4.G(i).X(document, tL_messages_stickerSet, 1, 1);
                break;
            default:
                lq3.q(i).a(xb4.r(null, document), r47Var, wb2Var);
                xb4.G(i).X(document, tL_messages_stickerSet, 1, 1);
                break;
        }
    }
}
