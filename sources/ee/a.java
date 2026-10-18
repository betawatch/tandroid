package ee;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final class a extends md.c {
    public fe.g a;
    public /* synthetic */ Object b;
    public final /* synthetic */ a6.m c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(a6.m mVar, md.c cVar) {
        super(cVar);
        this.c = mVar;
    }

    @Override // md.a
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= TLObject.FLAG_31;
        return this.c.r(null, this);
    }
}
