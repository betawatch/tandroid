package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
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
