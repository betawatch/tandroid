package li;

import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.ks;
import org.telegram.messenger.lr;
import org.telegram.messenger.u10;
import org.telegram.messenger.v10;
import org.telegram.ui.Components.n41;
import r0.l1;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class j implements u10, v10, r0.m, lr {
    public final /* synthetic */ o a;

    public /* synthetic */ j(o oVar) {
        this.a = oVar;
    }

    @Override // org.telegram.messenger.v10
    public Boolean a(n41 n41Var, View view, Integer num, Float f10, Float f11) {
        return Boolean.valueOf(o.Z(this.a, n41Var, view));
    }

    @Override // org.telegram.messenger.u10
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        o.a0(this.a, (n41) obj);
    }

    @Override // r0.m
    public l1 l1(View view, l1 l1Var) {
        i0.b f10 = l1Var.a.f(519);
        this.a.e.setPadding(0, f10.b, 0, f10.d);
        return l1.b;
    }

    @Override // org.telegram.messenger.lr
    public void q(boolean z10) {
        o oVar = this.a;
        oVar.finishFragment();
        oVar.getNotificationCenter().k(ks.K2, Long.valueOf(-oVar.c), null, oVar.J, Boolean.valueOf(z10));
    }
}
