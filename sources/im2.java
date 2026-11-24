// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class im2 extends b6c {
    public static final /* synthetic */ int b = 0;

    static {
        b6c.h(new im2());
    }

    @Override // b6c
    public final void b(View view, c6c c6cVar, boolean z, l7c l7cVar, q7c q7cVar) {
        view.requestLayout();
    }

    @Override // b6c
    public final View d(Context context, r59 r59Var, int i, ylb ylbVar) {
        jm2 jm2Var = new jm2(context, ylbVar, (byte) 0);
        jm2Var.setIsSingleCell(true);
        jm2Var.setViewType(35);
        return jm2Var;
    }

    @Override // b6c
    public final boolean e(c6c c6cVar, c6c c6cVar2) {
        return c6cVar.d == c6cVar2.d;
    }

    @Override // b6c
    public final boolean f() {
        return false;
    }
}
