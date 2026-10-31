package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class gb implements lj0 {
    public final /* synthetic */ hb a;

    public gb(hb hbVar) {
        this.a = hbVar;
    }

    @Override // org.telegram.ui.Components.lj0
    public final /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.Components.lj0
    public final /* synthetic */ boolean f() {
        return true;
    }

    @Override // org.telegram.ui.Components.lj0
    public final /* synthetic */ boolean h() {
        return false;
    }

    @Override // org.telegram.ui.Components.lj0
    public final void x(View view, sg.o0 o0Var, boolean z10, boolean z11) {
        hb hbVar = this.a;
        org.telegram.ui.ActionBar.k2 k2Var = hbVar.f;
        if (hbVar.e == null) {
            return;
        }
        boolean z12 = (k2Var instanceof org.telegram.ui.un) && ((org.telegram.ui.un) k2Var).a() == org.telegram.messenger.d20.i(k2Var.getCurrentAccount()).e();
        int i10 = 0;
        for (int i11 = 0; i11 < hbVar.e.size(); i11++) {
            int keyAt = hbVar.e.keyAt(i11);
            TLRPC.Message message = new TLRPC.Message();
            message.dialog_id = k2Var.getUserConfig().e();
            message.id = keyAt;
            org.telegram.messenger.jj jjVar = new org.telegram.messenger.jj(k2Var.getCurrentAccount(), message, false, false);
            ArrayList arrayList = new ArrayList();
            arrayList.add(o0Var);
            k2Var.getSendMessagesHelper().s0(jjVar, arrayList, o0Var, false, false, hbVar.f, null);
            i10 = message.id;
        }
        hbVar.f();
        wb.e();
        org.telegram.messenger.i0.h3(new org.telegram.messenger.dx(this, o0Var, !z12, k2Var.getCurrentAccount(), i10), 300L);
    }

    @Override // org.telegram.ui.Components.lj0
    public final /* synthetic */ void t() {
    }

    @Override // org.telegram.ui.Components.lj0
    public final /* synthetic */ void r(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
