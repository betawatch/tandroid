package hg;

import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.rn0;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
