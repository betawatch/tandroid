package org.telegram.ui.Wallet;

import android.text.TextUtils;
import java.nio.charset.StandardCharsets;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.d71;
import org.telegram.ui.mb0;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f7 implements org.telegram.ui.ActionBar.z1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ d71 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ f7(d71 d71Var, Object obj, Object obj2, int i10) {
        this.a = i10;
        this.b = d71Var;
        this.d = obj;
        this.c = obj2;
    }

    @Override // org.telegram.ui.ActionBar.z1
    public final void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.a) {
            case 0:
                l7 l7Var = (l7) this.b;
                Boolean bool = (Boolean) this.d;
                k0 k0Var = (k0) this.c;
                if (!bool.booleanValue()) {
                    k0Var.c.B();
                }
                r2.a(k0Var.a, new fi.c(8), null, null, null, new bi.j0(5, k0Var, new z6(2, l7Var, (l7Var.getParentLayout() == null || l7Var.getParentLayout().getFragmentStack().size() <= 1) ? null : (org.telegram.ui.ActionBar.m2) l7Var.getParentLayout().getFragmentStack().get(l7Var.getParentLayout().getFragmentStack().size() - 2))), false, true, new mb0((Object) null, 1));
                break;
            case 1:
                l7 l7Var2 = (l7) this.b;
                k0 k0Var2 = (k0) this.c;
                f0 f0Var = (f0) this.d;
                pf.c g10 = a2Var.g(i10, true, true);
                g10.d();
                h7 h7Var = new h7(l7Var2, g10, 2);
                k0.E("disable backup: getting phrase...");
                k0Var2.x(new j((Object) k0Var2, (Object) h7Var, (Object) f0Var, 3), false, true);
                break;
            default:
                j8 j8Var = (j8) this.b;
                ig.b1 b1Var = (ig.b1) this.d;
                org.telegram.ui.Cells.a2 a2Var2 = (org.telegram.ui.Cells.a2) this.c;
                if (b1Var.getText().toString().getBytes(StandardCharsets.UTF_8).length <= 960) {
                    String trim = b1Var.getText().toString().trim();
                    if (TextUtils.isEmpty(trim)) {
                        trim = null;
                    }
                    j8Var.d0 = trim;
                    j8Var.e0 = !a2Var2.b();
                    if (TextUtils.isEmpty(j8Var.d0)) {
                        j8Var.M.setVisibility(8);
                    } else {
                        j8Var.M.setText(j8Var.d0);
                        j8Var.M.setVisibility(0);
                    }
                    j8Var.y0();
                    a2Var.dismiss();
                    j8Var.n0();
                    break;
                } else {
                    int i11 = -j8Var.l0;
                    j8Var.l0 = i11;
                    AndroidUtilities.shakeViewSpring(b1Var, i11);
                    break;
                }
        }
    }

    public /* synthetic */ f7(l7 l7Var, k0 k0Var, f0 f0Var) {
        this.a = 1;
        this.b = l7Var;
        this.c = k0Var;
        this.d = f0Var;
    }
}
