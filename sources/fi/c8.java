package fi;

import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class c8 implements z10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ d8 b;

    public /* synthetic */ c8(d8 d8Var, int i7) {
        this.a = i7;
        this.b = d8Var;
    }

    @Override // org.telegram.messenger.z10
    public final void a(Object obj) {
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
