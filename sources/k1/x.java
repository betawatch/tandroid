package k1;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class x extends ed.c {
    public z a;
    public Object b;
    public Object c;
    public /* synthetic */ Object d;
    public final /* synthetic */ z e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(z zVar, ed.c cVar) {
        super(cVar);
        this.e = zVar;
    }

    @Override // ed.a
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= TLObject.FLAG_31;
        return this.e.i(null, null, this);
    }
}
