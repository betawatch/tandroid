// default package

import java.util.Iterator;
import java.util.List;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class he2 implements ResultCallback {
    public final /* synthetic */ elb a;
    public final /* synthetic */ yk1 b;

    public he2(elb elbVar, yk1 yk1Var) {
        this.a = elbVar;
        this.b = yk1Var;
    }

    @Override // org.telegram.tgnet.ResultCallback
    public final void onComplete(Object obj) {
        yk1 yk1Var;
        jy3 jy3Var;
        Iterator it = ((List) obj).iterator();
        do {
            boolean hasNext = it.hasNext();
            yk1Var = this.b;
            if (!hasNext) {
                yk1Var.onComplete(null);
                return;
            }
            jy3Var = (jy3) it.next();
        } while (!this.a.equals(jy3Var.c));
        jy3Var.k();
        yk1Var.onComplete(jy3Var);
    }

    @Override // org.telegram.tgnet.ResultCallback
    public final void onError(TLRPC.TL_error tL_error) {
        this.b.onComplete(null);
    }

    @Override // org.telegram.tgnet.ResultCallback
    public final void onError(Throwable th) {
    }
}
