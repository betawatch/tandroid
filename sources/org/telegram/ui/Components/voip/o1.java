package org.telegram.ui.Components.voip;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
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
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        if (this.e) {
            int childCount = (int) (((getChildCount() - this.a) / 2.0f) * ((this.c * 2) + this.b));
            for (int i13 = 0; i13 < getChildCount(); i13++) {
                View childAt = getChildAt(i13);
                if (childAt.getVisibility() != 8) {
                    int i14 = this.c;
                    childAt.layout(childCount + i14, 0, childAt.getMeasuredWidth() + i14 + childCount, childAt.getMeasuredHeight());
                    childCount = childAt.getMeasuredWidth() + (this.c * 2) + childCount;
                }
            }
            return;
        }
        int measuredWidth = this.a > 0 ? (getMeasuredWidth() - this.b) / (this.a - 1) : 0;
        int i15 = 0;
        for (int i16 = 0; i16 < getChildCount(); i16++) {
            View childAt2 = getChildAt(i16);
            if (childAt2.getVisibility() != 8) {
                int i17 = i15 * measuredWidth;
                childAt2.layout(i17, 0, childAt2.getMeasuredWidth() + i17, childAt2.getMeasuredHeight());
                i15++;
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        int size = View.MeasureSpec.getSize(i9);
        this.a = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if (getChildAt(i11).getVisibility() != 8) {
                this.a++;
            }
        }
        this.b = AndroidUtilities.dp(this.d);
        this.c = ((size / getChildCount()) - this.b) / 2;
        int i12 = 0;
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            if (getChildAt(i13).getVisibility() != 8) {
                getChildAt(i13).measure(View.MeasureSpec.makeMeasureSpec(this.b, TLObject.FLAG_30), i10);
                if (getChildAt(i13).getMeasuredHeight() > i12) {
                    i12 = getChildAt(i13).getMeasuredHeight();
                }
            }
        }
        setMeasuredDimension(size, Math.max(i12, AndroidUtilities.dp(80.0f)));
    }

    public void setChildSize(int i9) {
        this.d = i9;
    }

    public void setUseStartPadding(boolean z10) {
        this.e = z10;
    }
}
