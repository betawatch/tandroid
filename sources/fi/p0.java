package fi;

import org.telegram.ui.Components.yc;
import org.telegram.ui.yn;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ yn b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;

    public /* synthetic */ p0(int i10, yn ynVar, boolean z10) {
        this.d = i10;
        this.b = ynVar;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                int i10 = this.d;
                yn ynVar = this.b;
                if (i10 != 2) {
                    ynVar.T9();
                    ynVar.Xb();
                }
                u0.f(yc.a0(ynVar), i10, this.c);
                break;
            default:
                boolean z10 = this.c;
                this.b.xc(this.d, z10);
                break;
        }
    }

    public /* synthetic */ p0(yn ynVar, boolean z10, int i10) {
        this.b = ynVar;
        this.c = z10;
        this.d = i10;
    }
}
