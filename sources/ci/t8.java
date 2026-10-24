package ci;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final /* synthetic */ class t8 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ u8 b;

    public /* synthetic */ t8(u8 u8Var, int i10) {
        this.a = i10;
        this.b = u8Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                u8.c(this.b, (TLRPC.TL_messages_stickerSet) obj);
                break;
            default:
                u8.b(this.b, (TLRPC.TL_messages_stickerSet) obj);
                break;
        }
    }
}
