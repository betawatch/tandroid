// default package

import android.content.Context;
import android.widget.Scroller;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class gj8 extends Scroller {
    public final /* synthetic */ hj8 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gj8(hj8 hj8Var, Context context) {
        super(context);
        this.a = hj8Var;
    }

    @Override // android.widget.Scroller
    public final void startScroll(int i, int i2, int i3, int i4, int i5) {
        super.startScroll(i, i2, i3, i4, i5 * (this.a.y0 ? 3 : 1));
    }
}
