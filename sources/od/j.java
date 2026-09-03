package od;

import kotlin.jvm.internal.q;
import la.t;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class j extends wc.c {
    public q a;
    public t b;
    public /* synthetic */ Object c;
    public int d;

    @Override // wc.a
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.d |= TLObject.FLAG_31;
        return n.b(null, this);
    }
}
