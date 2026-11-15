package bi;

import org.telegram.ui.Components.i60;
import org.telegram.ui.Components.m60;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class u3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m60 b;

    public /* synthetic */ u3(m60 m60Var, int i7) {
        this.a = i7;
        this.b = m60Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.s();
                break;
            case 1:
                i60 i60Var = this.b.m;
                if (i60Var != null) {
                    org.telegram.messenger.g0.v1(i60Var.getContentView());
                    break;
                }
                break;
            case 2:
                i60 i60Var2 = this.b.m;
                if (i60Var2 != null) {
                    org.telegram.messenger.g0.v1(i60Var2.getContentView());
                    break;
                }
                break;
            case 3:
                i60 i60Var3 = this.b.m;
                if (i60Var3 != null) {
                    org.telegram.messenger.g0.v1(i60Var3.getContentView());
                    break;
                }
                break;
            case 4:
                i60 i60Var4 = this.b.m;
                if (i60Var4 != null) {
                    org.telegram.messenger.g0.v1(i60Var4.getContentView());
                    break;
                }
                break;
            case 5:
                i60 i60Var5 = this.b.m;
                if (i60Var5 != null) {
                    org.telegram.messenger.g0.v1(i60Var5.getContentView());
                    break;
                }
                break;
            case 6:
                i60 i60Var6 = this.b.m;
                if (i60Var6 != null) {
                    org.telegram.messenger.g0.v1(i60Var6.getContentView());
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
