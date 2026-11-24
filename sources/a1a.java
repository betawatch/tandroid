// default package

import android.content.Context;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class a1a extends j1a {
    public final /* synthetic */ b1a L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1a(b1a b1aVar, Context context, ylb ylbVar) {
        super(context, ylbVar);
        this.L = b1aVar;
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int L = gm.L(78.0f) + getMeasuredHeight();
        b1a b1aVar = this.L;
        b1aVar.k2 = L;
        b1aVar.j2.G();
    }
}
