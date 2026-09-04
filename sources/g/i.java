package g;

import android.view.ViewGroup;
import java.util.WeakHashMap;
import r0.i0;
import r0.l0;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class i implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s b;

    public /* synthetic */ i(s sVar, int i10) {
        this.a = i10;
        this.b = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        int i10 = this.a;
        s sVar = this.b;
        int i11 = 0;
        switch (i10) {
            case 0:
                if ((sVar.i0 & 1) != 0) {
                    sVar.j(0);
                }
                if ((sVar.i0 & 4096) != 0) {
                    sVar.j(108);
                }
                sVar.h0 = false;
                sVar.i0 = 0;
                break;
            default:
                sVar.E.showAtLocation(sVar.y, 55, 0, 0);
                l0 l0Var = sVar.G;
                if (l0Var != null) {
                    l0Var.b();
                }
                if (sVar.I && (viewGroup = sVar.J) != null) {
                    WeakHashMap weakHashMap = i0.a;
                    if (viewGroup.isLaidOut()) {
                        sVar.y.setAlpha(0.0f);
                        l0 a2 = i0.a(sVar.y);
                        a2.a(1.0f);
                        sVar.G = a2;
                        a2.d(new j(this, i11));
                        break;
                    }
                }
                sVar.y.setAlpha(1.0f);
                sVar.y.setVisibility(0);
                break;
        }
    }
}
