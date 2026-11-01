package org.telegram.ui.Wallet;

import android.text.TextUtils;
import java.nio.charset.StandardCharsets;
import org.telegram.ui.Components.s51;
import org.telegram.ui.d01;
import org.telegram.ui.jo;
import org.telegram.ui.z90;
import org.telegram.ui.zh;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o8 implements org.telegram.ui.ActionBar.u1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ s51 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ o8(s51 s51Var, Object obj, Object obj2, int i10) {
        this.a = i10;
        this.b = s51Var;
        this.d = obj;
        this.c = obj2;
    }

    @Override // org.telegram.ui.ActionBar.u1
    public final void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.a) {
            case 0:
                t8 t8Var = (t8) this.b;
                Boolean bool = (Boolean) this.d;
                k0 k0Var = (k0) this.c;
                if (!bool.booleanValue()) {
                    k0Var.c.B();
                }
                i3.a(k0Var.a, new zh(7), null, null, null, new jo(2, k0Var, new d01(17, t8Var, (t8Var.getParentLayout() == null || t8Var.getParentLayout().getFragmentStack().size() <= 1) ? null : (org.telegram.ui.ActionBar.k2) t8Var.getParentLayout().getFragmentStack().get(t8Var.getParentLayout().getFragmentStack().size() - 2))), false, true, new z90((Object) null, 1));
                break;
            case 1:
                t8 t8Var2 = (t8) this.b;
                k0 k0Var2 = (k0) this.c;
                f0 f0Var = (f0) this.d;
                gf.e h = x1Var.h(i10, true, true);
                h.d();
                p8 p8Var = new p8(t8Var2, h, 2);
                k0.H("disable backup: getting phrase...");
                k0Var2.z(new j((Object) k0Var2, (Object) p8Var, (Object) f0Var, 1), false, true);
                break;
            default:
                r9 r9Var = (r9) this.b;
                ag.a2 a2Var = (ag.a2) this.d;
                org.telegram.ui.Cells.c2 c2Var = (org.telegram.ui.Cells.c2) this.c;
                if (a2Var.getText().toString().getBytes(StandardCharsets.UTF_8).length <= 960) {
                    String trim = a2Var.getText().toString().trim();
                    r9Var.g0 = TextUtils.isEmpty(trim) ? null : trim;
                    r9Var.h0 = !c2Var.b();
                    if (TextUtils.isEmpty(r9Var.g0)) {
                        r9Var.P.setVisibility(8);
                    } else {
                        r9Var.P.setText(r9Var.g0);
                        r9Var.P.setVisibility(0);
                    }
                    r9Var.E0();
                    x1Var.dismiss();
                    r9Var.t0();
                    break;
                } else {
                    int i11 = -r9Var.o0;
                    r9Var.o0 = i11;
                    org.telegram.messenger.i0.F3(i11, a2Var, null);
                    break;
                }
        }
    }

    public /* synthetic */ o8(t8 t8Var, k0 k0Var, f0 f0Var) {
        this.a = 1;
        this.b = t8Var;
        this.c = k0Var;
        this.d = f0Var;
    }
}
