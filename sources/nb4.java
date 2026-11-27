// default package

import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class nb4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xb4 b;
    public final /* synthetic */ String c;

    public /* synthetic */ nb4(xb4 xb4Var, String str, byte b) {
        this.a = b;
        this.b = xb4Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = 7;
        switch (this.a) {
            case 0:
                xb4 xb4Var = this.b;
                hb4 hb4Var = (hb4) xb4Var.w.remove(this.c);
                if (hb4Var != null && ((ArrayList) hb4Var.e1.d).remove(hb4Var)) {
                    Utilities.d.c(new xa4(hb4Var, b));
                    break;
                }
                break;
            default:
                xb4 xb4Var2 = this.b;
                hb4 hb4Var2 = (hb4) xb4Var2.w.remove(this.c);
                if (hb4Var2 != null && ((ArrayList) hb4Var2.e1.d).remove(hb4Var2)) {
                    Utilities.d.c(new xa4(hb4Var2, b));
                    break;
                }
                break;
        }
    }
}
