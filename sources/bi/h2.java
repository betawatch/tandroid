package bi;

import org.telegram.messenger.x10;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n3 b;
    public final /* synthetic */ x10 c;

    public /* synthetic */ h2(n3 n3Var, x10 x10Var, int i7) {
        this.a = i7;
        this.b = n3Var;
        this.c = x10Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                n3 n3Var = this.b;
                x10 x10Var = this.c;
                if (x10Var != null) {
                    n3Var.getClass();
                    x10Var.a(Boolean.FALSE);
                }
                n3Var.dismiss();
                break;
            case 1:
                n3 n3Var2 = this.b;
                x10 x10Var2 = this.c;
                if (x10Var2 != null) {
                    n3Var2.getClass();
                    x10Var2.a(Boolean.FALSE);
                }
                n3Var2.dismiss();
                break;
            default:
                n3 n3Var3 = this.b;
                x10 x10Var3 = this.c;
                if (x10Var3 != null) {
                    n3Var3.getClass();
                    x10Var3.a(Boolean.FALSE);
                }
                n3Var3.dismiss();
                break;
        }
    }
}
