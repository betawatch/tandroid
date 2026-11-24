// default package

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class iy1 implements ViewTreeObserver.OnDrawListener {
    public final /* synthetic */ dka a;
    public final /* synthetic */ k6a b;

    public iy1(dka dkaVar, k6a k6aVar) {
        this.a = dkaVar;
        this.b = k6aVar;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        dka dkaVar = this.a;
        dkaVar.post(new co1(this, dkaVar, this.b, (byte) 10));
    }
}
