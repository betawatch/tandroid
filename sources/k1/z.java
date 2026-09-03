package k1;

import java.io.FileInputStream;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class z extends wc.c {
    public d0 a;
    public FileInputStream b;
    public /* synthetic */ Object c;
    public final /* synthetic */ d0 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(d0 d0Var, wc.c cVar) {
        super(cVar);
        this.d = d0Var;
    }

    @Override // wc.a
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= TLObject.FLAG_31;
        return this.d.f(this);
    }
}
