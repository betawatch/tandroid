package e2;

import android.os.Handler;
import android.os.Message;
import java.util.Iterator;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final /* synthetic */ class n implements Handler.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.a) {
            case 0:
                r rVar = (r) this.b;
                p pVar = rVar.c;
                pVar.getClass();
                Iterator it = rVar.d.iterator();
                while (it.hasNext()) {
                    q qVar = (q) it.next();
                    if (!qVar.d && qVar.c) {
                        b2.u d = qVar.b.d();
                        qVar.b = new b2.t();
                        qVar.c = false;
                        pVar.a(qVar.a, d);
                    }
                    i0 i0Var = rVar.b;
                    i0Var.getClass();
                    if (i0Var.a.hasMessages(1)) {
                        break;
                    }
                }
                break;
            default:
                e0 e0Var = (e0) this.b;
                e0Var.getClass();
                int i10 = message.what;
                if (i10 == 1) {
                    e0Var.g.a();
                    break;
                } else if (i10 == 2) {
                    e0Var.h.a();
                    break;
                } else if (i10 == 3) {
                    e0Var.i.a();
                    break;
                } else if (i10 == 4) {
                    e0Var.j.a();
                    break;
                }
                break;
        }
        return true;
    }
}
