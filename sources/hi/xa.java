package hi;

import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.ui.Components.nr;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final class xa {
    public int a;
    public boolean b;
    public ab c;
    public String d;
    public long e;
    public long f;
    public float g;
    public float h;
    public float i;
    public final RectF j = new RectF();
    public final org.telegram.ui.Components.d6 k;
    public final /* synthetic */ cb l;

    public xa(cb cbVar) {
        this.l = cbVar;
        this.k = new org.telegram.ui.Components.d6(cbVar, 360L, nr.h);
    }

    public static void a(xa xaVar, boolean z10) {
        cb cbVar = xaVar.l;
        if (cbVar.getMeasuredWidth() > 0) {
            ab abVar = xaVar.c;
            if (abVar == null || z10) {
                if (abVar != null) {
                    abVar.b();
                    xaVar.c = null;
                }
                cb cbVar2 = xaVar.l;
                boolean z11 = xaVar.b;
                String str = xaVar.d;
                int i7 = cbVar2.w1;
                int i10 = cbVar2.z1;
                int i11 = (i7 - i10) - i10;
                int L = org.telegram.messenger.g0.L(38.0f);
                long j3 = xaVar.e;
                xaVar.c = new ab(cbVar2, z11, str, i11, L, j3 > 2 ? Long.valueOf(j3) : null, cbVar.getMaxScrollDuration(), cbVar.a1, cbVar.b1, new l(xaVar, 23));
            }
        }
    }

    public static void b(xa xaVar) {
        cb cbVar = xaVar.l;
        int i7 = xaVar.a;
        if (i7 >= 0) {
            ArrayList arrayList = cbVar.r;
            if (i7 >= arrayList.size()) {
                return;
            }
            va vaVar = (va) arrayList.get(xaVar.a);
            if (cbVar.getMeasuredWidth() <= 0 || vaVar != null) {
                return;
            }
            if (vaVar != null) {
                vaVar.a();
            }
            arrayList.set(xaVar.a, new va(cbVar, xaVar.d, (cbVar.getMeasuredWidth() - cbVar.getPaddingLeft()) - cbVar.getPaddingRight()));
        }
    }
}
