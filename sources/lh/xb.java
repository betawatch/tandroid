package lh;

import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.er;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class xb {
    public int a;
    public boolean b;
    public ac c;
    public String d;
    public long e;
    public long f;
    public float g;
    public float h;
    public float i;
    public final RectF j = new RectF();
    public final org.telegram.ui.Components.y5 k;
    public final /* synthetic */ cc l;

    public xb(cc ccVar) {
        this.l = ccVar;
        this.k = new org.telegram.ui.Components.y5(ccVar, 360L, er.h);
    }

    public static void a(xb xbVar, boolean z10) {
        cc ccVar = xbVar.l;
        if (ccVar.getMeasuredWidth() > 0) {
            ac acVar = xbVar.c;
            if (acVar == null || z10) {
                if (acVar != null) {
                    acVar.b();
                    xbVar.c = null;
                }
                cc ccVar2 = xbVar.l;
                boolean z11 = xbVar.b;
                String str = xbVar.d;
                int i10 = ccVar2.r1;
                int i11 = ccVar2.u1;
                int i12 = (i10 - i11) - i11;
                int dp = AndroidUtilities.dp(38.0f);
                long j10 = xbVar.e;
                xbVar.c = new ac(ccVar2, z11, str, i12, dp, j10 > 2 ? Long.valueOf(j10) : null, ccVar.getMaxScrollDuration(), ccVar.V0, ccVar.W0, new kh.c(xbVar, 26));
            }
        }
    }

    public static void b(xb xbVar) {
        cc ccVar = xbVar.l;
        int i10 = xbVar.a;
        if (i10 >= 0) {
            ArrayList arrayList = ccVar.r;
            if (i10 >= arrayList.size()) {
                return;
            }
            vb vbVar = (vb) arrayList.get(xbVar.a);
            if (ccVar.getMeasuredWidth() <= 0 || vbVar != null) {
                return;
            }
            if (vbVar != null) {
                vbVar.a();
            }
            arrayList.set(xbVar.a, new vb(ccVar, xbVar.d, (ccVar.getMeasuredWidth() - ccVar.getPaddingLeft()) - ccVar.getPaddingRight()));
        }
    }
}
