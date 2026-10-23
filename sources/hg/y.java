package hg;

import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.po0;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
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
