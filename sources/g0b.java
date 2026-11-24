// default package

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class g0b extends FrameLayout {
    public final /* synthetic */ float a;
    public final /* synthetic */ h0b b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0b(h0b h0bVar, Context context, float f) {
        super(context);
        this.b = h0bVar;
        this.a = f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        u31.a(this.b.c, new s20(this, (byte) 18));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        u31.h(this.b.c);
    }
}
