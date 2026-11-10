package hi;

import org.telegram.messenger.c20;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
