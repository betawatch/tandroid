// default package

import java.io.FileInputStream;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class nc4 extends qx2 {
    public Object a;
    public FileInputStream b;
    public /* synthetic */ Object c;
    public final /* synthetic */ oc4 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nc4(oc4 oc4Var, qx2 qx2Var) {
        super(qx2Var);
        this.d = oc4Var;
    }

    @Override // og0
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= TLObject.FLAG_31;
        return oc4.a(this.d, this);
    }
}
