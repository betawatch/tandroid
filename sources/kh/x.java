package kh;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ik0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class x extends f2.r0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ s2 d;
    public final /* synthetic */ z e;

    public x(z zVar, Context context, s2 s2Var) {
        this.e = zVar;
        this.c = context;
        this.d = s2Var;
    }

    @Override // f2.r0
    public final int h() {
        return u.a().size();
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        y yVar = (y) q1Var.a;
        u uVar = (u) u.a().get(i9);
        boolean z10 = i9 == yVar.s;
        yVar.setDrawable(new v(uVar, false));
        yVar.b(uVar.equals(this.e.b), z10);
        yVar.s = i9;
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        y yVar = new y(this.c);
        yVar.setLayoutParams(new f2.a1(AndroidUtilities.dp(46.0f), AndroidUtilities.dp(56.0f)));
        yVar.setBackground(org.telegram.ui.ActionBar.f6.f0(553648127, 1, -1));
        return new ik0(yVar);
    }

    @Override // f2.r0
    public final void y(f2.q1 q1Var) {
        y yVar = (y) q1Var.a;
        this.d.a(yVar);
        int i9 = yVar.s;
        if (i9 < 0 || i9 >= u.a().size()) {
            return;
        }
        u uVar = (u) u.a().get(yVar.s);
        yVar.setDrawable(new v(uVar, false));
        yVar.b(uVar.equals(this.e.b), false);
    }

    @Override // f2.r0
    public final void z(f2.q1 q1Var) {
        this.d.d.remove((y) q1Var.a);
    }
}
