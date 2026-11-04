package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class c91 extends View {
    public final HashMap a;
    public final /* synthetic */ d91 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c91(d91 d91Var, Activity activity) {
        super(activity);
        this.b = d91Var;
        this.a = new HashMap();
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i10) {
        int i11;
        int L;
        d91 d91Var = this.b;
        m91 m91Var = d91Var.d;
        int size = View.MeasureSpec.getSize(i3);
        int L2 = org.telegram.messenger.g0.L(64.0f);
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < d91Var.F().size(); i14++) {
            if (d91Var.F().get(i14) != null && ((e91) d91Var.F().get(i14)).c != null) {
                String str = ((e91) d91Var.F().get(i14)).c.title;
                HashMap hashMap = this.a;
                Boolean bool = (Boolean) hashMap.get(str);
                if (bool == null) {
                    int L3 = org.telegram.messenger.g0.L(org.telegram.messenger.bd.a0 ? 18.0f : (m91Var.isInPreviewMode() ? 11 : 50) + 4);
                    if (org.telegram.messenger.bd.a0) {
                        i11 = size - L3;
                        L = org.telegram.messenger.g0.L((m91Var.isInPreviewMode() ? 11 : 50) + 13);
                    } else {
                        i11 = size - L3;
                        L = org.telegram.messenger.g0.L(22.0f);
                    }
                    bool = Boolean.valueOf(org.telegram.ui.ActionBar.k6.B0[0].measureText(str) <= ((float) ((i11 - L) - ((int) Math.ceil((double) org.telegram.ui.ActionBar.k6.I0.measureText("00:00"))))));
                    hashMap.put(str, bool);
                }
                int L4 = org.telegram.messenger.g0.L((!bool.booleanValue() ? 20 : 0) + 64);
                if (((e91) d91Var.F().get(i14)).c.id == 1) {
                    L2 = L4;
                }
                if (((e91) d91Var.F().get(i14)).c.hidden) {
                    i12++;
                }
                i13 += L4;
            }
        }
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(Math.max(0, i12 > 0 ? (((m91Var.O.getMeasuredHeight() - m91Var.O.getPaddingTop()) - m91Var.O.getPaddingBottom()) - i13) + L2 : 0), TLObject.FLAG_30));
    }
}
