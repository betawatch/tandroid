package ei;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s4 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.web.r b;
    public final /* synthetic */ TLRPC.Document c;

    public /* synthetic */ s4(org.telegram.ui.web.r rVar, TLRPC.Document document, int i10) {
        this.a = i10;
        this.b = rVar;
        this.c = document;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                TLRPC.Document document = this.c;
                this.b.run((String) obj, document);
                break;
            default:
                TLRPC.Document document2 = this.c;
                this.b.run((String) obj, document2);
                break;
        }
    }
}
