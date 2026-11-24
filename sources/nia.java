// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class nia extends gw2 {
    public nh7 a;
    public boolean b;
    public /* synthetic */ Object c;
    public final /* synthetic */ pia d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nia(pia piaVar, fw2 fw2Var) {
        super(fw2Var);
        this.d = piaVar;
    }

    @Override // of0
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= TLObject.FLAG_31;
        return this.d.e(null, this);
    }
}
