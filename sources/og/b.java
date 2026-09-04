package og;

import org.telegram.ui.co;
import org.telegram.ui.eg1;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ co b;

    public /* synthetic */ b(co coVar, int i10) {
        this.a = i10;
        this.b = coVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                co coVar = this.b;
                if (coVar.getParentLayout() != null) {
                    eg1.I0(coVar);
                    break;
                }
                break;
            default:
                this.b.Yb();
                break;
        }
    }
}
