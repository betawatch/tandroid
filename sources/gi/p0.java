package gi;

import org.telegram.ui.Components.zc;
import org.telegram.ui.fo;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class p0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ fo b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;

    public /* synthetic */ p0(int i10, fo foVar, boolean z10) {
        this.d = i10;
        this.b = foVar;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                int i10 = this.d;
                fo foVar = this.b;
                if (i10 != 2) {
                    foVar.Z9();
                    foVar.cc();
                }
                u0.f(zc.a0(foVar), i10, this.c);
                break;
            default:
                boolean z10 = this.c;
                this.b.Cc(this.d, z10);
                break;
        }
    }

    public /* synthetic */ p0(fo foVar, boolean z10, int i10) {
        this.b = foVar;
        this.c = z10;
        this.d = i10;
    }
}
