package org.telegram.ui.Wallet;

import android.text.TextUtils;
import java.nio.charset.StandardCharsets;
import org.telegram.ui.Components.n41;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i8 implements org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ n41 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ i8(n41 n41Var, Object obj, Object obj2, int i7) {
        this.a = i7;
        this.b = n41Var;
        this.d = obj;
        this.c = obj2;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.a) {
            case 0:
                n8 n8Var = (n8) this.b;
                Boolean bool = (Boolean) this.d;
                m0 m0Var = (m0) this.c;
                if (!bool.booleanValue()) {
                    m0Var.c.B();
                }
                h3.a(m0Var.a, new ai.c0(10), null, null, null, new di.b0(5, m0Var, new t(10, n8Var, (n8Var.getParentLayout() == null || n8Var.getParentLayout().getFragmentStack().size() <= 1) ? null : (org.telegram.ui.ActionBar.f2) n8Var.getParentLayout().getFragmentStack().get(n8Var.getParentLayout().getFragmentStack().size() - 2))), false, true, new bg.v0((Object) null, 2));
                break;
            case 1:
                n8 n8Var2 = (n8) this.b;
                m0 m0Var2 = (m0) this.c;
                h0 h0Var = (h0) this.d;
                vf.b h = u1Var.h(i7, true, true);
                h.d();
                j8 j8Var = new j8(n8Var2, h, 2);
                m0.H("disable backup: getting phrase...");
                m0Var2.z(new j((Object) m0Var2, (Object) j8Var, (Object) h0Var, 1), false, true);
                break;
            default:
                m9 m9Var = (m9) this.b;
                kg.x0 x0Var = (kg.x0) this.d;
                org.telegram.ui.Cells.c2 c2Var = (org.telegram.ui.Cells.c2) this.c;
                if (x0Var.getText().toString().getBytes(StandardCharsets.UTF_8).length <= 960) {
                    String trim = x0Var.getText().toString().trim();
                    m9Var.g0 = TextUtils.isEmpty(trim) ? null : trim;
                    m9Var.h0 = !c2Var.b();
                    if (TextUtils.isEmpty(m9Var.g0)) {
                        m9Var.P.setVisibility(8);
                    } else {
                        m9Var.P.setText(m9Var.g0);
                        m9Var.P.setVisibility(0);
                    }
                    m9Var.E0();
                    u1Var.dismiss();
                    m9Var.t0();
                    break;
                } else {
                    int i10 = -m9Var.o0;
                    m9Var.o0 = i10;
                    org.telegram.messenger.g0.G3(i10, x0Var, null);
                    break;
                }
        }
    }

    public /* synthetic */ i8(n8 n8Var, m0 m0Var, h0 h0Var) {
        this.a = 1;
        this.b = n8Var;
        this.c = m0Var;
        this.d = h0Var;
    }
}
