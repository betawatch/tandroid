package bi;

import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.y60;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class x6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g8 b;
    public final /* synthetic */ e51[] c;
    public final /* synthetic */ y60 d;

    public /* synthetic */ x6(g8 g8Var, e51[] e51VarArr, y60 y60Var, int i7) {
        this.a = i7;
        this.b = g8Var;
        this.c = e51VarArr;
        this.d = y60Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                u7 u7Var = this.b.d;
                if (!u7Var.l.isEmpty()) {
                    u7Var.l.clear();
                    u7Var.m();
                    e51 e51Var = this.c[0];
                    if (e51Var != null) {
                        e51Var.g3.O(true);
                    }
                    this.d.q0 = true;
                    break;
                }
                break;
            case 1:
                u7 u7Var2 = this.b.d;
                if (!u7Var2.k.isEmpty()) {
                    u7Var2.k.clear();
                    u7Var2.m();
                    e51 e51Var2 = this.c[0];
                    if (e51Var2 != null) {
                        e51Var2.g3.O(true);
                    }
                    this.d.q0 = true;
                    break;
                }
                break;
            default:
                u7 u7Var3 = this.b.d;
                if (!u7Var3.j.isEmpty()) {
                    u7Var3.j.clear();
                    u7Var3.m();
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
