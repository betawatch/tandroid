package ei;

import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.m6;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.tp;
import org.telegram.ui.Components.wc;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class v {
    public final RectF a = new RectF();
    public final c6 b;
    public final c6 c;
    public final c6 d;
    public final c6 e;
    public final org.telegram.ui.Components.f5 f;
    public final org.telegram.ui.Components.f5 g;
    public final c6 h;
    public final c6 i;
    public final wc j;
    public final Paint k;
    public final m6 l;
    public int m;
    public final org.telegram.ui.Cells.z n;
    public final tp o;
    public final org.telegram.ui.Components.voip.h p;

    public v(x xVar) {
        qr qrVar = qr.h;
        this.b = new c6(xVar, 0L, 320L, qrVar);
        this.c = new c6(xVar, 0L, 320L, qrVar);
        this.d = new c6(xVar, 0L, 320L, qrVar);
        this.e = new c6(xVar, 0L, 320L, qrVar);
        this.f = new org.telegram.ui.Components.f5(xVar, 320L, qrVar, 0);
        this.g = new org.telegram.ui.Components.f5(xVar, 320L, qrVar, 0);
        this.h = new c6(xVar, 0L, 320L, qrVar);
        this.i = new c6(xVar, 0L, 320L, qrVar);
        this.j = new wc(xVar);
        this.k = new Paint(1);
        m6 m6Var = new m6(true, false, true, false);
        this.l = m6Var;
        org.telegram.ui.Cells.z Y = i6.Y(0, 9, 9);
        this.n = Y;
        tp tpVar = new tp(-1);
        this.o = tpVar;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.p = hVar;
        m6Var.b = 17;
        m6Var.t(AndroidUtilities.dp(14.0f));
        m6Var.u(AndroidUtilities.bold());
        m6Var.G = AndroidUtilities.displaySize.x * 4;
        m6Var.n(true);
        m6Var.setCallback(xVar);
        tpVar.setCallback(xVar);
        Y.setCallback(xVar);
        hVar.l = true;
        hVar.m = 2.0f;
    }
}
