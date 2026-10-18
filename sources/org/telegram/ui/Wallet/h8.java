package org.telegram.ui.Wallet;

import android.text.TextUtils;
import java.nio.charset.StandardCharsets;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.v61;
import org.telegram.ui.pa0;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h8 implements org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ v61 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ h8(v61 v61Var, Object obj, Object obj2, int i10) {
        this.a = i10;
        this.b = v61Var;
        this.d = obj;
        this.c = obj2;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                n8 n8Var = (n8) this.b;
                Boolean bool = (Boolean) this.d;
                m0 m0Var = (m0) this.c;
                if (!bool.booleanValue()) {
                    m0Var.c.B();
                }
                s2.a(m0Var.a, new gi.c(9), null, null, null, new ci.c0(5, m0Var, new x(9, n8Var, (n8Var.getParentLayout() == null || n8Var.getParentLayout().getFragmentStack().size() <= 1) ? null : (org.telegram.ui.ActionBar.n2) n8Var.getParentLayout().getFragmentStack().get(n8Var.getParentLayout().getFragmentStack().size() - 2))), false, true, new pa0((Object) null, 1));
                break;
            case 1:
                n8 n8Var2 = (n8) this.b;
                m0 m0Var2 = (m0) this.c;
                h0 h0Var = (h0) this.d;
                pf.c g10 = b2Var.g(i10, true, true);
                g10.d();
                j8 j8Var = new j8(n8Var2, g10, 2);
                m0.F("disable backup: getting phrase...");
                m0Var2.y(new k((Object) m0Var2, (Object) j8Var, (Object) h0Var, 5), false, true);
                break;
            default:
                o9 o9Var = (o9) this.b;
                ig.a1 a1Var = (ig.a1) this.d;
                org.telegram.ui.Cells.a2 a2Var = (org.telegram.ui.Cells.a2) this.c;
                if (a1Var.getText().toString().getBytes(StandardCharsets.UTF_8).length <= 960) {
                    String trim = a1Var.getText().toString().trim();
                    if (TextUtils.isEmpty(trim)) {
                        trim = null;
                    }
                    o9Var.d0 = trim;
                    o9Var.e0 = !a2Var.b();
                    if (TextUtils.isEmpty(o9Var.d0)) {
                        o9Var.M.setVisibility(8);
                    } else {
                        o9Var.M.setText(o9Var.d0);
                        o9Var.M.setVisibility(0);
                    }
                    o9Var.y0();
                    b2Var.dismiss();
                    o9Var.n0();
                    break;
                } else {
                    int i11 = -o9Var.l0;
                    o9Var.l0 = i11;
                    AndroidUtilities.shakeViewSpring(a1Var, i11);
                    break;
                }
        }
    }

    public /* synthetic */ h8(n8 n8Var, m0 m0Var, h0 h0Var) {
        this.a = 1;
        this.b = n8Var;
        this.c = m0Var;
        this.d = h0Var;
    }
}
