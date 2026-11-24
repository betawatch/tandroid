// default package

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class gz2 extends b6c {
    public static final /* synthetic */ int b = 0;

    static {
        b6c.h(new gz2());
    }

    @Override // b6c
    public final void b(View view, c6c c6cVar, boolean z, l7c l7cVar, q7c q7cVar) {
        d1a d1aVar = (d1a) view;
        d1aVar.w = (TLRPC.TL_help_country) c6cVar.H;
        d1aVar.f();
        d1aVar.setDivider(z);
        d1aVar.c(c6cVar.e, false);
    }

    @Override // b6c
    public final boolean c(c6c c6cVar, c6c c6cVar2) {
        return c6cVar.I(c6cVar2);
    }

    @Override // b6c
    public final View d(Context context, r59 r59Var, int i, ylb ylbVar) {
        d1a d1aVar = new d1a(context, ylbVar);
        d1aVar.setBackground(null);
        return d1aVar;
    }

    @Override // b6c
    public final boolean e(c6c c6cVar, c6c c6cVar2) {
        return c6cVar.J(c6cVar2);
    }
}
