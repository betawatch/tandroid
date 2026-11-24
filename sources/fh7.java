// default package

import java.util.LinkedHashMap;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class fh7 extends l13 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fh7(l13 l13Var) {
        super((byte) 0);
        l13Var.getClass();
        ((LinkedHashMap) this.a).putAll((LinkedHashMap) l13Var.a);
    }

    @Override // l13
    public final Object b(k13 k13Var) {
        return ((LinkedHashMap) this.a).get(k13Var);
    }

    public fh7() {
        this(j13.b);
    }
}
