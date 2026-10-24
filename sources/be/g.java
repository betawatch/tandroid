package be;

import java.util.Iterator;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class g extends md.c {
    public Iterator a;
    public /* synthetic */ Object b;
    public int c;

    @Override // md.a
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.c |= TLObject.FLAG_31;
        return f0.o(null, this);
    }
}
