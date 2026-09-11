package org.telegram.ui;

import android.view.View;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final /* synthetic */ class pd implements View.OnFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pd(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z10) {
        switch (this.a) {
            case 0:
                zd zdVar = ((ke) this.b).U0;
                float f7 = z10 ? 1.0f : 0.0f;
                zdVar.b(f7, f7, true);
                break;
            case 1:
                uy uyVar = (uy) this.b;
                if (z10) {
                    uyVar.Y.b(true);
                    break;
                }
                break;
            case 2:
                wg0 wg0Var = ((ge0) this.b).W;
                if (z10) {
                    wg0Var.c.setEditText((EditText) view);
                    wg0Var.c.setDispatchBackWhenEmpty(true);
                    break;
                }
                break;
            case 3:
                org.telegram.ui.Components.zc0 zc0Var = (org.telegram.ui.Components.zc0) this.b;
                float f10 = z10 ? 1.0f : 0.0f;
                zc0Var.b(f10, f10, true);
                break;
            case 4:
                org.telegram.ui.Components.zc0 zc0Var2 = ((pe0) this.b).x;
                float f11 = z10 ? 1.0f : 0.0f;
                zc0Var2.b(f11, f11, true);
                break;
            case 5:
                org.telegram.ui.Components.zc0 zc0Var3 = ((xe0) this.b).b;
                float f12 = z10 ? 1.0f : 0.0f;
                zc0Var3.b(f12, f12, true);
                break;
            case 6:
                wg0 wg0Var2 = ((af0) this.b).y;
                if (z10) {
                    wg0Var2.c.setEditText((EditText) view);
                    wg0Var2.c.setDispatchBackWhenEmpty(true);
                    break;
                }
                break;
            case 7:
                org.telegram.ui.Components.zc0 zc0Var4 = ((lf0) this.b).a;
                float f13 = z10 ? 1.0f : 0.0f;
                zc0Var4.b(f13, f13, true);
                break;
            case 8:
                wg0 wg0Var3 = ((zf0) this.b).s0;
                if (z10) {
                    wg0Var3.c.setEditText((EditText) view);
                    wg0Var3.c.setDispatchBackWhenEmpty(true);
                    break;
                }
                break;
            case 9:
                org.telegram.ui.Components.zc0 zc0Var5 = ((vg0) this.b).e;
                float f14 = z10 ? 1.0f : 0.0f;
                zc0Var5.b(f14, f14, true);
                break;
            case 10:
                org.telegram.ui.Components.zc0 zc0Var6 = ((PasscodeActivity) this.b).f;
                float f15 = z10 ? 1.0f : 0.0f;
                zc0Var6.b(f15, f15, true);
                break;
            case 11:
                be1 be1Var = (be1) this.b;
                if (!z10) {
                    be1Var.d.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ThemeCreateHelp)));
                    break;
                } else {
                    be1Var.d.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ThemeCreateHelp2)));
                    break;
                }
            default:
                org.telegram.ui.Components.zc0 zc0Var7 = ((TwoStepVerificationActivity) this.b).v;
                float f16 = z10 ? 1.0f : 0.0f;
                zc0Var7.b(f16, f16, true);
                break;
        }
    }
}
