package hi;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q4 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.web.r b;
    public final /* synthetic */ TLRPC.Document c;

    public /* synthetic */ q4(org.telegram.ui.web.r rVar, TLRPC.Document document, int i10) {
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
