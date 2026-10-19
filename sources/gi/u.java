package gi;

import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.f6;
import org.telegram.ui.Components.i5;
import org.telegram.ui.Components.p6;
import org.telegram.ui.Components.yc;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final class u {
    public final RectF a = new RectF();
    public final f6 b;
    public final f6 c;
    public final f6 d;
    public final f6 e;
    public final i5 f;
    public final i5 g;
    public final f6 h;
    public final f6 i;
    public final yc j;
    public final Paint k;
    public final p6 l;
    public int m;
    public final org.telegram.ui.Cells.z n;
    public final dq o;
    public final org.telegram.ui.Components.voip.h p;

    public u(w wVar) {
        bs bsVar = bs.h;
        this.b = new f6(wVar, 0L, 320L, bsVar);
        this.c = new f6(wVar, 0L, 320L, bsVar);
        this.d = new f6(wVar, 0L, 320L, bsVar);
        this.e = new f6(wVar, 0L, 320L, bsVar);
        this.f = new i5(wVar, 320L, bsVar, 0);
        this.g = new i5(wVar, 320L, bsVar, 0);
        this.h = new f6(wVar, 0L, 320L, bsVar);
        this.i = new f6(wVar, 0L, 320L, bsVar);
        this.j = new yc(wVar);
        this.k = new Paint(1);
        p6 p6Var = new p6(true, false, true);
        this.l = p6Var;
        org.telegram.ui.Cells.z Z = h6.Z(0, 9, 9);
        this.n = Z;
        dq dqVar = new dq(-1);
        this.o = dqVar;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.p = hVar;
        p6Var.b = 17;
        p6Var.w(AndroidUtilities.dp(14.0f));
        p6Var.x(AndroidUtilities.bold());
        p6Var.M = AndroidUtilities.displaySize.x * 4;
        p6Var.q(true);
        p6Var.setCallback(wVar);
        dqVar.setCallback(wVar);
        Z.setCallback(wVar);
        hVar.l = true;
        hVar.m = 2.0f;
    }
}
