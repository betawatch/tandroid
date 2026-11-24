// default package

import java.io.FileInputStream;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class na4 extends gw2 {
    public Object a;
    public FileInputStream b;
    public /* synthetic */ Object c;
    public final /* synthetic */ oa4 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public na4(oa4 oa4Var, gw2 gw2Var) {
        super(gw2Var);
        this.d = oa4Var;
    }

    @Override // of0
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= TLObject.FLAG_31;
        return oa4.a(this.d, this);
    }
}
