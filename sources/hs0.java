// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class hs0 extends b6c {
    public static final /* synthetic */ int b = 0;

    static {
        b6c.h(new hs0());
    }

    @Override // b6c
    public final void b(View view, c6c c6cVar, boolean z, l7c l7cVar, q7c q7cVar) {
        is0 is0Var = (is0) view;
        u2c u2cVar = (u2c) c6cVar.H;
        is0Var.a.setText(u2cVar.b);
        is0Var.b.setText(u2cVar.c);
        if (is0Var.c != z) {
            is0Var.invalidate();
        }
        is0Var.c = z;
        is0Var.setWillNotDraw(!z);
    }

    @Override // b6c
    public final View d(Context context, r59 r59Var, int i, ylb ylbVar) {
        return new is0(context);
    }
}
