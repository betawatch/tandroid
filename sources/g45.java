// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class g45 implements i8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ h75 b;

    public /* synthetic */ g45(h75 h75Var, byte b) {
        this.a = b;
        this.b = h75Var;
    }

    @Override // i8c
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        h75 h75Var = this.b;
        TLRPC.Updates updates = (TLRPC.Updates) obj;
        switch (b) {
            case 0:
                if (updates != null) {
                    na7.q1(h75Var.n1.a).R3(updates, false);
                } else {
                    h75Var.getClass();
                }
                gl.c3(new w35(h75Var, (byte) 10));
                break;
            default:
                if (updates != null) {
                    na7.q1(h75Var.n1.a).R3(updates, false);
                    break;
                }
                break;
        }
    }
}
