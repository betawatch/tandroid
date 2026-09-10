package e6;

import android.util.Log;
import bi.b3;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.cast.c0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
                    b3 b3Var = cVar.j;
                    c0Var.removeCallbacks(b3Var);
                    c0Var.postDelayed(b3Var, 500L);
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
                    b3 b3Var2 = cVar2.j;
                    c0Var2.removeCallbacks(b3Var2);
                    c0Var2.postDelayed(b3Var2, 500L);
                    break;
                }
                break;
        }
    }
}
