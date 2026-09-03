package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class sb implements pk0 {
    public final /* synthetic */ tb a;

    public sb(tb tbVar) {
        this.a = tbVar;
    }

    @Override // org.telegram.ui.Components.pk0
    public final /* synthetic */ boolean g() {
        return true;
    }

    @Override // org.telegram.ui.Components.pk0
    public final /* synthetic */ boolean h() {
        return false;
    }

    @Override // org.telegram.ui.Components.pk0
    public final void o(View view, ng.q0 q0Var, boolean z4, boolean z10) {
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
            ArrayList<ng.q0> arrayList = new ArrayList<>();
            arrayList.add(q0Var);
            p2Var.getSendMessagesHelper().sendReaction(messageObject, arrayList, q0Var, false, false, tbVar.f, null);
            i10 = message.id;
        }
        tbVar.f();
        ic.e();
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.uj(this, q0Var, !z11, p2Var.getCurrentAccount(), i10), 300L);
    }

    @Override // org.telegram.ui.Components.pk0
    public final /* synthetic */ boolean t() {
        return false;
    }

    @Override // org.telegram.ui.Components.pk0
    public final /* synthetic */ void m() {
    }

    @Override // org.telegram.ui.Components.pk0
    public final /* synthetic */ void j(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i10, boolean z4) {
    }
}
