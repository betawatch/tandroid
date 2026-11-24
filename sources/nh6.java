// default package

import android.view.View;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class nh6 implements Runnable {
    public final /* synthetic */ yh6 a;

    public nh6(yh6 yh6Var) {
        this.a = yh6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yh6 yh6Var = this.a;
        if (yh6Var.b == null) {
            return;
        }
        for (int i = 0; i < yh6Var.b.getChildCount(); i++) {
            View childAt = yh6Var.b.getChildAt(i);
            if (childAt instanceof vh6) {
                vh6 vh6Var = (vh6) childAt;
                if (vh6Var.J) {
                    vh6Var.b(vh6Var.n, vh6Var.r);
                }
            }
        }
        gl.e3(this, 500L);
    }
}
