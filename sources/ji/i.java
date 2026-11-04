package ji;

import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.hs;
import org.telegram.messenger.ir;
import org.telegram.messenger.s10;
import org.telegram.messenger.t10;
import org.telegram.ui.Components.r31;
import r0.k1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i implements s10, t10, r0.m, ir {
    public final /* synthetic */ n a;

    public /* synthetic */ i(n nVar) {
        this.a = nVar;
    }

    @Override // r0.m
    public k1 R0(View view, k1 k1Var) {
        i0.b f10 = k1Var.a.f(519);
        this.a.e.setPadding(0, f10.b, 0, f10.d);
        return k1.b;
    }

    @Override // org.telegram.messenger.t10
    public Boolean a(r31 r31Var, View view, Integer num, Float f10, Float f11) {
        return Boolean.valueOf(n.Z(this.a, r31Var, view));
    }

    @Override // org.telegram.messenger.s10
    public void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        n.a0(this.a, (r31) obj);
    }

    @Override // org.telegram.messenger.ir
    public void o(boolean z10) {
        n nVar = this.a;
        nVar.finishFragment();
        nVar.getNotificationCenter().k(hs.K2, Long.valueOf(-nVar.c), null, nVar.J, Boolean.valueOf(z10));
    }
}
