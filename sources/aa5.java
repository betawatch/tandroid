// default package

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
