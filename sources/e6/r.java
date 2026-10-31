package e6;

import com.google.android.gms.common.api.internal.BasePendingResult;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.TimerTask;
import org.telegram.messenger.i0;
import org.telegram.ui.Components.ho;
import org.telegram.ui.ld0;
import org.telegram.ui.mg0;
import org.telegram.ui.zy;
import vh.d0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class r extends TimerTask {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r(Object obj, int i10) {
        this.a = i10;
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
                    int[] e = g6.a.e(arrayDeque);
                    hVar.getClass();
                    n6.l.d("Must be called from the main thread.");
                    if (hVar.w()) {
                        j jVar = new j(hVar, e);
                        h.x(jVar);
                        basePendingResult = jVar;
                    } else {
                        basePendingResult = h.t();
                    }
                    cVar.k = basePendingResult;
                    basePendingResult.i(new q(cVar, 1));
                    arrayDeque.clear();
                    break;
                }
                break;
            case 1:
                try {
                    Socket socket = ((lc.q) this.b).a.a.g;
                    if (socket != null) {
                        socket.close();
                        break;
                    }
                } catch (Throwable unused) {
                    return;
                }
                break;
            case 2:
                i0.g3(new ho(this, 25));
                break;
            case 3:
                if (((ld0) this.b).N != null) {
                    i0.g3(new zy(this, 25));
                    break;
                }
                break;
            case 4:
                i0.g3(new mg0(this, 8));
                break;
            default:
                i0.g3(new d0(this, 6));
                break;
        }
    }
}
