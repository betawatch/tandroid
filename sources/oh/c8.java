package oh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c8 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ d8 b;

    public /* synthetic */ c8(d8 d8Var, int i10) {
        this.a = i10;
        this.b = d8Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                d8.c(this.b, (TLRPC.TL_messages_stickerSet) obj);
                break;
            default:
                d8.b(this.b, (TLRPC.TL_messages_stickerSet) obj);
                break;
        }
    }
}
