// default package

import java.io.FileOutputStream;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
