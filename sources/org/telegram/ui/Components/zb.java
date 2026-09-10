package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class zb implements ok0 {
    public final /* synthetic */ ac a;

    public zb(ac acVar) {
        this.a = acVar;
    }

    @Override // org.telegram.ui.Components.ok0
    public final /* synthetic */ boolean j() {
        return true;
    }

    @Override // org.telegram.ui.Components.ok0
    public final /* synthetic */ boolean k() {
        return false;
    }

    @Override // org.telegram.ui.Components.ok0
    public final void l(View view, yg.p0 p0Var, boolean z10, boolean z11) {
        ac acVar = this.a;
        org.telegram.ui.ActionBar.p2 p2Var = acVar.f;
        if (acVar.e == null) {
            return;
        }
        boolean z12 = (p2Var instanceof org.telegram.ui.eo) && ((org.telegram.ui.eo) p2Var).a() == UserConfig.getInstance(p2Var.getCurrentAccount()).getClientUserId();
        int i10 = 0;
        for (int i11 = 0; i11 < acVar.e.size(); i11++) {
            int keyAt = acVar.e.keyAt(i11);
            TLRPC.Message message = new TLRPC.Message();
            message.dialog_id = p2Var.getUserConfig().getClientUserId();
            message.id = keyAt;
            MessageObject messageObject = new MessageObject(p2Var.getCurrentAccount(), message, false, false);
            ArrayList<yg.p0> arrayList = new ArrayList<>();
            arrayList.add(p0Var);
            p2Var.getSendMessagesHelper().sendReaction(messageObject, arrayList, p0Var, false, false, acVar.f, null);
            i10 = message.id;
        }
        acVar.f();
        pc.e();
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.ak(this, p0Var, !z12, p2Var.getCurrentAccount(), i10), 300L);
    }

    @Override // org.telegram.ui.Components.ok0
    public final /* synthetic */ boolean t() {
        return false;
    }

    @Override // org.telegram.ui.Components.ok0
    public final /* synthetic */ void s() {
    }

    @Override // org.telegram.ui.Components.ok0
    public final /* synthetic */ void r(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
