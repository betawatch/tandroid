// default package

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class bc5 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ FrameLayout a;
    public final /* synthetic */ dc5 b;

    public bc5(dc5 dc5Var, FrameLayout frameLayout) {
        this.b = dc5Var;
        this.a = frameLayout;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        dc5 dc5Var = this.b;
        ph1 ph1Var = dc5Var.A0;
        if (ph1Var == null) {
            ph1Var = (ph1) dc5Var.C0(dc5Var.a0);
            dc5Var.A0 = ph1Var;
        }
        ph1Var.f.setOnClickListener(new sa5(this, (byte) 4));
    }
}
