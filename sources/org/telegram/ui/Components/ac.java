package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ac implements el0 {
    public final /* synthetic */ bc a;

    public ac(bc bcVar) {
        this.a = bcVar;
    }

    @Override // org.telegram.ui.Components.el0
    public final /* synthetic */ boolean f() {
        return true;
    }

    @Override // org.telegram.ui.Components.el0
    public final /* synthetic */ boolean i() {
        return false;
    }

    @Override // org.telegram.ui.Components.el0
    public final /* synthetic */ boolean o() {
        return false;
    }

    @Override // org.telegram.ui.Components.el0
    public final void p(View view, bh.x0 x0Var, boolean z10, boolean z11) {
        bc bcVar = this.a;
        org.telegram.ui.ActionBar.r2 r2Var = bcVar.f;
        if (bcVar.e == null) {
            return;
        }
        boolean z12 = (r2Var instanceof org.telegram.ui.un) && ((org.telegram.ui.un) r2Var).a() == UserConfig.getInstance(r2Var.getCurrentAccount()).getClientUserId();
        int i10 = 0;
        for (int i11 = 0; i11 < bcVar.e.size(); i11++) {
            int keyAt = bcVar.e.keyAt(i11);
            TLRPC.Message message = new TLRPC.Message();
            message.dialog_id = r2Var.getUserConfig().getClientUserId();
            message.id = keyAt;
            MessageObject messageObject = new MessageObject(r2Var.getCurrentAccount(), message, false, false);
            ArrayList<bh.x0> arrayList = new ArrayList<>();
            arrayList.add(x0Var);
            r2Var.getSendMessagesHelper().sendReaction(messageObject, arrayList, x0Var, false, false, bcVar.f, null);
            i10 = message.id;
        }
        bcVar.f();
        qc.e();
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.bj(this, x0Var, !z12, r2Var.getCurrentAccount(), i10), 300L);
    }

    @Override // org.telegram.ui.Components.el0
    public final /* synthetic */ void m() {
    }

    @Override // org.telegram.ui.Components.el0
    public final /* synthetic */ void l(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
