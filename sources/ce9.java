// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class ce9 extends b6c {
    public static final /* synthetic */ int b = 0;

    static {
        b6c.h(new ce9());
    }

    @Override // b6c
    public final void b(View view, c6c c6cVar, boolean z, l7c l7cVar, q7c q7cVar) {
        ((de9) view).c = (ll0) c6cVar.H;
    }

    @Override // b6c
    public final View d(Context context, r59 r59Var, int i, ylb ylbVar) {
        return new de9(context, ylbVar);
    }

    @Override // b6c
    public final boolean f() {
        return false;
    }
}
