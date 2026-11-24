// default package

import java.util.LinkedHashMap;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ij7 extends x23 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ij7(x23 x23Var) {
        super((byte) 0);
        x23Var.getClass();
        ((LinkedHashMap) this.a).putAll((LinkedHashMap) x23Var.a);
    }

    @Override // x23
    public final Object b(w23 w23Var) {
        return ((LinkedHashMap) this.a).get(w23Var);
    }

    public ij7() {
        this(v23.b);
    }
}
