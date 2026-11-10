package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class lb implements hi0 {
    public final /* synthetic */ mb a;

    public lb(mb mbVar) {
        this.a = mbVar;
    }

    @Override // org.telegram.ui.Components.hi0
    public final /* synthetic */ boolean E() {
        return false;
    }

    @Override // org.telegram.ui.Components.hi0
    public final /* synthetic */ boolean U() {
        return false;
    }

    @Override // org.telegram.ui.Components.hi0
    public final void i(View view, ch.o0 o0Var, boolean z9, boolean z10) {
        mb mbVar = this.a;
        org.telegram.ui.ActionBar.f2 f2Var = mbVar.f;
        if (mbVar.e == null) {
            return;
        }
        boolean z11 = (f2Var instanceof org.telegram.ui.cn) && ((org.telegram.ui.cn) f2Var).a() == org.telegram.messenger.p10.i(f2Var.getCurrentAccount()).e();
        int i7 = 0;
        for (int i10 = 0; i10 < mbVar.e.size(); i10++) {
            int keyAt = mbVar.e.keyAt(i10);
            TLRPC.Message message = new TLRPC.Message();
            message.dialog_id = f2Var.getUserConfig().e();
            message.id = keyAt;
            org.telegram.messenger.ij ijVar = new org.telegram.messenger.ij(f2Var.getCurrentAccount(), message, false, false);
            ArrayList arrayList = new ArrayList();
            arrayList.add(o0Var);
            f2Var.getSendMessagesHelper().s0(ijVar, arrayList, o0Var, false, false, mbVar.f, null);
            i7 = message.id;
        }
        mbVar.f();
        bc.e();
        org.telegram.messenger.g0.i3(new org.telegram.messenger.rw(this, o0Var, !z11, f2Var.getCurrentAccount(), i7), 300L);
    }

    @Override // org.telegram.ui.Components.hi0
    public final /* synthetic */ boolean v() {
        return true;
    }

    @Override // org.telegram.ui.Components.hi0
    public final /* synthetic */ void M() {
    }

    @Override // org.telegram.ui.Components.hi0
    public final /* synthetic */ void L(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i7, boolean z9) {
    }
}
