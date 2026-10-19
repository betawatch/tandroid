package org.telegram.ui.Wallet;

import android.text.TextUtils;
import java.nio.charset.StandardCharsets;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.w61;
import org.telegram.ui.na0;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final /* synthetic */ class b8 implements org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ w61 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ b8(w61 w61Var, Object obj, Object obj2, int i10) {
        this.a = i10;
        this.b = w61Var;
        this.d = obj;
        this.c = obj2;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                h8 h8Var = (h8) this.b;
                Boolean bool = (Boolean) this.d;
                m0 m0Var = (m0) this.c;
                if (!bool.booleanValue()) {
                    m0Var.c.B();
                }
                s2.a(m0Var.a, new gi.c(9), null, null, null, new ci.c0(5, m0Var, new x(9, h8Var, (h8Var.getParentLayout() == null || h8Var.getParentLayout().getFragmentStack().size() <= 1) ? null : (org.telegram.ui.ActionBar.n2) h8Var.getParentLayout().getFragmentStack().get(h8Var.getParentLayout().getFragmentStack().size() - 2))), false, true, new na0((Object) null, 1));
                break;
            case 1:
                h8 h8Var2 = (h8) this.b;
                m0 m0Var2 = (m0) this.c;
                h0 h0Var = (h0) this.d;
                pf.c h = b2Var.h(i10, true, true);
                h.d();
                d8 d8Var = new d8(h8Var2, h, 2);
                m0.F("disable backup: getting phrase...");
                m0Var2.y(new k((Object) m0Var2, (Object) d8Var, (Object) h0Var, 5), false, true);
                break;
            default:
                i9 i9Var = (i9) this.b;
                ig.a1 a1Var = (ig.a1) this.d;
                org.telegram.ui.Cells.a2 a2Var = (org.telegram.ui.Cells.a2) this.c;
                if (a1Var.getText().toString().getBytes(StandardCharsets.UTF_8).length <= 960) {
                    String trim = a1Var.getText().toString().trim();
                    if (TextUtils.isEmpty(trim)) {
                        trim = null;
                    }
                    i9Var.d0 = trim;
                    i9Var.e0 = !a2Var.b();
                    if (TextUtils.isEmpty(i9Var.d0)) {
                        i9Var.M.setVisibility(8);
                    } else {
                        i9Var.M.setText(i9Var.d0);
                        i9Var.M.setVisibility(0);
                    }
                    i9Var.y0();
                    b2Var.dismiss();
                    i9Var.n0();
                    break;
                } else {
                    int i11 = -i9Var.l0;
                    i9Var.l0 = i11;
                    AndroidUtilities.shakeViewSpring(a1Var, i11);
                    break;
                }
        }
    }

    public /* synthetic */ b8(h8 h8Var, m0 m0Var, h0 h0Var) {
        this.a = 1;
        this.b = h8Var;
        this.c = m0Var;
        this.d = h0Var;
    }
}
