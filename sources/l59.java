// default package

import android.util.SparseArray;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class l59 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ m59 b;

    public /* synthetic */ l59(m59 m59Var, byte b) {
        this.a = b;
        this.b = m59Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        m59 m59Var = this.b;
        switch (b) {
            case 0:
                SparseArray sparseArray = m59Var.n;
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    ((p59) sparseArray.valueAt(i)).getClass();
                    p59.a(null, null);
                }
                sparseArray.clear();
                break;
            default:
                s59 s59Var = m59Var.r;
                if (s59Var.E == m59Var) {
                    s59Var.p();
                    break;
                }
                break;
        }
    }
}
