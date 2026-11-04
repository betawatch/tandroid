package g6;

import com.google.android.gms.common.api.internal.BasePendingResult;
import ei.z5;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.TimerTask;
import org.telegram.messenger.g0;
import org.telegram.ui.Components.gp;
import org.telegram.ui.cc0;
import org.telegram.ui.fz;
import org.telegram.ui.sg0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class q extends TimerTask {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        BasePendingResult basePendingResult;
        switch (this.a) {
            case 0:
                c cVar = (c) this.b;
                ArrayDeque arrayDeque = cVar.h;
                if (!arrayDeque.isEmpty() && cVar.k == null && cVar.b != 0) {
                    h hVar = cVar.c;
                    int[] e10 = i6.a.e(arrayDeque);
                    hVar.getClass();
                    p6.m.d("Must be called from the main thread.");
                    if (hVar.w()) {
                        j jVar = new j(hVar, e10);
                        h.x(jVar);
                        basePendingResult = jVar;
                    } else {
                        basePendingResult = h.t();
                    }
                    cVar.k = basePendingResult;
                    basePendingResult.i(new p(cVar, 1));
                    arrayDeque.clear();
                    break;
                }
                break;
            case 1:
                g0.h3(new z5(this, 25));
                break;
            case 2:
                try {
                    Socket socket = ((oc.q) this.b).a.a.g;
                    if (socket != null) {
                        socket.close();
                        break;
                    }
                } catch (Throwable unused) {
                    return;
                }
                break;
            case 3:
                g0.h3(new gp(this, 22));
                break;
            case 4:
                if (((cc0) this.b).O != null) {
                    g0.h3(new fz(this, 24));
                    break;
                }
                break;
            default:
                g0.h3(new sg0(this, 7));
                break;
        }
    }
}
