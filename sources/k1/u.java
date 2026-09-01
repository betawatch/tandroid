package k1;

import java.io.Serializable;
import java.util.Iterator;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class u extends wc.c {
    public d0 a;
    public Object b;
    public Serializable c;
    public Object d;
    public w e;
    public Iterator f;
    public /* synthetic */ Object h;
    public final /* synthetic */ d0 n;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(d0 d0Var, wc.c cVar) {
        super(cVar);
        this.n = d0Var;
    }

    @Override // wc.a
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.r |= TLObject.FLAG_31;
        return this.n.c(this);
    }
}
