package ci;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes4.dex */
public final class z5 extends z4.a {
    public final /* synthetic */ aa c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ c6 e;

    public z5(Context context, c6 c6Var, aa aaVar) {
        this.e = c6Var;
        this.c = aaVar;
        this.d = context;
    }

    @Override // z4.a
    public final void a(z4.g gVar, Object obj) {
        gVar.removeView((View) obj);
        this.e.G.remove(obj);
    }

    @Override // z4.a
    public final int b() {
        return this.e.F.size();
    }

    @Override // z4.a
    public final Object e(z4.g gVar, int i10) {
        c6 c6Var = this.e;
        y5 y5Var = new y5(this, this.c, this.d, c6Var.H, new ai.r0(this, 8));
        y5Var.setTag(Integer.valueOf(i10));
        y5Var.setShadowDrawable(c6Var.s);
        y5Var.setPadding(0, AndroidUtilities.dp(16.0f), 0, 0);
        y5Var.g(c6Var.y, (b6) c6Var.F.get(i10));
        y5Var.setListBottomPadding(c6Var.d);
        gVar.addView(y5Var);
        c6Var.G.add(y5Var);
        return y5Var;
    }

    @Override // z4.a
    public final boolean f(View view, Object obj) {
        return view == obj;
    }
}
