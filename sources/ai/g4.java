package ai;

import org.telegram.ui.Components.b60;
import org.telegram.ui.Components.f60;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f60 b;

    public /* synthetic */ g4(f60 f60Var, int i3) {
        this.a = i3;
        this.b = f60Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.s();
                break;
            case 1:
                b60 b60Var = this.b.m;
                if (b60Var != null) {
                    org.telegram.messenger.g0.v1(b60Var.getContentView());
                    break;
                }
                break;
            case 2:
                b60 b60Var2 = this.b.m;
                if (b60Var2 != null) {
                    org.telegram.messenger.g0.v1(b60Var2.getContentView());
                    break;
                }
                break;
            case 3:
                b60 b60Var3 = this.b.m;
                if (b60Var3 != null) {
                    org.telegram.messenger.g0.v1(b60Var3.getContentView());
                    break;
                }
                break;
            case 4:
                b60 b60Var4 = this.b.m;
                if (b60Var4 != null) {
                    org.telegram.messenger.g0.v1(b60Var4.getContentView());
                    break;
                }
                break;
            case 5:
                b60 b60Var5 = this.b.m;
                if (b60Var5 != null) {
                    org.telegram.messenger.g0.v1(b60Var5.getContentView());
                    break;
                }
                break;
            case 6:
                b60 b60Var6 = this.b.m;
                if (b60Var6 != null) {
                    org.telegram.messenger.g0.v1(b60Var6.getContentView());
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
