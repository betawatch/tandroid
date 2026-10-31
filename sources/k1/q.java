package k1;

import java.io.Serializable;
import java.util.Iterator;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class q extends ed.c {
    public z a;
    public Object b;
    public Serializable c;
    public Object d;
    public s e;
    public Iterator f;
    public /* synthetic */ Object h;
    public final /* synthetic */ z n;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(z zVar, ed.c cVar) {
        super(cVar);
        this.n = zVar;
    }

    @Override // ed.a
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.r |= TLObject.FLAG_31;
        return this.n.c(this);
    }
}
