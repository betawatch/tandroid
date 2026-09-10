package bi;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.fl0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class a0 extends s4.h0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ m3 d;
    public final /* synthetic */ c0 e;

    public a0(c0 c0Var, Context context, m3 m3Var) {
        this.e = c0Var;
        this.c = context;
        this.d = m3Var;
    }

    @Override // s4.h0
    public final int h() {
        return x.a().size();
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        b0 b0Var = (b0) c1Var.a;
        x xVar = (x) x.a().get(i10);
        boolean z10 = i10 == b0Var.s;
        b0Var.setDrawable(new y(xVar, false));
        b0Var.b(xVar.equals(this.e.b), z10);
        b0Var.s = i10;
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        b0 b0Var = new b0(this.c);
        b0Var.setLayoutParams(new s4.p0(AndroidUtilities.dp(46.0f), AndroidUtilities.dp(56.0f)));
        b0Var.setBackground(org.telegram.ui.ActionBar.j6.f0(553648127, 1, -1));
        return new fl0(b0Var);
    }

    @Override // s4.h0
    public final void y(s4.c1 c1Var) {
        b0 b0Var = (b0) c1Var.a;
        this.d.a(b0Var);
        int i10 = b0Var.s;
        if (i10 < 0 || i10 >= x.a().size()) {
            return;
        }
        x xVar = (x) x.a().get(b0Var.s);
        b0Var.setDrawable(new y(xVar, false));
        b0Var.b(xVar.equals(this.e.b), false);
    }

    @Override // s4.h0
    public final void z(s4.c1 c1Var) {
        this.d.d.remove((b0) c1Var.a);
    }
}
