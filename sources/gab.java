// default package

import android.content.Context;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class gab extends ri5 {
    public final /* synthetic */ oab a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gab(oab oabVar, Context context) {
        super(context);
        this.a = oabVar;
    }

    @Override // ri5, android.view.View
    public final void invalidate() {
        super.invalidate();
        c40 c40Var = this.a.G0;
        if (c40Var != null) {
            c40Var.m();
        }
    }
}
