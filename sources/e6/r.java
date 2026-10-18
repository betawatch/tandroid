package e6;

import com.google.android.gms.common.api.internal.BasePendingResult;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.hq;
import org.telegram.ui.ek0;
import org.telegram.ui.fz;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
                    n6.l.e("Must be called from the main thread.");
                    if (hVar.w()) {
                        k kVar = new k(hVar, e);
                        h.x(kVar);
                        basePendingResult = kVar;
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
                AndroidUtilities.runOnUIThread(new com.google.firebase.messaging.s(this, 14));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new hq(this, 24));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new fz(this, 24));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new ek0(this, 6));
                break;
            default:
                try {
                    Socket socket = ((tc.q) this.b).a.a.g;
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
