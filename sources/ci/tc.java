package ci;

import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.qr;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes4.dex */
public final class tc {
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
    public final org.telegram.ui.Components.d6 k;
    public final /* synthetic */ zc l;

    public tc(zc zcVar) {
        this.l = zcVar;
        this.k = new org.telegram.ui.Components.d6(zcVar, 360L, qr.h);
    }

    public static void a(tc tcVar, boolean z10) {
        zc zcVar = tcVar.l;
        if (zcVar.getMeasuredWidth() > 0) {
            xc xcVar = tcVar.c;
            if (xcVar == null || z10) {
                if (xcVar != null) {
                    xcVar.b();
                    tcVar.c = null;
                }
                zc zcVar2 = tcVar.l;
                boolean z11 = tcVar.b;
                String str = tcVar.d;
                int i10 = zcVar2.v1;
                int i11 = zcVar2.y1;
                int i12 = (i10 - i11) - i11;
                int dp = AndroidUtilities.dp(38.0f);
                long j3 = tcVar.e;
                tcVar.c = new xc(zcVar2, z11, str, i12, dp, j3 > 2 ? Long.valueOf(j3) : null, zcVar.getMaxScrollDuration(), zcVar.Z0, zcVar.a1, new androidx.fragment.app.a0(tcVar, 29));
            }
        }
    }

    public static void b(tc tcVar) {
        zc zcVar = tcVar.l;
        int i10 = tcVar.a;
        if (i10 >= 0) {
            ArrayList arrayList = zcVar.r;
            if (i10 >= arrayList.size()) {
                return;
            }
            rc rcVar = (rc) arrayList.get(tcVar.a);
            if (zcVar.getMeasuredWidth() <= 0 || rcVar != null) {
                return;
            }
            if (rcVar != null) {
                rcVar.a();
            }
            arrayList.set(tcVar.a, new rc(zcVar, tcVar.d, (zcVar.getMeasuredWidth() - zcVar.getPaddingLeft()) - zcVar.getPaddingRight()));
        }
    }
}
