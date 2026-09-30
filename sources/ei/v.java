package ei;

import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.h5;
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.sr;
import org.telegram.ui.Components.vp;
import org.telegram.ui.Components.zc;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
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
    public final zc j;
    public final Paint k;
    public final o6 l;
    public int m;
    public final org.telegram.ui.Cells.z n;
    public final vp o;
    public final org.telegram.ui.Components.voip.h p;

    public v(x xVar) {
        sr srVar = sr.h;
        this.b = new e6(xVar, 0L, 320L, srVar);
        this.c = new e6(xVar, 0L, 320L, srVar);
        this.d = new e6(xVar, 0L, 320L, srVar);
        this.e = new e6(xVar, 0L, 320L, srVar);
        this.f = new h5(xVar, 320L, srVar, 0);
        this.g = new h5(xVar, 320L, srVar, 0);
        this.h = new e6(xVar, 0L, 320L, srVar);
        this.i = new e6(xVar, 0L, 320L, srVar);
        this.j = new zc(xVar);
        this.k = new Paint(1);
        o6 o6Var = new o6(true, false, true, false);
        this.l = o6Var;
        org.telegram.ui.Cells.z Y = h6.Y(0, 9, 9);
        this.n = Y;
        vp vpVar = new vp(-1);
        this.o = vpVar;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.p = hVar;
        o6Var.b = 17;
        o6Var.t(AndroidUtilities.dp(14.0f));
        o6Var.u(AndroidUtilities.bold());
        o6Var.G = AndroidUtilities.displaySize.x * 4;
        o6Var.n(true);
        o6Var.setCallback(xVar);
        vpVar.setCallback(xVar);
        Y.setCallback(xVar);
        hVar.l = true;
        hVar.m = 2.0f;
    }
}
