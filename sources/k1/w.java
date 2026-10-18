package k1;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final class w extends md.c {
    public Object a;
    public Object b;
    public /* synthetic */ Object c;
    public final /* synthetic */ z d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(z zVar, md.c cVar) {
        super(cVar);
        this.d = zVar;
    }

    @Override // md.a
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= TLObject.FLAG_31;
        return this.d.h(this);
    }
}
