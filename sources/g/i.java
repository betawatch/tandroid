package g;

import android.view.ViewGroup;
import java.util.WeakHashMap;
import r0.j0;
import r0.m0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class i implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r b;

    public /* synthetic */ i(r rVar, int i10) {
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
                if ((rVar.e0 & 1) != 0) {
                    rVar.j(0);
                }
                if ((rVar.e0 & 4096) != 0) {
                    rVar.j(108);
                }
                rVar.d0 = false;
                rVar.e0 = 0;
                break;
            default:
                rVar.A.showAtLocation(rVar.y, 55, 0, 0);
                m0 m0Var = rVar.C;
                if (m0Var != null) {
                    m0Var.b();
                }
                if (rVar.E && (viewGroup = rVar.F) != null) {
                    WeakHashMap weakHashMap = j0.a;
                    if (viewGroup.isLaidOut()) {
                        rVar.y.setAlpha(0.0f);
                        m0 a2 = j0.a(rVar.y);
                        a2.a(1.0f);
                        rVar.C = a2;
                        a2.d(new j(this, i11));
                        break;
                    }
                }
                rVar.y.setAlpha(1.0f);
                rVar.y.setVisibility(0);
                break;
        }
    }
}
