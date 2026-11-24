// default package

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class li9 extends b6c {
    public static final /* synthetic */ int b = 0;

    static {
        b6c.h(new li9());
    }

    @Override // b6c
    public final void b(View view, c6c c6cVar, boolean z, l7c l7cVar, q7c q7cVar) {
        mi9 mi9Var = (mi9) view;
        mi9Var.set((TL_iv.RichMessage) c6cVar.H);
        mi9Var.setTranslationLoading(c6cVar.e);
    }

    @Override // b6c
    public final boolean c(c6c c6cVar, c6c c6cVar2) {
        return c6cVar.d == c6cVar2.d && c6cVar.H == c6cVar2.H && c6cVar.e == c6cVar2.e;
    }

    @Override // b6c
    public final View d(Context context, r59 r59Var, int i, ylb ylbVar) {
        mi9 mi9Var = new mi9(i, ylbVar, context);
        mi9Var.setPadding(gm.L(20.0f), 0, gm.L(20.0f), gm.L(16.0f));
        return mi9Var;
    }

    @Override // b6c
    public final boolean e(c6c c6cVar, c6c c6cVar2) {
        return c6cVar.d == c6cVar2.d;
    }
}
