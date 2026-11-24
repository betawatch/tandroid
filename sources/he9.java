// default package

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class he9 {
    public final /* synthetic */ ye9 a;

    public he9(ye9 ye9Var) {
        this.a = ye9Var;
    }

    public final void a(lk0 lk0Var) {
        ye9 ye9Var = this.a;
        ArrayList arrayList = ye9Var.t3;
        int indexOf = arrayList.indexOf(lk0Var);
        if (indexOf < 0 || !ye9.t3(lk0Var)) {
            return;
        }
        int M3 = ye9Var.M3(indexOf);
        if (M3 >= arrayList.size()) {
            M3 = arrayList.size() - 1;
        }
        ld9 ld9Var = ye9Var.R3;
        if (ld9Var != null) {
            ld9Var.d();
        }
        while (M3 >= indexOf) {
            arrayList.remove(M3);
            M3--;
        }
        lk0 lk0Var2 = null;
        lk0 lk0Var3 = indexOf > 0 ? (lk0) arrayList.get(indexOf - 1) : null;
        if (lk0Var3 != null && !lk0Var3.i && !ye9.t3(lk0Var3) && !ye9.A3(lk0Var3.b)) {
            lk0Var2 = lk0Var3;
        }
        if (arrayList.isEmpty()) {
            lk0Var2 = new lk0(new TL_iv.pageBlockParagraph(), 0, 0);
            arrayList.add(lk0Var2);
        }
        ye9Var.g3.O(false);
        ld9 ld9Var2 = ye9Var.R3;
        if (ld9Var2 != null) {
            ld9Var2.h();
        }
        if (lk0Var2 != null) {
            ye9Var.post(new sd9(ye9Var, lk0Var2, (byte) 22));
        }
    }
}
