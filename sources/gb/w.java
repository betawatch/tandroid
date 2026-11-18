package gb;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class w extends kd.c {
    public Object a;
    public /* synthetic */ Object b;
    public final /* synthetic */ u c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(u uVar, kd.c cVar) {
        super(cVar);
        this.c = uVar;
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= TLObject.FLAG_31;
        return this.c.a(null, this);
    }
}
