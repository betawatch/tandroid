package kh;

import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class bc {
    public int a;
    public boolean b;
    public ec c;
    public String d;
    public long e;
    public long f;
    public float g;
    public float h;
    public float i;
    public final RectF j = new RectF();
    public final org.telegram.ui.Components.y5 k;
    public final /* synthetic */ gc l;

    public bc(gc gcVar) {
        this.l = gcVar;
        this.k = new org.telegram.ui.Components.y5(gcVar, 360L, gr.h);
    }

    public static void a(bc bcVar, boolean z10) {
        gc gcVar = bcVar.l;
        if (gcVar.getMeasuredWidth() > 0) {
            ec ecVar = bcVar.c;
            if (ecVar == null || z10) {
                if (ecVar != null) {
                    ecVar.b();
                    bcVar.c = null;
                }
                gc gcVar2 = bcVar.l;
                boolean z11 = bcVar.b;
                String str = bcVar.d;
                int i9 = gcVar2.r1;
                int i10 = gcVar2.u1;
                int i11 = (i9 - i10) - i10;
                int dp = AndroidUtilities.dp(38.0f);
                long j10 = bcVar.e;
                bcVar.c = new ec(gcVar2, z11, str, i11, dp, j10 > 2 ? Long.valueOf(j10) : null, gcVar.getMaxScrollDuration(), gcVar.V0, gcVar.W0, new f1(bcVar, 19));
            }
        }
    }

    public static void b(bc bcVar) {
        gc gcVar = bcVar.l;
        int i9 = bcVar.a;
        if (i9 >= 0) {
            ArrayList arrayList = gcVar.r;
            if (i9 >= arrayList.size()) {
                return;
            }
            zb zbVar = (zb) arrayList.get(bcVar.a);
            if (gcVar.getMeasuredWidth() <= 0 || zbVar != null) {
                return;
            }
            if (zbVar != null) {
                zbVar.a();
            }
            arrayList.set(bcVar.a, new zb(gcVar, bcVar.d, (gcVar.getMeasuredWidth() - gcVar.getPaddingLeft()) - gcVar.getPaddingRight()));
        }
    }
}
