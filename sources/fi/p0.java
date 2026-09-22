package fi;

import org.telegram.ui.Components.xc;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final /* synthetic */ class p0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ zn b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;

    public /* synthetic */ p0(int i10, zn znVar, boolean z10) {
        this.d = i10;
        this.b = znVar;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                int i10 = this.d;
                zn znVar = this.b;
                if (i10 != 2) {
                    znVar.U9();
                    znVar.Yb();
                }
                u0.f(xc.a0(znVar), i10, this.c);
                break;
            default:
                boolean z10 = this.c;
                this.b.yc(this.d, z10);
                break;
        }
    }

    public /* synthetic */ p0(zn znVar, boolean z10, int i10) {
        this.b = znVar;
        this.c = z10;
        this.d = i10;
    }
}
