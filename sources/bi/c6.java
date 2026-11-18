package bi;

import org.telegram.ui.Components.r60;
import org.telegram.ui.Components.y60;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class c6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y60 b;

    public /* synthetic */ c6(y60 y60Var, int i7) {
        this.a = i7;
        this.b = y60Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.s();
                break;
            case 1:
                r60 r60Var = this.b.m;
                if (r60Var != null) {
                    org.telegram.messenger.g0.v1(r60Var.getContentView());
                    break;
                }
                break;
            case 2:
                r60 r60Var2 = this.b.m;
                if (r60Var2 != null) {
                    org.telegram.messenger.g0.v1(r60Var2.getContentView());
                    break;
                }
                break;
            case 3:
                r60 r60Var3 = this.b.m;
                if (r60Var3 != null) {
                    org.telegram.messenger.g0.v1(r60Var3.getContentView());
                    break;
                }
                break;
            case 4:
                r60 r60Var4 = this.b.m;
                if (r60Var4 != null) {
                    org.telegram.messenger.g0.v1(r60Var4.getContentView());
                    break;
                }
                break;
            case 5:
                r60 r60Var5 = this.b.m;
                if (r60Var5 != null) {
                    org.telegram.messenger.g0.v1(r60Var5.getContentView());
                    break;
                }
                break;
            case 6:
                r60 r60Var6 = this.b.m;
                if (r60Var6 != null) {
                    org.telegram.messenger.g0.v1(r60Var6.getContentView());
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
