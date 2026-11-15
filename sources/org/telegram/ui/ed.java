package org.telegram.ui;

import android.view.View;
import android.widget.EditText;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
                yw ywVar = (yw) obj;
                if (z10) {
                    ywVar.Z.b(true);
                    break;
                }
                break;
            case 2:
                ce0 ce0Var = ((ob0) obj).a0;
                if (z10) {
                    ce0Var.c.setEditText((EditText) view);
                    ce0Var.c.setDispatchBackWhenEmpty(true);
                    break;
                }
                break;
            case 3:
                org.telegram.ui.Components.mb0 mb0Var = (org.telegram.ui.Components.mb0) obj;
                f10 = z10 ? 1.0f : 0.0f;
                mb0Var.b(f10, f10, true);
                break;
            case 4:
                org.telegram.ui.Components.mb0 mb0Var2 = ((wb0) obj).y;
                f10 = z10 ? 1.0f : 0.0f;
                mb0Var2.b(f10, f10, true);
                break;
            case 5:
                org.telegram.ui.Components.mb0 mb0Var3 = ((dc0) obj).b;
                f10 = z10 ? 1.0f : 0.0f;
                mb0Var3.b(f10, f10, true);
                break;
            case 6:
                ce0 ce0Var2 = ((gc0) obj).E;
                if (z10) {
                    ce0Var2.c.setEditText((EditText) view);
                    ce0Var2.c.setDispatchBackWhenEmpty(true);
                    break;
                }
                break;
            case 7:
                org.telegram.ui.Components.mb0 mb0Var4 = ((rc0) obj).a;
                f10 = z10 ? 1.0f : 0.0f;
                mb0Var4.b(f10, f10, true);
                break;
            case 8:
                ce0 ce0Var3 = ((ed0) obj).v0;
                if (z10) {
                    ce0Var3.c.setEditText((EditText) view);
                    ce0Var3.c.setDispatchBackWhenEmpty(true);
                    break;
                }
                break;
            case 9:
                org.telegram.ui.Components.mb0 mb0Var5 = ((be0) obj).e;
                f10 = z10 ? 1.0f : 0.0f;
                mb0Var5.b(f10, f10, true);
                break;
            case 10:
                org.telegram.ui.Components.mb0 mb0Var6 = ((PasscodeActivity) obj).f;
                f10 = z10 ? 1.0f : 0.0f;
                mb0Var6.b(f10, f10, true);
                break;
            case 11:
                w71 w71Var = (w71) obj;
                if (!z10) {
                    w71Var.d.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131744185, null)));
                    break;
                } else {
                    w71Var.d.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131744184, null)));
                    break;
                }
            default:
                org.telegram.ui.Components.mb0 mb0Var7 = ((TwoStepVerificationActivity) obj).w;
                f10 = z10 ? 1.0f : 0.0f;
                mb0Var7.b(f10, f10, true);
                break;
        }
    }
}
