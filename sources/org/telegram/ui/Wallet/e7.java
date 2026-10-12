package org.telegram.ui.Wallet;

import android.text.TextUtils;
import java.nio.charset.StandardCharsets;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.c71;
import org.telegram.ui.nb0;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class e7 implements org.telegram.ui.ActionBar.z1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ c71 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ e7(c71 c71Var, Object obj, Object obj2, int i10) {
        this.a = i10;
        this.b = c71Var;
        this.d = obj;
        this.c = obj2;
    }

    @Override // org.telegram.ui.ActionBar.z1
    public final void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.a) {
            case 0:
                k7 k7Var = (k7) this.b;
                Boolean bool = (Boolean) this.d;
                j0 j0Var = (j0) this.c;
                if (!bool.booleanValue()) {
                    j0Var.c.B();
                }
                q2.a(j0Var.a, new fi.c(8), null, null, null, new bi.j0(5, j0Var, new y6(2, k7Var, (k7Var.getParentLayout() == null || k7Var.getParentLayout().getFragmentStack().size() <= 1) ? null : (org.telegram.ui.ActionBar.m2) k7Var.getParentLayout().getFragmentStack().get(k7Var.getParentLayout().getFragmentStack().size() - 2))), false, true, new nb0((Object) null, 1));
                break;
            case 1:
                k7 k7Var2 = (k7) this.b;
                j0 j0Var2 = (j0) this.c;
                e0 e0Var = (e0) this.d;
                pf.c g10 = a2Var.g(i10, true, true);
                g10.d();
                g7 g7Var = new g7(k7Var2, g10, 2);
                j0.E("disable backup: getting phrase...");
                j0Var2.x(new i((Object) j0Var2, (Object) g7Var, (Object) e0Var, 3), false, true);
                break;
            default:
                i8 i8Var = (i8) this.b;
                ig.b1 b1Var = (ig.b1) this.d;
                org.telegram.ui.Cells.a2 a2Var2 = (org.telegram.ui.Cells.a2) this.c;
                if (b1Var.getText().toString().getBytes(StandardCharsets.UTF_8).length <= 960) {
                    String trim = b1Var.getText().toString().trim();
                    if (TextUtils.isEmpty(trim)) {
                        trim = null;
                    }
                    i8Var.d0 = trim;
                    i8Var.e0 = !a2Var2.b();
                    if (TextUtils.isEmpty(i8Var.d0)) {
                        i8Var.M.setVisibility(8);
                    } else {
                        i8Var.M.setText(i8Var.d0);
                        i8Var.M.setVisibility(0);
                    }
                    i8Var.y0();
                    a2Var.dismiss();
                    i8Var.n0();
                    break;
                } else {
                    int i11 = -i8Var.l0;
                    i8Var.l0 = i11;
                    AndroidUtilities.shakeViewSpring(b1Var, i11);
                    break;
                }
        }
    }

    public /* synthetic */ e7(k7 k7Var, j0 j0Var, e0 e0Var) {
        this.a = 1;
        this.b = k7Var;
        this.c = j0Var;
        this.d = e0Var;
    }
}
