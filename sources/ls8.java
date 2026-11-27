// default package

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class ls8 implements on5 {
    public final /* synthetic */ Runnable[] a;

    public ls8(Runnable[] runnableArr) {
        this.a = runnableArr;
    }

    @Override // on5
    public final void v(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        if (imageReceiver.B()) {
            Runnable[] runnableArr = this.a;
            if (runnableArr[0] != null) {
                b29 y = imageReceiver.y();
                if (y == null) {
                    runnableArr[0].run();
                    runnableArr[0] = null;
                } else if (y.t()) {
                    y.B0 = new uk8(runnableArr, (byte) 13);
                } else {
                    runnableArr[0].run();
                    runnableArr[0] = null;
                }
            }
        }
    }

    @Override // on5
    public final void r(ImageReceiver imageReceiver) {
    }

    @Override // on5
    public final void z(int i, Drawable drawable) {
    }
}
