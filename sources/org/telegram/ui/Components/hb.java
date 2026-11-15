package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class hb implements li0 {
    public final /* synthetic */ ib a;

    public hb(ib ibVar) {
        this.a = ibVar;
    }

    @Override // org.telegram.ui.Components.li0
    public final /* synthetic */ boolean B() {
        return false;
    }

    @Override // org.telegram.ui.Components.li0
    public final /* synthetic */ boolean L() {
        return false;
    }

    @Override // org.telegram.ui.Components.li0
    public final void h(View view, ch.p0 p0Var, boolean z10, boolean z11) {
        ib ibVar = this.a;
        org.telegram.ui.ActionBar.e2 e2Var = ibVar.f;
        if (ibVar.e == null) {
            return;
        }
        boolean z12 = (e2Var instanceof org.telegram.ui.an) && ((org.telegram.ui.an) e2Var).a() == org.telegram.messenger.m10.i(e2Var.getCurrentAccount()).e();
        int i7 = 0;
        for (int i10 = 0; i10 < ibVar.e.size(); i10++) {
            int keyAt = ibVar.e.keyAt(i10);
            TLRPC.Message message = new TLRPC.Message();
            message.dialog_id = e2Var.getUserConfig().e();
            message.id = keyAt;
            org.telegram.messenger.gj gjVar = new org.telegram.messenger.gj(e2Var.getCurrentAccount(), message, false, false);
            ArrayList arrayList = new ArrayList();
            arrayList.add(p0Var);
            e2Var.getSendMessagesHelper().s0(gjVar, arrayList, p0Var, false, false, ibVar.f, null);
            i7 = message.id;
        }
        ibVar.f();
        xb.e();
        org.telegram.messenger.g0.i3(new org.telegram.messenger.pw(this, p0Var, !z12, e2Var.getCurrentAccount(), i7), 300L);
    }

    @Override // org.telegram.ui.Components.li0
    public final /* synthetic */ boolean r() {
        return true;
    }

    @Override // org.telegram.ui.Components.li0
    public final /* synthetic */ void K() {
    }

    @Override // org.telegram.ui.Components.li0
    public final /* synthetic */ void J(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i7, boolean z10) {
    }
}
