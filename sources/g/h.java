package g;

import android.view.ViewGroup;
import java.util.WeakHashMap;
import r0.j0;
import r0.m0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q b;

    public /* synthetic */ h(q qVar, int i10) {
        this.a = i10;
        this.b = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        int i10 = this.a;
        q qVar = this.b;
        int i11 = 0;
        switch (i10) {
            case 0:
                if ((qVar.f0 & 1) != 0) {
                    qVar.k(0);
                }
                if ((qVar.f0 & 4096) != 0) {
                    qVar.k(108);
                }
                qVar.e0 = false;
                qVar.f0 = 0;
                break;
            default:
                qVar.B.showAtLocation(qVar.y, 55, 0, 0);
                m0 m0Var = qVar.D;
                if (m0Var != null) {
                    m0Var.b();
                }
                if (qVar.F && (viewGroup = qVar.G) != null) {
                    WeakHashMap weakHashMap = j0.a;
                    if (viewGroup.isLaidOut()) {
                        qVar.y.setAlpha(0.0f);
                        m0 a2 = j0.a(qVar.y);
                        a2.a(1.0f);
                        qVar.D = a2;
                        a2.d(new i(this, i11));
                        break;
                    }
                }
                qVar.y.setAlpha(1.0f);
                qVar.y.setVisibility(0);
                break;
        }
    }
}
