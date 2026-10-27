package ce;

import java.util.Iterator;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class g extends nd.c {
    public Iterator a;
    public /* synthetic */ Object b;
    public int c;

    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.c |= TLObject.FLAG_31;
        return f0.o(null, this);
    }
}
