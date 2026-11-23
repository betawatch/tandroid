package bi;

import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.x60;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class d7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m8 b;
    public final /* synthetic */ g51[] c;
    public final /* synthetic */ x60 d;

    public /* synthetic */ d7(m8 m8Var, g51[] g51VarArr, x60 x60Var, int i7) {
        this.a = i7;
        this.b = m8Var;
        this.c = g51VarArr;
        this.d = x60Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                a8 a8Var = this.b.d;
                if (!a8Var.l.isEmpty()) {
                    a8Var.l.clear();
                    a8Var.m();
                    g51 g51Var = this.c[0];
                    if (g51Var != null) {
                        g51Var.g3.O(true);
                    }
                    this.d.q0 = true;
                    break;
                }
                break;
            case 1:
                a8 a8Var2 = this.b.d;
                if (!a8Var2.k.isEmpty()) {
                    a8Var2.k.clear();
                    a8Var2.m();
                    g51 g51Var2 = this.c[0];
                    if (g51Var2 != null) {
                        g51Var2.g3.O(true);
                    }
                    this.d.q0 = true;
                    break;
                }
                break;
            default:
                a8 a8Var3 = this.b.d;
                if (!a8Var3.j.isEmpty()) {
                    a8Var3.j.clear();
                    a8Var3.m();
                    g51 g51Var3 = this.c[0];
                    if (g51Var3 != null) {
                        g51Var3.g3.O(true);
                    }
                    this.d.q0 = true;
                    break;
                }
                break;
        }
    }
}
