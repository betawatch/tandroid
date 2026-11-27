// default package

import android.util.Pair;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class c07 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ f07 b;
    public final /* synthetic */ Pair c;
    public final /* synthetic */ jt6 d;

    public /* synthetic */ c07(f07 f07Var, Pair pair, jt6 jt6Var, byte b) {
        this.a = b;
        this.b = f07Var;
        this.c = pair;
        this.d = jt6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        jt6 jt6Var = this.d;
        Pair pair = this.c;
        f07 f07Var = this.b;
        switch (b) {
            case 0:
                ea3 ea3Var = f07Var.b.i;
                int intValue = ((Integer) pair.first).intValue();
                vz6 vz6Var = (vz6) pair.second;
                vz6Var.getClass();
                ea3Var.k(intValue, vz6Var, jt6Var);
                break;
            default:
                f07Var.b.i.j(((Integer) pair.first).intValue(), (vz6) pair.second, jt6Var);
                break;
        }
    }
}
