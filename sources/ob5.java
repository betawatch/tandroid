// default package

import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class ob5 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qb5 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;

    public /* synthetic */ ob5(qb5 qb5Var, String str, int i, byte b) {
        this.a = b;
        this.b = qb5Var;
        this.c = str;
        this.d = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = null;
        switch (this.a) {
            case 0:
                qb5 qb5Var = this.b;
                String str = this.c;
                int i = this.d;
                if (qb5Var.e != null) {
                    qb5Var.e = null;
                    gl.c3(new ob5(qb5Var, str, i, (byte) 1));
                    break;
                }
                break;
            default:
                qb5 qb5Var2 = this.b;
                String str2 = this.c;
                int i2 = this.d;
                qb5Var2.e = null;
                if (!hc2.T(qb5Var2.x.P1) && qb5Var2.x.Q1 != null) {
                    arrayList = new ArrayList(qb5Var2.x.Q1.participants.participants);
                }
                ArrayList arrayList2 = arrayList;
                if (arrayList2 != null) {
                    Utilities.g.c(new tn6((Object) qb5Var2, (Object) str2, i2, (Object) arrayList2, (byte) 26));
                } else {
                    qb5Var2.h = false;
                }
                qb5Var2.d.g(str2, hc2.w(3, qb5Var2.x.P1), false, true, false, hc2.T(qb5Var2.x.P1) ? qb5Var2.x.P1.id : 0L, false, 2, i2);
                break;
        }
    }
}
