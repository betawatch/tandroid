package ai;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
