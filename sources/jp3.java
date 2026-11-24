// default package

import android.os.Handler;
import android.os.Message;
import java.util.Iterator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class jp3 implements Handler.Callback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jp3(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((np3) obj).handleMessage(message);
                return true;
            case 1:
                a86 a86Var = (a86) obj;
                y76 y76Var = a86Var.c;
                y76Var.getClass();
                Iterator it = a86Var.d.iterator();
                while (it.hasNext()) {
                    z76 z76Var = (z76) it.next();
                    if (!z76Var.d && z76Var.c) {
                        lk4 f = z76Var.b.f();
                        z76Var.b = new m41();
                        z76Var.c = false;
                        y76Var.c(z76Var.a, f);
                    }
                    dfb dfbVar = a86Var.b;
                    dfbVar.getClass();
                    if (dfbVar.a.hasMessages(1)) {
                        return true;
                    }
                }
                return true;
            default:
                oa0 oa0Var = (oa0) obj;
                int i = message.what;
                if (i == 1) {
                    ((ybb) oa0Var.g).a();
                } else if (i == 2) {
                    ((zbb) oa0Var.h).a();
                } else if (i == 3) {
                    ((acb) oa0Var.i).a();
                } else {
                    if (i != 4) {
                        return false;
                    }
                    ((bcb) oa0Var.j).a();
                }
                return true;
        }
    }
}
