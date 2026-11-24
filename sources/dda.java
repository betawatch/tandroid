// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class dda extends b6c {
    public static final /* synthetic */ int b = 0;

    static {
        b6c.h(new dda());
    }

    public static c6c i(zn6 zn6Var, rac racVar) {
        c6c K = c6c.K(dda.class);
        K.H = zn6Var;
        K.I = racVar;
        return K;
    }

    @Override // b6c
    public final void b(View view, c6c c6cVar, boolean z, l7c l7cVar, q7c q7cVar) {
        eda edaVar = (eda) view;
        Object obj = c6cVar.H;
        if (obj instanceof k47) {
            edaVar.f((k47) obj, z);
        } else if (obj instanceof zn6) {
            zn6 zn6Var = (zn6) obj;
            edaVar.setTag(zn6Var);
            edaVar.f(zn6Var.e, z);
        }
        Object obj2 = c6cVar.I;
        if (obj2 instanceof rac) {
            edaVar.setNeedPlayMessageListener((rac) obj2);
        }
        edaVar.e(c6cVar.e, false);
    }

    @Override // b6c
    public final boolean c(c6c c6cVar, c6c c6cVar2) {
        return c6cVar.d == c6cVar2.d && c6cVar.H == c6cVar2.H;
    }

    @Override // b6c
    public final View d(Context context, r59 r59Var, int i, ylb ylbVar) {
        eda edaVar = new eda(0, ylbVar, context);
        edaVar.setCheckForButtonPress(true);
        return edaVar;
    }

    @Override // b6c
    public final boolean e(c6c c6cVar, c6c c6cVar2) {
        return c6cVar.d == c6cVar2.d && c6cVar.H == c6cVar2.H;
    }
}
