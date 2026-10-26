package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class lk0 extends LinearLayout {
    public boolean a;

    public lk0(Context context) {
        super(context);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        hk0 hk0Var = null;
        if (this.a) {
            i12 = 0;
        } else {
            i12 = 0;
            for (int i13 = 0; i13 < getChildCount(); i13++) {
                if (getChildAt(i13) instanceof pk0) {
                    hk0Var = ((pk0) getChildAt(i13)).e;
                    if (hk0Var.getAdapter().h() == hk0Var.getChildCount()) {
                        int childCount = hk0Var.getChildCount();
                        for (int i14 = 0; i14 < childCount; i14++) {
                            hk0Var.getChildAt(i14).measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), 0), i11);
                            if (hk0Var.getChildAt(i14).getMeasuredWidth() > i12) {
                                i12 = hk0Var.getChildAt(i14).getMeasuredWidth();
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
        if (hk0Var != null) {
            for (int i15 = 0; i15 < hk0Var.getChildCount(); i15++) {
                hk0Var.getChildAt(i15).measure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30), i11);
            }
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30), i11);
    }
}
