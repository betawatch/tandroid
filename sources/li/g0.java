package li;

import org.telegram.ui.Components.lc;
import org.telegram.ui.bn;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class g0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ bn b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;

    public /* synthetic */ g0(int i7, bn bnVar, boolean z10) {
        this.d = i7;
        this.b = bnVar;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                int i7 = this.d;
                bn bnVar = this.b;
                if (i7 != 2) {
                    bnVar.xa();
                    bnVar.Fc();
                }
                l0.f(lc.b0(bnVar), i7, this.c);
                break;
            default:
                boolean z10 = this.c;
                this.b.gd(this.d, z10);
                break;
        }
    }

    public /* synthetic */ g0(bn bnVar, boolean z10, int i7) {
        this.b = bnVar;
        this.c = z10;
        this.d = i7;
    }
}
