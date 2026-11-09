package fi;

import com.google.android.gms.common.api.internal.BasePendingResult;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.TimerTask;
import org.telegram.ui.Components.gp;
import org.telegram.ui.gc0;
import org.telegram.ui.gf0;
import org.telegram.ui.jz;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class h2 extends TimerTask {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h2(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        BasePendingResult basePendingResult;
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new di.f8(this, 20));
                break;
            case 1:
                h6.c cVar = (h6.c) this.b;
                ArrayDeque arrayDeque = cVar.h;
                if (!arrayDeque.isEmpty() && cVar.k == null && cVar.b != 0) {
                    h6.h hVar = cVar.c;
                    int[] e10 = j6.a.e(arrayDeque);
                    hVar.getClass();
                    q6.m.d("Must be called from the main thread.");
                    if (hVar.w()) {
                        h6.j jVar = new h6.j(hVar, e10);
                        h6.h.x(jVar);
                        basePendingResult = jVar;
                    } else {
                        basePendingResult = h6.h.t();
                    }
                    cVar.k = basePendingResult;
                    basePendingResult.i(new h6.q(cVar, 1));
                    arrayDeque.clear();
                    break;
                }
                break;
            case 2:
                org.telegram.messenger.g0.h3(new gp(this, 22));
                break;
            case 3:
                if (((gc0) this.b).N != null) {
                    org.telegram.messenger.g0.h3(new jz(this, 25));
                    break;
                }
                break;
            case 4:
                org.telegram.messenger.g0.h3(new gf0(this, 8));
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
