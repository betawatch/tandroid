package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class ve implements bj0 {
    public final /* synthetic */ ChatActivityEnterView a;

    public ve(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.bj0
    public final void c(int i7, View view) {
        if (view instanceof hi.w) {
            String command = ((hi.w) view).getCommand();
            if (TextUtils.isEmpty(command)) {
                return;
            }
            ChatActivityEnterView chatActivityEnterView = this.a;
            if (chatActivityEnterView.c()) {
                u4.J(chatActivityEnterView.O2, chatActivityEnterView.Q2, new e2(4, this, command), chatActivityEnterView.W3);
                return;
            }
            org.telegram.ui.cn cnVar = chatActivityEnterView.P2;
            if (cnVar == null || !cnVar.t7(view)) {
                u4.X(chatActivityEnterView.Q, 1, chatActivityEnterView.Q2, new org.telegram.messenger.voip.k(22, this, command));
            }
        }
    }
}
