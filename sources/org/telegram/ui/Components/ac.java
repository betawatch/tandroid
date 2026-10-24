package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class ac implements fl0 {
    public final /* synthetic */ bc a;

    public ac(bc bcVar) {
        this.a = bcVar;
    }

    @Override // org.telegram.ui.Components.fl0
    public final /* synthetic */ boolean i() {
        return true;
    }

    @Override // org.telegram.ui.Components.fl0
    public final /* synthetic */ boolean l() {
        return false;
    }

    @Override // org.telegram.ui.Components.fl0
    public final void m(View view, ah.i1 i1Var, boolean z10, boolean z11) {
        bc bcVar = this.a;
        org.telegram.ui.ActionBar.o2 o2Var = bcVar.f;
        if (bcVar.e == null) {
            return;
        }
        boolean z12 = (o2Var instanceof org.telegram.ui.sn) && ((org.telegram.ui.sn) o2Var).a() == UserConfig.getInstance(o2Var.getCurrentAccount()).getClientUserId();
        int i10 = 0;
        for (int i11 = 0; i11 < bcVar.e.size(); i11++) {
            int keyAt = bcVar.e.keyAt(i11);
            TLRPC.Message message = new TLRPC.Message();
            message.dialog_id = o2Var.getUserConfig().getClientUserId();
            message.id = keyAt;
            MessageObject messageObject = new MessageObject(o2Var.getCurrentAccount(), message, false, false);
            ArrayList<ah.i1> arrayList = new ArrayList<>();
            arrayList.add(i1Var);
            o2Var.getSendMessagesHelper().sendReaction(messageObject, arrayList, i1Var, false, false, bcVar.f, null);
            i10 = message.id;
        }
        bcVar.f();
        qc.e();
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.yi(this, i1Var, !z12, o2Var.getCurrentAccount(), i10), 300L);
    }

    @Override // org.telegram.ui.Components.fl0
    public final /* synthetic */ boolean w() {
        return false;
    }

    @Override // org.telegram.ui.Components.fl0
    public final /* synthetic */ void u() {
    }

    @Override // org.telegram.ui.Components.fl0
    public final /* synthetic */ void s(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
