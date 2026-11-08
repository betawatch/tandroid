package li;

import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.k60;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k60 b;

    public /* synthetic */ h(k60 k60Var, int i7) {
        this.a = i7;
        this.b = k60Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.s();
                break;
            case 1:
                this.b.s();
                break;
            case 2:
                this.b.s();
                break;
            case 3:
                f60 f60Var = this.b.m;
                if (f60Var != null) {
                    org.telegram.messenger.g0.v1(f60Var.getContentView());
                    break;
                }
                break;
            case 4:
                f60 f60Var2 = this.b.m;
                if (f60Var2 != null) {
                    org.telegram.messenger.g0.v1(f60Var2.getContentView());
                    break;
                }
                break;
            case 5:
                f60 f60Var3 = this.b.m;
                if (f60Var3 != null) {
                    org.telegram.messenger.g0.v1(f60Var3.getContentView());
                    break;
                }
                break;
            case 6:
                f60 f60Var4 = this.b.m;
                if (f60Var4 != null) {
                    org.telegram.messenger.g0.v1(f60Var4.getContentView());
                    break;
                }
                break;
            case 7:
                f60 f60Var5 = this.b.m;
                if (f60Var5 != null) {
                    org.telegram.messenger.g0.v1(f60Var5.getContentView());
                    break;
                }
                break;
            default:
                f60 f60Var6 = this.b.m;
                if (f60Var6 != null) {
                    org.telegram.messenger.g0.v1(f60Var6.getContentView());
                    break;
                }
                break;
        }
    }
}
