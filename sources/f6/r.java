package f6;

import com.google.android.gms.common.api.internal.BasePendingResult;
import di.s8;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.cp;
import org.telegram.ui.nj0;
import org.telegram.ui.r00;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
                    int[] e = h6.a.e(arrayDeque);
                    hVar.getClass();
                    o6.l.e("Must be called from the main thread.");
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
                AndroidUtilities.runOnUIThread(new s8(this, 18));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new cp(this, 27));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new r00(this, 25));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new nj0(this, 7));
                break;
            default:
                try {
                    Socket socket = ((uc.q) this.b).a.a.g;
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
