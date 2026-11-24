// default package

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class aa5 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ FrameLayout a;
    public final /* synthetic */ ca5 b;

    public aa5(ca5 ca5Var, FrameLayout frameLayout) {
        this.b = ca5Var;
        this.a = frameLayout;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        ca5 ca5Var = this.b;
        gh1 gh1Var = ca5Var.A0;
        if (gh1Var == null) {
            gh1Var = (gh1) ca5Var.B0(ca5Var.a0);
            ca5Var.A0 = gh1Var;
        }
        gh1Var.f.setOnClickListener(new b95(this, (byte) 3));
    }
}
