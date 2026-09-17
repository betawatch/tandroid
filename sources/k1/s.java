package k1;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes.dex */
public final class s extends kd.c {
    public Object a;
    public Object b;
    public Object c;
    public kotlin.jvm.internal.p d;
    public a0 e;
    public /* synthetic */ Object f;
    public final /* synthetic */ t h;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(t tVar, kd.c cVar) {
        super(cVar);
        this.h = tVar;
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.n |= TLObject.FLAG_31;
        return this.h.a(null, this);
    }
}
