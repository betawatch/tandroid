package ci;

import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.rr;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final class qc {
    public int a;
    public boolean b;
    public uc c;
    public String d;
    public long e;
    public long f;
    public float g;
    public float h;
    public float i;
    public final RectF j = new RectF();
    public final org.telegram.ui.Components.e6 k;
    public final /* synthetic */ wc l;

    public qc(wc wcVar) {
        this.l = wcVar;
        this.k = new org.telegram.ui.Components.e6(wcVar, 360L, rr.h);
    }

    public static void a(qc qcVar, boolean z10) {
        wc wcVar = qcVar.l;
        if (wcVar.getMeasuredWidth() > 0) {
            uc ucVar = qcVar.c;
            if (ucVar == null || z10) {
                if (ucVar != null) {
                    ucVar.b();
                    qcVar.c = null;
                }
                wc wcVar2 = qcVar.l;
                boolean z11 = qcVar.b;
                String str = qcVar.d;
                int i10 = wcVar2.v1;
                int i11 = wcVar2.y1;
                int i12 = (i10 - i11) - i11;
                int dp = AndroidUtilities.dp(38.0f);
                long j3 = qcVar.e;
                qcVar.c = new uc(wcVar2, z11, str, i12, dp, j3 > 2 ? Long.valueOf(j3) : null, wcVar.getMaxScrollDuration(), wcVar.Z0, wcVar.a1, new androidx.fragment.app.a0(qcVar, 29));
            }
        }
    }

    public static void b(qc qcVar) {
        wc wcVar = qcVar.l;
        int i10 = qcVar.a;
        if (i10 >= 0) {
            ArrayList arrayList = wcVar.r;
            if (i10 >= arrayList.size()) {
                return;
            }
            oc ocVar = (oc) arrayList.get(qcVar.a);
            if (wcVar.getMeasuredWidth() <= 0 || ocVar != null) {
                return;
            }
            if (ocVar != null) {
                ocVar.a();
            }
            arrayList.set(qcVar.a, new oc(wcVar, qcVar.d, (wcVar.getMeasuredWidth() - wcVar.getPaddingLeft()) - wcVar.getPaddingRight()));
        }
    }
}
