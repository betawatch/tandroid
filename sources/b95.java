// default package

import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class b95 extends zb5 {
    public final /* synthetic */ e95 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b95(e95 e95Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.h0 = e95Var;
    }

    @Override // zb5
    public final void d(zb5 zb5Var) {
        j95 j95Var = this.h0.N;
        j95 j95Var2 = j95.s5;
        j95Var.B1(zb5Var);
    }

    @Override // zb5, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (hl.O1()) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(hl.L(420.0f), View.MeasureSpec.getSize(i)), TLObject.FLAG_30), i2);
        } else {
            super.onMeasure(i, i2);
        }
    }
}
