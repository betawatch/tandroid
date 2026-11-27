// default package

import java.util.Iterator;
import java.util.LinkedHashMap;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class mj4 extends ax2 {
    public LinkedHashMap a;
    public Iterator b;
    public iaa c;
    public LinkedHashMap d;
    public Object e;
    public /* synthetic */ Object f;
    public final /* synthetic */ nj4 h;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mj4(nj4 nj4Var, zw2 zw2Var) {
        super(zw2Var);
        this.h = nj4Var;
    }

    @Override // qf0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.n |= TLObject.FLAG_31;
        return this.h.b(this);
    }
}
