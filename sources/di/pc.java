package di;

import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.es;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class pc {
    public int a;
    public boolean b;
    public sc c;
    public String d;
    public long e;
    public long f;
    public float g;
    public float h;
    public float i;
    public final RectF j = new RectF();
    public final org.telegram.ui.Components.g6 k;
    public final /* synthetic */ uc l;

    public pc(uc ucVar) {
        this.l = ucVar;
        this.k = new org.telegram.ui.Components.g6(ucVar, 360L, es.h);
    }

    public static void a(pc pcVar, boolean z10) {
        uc ucVar = pcVar.l;
        if (ucVar.getMeasuredWidth() > 0) {
            sc scVar = pcVar.c;
            if (scVar == null || z10) {
                if (scVar != null) {
                    scVar.b();
                    pcVar.c = null;
                }
                uc ucVar2 = pcVar.l;
                boolean z11 = pcVar.b;
                String str = pcVar.d;
                int i10 = ucVar2.v1;
                int i11 = ucVar2.y1;
                int i12 = (i10 - i11) - i11;
                int dp = AndroidUtilities.dp(38.0f);
                long j10 = pcVar.e;
                pcVar.c = new sc(ucVar2, z11, str, i12, dp, j10 > 2 ? Long.valueOf(j10) : null, ucVar.getMaxScrollDuration(), ucVar.Z0, ucVar.a1, new x8(pcVar, 8));
            }
        }
    }

    public static void b(pc pcVar) {
        uc ucVar = pcVar.l;
        int i10 = pcVar.a;
        if (i10 >= 0) {
            ArrayList arrayList = ucVar.r;
            if (i10 >= arrayList.size()) {
                return;
            }
            nc ncVar = (nc) arrayList.get(pcVar.a);
            if (ucVar.getMeasuredWidth() <= 0 || ncVar != null) {
                return;
            }
            if (ncVar != null) {
                ncVar.a();
            }
            arrayList.set(pcVar.a, new nc(ucVar, pcVar.d, (ucVar.getMeasuredWidth() - ucVar.getPaddingLeft()) - ucVar.getPaddingRight()));
        }
    }
}
