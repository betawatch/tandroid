package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class re implements hk0 {
    public final /* synthetic */ ChatActivityEnterView a;

    public re(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.hk0
    public final void f(int i10, View view) {
        if (view instanceof xh.u) {
            String command = ((xh.u) view).getCommand();
            if (TextUtils.isEmpty(command)) {
                return;
            }
            ChatActivityEnterView chatActivityEnterView = this.a;
            if (chatActivityEnterView.c()) {
                s4.L(chatActivityEnterView.O2, chatActivityEnterView.Q2, new f2(4, this, command), chatActivityEnterView.W3);
                return;
            }
            org.telegram.ui.un unVar = chatActivityEnterView.P2;
            if (unVar == null || !unVar.q7(view)) {
                s4.Z(chatActivityEnterView.Q, 1, chatActivityEnterView.Q2, new ag.e0(29, this, command));
            }
        }
    }
}
