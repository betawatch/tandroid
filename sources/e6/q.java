package e6;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.cast.a0;
import di.n2;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final /* synthetic */ class q {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;

    public /* synthetic */ q(c cVar, int i10) {
        this.a = i10;
        this.b = cVar;
    }

    public final void a(com.google.android.gms.common.api.q qVar) {
        n nVar = (n) qVar;
        switch (this.a) {
            case 0:
                Status h = nVar.h();
                int i10 = h.a;
                c cVar = this.b;
                if (i10 != 0) {
                    g6.b bVar = cVar.a;
                    Log.w(bVar.a, bVar.d("Error fetching queue item ids, statusCode=" + i10 + ", statusMessage=" + h.b, new Object[0]));
                }
                cVar.l = null;
                if (!cVar.h.isEmpty()) {
                    a0 a0Var = cVar.i;
                    n2 n2Var = cVar.j;
                    a0Var.removeCallbacks(n2Var);
                    a0Var.postDelayed(n2Var, 500L);
                    break;
                }
                break;
            default:
                Status h10 = nVar.h();
                int i11 = h10.a;
                c cVar2 = this.b;
                if (i11 != 0) {
                    g6.b bVar2 = cVar2.a;
                    Log.w(bVar2.a, bVar2.d("Error fetching queue items, statusCode=" + i11 + ", statusMessage=" + h10.b, new Object[0]));
                }
                cVar2.k = null;
                if (!cVar2.h.isEmpty()) {
                    a0 a0Var2 = cVar2.i;
                    n2 n2Var2 = cVar2.j;
                    a0Var2.removeCallbacks(n2Var2);
                    a0Var2.postDelayed(n2Var2, 500L);
                    break;
                }
                break;
        }
    }
}
