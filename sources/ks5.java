// default package

import java.util.Iterator;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class ks5 extends xyb {
    public final /* synthetic */ aq4 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ks5(Iterator it, aq4 aq4Var) {
        super(it);
        this.b = aq4Var;
    }

    @Override // xyb
    public final Object a(Object obj) {
        return this.b.apply(obj);
    }
}
