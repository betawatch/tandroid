package ei;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t4 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.web.q b;
    public final /* synthetic */ TLRPC.Document c;

    public /* synthetic */ t4(org.telegram.ui.web.q qVar, TLRPC.Document document, int i10) {
        this.a = i10;
        this.b = qVar;
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
