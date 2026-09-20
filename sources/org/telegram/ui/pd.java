package org.telegram.ui;

import android.view.View;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
                yg0 yg0Var = ((ie0) this.b).W;
                if (z10) {
                    yg0Var.c.setEditText((EditText) view);
                    yg0Var.c.setDispatchBackWhenEmpty(true);
                    break;
                }
                break;
            case 3:
                org.telegram.ui.Components.hd0 hd0Var = (org.telegram.ui.Components.hd0) this.b;
                float f10 = z10 ? 1.0f : 0.0f;
                hd0Var.b(f10, f10, true);
                break;
            case 4:
                org.telegram.ui.Components.hd0 hd0Var2 = ((re0) this.b).x;
                float f11 = z10 ? 1.0f : 0.0f;
                hd0Var2.b(f11, f11, true);
                break;
            case 5:
                org.telegram.ui.Components.hd0 hd0Var3 = ((ze0) this.b).b;
                float f12 = z10 ? 1.0f : 0.0f;
                hd0Var3.b(f12, f12, true);
                break;
            case 6:
                yg0 yg0Var2 = ((cf0) this.b).y;
                if (z10) {
                    yg0Var2.c.setEditText((EditText) view);
                    yg0Var2.c.setDispatchBackWhenEmpty(true);
                    break;
                }
                break;
            case 7:
                org.telegram.ui.Components.hd0 hd0Var4 = ((nf0) this.b).a;
                float f13 = z10 ? 1.0f : 0.0f;
                hd0Var4.b(f13, f13, true);
                break;
            case 8:
                yg0 yg0Var3 = ((bg0) this.b).s0;
                if (z10) {
                    yg0Var3.c.setEditText((EditText) view);
                    yg0Var3.c.setDispatchBackWhenEmpty(true);
                    break;
                }
                break;
            case 9:
                org.telegram.ui.Components.hd0 hd0Var5 = ((xg0) this.b).e;
                float f14 = z10 ? 1.0f : 0.0f;
                hd0Var5.b(f14, f14, true);
                break;
            case 10:
                org.telegram.ui.Components.hd0 hd0Var6 = ((PasscodeActivity) this.b).f;
                float f15 = z10 ? 1.0f : 0.0f;
                hd0Var6.b(f15, f15, true);
                break;
            case 11:
                ce1 ce1Var = (ce1) this.b;
                if (!z10) {
                    ce1Var.d.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ThemeCreateHelp)));
                    break;
                } else {
                    ce1Var.d.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ThemeCreateHelp2)));
                    break;
                }
            default:
                org.telegram.ui.Components.hd0 hd0Var7 = ((TwoStepVerificationActivity) this.b).v;
                float f16 = z10 ? 1.0f : 0.0f;
                hd0Var7.b(f16, f16, true);
                break;
        }
    }
}
