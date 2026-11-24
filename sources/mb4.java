// default package

import android.util.SparseIntArray;
import org.telegram.messenger.a;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class mb4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qb4 b;

    public /* synthetic */ mb4(qb4 qb4Var, byte b) {
        this.a = b;
        this.b = qb4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = 0;
        qb4 qb4Var = this.b;
        switch (b) {
            case 0:
                qb4Var.L = a.b.getSharedPreferences("uploadinfo", 0);
                qb4Var.i = a.p();
                if (w01.a) {
                    fa4.b("start upload on slow network = " + qb4Var.i);
                }
                int i2 = qb4Var.i ? 1 : 8;
                while (i < i2) {
                    qb4Var.d();
                    i++;
                }
                qb4Var.e();
                break;
            case 1:
                SparseIntArray sparseIntArray = qb4Var.p;
                while (i < sparseIntArray.size()) {
                    ConnectionsManager.getInstance(qb4Var.a).cancelRequest(sparseIntArray.valueAt(i), true);
                    i++;
                }
                break;
            case 2:
                qb4Var.q.clear();
                break;
            default:
                qb4Var.e();
                break;
        }
    }
}
