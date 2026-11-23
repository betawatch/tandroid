package h6;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.cast.y;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final /* synthetic */ class r {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;

    public /* synthetic */ r(c cVar, int i7) {
        this.a = i7;
        this.b = cVar;
    }

    public final void a(com.google.android.gms.common.api.r rVar) {
        n nVar = (n) rVar;
        switch (this.a) {
            case 0:
                Status a10 = nVar.a();
                int i7 = a10.a;
                c cVar = this.b;
                if (i7 != 0) {
                    j6.b bVar = cVar.a;
                    Log.w(bVar.a, bVar.d("Error fetching queue item ids, statusCode=" + i7 + ", statusMessage=" + a10.b, new Object[0]));
                }
                cVar.l = null;
                if (!cVar.h.isEmpty()) {
                    y yVar = cVar.i;
                    s sVar = cVar.j;
                    yVar.removeCallbacks(sVar);
                    yVar.postDelayed(sVar, 500L);
                    break;
                }
                break;
            default:
                Status a11 = nVar.a();
                int i10 = a11.a;
                c cVar2 = this.b;
                if (i10 != 0) {
                    j6.b bVar2 = cVar2.a;
                    Log.w(bVar2.a, bVar2.d("Error fetching queue items, statusCode=" + i10 + ", statusMessage=" + a11.b, new Object[0]));
                }
                cVar2.k = null;
                if (!cVar2.h.isEmpty()) {
                    y yVar2 = cVar2.i;
                    s sVar2 = cVar2.j;
                    yVar2.removeCallbacks(sVar2);
                    yVar2.postDelayed(sVar2, 500L);
                    break;
                }
                break;
        }
    }
}
