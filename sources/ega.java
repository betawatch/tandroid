// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class ega extends gw2 {
    public String a;
    public cga b;
    public /* synthetic */ Object c;
    public final /* synthetic */ fga d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ega(fga fgaVar, fw2 fw2Var) {
        super(fw2Var);
        this.d = fgaVar;
    }

    @Override // of0
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= TLObject.FLAG_31;
        return this.d.e(null, null, this);
    }
}
