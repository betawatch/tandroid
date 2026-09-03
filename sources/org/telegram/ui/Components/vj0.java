package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class vj0 extends LinearLayout {
    public boolean a;

    public vj0(Context context) {
        super(context);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        rj0 rj0Var = null;
        if (this.a) {
            i12 = 0;
        } else {
            i12 = 0;
            for (int i13 = 0; i13 < getChildCount(); i13++) {
                if (getChildAt(i13) instanceof zj0) {
                    rj0Var = ((zj0) getChildAt(i13)).e;
                    if (rj0Var.getAdapter().h() == rj0Var.getChildCount()) {
                        int childCount = rj0Var.getChildCount();
                        for (int i14 = 0; i14 < childCount; i14++) {
                            rj0Var.getChildAt(i14).measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), 0), i11);
                            if (rj0Var.getChildAt(i14).getMeasuredWidth() > i12) {
                                i12 = rj0Var.getChildAt(i14).getMeasuredWidth();
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
        if (rj0Var != null) {
            for (int i15 = 0; i15 < rj0Var.getChildCount(); i15++) {
                rj0Var.getChildAt(i15).measure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30), i11);
            }
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30), i11);
    }
}
