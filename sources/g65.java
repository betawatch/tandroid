// default package

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class g65 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ h75 b;

    public /* synthetic */ g65(h75 h75Var, byte b) {
        this.a = b;
        this.b = h75Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        byte b = this.a;
        h75 h75Var = this.b;
        switch (b) {
            case 0:
                h75Var.J1.getViewTreeObserver().removeOnPreDrawListener(this);
                h75Var.T3.h(null);
                gl.W3(h75Var.e4);
                h75Var.b.requestLayout();
                break;
            default:
                h75Var.J1.getViewTreeObserver().removeOnPreDrawListener(this);
                h75Var.T3.h(null);
                gl.W3(h75Var.e4);
                h75Var.b.requestLayout();
                break;
        }
        return false;
    }
}
