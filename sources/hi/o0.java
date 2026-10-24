package hi;

import org.telegram.ui.Components.xc;
import org.telegram.ui.sn;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final /* synthetic */ class o0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ sn b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;

    public /* synthetic */ o0(int i10, sn snVar, boolean z10) {
        this.d = i10;
        this.b = snVar;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                int i10 = this.d;
                sn snVar = this.b;
                if (i10 != 2) {
                    snVar.Z9();
                    snVar.ec();
                }
                t0.f(xc.a0(snVar), i10, this.c);
                break;
            default:
                boolean z10 = this.c;
                this.b.Fc(this.d, z10);
                break;
        }
    }

    public /* synthetic */ o0(sn snVar, boolean z10, int i10) {
        this.b = snVar;
        this.c = z10;
        this.d = i10;
    }
}
