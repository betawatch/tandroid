package org.telegram.ui.Wallet;

import android.text.TextUtils;
import java.nio.charset.StandardCharsets;
import org.telegram.ui.Components.r41;
import org.telegram.ui.x21;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final /* synthetic */ class j8 implements org.telegram.ui.ActionBar.q1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ r41 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ j8(r41 r41Var, Object obj, Object obj2, int i7) {
        this.a = i7;
        this.b = r41Var;
        this.d = obj;
        this.c = obj2;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public final void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.a) {
            case 0:
                p8 p8Var = (p8) this.b;
                Boolean bool = (Boolean) this.d;
                l0 l0Var = (l0) this.c;
                if (!bool.booleanValue()) {
                    l0Var.c.B();
                }
                f3.a(l0Var.a, new ci.x(10), null, null, null, new fi.b0(5, l0Var, new x21(15, p8Var, (p8Var.getParentLayout() == null || p8Var.getParentLayout().getFragmentStack().size() <= 1) ? null : (org.telegram.ui.ActionBar.e2) p8Var.getParentLayout().getFragmentStack().get(p8Var.getParentLayout().getFragmentStack().size() - 2))), false, true, new bg.u0((Object) null, 2));
                break;
            case 1:
                p8 p8Var2 = (p8) this.b;
                l0 l0Var2 = (l0) this.c;
                g0 g0Var = (g0) this.d;
                vf.b h = t1Var.h(i7, true, true);
                h.d();
                l8 l8Var = new l8(p8Var2, h, 2);
                l0.H("disable backup: getting phrase...");
                l0Var2.z(new j((Object) l0Var2, (Object) l8Var, (Object) g0Var, 1), false, true);
                break;
            default:
                p9 p9Var = (p9) this.b;
                kg.x0 x0Var = (kg.x0) this.d;
                org.telegram.ui.Cells.c2 c2Var = (org.telegram.ui.Cells.c2) this.c;
                if (x0Var.getText().toString().getBytes(StandardCharsets.UTF_8).length <= 960) {
                    String trim = x0Var.getText().toString().trim();
                    p9Var.h0 = TextUtils.isEmpty(trim) ? null : trim;
                    p9Var.i0 = !c2Var.b();
                    if (TextUtils.isEmpty(p9Var.h0)) {
                        p9Var.Q.setVisibility(8);
                    } else {
                        p9Var.Q.setText(p9Var.h0);
                        p9Var.Q.setVisibility(0);
                    }
                    p9Var.E0();
                    t1Var.dismiss();
                    p9Var.t0();
                    break;
                } else {
                    int i10 = -p9Var.p0;
                    p9Var.p0 = i10;
                    org.telegram.messenger.g0.F3(i10, x0Var, null);
                    break;
                }
        }
    }

    public /* synthetic */ j8(p8 p8Var, l0 l0Var, g0 g0Var) {
        this.a = 1;
        this.b = p8Var;
        this.c = l0Var;
        this.d = g0Var;
    }
}
