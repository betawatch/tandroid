package h6;

import com.google.android.gms.common.api.internal.BasePendingResult;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.TimerTask;
import org.telegram.messenger.g0;
import org.telegram.ui.Components.mo;
import org.telegram.ui.ec0;
import org.telegram.ui.if0;
import org.telegram.ui.lz;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
                g0.g3(new hi.k(this, 8));
                break;
            case 2:
                g0.g3(new mo(this, 24));
                break;
            case 3:
                if (((ec0) this.b).O != null) {
                    g0.g3(new lz(this, 25));
                    break;
                }
                break;
            case 4:
                g0.g3(new if0(this, 8));
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
