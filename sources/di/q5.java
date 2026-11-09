package di;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class q5 extends c5.a {
    public final /* synthetic */ q9 c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ t5 e;

    public q5(Context context, t5 t5Var, q9 q9Var) {
        this.e = t5Var;
        this.c = q9Var;
        this.d = context;
    }

    @Override // c5.a
    public final void a(c5.k kVar, Object obj) {
        kVar.removeView((View) obj);
        this.e.G.remove(obj);
    }

    @Override // c5.a
    public final int b() {
        return this.e.F.size();
    }

    @Override // c5.a
    public final Object e(c5.k kVar, int i7) {
        t5 t5Var = this.e;
        p5 p5Var = new p5(this, this.c, this.d, t5Var.H, new ai.i(this, 13));
        p5Var.setTag(Integer.valueOf(i7));
        p5Var.setShadowDrawable(t5Var.s);
        p5Var.setPadding(0, org.telegram.messenger.g0.L(16.0f), 0, 0);
        p5Var.g(t5Var.D, (s5) t5Var.F.get(i7));
        p5Var.setListBottomPadding(t5Var.d);
        kVar.addView(p5Var);
        t5Var.G.add(p5Var);
        return p5Var;
    }

    @Override // c5.a
    public final boolean f(View view, Object obj) {
        return view == obj;
    }
}
