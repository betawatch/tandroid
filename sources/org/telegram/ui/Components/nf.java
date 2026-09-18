package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class nf implements al0 {
    public final /* synthetic */ ChatActivityEnterView a;

    public nf(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.al0
    public final void d(int i10, View view) {
        if (view instanceof ei.a0) {
            String command = ((ei.a0) view).getCommand();
            if (TextUtils.isEmpty(command)) {
                return;
            }
            ChatActivityEnterView chatActivityEnterView = this.a;
            if (chatActivityEnterView.c()) {
                c5.M(chatActivityEnterView.N2, chatActivityEnterView.P2, new mf(0, this, command), chatActivityEnterView.V3);
                return;
            }
            org.telegram.ui.bo boVar = chatActivityEnterView.O2;
            if (boVar == null || !boVar.e7(view)) {
                c5.a0(chatActivityEnterView.Q, 1, chatActivityEnterView.P2, new org.telegram.ui.pf(10, this, command));
            }
        }
    }
}
