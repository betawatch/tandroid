package di;

import org.telegram.messenger.c20;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k8 implements c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ l8 b;

    public /* synthetic */ k8(l8 l8Var, int i7) {
        this.a = i7;
        this.b = l8Var;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                l8.c(this.b, (TLRPC.TL_messages_stickerSet) obj);
                break;
            default:
                l8.b(this.b, (TLRPC.TL_messages_stickerSet) obj);
                break;
        }
    }
}
