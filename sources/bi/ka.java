package bi;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class ka implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ na b;

    public /* synthetic */ ka(na naVar, int i10) {
        this.a = i10;
        this.b = naVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                na.c(this.b, (TLRPC.TL_messages_stickerSet) obj);
                break;
            default:
                na.b(this.b, (TLRPC.TL_messages_stickerSet) obj);
                break;
        }
    }
}
