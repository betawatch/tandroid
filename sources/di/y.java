package di;

import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.wr;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.zp;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class y {
    public final RectF a = new RectF();
    public final d6 b;
    public final d6 c;
    public final d6 d;
    public final d6 e;
    public final org.telegram.ui.Components.g5 f;
    public final org.telegram.ui.Components.g5 g;
    public final d6 h;
    public final d6 i;
    public final xc j;
    public final Paint k;
    public final n6 l;
    public int m;
    public final org.telegram.ui.Cells.z n;
    public final zp o;
    public final org.telegram.ui.Components.voip.h p;

    public y(a0 a0Var) {
        wr wrVar = wr.h;
        this.b = new d6(a0Var, 0L, 320L, wrVar);
        this.c = new d6(a0Var, 0L, 320L, wrVar);
        this.d = new d6(a0Var, 0L, 320L, wrVar);
        this.e = new d6(a0Var, 0L, 320L, wrVar);
        this.f = new org.telegram.ui.Components.g5(a0Var, 320L, wrVar, 0);
        this.g = new org.telegram.ui.Components.g5(a0Var, 320L, wrVar, 0);
        this.h = new d6(a0Var, 0L, 320L, wrVar);
        this.i = new d6(a0Var, 0L, 320L, wrVar);
        this.j = new xc(a0Var);
        this.k = new Paint(1);
        n6 n6Var = new n6(true, false, true, false);
        this.l = n6Var;
        org.telegram.ui.Cells.z Y = j6.Y(0, 9, 9);
        this.n = Y;
        zp zpVar = new zp(-1);
        this.o = zpVar;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.p = hVar;
        n6Var.b = 17;
        n6Var.t(AndroidUtilities.dp(14.0f));
        n6Var.u(AndroidUtilities.bold());
        n6Var.G = AndroidUtilities.displaySize.x * 4;
        n6Var.n(true);
        n6Var.setCallback(a0Var);
        zpVar.setCallback(a0Var);
        Y.setCallback(a0Var);
        hVar.l = true;
        hVar.m = 2.0f;
    }
}
