package k1;

import a8.kd;
import java.io.Serializable;
import java.util.Iterator;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class c extends nd.c {
    public Serializable a;
    public Iterator b;
    public /* synthetic */ Object c;
    public int d;

    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.d |= TLObject.FLAG_31;
        return kd.a(null, null, this);
    }
}
