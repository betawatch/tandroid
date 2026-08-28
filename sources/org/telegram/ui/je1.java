package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class je1 extends View {
    public final HashMap a;
    public final /* synthetic */ ke1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public je1(ke1 ke1Var, Activity activity) {
        super(activity);
        this.b = ke1Var;
        this.a = new HashMap();
    }

    @Override // android.view.View
    public final void onMeasure(int i9, int i10) {
        int i11;
        int dp;
        ke1 ke1Var = this.b;
        we1 we1Var = ke1Var.d;
        int size = View.MeasureSpec.getSize(i9);
        int dp2 = AndroidUtilities.dp(64.0f);
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < ke1Var.F().size(); i14++) {
            if (ke1Var.F().get(i14) != null && ((me1) ke1Var.F().get(i14)).c != null) {
                String str = ((me1) ke1Var.F().get(i14)).c.title;
                HashMap hashMap = this.a;
                Boolean bool = (Boolean) hashMap.get(str);
                if (bool == null) {
                    int dp3 = AndroidUtilities.dp(LocaleController.isRTL ? 18.0f : (we1Var.isInPreviewMode() ? 11 : 50) + 4);
                    if (LocaleController.isRTL) {
                        i11 = size - dp3;
                        dp = AndroidUtilities.dp((we1Var.isInPreviewMode() ? 11 : 50) + 13);
                    } else {
                        i11 = size - dp3;
                        dp = AndroidUtilities.dp(22.0f);
                    }
                    bool = Boolean.valueOf(org.telegram.ui.ActionBar.f6.B0[0].measureText(str) <= ((float) ((i11 - dp) - ((int) Math.ceil((double) org.telegram.ui.ActionBar.f6.I0.measureText("00:00"))))));
                    hashMap.put(str, bool);
                }
                int dp4 = AndroidUtilities.dp((!bool.booleanValue() ? 20 : 0) + 64);
                if (((me1) ke1Var.F().get(i14)).c.id == 1) {
                    dp2 = dp4;
                }
                if (((me1) ke1Var.F().get(i14)).c.hidden) {
                    i12++;
                }
                i13 += dp4;
            }
        }
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(Math.max(0, i12 > 0 ? (((we1Var.J.getMeasuredHeight() - we1Var.J.getPaddingTop()) - we1Var.J.getPaddingBottom()) - i13) + dp2 : 0), TLObject.FLAG_30));
    }
}
