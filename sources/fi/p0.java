package fi;

import org.telegram.ui.Components.yc;
import org.telegram.ui.wn;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ wn b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;

    public /* synthetic */ p0(int i10, wn wnVar, boolean z10) {
        this.d = i10;
        this.b = wnVar;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                int i10 = this.d;
                wn wnVar = this.b;
                if (i10 != 2) {
                    wnVar.U9();
                    wnVar.Yb();
                }
                u0.f(yc.a0(wnVar), i10, this.c);
                break;
            default:
                boolean z10 = this.c;
                this.b.yc(this.d, z10);
                break;
        }
    }

    public /* synthetic */ p0(wn wnVar, boolean z10, int i10) {
        this.b = wnVar;
        this.c = z10;
        this.d = i10;
    }
}
