package org.telegram.ui;

import android.view.View;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class od implements View.OnFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ od(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z10) {
        switch (this.a) {
            case 0:
                yd ydVar = ((je) this.b).U0;
                float f7 = z10 ? 1.0f : 0.0f;
                ydVar.b(f7, f7, true);
                break;
            case 1:
                qy qyVar = (qy) this.b;
                if (z10) {
                    qyVar.Y.b(true);
                    break;
                }
                break;
            case 2:
                qg0 qg0Var = ((ae0) this.b).W;
                if (z10) {
                    qg0Var.c.setEditText((EditText) view);
                    qg0Var.c.setDispatchBackWhenEmpty(true);
                    break;
                }
                break;
            case 3:
                org.telegram.ui.Components.jd0 jd0Var = (org.telegram.ui.Components.jd0) this.b;
                float f10 = z10 ? 1.0f : 0.0f;
                jd0Var.b(f10, f10, true);
                break;
            case 4:
                org.telegram.ui.Components.jd0 jd0Var2 = ((je0) this.b).x;
                float f11 = z10 ? 1.0f : 0.0f;
                jd0Var2.b(f11, f11, true);
                break;
            case 5:
                org.telegram.ui.Components.jd0 jd0Var3 = ((re0) this.b).b;
                float f12 = z10 ? 1.0f : 0.0f;
                jd0Var3.b(f12, f12, true);
                break;
            case 6:
                qg0 qg0Var2 = ((ue0) this.b).y;
                if (z10) {
                    qg0Var2.c.setEditText((EditText) view);
                    qg0Var2.c.setDispatchBackWhenEmpty(true);
                    break;
                }
                break;
            case 7:
                org.telegram.ui.Components.jd0 jd0Var4 = ((ff0) this.b).a;
                float f13 = z10 ? 1.0f : 0.0f;
                jd0Var4.b(f13, f13, true);
                break;
            case 8:
                qg0 qg0Var3 = ((tf0) this.b).s0;
                if (z10) {
                    qg0Var3.c.setEditText((EditText) view);
                    qg0Var3.c.setDispatchBackWhenEmpty(true);
                    break;
                }
                break;
            case 9:
                org.telegram.ui.Components.jd0 jd0Var5 = ((pg0) this.b).e;
                float f14 = z10 ? 1.0f : 0.0f;
                jd0Var5.b(f14, f14, true);
                break;
            case 10:
                org.telegram.ui.Components.jd0 jd0Var6 = ((PasscodeActivity) this.b).f;
                float f15 = z10 ? 1.0f : 0.0f;
                jd0Var6.b(f15, f15, true);
                break;
            case 11:
                td1 td1Var = (td1) this.b;
                if (!z10) {
                    td1Var.d.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ThemeCreateHelp)));
                    break;
                } else {
                    td1Var.d.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ThemeCreateHelp2)));
                    break;
                }
            default:
                org.telegram.ui.Components.jd0 jd0Var7 = ((TwoStepVerificationActivity) this.b).v;
                float f16 = z10 ? 1.0f : 0.0f;
                jd0Var7.b(f16, f16, true);
                break;
        }
    }
}
