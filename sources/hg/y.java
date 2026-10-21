package hg;

import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.po0;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class y extends a2 {
    public final /* synthetic */ po0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(po0 po0Var) {
        super(false);
        this.t = po0Var;
    }

    @Override // hg.a2
    public final boolean d(TLObject tLObject) {
        return this.t.F(tLObject);
    }
}
