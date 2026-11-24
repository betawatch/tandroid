// default package

import android.content.Context;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class gz3 extends bf0 {
    public final /* synthetic */ jz3 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gz3(jz3 jz3Var, Context context) {
        super(context);
        this.H = jz3Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (oi5.b(this)) {
            return;
        }
        super.invalidate();
        this.H.f();
    }

    @Override // android.view.View
    public final void invalidate(int i, int i2, int i3, int i4) {
        if (oi5.b(this)) {
            return;
        }
        super.invalidate(i, i2, i3, i4);
    }
}
