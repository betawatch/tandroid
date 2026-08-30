package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class sb implements ok0 {
    public final /* synthetic */ tb a;

    public sb(tb tbVar) {
        this.a = tbVar;
    }

    @Override // org.telegram.ui.Components.ok0
    public final /* synthetic */ boolean h() {
        return true;
    }

    @Override // org.telegram.ui.Components.ok0
    public final void i(View view, mg.q0 q0Var, boolean z4, boolean z10) {
        tb tbVar = this.a;
        org.telegram.ui.ActionBar.p2 p2Var = tbVar.f;
        if (tbVar.e == null) {
            return;
        }
        boolean z11 = (p2Var instanceof org.telegram.ui.xn) && ((org.telegram.ui.xn) p2Var).a() == UserConfig.getInstance(p2Var.getCurrentAccount()).getClientUserId();
        int i10 = 0;
        for (int i11 = 0; i11 < tbVar.e.size(); i11++) {
            int keyAt = tbVar.e.keyAt(i11);
            TLRPC.Message message = new TLRPC.Message();
            message.dialog_id = p2Var.getUserConfig().getClientUserId();
            message.id = keyAt;
            MessageObject messageObject = new MessageObject(p2Var.getCurrentAccount(), message, false, false);
            ArrayList<mg.q0> arrayList = new ArrayList<>();
            arrayList.add(q0Var);
            p2Var.getSendMessagesHelper().sendReaction(messageObject, arrayList, q0Var, false, false, tbVar.f, null);
            i10 = message.id;
        }
        tbVar.f();
        ic.e();
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.uj(this, q0Var, !z11, p2Var.getCurrentAccount(), i10), 300L);
    }

    @Override // org.telegram.ui.Components.ok0
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.Components.ok0
    public final /* synthetic */ boolean s() {
        return false;
    }

    @Override // org.telegram.ui.Components.ok0
    public final /* synthetic */ void o() {
    }

    @Override // org.telegram.ui.Components.ok0
    public final /* synthetic */ void n(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i10, boolean z4) {
    }
}
