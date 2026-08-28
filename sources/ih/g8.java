package ih;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g8 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ h8 b;

    public /* synthetic */ g8(h8 h8Var, int i9) {
        this.a = i9;
        this.b = h8Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                h8.c(this.b, (TLRPC.TL_messages_stickerSet) obj);
                break;
            default:
                h8.b(this.b, (TLRPC.TL_messages_stickerSet) obj);
                break;
        }
    }
}
