package f6;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.cast.y;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
                    h6.b bVar = cVar.a;
                    Log.w(bVar.a, bVar.d("Error fetching queue item ids, statusCode=" + i10 + ", statusMessage=" + h.b, new Object[0]));
                }
                cVar.l = null;
                if (!cVar.h.isEmpty()) {
                    y yVar = cVar.i;
                    r rVar = cVar.j;
                    yVar.removeCallbacks(rVar);
                    yVar.postDelayed(rVar, 500L);
                    break;
                }
                break;
            default:
                Status h10 = nVar.h();
                int i11 = h10.a;
                c cVar2 = this.b;
                if (i11 != 0) {
                    h6.b bVar2 = cVar2.a;
                    Log.w(bVar2.a, bVar2.d("Error fetching queue items, statusCode=" + i11 + ", statusMessage=" + h10.b, new Object[0]));
                }
                cVar2.k = null;
                if (!cVar2.h.isEmpty()) {
                    y yVar2 = cVar2.i;
                    r rVar2 = cVar2.j;
                    yVar2.removeCallbacks(rVar2);
                    yVar2.postDelayed(rVar2, 500L);
                    break;
                }
                break;
        }
    }
}
