package org.telegram.ui.Wallet;

import android.text.TextUtils;
import java.nio.charset.StandardCharsets;
import org.telegram.ui.Components.e51;
import org.telegram.ui.p51;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x8 implements org.telegram.ui.ActionBar.q1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e51 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ x8(e51 e51Var, Object obj, Object obj2, int i7) {
        this.a = i7;
        this.b = e51Var;
        this.d = obj;
        this.c = obj2;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public final void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.a) {
            case 0:
                d9 d9Var = (d9) this.b;
                Boolean bool = (Boolean) this.d;
                u0 u0Var = (u0) this.c;
                if (!bool.booleanValue()) {
                    u0Var.c.C();
                }
                n3.a(u0Var.a, new ci.y(11), null, null, null, new fi.b0(6, u0Var, new p51(14, d9Var, (d9Var.getParentLayout() == null || d9Var.getParentLayout().getFragmentStack().size() <= 1) ? null : (org.telegram.ui.ActionBar.g2) d9Var.getParentLayout().getFragmentStack().get(d9Var.getParentLayout().getFragmentStack().size() - 2))), false, true, new m.b3(null, null));
                break;
            case 1:
                d9 d9Var2 = (d9) this.b;
                u0 u0Var2 = (u0) this.c;
                o0 o0Var = (o0) this.d;
                vf.b h = t1Var.h(i7, true, true);
                h.d();
                z8 z8Var = new z8(d9Var2, h, 0);
                u0.P("disable backup: getting phrase...");
                u0Var2.F(false, true, false, new j((Object) u0Var2, (Object) z8Var, (Object) o0Var, 6));
                break;
            default:
                da daVar = (da) this.b;
                kg.z0 z0Var = (kg.z0) this.d;
                org.telegram.ui.Cells.d2 d2Var = (org.telegram.ui.Cells.d2) this.c;
                if (z0Var.getText().toString().getBytes(StandardCharsets.UTF_8).length <= 960) {
                    String trim = z0Var.getText().toString().trim();
                    daVar.h0 = TextUtils.isEmpty(trim) ? null : trim;
                    daVar.i0 = !d2Var.b();
                    if (TextUtils.isEmpty(daVar.h0)) {
                        daVar.Q.setVisibility(8);
                    } else {
                        daVar.Q.setText(daVar.h0);
                        daVar.Q.setVisibility(0);
                    }
                    daVar.E0();
                    t1Var.dismiss();
                    daVar.t0();
                    break;
                } else {
                    int i10 = -daVar.p0;
                    daVar.p0 = i10;
                    org.telegram.messenger.g0.E3(i10, z0Var, null);
                    break;
                }
        }
    }

    public /* synthetic */ x8(d9 d9Var, u0 u0Var, o0 o0Var) {
        this.a = 1;
        this.b = d9Var;
        this.c = u0Var;
        this.d = o0Var;
    }
}
