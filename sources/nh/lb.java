package nh;

import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.jr;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class lb {
    public int a;
    public boolean b;
    public ob c;
    public String d;
    public long e;
    public long f;
    public float g;
    public float h;
    public float i;
    public final RectF j = new RectF();
    public final org.telegram.ui.Components.d6 k;
    public final /* synthetic */ qb l;

    public lb(qb qbVar) {
        this.l = qbVar;
        this.k = new org.telegram.ui.Components.d6(qbVar, 360L, jr.h);
    }

    public static void a(lb lbVar, boolean z10) {
        qb qbVar = lbVar.l;
        if (qbVar.getMeasuredWidth() > 0) {
            ob obVar = lbVar.c;
            if (obVar == null || z10) {
                if (obVar != null) {
                    obVar.b();
                    lbVar.c = null;
                }
                qb qbVar2 = lbVar.l;
                boolean z11 = lbVar.b;
                String str = lbVar.d;
                int i10 = qbVar2.r1;
                int i11 = qbVar2.u1;
                int i12 = (i10 - i11) - i11;
                int dp = AndroidUtilities.dp(38.0f);
                long j10 = lbVar.e;
                lbVar.c = new ob(qbVar2, z11, str, i12, dp, j10 > 2 ? Long.valueOf(j10) : null, qbVar.getMaxScrollDuration(), qbVar.V0, qbVar.W0, new m6(lbVar, 10));
            }
        }
    }

    public static void b(lb lbVar) {
        qb qbVar = lbVar.l;
        int i10 = lbVar.a;
        if (i10 >= 0) {
            ArrayList arrayList = qbVar.r;
            if (i10 >= arrayList.size()) {
                return;
            }
            jb jbVar = (jb) arrayList.get(lbVar.a);
            if (qbVar.getMeasuredWidth() <= 0 || jbVar != null) {
                return;
            }
            if (jbVar != null) {
                jbVar.a();
            }
            arrayList.set(lbVar.a, new jb(qbVar, lbVar.d, (qbVar.getMeasuredWidth() - qbVar.getPaddingLeft()) - qbVar.getPaddingRight()));
        }
    }
}
