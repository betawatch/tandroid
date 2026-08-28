package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class k1 extends LinearLayout {
    public final /* synthetic */ ActionBarPopupWindow$ActionBarPopupWindowLayout a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, Context context) {
        super(context);
        this.a = actionBarPopupWindow$ActionBarPopupWindowLayout;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (!(view instanceof l1) || this.a.J == null) {
            return super.drawChild(canvas, view, j10);
        }
        return false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        k1 k1Var = this;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = k1Var.a;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout.K) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.A = -1000000;
            actionBarPopupWindow$ActionBarPopupWindowLayout.B = -1000000;
            int childCount = k1Var.getChildCount();
            ArrayList arrayList = null;
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            while (i11 < childCount) {
                View childAt = k1Var.getChildAt(i11);
                if (childAt.getVisibility() != 8) {
                    Object tag = childAt.getTag(R.id.width_tag);
                    Object tag2 = childAt.getTag(R.id.object_tag);
                    Object tag3 = childAt.getTag(R.id.fit_width_tag);
                    if (tag != null) {
                        childAt.getLayoutParams().width = -2;
                    }
                    k1Var.measureChildWithMargins(childAt, i9, 0, i10, 0);
                    if (tag3 == null) {
                        boolean z10 = tag instanceof Integer;
                        if (!z10 && tag2 == null) {
                            i12 = Math.max(i12, childAt.getMeasuredWidth());
                        } else if (z10) {
                            i13 = Math.max(((Integer) tag).intValue(), childAt.getMeasuredWidth());
                            actionBarPopupWindow$ActionBarPopupWindowLayout.A = childAt.getMeasuredHeight();
                            actionBarPopupWindow$ActionBarPopupWindowLayout.B = AndroidUtilities.dp(6.0f) + actionBarPopupWindow$ActionBarPopupWindowLayout.A;
                        }
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(childAt);
                }
                i11++;
                k1Var = this;
            }
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i14 = 0; i14 < size; i14++) {
                    ((View) arrayList.get(i14)).getLayoutParams().width = Math.max(i12, i13);
                }
            }
        }
        super.onMeasure(i9, i10);
    }
}
