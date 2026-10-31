package org.telegram.messenger;

import android.util.SparseIntArray;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class z8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d9 b;

    public /* synthetic */ z8(d9 d9Var, int i10) {
        this.a = i10;
        this.b = d9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                d9 d9Var = this.b;
                d9Var.L = w0.b.getSharedPreferences("uploadinfo", 0);
                d9Var.i = w0.p();
                if (v2.a) {
                    f8.b("start upload on slow network = " + d9Var.i);
                }
                int i10 = d9Var.i ? 1 : 8;
                for (int i11 = 0; i11 < i10; i11++) {
                    d9Var.d();
                }
                d9Var.e();
                break;
            case 1:
                d9 d9Var2 = this.b;
                SparseIntArray sparseIntArray = d9Var2.p;
                for (int i12 = 0; i12 < sparseIntArray.size(); i12++) {
                    ConnectionsManager.getInstance(d9Var2.a).cancelRequest(sparseIntArray.valueAt(i12), true);
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
