package ab;

import java.util.Iterator;
import java.util.Map;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final class b extends kd.c {
    public Map a;
    public Iterator b;
    public d c;
    public ie.d d;
    public Map e;
    public Object f;
    public /* synthetic */ Object h;
    public final /* synthetic */ c n;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, kd.c cVar2) {
        super(cVar2);
        this.n = cVar;
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.r |= TLObject.FLAG_31;
        return this.n.b(this);
    }
}
