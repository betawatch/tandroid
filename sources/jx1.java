// default package

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
