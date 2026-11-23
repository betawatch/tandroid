package di;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class l3 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ f6 b;
    public final /* synthetic */ TwoStepVerificationActivity c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ l3(f6 f6Var, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, int i7) {
        this.a = i7;
        this.b = f6Var;
        this.c = twoStepVerificationActivity;
        this.d = z10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.g3(new q3(this.b, tLObject, this.c, this.d, tL_error));
                break;
            default:
                org.telegram.messenger.g0.g3(new q3(this.b, tL_error, this.c, tLObject, this.d));
                break;
        }
    }
}
