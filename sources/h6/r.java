package h6;

import com.google.android.gms.common.api.internal.BasePendingResult;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.TimerTask;
import org.telegram.messenger.g0;
import org.telegram.ui.Components.oo;
import org.telegram.ui.ec0;
import org.telegram.ui.hf0;
import org.telegram.ui.lz;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final class r extends TimerTask {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r(Object obj, int i7) {
        this.a = i7;
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
                    int[] e10 = j6.a.e(arrayDeque);
                    hVar.getClass();
                    q6.m.e("Must be called from the main thread.");
                    if (hVar.w()) {
                        j jVar = new j(hVar, e10);
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
                g0.g3(new hi.l(this, 8));
                break;
            case 2:
                g0.g3(new oo(this, 24));
                break;
            case 3:
                if (((ec0) this.b).O != null) {
                    g0.g3(new lz(this, 25));
                    break;
                }
                break;
            case 4:
                g0.g3(new hf0(this, 8));
                break;
            default:
                try {
                    Socket socket = ((rc.q) this.b).a.a.g;
                    if (socket != null) {
                        socket.close();
                        break;
                    }
                } catch (Throwable unused) {
                    return;
                }
                break;
        }
    }
}
