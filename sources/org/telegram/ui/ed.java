package org.telegram.ui;

import android.view.View;
import android.widget.EditText;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
                bx bxVar = (bx) obj;
                if (z10) {
                    bxVar.Z.b(true);
                    break;
                }
                break;
            case 2:
                de0 de0Var = ((ob0) obj).a0;
                if (z10) {
                    de0Var.c.setEditText((EditText) view);
                    de0Var.c.setDispatchBackWhenEmpty(true);
                    break;
                }
                break;
            case 3:
                org.telegram.ui.Components.vb0 vb0Var = (org.telegram.ui.Components.vb0) obj;
                f10 = z10 ? 1.0f : 0.0f;
                vb0Var.b(f10, f10, true);
                break;
            case 4:
                org.telegram.ui.Components.vb0 vb0Var2 = ((wb0) obj).y;
                f10 = z10 ? 1.0f : 0.0f;
                vb0Var2.b(f10, f10, true);
                break;
            case 5:
                org.telegram.ui.Components.vb0 vb0Var3 = ((dc0) obj).b;
                f10 = z10 ? 1.0f : 0.0f;
                vb0Var3.b(f10, f10, true);
                break;
            case 6:
                de0 de0Var2 = ((gc0) obj).E;
                if (z10) {
                    de0Var2.c.setEditText((EditText) view);
                    de0Var2.c.setDispatchBackWhenEmpty(true);
                    break;
                }
                break;
            case 7:
                org.telegram.ui.Components.vb0 vb0Var4 = ((rc0) obj).a;
                f10 = z10 ? 1.0f : 0.0f;
                vb0Var4.b(f10, f10, true);
                break;
            case 8:
                de0 de0Var3 = ((gd0) obj).v0;
                if (z10) {
                    de0Var3.c.setEditText((EditText) view);
                    de0Var3.c.setDispatchBackWhenEmpty(true);
                    break;
                }
                break;
            case 9:
                org.telegram.ui.Components.vb0 vb0Var5 = ((ce0) obj).e;
                f10 = z10 ? 1.0f : 0.0f;
                vb0Var5.b(f10, f10, true);
                break;
            case 10:
                org.telegram.ui.Components.vb0 vb0Var6 = ((PasscodeActivity) obj).f;
                f10 = z10 ? 1.0f : 0.0f;
                vb0Var6.b(f10, f10, true);
                break;
            case 11:
                y71 y71Var = (y71) obj;
                if (!z10) {
                    y71Var.d.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.N0(2131743940, null)));
                    break;
                } else {
                    y71Var.d.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.N0(2131743939, null)));
                    break;
                }
            default:
                org.telegram.ui.Components.vb0 vb0Var7 = ((TwoStepVerificationActivity) obj).w;
                f10 = z10 ? 1.0f : 0.0f;
                vb0Var7.b(f10, f10, true);
                break;
        }
    }
}
