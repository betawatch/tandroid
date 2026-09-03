package od;

import kotlin.jvm.internal.q;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class e extends wc.c {
    public q a;
    public /* synthetic */ Object b;
    public int c;

    @Override // wc.a
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.c |= TLObject.FLAG_31;
        return n.a(null, null, this);
    }
}
