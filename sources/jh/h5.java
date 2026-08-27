package jh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class h5 extends m2.a {
    public final /* synthetic */ i9 c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ k5 e;

    public h5(Context context, k5 k5Var, i9 i9Var) {
        this.e = k5Var;
        this.c = i9Var;
        this.d = context;
    }

    @Override // m2.a
    public final void a(m2.g gVar, Object obj) {
        gVar.removeView((View) obj);
        this.e.C.remove(obj);
    }

    @Override // m2.a
    public final int b() {
        return this.e.B.size();
    }

    @Override // m2.a
    public final Object e(m2.g gVar, int i10) {
        k5 k5Var = this.e;
        g5 g5Var = new g5(this, this.c, this.d, k5Var.D, new ig.i(this, 2));
        g5Var.setTag(Integer.valueOf(i10));
        g5Var.setShadowDrawable(k5Var.s);
        g5Var.setPadding(0, AndroidUtilities.dp(16.0f), 0, 0);
        g5Var.g(k5Var.y, (j5) k5Var.B.get(i10));
        g5Var.setListBottomPadding(k5Var.d);
        gVar.addView(g5Var);
        k5Var.C.add(g5Var);
        return g5Var;
    }

    @Override // m2.a
    public final boolean f(View view, Object obj) {
        return view == obj;
    }
}
