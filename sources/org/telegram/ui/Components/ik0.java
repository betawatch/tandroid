package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class ik0 extends LinearLayout {
    public boolean a;

    public ik0(Context context) {
        super(context);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        ek0 ek0Var = null;
        if (this.a) {
            i12 = 0;
        } else {
            i12 = 0;
            for (int i13 = 0; i13 < getChildCount(); i13++) {
                if (getChildAt(i13) instanceof mk0) {
                    ek0Var = ((mk0) getChildAt(i13)).e;
                    if (ek0Var.getAdapter().h() == ek0Var.getChildCount()) {
                        int childCount = ek0Var.getChildCount();
                        for (int i14 = 0; i14 < childCount; i14++) {
                            ek0Var.getChildAt(i14).measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), 0), i11);
                            if (ek0Var.getChildAt(i14).getMeasuredWidth() > i12) {
                                i12 = ek0Var.getChildAt(i14).getMeasuredWidth();
                            }
                        }
                        i12 += AndroidUtilities.dp(16.0f);
                    }
                }
            }
        }
        int size = View.MeasureSpec.getSize(i10);
        if (size < AndroidUtilities.dp(240.0f)) {
            size = AndroidUtilities.dp(240.0f);
        }
        if (size > AndroidUtilities.dp(280.0f)) {
            size = AndroidUtilities.dp(280.0f);
        }
        if (size < 0) {
            size = 0;
        }
        if (i12 == 0 || i12 >= size) {
            i12 = size;
        }
        if (ek0Var != null) {
            for (int i15 = 0; i15 < ek0Var.getChildCount(); i15++) {
                ek0Var.getChildAt(i15).measure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30), i11);
            }
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30), i11);
    }
}
