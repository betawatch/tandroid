package ei;

import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.h5;
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.tp;
import org.telegram.ui.Components.yc;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes4.dex */
public final class v {
    public final RectF a = new RectF();
    public final e6 b;
    public final e6 c;
    public final e6 d;
    public final e6 e;
    public final h5 f;
    public final h5 g;
    public final e6 h;
    public final e6 i;
    public final yc j;
    public final Paint k;
    public final o6 l;
    public int m;
    public final org.telegram.ui.Cells.z n;
    public final tp o;
    public final org.telegram.ui.Components.voip.h p;

    public v(x xVar) {
        qr qrVar = qr.h;
        this.b = new e6(xVar, 0L, 320L, qrVar);
        this.c = new e6(xVar, 0L, 320L, qrVar);
        this.d = new e6(xVar, 0L, 320L, qrVar);
        this.e = new e6(xVar, 0L, 320L, qrVar);
        this.f = new h5(xVar, 320L, qrVar, 0);
        this.g = new h5(xVar, 320L, qrVar, 0);
        this.h = new e6(xVar, 0L, 320L, qrVar);
        this.i = new e6(xVar, 0L, 320L, qrVar);
        this.j = new yc(xVar);
        this.k = new Paint(1);
        o6 o6Var = new o6(true, false, true, false);
        this.l = o6Var;
        org.telegram.ui.Cells.z Y = j6.Y(0, 9, 9);
        this.n = Y;
        tp tpVar = new tp(-1);
        this.o = tpVar;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.p = hVar;
        o6Var.b = 17;
        o6Var.t(AndroidUtilities.dp(14.0f));
        o6Var.u(AndroidUtilities.bold());
        o6Var.G = AndroidUtilities.displaySize.x * 4;
        o6Var.n(true);
        o6Var.setCallback(xVar);
        tpVar.setCallback(xVar);
        Y.setCallback(xVar);
        hVar.l = true;
        hVar.m = 2.0f;
    }
}
