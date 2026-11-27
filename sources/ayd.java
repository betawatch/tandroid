// default package

import android.content.Context;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class ayd extends e23 {
    public final jg7 b;

    public ayd(jg7 jg7Var) {
        super((byte) 4);
        this.b = jg7Var;
    }

    @Override // e23
    public final Object a(Object obj) {
        lm5 lm5Var = (lm5) obj;
        Context b = this.b.b();
        j05.b.getClass();
        return new ahe(lm5Var, c15.a(b) >= 204700000 ? new qoc(b, lm5Var) : new q31(b, lm5Var), caf.c());
    }
}
