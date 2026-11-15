package fi;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class h5 extends c5.a {
    public final /* synthetic */ i9 c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ k5 e;

    public h5(Context context, k5 k5Var, i9 i9Var) {
        this.e = k5Var;
        this.c = i9Var;
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
        k5 k5Var = this.e;
        g5 g5Var = new g5(this, this.c, this.d, k5Var.I, new ai.f0(this, 17));
        g5Var.setTag(Integer.valueOf(i7));
        g5Var.setShadowDrawable(k5Var.s);
        g5Var.setPadding(0, org.telegram.messenger.g0.L(16.0f), 0, 0);
        g5Var.g(k5Var.E, (j5) k5Var.G.get(i7));
        g5Var.setListBottomPadding(k5Var.d);
        lVar.addView(g5Var);
        k5Var.H.add(g5Var);
        return g5Var;
    }

    @Override // c5.a
    public final boolean f(View view, Object obj) {
        return view == obj;
    }
}
