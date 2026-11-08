package m1;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class i extends kd.c {
    public Object a;
    public Object b;
    public Object c;
    public kotlin.jvm.internal.r d;
    public b0 e;
    public /* synthetic */ Object f;
    public final /* synthetic */ j h;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, kd.c cVar) {
        super(cVar);
        this.h = jVar;
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.n |= TLObject.FLAG_31;
        return this.h.a(null, this);
    }
}
