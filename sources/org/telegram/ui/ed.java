package org.telegram.ui;

import android.view.View;
import android.widget.EditText;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ed implements View.OnFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ed(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z10) {
        float f10;
        int i7 = this.a;
        Object obj = this.b;
        switch (i7) {
            case 0:
                di.p pVar = ((xd) obj).L0;
                f10 = z10 ? 1.0f : 0.0f;
                pVar.b(f10, f10, true);
                break;
            case 1:
                cx cxVar = (cx) obj;
                if (z10) {
                    cxVar.Z.b(true);
                    break;
                }
                break;
            case 2:
                ee0 ee0Var = ((pb0) obj).a0;
                if (z10) {
                    ee0Var.c.setEditText((EditText) view);
                    ee0Var.c.setDispatchBackWhenEmpty(true);
                    break;
                }
                break;
            case 3:
                org.telegram.ui.Components.xb0 xb0Var = (org.telegram.ui.Components.xb0) obj;
                f10 = z10 ? 1.0f : 0.0f;
                xb0Var.b(f10, f10, true);
                break;
            case 4:
                org.telegram.ui.Components.xb0 xb0Var2 = ((xb0) obj).y;
                f10 = z10 ? 1.0f : 0.0f;
                xb0Var2.b(f10, f10, true);
                break;
            case 5:
                org.telegram.ui.Components.xb0 xb0Var3 = ((ec0) obj).b;
                f10 = z10 ? 1.0f : 0.0f;
                xb0Var3.b(f10, f10, true);
                break;
            case 6:
                ee0 ee0Var2 = ((hc0) obj).E;
                if (z10) {
                    ee0Var2.c.setEditText((EditText) view);
                    ee0Var2.c.setDispatchBackWhenEmpty(true);
                    break;
                }
                break;
            case 7:
                org.telegram.ui.Components.xb0 xb0Var4 = ((sc0) obj).a;
                f10 = z10 ? 1.0f : 0.0f;
                xb0Var4.b(f10, f10, true);
                break;
            case 8:
                ee0 ee0Var3 = ((hd0) obj).v0;
                if (z10) {
                    ee0Var3.c.setEditText((EditText) view);
                    ee0Var3.c.setDispatchBackWhenEmpty(true);
                    break;
                }
                break;
            case 9:
                org.telegram.ui.Components.xb0 xb0Var5 = ((de0) obj).e;
                f10 = z10 ? 1.0f : 0.0f;
                xb0Var5.b(f10, f10, true);
                break;
            case 10:
                org.telegram.ui.Components.xb0 xb0Var6 = ((PasscodeActivity) obj).f;
                f10 = z10 ? 1.0f : 0.0f;
                xb0Var6.b(f10, f10, true);
                break;
            case 11:
                a81 a81Var = (a81) obj;
                if (!z10) {
                    a81Var.d.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.M0(2131743950, null)));
                    break;
                } else {
                    a81Var.d.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.M0(2131743949, null)));
                    break;
                }
            default:
                org.telegram.ui.Components.xb0 xb0Var7 = ((TwoStepVerificationActivity) obj).w;
                f10 = z10 ? 1.0f : 0.0f;
                xb0Var7.b(f10, f10, true);
                break;
        }
    }
}
