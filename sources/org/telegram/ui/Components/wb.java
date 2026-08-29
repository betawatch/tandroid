package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class wb implements ek0 {
    public final /* synthetic */ xb a;

    public wb(xb xbVar) {
        this.a = xbVar;
    }

    @Override // org.telegram.ui.Components.ek0
    public final /* synthetic */ boolean O() {
        return false;
    }

    @Override // org.telegram.ui.Components.ek0
    public final void Q(View view, kg.q0 q0Var, boolean z10, boolean z11) {
        xb xbVar = this.a;
        org.telegram.ui.ActionBar.o2 o2Var = xbVar.f;
        if (xbVar.e == null) {
            return;
        }
        boolean z12 = (o2Var instanceof org.telegram.ui.tn) && ((org.telegram.ui.tn) o2Var).a() == UserConfig.getInstance(o2Var.getCurrentAccount()).getClientUserId();
        int i10 = 0;
        for (int i11 = 0; i11 < xbVar.e.size(); i11++) {
            int keyAt = xbVar.e.keyAt(i11);
            TLRPC.Message message = new TLRPC.Message();
            message.dialog_id = o2Var.getUserConfig().getClientUserId();
            message.id = keyAt;
            MessageObject messageObject = new MessageObject(o2Var.getCurrentAccount(), message, false, false);
            ArrayList<kg.q0> arrayList = new ArrayList<>();
            arrayList.add(q0Var);
            o2Var.getSendMessagesHelper().sendReaction(messageObject, arrayList, q0Var, false, false, xbVar.f, null);
            i10 = message.id;
        }
        xbVar.f();
        mc.e();
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.qj(this, q0Var, !z12, o2Var.getCurrentAccount(), i10), 300L);
    }

    @Override // org.telegram.ui.Components.ek0
    public final /* synthetic */ boolean j() {
        return true;
    }

    @Override // org.telegram.ui.Components.ek0
    public final /* synthetic */ boolean w() {
        return false;
    }

    @Override // org.telegram.ui.Components.ek0
    public final /* synthetic */ void H() {
    }

    @Override // org.telegram.ui.Components.ek0
    public final /* synthetic */ void G(Canvas canvas, RectF rectF, float f9, float f10, float f11, int i10, boolean z10) {
    }
}
