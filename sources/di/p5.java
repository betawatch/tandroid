package di;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class p5 extends c5.a {
    public final /* synthetic */ p9 c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ s5 e;

    public p5(Context context, s5 s5Var, p9 p9Var) {
        this.e = s5Var;
        this.c = p9Var;
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
        s5 s5Var = this.e;
        o5 o5Var = new o5(this, this.c, this.d, s5Var.H, new ai.i(this, 13));
        o5Var.setTag(Integer.valueOf(i7));
        o5Var.setShadowDrawable(s5Var.s);
        o5Var.setPadding(0, org.telegram.messenger.g0.L(16.0f), 0, 0);
        o5Var.g(s5Var.D, (r5) s5Var.F.get(i7));
        o5Var.setListBottomPadding(s5Var.d);
        kVar.addView(o5Var);
        s5Var.G.add(o5Var);
        return o5Var;
    }

    @Override // c5.a
    public final boolean f(View view, Object obj) {
        return view == obj;
    }
}
