package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class p91 extends View {
    public final HashMap a;
    public final /* synthetic */ q91 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p91(q91 q91Var, Activity activity) {
        super(activity);
        this.b = q91Var;
        this.a = new HashMap();
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        int i11;
        int L;
        q91 q91Var = this.b;
        z91 z91Var = q91Var.d;
        int size = View.MeasureSpec.getSize(i7);
        int L2 = org.telegram.messenger.g0.L(64.0f);
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < q91Var.F().size(); i14++) {
            if (q91Var.F().get(i14) != null && ((r91) q91Var.F().get(i14)).c != null) {
                String str = ((r91) q91Var.F().get(i14)).c.title;
                HashMap hashMap = this.a;
                Boolean bool = (Boolean) hashMap.get(str);
                if (bool == null) {
                    int L3 = org.telegram.messenger.g0.L(org.telegram.messenger.id.a0 ? 18.0f : (z91Var.isInPreviewMode() ? 11 : 50) + 4);
                    if (org.telegram.messenger.id.a0) {
                        i11 = size - L3;
                        L = org.telegram.messenger.g0.L((z91Var.isInPreviewMode() ? 11 : 50) + 13);
                    } else {
                        i11 = size - L3;
                        L = org.telegram.messenger.g0.L(22.0f);
                    }
                    bool = Boolean.valueOf(org.telegram.ui.ActionBar.m6.B0[0].measureText(str) <= ((float) ((i11 - L) - ((int) Math.ceil((double) org.telegram.ui.ActionBar.m6.I0.measureText("00:00"))))));
                    hashMap.put(str, bool);
                }
                int L4 = org.telegram.messenger.g0.L((!bool.booleanValue() ? 20 : 0) + 64);
                if (((r91) q91Var.F().get(i14)).c.id == 1) {
                    L2 = L4;
                }
                if (((r91) q91Var.F().get(i14)).c.hidden) {
                    i12++;
                }
                i13 += L4;
            }
        }
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(Math.max(0, i12 > 0 ? (((z91Var.N.getMeasuredHeight() - z91Var.N.getPaddingTop()) - z91Var.N.getPaddingBottom()) - i13) + L2 : 0), TLObject.FLAG_30));
    }
}
