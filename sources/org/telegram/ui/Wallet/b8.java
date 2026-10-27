package org.telegram.ui.Wallet;

import android.text.TextUtils;
import java.nio.charset.StandardCharsets;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.n71;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b8 implements org.telegram.ui.ActionBar.b2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ n71 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ b8(n71 n71Var, Object obj, Object obj2, int i10) {
        this.a = i10;
        this.b = n71Var;
        this.d = obj;
        this.c = obj2;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.a) {
            case 0:
                h8 h8Var = (h8) this.b;
                Boolean bool = (Boolean) this.d;
                l0 l0Var = (l0) this.c;
                if (!bool.booleanValue()) {
                    l0Var.c.B();
                }
                r2.a(l0Var.a, new ai.d0(13), null, null, null, new di.c0(5, l0Var, new s(11, h8Var, (h8Var.getParentLayout() == null || h8Var.getParentLayout().getFragmentStack().size() <= 1) ? null : (org.telegram.ui.ActionBar.r2) h8Var.getParentLayout().getFragmentStack().get(h8Var.getParentLayout().getFragmentStack().size() - 2))), false, true, new ag.b1((Object) null, 2));
                break;
            case 1:
                h8 h8Var2 = (h8) this.b;
                l0 l0Var2 = (l0) this.c;
                g0 g0Var = (g0) this.d;
                qf.c h = e2Var.h(i10, true, true);
                h.d();
                d8 d8Var = new d8(h8Var2, h, 2);
                l0.H("disable backup: getting phrase...");
                l0Var2.z(new j((Object) l0Var2, (Object) d8Var, (Object) g0Var, 5), false, true);
                break;
            default:
                i9 i9Var = (i9) this.b;
                jg.a1 a1Var = (jg.a1) this.d;
                org.telegram.ui.Cells.y1 y1Var = (org.telegram.ui.Cells.y1) this.c;
                if (a1Var.getText().toString().getBytes(StandardCharsets.UTF_8).length <= 960) {
                    String trim = a1Var.getText().toString().trim();
                    if (TextUtils.isEmpty(trim)) {
                        trim = null;
                    }
                    i9Var.g0 = trim;
                    i9Var.h0 = !y1Var.b();
                    if (TextUtils.isEmpty(i9Var.g0)) {
                        i9Var.P.setVisibility(8);
                    } else {
                        i9Var.P.setText(i9Var.g0);
                        i9Var.P.setVisibility(0);
                    }
                    i9Var.A0();
                    e2Var.dismiss();
                    i9Var.p0();
                    break;
                } else {
                    int i11 = -i9Var.o0;
                    i9Var.o0 = i11;
                    AndroidUtilities.shakeViewSpring(a1Var, i11);
                    break;
                }
        }
    }

    public /* synthetic */ b8(h8 h8Var, l0 l0Var, g0 g0Var) {
        this.a = 1;
        this.b = h8Var;
        this.c = l0Var;
        this.d = g0Var;
    }
}
