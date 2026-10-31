package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class fb1 extends View {
    public final HashMap a;
    public final /* synthetic */ gb1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fb1(gb1 gb1Var, Activity activity) {
        super(activity);
        this.b = gb1Var;
        this.a = new HashMap();
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int L;
        gb1 gb1Var = this.b;
        pb1 pb1Var = gb1Var.d;
        int size = View.MeasureSpec.getSize(i10);
        int L2 = org.telegram.messenger.i0.L(64.0f);
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < gb1Var.F().size(); i15++) {
            if (gb1Var.F().get(i15) != null && ((hb1) gb1Var.F().get(i15)).c != null) {
                String str = ((hb1) gb1Var.F().get(i15)).c.title;
                HashMap hashMap = this.a;
                Boolean bool = (Boolean) hashMap.get(str);
                if (bool == null) {
                    int L3 = org.telegram.messenger.i0.L(org.telegram.messenger.cd.X ? 18.0f : (pb1Var.isInPreviewMode() ? 11 : 50) + 4);
                    if (org.telegram.messenger.cd.X) {
                        i12 = size - L3;
                        L = org.telegram.messenger.i0.L((pb1Var.isInPreviewMode() ? 11 : 50) + 13);
                    } else {
                        i12 = size - L3;
                        L = org.telegram.messenger.i0.L(22.0f);
                    }
                    bool = Boolean.valueOf(org.telegram.ui.ActionBar.t6.B0[0].measureText(str) <= ((float) ((i12 - L) - ((int) Math.ceil((double) org.telegram.ui.ActionBar.t6.I0.measureText("00:00"))))));
                    hashMap.put(str, bool);
                }
                int L4 = org.telegram.messenger.i0.L((!bool.booleanValue() ? 20 : 0) + 64);
                if (((hb1) gb1Var.F().get(i15)).c.id == 1) {
                    L2 = L4;
                }
                if (((hb1) gb1Var.F().get(i15)).c.hidden) {
                    i13++;
                }
                i14 += L4;
            }
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.max(0, i13 > 0 ? (((pb1Var.N.getMeasuredHeight() - pb1Var.N.getPaddingTop()) - pb1Var.N.getPaddingBottom()) - i14) + L2 : 0), TLObject.FLAG_30));
    }
}
