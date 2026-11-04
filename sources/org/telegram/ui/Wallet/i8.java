package org.telegram.ui.Wallet;

import android.text.TextUtils;
import java.nio.charset.StandardCharsets;
import org.telegram.ui.Components.h41;
import org.telegram.ui.e51;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class i8 implements org.telegram.ui.ActionBar.p1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ h41 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ i8(h41 h41Var, Object obj, Object obj2, int i3) {
        this.a = i3;
        this.b = h41Var;
        this.d = obj;
        this.c = obj2;
    }

    @Override // org.telegram.ui.ActionBar.p1
    public final void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        switch (this.a) {
            case 0:
                n8 n8Var = (n8) this.b;
                Boolean bool = (Boolean) this.d;
                k0 k0Var = (k0) this.c;
                if (!bool.booleanValue()) {
                    k0Var.c.B();
                }
                g3.a(k0Var.a, new bi.x(10), null, null, null, new ei.d0(5, k0Var, new e51(13, n8Var, (n8Var.getParentLayout() == null || n8Var.getParentLayout().getFragmentStack().size() <= 1) ? null : (org.telegram.ui.ActionBar.d2) n8Var.getParentLayout().getFragmentStack().get(n8Var.getParentLayout().getFragmentStack().size() - 2))), false, true, new cg.u0((Object) null, 2));
                break;
            case 1:
                n8 n8Var2 = (n8) this.b;
                k0 k0Var2 = (k0) this.c;
                f0 f0Var = (f0) this.d;
                sf.b h = s1Var.h(i3, true, true);
                h.d();
                j8 j8Var = new j8(n8Var2, h, 2);
                k0.H("disable backup: getting phrase...");
                k0Var2.z(new j((Object) k0Var2, (Object) j8Var, (Object) f0Var, 1), false, true);
                break;
            default:
                m9 m9Var = (m9) this.b;
                lg.y0 y0Var = (lg.y0) this.d;
                org.telegram.ui.Cells.c2 c2Var = (org.telegram.ui.Cells.c2) this.c;
                if (y0Var.getText().toString().getBytes(StandardCharsets.UTF_8).length <= 960) {
                    String trim = y0Var.getText().toString().trim();
                    m9Var.h0 = TextUtils.isEmpty(trim) ? null : trim;
                    m9Var.i0 = !c2Var.b();
                    if (TextUtils.isEmpty(m9Var.h0)) {
                        m9Var.Q.setVisibility(8);
                    } else {
                        m9Var.Q.setText(m9Var.h0);
                        m9Var.Q.setVisibility(0);
                    }
                    m9Var.E0();
                    s1Var.dismiss();
                    m9Var.t0();
                    break;
                } else {
                    int i10 = -m9Var.p0;
                    m9Var.p0 = i10;
                    org.telegram.messenger.g0.G3(i10, y0Var, null);
                    break;
                }
        }
    }

    public /* synthetic */ i8(n8 n8Var, k0 k0Var, f0 f0Var) {
        this.a = 1;
        this.b = n8Var;
        this.c = k0Var;
        this.d = f0Var;
    }
}
