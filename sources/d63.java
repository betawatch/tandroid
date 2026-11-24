// default package

import java.io.Serializable;
import java.util.Iterator;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class d63 extends gw2 {
    public Serializable a;
    public Iterator b;
    public /* synthetic */ Object c;
    public final /* synthetic */ cff d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d63(cff cffVar, gw2 gw2Var) {
        super(gw2Var);
        this.d = cffVar;
    }

    @Override // of0
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= TLObject.FLAG_31;
        return this.d.O(null, null, this);
    }
}
