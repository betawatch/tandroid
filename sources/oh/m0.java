package oh;

import org.telegram.ui.Components.mc;
import org.telegram.ui.rn;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ rn b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;

    public /* synthetic */ m0(int i10, rn rnVar, boolean z10) {
        this.d = i10;
        this.b = rnVar;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                int i10 = this.d;
                rn rnVar = this.b;
                if (i10 != 2) {
                    rnVar.U9();
                    rnVar.Yb();
                }
                r0.f(mc.a0(rnVar), i10, this.c);
                break;
            default:
                boolean z10 = this.c;
                this.b.yc(this.d, z10);
                break;
        }
    }

    public /* synthetic */ m0(rn rnVar, boolean z10, int i10) {
        this.b = rnVar;
        this.c = z10;
        this.d = i10;
    }
}
