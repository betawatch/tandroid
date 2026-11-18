package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class ai0 extends LinearLayout {
    public boolean a;

    public ai0(Context context) {
        super(context);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int i11;
        wh0 wh0Var = null;
        if (this.a) {
            i11 = 0;
        } else {
            i11 = 0;
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                if (getChildAt(i12) instanceof ei0) {
                    wh0Var = ((ei0) getChildAt(i12)).e;
                    if (wh0Var.getAdapter().b() == wh0Var.getChildCount()) {
                        int childCount = wh0Var.getChildCount();
                        for (int i13 = 0; i13 < childCount; i13++) {
                            wh0Var.getChildAt(i13).measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), 0), i10);
                            if (wh0Var.getChildAt(i13).getMeasuredWidth() > i11) {
                                i11 = wh0Var.getChildAt(i13).getMeasuredWidth();
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
        if (wh0Var != null) {
            for (int i14 = 0; i14 < wh0Var.getChildCount(); i14++) {
                wh0Var.getChildAt(i14).measure(View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30), i10);
            }
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30), i10);
    }
}
