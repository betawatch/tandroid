package ai;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class bb implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ eb b;

    public /* synthetic */ bb(eb ebVar, int i10) {
        this.a = i10;
        this.b = ebVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                eb.c(this.b, (TLRPC.TL_messages_stickerSet) obj);
                break;
            default:
                eb.b(this.b, (TLRPC.TL_messages_stickerSet) obj);
                break;
        }
    }
}
