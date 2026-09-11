package di;

import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pr;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public final class uc {
    public int a;
    public boolean b;
    public xc c;
    public String d;
    public long e;
    public long f;
    public float g;
    public float h;
    public float i;
    public final RectF j = new RectF();
    public final org.telegram.ui.Components.e6 k;
    public final /* synthetic */ zc l;

    public uc(zc zcVar) {
        this.l = zcVar;
        this.k = new org.telegram.ui.Components.e6(zcVar, 360L, pr.h);
    }

    public static void a(uc ucVar, boolean z10) {
        zc zcVar = ucVar.l;
        if (zcVar.getMeasuredWidth() > 0) {
            xc xcVar = ucVar.c;
            if (xcVar == null || z10) {
                if (xcVar != null) {
                    xcVar.b();
                    ucVar.c = null;
                }
                zc zcVar2 = ucVar.l;
                boolean z11 = ucVar.b;
                String str = ucVar.d;
                int i10 = zcVar2.v1;
                int i11 = zcVar2.y1;
                int i12 = (i10 - i11) - i11;
                int dp = AndroidUtilities.dp(38.0f);
                long j3 = ucVar.e;
                ucVar.c = new xc(zcVar2, z11, str, i12, dp, j3 > 2 ? Long.valueOf(j3) : null, zcVar.getMaxScrollDuration(), zcVar.Z0, zcVar.a1, new nb(ucVar, 5));
            }
        }
    }

    public static void b(uc ucVar) {
        zc zcVar = ucVar.l;
        int i10 = ucVar.a;
        if (i10 >= 0) {
            ArrayList arrayList = zcVar.r;
            if (i10 >= arrayList.size()) {
                return;
            }
            sc scVar = (sc) arrayList.get(ucVar.a);
            if (zcVar.getMeasuredWidth() <= 0 || scVar != null) {
                return;
            }
            if (scVar != null) {
                scVar.a();
            }
            arrayList.set(ucVar.a, new sc(zcVar, ucVar.d, (zcVar.getMeasuredWidth() - zcVar.getPaddingLeft()) - zcVar.getPaddingRight()));
        }
    }
}
