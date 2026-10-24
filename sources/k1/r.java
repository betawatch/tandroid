package k1;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class r extends md.c {
    public Object a;
    public Object b;
    public Object c;
    public kotlin.jvm.internal.p d;
    public z e;
    public /* synthetic */ Object f;
    public final /* synthetic */ s h;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s sVar, md.c cVar) {
        super(cVar);
        this.h = sVar;
    }

    @Override // md.a
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.n |= TLObject.FLAG_31;
        return this.h.a(null, this);
    }
}
