// default package

import android.animation.ValueAnimator;
import android.app.Activity;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class gs1 extends i49 {
    public final int[] n1;
    public ValueAnimator o1;
    public boolean p1;
    public final /* synthetic */ zu1 q1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gs1(zu1 zu1Var, zu1 zu1Var2, Activity activity, int i, vnb vnbVar) {
        super(3, i, vnbVar, activity, zu1Var2);
        this.q1 = zu1Var;
        this.n1 = new int[2];
        this.p1 = true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        a aVar;
        super.onLayout(z, i, i2, i3, i4);
        aVar = ((e) this.q1).actionBar;
        s7 j = aVar.q(null).j(28);
        if (j != null) {
            int[] iArr = this.n1;
            getLocationInWindow(iArr);
            float x = getX();
            float width = getWidth() + x;
            j.getLocationInWindow(iArr);
            float width2 = (j.getWidth() / 2.0f) + iArr[0];
            int L = hl.L(20.0f);
            boolean z2 = ob6.a0;
            float f = width2 + (L * (z2 ? -1 : 1));
            boolean z3 = this.p1;
            if (z2) {
                q(!z3, f - x);
            } else {
                q(!z3, f - width);
            }
            this.p1 = false;
        }
    }

    public final void q(boolean z, float f) {
        ValueAnimator valueAnimator = this.o1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.o1 = null;
        }
        if (!z) {
            setBubbleOffset(f);
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.V0, f);
        this.o1 = ofFloat;
        ofFloat.addUpdateListener(new g0(this, (byte) 29));
        this.o1.setInterpolator(k43.h);
        this.o1.setDuration(420L);
        this.o1.start();
    }
}
