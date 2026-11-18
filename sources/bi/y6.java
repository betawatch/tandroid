package bi;

import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.y60;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class y6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h8 b;
    public final /* synthetic */ e51[] c;
    public final /* synthetic */ y60 d;

    public /* synthetic */ y6(h8 h8Var, e51[] e51VarArr, y60 y60Var, int i7) {
        this.a = i7;
        this.b = h8Var;
        this.c = e51VarArr;
        this.d = y60Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                v7 v7Var = this.b.d;
                if (!v7Var.l.isEmpty()) {
                    v7Var.l.clear();
                    v7Var.m();
                    e51 e51Var = this.c[0];
                    if (e51Var != null) {
                        e51Var.g3.O(true);
                    }
                    this.d.q0 = true;
                    break;
                }
                break;
            case 1:
                v7 v7Var2 = this.b.d;
                if (!v7Var2.k.isEmpty()) {
                    v7Var2.k.clear();
                    v7Var2.m();
                    e51 e51Var2 = this.c[0];
                    if (e51Var2 != null) {
                        e51Var2.g3.O(true);
                    }
                    this.d.q0 = true;
                    break;
                }
                break;
            default:
                v7 v7Var3 = this.b.d;
                if (!v7Var3.j.isEmpty()) {
                    v7Var3.j.clear();
                    v7Var3.m();
                    e51 e51Var3 = this.c[0];
                    if (e51Var3 != null) {
                        e51Var3.g3.O(true);
                    }
                    this.d.q0 = true;
                    break;
                }
                break;
        }
    }
}
