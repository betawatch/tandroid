package ig;

import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.wo0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class y extends a2 {
    public final /* synthetic */ wo0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(wo0 wo0Var) {
        super(false);
        this.t = wo0Var;
    }

    @Override // ig.a2
    public final boolean d(TLObject tLObject) {
        return this.t.F(tLObject);
    }
}
