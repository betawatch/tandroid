package fi;

import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.gq;
import org.telegram.ui.Components.j5;
import org.telegram.ui.Components.r6;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class u {
    public final RectF a = new RectF();
    public final g6 b;
    public final g6 c;
    public final g6 d;
    public final g6 e;
    public final j5 f;
    public final j5 g;
    public final g6 h;
    public final g6 i;
    public final ad j;
    public final Paint k;
    public final r6 l;
    public int m;
    public final org.telegram.ui.Cells.z n;
    public final gq o;
    public final org.telegram.ui.Components.voip.h p;

    public u(w wVar) {
        es esVar = es.h;
        this.b = new g6(wVar, 0L, 320L, esVar);
        this.c = new g6(wVar, 0L, 320L, esVar);
        this.d = new g6(wVar, 0L, 320L, esVar);
        this.e = new g6(wVar, 0L, 320L, esVar);
        this.f = new j5(wVar, 320L, esVar, 0);
        this.g = new j5(wVar, 320L, esVar, 0);
        this.h = new g6(wVar, 0L, 320L, esVar);
        this.i = new g6(wVar, 0L, 320L, esVar);
        this.j = new ad(wVar);
        this.k = new Paint(1);
        r6 r6Var = new r6(true, false, true);
        this.l = r6Var;
        org.telegram.ui.Cells.z Z = org.telegram.ui.ActionBar.g6.Z(0, 9, 9);
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
        r6Var.setCallback(wVar);
        gqVar.setCallback(wVar);
        Z.setCallback(wVar);
        hVar.l = true;
        hVar.m = 2.0f;
    }
}
