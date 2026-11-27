// default package

import android.content.Context;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final class dcb extends ui5 {
    public final /* synthetic */ lcb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dcb(lcb lcbVar, Context context) {
        super(context);
        this.a = lcbVar;
    }

    @Override // ui5, android.view.View
    public final void invalidate() {
        super.invalidate();
        d30 d30Var = this.a.G0;
        if (d30Var != null) {
            d30Var.m();
        }
    }
}
