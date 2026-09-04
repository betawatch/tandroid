package gi;

import org.telegram.ui.Components.yc;
import org.telegram.ui.co;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final /* synthetic */ class p0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ co b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;

    public /* synthetic */ p0(int i10, co coVar, boolean z10) {
        this.d = i10;
        this.b = coVar;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                int i10 = this.d;
                co coVar = this.b;
                if (i10 != 2) {
                    coVar.U9();
                    coVar.Yb();
                }
                u0.f(yc.a0(coVar), i10, this.c);
                break;
            default:
                boolean z10 = this.c;
                this.b.yc(this.d, z10);
                break;
        }
    }

    public /* synthetic */ p0(co coVar, boolean z10, int i10) {
        this.b = coVar;
        this.c = z10;
        this.d = i10;
    }
}
