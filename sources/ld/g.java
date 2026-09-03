package ld;

import java.util.Iterator;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class g extends wc.c {
    public Iterator a;
    public /* synthetic */ Object b;
    public int c;

    @Override // wc.a
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.c |= TLObject.FLAG_31;
        return e0.o(null, this);
    }
}
