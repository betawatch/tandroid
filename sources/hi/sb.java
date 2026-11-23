package hi;

import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.ui.Components.kr;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class sb {
    public int a;
    public boolean b;
    public vb c;
    public String d;
    public long e;
    public long f;
    public float g;
    public float h;
    public float i;
    public final RectF j = new RectF();
    public final org.telegram.ui.Components.c6 k;
    public final /* synthetic */ xb l;

    public sb(xb xbVar) {
        this.l = xbVar;
        this.k = new org.telegram.ui.Components.c6(xbVar, 360L, kr.h);
    }

    public static void a(sb sbVar, boolean z10) {
        xb xbVar = sbVar.l;
        if (xbVar.getMeasuredWidth() > 0) {
            vb vbVar = sbVar.c;
            if (vbVar == null || z10) {
                if (vbVar != null) {
                    vbVar.b();
                    sbVar.c = null;
                }
                xb xbVar2 = sbVar.l;
                boolean z11 = sbVar.b;
                String str = sbVar.d;
                int i7 = xbVar2.w1;
                int i10 = xbVar2.z1;
                int i11 = (i7 - i10) - i10;
                int L = org.telegram.messenger.g0.L(38.0f);
                long j3 = sbVar.e;
                sbVar.c = new vb(xbVar2, z11, str, i11, L, j3 > 2 ? Long.valueOf(j3) : null, xbVar.getMaxScrollDuration(), xbVar.a1, xbVar.b1, new w(sbVar, 23));
            }
        }
    }

    public static void b(sb sbVar) {
        xb xbVar = sbVar.l;
        int i7 = sbVar.a;
        if (i7 >= 0) {
            ArrayList arrayList = xbVar.r;
            if (i7 >= arrayList.size()) {
                return;
            }
            qb qbVar = (qb) arrayList.get(sbVar.a);
            if (xbVar.getMeasuredWidth() <= 0 || qbVar != null) {
                return;
            }
            if (qbVar != null) {
                qbVar.a();
            }
            arrayList.set(sbVar.a, new qb(xbVar, sbVar.d, (xbVar.getMeasuredWidth() - xbVar.getPaddingLeft()) - xbVar.getPaddingRight()));
        }
    }
}
