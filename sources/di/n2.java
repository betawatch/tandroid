package di;

import com.google.android.gms.common.api.internal.BasePendingResult;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.kq;
import org.telegram.ui.xk0;
import org.telegram.ui.zz;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class n2 extends TimerTask {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n2(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        BasePendingResult basePendingResult;
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new bi.la(this, 23));
                break;
            case 1:
                e6.c cVar = (e6.c) this.b;
                ArrayDeque arrayDeque = cVar.h;
                if (!arrayDeque.isEmpty() && cVar.k == null && cVar.b != 0) {
                    e6.h hVar = cVar.c;
                    int[] e = g6.a.e(arrayDeque);
                    hVar.getClass();
                    n6.l.e("Must be called from the main thread.");
                    if (hVar.w()) {
                        e6.k kVar = new e6.k(hVar, e);
                        e6.h.x(kVar);
                        basePendingResult = kVar;
                    } else {
                        basePendingResult = e6.h.t();
                    }
                    cVar.k = basePendingResult;
                    basePendingResult.i(new e6.q(cVar, 1));
                    arrayDeque.clear();
                    break;
                }
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new kq(this, 24));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new zz(this, 24));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new xk0(this, 6));
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
