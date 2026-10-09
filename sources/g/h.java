package g;

import android.view.ViewGroup;
import java.util.WeakHashMap;
import r0.i0;
import r0.l0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
                l0 l0Var = rVar.G;
                if (l0Var != null) {
                    l0Var.b();
                }
                if (rVar.I && (viewGroup = rVar.J) != null) {
                    WeakHashMap weakHashMap = i0.a;
                    if (viewGroup.isLaidOut()) {
                        rVar.y.setAlpha(0.0f);
                        l0 a2 = i0.a(rVar.y);
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
