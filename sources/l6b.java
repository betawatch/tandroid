// default package

import android.content.Context;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class l6b extends d66 {
    public final /* synthetic */ n6b u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l6b(n6b n6bVar, Context context, float f) {
        super(context, f);
        this.u0 = n6bVar;
    }

    @Override // android.view.View
    public final void invalidate() {
        this.u0.d.invalidate();
        super.invalidate();
    }
}
