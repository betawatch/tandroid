// default package

import java.io.Serializable;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class j83 extends ax2 {
    public Object a;
    public Object b;
    public Serializable c;
    public p89 d;
    public boolean e;
    public int f;
    public /* synthetic */ Object h;
    public final /* synthetic */ o83 n;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j83(o83 o83Var, ax2 ax2Var) {
        super(ax2Var);
        this.n = o83Var;
    }

    @Override // qf0
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.r |= TLObject.FLAG_31;
        return this.n.h(false, this);
    }
}
