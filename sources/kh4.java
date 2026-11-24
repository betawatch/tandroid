// default package

import java.util.Iterator;
import java.util.LinkedHashMap;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
