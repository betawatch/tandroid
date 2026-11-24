// default package

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class c49 extends b6c {
    public static final /* synthetic */ int b = 0;

    static {
        b6c.h(new c49());
    }

    @Override // b6c
    public final void b(View view, c6c c6cVar, boolean z, l7c l7cVar, q7c q7cVar) {
        s57 s57Var = (s57) view;
        s57Var.a((TLObject) c6cVar.H, c6cVar.A, true);
        s57Var.setOnClickListener(c6cVar.E);
    }

    @Override // b6c
    public final boolean c(c6c c6cVar, c6c c6cVar2) {
        return c6cVar.C == c6cVar2.C;
    }

    @Override // b6c
    public final View d(Context context, r59 r59Var, int i, ylb ylbVar) {
        s57 s57Var = new s57(context);
        s57Var.setBackground(cmb.L0(false));
        return s57Var;
    }

    @Override // b6c
    public final boolean e(c6c c6cVar, c6c c6cVar2) {
        return c6cVar.C == c6cVar2.C;
    }
}
