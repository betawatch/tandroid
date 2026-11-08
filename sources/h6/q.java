package h6;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.cast.y;
import fi.h2;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final /* synthetic */ class q {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;

    public /* synthetic */ q(c cVar, int i7) {
        this.a = i7;
        this.b = cVar;
    }

    public final void a(com.google.android.gms.common.api.q qVar) {
        n nVar = (n) qVar;
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
                    h2 h2Var = cVar.j;
                    yVar.removeCallbacks(h2Var);
                    yVar.postDelayed(h2Var, 500L);
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
                    h2 h2Var2 = cVar2.j;
                    yVar2.removeCallbacks(h2Var2);
                    yVar2.postDelayed(h2Var2, 500L);
                    break;
                }
                break;
        }
    }
}
