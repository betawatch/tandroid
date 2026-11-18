package fi;

import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class z7 implements x10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a8 b;

    public /* synthetic */ z7(a8 a8Var, int i7) {
        this.a = i7;
        this.b = a8Var;
    }

    @Override // org.telegram.messenger.x10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                a8.c(this.b, (TLRPC.TL_messages_stickerSet) obj);
                break;
            default:
                a8.b(this.b, (TLRPC.TL_messages_stickerSet) obj);
                break;
        }
    }
}
