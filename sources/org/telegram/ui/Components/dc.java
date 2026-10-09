package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class dc implements jl0 {
    public final /* synthetic */ ec a;

    public dc(ec ecVar) {
        this.a = ecVar;
    }

    @Override // org.telegram.ui.Components.jl0
    public final void m(View view, zg.n0 n0Var, boolean z10, boolean z11) {
        ec ecVar = this.a;
        org.telegram.ui.ActionBar.n2 n2Var = ecVar.f;
        if (ecVar.e == null) {
            return;
        }
        boolean z12 = (n2Var instanceof org.telegram.ui.zn) && ((org.telegram.ui.zn) n2Var).a() == UserConfig.getInstance(n2Var.getCurrentAccount()).getClientUserId();
        int i10 = 0;
        for (int i11 = 0; i11 < ecVar.e.size(); i11++) {
            int keyAt = ecVar.e.keyAt(i11);
            TLRPC.Message message = new TLRPC.Message();
            message.dialog_id = n2Var.getUserConfig().getClientUserId();
            message.id = keyAt;
            MessageObject messageObject = new MessageObject(n2Var.getCurrentAccount(), message, false, false);
            ArrayList<zg.n0> arrayList = new ArrayList<>();
            arrayList.add(n0Var);
            n2Var.getSendMessagesHelper().sendReaction(messageObject, arrayList, n0Var, false, false, ecVar.f, null);
            i10 = message.id;
        }
        ecVar.f();
        tc.e();
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.bj(this, n0Var, !z12, n2Var.getCurrentAccount(), i10), 300L);
    }

    @Override // org.telegram.ui.Components.jl0
    public final /* synthetic */ boolean o() {
        return true;
    }

    @Override // org.telegram.ui.Components.jl0
    public final /* synthetic */ boolean q() {
        return false;
    }

    @Override // org.telegram.ui.Components.jl0
    public final /* synthetic */ boolean v() {
        return false;
    }

    @Override // org.telegram.ui.Components.jl0
    public final /* synthetic */ void s() {
    }

    @Override // org.telegram.ui.Components.jl0
    public final /* synthetic */ void r(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
