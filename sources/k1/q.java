package k1;

import java.io.Serializable;
import java.util.Iterator;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final class q extends md.c {
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
    public q(z zVar, md.c cVar) {
        super(cVar);
        this.n = zVar;
    }

    @Override // md.a
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.r |= TLObject.FLAG_31;
        return this.n.d(this);
    }
}
