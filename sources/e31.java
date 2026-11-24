// default package

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class e31 implements u29 {
    public final /* synthetic */ f31 a;

    public e31(f31 f31Var) {
        this.a = f31Var;
    }

    @Override // u29
    public final void g(View view, k39 k39Var, boolean z, boolean z2) {
        f31 f31Var = this.a;
        d dVar = f31Var.f;
        if (f31Var.e == null) {
            return;
        }
        boolean z3 = (dVar instanceof yv1) && ((yv1) dVar).a() == z8c.h(dVar.getCurrentAccount()).e();
        int i = 0;
        for (int i2 = 0; i2 < f31Var.e.size(); i2++) {
            int keyAt = f31Var.e.keyAt(i2);
            TLRPC.Message message = new TLRPC.Message();
            message.dialog_id = dVar.getUserConfig().e();
            message.id = keyAt;
            k47 k47Var = new k47(dVar.getCurrentAccount(), message, false, false);
            ArrayList arrayList = new ArrayList();
            arrayList.add(k39Var);
            dVar.getSendMessagesHelper().r0(k47Var, arrayList, k39Var, false, false, f31Var.f, null);
            i = message.id;
        }
        f31Var.f();
        u31.e();
        gm.d3(new d31(this, k39Var, !z3, dVar.getCurrentAccount(), i), 300L);
    }

    @Override // u29
    public final boolean h() {
        return true;
    }

    @Override // u29
    public final boolean l() {
        return false;
    }

    @Override // u29
    public final boolean s() {
        return false;
    }

    @Override // u29
    public final void o() {
    }

    @Override // u29
    public final void m(Canvas canvas, RectF rectF, float f, float f2, float f3, int i, boolean z) {
    }
}
