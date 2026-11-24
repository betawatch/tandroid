// default package

import android.view.View;
import java.io.Serializable;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class mo2 implements oac, pac, qq7, ue7 {
    public final /* synthetic */ po2 a;

    public /* synthetic */ mo2(po2 po2Var) {
        this.a = po2Var;
    }

    @Override // qq7
    public final wzc C0(View view, wzc wzcVar) {
        iq5 f = wzcVar.a.f(519);
        this.a.e.setPadding(0, f.b, 0, f.d);
        return wzc.b;
    }

    @Override // pac
    public final Object b(c6c c6cVar, View view, Integer num, Float f, Float f2) {
        return Boolean.valueOf(this.a.d0(c6cVar, view));
    }

    @Override // oac
    public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        this.a.c0((c6c) obj);
    }

    @Override // ue7
    public final void z(boolean z) {
        po2 po2Var = this.a;
        po2Var.finishFragment();
        po2Var.getNotificationCenter().k(nm7.K2, Long.valueOf(-po2Var.c), null, po2Var.J, Boolean.valueOf(z));
    }
}
