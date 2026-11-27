// default package

import java.util.Timer;
import java.util.TimerTask;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class iy2 extends TimerTask {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ iy2(Object obj, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        byte b = 3;
        switch (this.a) {
            case 0:
                try {
                    ((Timer) ((m32) this.c).h).cancel();
                    ((m32) this.c).h = null;
                } catch (Exception e) {
                    cc4.g(e, true);
                }
                Utilities.g.c(new bv2((m32) this.c, (String) this.b, (byte) 3));
                return;
            case 1:
                es5 es5Var = (es5) this.c;
                try {
                    es5Var.f.cancel();
                    es5Var.f = null;
                } catch (Exception e2) {
                    cc4.g(e2, true);
                }
                hl.c3(new ds5(this, (String) this.b, (byte) 0));
                return;
            case 2:
                synchronized (((MediaController) this.c).x1) {
                    hl.c3(new mn6(this, (r47) this.b, b));
                }
                return;
            default:
                lv9 lv9Var = (lv9) this.c;
                try {
                    lv9Var.n.cancel();
                    lv9Var.n = null;
                } catch (Exception e3) {
                    cc4.g(e3, true);
                }
                String str = (String) this.b;
                lv9Var.getClass();
                hl.c3(new en9(lv9Var, str, (byte) 10));
                return;
        }
    }
}
