package org.telegram.ui;

import android.view.View;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
                ry ryVar = (ry) this.b;
                if (z10) {
                    ryVar.Y.b(true);
                    break;
                }
                break;
            case 2:
                rg0 rg0Var = ((be0) this.b).W;
                if (z10) {
                    rg0Var.c.setEditText((EditText) view);
                    rg0Var.c.setDispatchBackWhenEmpty(true);
                    break;
                }
                break;
            case 3:
                org.telegram.ui.Components.yc0 yc0Var = (org.telegram.ui.Components.yc0) this.b;
                float f10 = z10 ? 1.0f : 0.0f;
                yc0Var.b(f10, f10, true);
                break;
            case 4:
                org.telegram.ui.Components.yc0 yc0Var2 = ((ke0) this.b).x;
                float f11 = z10 ? 1.0f : 0.0f;
                yc0Var2.b(f11, f11, true);
                break;
            case 5:
                org.telegram.ui.Components.yc0 yc0Var3 = ((se0) this.b).b;
                float f12 = z10 ? 1.0f : 0.0f;
                yc0Var3.b(f12, f12, true);
                break;
            case 6:
                rg0 rg0Var2 = ((ve0) this.b).y;
                if (z10) {
                    rg0Var2.c.setEditText((EditText) view);
                    rg0Var2.c.setDispatchBackWhenEmpty(true);
                    break;
                }
                break;
            case 7:
                org.telegram.ui.Components.yc0 yc0Var4 = ((gf0) this.b).a;
                float f13 = z10 ? 1.0f : 0.0f;
                yc0Var4.b(f13, f13, true);
                break;
            case 8:
                rg0 rg0Var3 = ((uf0) this.b).s0;
                if (z10) {
                    rg0Var3.c.setEditText((EditText) view);
                    rg0Var3.c.setDispatchBackWhenEmpty(true);
                    break;
                }
                break;
            case 9:
                org.telegram.ui.Components.yc0 yc0Var5 = ((qg0) this.b).e;
                float f14 = z10 ? 1.0f : 0.0f;
                yc0Var5.b(f14, f14, true);
                break;
            case 10:
                org.telegram.ui.Components.yc0 yc0Var6 = ((PasscodeActivity) this.b).f;
                float f15 = z10 ? 1.0f : 0.0f;
                yc0Var6.b(f15, f15, true);
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
                org.telegram.ui.Components.yc0 yc0Var7 = ((TwoStepVerificationActivity) this.b).v;
                float f16 = z10 ? 1.0f : 0.0f;
                yc0Var7.b(f16, f16, true);
                break;
        }
    }
}
