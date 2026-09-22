package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class yb implements ek0 {
    public final /* synthetic */ zb a;

    public yb(zb zbVar) {
        this.a = zbVar;
    }

    @Override // org.telegram.ui.Components.ek0
    public final void h(View view, zg.p0 p0Var, boolean z10, boolean z11) {
        zb zbVar = this.a;
        org.telegram.ui.ActionBar.n2 n2Var = zbVar.f;
        if (zbVar.e == null) {
            return;
        }
        boolean z12 = (n2Var instanceof org.telegram.ui.bo) && ((org.telegram.ui.bo) n2Var).a() == UserConfig.getInstance(n2Var.getCurrentAccount()).getClientUserId();
        int i10 = 0;
        for (int i11 = 0; i11 < zbVar.e.size(); i11++) {
            int keyAt = zbVar.e.keyAt(i11);
            TLRPC.Message message = new TLRPC.Message();
            message.dialog_id = n2Var.getUserConfig().getClientUserId();
            message.id = keyAt;
            MessageObject messageObject = new MessageObject(n2Var.getCurrentAccount(), message, false, false);
            ArrayList<zg.p0> arrayList = new ArrayList<>();
            arrayList.add(p0Var);
            n2Var.getSendMessagesHelper().sendReaction(messageObject, arrayList, p0Var, false, false, zbVar.f, null);
            i10 = message.id;
        }
        zbVar.f();
        oc.e();
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.sj(this, p0Var, !z12, n2Var.getCurrentAccount(), i10), 300L);
    }

    @Override // org.telegram.ui.Components.ek0
    public final /* synthetic */ boolean j() {
        return true;
    }

    @Override // org.telegram.ui.Components.ek0
    public final /* synthetic */ boolean k() {
        return false;
    }

    @Override // org.telegram.ui.Components.ek0
    public final /* synthetic */ boolean q() {
        return false;
    }

    @Override // org.telegram.ui.Components.ek0
    public final /* synthetic */ void o() {
    }

    @Override // org.telegram.ui.Components.ek0
    public final /* synthetic */ void n(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
