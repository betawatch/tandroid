package ei;

import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bs;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class ac {
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
    public final org.telegram.ui.Components.f6 k;
    public final /* synthetic */ gc l;

    public ac(gc gcVar) {
        this.l = gcVar;
        this.k = new org.telegram.ui.Components.f6(gcVar, 360L, bs.h);
    }

    public static void a(ac acVar, boolean z10) {
        gc gcVar = acVar.l;
        if (gcVar.getMeasuredWidth() > 0) {
            ec ecVar = acVar.c;
            if (ecVar == null || z10) {
                if (ecVar != null) {
                    ecVar.b();
                    acVar.c = null;
                }
                gc gcVar2 = acVar.l;
                boolean z11 = acVar.b;
                String str = acVar.d;
                int i10 = gcVar2.v1;
                int i11 = gcVar2.y1;
                int i12 = (i10 - i11) - i11;
                int dp = AndroidUtilities.dp(38.0f);
                long j10 = acVar.e;
                acVar.c = new ec(gcVar2, z11, str, i12, dp, j10 > 2 ? Long.valueOf(j10) : null, gcVar.getMaxScrollDuration(), gcVar.Z0, gcVar.a1, new com.google.firebase.messaging.s(acVar, 29));
            }
        }
    }

    public static void b(ac acVar) {
        gc gcVar = acVar.l;
        int i10 = acVar.a;
        if (i10 >= 0) {
            ArrayList arrayList = gcVar.r;
            if (i10 >= arrayList.size()) {
                return;
            }
            yb ybVar = (yb) arrayList.get(acVar.a);
            if (gcVar.getMeasuredWidth() <= 0 || ybVar != null) {
                return;
            }
            if (ybVar != null) {
                ybVar.a();
            }
            arrayList.set(acVar.a, new yb(gcVar, acVar.d, (gcVar.getMeasuredWidth() - gcVar.getPaddingLeft()) - gcVar.getPaddingRight()));
        }
    }
}
