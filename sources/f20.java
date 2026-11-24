// default package

import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class f20 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ h20 b;
    public final /* synthetic */ String c;

    public /* synthetic */ f20(h20 h20Var, String str, byte b) {
        this.a = b;
        this.b = h20Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                h20 h20Var = this.b;
                String str = this.c;
                h20Var.f = null;
                gl.c3(new f20(h20Var, str, (byte) 1));
                break;
            default:
                h20 h20Var2 = this.b;
                String str2 = this.c;
                h20Var2.getClass();
                Utilities.g.c(new g20(h20Var2, str2, new ArrayList(h20Var2.n.q2)));
                break;
        }
    }
}
