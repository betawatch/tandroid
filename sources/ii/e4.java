package ii;

import org.telegram.messenger.u10;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e4 implements u10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.web.p b;
    public final /* synthetic */ TLRPC.Document c;

    public /* synthetic */ e4(org.telegram.ui.web.p pVar, TLRPC.Document document, int i3) {
        this.a = i3;
        this.b = pVar;
        this.c = document;
    }

    @Override // org.telegram.messenger.u10
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
