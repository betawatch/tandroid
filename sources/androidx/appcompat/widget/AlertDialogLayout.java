package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import j3.r0;
import java.util.WeakHashMap;
import m.w1;
import m.x1;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import r0.j0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class AlertDialogLayout extends x1 {
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
    @Override // m.x1, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int d;
        int i13;
        int i14;
        int paddingLeft = getPaddingLeft();
        int i15 = i11 - i9;
        int paddingRight = i15 - getPaddingRight();
        int paddingRight2 = (i15 - paddingLeft) - getPaddingRight();
        int measuredHeight = getMeasuredHeight();
        int childCount = getChildCount();
        int gravity = getGravity();
        int i16 = gravity & 112;
        int i17 = gravity & 8388615;
        int paddingTop = i16 != 16 ? i16 != 80 ? getPaddingTop() : ((getPaddingTop() + i12) - i10) - measuredHeight : (((i12 - i10) - measuredHeight) / 2) + getPaddingTop();
        Drawable dividerDrawable = getDividerDrawable();
        int intrinsicHeight = dividerDrawable == null ? 0 : dividerDrawable.getIntrinsicHeight();
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt = getChildAt(i18);
            if (childAt != null && childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                w1 w1Var = (w1) childAt.getLayoutParams();
                int i19 = ((LinearLayout.LayoutParams) w1Var).gravity;
                if (i19 < 0) {
                    i19 = i17;
                }
                WeakHashMap weakHashMap = j0.a;
                int absoluteGravity = Gravity.getAbsoluteGravity(i19, getLayoutDirection()) & 7;
                if (absoluteGravity == 1) {
                    d = r0.d(paddingRight2, measuredWidth, 2, paddingLeft) + ((LinearLayout.LayoutParams) w1Var).leftMargin;
                    i13 = ((LinearLayout.LayoutParams) w1Var).rightMargin;
                } else if (absoluteGravity != 5) {
                    i14 = ((LinearLayout.LayoutParams) w1Var).leftMargin + paddingLeft;
                    if (h(i18)) {
                        paddingTop += intrinsicHeight;
                    }
                    int i20 = paddingTop + ((LinearLayout.LayoutParams) w1Var).topMargin;
                    childAt.layout(i14, i20, measuredWidth + i14, i20 + measuredHeight2);
                    paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) w1Var).bottomMargin + i20;
                } else {
                    d = paddingRight - measuredWidth;
                    i13 = ((LinearLayout.LayoutParams) w1Var).rightMargin;
                }
                i14 = d - i13;
                if (h(i18)) {
                }
                int i202 = paddingTop + ((LinearLayout.LayoutParams) w1Var).topMargin;
                childAt.layout(i14, i202, measuredWidth + i14, i202 + measuredHeight2);
                paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) w1Var).bottomMargin + i202;
            }
        }
    }

    @Override // m.x1, android.view.View
    public final void onMeasure(int i9, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        AlertDialogLayout alertDialogLayout = this;
        int childCount = alertDialogLayout.getChildCount();
        View view = null;
        View view2 = null;
        View view3 = null;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = alertDialogLayout.getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                int id2 = childAt.getId();
                if (id2 == R.id.topPanel) {
                    view = childAt;
                } else if (id2 == R.id.buttonPanel) {
                    view2 = childAt;
                } else {
                    if ((id2 != R.id.contentPanel && id2 != R.id.customPanel) || view3 != null) {
                        super.onMeasure(i9, i10);
                        return;
                    }
                    view3 = childAt;
                }
            }
        }
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i9);
        int paddingBottom = alertDialogLayout.getPaddingBottom() + alertDialogLayout.getPaddingTop();
        if (view != null) {
            view.measure(i9, 0);
            paddingBottom += view.getMeasuredHeight();
            i11 = View.combineMeasuredStates(0, view.getMeasuredState());
        } else {
            i11 = 0;
        }
        if (view2 != null) {
            view2.measure(i9, 0);
            i12 = i(view2);
            i13 = view2.getMeasuredHeight() - i12;
            paddingBottom += i12;
            i11 = View.combineMeasuredStates(i11, view2.getMeasuredState());
        } else {
            i12 = 0;
            i13 = 0;
        }
        if (view3 != null) {
            view3.measure(i9, mode == 0 ? 0 : View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingBottom), mode));
            i14 = view3.getMeasuredHeight();
            paddingBottom += i14;
            i11 = View.combineMeasuredStates(i11, view3.getMeasuredState());
        } else {
            i14 = 0;
        }
        int i16 = size - paddingBottom;
        if (view2 != null) {
            int i17 = paddingBottom - i12;
            int min = Math.min(i16, i13);
            if (min > 0) {
                i16 -= min;
                i12 += min;
            }
            view2.measure(i9, View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30));
            paddingBottom = i17 + view2.getMeasuredHeight();
            i11 = View.combineMeasuredStates(i11, view2.getMeasuredState());
        }
        if (view3 != null && i16 > 0) {
            view3.measure(i9, View.MeasureSpec.makeMeasureSpec(i14 + i16, mode));
            paddingBottom = (paddingBottom - i14) + view3.getMeasuredHeight();
            i11 = View.combineMeasuredStates(i11, view3.getMeasuredState());
        }
        int i18 = 0;
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt2 = alertDialogLayout.getChildAt(i19);
            if (childAt2.getVisibility() != 8) {
                i18 = Math.max(i18, childAt2.getMeasuredWidth());
            }
        }
        int i20 = i10;
        alertDialogLayout.setMeasuredDimension(View.resolveSizeAndState(alertDialogLayout.getPaddingRight() + alertDialogLayout.getPaddingLeft() + i18, i9, i11), View.resolveSizeAndState(paddingBottom, i20, 0));
        if (mode2 != 1073741824) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(alertDialogLayout.getMeasuredWidth(), TLObject.FLAG_30);
            int i21 = 0;
            while (i21 < childCount) {
                View childAt3 = alertDialogLayout.getChildAt(i21);
                if (childAt3.getVisibility() != 8) {
                    w1 w1Var = (w1) childAt3.getLayoutParams();
                    if (((LinearLayout.LayoutParams) w1Var).width == -1) {
                        int i22 = ((LinearLayout.LayoutParams) w1Var).height;
                        ((LinearLayout.LayoutParams) w1Var).height = childAt3.getMeasuredHeight();
                        alertDialogLayout.measureChildWithMargins(childAt3, makeMeasureSpec, 0, i20, 0);
                        ((LinearLayout.LayoutParams) w1Var).height = i22;
                    }
                }
                i21++;
                alertDialogLayout = this;
                i20 = i10;
            }
        }
    }

    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }
}
