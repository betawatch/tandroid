package hi;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.ds;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class p extends FrameLayout {
    public View[] a;
    public int b;
    public float c;
    public ValueAnimator d;

    public final void a() {
        View[] viewArr = this.a;
        float measuredWidth = getMeasuredWidth() > 0 ? getMeasuredWidth() : AndroidUtilities.displaySize.x;
        float f7 = LocaleController.isRTL ? -1.0f : 1.0f;
        View view = viewArr[0];
        if (view != null) {
            view.setTranslationX((-this.c) * measuredWidth * f7);
            viewArr[0].setVisibility(this.c < 1.0f ? 0 : 8);
        }
        View view2 = viewArr[1];
        if (view2 != null) {
            view2.setTranslationX((1.0f - this.c) * measuredWidth * f7);
            viewArr[1].setVisibility(this.c <= 0.0f ? 8 : 0);
        }
    }

    public final void b(int i10, boolean z10) {
        this.b = i10;
        ValueAnimator valueAnimator = this.d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.d = null;
        }
        if (!z10) {
            this.c = i10;
            a();
            requestLayout();
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.c, i10);
        this.d = ofFloat;
        ofFloat.addUpdateListener(new fi.e4(this, 7));
        this.d.addListener(new bh.b(this, 26));
        this.d.setDuration(320L);
        this.d.setInterpolator(ds.h);
        this.d.start();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13 = 0;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        View[] viewArr = this.a;
        View view = viewArr[0];
        if (view == null || view.getVisibility() != 0) {
            i12 = 0;
        } else {
            viewArr[0].measure(i10, makeMeasureSpec);
            i12 = viewArr[0].getMeasuredHeight();
        }
        View view2 = viewArr[1];
        if (view2 != null && view2.getVisibility() == 0) {
            viewArr[1].measure(i10, makeMeasureSpec);
            i13 = viewArr[1].getMeasuredHeight();
        }
        float f7 = this.c;
        if (f7 > 0.0f) {
            i12 = f7 >= 1.0f ? i13 : AndroidUtilities.lerp(i12, i13, f7);
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        a();
    }
}
