package ei;

import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.tp;
import org.telegram.ui.Components.yc;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final class v {
    public final RectF a = new RectF();
    public final d6 b;
    public final d6 c;
    public final d6 d;
    public final d6 e;
    public final g5 f;
    public final g5 g;
    public final d6 h;
    public final d6 i;
    public final yc j;
    public final Paint k;
    public final n6 l;
    public int m;
    public final org.telegram.ui.Cells.z n;
    public final tp o;
    public final org.telegram.ui.Components.voip.h p;

    public v(x xVar) {
        qr qrVar = qr.h;
        this.b = new d6(xVar, 0L, 320L, qrVar);
        this.c = new d6(xVar, 0L, 320L, qrVar);
        this.d = new d6(xVar, 0L, 320L, qrVar);
        this.e = new d6(xVar, 0L, 320L, qrVar);
        this.f = new g5(xVar, 320L, qrVar, 0);
        this.g = new g5(xVar, 320L, qrVar, 0);
        this.h = new d6(xVar, 0L, 320L, qrVar);
        this.i = new d6(xVar, 0L, 320L, qrVar);
        this.j = new yc(xVar);
        this.k = new Paint(1);
        n6 n6Var = new n6(true, false, true, false);
        this.l = n6Var;
        org.telegram.ui.Cells.z Y = j6.Y(0, 9, 9);
        this.n = Y;
        tp tpVar = new tp(-1);
        this.o = tpVar;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.p = hVar;
        n6Var.b = 17;
        n6Var.t(AndroidUtilities.dp(14.0f));
        n6Var.u(AndroidUtilities.bold());
        n6Var.G = AndroidUtilities.displaySize.x * 4;
        n6Var.n(true);
        n6Var.setCallback(xVar);
        tpVar.setCallback(xVar);
        Y.setCallback(xVar);
        hVar.l = true;
        hVar.m = 2.0f;
    }
}
