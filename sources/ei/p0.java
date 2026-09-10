package ei;

import org.telegram.ui.Components.wc;
import org.telegram.ui.eo;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class p0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ eo b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;

    public /* synthetic */ p0(int i10, eo eoVar, boolean z10) {
        this.d = i10;
        this.b = eoVar;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                int i10 = this.d;
                eo eoVar = this.b;
                if (i10 != 2) {
                    eoVar.U9();
                    eoVar.Yb();
                }
                u0.f(wc.a0(eoVar), i10, this.c);
                break;
            default:
                boolean z10 = this.c;
                this.b.yc(this.d, z10);
                break;
        }
    }

    public /* synthetic */ p0(eo eoVar, boolean z10, int i10) {
        this.b = eoVar;
        this.c = z10;
        this.d = i10;
    }
}
