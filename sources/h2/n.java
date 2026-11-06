package h2;

import android.os.Handler;
import android.os.Message;
import java.util.Iterator;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final /* synthetic */ class n implements Handler.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n(Object obj, int i7) {
        this.a = i7;
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
                        e2.s d = qVar.b.d();
                        qVar.b = new ca.i();
                        qVar.c = false;
                        pVar.h(qVar.a, d);
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
                int i7 = message.what;
                if (i7 == 1) {
                    ((a0) e0Var.g).a();
                    break;
                } else if (i7 == 2) {
                    ((b0) e0Var.h).a();
                    break;
                } else if (i7 == 3) {
                    ((c0) e0Var.i).a();
                    break;
                } else if (i7 == 4) {
                    ((d0) e0Var.j).a();
                    break;
                }
                break;
        }
        return true;
    }
}
