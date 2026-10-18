package e6;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.cast.a0;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
                    r rVar = cVar.j;
                    a0Var.removeCallbacks(rVar);
                    a0Var.postDelayed(rVar, 500L);
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
                    r rVar2 = cVar2.j;
                    a0Var2.removeCallbacks(rVar2);
                    a0Var2.postDelayed(rVar2, 500L);
                    break;
                }
                break;
        }
    }
}
