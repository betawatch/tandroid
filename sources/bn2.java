// default package

import android.view.View;
import java.io.Serializable;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class bn2 implements n8c, o8c, no7, sc7 {
    public final /* synthetic */ en2 a;

    public /* synthetic */ bn2(en2 en2Var) {
        this.a = en2Var;
    }

    @Override // no7
    public final vxc W(View view, vxc vxcVar) {
        io5 f = vxcVar.a.f(519);
        this.a.e.setPadding(0, f.b, 0, f.d);
        return vxc.b;
    }

    @Override // o8c
    public final Boolean d(c4c c4cVar, View view, Integer num, Float f, Float f2) {
        return Boolean.valueOf(this.a.c0(c4cVar, view));
    }

    @Override // n8c
    public final void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        this.a.b0((c4c) obj);
    }

    @Override // sc7
    public final void k(boolean z) {
        en2 en2Var = this.a;
        en2Var.finishFragment();
        en2Var.getNotificationCenter().k(kk7.J2, Long.valueOf(-en2Var.c), null, en2Var.J, Boolean.valueOf(z));
    }
}
