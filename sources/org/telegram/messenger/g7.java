package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final /* synthetic */ class g7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaDataController b;
    public final /* synthetic */ TLRPC.TL_messages_stickerSet c;

    public /* synthetic */ g7(MediaDataController mediaDataController, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i10) {
        this.a = i10;
        this.b = mediaDataController;
        this.c = tL_messages_stickerSet;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$saveStickerSetIntoCache$40(this.c);
                break;
            case 1:
                this.b.lambda$loadGroupStickerSet$45(this.c);
                break;
            case 2:
                this.b.lambda$loadGroupStickerSet$43(this.c);
                break;
            case 3:
                this.b.lambda$putSetToCache$47(this.c);
                break;
            default:
                this.b.lambda$replaceStickerSet$28(this.c);
                break;
        }
    }
}
