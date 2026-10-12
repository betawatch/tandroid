package bi;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
