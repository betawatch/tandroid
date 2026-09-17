package gi;

import org.telegram.ui.Components.yc;
import org.telegram.ui.co;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
