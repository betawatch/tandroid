package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pi0 implements org.telegram.ui.ActionBar.p1, ns, nj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yj0 b;

    public /* synthetic */ pi0(yj0 yj0Var, int i3) {
        this.a = i3;
        this.b = yj0Var;
    }

    @Override // org.telegram.ui.ns
    public void c(ks ksVar) {
        switch (this.a) {
            case 2:
                yj0 yj0Var = this.b;
                yj0Var.Z[5].setText(ksVar.a);
                yj0Var.s = ksVar.d;
                break;
            default:
                yj0 yj0Var2 = this.b;
                yj0Var2.Z[0].setText(ksVar.a);
                if (yj0Var2.V0.indexOf(ksVar.a) != -1) {
                    yj0Var2.a1 = true;
                    String str = (String) yj0Var2.W0.get(ksVar.a);
                    yj0Var2.Z[1].setText(str);
                    String str2 = (String) yj0Var2.Y0.get(str);
                    yj0Var2.Z[2].setHintText(str2 != null ? str2.replace('X', (char) 8211) : null);
                    yj0Var2.a1 = false;
                }
                org.telegram.messenger.g0.i3(new mi0(yj0Var2, 3), 300L);
                yj0Var2.Z[2].requestFocus();
                EditTextBoldCursor editTextBoldCursor = yj0Var2.Z[2];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                break;
        }
    }

    @Override // org.telegram.ui.nj0
    public void f(String str, String str2) {
        this.b.B1();
    }

    @Override // org.telegram.ui.ActionBar.p1
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        switch (this.a) {
            case 0:
                yj0 yj0Var = this.b;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.b.getPackageName()));
                    yj0Var.getParentActivity().startActivity(intent);
                    break;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 1:
                this.b.finishFragment();
                break;
            case 2:
            case 3:
            default:
                yj0.f0(this.b);
                break;
            case 4:
                sf.c.t(r3.getParentActivity(), "https://telegram.org/deactivate?phone=" + org.telegram.messenger.h10.i(this.b.currentAccount).d());
                break;
        }
    }
}
