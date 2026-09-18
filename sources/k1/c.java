package k1;

import java.io.Serializable;
import java.util.Iterator;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final class c extends kd.c {
    public Serializable a;
    public Iterator b;
    public /* synthetic */ Object c;
    public int d;

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.d |= TLObject.FLAG_31;
        return w7.i.a(null, null, this);
    }
}
