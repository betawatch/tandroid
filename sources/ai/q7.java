package ai;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class q7 extends z4.a {
    public final /* synthetic */ kc c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ t7 e;

    public q7(t7 t7Var, kc kcVar, Context context) {
        this.e = t7Var;
        this.c = kcVar;
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
        t7 t7Var = this.e;
        p7 p7Var = new p7(this, this.c, this.d, t7Var.H, new y1(this, 2));
        p7Var.setTag(Integer.valueOf(i10));
        p7Var.setShadowDrawable(t7Var.s);
        p7Var.setPadding(0, AndroidUtilities.dp(16.0f), 0, 0);
        p7Var.g(t7Var.y, (s7) t7Var.F.get(i10));
        p7Var.setListBottomPadding(t7Var.d);
        gVar.addView(p7Var);
        t7Var.G.add(p7Var);
        return p7Var;
    }

    @Override // z4.a
    public final boolean f(View view, Object obj) {
        return view == obj;
    }
}
