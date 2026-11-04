package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class kb implements ki0 {
    public final /* synthetic */ lb a;

    public kb(lb lbVar) {
        this.a = lbVar;
    }

    @Override // org.telegram.ui.Components.ki0
    public final /* synthetic */ boolean O() {
        return false;
    }

    @Override // org.telegram.ui.Components.ki0
    public final /* synthetic */ boolean r() {
        return true;
    }

    @Override // org.telegram.ui.Components.ki0
    public final /* synthetic */ boolean v() {
        return false;
    }

    @Override // org.telegram.ui.Components.ki0
    public final void z(View view, dh.n0 n0Var, boolean z10, boolean z11) {
        lb lbVar = this.a;
        org.telegram.ui.ActionBar.d2 d2Var = lbVar.f;
        if (lbVar.e == null) {
            return;
        }
        boolean z12 = (d2Var instanceof org.telegram.ui.wm) && ((org.telegram.ui.wm) d2Var).a() == org.telegram.messenger.h10.i(d2Var.getCurrentAccount()).e();
        int i3 = 0;
        for (int i10 = 0; i10 < lbVar.e.size(); i10++) {
            int keyAt = lbVar.e.keyAt(i10);
            TLRPC.Message message = new TLRPC.Message();
            message.dialog_id = d2Var.getUserConfig().e();
            message.id = keyAt;
            org.telegram.messenger.zi ziVar = new org.telegram.messenger.zi(d2Var.getCurrentAccount(), message, false, false);
            ArrayList arrayList = new ArrayList();
            arrayList.add(n0Var);
            d2Var.getSendMessagesHelper().s0(ziVar, arrayList, n0Var, false, false, lbVar.f, null);
            i3 = message.id;
        }
        lbVar.f();
        ac.e();
        org.telegram.messenger.g0.i3(new org.telegram.messenger.kw(this, n0Var, !z12, d2Var.getCurrentAccount(), i3), 300L);
    }

    @Override // org.telegram.ui.Components.ki0
    public final /* synthetic */ void J() {
    }

    @Override // org.telegram.ui.Components.ki0
    public final /* synthetic */ void E(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i3, boolean z10) {
    }
}
