package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
public final /* synthetic */ class wl implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ String b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ wl(String str, String str2, byte[] bArr) {
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
                ((MediaDataController) this.c).lambda$putEmojiKeywords$215((TLRPC.TL_emojiKeywordsDifference) this.d, this.b);
                break;
        }
    }

    public /* synthetic */ wl(MediaDataController mediaDataController, TLRPC.TL_emojiKeywordsDifference tL_emojiKeywordsDifference, String str) {
        this.c = mediaDataController;
        this.d = tL_emojiKeywordsDifference;
        this.b = str;
    }
}
