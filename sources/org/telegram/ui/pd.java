package org.telegram.ui;

import android.view.View;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class pd implements View.OnFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pd(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z10) {
        switch (this.a) {
            case 0:
                ai.s sVar = ((ie) this.b).U0;
                float f7 = z10 ? 1.0f : 0.0f;
                sVar.b(f7, f7, true);
                break;
            case 1:
                cy cyVar = (cy) this.b;
                if (z10) {
                    cyVar.Y.b(true);
                    break;
                }
                break;
            case 2:
                dg0 dg0Var = ((md0) this.b).W;
                if (z10) {
                    dg0Var.c.setEditText((EditText) view);
                    dg0Var.c.setDispatchBackWhenEmpty(true);
                    break;
                }
                break;
            case 3:
                org.telegram.ui.Components.sd0 sd0Var = (org.telegram.ui.Components.sd0) this.b;
                float f10 = z10 ? 1.0f : 0.0f;
                sd0Var.b(f10, f10, true);
                break;
            case 4:
                org.telegram.ui.Components.sd0 sd0Var2 = ((vd0) this.b).x;
                float f11 = z10 ? 1.0f : 0.0f;
                sd0Var2.b(f11, f11, true);
                break;
            case 5:
                org.telegram.ui.Components.sd0 sd0Var3 = ((de0) this.b).b;
                float f12 = z10 ? 1.0f : 0.0f;
                sd0Var3.b(f12, f12, true);
                break;
            case 6:
                dg0 dg0Var2 = ((ge0) this.b).y;
                if (z10) {
                    dg0Var2.c.setEditText((EditText) view);
                    dg0Var2.c.setDispatchBackWhenEmpty(true);
                    break;
                }
                break;
            case 7:
                org.telegram.ui.Components.sd0 sd0Var4 = ((re0) this.b).a;
                float f13 = z10 ? 1.0f : 0.0f;
                sd0Var4.b(f13, f13, true);
                break;
            case 8:
                dg0 dg0Var3 = ((hf0) this.b).s0;
                if (z10) {
                    dg0Var3.c.setEditText((EditText) view);
                    dg0Var3.c.setDispatchBackWhenEmpty(true);
                    break;
                }
                break;
            case 9:
                org.telegram.ui.Components.sd0 sd0Var5 = ((cg0) this.b).e;
                float f14 = z10 ? 1.0f : 0.0f;
                sd0Var5.b(f14, f14, true);
                break;
            case 10:
                org.telegram.ui.Components.sd0 sd0Var6 = ((PasscodeActivity) this.b).f;
                float f15 = z10 ? 1.0f : 0.0f;
                sd0Var6.b(f15, f15, true);
                break;
            case 11:
                oc1 oc1Var = (oc1) this.b;
                if (!z10) {
                    oc1Var.d.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ThemeCreateHelp)));
                    break;
                } else {
                    oc1Var.d.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ThemeCreateHelp2)));
                    break;
                }
            default:
                org.telegram.ui.Components.sd0 sd0Var7 = ((TwoStepVerificationActivity) this.b).v;
                float f16 = z10 ? 1.0f : 0.0f;
                sd0Var7.b(f16, f16, true);
                break;
        }
    }
}
