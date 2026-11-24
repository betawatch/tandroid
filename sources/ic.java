// default package

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ic extends FrameLayout {
    public View[] a;
    public boolean b;
    public float c;
    public ValueAnimator d;

    public final void a() {
        View[] viewArr = this.a;
        float measuredWidth = getMeasuredWidth() > 0 ? getMeasuredWidth() : gm.q.x;
        float f = jb6.a0 ? -1.0f : 1.0f;
        View view = viewArr[0];
        if (view != null) {
            view.setTranslationX((-this.c) * measuredWidth * f);
            viewArr[0].setVisibility(this.c < 1.0f ? 0 : 8);
        }
        View view2 = viewArr[1];
        if (view2 != null) {
            view2.setTranslationX((1.0f - this.c) * measuredWidth * f);
            viewArr[1].setVisibility(this.c <= 0.0f ? 8 : 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(int i, boolean z) {
        this.b = i;
        ValueAnimator valueAnimator = this.d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.d = null;
        }
        if (!z) {
            this.c = i;
            a();
            requestLayout();
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.c, i);
        this.d = ofFloat;
        ofFloat.addUpdateListener(new f0(this, (byte) 5));
        this.d.addListener(new g0(this, (byte) 6));
        this.d.setDuration(320L);
        this.d.setInterpolator(d53.h);
        this.d.start();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        View[] viewArr = this.a;
        int i4 = 0;
        View view = viewArr[0];
        if (view == null || view.getVisibility() != 0) {
            i3 = 0;
        } else {
            viewArr[0].measure(i, 0);
            i3 = viewArr[0].getMeasuredHeight();
        }
        View view2 = viewArr[1];
        if (view2 != null && view2.getVisibility() == 0) {
            viewArr[1].measure(i, 0);
            i4 = viewArr[1].getMeasuredHeight();
        }
        float f = this.c;
        if (f > 0.0f) {
            i3 = f >= 1.0f ? i4 : gm.U1(f, i3, i4);
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i3, TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        a();
    }
}
