package g;

import android.view.ViewGroup;
import java.util.WeakHashMap;
import r0.j0;
import r0.m0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q b;

    public /* synthetic */ h(q qVar, int i9) {
        this.a = i9;
        this.b = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        int i9 = this.a;
        q qVar = this.b;
        int i10 = 0;
        switch (i9) {
            case 0:
                if ((qVar.e0 & 1) != 0) {
                    qVar.j(0);
                }
                if ((qVar.e0 & 4096) != 0) {
                    qVar.j(108);
                }
                qVar.d0 = false;
                qVar.e0 = 0;
                break;
            default:
                qVar.A.showAtLocation(qVar.y, 55, 0, 0);
                m0 m0Var = qVar.C;
                if (m0Var != null) {
                    m0Var.b();
                }
                if (qVar.E && (viewGroup = qVar.F) != null) {
                    WeakHashMap weakHashMap = j0.a;
                    if (viewGroup.isLaidOut()) {
                        qVar.y.setAlpha(0.0f);
                        m0 a2 = j0.a(qVar.y);
                        a2.a(1.0f);
                        qVar.C = a2;
                        a2.d(new i(this, i10));
                        break;
                    }
                }
                qVar.y.setAlpha(1.0f);
                qVar.y.setVisibility(0);
                break;
        }
    }
}
