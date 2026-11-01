package org.telegram.ui;

import android.view.View;
import android.widget.EditText;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
                zx zxVar = (zx) obj;
                if (z10) {
                    zxVar.Y.b(true);
                    break;
                }
                break;
            case 2:
                gf0 gf0Var = ((vc0) obj).W;
                if (z10) {
                    gf0Var.c.setEditText((EditText) view);
                    gf0Var.c.setDispatchBackWhenEmpty(true);
                    break;
                }
                break;
            case 3:
                org.telegram.ui.Components.ec0 ec0Var = (org.telegram.ui.Components.ec0) obj;
                f7 = z10 ? 1.0f : 0.0f;
                ec0Var.b(f7, f7, true);
                break;
            case 4:
                org.telegram.ui.Components.ec0 ec0Var2 = ((dd0) obj).y;
                f7 = z10 ? 1.0f : 0.0f;
                ec0Var2.b(f7, f7, true);
                break;
            case 5:
                org.telegram.ui.Components.ec0 ec0Var3 = ((kd0) obj).b;
                f7 = z10 ? 1.0f : 0.0f;
                ec0Var3.b(f7, f7, true);
                break;
            case 6:
                gf0 gf0Var2 = ((nd0) obj).D;
                if (z10) {
                    gf0Var2.c.setEditText((EditText) view);
                    gf0Var2.c.setDispatchBackWhenEmpty(true);
                    break;
                }
                break;
            case 7:
                org.telegram.ui.Components.ec0 ec0Var4 = ((yd0) obj).a;
                f7 = z10 ? 1.0f : 0.0f;
                ec0Var4.b(f7, f7, true);
                break;
            case 8:
                gf0 gf0Var3 = ((le0) obj).u0;
                if (z10) {
                    gf0Var3.c.setEditText((EditText) view);
                    gf0Var3.c.setDispatchBackWhenEmpty(true);
                    break;
                }
                break;
            case 9:
                org.telegram.ui.Components.ec0 ec0Var5 = ((ff0) obj).e;
                f7 = z10 ? 1.0f : 0.0f;
                ec0Var5.b(f7, f7, true);
                break;
            case 10:
                org.telegram.ui.Components.ec0 ec0Var6 = ((PasscodeActivity) obj).f;
                f7 = z10 ? 1.0f : 0.0f;
                ec0Var6.b(f7, f7, true);
                break;
            case 11:
                n91 n91Var = (n91) obj;
                if (!z10) {
                    n91Var.d.setText(org.telegram.messenger.i0.W2(org.telegram.messenger.dd.L0(2131744210, null)));
                    break;
                } else {
                    n91Var.d.setText(org.telegram.messenger.i0.W2(org.telegram.messenger.dd.L0(2131744209, null)));
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
