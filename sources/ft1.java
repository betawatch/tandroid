// default package

import android.animation.ValueAnimator;
import android.app.Activity;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ft1 extends v29 {
    public final int[] n1;
    public ValueAnimator o1;
    public boolean p1;
    public final /* synthetic */ yv1 q1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ft1(yv1 yv1Var, yv1 yv1Var2, Activity activity, int i, ylb ylbVar) {
        super(3, i, ylbVar, activity, yv1Var2);
        this.q1 = yv1Var;
        this.n1 = new int[2];
        this.p1 = true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        a aVar;
        super.onLayout(z, i, i2, i3, i4);
        aVar = ((d) this.q1).actionBar;
        r7 j = aVar.q(null).j(28);
        if (j != null) {
            int[] iArr = this.n1;
            getLocationInWindow(iArr);
            float x = getX();
            float width = getWidth() + x;
            j.getLocationInWindow(iArr);
            float width2 = (j.getWidth() / 2.0f) + iArr[0];
            int L = gm.L(20.0f);
            boolean z2 = jb6.a0;
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
        ofFloat.addUpdateListener(new et1(this, (byte) 0));
        this.o1.setInterpolator(d53.h);
        this.o1.setDuration(420L);
        this.o1.start();
    }
}
