package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ri0 extends LinearLayout {
    public boolean a;

    public ri0(Context context) {
        super(context);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        ni0 ni0Var = null;
        if (this.a) {
            i12 = 0;
        } else {
            i12 = 0;
            for (int i13 = 0; i13 < getChildCount(); i13++) {
                if (getChildAt(i13) instanceof vi0) {
                    ni0Var = ((vi0) getChildAt(i13)).e;
                    if (ni0Var.getAdapter().b() == ni0Var.getChildCount()) {
                        int childCount = ni0Var.getChildCount();
                        for (int i14 = 0; i14 < childCount; i14++) {
                            ni0Var.getChildAt(i14).measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(1000.0f), 0), i11);
                            if (ni0Var.getChildAt(i14).getMeasuredWidth() > i12) {
                                i12 = ni0Var.getChildAt(i14).getMeasuredWidth();
                            }
                        }
                        i12 += org.telegram.messenger.i0.L(16.0f);
                    }
                }
            }
        }
        int size = View.MeasureSpec.getSize(i10);
        if (size < org.telegram.messenger.i0.L(240.0f)) {
            size = org.telegram.messenger.i0.L(240.0f);
        }
        if (size > org.telegram.messenger.i0.L(280.0f)) {
            size = org.telegram.messenger.i0.L(280.0f);
        }
        if (size < 0) {
            size = 0;
        }
        if (i12 == 0 || i12 >= size) {
            i12 = size;
        }
        if (ni0Var != null) {
            for (int i15 = 0; i15 < ni0Var.getChildCount(); i15++) {
                ni0Var.getChildAt(i15).measure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30), i11);
            }
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30), i11);
    }
}
