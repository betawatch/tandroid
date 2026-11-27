// default package

import java.util.Iterator;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class nu5 extends x2c {
    public final /* synthetic */ es4 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nu5(Iterator it, es4 es4Var) {
        super(it);
        this.b = es4Var;
    }

    @Override // x2c
    public final Object a(Object obj) {
        return this.b.apply(obj);
    }
}
