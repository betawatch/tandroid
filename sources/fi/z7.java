package fi;

import org.telegram.messenger.y10;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final /* synthetic */ class z7 implements y10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a8 b;

    public /* synthetic */ z7(a8 a8Var, int i7) {
        this.a = i7;
        this.b = a8Var;
    }

    @Override // org.telegram.messenger.y10
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
