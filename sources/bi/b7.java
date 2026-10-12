package bi;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class b7 extends z4.a {
    public final /* synthetic */ sb c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ e7 e;

    public b7(Context context, e7 e7Var, sb sbVar) {
        this.e = e7Var;
        this.c = sbVar;
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
        e7 e7Var = this.e;
        a7 a7Var = new a7(this, this.c, this.d, e7Var.H, new o1(this, 2));
        a7Var.setTag(Integer.valueOf(i10));
        a7Var.setShadowDrawable(e7Var.s);
        a7Var.setPadding(0, AndroidUtilities.dp(16.0f), 0, 0);
        a7Var.g(e7Var.y, (d7) e7Var.F.get(i10));
        a7Var.setListBottomPadding(e7Var.d);
        gVar.addView(a7Var);
        e7Var.G.add(a7Var);
        return a7Var;
    }

    @Override // z4.a
    public final boolean f(View view, Object obj) {
        return view == obj;
    }
}
