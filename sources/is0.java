// default package

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class is0 implements i8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ss0 b;

    public /* synthetic */ is0(ss0 ss0Var, byte b) {
        this.a = b;
        this.b = ss0Var;
    }

    @Override // i8c
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                this.b.o0(false, 0L, (TLRPC.InputCheckPasswordSRP) obj, (TwoStepVerificationActivity) obj2);
                break;
            default:
                this.b.n0((ArrayList) obj);
                break;
        }
    }
}
