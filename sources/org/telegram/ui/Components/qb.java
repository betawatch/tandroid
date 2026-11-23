package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class qb implements wi0 {
    public final /* synthetic */ rb a;

    public qb(rb rbVar) {
        this.a = rbVar;
    }

    @Override // org.telegram.ui.Components.wi0
    public final /* synthetic */ boolean E() {
        return false;
    }

    @Override // org.telegram.ui.Components.wi0
    public final void g(View view, ch.p0 p0Var, boolean z10, boolean z11) {
        rb rbVar = this.a;
        org.telegram.ui.ActionBar.g2 g2Var = rbVar.f;
        if (rbVar.e == null) {
            return;
        }
        boolean z12 = (g2Var instanceof org.telegram.ui.bn) && ((org.telegram.ui.bn) g2Var).a() == org.telegram.messenger.k10.i(g2Var.getCurrentAccount()).e();
        int i7 = 0;
        for (int i10 = 0; i10 < rbVar.e.size(); i10++) {
            int keyAt = rbVar.e.keyAt(i10);
            TLRPC.Message message = new TLRPC.Message();
            message.dialog_id = g2Var.getUserConfig().e();
            message.id = keyAt;
            org.telegram.messenger.gj gjVar = new org.telegram.messenger.gj(g2Var.getCurrentAccount(), message, false, false);
            ArrayList arrayList = new ArrayList();
            arrayList.add(p0Var);
            g2Var.getSendMessagesHelper().s0(gjVar, arrayList, p0Var, false, false, rbVar.f, null);
            i7 = message.id;
        }
        rbVar.f();
        gc.e();
        org.telegram.messenger.g0.h3(new bi.t4(this, p0Var, !z12, g2Var.getCurrentAccount(), i7), 300L);
    }

    @Override // org.telegram.ui.Components.wi0
    public final /* synthetic */ boolean o() {
        return true;
    }

    @Override // org.telegram.ui.Components.wi0
    public final /* synthetic */ boolean q() {
        return false;
    }

    @Override // org.telegram.ui.Components.wi0
    public final /* synthetic */ void z() {
    }

    @Override // org.telegram.ui.Components.wi0
    public final /* synthetic */ void x(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i7, boolean z10) {
    }
}
