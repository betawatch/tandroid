package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class k91 extends View {
    public final HashMap a;
    public final /* synthetic */ l91 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k91(l91 l91Var, Activity activity) {
        super(activity);
        this.b = l91Var;
        this.a = new HashMap();
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        int i11;
        int L;
        l91 l91Var = this.b;
        u91 u91Var = l91Var.d;
        int size = View.MeasureSpec.getSize(i7);
        int L2 = org.telegram.messenger.g0.L(64.0f);
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < l91Var.F().size(); i14++) {
            if (l91Var.F().get(i14) != null && ((m91) l91Var.F().get(i14)).c != null) {
                String str = ((m91) l91Var.F().get(i14)).c.title;
                HashMap hashMap = this.a;
                Boolean bool = (Boolean) hashMap.get(str);
                if (bool == null) {
                    int L3 = org.telegram.messenger.g0.L(org.telegram.messenger.hd.a0 ? 18.0f : (u91Var.isInPreviewMode() ? 11 : 50) + 4);
                    if (org.telegram.messenger.hd.a0) {
                        i11 = size - L3;
                        L = org.telegram.messenger.g0.L((u91Var.isInPreviewMode() ? 11 : 50) + 13);
                    } else {
                        i11 = size - L3;
                        L = org.telegram.messenger.g0.L(22.0f);
                    }
                    bool = Boolean.valueOf(org.telegram.ui.ActionBar.j6.B0[0].measureText(str) <= ((float) ((i11 - L) - ((int) Math.ceil((double) org.telegram.ui.ActionBar.j6.I0.measureText("00:00"))))));
                    hashMap.put(str, bool);
                }
                int L4 = org.telegram.messenger.g0.L((!bool.booleanValue() ? 20 : 0) + 64);
                if (((m91) l91Var.F().get(i14)).c.id == 1) {
                    L2 = L4;
                }
                if (((m91) l91Var.F().get(i14)).c.hidden) {
                    i12++;
                }
                i13 += L4;
            }
        }
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(Math.max(0, i12 > 0 ? (((u91Var.O.getMeasuredHeight() - u91Var.O.getPaddingTop()) - u91Var.O.getPaddingBottom()) - i13) + L2 : 0), TLObject.FLAG_30));
    }
}
