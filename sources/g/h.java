package g;

import android.view.ViewGroup;
import java.util.WeakHashMap;
import r0.j0;
import r0.m0;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r b;

    public /* synthetic */ h(r rVar, int i10) {
        this.a = i10;
        this.b = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        int i10 = this.a;
        r rVar = this.b;
        int i11 = 0;
        switch (i10) {
            case 0:
                if ((rVar.i0 & 1) != 0) {
                    rVar.j(0);
                }
                if ((rVar.i0 & 4096) != 0) {
                    rVar.j(108);
                }
                rVar.h0 = false;
                rVar.i0 = 0;
                break;
            default:
                rVar.E.showAtLocation(rVar.y, 55, 0, 0);
                m0 m0Var = rVar.G;
                if (m0Var != null) {
                    m0Var.b();
                }
                if (rVar.I && (viewGroup = rVar.J) != null) {
                    WeakHashMap weakHashMap = j0.a;
                    if (viewGroup.isLaidOut()) {
                        rVar.y.setAlpha(0.0f);
                        m0 a2 = j0.a(rVar.y);
                        a2.a(1.0f);
                        rVar.G = a2;
                        a2.d(new i(this, i11));
                        break;
                    }
                }
                rVar.y.setAlpha(1.0f);
                rVar.y.setVisibility(0);
                break;
        }
    }
}
