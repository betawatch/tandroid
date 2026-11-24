// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class gwa extends gw2 {
    public hwa a;
    public ik4 b;
    public iwa c;
    public bt5 d;
    public Object e;
    public /* synthetic */ Object f;
    public final /* synthetic */ hwa h;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gwa(hwa hwaVar, fw2 fw2Var) {
        super(fw2Var);
        this.h = hwaVar;
    }

    @Override // of0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.n |= TLObject.FLAG_31;
        this.h.h(null, this);
        return bx2.a;
    }
}
