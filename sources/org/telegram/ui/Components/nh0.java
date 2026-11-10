package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class nh0 extends LinearLayout {
    public boolean a;

    public nh0(Context context) {
        super(context);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int i11;
        jh0 jh0Var = null;
        if (this.a) {
            i11 = 0;
        } else {
            i11 = 0;
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                if (getChildAt(i12) instanceof rh0) {
                    jh0Var = ((rh0) getChildAt(i12)).e;
                    if (jh0Var.getAdapter().b() == jh0Var.getChildCount()) {
                        int childCount = jh0Var.getChildCount();
                        for (int i13 = 0; i13 < childCount; i13++) {
                            jh0Var.getChildAt(i13).measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), 0), i10);
                            if (jh0Var.getChildAt(i13).getMeasuredWidth() > i11) {
                                i11 = jh0Var.getChildAt(i13).getMeasuredWidth();
                            }
                        }
                        i11 += org.telegram.messenger.g0.L(16.0f);
                    }
                }
            }
        }
        int size = View.MeasureSpec.getSize(i7);
        if (size < org.telegram.messenger.g0.L(240.0f)) {
            size = org.telegram.messenger.g0.L(240.0f);
        }
        if (size > org.telegram.messenger.g0.L(280.0f)) {
            size = org.telegram.messenger.g0.L(280.0f);
        }
        if (size < 0) {
            size = 0;
        }
        if (i11 == 0 || i11 >= size) {
            i11 = size;
        }
        if (jh0Var != null) {
            for (int i14 = 0; i14 < jh0Var.getChildCount(); i14++) {
                jh0Var.getChildAt(i14).measure(View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30), i10);
            }
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30), i10);
    }
}
