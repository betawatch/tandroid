package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final /* synthetic */ class rl implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ String b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ rl(String str, String str2, byte[] bArr) {
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
                ((MediaDataController) this.c).lambda$putEmojiKeywords$216((TLRPC.TL_emojiKeywordsDifference) this.d, this.b);
                break;
        }
    }

    public /* synthetic */ rl(MediaDataController mediaDataController, TLRPC.TL_emojiKeywordsDifference tL_emojiKeywordsDifference, String str) {
        this.c = mediaDataController;
        this.d = tL_emojiKeywordsDifference;
        this.b = str;
    }
}
