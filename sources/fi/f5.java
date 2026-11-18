package fi;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class f5 extends c5.a {
    public final /* synthetic */ f9 c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ i5 e;

    public f5(Context context, i5 i5Var, f9 f9Var) {
        this.e = i5Var;
        this.c = f9Var;
        this.d = context;
    }

    @Override // c5.a
    public final void a(c5.l lVar, Object obj) {
        lVar.removeView((View) obj);
        this.e.H.remove(obj);
    }

    @Override // c5.a
    public final int b() {
        return this.e.G.size();
    }

    @Override // c5.a
    public final Object e(c5.l lVar, int i7) {
        i5 i5Var = this.e;
        e5 e5Var = new e5(this, this.c, this.d, i5Var.I, new ai.g0(this, 18));
        e5Var.setTag(Integer.valueOf(i7));
        e5Var.setShadowDrawable(i5Var.s);
        e5Var.setPadding(0, org.telegram.messenger.g0.L(16.0f), 0, 0);
        e5Var.g(i5Var.E, (h5) i5Var.G.get(i7));
        e5Var.setListBottomPadding(i5Var.d);
        lVar.addView(e5Var);
        i5Var.H.add(e5Var);
        return e5Var;
    }

    @Override // c5.a
    public final boolean f(View view, Object obj) {
        return view == obj;
    }
}
