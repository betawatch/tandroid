// default package

import java.util.LinkedHashMap;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class oj7 extends e23 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oj7(e23 e23Var) {
        super((byte) 0);
        e23Var.getClass();
        ((LinkedHashMap) this.a).putAll((LinkedHashMap) e23Var.a);
    }

    @Override // e23
    public final Object b(d23 d23Var) {
        return ((LinkedHashMap) this.a).get(d23Var);
    }

    public oj7() {
        this(c23.b);
    }
}
