// default package

import android.view.View;
import java.io.Serializable;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class fz8 implements oac, pac {
    public final /* synthetic */ lz8 a;

    public /* synthetic */ fz8(lz8 lz8Var) {
        this.a = lz8Var;
    }

    @Override // pac
    public final Object b(c6c c6cVar, View view, Integer num, Float f, Float f2) {
        boolean z = false;
        if (c6cVar.a == 16) {
            Object obj = c6cVar.H;
            if (!(obj instanceof oz8) || !((oz8) obj).g) {
                this.a.i0(c6cVar, view);
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // oac
    public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        this.a.g0((c6c) obj, (View) obj2);
    }
}
