// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
