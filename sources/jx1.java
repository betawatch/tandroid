// default package

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class jx1 implements ViewTreeObserver.OnDrawListener {
    public final /* synthetic */ wla a;
    public final /* synthetic */ a8a b;

    public jx1(wla wlaVar, a8a a8aVar) {
        this.a = wlaVar;
        this.b = a8aVar;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        wla wlaVar = this.a;
        wlaVar.post(new on1(this, wlaVar, this.b, (byte) 10));
    }
}
