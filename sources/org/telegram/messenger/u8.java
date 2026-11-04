package org.telegram.messenger;

import android.util.SparseIntArray;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class u8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y8 b;

    public /* synthetic */ u8(y8 y8Var, int i3) {
        this.a = i3;
        this.b = y8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                y8 y8Var = this.b;
                y8Var.L = t0.b.getSharedPreferences("uploadinfo", 0);
                y8Var.i = t0.p();
                if (r2.a) {
                    a8.b("start upload on slow network = " + y8Var.i);
                }
                int i3 = y8Var.i ? 1 : 8;
                for (int i10 = 0; i10 < i3; i10++) {
                    y8Var.d();
                }
                y8Var.e();
                break;
            case 1:
                y8 y8Var2 = this.b;
                SparseIntArray sparseIntArray = y8Var2.p;
                for (int i11 = 0; i11 < sparseIntArray.size(); i11++) {
                    ConnectionsManager.getInstance(y8Var2.a).cancelRequest(sparseIntArray.valueAt(i11), true);
                }
                break;
            case 2:
                this.b.q.clear();
                break;
            default:
                this.b.e();
                break;
        }
    }
}
