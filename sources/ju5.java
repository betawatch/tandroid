// default package

import java.util.Iterator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ju5 extends y0c {
    public final /* synthetic */ bs4 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ju5(Iterator it, bs4 bs4Var) {
        super(it);
        this.b = bs4Var;
    }

    @Override // y0c
    public final Object a(Object obj) {
        return this.b.apply(obj);
    }
}
