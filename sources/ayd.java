// default package

import android.content.Context;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class ayd extends e23 {
    public final kg7 b;

    public ayd(kg7 kg7Var) {
        super((byte) 4);
        this.b = kg7Var;
    }

    @Override // e23
    public final Object a(Object obj) {
        lm5 lm5Var = (lm5) obj;
        Context b = this.b.b();
        j05.b.getClass();
        return new ahe(lm5Var, c15.a(b) >= 204700000 ? new qoc(b, lm5Var) : new q31(b, lm5Var), caf.c());
    }
}
