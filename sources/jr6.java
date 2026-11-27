// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class jr6 implements pcc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ls6 b;
    public final /* synthetic */ TLRPC.StickerSet c;

    public /* synthetic */ jr6(ls6 ls6Var, TLRPC.StickerSet stickerSet, byte b) {
        this.a = b;
        this.b = ls6Var;
        this.c = stickerSet;
    }

    @Override // pcc
    public final void a(Object obj) {
        byte b = this.a;
        TLRPC.StickerSet stickerSet = this.c;
        ls6 ls6Var = this.b;
        switch (b) {
            case 0:
                ls6Var.g1(stickerSet.id, false);
                break;
            default:
                ls6Var.h1(stickerSet.id, false);
                break;
        }
    }
}
