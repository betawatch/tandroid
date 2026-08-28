package org.telegram.ui;

import android.view.View;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ld implements View.OnFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ld(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z10) {
        switch (this.a) {
            case 0:
                gh.n nVar = ((fe) this.b).Q0;
                float f10 = z10 ? 1.0f : 0.0f;
                nVar.b(f10, f10, true);
                break;
            case 1:
                dy dyVar = (dy) this.b;
                if (z10) {
                    dyVar.U.b(true);
                    break;
                }
                break;
            case 2:
                fg0 fg0Var = ((pd0) this.b).S;
                if (z10) {
                    fg0Var.c.setEditText((EditText) view);
                    fg0Var.c.setDispatchBackWhenEmpty(true);
                    break;
                }
                break;
            case 3:
                org.telegram.ui.Components.fc0 fc0Var = (org.telegram.ui.Components.fc0) this.b;
                float f11 = z10 ? 1.0f : 0.0f;
                fc0Var.b(f11, f11, true);
                break;
            case 4:
                org.telegram.ui.Components.fc0 fc0Var2 = ((yd0) this.b).x;
                float f12 = z10 ? 1.0f : 0.0f;
                fc0Var2.b(f12, f12, true);
                break;
            case 5:
                org.telegram.ui.Components.fc0 fc0Var3 = ((ge0) this.b).b;
                float f13 = z10 ? 1.0f : 0.0f;
                fc0Var3.b(f13, f13, true);
                break;
            case 6:
                fg0 fg0Var2 = ((je0) this.b).y;
                if (z10) {
                    fg0Var2.c.setEditText((EditText) view);
                    fg0Var2.c.setDispatchBackWhenEmpty(true);
                    break;
                }
                break;
            case 7:
                org.telegram.ui.Components.fc0 fc0Var4 = ((ue0) this.b).a;
                float f14 = z10 ? 1.0f : 0.0f;
                fc0Var4.b(f14, f14, true);
                break;
            case 8:
                fg0 fg0Var3 = ((jf0) this.b).o0;
                if (z10) {
                    fg0Var3.c.setEditText((EditText) view);
                    fg0Var3.c.setDispatchBackWhenEmpty(true);
                    break;
                }
                break;
            case 9:
                org.telegram.ui.Components.fc0 fc0Var5 = ((eg0) this.b).e;
                float f15 = z10 ? 1.0f : 0.0f;
                fc0Var5.b(f15, f15, true);
                break;
            case 10:
                org.telegram.ui.Components.fc0 fc0Var6 = ((PasscodeActivity) this.b).f;
                float f16 = z10 ? 1.0f : 0.0f;
                fc0Var6.b(f16, f16, true);
                break;
            case 11:
                tc1 tc1Var = (tc1) this.b;
                if (!z10) {
                    tc1Var.d.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ThemeCreateHelp)));
                    break;
                } else {
                    tc1Var.d.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ThemeCreateHelp2)));
                    break;
                }
            default:
                org.telegram.ui.Components.fc0 fc0Var7 = ((TwoStepVerificationActivity) this.b).v;
                float f17 = z10 ? 1.0f : 0.0f;
                fc0Var7.b(f17, f17, true);
                break;
        }
    }
}
