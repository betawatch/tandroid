package di;

import java.util.ArrayList;
import org.telegram.messenger.r10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class i implements r10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ t b;

    public /* synthetic */ i(t tVar, int i7) {
        this.a = i7;
        this.b = tVar;
    }

    @Override // org.telegram.messenger.r10
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                this.b.v0(false, 0L, (TLRPC.InputCheckPasswordSRP) obj, (TwoStepVerificationActivity) obj2);
                break;
            default:
                t.d0(this.b, (ArrayList) obj);
                break;
        }
    }
}
