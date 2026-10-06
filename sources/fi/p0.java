package fi;

import org.telegram.ui.Components.yc;
import org.telegram.ui.yn;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
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
