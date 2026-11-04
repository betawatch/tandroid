package g2;

import android.os.Handler;
import android.os.Message;
import java.util.Iterator;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class o implements Handler.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.a) {
            case 0:
                s sVar = (s) this.b;
                q qVar = sVar.c;
                qVar.getClass();
                Iterator it = sVar.d.iterator();
                while (it.hasNext()) {
                    r rVar = (r) it.next();
                    if (!rVar.d && rVar.c) {
                        d2.t d = rVar.b.d();
                        rVar.b = new ba.i();
                        rVar.c = false;
                        qVar.e(rVar.a, d);
                    }
                    j0 j0Var = sVar.b;
                    j0Var.getClass();
                    if (j0Var.a.hasMessages(1)) {
                        break;
                    }
                }
                break;
            default:
                f0 f0Var = (f0) this.b;
                f0Var.getClass();
                int i3 = message.what;
                if (i3 == 1) {
                    ((b0) f0Var.g).a();
                    break;
                } else if (i3 == 2) {
                    ((c0) f0Var.h).a();
                    break;
                } else if (i3 == 3) {
                    ((d0) f0Var.i).a();
                    break;
                } else if (i3 == 4) {
                    ((e0) f0Var.j).a();
                    break;
                }
                break;
        }
        return true;
    }
}
