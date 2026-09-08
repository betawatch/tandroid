package bi;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class x6 extends z4.a {
    public final /* synthetic */ pb c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ a7 e;

    public x6(Context context, a7 a7Var, pb pbVar) {
        this.e = a7Var;
        this.c = pbVar;
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
        a7 a7Var = this.e;
        w6 w6Var = new w6(this, this.c, this.d, a7Var.H, new ah.m(this, 2));
        w6Var.setTag(Integer.valueOf(i10));
        w6Var.setShadowDrawable(a7Var.s);
        w6Var.setPadding(0, AndroidUtilities.dp(16.0f), 0, 0);
        w6Var.g(a7Var.y, (z6) a7Var.F.get(i10));
        w6Var.setListBottomPadding(a7Var.d);
        gVar.addView(w6Var);
        a7Var.G.add(w6Var);
        return w6Var;
    }

    @Override // z4.a
    public final boolean f(View view, Object obj) {
        return view == obj;
    }
}
