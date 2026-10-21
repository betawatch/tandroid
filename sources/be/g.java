package be;

import java.util.Iterator;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
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
