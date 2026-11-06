package hb;

import java.util.Iterator;
import java.util.Map;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class b extends kd.c {
    public Map a;
    public Iterator b;
    public d c;
    public Map d;
    public Object e;
    public /* synthetic */ Object f;
    public final /* synthetic */ c h;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, kd.c cVar2) {
        super(cVar2);
        this.h = cVar;
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.n |= TLObject.FLAG_31;
        return this.h.b(this);
    }
}
