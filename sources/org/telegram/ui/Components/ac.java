package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class ac implements pk0 {
    public final /* synthetic */ bc a;

    public ac(bc bcVar) {
        this.a = bcVar;
    }

    @Override // org.telegram.ui.Components.pk0
    public final void h(View view, zg.o0 o0Var, boolean z10, boolean z11) {
        bc bcVar = this.a;
        org.telegram.ui.ActionBar.n2 n2Var = bcVar.f;
        if (bcVar.e == null) {
            return;
        }
        boolean z12 = (n2Var instanceof org.telegram.ui.zn) && ((org.telegram.ui.zn) n2Var).a() == UserConfig.getInstance(n2Var.getCurrentAccount()).getClientUserId();
        int i10 = 0;
        for (int i11 = 0; i11 < bcVar.e.size(); i11++) {
            int keyAt = bcVar.e.keyAt(i11);
            TLRPC.Message message = new TLRPC.Message();
            message.dialog_id = n2Var.getUserConfig().getClientUserId();
            message.id = keyAt;
            MessageObject messageObject = new MessageObject(n2Var.getCurrentAccount(), message, false, false);
            ArrayList<zg.o0> arrayList = new ArrayList<>();
            arrayList.add(o0Var);
            n2Var.getSendMessagesHelper().sendReaction(messageObject, arrayList, o0Var, false, false, bcVar.f, null);
            i10 = message.id;
        }
        bcVar.f();
        qc.e();
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.sj(this, o0Var, !z12, n2Var.getCurrentAccount(), i10), 300L);
    }

    @Override // org.telegram.ui.Components.pk0
    public final /* synthetic */ boolean j() {
        return true;
    }

    @Override // org.telegram.ui.Components.pk0
    public final /* synthetic */ boolean k() {
        return false;
    }

    @Override // org.telegram.ui.Components.pk0
    public final /* synthetic */ boolean r() {
        return false;
    }

    @Override // org.telegram.ui.Components.pk0
    public final /* synthetic */ void p() {
    }

    @Override // org.telegram.ui.Components.pk0
    public final /* synthetic */ void n(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
