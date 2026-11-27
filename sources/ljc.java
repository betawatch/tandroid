// default package

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class ljc extends FrameLayout {
    public int a;
    public int b;
    public int c;
    public int d;
    public boolean e;

    public ljc(Context context) {
        super(context);
        this.d = 68;
        this.e = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (isEnabled()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.e) {
            int childCount = (int) (((getChildCount() - this.a) / 2.0f) * (this.b + (this.c << 1)));
            for (int i5 = 0; i5 < getChildCount(); i5++) {
                View childAt = getChildAt(i5);
                if (childAt.getVisibility() != 8) {
                    int i6 = this.c;
                    childAt.layout(childCount + i6, 0, childAt.getMeasuredWidth() + i6 + childCount, childAt.getMeasuredHeight());
                    childCount = childAt.getMeasuredWidth() + (this.c << 1) + childCount;
                }
            }
            return;
        }
        int measuredWidth = this.a > 0 ? (getMeasuredWidth() - this.b) / (this.a - 1) : 0;
        int i7 = 0;
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            View childAt2 = getChildAt(i8);
            if (childAt2.getVisibility() != 8) {
                int i9 = i7 * measuredWidth;
                childAt2.layout(i9, 0, childAt2.getMeasuredWidth() + i9, childAt2.getMeasuredHeight());
                i7++;
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        this.a = 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            if (getChildAt(i3).getVisibility() != 8) {
                this.a++;
            }
        }
        this.b = hl.L(this.d);
        this.c = ((size / getChildCount()) - this.b) / 2;
        int i4 = 0;
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            if (getChildAt(i5).getVisibility() != 8) {
                getChildAt(i5).measure(View.MeasureSpec.makeMeasureSpec(this.b, TLObject.FLAG_30), i2);
                if (getChildAt(i5).getMeasuredHeight() > i4) {
                    i4 = getChildAt(i5).getMeasuredHeight();
                }
            }
        }
        setMeasuredDimension(size, Math.max(i4, hl.L(80.0f)));
    }

    public void setChildSize(int i) {
        this.d = i;
    }

    public void setUseStartPadding(boolean z) {
        this.e = z;
    }
}
