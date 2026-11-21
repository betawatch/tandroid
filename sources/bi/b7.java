package bi;

import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.h51;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k8 b;
    public final /* synthetic */ h51[] c;
    public final /* synthetic */ a70 d;

    public /* synthetic */ b7(k8 k8Var, h51[] h51VarArr, a70 a70Var, int i7) {
        this.a = i7;
        this.b = k8Var;
        this.c = h51VarArr;
        this.d = a70Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                y7 y7Var = this.b.d;
                if (!y7Var.l.isEmpty()) {
                    y7Var.l.clear();
                    y7Var.m();
                    h51 h51Var = this.c[0];
                    if (h51Var != null) {
                        h51Var.g3.O(true);
                    }
                    this.d.q0 = true;
                    break;
                }
                break;
            case 1:
                y7 y7Var2 = this.b.d;
                if (!y7Var2.k.isEmpty()) {
                    y7Var2.k.clear();
                    y7Var2.m();
                    h51 h51Var2 = this.c[0];
                    if (h51Var2 != null) {
                        h51Var2.g3.O(true);
                    }
                    this.d.q0 = true;
                    break;
                }
                break;
            default:
                y7 y7Var3 = this.b.d;
                if (!y7Var3.j.isEmpty()) {
                    y7Var3.j.clear();
                    y7Var3.m();
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
