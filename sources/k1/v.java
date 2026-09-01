package k1;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class v extends wc.c {
    public Object a;
    public Object b;
    public Object c;
    public kotlin.jvm.internal.q d;
    public d0 e;
    public /* synthetic */ Object f;
    public final /* synthetic */ w h;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(w wVar, wc.c cVar) {
        super(cVar);
        this.h = wVar;
    }

    @Override // wc.a
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.n |= TLObject.FLAG_31;
        return this.h.a(null, this);
    }
}
