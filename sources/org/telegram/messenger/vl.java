package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final /* synthetic */ class vl implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ String b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ vl(String str, String str2, byte[] bArr) {
        this.b = str;
        this.c = str2;
        this.d = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                WearAuthListenerService.lambda$onMessageReceived$0(this.b, (String) this.c, (byte[]) this.d);
                break;
            default:
                ((MediaDataController) this.c).lambda$processLoadedDiceStickers$88(this.b, (TLRPC.TL_messages_stickerSet) this.d);
                break;
        }
    }

    public /* synthetic */ vl(MediaDataController mediaDataController, String str, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        this.c = mediaDataController;
        this.b = str;
        this.d = tL_messages_stickerSet;
    }
}
