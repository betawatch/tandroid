package fi;

import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
    public final org.telegram.ui.Components.w5 k;
    public final /* synthetic */ fb l;

    public ab(fb fbVar) {
        this.l = fbVar;
        this.k = new org.telegram.ui.Components.w5(fbVar, 360L, xq.h);
    }

    public static void a(ab abVar, boolean z9) {
        fb fbVar = abVar.l;
        if (fbVar.getMeasuredWidth() > 0) {
            db dbVar = abVar.c;
            if (dbVar == null || z9) {
                if (dbVar != null) {
                    dbVar.b();
                    abVar.c = null;
                }
                fb fbVar2 = abVar.l;
                boolean z10 = abVar.b;
                String str = abVar.d;
                int i7 = fbVar2.v1;
                int i10 = fbVar2.y1;
                int i11 = (i7 - i10) - i10;
                int L = org.telegram.messenger.g0.L(38.0f);
                long j3 = abVar.e;
                abVar.c = new db(fbVar2, z10, str, i11, L, j3 > 2 ? Long.valueOf(j3) : null, fbVar.getMaxScrollDuration(), fbVar.Z0, fbVar.a1, new h9(abVar, 6));
            }
        }
    }

    public static void b(ab abVar) {
        fb fbVar = abVar.l;
        int i7 = abVar.a;
        if (i7 >= 0) {
            ArrayList arrayList = fbVar.r;
            if (i7 >= arrayList.size()) {
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
