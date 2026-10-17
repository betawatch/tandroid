package org.telegram.ui.Wallet;

import android.text.TextUtils;
import java.nio.charset.StandardCharsets;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.v61;
import org.telegram.ui.pa0;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e8 implements org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ v61 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ e8(v61 v61Var, Object obj, Object obj2, int i10) {
        this.a = i10;
        this.b = v61Var;
        this.d = obj;
        this.c = obj2;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                k8 k8Var = (k8) this.b;
                Boolean bool = (Boolean) this.d;
                m0 m0Var = (m0) this.c;
                if (!bool.booleanValue()) {
                    m0Var.c.B();
                }
                s2.a(m0Var.a, new gi.c(9), null, null, null, new ci.c0(5, m0Var, new x(9, k8Var, (k8Var.getParentLayout() == null || k8Var.getParentLayout().getFragmentStack().size() <= 1) ? null : (org.telegram.ui.ActionBar.n2) k8Var.getParentLayout().getFragmentStack().get(k8Var.getParentLayout().getFragmentStack().size() - 2))), false, true, new pa0((Object) null, 1));
                break;
            case 1:
                k8 k8Var2 = (k8) this.b;
                m0 m0Var2 = (m0) this.c;
                h0 h0Var = (h0) this.d;
                pf.c g10 = b2Var.g(i10, true, true);
                g10.d();
                g8 g8Var = new g8(k8Var2, g10, 2);
                m0.F("disable backup: getting phrase...");
                m0Var2.y(new k((Object) m0Var2, (Object) g8Var, (Object) h0Var, 5), false, true);
                break;
            default:
                l9 l9Var = (l9) this.b;
                ig.y0 y0Var = (ig.y0) this.d;
                org.telegram.ui.Cells.a2 a2Var = (org.telegram.ui.Cells.a2) this.c;
                if (y0Var.getText().toString().getBytes(StandardCharsets.UTF_8).length <= 960) {
                    String trim = y0Var.getText().toString().trim();
                    if (TextUtils.isEmpty(trim)) {
                        trim = null;
                    }
                    l9Var.d0 = trim;
                    l9Var.e0 = !a2Var.b();
                    if (TextUtils.isEmpty(l9Var.d0)) {
                        l9Var.M.setVisibility(8);
                    } else {
                        l9Var.M.setText(l9Var.d0);
                        l9Var.M.setVisibility(0);
                    }
                    l9Var.y0();
                    b2Var.dismiss();
                    l9Var.n0();
                    break;
                } else {
                    int i11 = -l9Var.l0;
                    l9Var.l0 = i11;
                    AndroidUtilities.shakeViewSpring(y0Var, i11);
                    break;
                }
        }
    }

    public /* synthetic */ e8(k8 k8Var, m0 m0Var, h0 h0Var) {
        this.a = 1;
        this.b = k8Var;
        this.c = m0Var;
        this.d = h0Var;
    }
}
