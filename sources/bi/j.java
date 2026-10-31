package bi;

import org.telegram.ui.Components.u60;
import org.telegram.ui.Components.z60;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class j implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z60 b;

    public /* synthetic */ j(z60 z60Var, int i10) {
        this.a = i10;
        this.b = z60Var;
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
                u60 u60Var = this.b.m;
                if (u60Var != null) {
                    org.telegram.messenger.i0.v1(u60Var.getContentView());
                    break;
                }
                break;
            case 4:
                u60 u60Var2 = this.b.m;
                if (u60Var2 != null) {
                    org.telegram.messenger.i0.v1(u60Var2.getContentView());
                    break;
                }
                break;
            case 5:
                u60 u60Var3 = this.b.m;
                if (u60Var3 != null) {
                    org.telegram.messenger.i0.v1(u60Var3.getContentView());
                    break;
                }
                break;
            case 6:
                u60 u60Var4 = this.b.m;
                if (u60Var4 != null) {
                    org.telegram.messenger.i0.v1(u60Var4.getContentView());
                    break;
                }
                break;
            case 7:
                u60 u60Var5 = this.b.m;
                if (u60Var5 != null) {
                    org.telegram.messenger.i0.v1(u60Var5.getContentView());
                    break;
                }
                break;
            default:
                u60 u60Var6 = this.b.m;
                if (u60Var6 != null) {
                    org.telegram.messenger.i0.v1(u60Var6.getContentView());
                    break;
                }
                break;
        }
    }
}
