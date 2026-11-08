package hi;

import org.telegram.messenger.c20;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e4 implements c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.web.n b;
    public final /* synthetic */ TLRPC.Document c;

    public /* synthetic */ e4(org.telegram.ui.web.n nVar, TLRPC.Document document, int i7) {
        this.a = i7;
        this.b = nVar;
        this.c = document;
    }

    @Override // org.telegram.messenger.c20
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
