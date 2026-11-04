package kg;

import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.bm0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class w extends v1 {
    public final /* synthetic */ bm0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(bm0 bm0Var) {
        super(false);
        this.t = bm0Var;
    }

    @Override // kg.v1
    public final boolean d(TLObject tLObject) {
        return this.t.F(tLObject);
    }
}
