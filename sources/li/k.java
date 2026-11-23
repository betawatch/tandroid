package li;

import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.ls;
import org.telegram.messenger.mr;
import org.telegram.messenger.w10;
import org.telegram.messenger.x10;
import org.telegram.ui.Components.o41;
import r0.l1;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final /* synthetic */ class k implements w10, x10, r0.m, mr {
    public final /* synthetic */ p a;

    public /* synthetic */ k(p pVar) {
        this.a = pVar;
    }

    @Override // r0.m
    public l1 P0(View view, l1 l1Var) {
        i0.b f10 = l1Var.a.f(519);
        this.a.e.setPadding(0, f10.b, 0, f10.d);
        return l1.b;
    }

    @Override // org.telegram.messenger.x10
    public Boolean a(o41 o41Var, View view, Integer num, Float f10, Float f11) {
        return Boolean.valueOf(p.Z(this.a, o41Var, view));
    }

    @Override // org.telegram.messenger.mr
    public void d(boolean z10) {
        p pVar = this.a;
        pVar.finishFragment();
        pVar.getNotificationCenter().k(ls.K2, Long.valueOf(-pVar.c), null, pVar.J, Boolean.valueOf(z10));
    }

    @Override // org.telegram.messenger.w10
    public void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        p.a0(this.a, (o41) obj);
    }
}
