package gi;

import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ab {
    public int a;
    public boolean b;
    public db c;
    public String d;
    public long e;
    public long f;
    public float g;
    public float h;
    public float i;
    public final RectF j = new RectF();
    public final org.telegram.ui.Components.u5 k;
    public final /* synthetic */ fb l;

    public ab(fb fbVar) {
        this.l = fbVar;
        this.k = new org.telegram.ui.Components.u5(fbVar, 360L, xq.h);
    }

    public static void a(ab abVar, boolean z10) {
        fb fbVar = abVar.l;
        if (fbVar.getMeasuredWidth() > 0) {
            db dbVar = abVar.c;
            if (dbVar == null || z10) {
                if (dbVar != null) {
                    dbVar.b();
                    abVar.c = null;
                }
                fb fbVar2 = abVar.l;
                boolean z11 = abVar.b;
                String str = abVar.d;
                int i3 = fbVar2.w1;
                int i10 = fbVar2.z1;
                int i11 = (i3 - i10) - i10;
                int L = org.telegram.messenger.g0.L(38.0f);
                long j10 = abVar.e;
                abVar.c = new db(fbVar2, z11, str, i11, L, j10 > 2 ? Long.valueOf(j10) : null, fbVar.getMaxScrollDuration(), fbVar.a1, fbVar.b1, new f6(abVar, 10));
            }
        }
    }

    public static void b(ab abVar) {
        fb fbVar = abVar.l;
        int i3 = abVar.a;
        if (i3 >= 0) {
            ArrayList arrayList = fbVar.r;
            if (i3 >= arrayList.size()) {
                return;
            }
            ya yaVar = (ya) arrayList.get(abVar.a);
            if (fbVar.getMeasuredWidth() <= 0 || yaVar != null) {
                return;
            }
            if (yaVar != null) {
                yaVar.a();
            }
            arrayList.set(abVar.a, new ya(fbVar, abVar.d, (fbVar.getMeasuredWidth() - fbVar.getPaddingLeft()) - fbVar.getPaddingRight()));
        }
    }
}
