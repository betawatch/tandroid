package org.telegram.ui.Wallet;

import android.text.TextUtils;
import java.nio.charset.StandardCharsets;
import org.telegram.ui.Components.n41;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j8 implements org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ n41 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ j8(n41 n41Var, Object obj, Object obj2, int i7) {
        this.a = i7;
        this.b = n41Var;
        this.d = obj;
        this.c = obj2;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.a) {
            case 0:
                o8 o8Var = (o8) this.b;
                Boolean bool = (Boolean) this.d;
                n0 n0Var = (n0) this.c;
                if (!bool.booleanValue()) {
                    n0Var.c.B();
                }
                i3.a(n0Var.a, new ai.c0(10), null, null, null, new di.b0(5, n0Var, new t(10, o8Var, (o8Var.getParentLayout() == null || o8Var.getParentLayout().getFragmentStack().size() <= 1) ? null : (org.telegram.ui.ActionBar.f2) o8Var.getParentLayout().getFragmentStack().get(o8Var.getParentLayout().getFragmentStack().size() - 2))), false, true, new bg.v0((Object) null, 2));
                break;
            case 1:
                o8 o8Var2 = (o8) this.b;
                n0 n0Var2 = (n0) this.c;
                i0 i0Var = (i0) this.d;
                vf.b h = u1Var.h(i7, true, true);
                h.d();
                k8 k8Var = new k8(o8Var2, h, 2);
                n0.H("disable backup: getting phrase...");
                n0Var2.z(new j((Object) n0Var2, (Object) k8Var, (Object) i0Var, 1), false, true);
                break;
            default:
                n9 n9Var = (n9) this.b;
                kg.x0 x0Var = (kg.x0) this.d;
                org.telegram.ui.Cells.c2 c2Var = (org.telegram.ui.Cells.c2) this.c;
                if (x0Var.getText().toString().getBytes(StandardCharsets.UTF_8).length <= 960) {
                    String trim = x0Var.getText().toString().trim();
                    n9Var.g0 = TextUtils.isEmpty(trim) ? null : trim;
                    n9Var.h0 = !c2Var.b();
                    if (TextUtils.isEmpty(n9Var.g0)) {
                        n9Var.P.setVisibility(8);
                    } else {
                        n9Var.P.setText(n9Var.g0);
                        n9Var.P.setVisibility(0);
                    }
                    n9Var.E0();
                    u1Var.dismiss();
                    n9Var.t0();
                    break;
                } else {
                    int i10 = -n9Var.o0;
                    n9Var.o0 = i10;
                    org.telegram.messenger.g0.G3(i10, x0Var, null);
                    break;
                }
        }
    }

    public /* synthetic */ j8(o8 o8Var, n0 n0Var, i0 i0Var) {
        this.a = 1;
        this.b = o8Var;
        this.c = n0Var;
        this.d = i0Var;
    }
}
