package e6;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.cast.c0;
import di.p2;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final /* synthetic */ class r {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;

    public /* synthetic */ r(c cVar, int i10) {
        this.a = i10;
        this.b = cVar;
    }

    public final void a(com.google.android.gms.common.api.q qVar) {
        o oVar = (o) qVar;
        switch (this.a) {
            case 0:
                Status i10 = oVar.i();
                int i11 = i10.a;
                c cVar = this.b;
                if (i11 != 0) {
                    g6.b bVar = cVar.a;
                    Log.w(bVar.a, bVar.d("Error fetching queue item ids, statusCode=" + i11 + ", statusMessage=" + i10.b, new Object[0]));
                }
                cVar.l = null;
                if (!cVar.h.isEmpty()) {
                    c0 c0Var = cVar.i;
                    p2 p2Var = cVar.j;
                    c0Var.removeCallbacks(p2Var);
                    c0Var.postDelayed(p2Var, 500L);
                    break;
                }
                break;
            default:
                Status i12 = oVar.i();
                int i13 = i12.a;
                c cVar2 = this.b;
                if (i13 != 0) {
                    g6.b bVar2 = cVar2.a;
                    Log.w(bVar2.a, bVar2.d("Error fetching queue items, statusCode=" + i13 + ", statusMessage=" + i12.b, new Object[0]));
                }
                cVar2.k = null;
                if (!cVar2.h.isEmpty()) {
                    c0 c0Var2 = cVar2.i;
                    p2 p2Var2 = cVar2.j;
                    c0Var2.removeCallbacks(p2Var2);
                    c0Var2.postDelayed(p2Var2, 500L);
                    break;
                }
                break;
        }
    }
}
