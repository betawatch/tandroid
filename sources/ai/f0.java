package ai;

import org.telegram.messenger.c20;
import org.telegram.messenger.id;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.Components.gc;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f0 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ String b;
    public final /* synthetic */ c20 c;
    public final /* synthetic */ f2 d;

    public /* synthetic */ f0(String str, c20 c20Var, f2 f2Var) {
        this.b = str;
        this.c = c20Var;
        this.d = f2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        f2 f2Var = this.d;
        c20 c20Var = this.c;
        String str = this.b;
        switch (i7) {
            case 0:
                i0.p(f2Var, 0, new f0(str, c20Var, f2Var));
                break;
            default:
                if (str == null) {
                    gc.a0(f2Var).N(id.M0(2131745861, null), id.M0(2131751105, null)).j();
                    break;
                } else {
                    c20Var.a(str);
                    break;
                }
        }
    }

    public /* synthetic */ f0(f2 f2Var, String str, c20 c20Var) {
        this.d = f2Var;
        this.b = str;
        this.c = c20Var;
    }
}
