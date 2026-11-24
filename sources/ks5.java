// default package

import java.util.Iterator;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class ks5 extends xyb {
    public final /* synthetic */ aq4 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ks5(Iterator it, aq4 aq4Var) {
        super(it);
        this.b = aq4Var;
    }

    @Override // xyb
    public final Object a(Object obj) {
        return this.b.apply(obj);
    }
}
