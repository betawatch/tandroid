package di;

import org.telegram.messenger.c20;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j8 implements c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ k8 b;

    public /* synthetic */ j8(k8 k8Var, int i7) {
        this.a = i7;
        this.b = k8Var;
    }

    @Override // org.telegram.messenger.c20
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
