// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class ac extends a8c {
    static {
        a8c.h(new ac());
    }

    public static b8c i(int i, String str, String str2) {
        b8c K = b8c.K(ac.class);
        K.k = i;
        K.m = str;
        K.n = str2;
        return K;
    }

    @Override // a8c
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        ((bc) view).a(b8cVar.k, b8cVar.m, b8cVar.n);
    }

    @Override // a8c
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        return new bc(vnbVar, context, false);
    }

    @Override // a8c
    public final boolean f() {
        return false;
    }
}
