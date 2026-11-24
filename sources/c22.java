// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class c22 implements i22 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nu2 b;

    public /* synthetic */ c22(nu2 nu2Var, byte b) {
        this.a = b;
        this.b = nu2Var;
    }

    @Override // i22
    public final String run() {
        byte b = this.a;
        nu2 nu2Var = this.b;
        switch (b) {
            case 0:
                ArrayList arrayList = nu2Var.e;
                return !arrayList.isEmpty() ? p38.f().e((String) arrayList.get(0)) : "";
            default:
                ArrayList arrayList2 = nu2Var.e;
                return !arrayList2.isEmpty() ? p38.f().e((String) arrayList2.get(0)) : "";
        }
    }
}
