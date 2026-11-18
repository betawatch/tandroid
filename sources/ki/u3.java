package ki;

import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class u3 implements x10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.web.o b;
    public final /* synthetic */ TLRPC.Document c;

    public /* synthetic */ u3(org.telegram.ui.web.o oVar, TLRPC.Document document, int i7) {
        this.a = i7;
        this.b = oVar;
        this.c = document;
    }

    @Override // org.telegram.messenger.x10
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
