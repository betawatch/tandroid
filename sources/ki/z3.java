package ki;

import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final /* synthetic */ class z3 implements z10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.web.o b;
    public final /* synthetic */ TLRPC.Document c;

    public /* synthetic */ z3(org.telegram.ui.web.o oVar, TLRPC.Document document, int i7) {
        this.a = i7;
        this.b = oVar;
        this.c = document;
    }

    @Override // org.telegram.messenger.z10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                TLRPC.Document document = this.c;
                this.b.a((String) obj, document);
                break;
            default:
                TLRPC.Document document2 = this.c;
                this.b.a((String) obj, document2);
                break;
        }
    }
}
