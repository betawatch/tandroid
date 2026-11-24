// default package

import com.google.android.gms.common.api.internal.BasePendingResult;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.TimerTask;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class lx3 extends TimerTask {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ lx3(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        BasePendingResult basePendingResult;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                gm.c3(new bi3(this, (byte) 28));
                break;
            case 1:
                if (((pf6) obj).O != null) {
                    gm.c3(new kg5(this, (byte) 29));
                    break;
                }
                break;
            case 2:
                gm.c3(new kl7(this, (byte) 16));
                break;
            case 3:
                try {
                    Socket socket = ((q39) obj).a.a.g;
                    if (socket != null) {
                        socket.close();
                        break;
                    }
                } catch (Throwable unused) {
                    return;
                }
                break;
            default:
                xt6 xt6Var = (xt6) obj;
                ArrayDeque arrayDeque = xt6Var.h;
                if (!arrayDeque.isEmpty() && xt6Var.k == null && xt6Var.b != 0) {
                    k89 k89Var = xt6Var.c;
                    int[] e = qe1.e(arrayDeque);
                    k89Var.getClass();
                    ite.e("Must be called from the main thread.");
                    if (k89Var.w()) {
                        qbd qbdVar = new qbd(k89Var, e);
                        k89.x(qbdVar);
                        basePendingResult = qbdVar;
                    } else {
                        basePendingResult = k89.t();
                    }
                    xt6Var.k = basePendingResult;
                    basePendingResult.i(new m7f(xt6Var, (byte) 1));
                    arrayDeque.clear();
                    break;
                }
                break;
        }
    }
}
