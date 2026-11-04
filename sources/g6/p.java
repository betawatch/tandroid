package g6;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.cast.z;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class p {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;

    public /* synthetic */ p(c cVar, int i3) {
        this.a = i3;
        this.b = cVar;
    }

    public final void a(com.google.android.gms.common.api.q qVar) {
        m mVar = (m) qVar;
        switch (this.a) {
            case 0:
                Status a10 = mVar.a();
                int i3 = a10.a;
                c cVar = this.b;
                if (i3 != 0) {
                    i6.b bVar = cVar.a;
                    Log.w(bVar.a, bVar.d("Error fetching queue item ids, statusCode=" + i3 + ", statusMessage=" + a10.b, new Object[0]));
                }
                cVar.l = null;
                if (!cVar.h.isEmpty()) {
                    z zVar = cVar.i;
                    q qVar2 = cVar.j;
                    zVar.removeCallbacks(qVar2);
                    zVar.postDelayed(qVar2, 500L);
                    break;
                }
                break;
            default:
                Status a11 = mVar.a();
                int i10 = a11.a;
                c cVar2 = this.b;
                if (i10 != 0) {
                    i6.b bVar2 = cVar2.a;
                    Log.w(bVar2.a, bVar2.d("Error fetching queue items, statusCode=" + i10 + ", statusMessage=" + a11.b, new Object[0]));
                }
                cVar2.k = null;
                if (!cVar2.h.isEmpty()) {
                    z zVar2 = cVar2.i;
                    q qVar3 = cVar2.j;
                    zVar2.removeCallbacks(qVar3);
                    zVar2.postDelayed(qVar3, 500L);
                    break;
                }
                break;
        }
    }
}
