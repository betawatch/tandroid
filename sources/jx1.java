// default package

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
