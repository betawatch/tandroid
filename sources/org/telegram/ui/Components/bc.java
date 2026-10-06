package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class bc implements rk0 {
    public final /* synthetic */ cc a;

    public bc(cc ccVar) {
        this.a = ccVar;
    }

    @Override // org.telegram.ui.Components.rk0
    public final /* synthetic */ boolean B() {
        return true;
    }

    @Override // org.telegram.ui.Components.rk0
    public final /* synthetic */ boolean E() {
        return false;
    }

    @Override // org.telegram.ui.Components.rk0
    public final /* synthetic */ boolean K() {
        return false;
    }

    @Override // org.telegram.ui.Components.rk0
    public final void i(View view, zg.m0 m0Var, boolean z10, boolean z11) {
        cc ccVar = this.a;
        org.telegram.ui.ActionBar.n2 n2Var = ccVar.f;
        if (ccVar.e == null) {
            return;
        }
        boolean z12 = (n2Var instanceof org.telegram.ui.yn) && ((org.telegram.ui.yn) n2Var).a() == UserConfig.getInstance(n2Var.getCurrentAccount()).getClientUserId();
        int i10 = 0;
        for (int i11 = 0; i11 < ccVar.e.size(); i11++) {
            int keyAt = ccVar.e.keyAt(i11);
            TLRPC.Message message = new TLRPC.Message();
            message.dialog_id = n2Var.getUserConfig().getClientUserId();
            message.id = keyAt;
            MessageObject messageObject = new MessageObject(n2Var.getCurrentAccount(), message, false, false);
            ArrayList<zg.m0> arrayList = new ArrayList<>();
            arrayList.add(m0Var);
            n2Var.getSendMessagesHelper().sendReaction(messageObject, arrayList, m0Var, false, false, ccVar.f, null);
            i10 = message.id;
        }
        ccVar.f();
        rc.e();
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.rj(this, m0Var, !z12, n2Var.getCurrentAccount(), i10), 300L);
    }

    @Override // org.telegram.ui.Components.rk0
    public final /* synthetic */ void I() {
    }

    @Override // org.telegram.ui.Components.rk0
    public final /* synthetic */ void H(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
