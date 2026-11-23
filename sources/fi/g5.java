package fi;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class g5 extends c5.a {
    public final /* synthetic */ f9 c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ j5 e;

    public g5(Context context, j5 j5Var, f9 f9Var) {
        this.e = j5Var;
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
        j5 j5Var = this.e;
        f5 f5Var = new f5(this, this.c, this.d, j5Var.I, new ai.d0(this, 18));
        f5Var.setTag(Integer.valueOf(i7));
        f5Var.setShadowDrawable(j5Var.s);
        f5Var.setPadding(0, org.telegram.messenger.g0.L(16.0f), 0, 0);
        f5Var.g(j5Var.E, (i5) j5Var.G.get(i7));
        f5Var.setListBottomPadding(j5Var.d);
        lVar.addView(f5Var);
        j5Var.H.add(f5Var);
        return f5Var;
    }

    @Override // c5.a
    public final boolean f(View view, Object obj) {
        return view == obj;
    }
}
