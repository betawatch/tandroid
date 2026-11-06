package bi;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x8 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ ea b;

    public /* synthetic */ x8(ea eaVar, int i7) {
        this.a = i7;
        this.b = eaVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new a9(this.b, tLObject, 0));
                break;
            case 1:
                org.telegram.messenger.g0.h3(new a9(this.b, tLObject, 1));
                break;
            case 2:
                org.telegram.messenger.g0.h3(new a9(this.b, tLObject, 2));
                break;
            case 3:
                org.telegram.messenger.g0.h3(new a9(this.b, tLObject, 3));
                break;
            default:
                org.telegram.messenger.g0.h3(new a9(this.b, tLObject, 4));
                break;
        }
    }
}
