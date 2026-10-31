package k1;

import java.io.Serializable;
import java.util.Iterator;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class c extends ed.c {
    public Serializable a;
    public Iterator b;
    public /* synthetic */ Object c;
    public int d;

    @Override // ed.a
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.d |= TLObject.FLAG_31;
        return w7.g.a(null, null, this);
    }
}
