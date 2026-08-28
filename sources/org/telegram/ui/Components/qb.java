package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class qb implements tj0 {
    public final /* synthetic */ rb a;

    public qb(rb rbVar) {
        this.a = rbVar;
    }

    @Override // org.telegram.ui.Components.tj0
    public final void d(View view, hg.r0 r0Var, boolean z10, boolean z11) {
        rb rbVar = this.a;
        org.telegram.ui.ActionBar.o2 o2Var = rbVar.f;
        if (rbVar.e == null) {
            return;
        }
        boolean z12 = (o2Var instanceof org.telegram.ui.qn) && ((org.telegram.ui.qn) o2Var).a() == UserConfig.getInstance(o2Var.getCurrentAccount()).getClientUserId();
        int i9 = 0;
        for (int i10 = 0; i10 < rbVar.e.size(); i10++) {
            int keyAt = rbVar.e.keyAt(i10);
            TLRPC.Message message = new TLRPC.Message();
            message.dialog_id = o2Var.getUserConfig().getClientUserId();
            message.id = keyAt;
            MessageObject messageObject = new MessageObject(o2Var.getCurrentAccount(), message, false, false);
            ArrayList<hg.r0> arrayList = new ArrayList<>();
            arrayList.add(r0Var);
            o2Var.getSendMessagesHelper().sendReaction(messageObject, arrayList, r0Var, false, false, rbVar.f, null);
            i9 = message.id;
        }
        rbVar.f();
        gc.e();
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.jj(this, r0Var, !z12, o2Var.getCurrentAccount(), i9), 300L);
    }

    @Override // org.telegram.ui.Components.tj0
    public final /* synthetic */ boolean n() {
        return true;
    }

    @Override // org.telegram.ui.Components.tj0
    public final /* synthetic */ boolean p() {
        return false;
    }

    @Override // org.telegram.ui.Components.tj0
    public final /* synthetic */ boolean u() {
        return false;
    }

    @Override // org.telegram.ui.Components.tj0
    public final /* synthetic */ void t() {
    }

    @Override // org.telegram.ui.Components.tj0
    public final /* synthetic */ void s(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i9, boolean z10) {
    }
}
