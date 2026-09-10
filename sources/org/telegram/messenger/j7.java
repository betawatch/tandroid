package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class j7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaDataController b;
    public final /* synthetic */ TLRPC.TL_messages_stickerSet c;

    public /* synthetic */ j7(MediaDataController mediaDataController, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i10) {
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
