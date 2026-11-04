package org.telegram.ui;

import android.view.View;
import android.widget.EditText;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ed implements View.OnFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ed(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z10) {
        float f10;
        int i3 = this.a;
        Object obj = this.b;
        switch (i3) {
            case 0:
                ci.r rVar = ((xd) obj).L0;
                f10 = z10 ? 1.0f : 0.0f;
                rVar.b(f10, f10, true);
                break;
            case 1:
                uw uwVar = (uw) obj;
                if (z10) {
                    uwVar.Z.b(true);
                    break;
                }
                break;
            case 2:
                xd0 xd0Var = ((lb0) obj).a0;
                if (z10) {
                    xd0Var.c.setEditText((EditText) view);
                    xd0Var.c.setDispatchBackWhenEmpty(true);
                    break;
                }
                break;
            case 3:
                org.telegram.ui.Components.gb0 gb0Var = (org.telegram.ui.Components.gb0) obj;
                f10 = z10 ? 1.0f : 0.0f;
                gb0Var.b(f10, f10, true);
                break;
            case 4:
                org.telegram.ui.Components.gb0 gb0Var2 = ((vb0) obj).y;
                f10 = z10 ? 1.0f : 0.0f;
                gb0Var2.b(f10, f10, true);
                break;
            case 5:
                org.telegram.ui.Components.gb0 gb0Var3 = ((cc0) obj).b;
                f10 = z10 ? 1.0f : 0.0f;
                gb0Var3.b(f10, f10, true);
                break;
            case 6:
                xd0 xd0Var2 = ((fc0) obj).E;
                if (z10) {
                    xd0Var2.c.setEditText((EditText) view);
                    xd0Var2.c.setDispatchBackWhenEmpty(true);
                    break;
                }
                break;
            case 7:
                org.telegram.ui.Components.gb0 gb0Var4 = ((qc0) obj).a;
                f10 = z10 ? 1.0f : 0.0f;
                gb0Var4.b(f10, f10, true);
                break;
            case 8:
                xd0 xd0Var3 = ((dd0) obj).v0;
                if (z10) {
                    xd0Var3.c.setEditText((EditText) view);
                    xd0Var3.c.setDispatchBackWhenEmpty(true);
                    break;
                }
                break;
            case 9:
                org.telegram.ui.Components.gb0 gb0Var5 = ((wd0) obj).e;
                f10 = z10 ? 1.0f : 0.0f;
                gb0Var5.b(f10, f10, true);
                break;
            case 10:
                org.telegram.ui.Components.gb0 gb0Var6 = ((PasscodeActivity) obj).f;
                f10 = z10 ? 1.0f : 0.0f;
                gb0Var6.b(f10, f10, true);
                break;
            case 11:
                o71 o71Var = (o71) obj;
                if (!z10) {
                    o71Var.d.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131744195, null)));
                    break;
                } else {
                    o71Var.d.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131744194, null)));
                    break;
                }
            default:
                org.telegram.ui.Components.gb0 gb0Var7 = ((TwoStepVerificationActivity) obj).w;
                f10 = z10 ? 1.0f : 0.0f;
                gb0Var7.b(f10, f10, true);
                break;
        }
    }
}
