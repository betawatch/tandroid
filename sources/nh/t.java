package nh;

import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.b5;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.hp;
import org.telegram.ui.Components.i6;
import org.telegram.ui.Components.nc;
import org.telegram.ui.Components.y5;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class t {
    public final RectF a = new RectF();
    public final y5 b;
    public final y5 c;
    public final y5 d;
    public final y5 e;
    public final b5 f;
    public final b5 g;
    public final y5 h;
    public final y5 i;
    public final nc j;
    public final Paint k;
    public final i6 l;
    public int m;
    public final org.telegram.ui.Cells.z n;
    public final hp o;
    public final org.telegram.ui.Components.voip.h p;

    public t(v vVar) {
        er erVar = er.h;
        this.b = new y5(vVar, 0L, 320L, erVar);
        this.c = new y5(vVar, 0L, 320L, erVar);
        this.d = new y5(vVar, 0L, 320L, erVar);
        this.e = new y5(vVar, 0L, 320L, erVar);
        this.f = new b5(vVar, 320L, erVar, 0);
        this.g = new b5(vVar, 320L, erVar, 0);
        this.h = new y5(vVar, 0L, 320L, erVar);
        this.i = new y5(vVar, 0L, 320L, erVar);
        this.j = new nc(vVar);
        this.k = new Paint(1);
        i6 i6Var = new i6(true, false, true, false);
        this.l = i6Var;
        org.telegram.ui.Cells.z Y = g6.Y(0, 9, 9);
        this.n = Y;
        hp hpVar = new hp(-1);
        this.o = hpVar;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.p = hVar;
        i6Var.b = 17;
        i6Var.t(AndroidUtilities.dp(14.0f));
        i6Var.u(AndroidUtilities.bold());
        i6Var.G = AndroidUtilities.displaySize.x * 4;
        i6Var.n(true);
        i6Var.setCallback(vVar);
        hpVar.setCallback(vVar);
        Y.setCallback(vVar);
        hVar.l = true;
        hVar.m = 2.0f;
    }
}
