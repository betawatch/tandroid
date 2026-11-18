package jg;

import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.km0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
