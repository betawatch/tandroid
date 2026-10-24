package k1;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
