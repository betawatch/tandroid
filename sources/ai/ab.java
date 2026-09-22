package ai;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final /* synthetic */ class ab implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ db b;

    public /* synthetic */ ab(db dbVar, int i10) {
        this.a = i10;
        this.b = dbVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                db.c(this.b, (TLRPC.TL_messages_stickerSet) obj);
                break;
            default:
                db.b(this.b, (TLRPC.TL_messages_stickerSet) obj);
                break;
        }
    }
}
