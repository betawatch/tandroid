package ei;

import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.bd;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.j5;
import org.telegram.ui.Components.jq;
import org.telegram.ui.Components.q6;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class v {
    public final RectF a = new RectF();
    public final g6 b;
    public final g6 c;
    public final g6 d;
    public final g6 e;
    public final j5 f;
    public final j5 g;
    public final g6 h;
    public final g6 i;
    public final bd j;
    public final Paint k;
    public final q6 l;
    public int m;
    public final org.telegram.ui.Cells.z n;
    public final jq o;
    public final org.telegram.ui.Components.voip.h p;

    public v(x xVar) {
        hs hsVar = hs.h;
        this.b = new g6(xVar, 0L, 320L, hsVar);
        this.c = new g6(xVar, 0L, 320L, hsVar);
        this.d = new g6(xVar, 0L, 320L, hsVar);
        this.e = new g6(xVar, 0L, 320L, hsVar);
        this.f = new j5(xVar, 320L, hsVar, 0);
        this.g = new j5(xVar, 320L, hsVar, 0);
        this.h = new g6(xVar, 0L, 320L, hsVar);
        this.i = new g6(xVar, 0L, 320L, hsVar);
        this.j = new bd(xVar);
        this.k = new Paint(1);
        q6 q6Var = new q6(true, false, true);
        this.l = q6Var;
        org.telegram.ui.Cells.z Z = i6.Z(0, 9, 9);
        this.n = Z;
        jq jqVar = new jq(-1);
        this.o = jqVar;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.p = hVar;
        q6Var.b = 17;
        q6Var.w(AndroidUtilities.dp(14.0f));
        q6Var.x(AndroidUtilities.bold());
        q6Var.M = AndroidUtilities.displaySize.x * 4;
        q6Var.q(true);
        q6Var.setCallback(xVar);
        jqVar.setCallback(xVar);
        Z.setCallback(xVar);
        hVar.l = true;
        hVar.m = 2.0f;
    }
}
