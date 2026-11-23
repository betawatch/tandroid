package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class m91 extends View {
    public final HashMap a;
    public final /* synthetic */ n91 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m91(n91 n91Var, Activity activity) {
        super(activity);
        this.b = n91Var;
        this.a = new HashMap();
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        int i11;
        int L;
        n91 n91Var = this.b;
        w91 w91Var = n91Var.d;
        int size = View.MeasureSpec.getSize(i7);
        int L2 = org.telegram.messenger.g0.L(64.0f);
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < n91Var.F().size(); i14++) {
            if (n91Var.F().get(i14) != null && ((o91) n91Var.F().get(i14)).c != null) {
                String str = ((o91) n91Var.F().get(i14)).c.title;
                HashMap hashMap = this.a;
                Boolean bool = (Boolean) hashMap.get(str);
                if (bool == null) {
                    int L3 = org.telegram.messenger.g0.L(org.telegram.messenger.gd.a0 ? 18.0f : (w91Var.isInPreviewMode() ? 11 : 50) + 4);
                    if (org.telegram.messenger.gd.a0) {
                        i11 = size - L3;
                        L = org.telegram.messenger.g0.L((w91Var.isInPreviewMode() ? 11 : 50) + 13);
                    } else {
                        i11 = size - L3;
                        L = org.telegram.messenger.g0.L(22.0f);
                    }
                    bool = Boolean.valueOf(org.telegram.ui.ActionBar.n6.B0[0].measureText(str) <= ((float) ((i11 - L) - ((int) Math.ceil((double) org.telegram.ui.ActionBar.n6.I0.measureText("00:00"))))));
                    hashMap.put(str, bool);
                }
                int L4 = org.telegram.messenger.g0.L((!bool.booleanValue() ? 20 : 0) + 64);
                if (((o91) n91Var.F().get(i14)).c.id == 1) {
                    L2 = L4;
                }
                if (((o91) n91Var.F().get(i14)).c.hidden) {
                    i12++;
                }
                i13 += L4;
            }
        }
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(Math.max(0, i12 > 0 ? (((w91Var.O.getMeasuredHeight() - w91Var.O.getPaddingTop()) - w91Var.O.getPaddingBottom()) - i13) + L2 : 0), TLObject.FLAG_30));
    }
}
