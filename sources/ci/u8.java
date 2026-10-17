package ci;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u8 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ v8 b;

    public /* synthetic */ u8(v8 v8Var, int i10) {
        this.a = i10;
        this.b = v8Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                v8.c(this.b, (TLRPC.TL_messages_stickerSet) obj);
                break;
            default:
                v8.b(this.b, (TLRPC.TL_messages_stickerSet) obj);
                break;
        }
    }
}
