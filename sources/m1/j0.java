package m1;

import java.io.FileOutputStream;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class j0 extends kd.c {
    public FileOutputStream a;
    public FileOutputStream b;
    public /* synthetic */ Object c;
    public final /* synthetic */ k0 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(k0 k0Var, kd.c cVar) {
        super(cVar);
        this.d = k0Var;
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= TLObject.FLAG_31;
        return this.d.b(null, this);
    }
}
