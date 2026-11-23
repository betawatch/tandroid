package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class pb implements wi0 {
    public final /* synthetic */ qb a;

    public pb(qb qbVar) {
        this.a = qbVar;
    }

    @Override // org.telegram.ui.Components.wi0
    public final void h(View view, ch.p0 p0Var, boolean z10, boolean z11) {
        qb qbVar = this.a;
        org.telegram.ui.ActionBar.g2 g2Var = qbVar.f;
        if (qbVar.e == null) {
            return;
        }
        boolean z12 = (g2Var instanceof org.telegram.ui.bn) && ((org.telegram.ui.bn) g2Var).a() == org.telegram.messenger.i10.i(g2Var.getCurrentAccount()).e();
        int i7 = 0;
        for (int i10 = 0; i10 < qbVar.e.size(); i10++) {
            int keyAt = qbVar.e.keyAt(i10);
            TLRPC.Message message = new TLRPC.Message();
            message.dialog_id = g2Var.getUserConfig().e();
            message.id = keyAt;
            org.telegram.messenger.fj fjVar = new org.telegram.messenger.fj(g2Var.getCurrentAccount(), message, false, false);
            ArrayList arrayList = new ArrayList();
            arrayList.add(p0Var);
            g2Var.getSendMessagesHelper().s0(fjVar, arrayList, p0Var, false, false, qbVar.f, null);
            i7 = message.id;
        }
        qbVar.f();
        fc.e();
        org.telegram.messenger.g0.h3(new bi.w4(this, p0Var, !z12, g2Var.getCurrentAccount(), i7), 300L);
    }

    @Override // org.telegram.ui.Components.wi0
    public final /* synthetic */ boolean l() {
        return true;
    }

    @Override // org.telegram.ui.Components.wi0
    public final /* synthetic */ boolean n() {
        return false;
    }

    @Override // org.telegram.ui.Components.wi0
    public final /* synthetic */ boolean t() {
        return false;
    }

    @Override // org.telegram.ui.Components.wi0
    public final /* synthetic */ void r() {
    }

    @Override // org.telegram.ui.Components.wi0
    public final /* synthetic */ void q(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i7, boolean z10) {
    }
}
