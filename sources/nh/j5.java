package nh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class j5 extends m2.a {
    public final /* synthetic */ i9 c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ m5 e;

    public j5(Context context, m5 m5Var, i9 i9Var) {
        this.e = m5Var;
        this.c = i9Var;
        this.d = context;
    }

    @Override // m2.a
    public final void a(m2.h hVar, Object obj) {
        hVar.removeView((View) obj);
        this.e.D.remove(obj);
    }

    @Override // m2.a
    public final int b() {
        return this.e.C.size();
    }

    @Override // m2.a
    public final Object e(m2.h hVar, int i10) {
        m5 m5Var = this.e;
        i5 i5Var = new i5(this, this.c, this.d, m5Var.E, new mg.i(this, 2));
        i5Var.setTag(Integer.valueOf(i10));
        i5Var.setShadowDrawable(m5Var.s);
        i5Var.setPadding(0, AndroidUtilities.dp(16.0f), 0, 0);
        i5Var.g(m5Var.y, (l5) m5Var.C.get(i10));
        i5Var.setListBottomPadding(m5Var.d);
        hVar.addView(i5Var);
        m5Var.D.add(i5Var);
        return i5Var;
    }

    @Override // m2.a
    public final boolean f(View view, Object obj) {
        return view == obj;
    }
}
