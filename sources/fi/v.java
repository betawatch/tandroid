package fi;

import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.h5;
import org.telegram.ui.Components.p6;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.sp;
import org.telegram.ui.Components.zc;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
    public final p6 l;
    public int m;
    public final org.telegram.ui.Cells.z n;
    public final sp o;
    public final org.telegram.ui.Components.voip.h p;

    public v(x xVar) {
        pr prVar = pr.h;
        this.b = new e6(xVar, 0L, 320L, prVar);
        this.c = new e6(xVar, 0L, 320L, prVar);
        this.d = new e6(xVar, 0L, 320L, prVar);
        this.e = new e6(xVar, 0L, 320L, prVar);
        this.f = new h5(xVar, 320L, prVar, 0);
        this.g = new h5(xVar, 320L, prVar, 0);
        this.h = new e6(xVar, 0L, 320L, prVar);
        this.i = new e6(xVar, 0L, 320L, prVar);
        this.j = new zc(xVar);
        this.k = new Paint(1);
        p6 p6Var = new p6(true, false, true, false);
        this.l = p6Var;
        org.telegram.ui.Cells.z Y = j6.Y(0, 9, 9);
        this.n = Y;
        sp spVar = new sp(-1);
        this.o = spVar;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.p = hVar;
        p6Var.b = 17;
        p6Var.t(AndroidUtilities.dp(14.0f));
        p6Var.u(AndroidUtilities.bold());
        p6Var.G = AndroidUtilities.displaySize.x * 4;
        p6Var.n(true);
        p6Var.setCallback(xVar);
        spVar.setCallback(xVar);
        Y.setCallback(xVar);
        hVar.l = true;
        hVar.m = 2.0f;
    }
}
