package org.telegram.ui;

import android.view.View;
import android.widget.EditText;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
                yw ywVar = (yw) obj;
                if (z9) {
                    ywVar.Y.b(true);
                    break;
                }
                break;
            case 2:
                ee0 ee0Var = ((qb0) obj).W;
                if (z9) {
                    ee0Var.c.setEditText((EditText) view);
                    ee0Var.c.setDispatchBackWhenEmpty(true);
                    break;
                }
                break;
            case 3:
                org.telegram.ui.Components.mb0 mb0Var = (org.telegram.ui.Components.mb0) obj;
                f10 = z9 ? 1.0f : 0.0f;
                mb0Var.b(f10, f10, true);
                break;
            case 4:
                org.telegram.ui.Components.mb0 mb0Var2 = ((zb0) obj).y;
                f10 = z9 ? 1.0f : 0.0f;
                mb0Var2.b(f10, f10, true);
                break;
            case 5:
                org.telegram.ui.Components.mb0 mb0Var3 = ((gc0) obj).b;
                f10 = z9 ? 1.0f : 0.0f;
                mb0Var3.b(f10, f10, true);
                break;
            case 6:
                ee0 ee0Var2 = ((jc0) obj).D;
                if (z9) {
                    ee0Var2.c.setEditText((EditText) view);
                    ee0Var2.c.setDispatchBackWhenEmpty(true);
                    break;
                }
                break;
            case 7:
                org.telegram.ui.Components.mb0 mb0Var4 = ((uc0) obj).a;
                f10 = z9 ? 1.0f : 0.0f;
                mb0Var4.b(f10, f10, true);
                break;
            case 8:
                ee0 ee0Var3 = ((id0) obj).u0;
                if (z9) {
                    ee0Var3.c.setEditText((EditText) view);
                    ee0Var3.c.setDispatchBackWhenEmpty(true);
                    break;
                }
                break;
            case 9:
                org.telegram.ui.Components.mb0 mb0Var5 = ((de0) obj).e;
                f10 = z9 ? 1.0f : 0.0f;
                mb0Var5.b(f10, f10, true);
                break;
            case 10:
                org.telegram.ui.Components.mb0 mb0Var6 = ((PasscodeActivity) obj).f;
                f10 = z9 ? 1.0f : 0.0f;
                mb0Var6.b(f10, f10, true);
                break;
            case 11:
                z71 z71Var = (z71) obj;
                if (!z9) {
                    z71Var.d.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131744185, null)));
                    break;
                } else {
                    z71Var.d.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131744184, null)));
                    break;
                }
            default:
                org.telegram.ui.Components.mb0 mb0Var7 = ((TwoStepVerificationActivity) obj).w;
                f10 = z9 ? 1.0f : 0.0f;
                mb0Var7.b(f10, f10, true);
                break;
        }
    }
}
