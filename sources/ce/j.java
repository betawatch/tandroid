package ce;

import org.telegram.tgnet.TLObject;

/* loaded from: classes.dex */
public final class j extends kd.c {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ wf.b c;
    public wf.b d;
    public d e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(wf.b bVar, kd.c cVar) {
        super(cVar);
        this.c = bVar;
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= TLObject.FLAG_31;
        return this.c.B(null, this);
    }
}
