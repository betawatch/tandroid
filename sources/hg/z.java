package hg;

import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.rn0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class z extends b2 {
    public final /* synthetic */ rn0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(rn0 rn0Var) {
        super(false);
        this.t = rn0Var;
    }

    @Override // hg.b2
    public final boolean d(TLObject tLObject) {
        return this.t.F(tLObject);
    }
}
