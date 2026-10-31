package org.telegram.ui;

import android.view.View;
import android.widget.EditText;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
        float f7;
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                yd ydVar = ((le) obj).K0;
                f7 = z10 ? 1.0f : 0.0f;
                ydVar.b(f7, f7, true);
                break;
            case 1:
                ay ayVar = (ay) obj;
                if (z10) {
                    ayVar.Y.b(true);
                    break;
                }
                break;
            case 2:
                hf0 hf0Var = ((wc0) obj).W;
                if (z10) {
                    hf0Var.c.setEditText((EditText) view);
                    hf0Var.c.setDispatchBackWhenEmpty(true);
                    break;
                }
                break;
            case 3:
                org.telegram.ui.Components.ec0 ec0Var = (org.telegram.ui.Components.ec0) obj;
                f7 = z10 ? 1.0f : 0.0f;
                ec0Var.b(f7, f7, true);
                break;
            case 4:
                org.telegram.ui.Components.ec0 ec0Var2 = ((ed0) obj).y;
                f7 = z10 ? 1.0f : 0.0f;
                ec0Var2.b(f7, f7, true);
                break;
            case 5:
                org.telegram.ui.Components.ec0 ec0Var3 = ((ld0) obj).b;
                f7 = z10 ? 1.0f : 0.0f;
                ec0Var3.b(f7, f7, true);
                break;
            case 6:
                hf0 hf0Var2 = ((od0) obj).D;
                if (z10) {
                    hf0Var2.c.setEditText((EditText) view);
                    hf0Var2.c.setDispatchBackWhenEmpty(true);
                    break;
                }
                break;
            case 7:
                org.telegram.ui.Components.ec0 ec0Var4 = ((zd0) obj).a;
                f7 = z10 ? 1.0f : 0.0f;
                ec0Var4.b(f7, f7, true);
                break;
            case 8:
                hf0 hf0Var3 = ((me0) obj).u0;
                if (z10) {
                    hf0Var3.c.setEditText((EditText) view);
                    hf0Var3.c.setDispatchBackWhenEmpty(true);
                    break;
                }
                break;
            case 9:
                org.telegram.ui.Components.ec0 ec0Var5 = ((gf0) obj).e;
                f7 = z10 ? 1.0f : 0.0f;
                ec0Var5.b(f7, f7, true);
                break;
            case 10:
                org.telegram.ui.Components.ec0 ec0Var6 = ((PasscodeActivity) obj).f;
                f7 = z10 ? 1.0f : 0.0f;
                ec0Var6.b(f7, f7, true);
                break;
            case 11:
                p91 p91Var = (p91) obj;
                if (!z10) {
                    p91Var.d.setText(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131744210, null)));
                    break;
                } else {
                    p91Var.d.setText(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131744209, null)));
                    break;
                }
            default:
                org.telegram.ui.Components.ec0 ec0Var7 = ((TwoStepVerificationActivity) obj).w;
                f7 = z10 ? 1.0f : 0.0f;
                ec0Var7.b(f7, f7, true);
                break;
        }
    }
}
