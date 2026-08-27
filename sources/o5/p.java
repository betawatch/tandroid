package o5;

import android.util.Log;
import c2.t0;
import com.google.android.gms.common.api.Status;
import lh.h2;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class p {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;

    public /* synthetic */ p(c cVar, int i10) {
        this.a = i10;
        this.b = cVar;
    }

    public final void a(com.google.android.gms.common.api.q qVar) {
        m mVar = (m) qVar;
        switch (this.a) {
            case 0:
                Status i10 = mVar.i();
                int i11 = i10.a;
                c cVar = this.b;
                if (i11 != 0) {
                    r5.b bVar = cVar.a;
                    Log.w(bVar.a, bVar.d("Error fetching queue item ids, statusCode=" + i11 + ", statusMessage=" + i10.b, new Object[0]));
                }
                cVar.l = null;
                if (!cVar.h.isEmpty()) {
                    t0 t0Var = cVar.i;
                    h2 h2Var = cVar.j;
                    t0Var.removeCallbacks(h2Var);
                    t0Var.postDelayed(h2Var, 500L);
                    break;
                }
                break;
            default:
                Status i12 = mVar.i();
                int i13 = i12.a;
                c cVar2 = this.b;
                if (i13 != 0) {
                    r5.b bVar2 = cVar2.a;
                    Log.w(bVar2.a, bVar2.d("Error fetching queue items, statusCode=" + i13 + ", statusMessage=" + i12.b, new Object[0]));
                }
                cVar2.k = null;
                if (!cVar2.h.isEmpty()) {
                    t0 t0Var2 = cVar2.i;
                    h2 h2Var2 = cVar2.j;
                    t0Var2.removeCallbacks(h2Var2);
                    t0Var2.postDelayed(h2Var2, 500L);
                    break;
                }
                break;
        }
    }
}
