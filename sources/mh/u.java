package mh;

import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.b5;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.i6;
import org.telegram.ui.Components.jp;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.y5;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class u {
    public final RectF a = new RectF();
    public final y5 b;
    public final y5 c;
    public final y5 d;
    public final y5 e;
    public final b5 f;
    public final b5 g;
    public final y5 h;
    public final y5 i;
    public final pc j;
    public final Paint k;
    public final i6 l;
    public int m;
    public final org.telegram.ui.Cells.z n;
    public final jp o;
    public final org.telegram.ui.Components.voip.h p;

    public u(w wVar) {
        gr grVar = gr.h;
        this.b = new y5(wVar, 0L, 320L, grVar);
        this.c = new y5(wVar, 0L, 320L, grVar);
        this.d = new y5(wVar, 0L, 320L, grVar);
        this.e = new y5(wVar, 0L, 320L, grVar);
        this.f = new b5(wVar, 320L, grVar, 0);
        this.g = new b5(wVar, 320L, grVar, 0);
        this.h = new y5(wVar, 0L, 320L, grVar);
        this.i = new y5(wVar, 0L, 320L, grVar);
        this.j = new pc(wVar);
        this.k = new Paint(1);
        i6 i6Var = new i6(true, false, true, false);
        this.l = i6Var;
        org.telegram.ui.Cells.z Y = f6.Y(0, 9, 9);
        this.n = Y;
        jp jpVar = new jp(-1);
        this.o = jpVar;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.p = hVar;
        i6Var.b = 17;
        i6Var.t(AndroidUtilities.dp(14.0f));
        i6Var.u(AndroidUtilities.bold());
        i6Var.G = AndroidUtilities.displaySize.x * 4;
        i6Var.n(true);
        i6Var.setCallback(wVar);
        jpVar.setCallback(wVar);
        Y.setCallback(wVar);
        hVar.l = true;
        hVar.m = 2.0f;
    }
}
