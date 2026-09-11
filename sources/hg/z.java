package hg;

import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.rn0;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
