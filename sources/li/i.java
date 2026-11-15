package li;

import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.nr;
import org.telegram.messenger.ns;
import org.telegram.messenger.x10;
import org.telegram.messenger.y10;
import org.telegram.ui.Components.b41;
import r0.k1;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final /* synthetic */ class i implements x10, y10, r0.m, nr {
    public final /* synthetic */ n a;

    public /* synthetic */ i(n nVar) {
        this.a = nVar;
    }

    @Override // r0.m
    public k1 M0(View view, k1 k1Var) {
        i0.c f10 = k1Var.a.f(519);
        this.a.e.setPadding(0, f10.b, 0, f10.d);
        return k1.b;
    }

    @Override // org.telegram.messenger.y10
    public Boolean a(b41 b41Var, View view, Integer num, Float f10, Float f11) {
        return Boolean.valueOf(n.Z(this.a, b41Var, view));
    }

    @Override // org.telegram.messenger.nr
    public void j(boolean z10) {
        n nVar = this.a;
        nVar.finishFragment();
        nVar.getNotificationCenter().k(ns.K2, Long.valueOf(-nVar.c), null, nVar.J, Boolean.valueOf(z10));
    }

    @Override // org.telegram.messenger.x10
    public void m(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        n.a0(this.a, (b41) obj);
    }
}
