package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class pe implements b5, cl0 {
    public final /* synthetic */ ChatActivityEnterView a;

    public /* synthetic */ pe(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.b5
    public void J(int i10, int i11, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        boolean U0 = chatActivityEnterView.U0(i10, z10, i11, true, 0L);
        kf kfVar = chatActivityEnterView.L0;
        if (kfVar != null) {
            kfVar.h(!U0);
            chatActivityEnterView.L0 = null;
        }
    }

    @Override // org.telegram.ui.Components.cl0
    public boolean d(int i10, View view) {
        if (!(view instanceof ei.a0)) {
            return false;
        }
        String str = ((ei.a0) view).getCommand() + " ";
        ChatActivityEnterView chatActivityEnterView = this.a;
        chatActivityEnterView.setFieldText(str);
        chatActivityEnterView.m0.c();
        return true;
    }
}
