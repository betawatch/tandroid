// default package

import android.util.SparseIntArray;
import org.telegram.messenger.a;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class jd4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nd4 b;

    public /* synthetic */ jd4(nd4 nd4Var, byte b) {
        this.a = b;
        this.b = nd4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = 0;
        nd4 nd4Var = this.b;
        switch (b) {
            case 0:
                nd4Var.L = a.b.getSharedPreferences("uploadinfo", 0);
                nd4Var.i = a.p();
                if (f11.a) {
                    cc4.b("start upload on slow network = " + nd4Var.i);
                }
                int i2 = nd4Var.i ? 1 : 8;
                while (i < i2) {
                    nd4Var.d();
                    i++;
                }
                nd4Var.e();
                break;
            case 1:
                SparseIntArray sparseIntArray = nd4Var.p;
                while (i < sparseIntArray.size()) {
                    ConnectionsManager.getInstance(nd4Var.a).cancelRequest(sparseIntArray.valueAt(i), true);
                    i++;
                }
                break;
            case 2:
                nd4Var.q.clear();
                break;
            default:
                nd4Var.e();
                break;
        }
    }
}
