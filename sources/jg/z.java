package jg;

import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.km0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class z extends z1 {
    public final /* synthetic */ km0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(km0 km0Var) {
        super(false);
        this.t = km0Var;
    }

    @Override // jg.z1
    public final boolean d(TLObject tLObject) {
        return this.t.F(tLObject);
    }
}
