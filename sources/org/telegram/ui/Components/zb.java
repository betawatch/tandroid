package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class zb implements rk0 {
    public final /* synthetic */ ac a;

    public zb(ac acVar) {
        this.a = acVar;
    }

    @Override // org.telegram.ui.Components.rk0
    public final void h(View view, zg.p0 p0Var, boolean z10, boolean z11) {
        ac acVar = this.a;
        org.telegram.ui.ActionBar.n2 n2Var = acVar.f;
        if (acVar.e == null) {
            return;
        }
        boolean z12 = (n2Var instanceof org.telegram.ui.zn) && ((org.telegram.ui.zn) n2Var).a() == UserConfig.getInstance(n2Var.getCurrentAccount()).getClientUserId();
        int i10 = 0;
        for (int i11 = 0; i11 < acVar.e.size(); i11++) {
            int keyAt = acVar.e.keyAt(i11);
            TLRPC.Message message = new TLRPC.Message();
            message.dialog_id = n2Var.getUserConfig().getClientUserId();
            message.id = keyAt;
            MessageObject messageObject = new MessageObject(n2Var.getCurrentAccount(), message, false, false);
            ArrayList<zg.p0> arrayList = new ArrayList<>();
            arrayList.add(p0Var);
            n2Var.getSendMessagesHelper().sendReaction(messageObject, arrayList, p0Var, false, false, acVar.f, null);
            i10 = message.id;
        }
        acVar.f();
        pc.e();
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.rj(this, p0Var, !z12, n2Var.getCurrentAccount(), i10), 300L);
    }

    @Override // org.telegram.ui.Components.rk0
    public final /* synthetic */ boolean j() {
        return true;
    }

    @Override // org.telegram.ui.Components.rk0
    public final /* synthetic */ boolean k() {
        return false;
    }

    @Override // org.telegram.ui.Components.rk0
    public final /* synthetic */ boolean q() {
        return false;
    }

    @Override // org.telegram.ui.Components.rk0
    public final /* synthetic */ void o() {
    }

    @Override // org.telegram.ui.Components.rk0
    public final /* synthetic */ void n(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
