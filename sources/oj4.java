// default package

import java.util.Iterator;
import java.util.LinkedHashMap;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class oj4 extends qx2 {
    public LinkedHashMap a;
    public Iterator b;
    public s8a c;
    public LinkedHashMap d;
    public Object e;
    public /* synthetic */ Object f;
    public final /* synthetic */ pj4 h;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oj4(pj4 pj4Var, px2 px2Var) {
        super(px2Var);
        this.h = pj4Var;
    }

    @Override // og0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.n |= TLObject.FLAG_31;
        return this.h.b(this);
    }
}
