package li;

import org.telegram.ui.Components.kc;
import org.telegram.ui.bn;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class f0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ bn b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;

    public /* synthetic */ f0(int i7, bn bnVar, boolean z10) {
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
                k0.f(kc.b0(bnVar), i7, this.c);
                break;
            default:
                boolean z10 = this.c;
                this.b.gd(this.d, z10);
                break;
        }
    }

    public /* synthetic */ f0(bn bnVar, boolean z10, int i7) {
        this.b = bnVar;
        this.c = z10;
        this.d = i7;
    }
}
