package di;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class s7 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ y8 b;

    public /* synthetic */ s7(y8 y8Var, int i7) {
        this.a = i7;
        this.b = y8Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.g3(new w7(this.b, tLObject, 0));
                break;
            case 1:
                org.telegram.messenger.g0.g3(new w7(this.b, tLObject, 1));
                break;
            case 2:
                org.telegram.messenger.g0.g3(new w7(this.b, tLObject, 2));
                break;
            case 3:
                org.telegram.messenger.g0.g3(new w7(this.b, tLObject, 3));
                break;
            default:
                org.telegram.messenger.g0.g3(new w7(this.b, tLObject, 4));
                break;
        }
    }
}
