package org.telegram.messenger;

import android.util.SparseIntArray;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final /* synthetic */ class t8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x8 b;

    public /* synthetic */ t8(x8 x8Var, int i7) {
        this.a = i7;
        this.b = x8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                x8 x8Var = this.b;
                x8Var.L = t0.b.getSharedPreferences("uploadinfo", 0);
                x8Var.i = t0.p();
                if (s2.a) {
                    a8.b("start upload on slow network = " + x8Var.i);
                }
                int i7 = x8Var.i ? 1 : 8;
                for (int i10 = 0; i10 < i7; i10++) {
                    x8Var.d();
                }
                x8Var.e();
                break;
            case 1:
                x8 x8Var2 = this.b;
                SparseIntArray sparseIntArray = x8Var2.p;
                for (int i11 = 0; i11 < sparseIntArray.size(); i11++) {
                    ConnectionsManager.getInstance(x8Var2.a).cancelRequest(sparseIntArray.valueAt(i11), true);
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
