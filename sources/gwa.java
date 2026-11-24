// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
