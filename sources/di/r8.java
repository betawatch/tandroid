package di;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
