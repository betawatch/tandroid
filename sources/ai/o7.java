package ai;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final class o7 extends z4.a {
    public final /* synthetic */ jc c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ r7 e;

    public o7(r7 r7Var, jc jcVar, Context context) {
        this.e = r7Var;
        this.c = jcVar;
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
        r7 r7Var = this.e;
        n7 n7Var = new n7(this, this.c, this.d, r7Var.H, new f3(this, 1));
        n7Var.setTag(Integer.valueOf(i10));
        n7Var.setShadowDrawable(r7Var.s);
        n7Var.setPadding(0, AndroidUtilities.dp(16.0f), 0, 0);
        n7Var.g(r7Var.y, (q7) r7Var.F.get(i10));
        n7Var.setListBottomPadding(r7Var.d);
        gVar.addView(n7Var);
        r7Var.G.add(n7Var);
        return n7Var;
    }

    @Override // z4.a
    public final boolean f(View view, Object obj) {
        return view == obj;
    }
}
