package fi;

import org.telegram.ui.Components.xc;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final /* synthetic */ class p0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ xn b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;

    public /* synthetic */ p0(int i10, xn xnVar, boolean z10) {
        this.d = i10;
        this.b = xnVar;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                int i10 = this.d;
                xn xnVar = this.b;
                if (i10 != 2) {
                    xnVar.U9();
                    xnVar.Yb();
                }
                u0.f(xc.a0(xnVar), i10, this.c);
                break;
            default:
                boolean z10 = this.c;
                this.b.yc(this.d, z10);
                break;
        }
    }

    public /* synthetic */ p0(xn xnVar, boolean z10, int i10) {
        this.b = xnVar;
        this.c = z10;
        this.d = i10;
    }
}
