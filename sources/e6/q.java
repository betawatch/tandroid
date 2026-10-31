package e6;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.cast.z;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class q {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;

    public /* synthetic */ q(c cVar, int i10) {
        this.a = i10;
        this.b = cVar;
    }

    public final void a(com.google.android.gms.common.api.q qVar) {
        m mVar = (m) qVar;
        switch (this.a) {
            case 0:
                Status a2 = mVar.a();
                int i10 = a2.a;
                c cVar = this.b;
                if (i10 != 0) {
                    g6.b bVar = cVar.a;
                    Log.w(bVar.a, bVar.d("Error fetching queue item ids, statusCode=" + i10 + ", statusMessage=" + a2.b, new Object[0]));
                }
                cVar.l = null;
                if (!cVar.h.isEmpty()) {
                    z zVar = cVar.i;
                    r rVar = cVar.j;
                    zVar.removeCallbacks(rVar);
                    zVar.postDelayed(rVar, 500L);
                    break;
                }
                break;
            default:
                Status a10 = mVar.a();
                int i11 = a10.a;
                c cVar2 = this.b;
                if (i11 != 0) {
                    g6.b bVar2 = cVar2.a;
                    Log.w(bVar2.a, bVar2.d("Error fetching queue items, statusCode=" + i11 + ", statusMessage=" + a10.b, new Object[0]));
                }
                cVar2.k = null;
                if (!cVar2.h.isEmpty()) {
                    z zVar2 = cVar2.i;
                    r rVar2 = cVar2.j;
                    zVar2.removeCallbacks(rVar2);
                    zVar2.postDelayed(rVar2, 500L);
                    break;
                }
                break;
        }
    }
}
