package h6;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.cast.y;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final /* synthetic */ class q {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;

    public /* synthetic */ q(c cVar, int i7) {
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
                    r rVar2 = cVar.j;
                    yVar.removeCallbacks(rVar2);
                    yVar.postDelayed(rVar2, 500L);
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
                    r rVar3 = cVar2.j;
                    yVar2.removeCallbacks(rVar3);
                    yVar2.postDelayed(rVar3, 500L);
                    break;
                }
                break;
        }
    }
}
