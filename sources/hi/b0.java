package hi;

import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.gq;
import org.telegram.ui.Components.h6;
import org.telegram.ui.Components.j5;
import org.telegram.ui.Components.r6;
import org.telegram.ui.Components.xc;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class b0 {
    public final RectF a = new RectF();
    public final h6 b;
    public final h6 c;
    public final h6 d;
    public final h6 e;
    public final j5 f;
    public final j5 g;
    public final h6 h;
    public final h6 i;
    public final xc j;
    public final Paint k;
    public final r6 l;
    public int m;
    public final org.telegram.ui.Cells.y n;
    public final gq o;
    public final org.telegram.ui.Components.voip.h p;

    public b0(d0 d0Var) {
        ds dsVar = ds.h;
        this.b = new h6(d0Var, 0L, 320L, dsVar);
        this.c = new h6(d0Var, 0L, 320L, dsVar);
        this.d = new h6(d0Var, 0L, 320L, dsVar);
        this.e = new h6(d0Var, 0L, 320L, dsVar);
        this.f = new j5(d0Var, 320L, dsVar, 0);
        this.g = new j5(d0Var, 320L, dsVar, 0);
        this.h = new h6(d0Var, 0L, 320L, dsVar);
        this.i = new h6(d0Var, 0L, 320L, dsVar);
        this.j = new xc(d0Var);
        this.k = new Paint(1);
        r6 r6Var = new r6(true, false, true);
        this.l = r6Var;
        org.telegram.ui.Cells.y Z = y6.Z(0, 9, 9);
        this.n = Z;
        gq gqVar = new gq(-1);
        this.o = gqVar;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.p = hVar;
        r6Var.b = 17;
        r6Var.w(AndroidUtilities.dp(14.0f));
        r6Var.x(AndroidUtilities.bold());
        r6Var.M = AndroidUtilities.displaySize.x * 4;
        r6Var.q(true);
        r6Var.setCallback(d0Var);
        gqVar.setCallback(d0Var);
        Z.setCallback(d0Var);
        hVar.l = true;
        hVar.m = 2.0f;
    }
}
