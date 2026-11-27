// default package

import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class g20 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ i20 b;
    public final /* synthetic */ String c;

    public /* synthetic */ g20(i20 i20Var, String str, byte b) {
        this.a = b;
        this.b = i20Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                i20 i20Var = this.b;
                String str = this.c;
                i20Var.f = null;
                hl.c3(new g20(i20Var, str, (byte) 1));
                break;
            default:
                i20 i20Var2 = this.b;
                String str2 = this.c;
                i20Var2.getClass();
                Utilities.g.c(new h20(i20Var2, str2, new ArrayList(i20Var2.n.q2)));
                break;
        }
    }
}
