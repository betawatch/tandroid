package lh;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.lk0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class x extends f2.q0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ r2 d;
    public final /* synthetic */ z e;

    public x(z zVar, Context context, r2 r2Var) {
        this.e = zVar;
        this.c = context;
        this.d = r2Var;
    }

    @Override // f2.q0
    public final int h() {
        return u.a().size();
    }

    @Override // f2.q0
    public final void v(f2.o1 o1Var, int i10) {
        y yVar = (y) o1Var.a;
        u uVar = (u) u.a().get(i10);
        boolean z10 = i10 == yVar.s;
        yVar.setDrawable(new v(uVar, false));
        yVar.b(uVar.equals(this.e.b), z10);
        yVar.s = i10;
    }

    @Override // f2.q0
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        y yVar = new y(this.c);
        yVar.setLayoutParams(new f2.y0(AndroidUtilities.dp(46.0f), AndroidUtilities.dp(56.0f)));
        yVar.setBackground(org.telegram.ui.ActionBar.g6.f0(553648127, 1, -1));
        return new lk0(yVar);
    }

    @Override // f2.q0
    public final void y(f2.o1 o1Var) {
        y yVar = (y) o1Var.a;
        this.d.a(yVar);
        int i10 = yVar.s;
        if (i10 < 0 || i10 >= u.a().size()) {
            return;
        }
        u uVar = (u) u.a().get(yVar.s);
        yVar.setDrawable(new v(uVar, false));
        yVar.b(uVar.equals(this.e.b), false);
    }

    @Override // f2.q0
    public final void z(f2.o1 o1Var) {
        this.d.d.remove((y) o1Var.a);
    }
}
