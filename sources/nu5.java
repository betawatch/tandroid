// default package

import java.util.Iterator;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
