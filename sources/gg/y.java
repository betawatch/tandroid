package gg;

import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.wo0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class y extends b2 {
    public final /* synthetic */ wo0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(wo0 wo0Var) {
        super(false);
        this.t = wo0Var;
    }

    @Override // gg.b2
    public final boolean d(TLObject tLObject) {
        return this.t.F(tLObject);
    }
}
