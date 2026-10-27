package cb;

import java.util.Iterator;
import java.util.Map;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class b extends nd.c {
    public Map a;
    public Iterator b;
    public d c;
    public le.d d;
    public Map e;
    public Object f;
    public /* synthetic */ Object h;
    public final /* synthetic */ c n;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, nd.c cVar2) {
        super(cVar2);
        this.n = cVar;
    }

    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.r |= TLObject.FLAG_31;
        return this.n.b(this);
    }
}
