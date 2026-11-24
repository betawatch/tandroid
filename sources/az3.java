// default package

import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class az3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ n14 b;

    public /* synthetic */ az3(n14 n14Var, byte b) {
        this.a = b;
        this.b = n14Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        n14 n14Var = this.b;
        byte b2 = 0;
        switch (b) {
            case 0:
                fz3 fz3Var = n14Var.x.R.H0;
                if (!fz3Var.G) {
                    fz3Var.d(true);
                    Utilities.B(new az3(n14Var, (byte) 1), new m14(n14Var, b2));
                    break;
                }
                break;
            default:
                ArrayList arrayList = n14Var.r;
                ArrayList arrayList2 = n14Var.h;
                o14 o14Var = n14Var.x;
                t14 t14Var = o14Var.R;
                if (o14Var.N == n14Var.b) {
                    arrayList2.remove(arrayList);
                    o14Var.F = n14Var.c;
                    o14Var.G = n14Var.d;
                    o14Var.H = n14Var.e;
                    o14Var.I = n14Var.f;
                    o14Var.J = arrayList2;
                    o14Var.K = n14Var.n;
                    o14Var.L = new ArrayList(arrayList);
                    t14Var.H0.d(false);
                    w39 adapter = t14Var.E0.getAdapter();
                    o14 o14Var2 = t14Var.A0;
                    if (adapter != o14Var2) {
                        t14Var.E0.setAdapter(o14Var2);
                    }
                    o14Var.f();
                    break;
                }
                break;
        }
    }
}
