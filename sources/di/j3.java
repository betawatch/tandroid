package di;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class j3 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ c6 b;
    public final /* synthetic */ TwoStepVerificationActivity c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ j3(c6 c6Var, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, int i7) {
        this.a = i7;
        this.b = c6Var;
        this.c = twoStepVerificationActivity;
        this.d = z10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new j1(this.b, tLObject, this.c, this.d, tL_error));
                break;
            default:
                org.telegram.messenger.g0.h3(new j1(this.b, tL_error, this.c, tLObject, this.d));
                break;
        }
    }
}
