package org.telegram.ui;

import android.view.View;
import android.widget.EditText;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fd implements View.OnFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fd(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z9) {
        float f10;
        int i7 = this.a;
        Object obj = this.b;
        switch (i7) {
            case 0:
                bi.u uVar = ((zd) obj).K0;
                f10 = z9 ? 1.0f : 0.0f;
                uVar.b(f10, f10, true);
                break;
            case 1:
                ww wwVar = (ww) obj;
                if (z9) {
                    wwVar.Y.b(true);
                    break;
                }
                break;
            case 2:
                ce0 ce0Var = ((ob0) obj).W;
                if (z9) {
                    ce0Var.c.setEditText((EditText) view);
                    ce0Var.c.setDispatchBackWhenEmpty(true);
                    break;
                }
                break;
            case 3:
                org.telegram.ui.Components.lb0 lb0Var = (org.telegram.ui.Components.lb0) obj;
                f10 = z9 ? 1.0f : 0.0f;
                lb0Var.b(f10, f10, true);
                break;
            case 4:
                org.telegram.ui.Components.lb0 lb0Var2 = ((xb0) obj).y;
                f10 = z9 ? 1.0f : 0.0f;
                lb0Var2.b(f10, f10, true);
                break;
            case 5:
                org.telegram.ui.Components.lb0 lb0Var3 = ((ec0) obj).b;
                f10 = z9 ? 1.0f : 0.0f;
                lb0Var3.b(f10, f10, true);
                break;
            case 6:
                ce0 ce0Var2 = ((hc0) obj).D;
                if (z9) {
                    ce0Var2.c.setEditText((EditText) view);
                    ce0Var2.c.setDispatchBackWhenEmpty(true);
                    break;
                }
                break;
            case 7:
                org.telegram.ui.Components.lb0 lb0Var4 = ((sc0) obj).a;
                f10 = z9 ? 1.0f : 0.0f;
                lb0Var4.b(f10, f10, true);
                break;
            case 8:
                ce0 ce0Var3 = ((gd0) obj).u0;
                if (z9) {
                    ce0Var3.c.setEditText((EditText) view);
                    ce0Var3.c.setDispatchBackWhenEmpty(true);
                    break;
                }
                break;
            case 9:
                org.telegram.ui.Components.lb0 lb0Var5 = ((be0) obj).e;
                f10 = z9 ? 1.0f : 0.0f;
                lb0Var5.b(f10, f10, true);
                break;
            case 10:
                org.telegram.ui.Components.lb0 lb0Var6 = ((PasscodeActivity) obj).f;
                f10 = z9 ? 1.0f : 0.0f;
                lb0Var6.b(f10, f10, true);
                break;
            case 11:
                x71 x71Var = (x71) obj;
                if (!z9) {
                    x71Var.d.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131744186, null)));
                    break;
                } else {
                    x71Var.d.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131744185, null)));
                    break;
                }
            default:
                org.telegram.ui.Components.lb0 lb0Var7 = ((TwoStepVerificationActivity) obj).w;
                f10 = z9 ? 1.0f : 0.0f;
                lb0Var7.b(f10, f10, true);
                break;
        }
    }
}
