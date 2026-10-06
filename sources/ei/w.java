package ei;

import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.h5;
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.zc;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes4.dex */
public final class w {
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
    public final wp o;
    public final org.telegram.ui.Components.voip.h p;

    public w(y yVar) {
        tr trVar = tr.h;
        this.b = new e6(yVar, 0L, 320L, trVar);
        this.c = new e6(yVar, 0L, 320L, trVar);
        this.d = new e6(yVar, 0L, 320L, trVar);
        this.e = new e6(yVar, 0L, 320L, trVar);
        this.f = new h5(yVar, 320L, trVar, 0);
        this.g = new h5(yVar, 320L, trVar, 0);
        this.h = new e6(yVar, 0L, 320L, trVar);
        this.i = new e6(yVar, 0L, 320L, trVar);
        this.j = new zc(yVar);
        this.k = new Paint(1);
        o6 o6Var = new o6(true, false, true, false);
        this.l = o6Var;
        org.telegram.ui.Cells.z Y = i6.Y(0, 9, 9);
        this.n = Y;
        wp wpVar = new wp(-1);
        this.o = wpVar;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.p = hVar;
        o6Var.b = 17;
        o6Var.t(AndroidUtilities.dp(14.0f));
        o6Var.u(AndroidUtilities.bold());
        o6Var.G = AndroidUtilities.displaySize.x * 4;
        o6Var.n(true);
        o6Var.setCallback(yVar);
        wpVar.setCallback(yVar);
        Y.setCallback(yVar);
        hVar.l = true;
        hVar.m = 2.0f;
    }
}
