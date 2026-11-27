// default package

import android.content.Context;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
