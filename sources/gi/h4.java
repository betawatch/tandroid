package gi;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h4 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.web.r b;
    public final /* synthetic */ TLRPC.Document c;

    public /* synthetic */ h4(org.telegram.ui.web.r rVar, TLRPC.Document document, int i10) {
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
