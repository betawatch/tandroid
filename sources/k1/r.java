package k1;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
