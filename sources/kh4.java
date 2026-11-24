// default package

import java.util.Iterator;
import java.util.LinkedHashMap;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class kh4 extends gw2 {
    public LinkedHashMap a;
    public Iterator b;
    public q6a c;
    public LinkedHashMap d;
    public Object e;
    public /* synthetic */ Object f;
    public final /* synthetic */ lh4 h;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kh4(lh4 lh4Var, fw2 fw2Var) {
        super(fw2Var);
        this.h = lh4Var;
    }

    @Override // of0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.n |= TLObject.FLAG_31;
        return this.h.b(this);
    }
}
