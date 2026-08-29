package lh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class i5 extends m2.a {
    public final /* synthetic */ i9 c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ l5 e;

    public i5(Context context, l5 l5Var, i9 i9Var) {
        this.e = l5Var;
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
        l5 l5Var = this.e;
        h5 h5Var = new h5(this, this.c, this.d, l5Var.D, new kg.i(this, 2));
        h5Var.setTag(Integer.valueOf(i10));
        h5Var.setShadowDrawable(l5Var.s);
        h5Var.setPadding(0, AndroidUtilities.dp(16.0f), 0, 0);
        h5Var.g(l5Var.y, (k5) l5Var.B.get(i10));
        h5Var.setListBottomPadding(l5Var.d);
        gVar.addView(h5Var);
        l5Var.C.add(h5Var);
        return h5Var;
    }

    @Override // m2.a
    public final boolean f(View view, Object obj) {
        return view == obj;
    }
}
