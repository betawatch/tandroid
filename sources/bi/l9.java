package bi;

import org.telegram.messenger.c20;
import org.telegram.ui.Components.vs;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ c20 c;

    public /* synthetic */ l9(int i7, c20 c20Var, boolean[] zArr) {
        this.a = i7;
        this.b = zArr;
        this.c = c20Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c20 c20Var;
        c20 c20Var2;
        c20 c20Var3;
        switch (this.a) {
            case 0:
                boolean[] zArr = this.b;
                if (!zArr[0] && (c20Var = this.c) != null) {
                    c20Var.a("cancelled");
                    zArr[0] = true;
                    break;
                }
                break;
            case 1:
                boolean[] zArr2 = this.b;
                if (!zArr2[0] && (c20Var2 = this.c) != null) {
                    zArr2[0] = true;
                    c20Var2.a(Boolean.TRUE);
                }
                org.telegram.messenger.g0.i3(new vs(28), 220L);
                break;
            default:
                boolean[] zArr3 = this.b;
                if (!zArr3[0] && (c20Var3 = this.c) != null) {
                    zArr3[0] = true;
                    c20Var3.a(Boolean.FALSE);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ l9(ea eaVar, boolean[] zArr, c20 c20Var) {
        this.a = 0;
        this.b = zArr;
        this.c = c20Var;
    }
}
