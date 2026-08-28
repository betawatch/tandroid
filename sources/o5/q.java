package o5;

import android.util.Log;
import c2.u0;
import com.google.android.gms.common.api.Status;
import kh.j2;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class q {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;

    public /* synthetic */ q(c cVar, int i9) {
        this.a = i9;
        this.b = cVar;
    }

    public final void a(com.google.android.gms.common.api.q qVar) {
        m mVar = (m) qVar;
        switch (this.a) {
            case 0:
                Status i9 = mVar.i();
                int i10 = i9.a;
                c cVar = this.b;
                if (i10 != 0) {
                    q5.b bVar = cVar.a;
                    Log.w(bVar.a, bVar.d("Error fetching queue item ids, statusCode=" + i10 + ", statusMessage=" + i9.b, new Object[0]));
                }
                cVar.l = null;
                if (!cVar.h.isEmpty()) {
                    u0 u0Var = cVar.i;
                    j2 j2Var = cVar.j;
                    u0Var.removeCallbacks(j2Var);
                    u0Var.postDelayed(j2Var, 500L);
                    break;
                }
                break;
            default:
                Status i11 = mVar.i();
                int i12 = i11.a;
                c cVar2 = this.b;
                if (i12 != 0) {
                    q5.b bVar2 = cVar2.a;
                    Log.w(bVar2.a, bVar2.d("Error fetching queue items, statusCode=" + i12 + ", statusMessage=" + i11.b, new Object[0]));
                }
                cVar2.k = null;
                if (!cVar2.h.isEmpty()) {
                    u0 u0Var2 = cVar2.i;
                    j2 j2Var2 = cVar2.j;
                    u0Var2.removeCallbacks(j2Var2);
                    u0Var2.postDelayed(j2Var2, 500L);
                    break;
                }
                break;
        }
    }
}
