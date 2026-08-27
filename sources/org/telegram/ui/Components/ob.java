package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ob implements vj0 {
    public final /* synthetic */ pb a;

    public ob(pb pbVar) {
        this.a = pbVar;
    }

    @Override // org.telegram.ui.Components.vj0
    public final /* synthetic */ boolean j() {
        return true;
    }

    @Override // org.telegram.ui.Components.vj0
    public final /* synthetic */ boolean m() {
        return false;
    }

    @Override // org.telegram.ui.Components.vj0
    public final void n(View view, ig.q0 q0Var, boolean z10, boolean z11) {
        pb pbVar = this.a;
        org.telegram.ui.ActionBar.n2 n2Var = pbVar.f;
        if (pbVar.e == null) {
            return;
        }
        boolean z12 = (n2Var instanceof org.telegram.ui.rn) && ((org.telegram.ui.rn) n2Var).a() == UserConfig.getInstance(n2Var.getCurrentAccount()).getClientUserId();
        int i10 = 0;
        for (int i11 = 0; i11 < pbVar.e.size(); i11++) {
            int keyAt = pbVar.e.keyAt(i11);
            TLRPC.Message message = new TLRPC.Message();
            message.dialog_id = n2Var.getUserConfig().getClientUserId();
            message.id = keyAt;
            MessageObject messageObject = new MessageObject(n2Var.getCurrentAccount(), message, false, false);
            ArrayList<ig.q0> arrayList = new ArrayList<>();
            arrayList.add(q0Var);
            n2Var.getSendMessagesHelper().sendReaction(messageObject, arrayList, q0Var, false, false, pbVar.f, null);
            i10 = message.id;
        }
        pbVar.f();
        ec.e();
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.nj(this, q0Var, !z12, n2Var.getCurrentAccount(), i10), 300L);
    }

    @Override // org.telegram.ui.Components.vj0
    public final /* synthetic */ boolean t() {
        return false;
    }

    @Override // org.telegram.ui.Components.vj0
    public final /* synthetic */ void s() {
    }

    @Override // org.telegram.ui.Components.vj0
    public final /* synthetic */ void r(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i10, boolean z10) {
    }
}
