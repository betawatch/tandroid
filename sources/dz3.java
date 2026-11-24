// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class dz3 extends yo {
    public final /* synthetic */ t14 c;

    public dz3(t14 t14Var) {
        this.c = t14Var;
    }

    @Override // yo
    public final int i(int i) {
        t14 t14Var = this.c;
        o14 o14Var = t14Var.A0;
        w39 adapter = t14Var.E0.getAdapter();
        l14 l14Var = t14Var.z0;
        if (adapter != l14Var) {
            if (i == o14Var.y || !(o14Var.r.get(i) == null || (o14Var.r.get(i) instanceof TLRPC.Document))) {
                return l14Var.d;
            }
            return 1;
        }
        if (i == 0) {
            return l14Var.d;
        }
        if (i == l14Var.s || !(l14Var.h.get(i) == null || (l14Var.h.get(i) instanceof TLRPC.Document))) {
            return l14Var.d;
        }
        return 1;
    }
}
