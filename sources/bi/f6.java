package bi;

import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.t60;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a70 b;

    public /* synthetic */ f6(a70 a70Var, int i7) {
        this.a = i7;
        this.b = a70Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.s();
                break;
            case 1:
                t60 t60Var = this.b.m;
                if (t60Var != null) {
                    org.telegram.messenger.g0.v1(t60Var.getContentView());
                    break;
                }
                break;
            case 2:
                t60 t60Var2 = this.b.m;
                if (t60Var2 != null) {
                    org.telegram.messenger.g0.v1(t60Var2.getContentView());
                    break;
                }
                break;
            case 3:
                t60 t60Var3 = this.b.m;
                if (t60Var3 != null) {
                    org.telegram.messenger.g0.v1(t60Var3.getContentView());
                    break;
                }
                break;
            case 4:
                t60 t60Var4 = this.b.m;
                if (t60Var4 != null) {
                    org.telegram.messenger.g0.v1(t60Var4.getContentView());
                    break;
                }
                break;
            case 5:
                t60 t60Var5 = this.b.m;
                if (t60Var5 != null) {
                    org.telegram.messenger.g0.v1(t60Var5.getContentView());
                    break;
                }
                break;
            case 6:
                t60 t60Var6 = this.b.m;
                if (t60Var6 != null) {
                    org.telegram.messenger.g0.v1(t60Var6.getContentView());
                    break;
                }
                break;
            case 7:
                this.b.s();
                break;
            default:
                this.b.s();
                break;
        }
    }
}
