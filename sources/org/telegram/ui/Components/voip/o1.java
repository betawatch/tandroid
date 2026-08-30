package org.telegram.ui.Components.voip;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class o1 extends FrameLayout {
    public int a;
    public int b;
    public int c;
    public int d;
    public boolean e;

    public o1(Context context) {
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
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        if (this.e) {
            int childCount = (int) (((getChildCount() - this.a) / 2.0f) * ((this.c * 2) + this.b));
            for (int i14 = 0; i14 < getChildCount(); i14++) {
                View childAt = getChildAt(i14);
                if (childAt.getVisibility() != 8) {
                    int i15 = this.c;
                    childAt.layout(childCount + i15, 0, childAt.getMeasuredWidth() + i15 + childCount, childAt.getMeasuredHeight());
                    childCount = childAt.getMeasuredWidth() + (this.c * 2) + childCount;
                }
            }
            return;
        }
        int measuredWidth = this.a > 0 ? (getMeasuredWidth() - this.b) / (this.a - 1) : 0;
        int i16 = 0;
        for (int i17 = 0; i17 < getChildCount(); i17++) {
            View childAt2 = getChildAt(i17);
            if (childAt2.getVisibility() != 8) {
                int i18 = i16 * measuredWidth;
                childAt2.layout(i18, 0, childAt2.getMeasuredWidth() + i18, childAt2.getMeasuredHeight());
                i16++;
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        this.a = 0;
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            if (getChildAt(i12).getVisibility() != 8) {
                this.a++;
            }
        }
        this.b = AndroidUtilities.dp(this.d);
        this.c = ((size / getChildCount()) - this.b) / 2;
        int i13 = 0;
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            if (getChildAt(i14).getVisibility() != 8) {
                getChildAt(i14).measure(View.MeasureSpec.makeMeasureSpec(this.b, TLObject.FLAG_30), i11);
                if (getChildAt(i14).getMeasuredHeight() > i13) {
                    i13 = getChildAt(i14).getMeasuredHeight();
                }
            }
        }
        setMeasuredDimension(size, Math.max(i13, AndroidUtilities.dp(80.0f)));
    }

    public void setChildSize(int i10) {
        this.d = i10;
    }

    public void setUseStartPadding(boolean z4) {
        this.e = z4;
    }
}
