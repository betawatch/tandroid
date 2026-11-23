package org.telegram.ui.Wallet;

import android.text.TextUtils;
import java.nio.charset.StandardCharsets;
import org.telegram.ui.Components.d51;
import org.telegram.ui.a31;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class y8 implements org.telegram.ui.ActionBar.q1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ d51 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ y8(d51 d51Var, Object obj, Object obj2, int i7) {
        this.a = i7;
        this.b = d51Var;
        this.d = obj;
        this.c = obj2;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public final void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.a) {
            case 0:
                e9 e9Var = (e9) this.b;
                Boolean bool = (Boolean) this.d;
                v0 v0Var = (v0) this.c;
                if (!bool.booleanValue()) {
                    v0Var.c.C();
                }
                o3.a(v0Var.a, new ci.y(11), null, null, null, new fi.b0(6, v0Var, new a31(15, e9Var, (e9Var.getParentLayout() == null || e9Var.getParentLayout().getFragmentStack().size() <= 1) ? null : (org.telegram.ui.ActionBar.g2) e9Var.getParentLayout().getFragmentStack().get(e9Var.getParentLayout().getFragmentStack().size() - 2))), false, true, new m.b3(null, null));
                break;
            case 1:
                e9 e9Var2 = (e9) this.b;
                v0 v0Var2 = (v0) this.c;
                p0 p0Var = (p0) this.d;
                vf.b h = t1Var.h(i7, true, true);
                h.d();
                a9 a9Var = new a9(e9Var2, h, 0);
                v0.P("disable backup: getting phrase...");
                v0Var2.F(false, true, false, new j((Object) v0Var2, (Object) a9Var, (Object) p0Var, 6));
                break;
            default:
                ea eaVar = (ea) this.b;
                kg.z0 z0Var = (kg.z0) this.d;
                org.telegram.ui.Cells.d2 d2Var = (org.telegram.ui.Cells.d2) this.c;
                if (z0Var.getText().toString().getBytes(StandardCharsets.UTF_8).length <= 960) {
                    String trim = z0Var.getText().toString().trim();
                    eaVar.h0 = TextUtils.isEmpty(trim) ? null : trim;
                    eaVar.i0 = !d2Var.b();
                    if (TextUtils.isEmpty(eaVar.h0)) {
                        eaVar.Q.setVisibility(8);
                    } else {
                        eaVar.Q.setText(eaVar.h0);
                        eaVar.Q.setVisibility(0);
                    }
                    eaVar.E0();
                    t1Var.dismiss();
                    eaVar.t0();
                    break;
                } else {
                    int i10 = -eaVar.p0;
                    eaVar.p0 = i10;
                    org.telegram.messenger.g0.E3(i10, z0Var, null);
                    break;
                }
        }
    }

    public /* synthetic */ y8(e9 e9Var, v0 v0Var, p0 p0Var) {
        this.a = 1;
        this.b = e9Var;
        this.c = v0Var;
        this.d = p0Var;
    }
}
