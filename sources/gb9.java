// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class gb9 extends b6c {
    static {
        b6c.h(new gb9());
    }

    public static c6c i(String str) {
        c6c K = c6c.K(gb9.class);
        K.m = str;
        return K;
    }

    @Override // b6c
    public final void b(View view, c6c c6cVar, boolean z, l7c l7cVar, q7c q7cVar) {
        ((hb9) view).set(c6cVar.m);
    }

    @Override // b6c
    public final View d(Context context, r59 r59Var, int i, ylb ylbVar) {
        return new hb9(context, ylbVar);
    }
}
