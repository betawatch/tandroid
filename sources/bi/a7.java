package bi;

import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.h51;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j8 b;
    public final /* synthetic */ h51[] c;
    public final /* synthetic */ a70 d;

    public /* synthetic */ a7(j8 j8Var, h51[] h51VarArr, a70 a70Var, int i7) {
        this.a = i7;
        this.b = j8Var;
        this.c = h51VarArr;
        this.d = a70Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                x7 x7Var = this.b.d;
                if (!x7Var.l.isEmpty()) {
                    x7Var.l.clear();
                    x7Var.m();
                    h51 h51Var = this.c[0];
                    if (h51Var != null) {
                        h51Var.g3.O(true);
                    }
                    this.d.q0 = true;
                    break;
                }
                break;
            case 1:
                x7 x7Var2 = this.b.d;
                if (!x7Var2.k.isEmpty()) {
                    x7Var2.k.clear();
                    x7Var2.m();
                    h51 h51Var2 = this.c[0];
                    if (h51Var2 != null) {
                        h51Var2.g3.O(true);
                    }
                    this.d.q0 = true;
                    break;
                }
                break;
            default:
                x7 x7Var3 = this.b.d;
                if (!x7Var3.j.isEmpty()) {
                    x7Var3.j.clear();
                    x7Var3.m();
                    h51 h51Var3 = this.c[0];
                    if (h51Var3 != null) {
                        h51Var3.g3.O(true);
                    }
                    this.d.q0 = true;
                    break;
                }
                break;
        }
    }
}
