package ai;

import org.telegram.messenger.c20;
import org.telegram.messenger.id;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.Components.hc;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
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
                    hc.a0(f2Var).N(id.M0(2131745864, null), id.M0(2131751106, null)).j();
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
