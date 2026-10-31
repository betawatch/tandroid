package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class re implements gk0 {
    public final /* synthetic */ ChatActivityEnterView a;

    public re(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.gk0
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
            if (unVar == null || !unVar.m7(view)) {
                s4.Z(chatActivityEnterView.Q, 1, chatActivityEnterView.Q2, new ag.e0(29, this, command));
            }
        }
    }
}
