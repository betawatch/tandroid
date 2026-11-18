package hi;

import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.ui.Components.lr;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class ya {
    public int a;
    public boolean b;
    public bb c;
    public String d;
    public long e;
    public long f;
    public float g;
    public float h;
    public float i;
    public final RectF j = new RectF();
    public final org.telegram.ui.Components.c6 k;
    public final /* synthetic */ db l;

    public ya(db dbVar) {
        this.l = dbVar;
        this.k = new org.telegram.ui.Components.c6(dbVar, 360L, lr.h);
    }

    public static void a(ya yaVar, boolean z10) {
        db dbVar = yaVar.l;
        if (dbVar.getMeasuredWidth() > 0) {
            bb bbVar = yaVar.c;
            if (bbVar == null || z10) {
                if (bbVar != null) {
                    bbVar.b();
                    yaVar.c = null;
                }
                db dbVar2 = yaVar.l;
                boolean z11 = yaVar.b;
                String str = yaVar.d;
                int i7 = dbVar2.w1;
                int i10 = dbVar2.z1;
                int i11 = (i7 - i10) - i10;
                int L = org.telegram.messenger.g0.L(38.0f);
                long j3 = yaVar.e;
                yaVar.c = new bb(dbVar2, z11, str, i11, L, j3 > 2 ? Long.valueOf(j3) : null, dbVar.getMaxScrollDuration(), dbVar.a1, dbVar.b1, new k(yaVar, 23));
            }
        }
    }

    public static void b(ya yaVar) {
        db dbVar = yaVar.l;
        int i7 = yaVar.a;
        if (i7 >= 0) {
            ArrayList arrayList = dbVar.r;
            if (i7 >= arrayList.size()) {
                return;
            }
            wa waVar = (wa) arrayList.get(yaVar.a);
            if (dbVar.getMeasuredWidth() <= 0 || waVar != null) {
                return;
            }
            if (waVar != null) {
                waVar.a();
            }
            arrayList.set(yaVar.a, new wa(dbVar, yaVar.d, (dbVar.getMeasuredWidth() - dbVar.getPaddingLeft()) - dbVar.getPaddingRight()));
        }
    }
}
