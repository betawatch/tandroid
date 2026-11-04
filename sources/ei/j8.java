package ei;

import org.telegram.messenger.u10;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j8 implements u10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ k8 b;

    public /* synthetic */ j8(k8 k8Var, int i3) {
        this.a = i3;
        this.b = k8Var;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                k8.c(this.b, (TLRPC.TL_messages_stickerSet) obj);
                break;
            default:
                k8.b(this.b, (TLRPC.TL_messages_stickerSet) obj);
                break;
        }
    }
}
