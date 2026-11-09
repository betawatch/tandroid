package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class mb implements ii0 {
    public final /* synthetic */ nb a;

    public mb(nb nbVar) {
        this.a = nbVar;
    }

    @Override // org.telegram.ui.Components.ii0
    public final /* synthetic */ boolean E() {
        return false;
    }

    @Override // org.telegram.ui.Components.ii0
    public final /* synthetic */ boolean U() {
        return false;
    }

    @Override // org.telegram.ui.Components.ii0
    public final void i(View view, ch.o0 o0Var, boolean z9, boolean z10) {
        nb nbVar = this.a;
        org.telegram.ui.ActionBar.f2 f2Var = nbVar.f;
        if (nbVar.e == null) {
            return;
        }
        boolean z11 = (f2Var instanceof org.telegram.ui.cn) && ((org.telegram.ui.cn) f2Var).a() == org.telegram.messenger.p10.i(f2Var.getCurrentAccount()).e();
        int i7 = 0;
        for (int i10 = 0; i10 < nbVar.e.size(); i10++) {
            int keyAt = nbVar.e.keyAt(i10);
            TLRPC.Message message = new TLRPC.Message();
            message.dialog_id = f2Var.getUserConfig().e();
            message.id = keyAt;
            org.telegram.messenger.ij ijVar = new org.telegram.messenger.ij(f2Var.getCurrentAccount(), message, false, false);
            ArrayList arrayList = new ArrayList();
            arrayList.add(o0Var);
            f2Var.getSendMessagesHelper().s0(ijVar, arrayList, o0Var, false, false, nbVar.f, null);
            i7 = message.id;
        }
        nbVar.f();
        cc.e();
        org.telegram.messenger.g0.i3(new org.telegram.messenger.rw(this, o0Var, !z11, f2Var.getCurrentAccount(), i7), 300L);
    }

    @Override // org.telegram.ui.Components.ii0
    public final /* synthetic */ boolean v() {
        return true;
    }

    @Override // org.telegram.ui.Components.ii0
    public final /* synthetic */ void M() {
    }

    @Override // org.telegram.ui.Components.ii0
    public final /* synthetic */ void L(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i7, boolean z9) {
    }
}
