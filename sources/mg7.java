// default package

import java.io.FileOutputStream;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class mg7 extends gw2 {
    public FileOutputStream a;
    public long b;
    public /* synthetic */ Object c;
    public final /* synthetic */ c6e d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mg7(c6e c6eVar, fw2 fw2Var) {
        super(fw2Var);
        this.d = c6eVar;
    }

    @Override // of0
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= TLObject.FLAG_31;
        return this.d.h(null, this);
    }
}
