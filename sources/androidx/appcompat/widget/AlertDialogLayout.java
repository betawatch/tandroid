package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.WeakHashMap;
import m.v1;
import m.w1;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import r0.j0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public class AlertDialogLayout extends w1 {
    public AlertDialogLayout(Context context) {
        super(context, null, 0);
    }

    public static int i(View view) {
        WeakHashMap weakHashMap = j0.a;
        int minimumHeight = view.getMinimumHeight();
        if (minimumHeight > 0) {
            return minimumHeight;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return i(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x009f  */
    @Override // m.w1, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int d;
        int i14;
        int i15;
        int paddingLeft = getPaddingLeft();
        int i16 = i12 - i10;
        int paddingRight = i16 - getPaddingRight();
        int paddingRight2 = (i16 - paddingLeft) - getPaddingRight();
        int measuredHeight = getMeasuredHeight();
        int childCount = getChildCount();
        int gravity = getGravity();
        int i17 = gravity & 112;
        int i18 = gravity & 8388615;
        int paddingTop = i17 != 16 ? i17 != 80 ? getPaddingTop() : ((getPaddingTop() + i13) - i11) - measuredHeight : (((i13 - i11) - measuredHeight) / 2) + getPaddingTop();
        Drawable dividerDrawable = getDividerDrawable();
        int intrinsicHeight = dividerDrawable == null ? 0 : dividerDrawable.getIntrinsicHeight();
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt = getChildAt(i19);
            if (childAt != null && childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                v1 v1Var = (v1) childAt.getLayoutParams();
                int i20 = ((LinearLayout.LayoutParams) v1Var).gravity;
                if (i20 < 0) {
                    i20 = i18;
                }
                WeakHashMap weakHashMap = j0.a;
                int absoluteGravity = Gravity.getAbsoluteGravity(i20, getLayoutDirection()) & 7;
                if (absoluteGravity == 1) {
                    d = l.d.d(paddingRight2, measuredWidth, 2, paddingLeft) + ((LinearLayout.LayoutParams) v1Var).leftMargin;
                    i14 = ((LinearLayout.LayoutParams) v1Var).rightMargin;
                } else if (absoluteGravity != 5) {
                    i15 = ((LinearLayout.LayoutParams) v1Var).leftMargin + paddingLeft;
                    if (h(i19)) {
                        paddingTop += intrinsicHeight;
                    }
                    int i21 = paddingTop + ((LinearLayout.LayoutParams) v1Var).topMargin;
                    childAt.layout(i15, i21, measuredWidth + i15, i21 + measuredHeight2);
                    paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) v1Var).bottomMargin + i21;
                } else {
                    d = paddingRight - measuredWidth;
                    i14 = ((LinearLayout.LayoutParams) v1Var).rightMargin;
                }
                i15 = d - i14;
                if (h(i19)) {
                }
                int i212 = paddingTop + ((LinearLayout.LayoutParams) v1Var).topMargin;
                childAt.layout(i15, i212, measuredWidth + i15, i212 + measuredHeight2);
                paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) v1Var).bottomMargin + i212;
            }
        }
    }

    @Override // m.w1, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        AlertDialogLayout alertDialogLayout = this;
        int childCount = alertDialogLayout.getChildCount();
        View view = null;
        View view2 = null;
        View view3 = null;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = alertDialogLayout.getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                int id2 = childAt.getId();
                if (id2 == R.id.topPanel) {
                    view = childAt;
                } else if (id2 == R.id.buttonPanel) {
                    view2 = childAt;
                } else {
                    if ((id2 != R.id.contentPanel && id2 != R.id.customPanel) || view3 != null) {
                        super.onMeasure(i10, i11);
                        return;
                    }
                    view3 = childAt;
                }
            }
        }
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i10);
        int paddingBottom = alertDialogLayout.getPaddingBottom() + alertDialogLayout.getPaddingTop();
        if (view != null) {
            view.measure(i10, 0);
            paddingBottom += view.getMeasuredHeight();
            i12 = View.combineMeasuredStates(0, view.getMeasuredState());
        } else {
            i12 = 0;
        }
        if (view2 != null) {
            view2.measure(i10, 0);
            i13 = i(view2);
            i14 = view2.getMeasuredHeight() - i13;
            paddingBottom += i13;
            i12 = View.combineMeasuredStates(i12, view2.getMeasuredState());
        } else {
            i13 = 0;
            i14 = 0;
        }
        if (view3 != null) {
            view3.measure(i10, mode == 0 ? 0 : View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingBottom), mode));
            i15 = view3.getMeasuredHeight();
            paddingBottom += i15;
            i12 = View.combineMeasuredStates(i12, view3.getMeasuredState());
        } else {
            i15 = 0;
        }
        int i17 = size - paddingBottom;
        if (view2 != null) {
            int i18 = paddingBottom - i13;
            int min = Math.min(i17, i14);
            if (min > 0) {
                i17 -= min;
                i13 += min;
            }
            view2.measure(i10, View.MeasureSpec.makeMeasureSpec(i13, TLObject.FLAG_30));
            paddingBottom = i18 + view2.getMeasuredHeight();
            i12 = View.combineMeasuredStates(i12, view2.getMeasuredState());
        }
        if (view3 != null && i17 > 0) {
            view3.measure(i10, View.MeasureSpec.makeMeasureSpec(i15 + i17, mode));
            paddingBottom = (paddingBottom - i15) + view3.getMeasuredHeight();
            i12 = View.combineMeasuredStates(i12, view3.getMeasuredState());
        }
        int i19 = 0;
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt2 = alertDialogLayout.getChildAt(i20);
            if (childAt2.getVisibility() != 8) {
                i19 = Math.max(i19, childAt2.getMeasuredWidth());
            }
        }
        int i21 = i11;
        alertDialogLayout.setMeasuredDimension(View.resolveSizeAndState(alertDialogLayout.getPaddingRight() + alertDialogLayout.getPaddingLeft() + i19, i10, i12), View.resolveSizeAndState(paddingBottom, i21, 0));
        if (mode2 != 1073741824) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(alertDialogLayout.getMeasuredWidth(), TLObject.FLAG_30);
            int i22 = 0;
            while (i22 < childCount) {
                View childAt3 = alertDialogLayout.getChildAt(i22);
                if (childAt3.getVisibility() != 8) {
                    v1 v1Var = (v1) childAt3.getLayoutParams();
                    if (((LinearLayout.LayoutParams) v1Var).width == -1) {
                        int i23 = ((LinearLayout.LayoutParams) v1Var).height;
                        ((LinearLayout.LayoutParams) v1Var).height = childAt3.getMeasuredHeight();
                        alertDialogLayout.measureChildWithMargins(childAt3, makeMeasureSpec, 0, i21, 0);
                        ((LinearLayout.LayoutParams) v1Var).height = i23;
                    }
                }
                i22++;
                alertDialogLayout = this;
                i21 = i11;
            }
        }
    }

    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }
}
