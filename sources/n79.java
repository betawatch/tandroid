// default package

import android.util.SparseArray;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class n79 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ o79 b;

    public /* synthetic */ n79(o79 o79Var, byte b) {
        this.a = b;
        this.b = o79Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        o79 o79Var = this.b;
        switch (b) {
            case 0:
                SparseArray sparseArray = o79Var.n;
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    ((r79) sparseArray.valueAt(i)).getClass();
                    r79.a(null, null);
                }
                sparseArray.clear();
                break;
            default:
                u79 u79Var = o79Var.r;
                if (u79Var.E == o79Var) {
                    u79Var.p();
                    break;
                }
                break;
        }
    }
}
