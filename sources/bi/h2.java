package bi;

import org.telegram.messenger.y10;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n3 b;
    public final /* synthetic */ y10 c;

    public /* synthetic */ h2(n3 n3Var, y10 y10Var, int i7) {
        this.a = i7;
        this.b = n3Var;
        this.c = y10Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                n3 n3Var = this.b;
                y10 y10Var = this.c;
                if (y10Var != null) {
                    n3Var.getClass();
                    y10Var.a(Boolean.FALSE);
                }
                n3Var.dismiss();
                break;
            case 1:
                n3 n3Var2 = this.b;
                y10 y10Var2 = this.c;
                if (y10Var2 != null) {
                    n3Var2.getClass();
                    y10Var2.a(Boolean.FALSE);
                }
                n3Var2.dismiss();
                break;
            default:
                n3 n3Var3 = this.b;
                y10 y10Var3 = this.c;
                if (y10Var3 != null) {
                    n3Var3.getClass();
                    y10Var3.a(Boolean.FALSE);
                }
                n3Var3.dismiss();
                break;
        }
    }
}
