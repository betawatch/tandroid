package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class me1 extends View {
    public final HashMap a;
    public final /* synthetic */ ne1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public me1(ne1 ne1Var, Activity activity) {
        super(activity);
        this.b = ne1Var;
        this.a = new HashMap();
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int dp;
        ne1 ne1Var = this.b;
        ze1 ze1Var = ne1Var.d;
        int size = View.MeasureSpec.getSize(i10);
        int dp2 = AndroidUtilities.dp(64.0f);
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < ne1Var.F().size(); i15++) {
            if (ne1Var.F().get(i15) != null && ((pe1) ne1Var.F().get(i15)).c != null) {
                String str = ((pe1) ne1Var.F().get(i15)).c.title;
                HashMap hashMap = this.a;
                Boolean bool = (Boolean) hashMap.get(str);
                if (bool == null) {
                    int dp3 = AndroidUtilities.dp(LocaleController.isRTL ? 18.0f : (ze1Var.isInPreviewMode() ? 11 : 50) + 4);
                    if (LocaleController.isRTL) {
                        i12 = size - dp3;
                        dp = AndroidUtilities.dp((ze1Var.isInPreviewMode() ? 11 : 50) + 13);
                    } else {
                        i12 = size - dp3;
                        dp = AndroidUtilities.dp(22.0f);
                    }
                    bool = Boolean.valueOf(org.telegram.ui.ActionBar.g6.B0[0].measureText(str) <= ((float) ((i12 - dp) - ((int) Math.ceil((double) org.telegram.ui.ActionBar.g6.I0.measureText("00:00"))))));
                    hashMap.put(str, bool);
                }
                int dp4 = AndroidUtilities.dp((!bool.booleanValue() ? 20 : 0) + 64);
                if (((pe1) ne1Var.F().get(i15)).c.id == 1) {
                    dp2 = dp4;
                }
                if (((pe1) ne1Var.F().get(i15)).c.hidden) {
                    i13++;
                }
                i14 += dp4;
            }
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.max(0, i13 > 0 ? (((ze1Var.J.getMeasuredHeight() - ze1Var.J.getPaddingTop()) - ze1Var.J.getPaddingBottom()) - i14) + dp2 : 0), TLObject.FLAG_30));
    }
}
