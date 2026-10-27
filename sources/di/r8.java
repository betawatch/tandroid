package di;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r8 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ t8 b;

    public /* synthetic */ r8(t8 t8Var, int i10) {
        this.a = i10;
        this.b = t8Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                t8.c(this.b, (TLRPC.TL_messages_stickerSet) obj);
                break;
            default:
                t8.b(this.b, (TLRPC.TL_messages_stickerSet) obj);
                break;
        }
    }
}
