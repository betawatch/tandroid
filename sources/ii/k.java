package ii;

import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.a20;
import org.telegram.messenger.b20;
import org.telegram.messenger.qr;
import org.telegram.messenger.qs;
import org.telegram.ui.Components.x31;
import r0.k1;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes4.dex */
public final /* synthetic */ class k implements a20, b20, r0.m, qr {
    public final /* synthetic */ p a;

    public /* synthetic */ k(p pVar) {
        this.a = pVar;
    }

    @Override // r0.m
    public k1 S0(View view, k1 k1Var) {
        i0.b f10 = k1Var.a.f(519);
        this.a.e.setPadding(0, f10.b, 0, f10.d);
        return k1.b;
    }

    @Override // org.telegram.messenger.b20
    public Boolean a(x31 x31Var, View view, Integer num, Float f10, Float f11) {
        return Boolean.valueOf(p.Z(this.a, x31Var, view));
    }

    @Override // org.telegram.messenger.a20
    public void i(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        p.a0(this.a, (x31) obj);
    }

    @Override // org.telegram.messenger.qr
    public void k(boolean z9) {
        p pVar = this.a;
        pVar.finishFragment();
        pVar.getNotificationCenter().k(qs.K2, Long.valueOf(-pVar.c), null, pVar.I, Boolean.valueOf(z9));
    }
}
