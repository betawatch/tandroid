// default package

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class g92 implements ll5 {
    public boolean a;
    public final /* synthetic */ r31 b;
    public final /* synthetic */ t31 c;

    public g92(t31 t31Var, r31 r31Var) {
        this.c = t31Var;
        this.b = r31Var;
    }

    @Override // ll5
    public final void E(int i, Drawable drawable) {
        oy8 oy8Var;
        dk0 dk0Var;
        if (this.a) {
            return;
        }
        if ((i == 0 || i == 3) && drawable != null) {
            this.a = true;
            boolean z = drawable instanceof oy8;
            r31 r31Var = this.b;
            if (z && (dk0Var = (oy8Var = (oy8) drawable).C0) != null && dk0Var.g()) {
                oy8Var.B0 = new kx1(this, r31Var, (byte) 29);
            } else {
                this.c.d();
                r31Var.run();
            }
        }
    }

    @Override // ll5
    public final void v(ImageReceiver imageReceiver) {
    }

    @Override // ll5
    public final void C(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
    }
}
