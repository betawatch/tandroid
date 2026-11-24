// default package

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class g04 extends r59 {
    public boolean f3;
    public boolean g3;
    public final /* synthetic */ e34 h3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g04(e34 e34Var, Context context) {
        super(context, null);
        this.h3 = e34Var;
    }

    @Override // r59, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        hx2 e = hx2.e();
        e34 e34Var = this.h3;
        return super.onInterceptTouchEvent(motionEvent) || e.g(motionEvent, e34Var.i0, e34Var.h2, this.o2);
    }

    @Override // r59, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        e34 e34Var = this.h3;
        if (e34Var.r0 && e34Var.o0.H > 1) {
            this.f3 = true;
            e34Var.j0.g1(0, 0);
            e34Var.p0.setVisibility(0);
            e34Var.q0.k(0, 0);
            e34Var.r0 = false;
            this.f3 = false;
        }
        super.onLayout(z, i, i2, i3, i4);
        e34Var.k(true);
    }

    @Override // r59, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.g3) {
            return;
        }
        this.h3.o0.f();
        this.g3 = true;
    }

    @Override // r59, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f3) {
            return;
        }
        super.requestLayout();
    }
}
