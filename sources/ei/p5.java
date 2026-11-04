package ei;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class p5 extends b5.a {
    public final /* synthetic */ r9 c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ s5 e;

    public p5(Context context, s5 s5Var, r9 r9Var) {
        this.e = s5Var;
        this.c = r9Var;
        this.d = context;
    }

    @Override // b5.a
    public final void a(b5.l lVar, Object obj) {
        lVar.removeView((View) obj);
        this.e.H.remove(obj);
    }

    @Override // b5.a
    public final int b() {
        return this.e.G.size();
    }

    @Override // b5.a
    public final Object e(b5.l lVar, int i3) {
        s5 s5Var = this.e;
        o5 o5Var = new o5(this, this.c, this.d, s5Var.I, new ai.v2(this, 16));
        o5Var.setTag(Integer.valueOf(i3));
        o5Var.setShadowDrawable(s5Var.s);
        o5Var.setPadding(0, org.telegram.messenger.g0.L(16.0f), 0, 0);
        o5Var.g(s5Var.E, (r5) s5Var.G.get(i3));
        o5Var.setListBottomPadding(s5Var.d);
        lVar.addView(o5Var);
        s5Var.H.add(o5Var);
        return o5Var;
    }

    @Override // b5.a
    public final boolean f(View view, Object obj) {
        return view == obj;
    }
}
