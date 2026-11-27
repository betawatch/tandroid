// default package

import java.util.Iterator;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
