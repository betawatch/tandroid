package org.telegram.ui.Wallet;

import android.text.TextUtils;
import java.nio.charset.StandardCharsets;
import org.telegram.ui.Components.o41;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final /* synthetic */ class k8 implements org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ o41 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ k8(o41 o41Var, Object obj, Object obj2, int i7) {
        this.a = i7;
        this.b = o41Var;
        this.d = obj;
        this.c = obj2;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.a) {
            case 0:
                p8 p8Var = (p8) this.b;
                Boolean bool = (Boolean) this.d;
                l0 l0Var = (l0) this.c;
                if (!bool.booleanValue()) {
                    l0Var.c.B();
                }
                g3.a(l0Var.a, new ai.c0(10), null, null, null, new di.b0(5, l0Var, new s(10, p8Var, (p8Var.getParentLayout() == null || p8Var.getParentLayout().getFragmentStack().size() <= 1) ? null : (org.telegram.ui.ActionBar.f2) p8Var.getParentLayout().getFragmentStack().get(p8Var.getParentLayout().getFragmentStack().size() - 2))), false, true, new bg.v0((Object) null, 2));
                break;
            case 1:
                p8 p8Var2 = (p8) this.b;
                l0 l0Var2 = (l0) this.c;
                g0 g0Var = (g0) this.d;
                vf.b h = u1Var.h(i7, true, true);
                h.d();
                l8 l8Var = new l8(p8Var2, h, 2);
                l0.H("disable backup: getting phrase...");
                l0Var2.z(new j((Object) l0Var2, (Object) l8Var, (Object) g0Var, 1), false, true);
                break;
            default:
                o9 o9Var = (o9) this.b;
                kg.x0 x0Var = (kg.x0) this.d;
                org.telegram.ui.Cells.c2 c2Var = (org.telegram.ui.Cells.c2) this.c;
                if (x0Var.getText().toString().getBytes(StandardCharsets.UTF_8).length <= 960) {
                    String trim = x0Var.getText().toString().trim();
                    o9Var.g0 = TextUtils.isEmpty(trim) ? null : trim;
                    o9Var.h0 = !c2Var.b();
                    if (TextUtils.isEmpty(o9Var.g0)) {
                        o9Var.P.setVisibility(8);
                    } else {
                        o9Var.P.setText(o9Var.g0);
                        o9Var.P.setVisibility(0);
                    }
                    o9Var.E0();
                    u1Var.dismiss();
                    o9Var.t0();
                    break;
                } else {
                    int i10 = -o9Var.o0;
                    o9Var.o0 = i10;
                    org.telegram.messenger.g0.G3(i10, x0Var, null);
                    break;
                }
        }
    }

    public /* synthetic */ k8(p8 p8Var, l0 l0Var, g0 g0Var) {
        this.a = 1;
        this.b = p8Var;
        this.c = l0Var;
        this.d = g0Var;
    }
}
