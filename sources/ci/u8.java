package ci;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
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
