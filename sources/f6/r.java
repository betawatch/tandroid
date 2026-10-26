package f6;

import com.google.android.gms.common.api.internal.BasePendingResult;
import di.s8;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bq;
import org.telegram.ui.lj0;
import org.telegram.ui.p00;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
                AndroidUtilities.runOnUIThread(new bq(this, 26));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new p00(this, 25));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new lj0(this, 7));
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
