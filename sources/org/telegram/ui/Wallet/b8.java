package org.telegram.ui.Wallet;

import android.text.TextUtils;
import java.nio.charset.StandardCharsets;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.e71;
import org.telegram.ui.ta0;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final /* synthetic */ class b8 implements org.telegram.ui.ActionBar.z1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e71 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ b8(e71 e71Var, Object obj, Object obj2, int i10) {
        this.a = i10;
        this.b = e71Var;
        this.d = obj;
        this.c = obj2;
    }

    @Override // org.telegram.ui.ActionBar.z1
    public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.a) {
            case 0:
                i8 i8Var = (i8) this.b;
                Boolean bool = (Boolean) this.d;
                l0 l0Var = (l0) this.c;
                if (!bool.booleanValue()) {
                    l0Var.c.B();
                }
                r2.a(l0Var.a, new gi.c(9), null, null, null, new ci.c0(5, l0Var, new w(9, i8Var, (i8Var.getParentLayout() == null || i8Var.getParentLayout().getFragmentStack().size() <= 1) ? null : (org.telegram.ui.ActionBar.o2) i8Var.getParentLayout().getFragmentStack().get(i8Var.getParentLayout().getFragmentStack().size() - 2))), false, true, new ta0((Object) null, 1));
                break;
            case 1:
                i8 i8Var2 = (i8) this.b;
                l0 l0Var2 = (l0) this.c;
                g0 g0Var = (g0) this.d;
                pf.c h = c2Var.h(i10, true, true);
                h.d();
                d8 d8Var = new d8(i8Var2, h, 2);
                l0.F("disable backup: getting phrase...");
                l0Var2.y(new j((Object) l0Var2, (Object) d8Var, (Object) g0Var, 5), false, true);
                break;
            default:
                j9 j9Var = (j9) this.b;
                ig.z0 z0Var = (ig.z0) this.d;
                org.telegram.ui.Cells.z1 z1Var = (org.telegram.ui.Cells.z1) this.c;
                if (z0Var.getText().toString().getBytes(StandardCharsets.UTF_8).length <= 960) {
                    String trim = z0Var.getText().toString().trim();
                    if (TextUtils.isEmpty(trim)) {
                        trim = null;
                    }
                    j9Var.f0 = trim;
                    j9Var.g0 = !z1Var.b();
                    if (TextUtils.isEmpty(j9Var.f0)) {
                        j9Var.O.setVisibility(8);
                    } else {
                        j9Var.O.setText(j9Var.f0);
                        j9Var.O.setVisibility(0);
                    }
                    j9Var.z0();
                    c2Var.dismiss();
                    j9Var.o0();
                    break;
                } else {
                    int i11 = -j9Var.n0;
                    j9Var.n0 = i11;
                    AndroidUtilities.shakeViewSpring(z0Var, i11);
                    break;
                }
        }
    }

    public /* synthetic */ b8(i8 i8Var, l0 l0Var, g0 g0Var) {
        this.a = 1;
        this.b = i8Var;
        this.c = l0Var;
        this.d = g0Var;
    }
}
