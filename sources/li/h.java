package li;

import org.telegram.ui.Components.g60;
import org.telegram.ui.Components.l60;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l60 b;

    public /* synthetic */ h(l60 l60Var, int i7) {
        this.a = i7;
        this.b = l60Var;
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
                g60 g60Var = this.b.m;
                if (g60Var != null) {
                    org.telegram.messenger.g0.v1(g60Var.getContentView());
                    break;
                }
                break;
            case 4:
                g60 g60Var2 = this.b.m;
                if (g60Var2 != null) {
                    org.telegram.messenger.g0.v1(g60Var2.getContentView());
                    break;
                }
                break;
            case 5:
                g60 g60Var3 = this.b.m;
                if (g60Var3 != null) {
                    org.telegram.messenger.g0.v1(g60Var3.getContentView());
                    break;
                }
                break;
            case 6:
                g60 g60Var4 = this.b.m;
                if (g60Var4 != null) {
                    org.telegram.messenger.g0.v1(g60Var4.getContentView());
                    break;
                }
                break;
            case 7:
                g60 g60Var5 = this.b.m;
                if (g60Var5 != null) {
                    org.telegram.messenger.g0.v1(g60Var5.getContentView());
                    break;
                }
                break;
            default:
                g60 g60Var6 = this.b.m;
                if (g60Var6 != null) {
                    org.telegram.messenger.g0.v1(g60Var6.getContentView());
                    break;
                }
                break;
        }
    }
}
