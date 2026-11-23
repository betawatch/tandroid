package bi;

import org.telegram.ui.Components.q60;
import org.telegram.ui.Components.x60;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class h6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x60 b;

    public /* synthetic */ h6(x60 x60Var, int i7) {
        this.a = i7;
        this.b = x60Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.s();
                break;
            case 1:
                q60 q60Var = this.b.m;
                if (q60Var != null) {
                    org.telegram.messenger.g0.v1(q60Var.getContentView());
                    break;
                }
                break;
            case 2:
                q60 q60Var2 = this.b.m;
                if (q60Var2 != null) {
                    org.telegram.messenger.g0.v1(q60Var2.getContentView());
                    break;
                }
                break;
            case 3:
                q60 q60Var3 = this.b.m;
                if (q60Var3 != null) {
                    org.telegram.messenger.g0.v1(q60Var3.getContentView());
                    break;
                }
                break;
            case 4:
                q60 q60Var4 = this.b.m;
                if (q60Var4 != null) {
                    org.telegram.messenger.g0.v1(q60Var4.getContentView());
                    break;
                }
                break;
            case 5:
                q60 q60Var5 = this.b.m;
                if (q60Var5 != null) {
                    org.telegram.messenger.g0.v1(q60Var5.getContentView());
                    break;
                }
                break;
            case 6:
                q60 q60Var6 = this.b.m;
                if (q60Var6 != null) {
                    org.telegram.messenger.g0.v1(q60Var6.getContentView());
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
