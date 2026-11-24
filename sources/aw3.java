// default package

import com.google.android.gms.common.api.internal.BasePendingResult;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.TimerTask;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class aw3 extends TimerTask {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ aw3(Object obj, byte b) {
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
                gl.d3(new li3(this, (byte) 23));
                break;
            case 1:
                if (((qd6) obj).O != null) {
                    gl.d3(new tp5(this, (byte) 22));
                    break;
                }
                break;
            case 2:
                gl.d3(new oq7(this, (byte) 9));
                break;
            case 3:
                try {
                    Socket socket = ((n19) obj).a.a.g;
                    if (socket != null) {
                        socket.close();
                        break;
                    }
                } catch (Throwable unused) {
                    return;
                }
                break;
            default:
                wr6 wr6Var = (wr6) obj;
                ArrayDeque arrayDeque = wr6Var.h;
                if (!arrayDeque.isEmpty() && wr6Var.k == null && wr6Var.b != 0) {
                    i69 i69Var = wr6Var.c;
                    int[] e = id1.e(arrayDeque);
                    i69Var.getClass();
                    fre.e("Must be called from the main thread.");
                    if (i69Var.w()) {
                        o9d o9dVar = new o9d(i69Var, e);
                        i69.x(o9dVar);
                        basePendingResult = o9dVar;
                    } else {
                        basePendingResult = i69.t();
                    }
                    wr6Var.k = basePendingResult;
                    basePendingResult.i(new k5f(wr6Var, (byte) 1));
                    arrayDeque.clear();
                    break;
                }
                break;
        }
    }
}
