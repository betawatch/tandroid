// default package

import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class f22 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ g22 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;

    public /* synthetic */ f22(g22 g22Var, String str, int i, byte b) {
        this.a = b;
        this.b = g22Var;
        this.c = str;
        this.d = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                g22 g22Var = this.b;
                String str = this.c;
                int i = this.d;
                g22Var.getClass();
                gl.c3(new f22(g22Var, str, i, (byte) 1));
                break;
            default:
                g22 g22Var2 = this.b;
                String str2 = this.c;
                int i2 = this.d;
                g22Var2.getClass();
                int i3 = y6c.t0;
                Utilities.g.c(new az0(g22Var2, str2, new ArrayList(qu2.r(i3).Z.values()), new ArrayList(qu2.r(i3).f0), i3, i2));
                break;
        }
    }
}
