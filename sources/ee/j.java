package ee;

import ab.u;
import kotlin.jvm.internal.p;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class j extends md.c {
    public p a;
    public u b;
    public /* synthetic */ Object c;
    public int d;

    @Override // md.a
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.d |= TLObject.FLAG_31;
        return n.b(null, this);
    }
}
