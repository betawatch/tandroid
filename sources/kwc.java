// default package

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class kwc implements Runnable {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ kwc(int i, String str, VoIPService voIPService, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.c = voIPService;
        this.d = tLObject;
        this.b = i;
        this.e = str;
        this.f = tL_error;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Object obj = this.f;
        Object obj2 = this.e;
        int i = this.b;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (b) {
            case 0:
                rb0 rb0Var = (rb0) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                ((int[]) obj4)[0] = i;
                rb0Var.q(user);
                ((de0) obj).f(user, rb0Var);
                break;
            default:
                ((VoIPService) obj4).lambda$startConferenceGroupCall$36((TLObject) obj3, i, (String) obj2, (TLRPC.TL_error) obj);
                break;
        }
    }

    public /* synthetic */ kwc(int[] iArr, int i, rb0 rb0Var, TLRPC.User user, de0 de0Var) {
        this.c = iArr;
        this.b = i;
        this.d = rb0Var;
        this.e = user;
        this.f = de0Var;
    }
}
