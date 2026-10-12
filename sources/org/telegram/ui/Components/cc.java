package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class cc implements fl0 {
    public final /* synthetic */ dc a;

    public cc(dc dcVar) {
        this.a = dcVar;
    }

    @Override // org.telegram.ui.Components.fl0
    public final /* synthetic */ boolean D() {
        return false;
    }

    @Override // org.telegram.ui.Components.fl0
    public final /* synthetic */ boolean i() {
        return true;
    }

    @Override // org.telegram.ui.Components.fl0
    public final /* synthetic */ boolean n() {
        return false;
    }

    @Override // org.telegram.ui.Components.fl0
    public final void r(View view, ah.i1 i1Var, boolean z10, boolean z11) {
        dc dcVar = this.a;
        org.telegram.ui.ActionBar.m2 m2Var = dcVar.f;
        if (dcVar.e == null) {
            return;
        }
        boolean z12 = (m2Var instanceof org.telegram.ui.fo) && ((org.telegram.ui.fo) m2Var).a() == UserConfig.getInstance(m2Var.getCurrentAccount()).getClientUserId();
        int i10 = 0;
        for (int i11 = 0; i11 < dcVar.e.size(); i11++) {
            int keyAt = dcVar.e.keyAt(i11);
            TLRPC.Message message = new TLRPC.Message();
            message.dialog_id = m2Var.getUserConfig().getClientUserId();
            message.id = keyAt;
            MessageObject messageObject = new MessageObject(m2Var.getCurrentAccount(), message, false, false);
            ArrayList<ah.i1> arrayList = new ArrayList<>();
            arrayList.add(i1Var);
            m2Var.getSendMessagesHelper().sendReaction(messageObject, arrayList, i1Var, false, false, dcVar.f, null);
            i10 = message.id;
        }
        dcVar.f();
        sc.e();
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.ej(this, i1Var, !z12, m2Var.getCurrentAccount(), i10), 300L);
    }

    @Override // org.telegram.ui.Components.fl0
    public final /* synthetic */ void y() {
    }

    @Override // org.telegram.ui.Components.fl0
    public final /* synthetic */ void w(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
