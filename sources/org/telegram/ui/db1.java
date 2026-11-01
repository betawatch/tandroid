package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class db1 extends View {
    public final HashMap a;
    public final /* synthetic */ eb1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public db1(eb1 eb1Var, Activity activity) {
        super(activity);
        this.b = eb1Var;
        this.a = new HashMap();
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int L;
        eb1 eb1Var = this.b;
        nb1 nb1Var = eb1Var.d;
        int size = View.MeasureSpec.getSize(i10);
        int L2 = org.telegram.messenger.i0.L(64.0f);
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < eb1Var.F().size(); i15++) {
            if (eb1Var.F().get(i15) != null && ((fb1) eb1Var.F().get(i15)).c != null) {
                String str = ((fb1) eb1Var.F().get(i15)).c.title;
                HashMap hashMap = this.a;
                Boolean bool = (Boolean) hashMap.get(str);
                if (bool == null) {
                    int L3 = org.telegram.messenger.i0.L(org.telegram.messenger.dd.X ? 18.0f : (nb1Var.isInPreviewMode() ? 11 : 50) + 4);
                    if (org.telegram.messenger.dd.X) {
                        i12 = size - L3;
                        L = org.telegram.messenger.i0.L((nb1Var.isInPreviewMode() ? 11 : 50) + 13);
                    } else {
                        i12 = size - L3;
                        L = org.telegram.messenger.i0.L(22.0f);
                    }
                    bool = Boolean.valueOf(org.telegram.ui.ActionBar.t6.B0[0].measureText(str) <= ((float) ((i12 - L) - ((int) Math.ceil((double) org.telegram.ui.ActionBar.t6.I0.measureText("00:00"))))));
                    hashMap.put(str, bool);
                }
                int L4 = org.telegram.messenger.i0.L((!bool.booleanValue() ? 20 : 0) + 64);
                if (((fb1) eb1Var.F().get(i15)).c.id == 1) {
                    L2 = L4;
                }
                if (((fb1) eb1Var.F().get(i15)).c.hidden) {
                    i13++;
                }
                i14 += L4;
            }
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.max(0, i13 > 0 ? (((nb1Var.N.getMeasuredHeight() - nb1Var.N.getPaddingTop()) - nb1Var.N.getPaddingBottom()) - i14) + L2 : 0), TLObject.FLAG_30));
    }
}
