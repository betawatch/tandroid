// default package

import android.util.SparseIntArray;
import org.telegram.messenger.a;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class md4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qd4 b;

    public /* synthetic */ md4(qd4 qd4Var, byte b) {
        this.a = b;
        this.b = qd4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = 0;
        qd4 qd4Var = this.b;
        switch (b) {
            case 0:
                qd4Var.L = a.b.getSharedPreferences("uploadinfo", 0);
                qd4Var.i = a.p();
                if (e21.a) {
                    fc4.b("start upload on slow network = " + qd4Var.i);
                }
                int i2 = qd4Var.i ? 1 : 8;
                while (i < i2) {
                    qd4Var.d();
                    i++;
                }
                qd4Var.e();
                break;
            case 1:
                SparseIntArray sparseIntArray = qd4Var.p;
                while (i < sparseIntArray.size()) {
                    ConnectionsManager.getInstance(qd4Var.a).cancelRequest(sparseIntArray.valueAt(i), true);
                    i++;
                }
                break;
            case 2:
                qd4Var.q.clear();
                break;
            default:
                qd4Var.e();
                break;
        }
    }
}
