package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class we implements bj0 {
    public final /* synthetic */ ChatActivityEnterView a;

    public we(ChatActivityEnterView chatActivityEnterView) {
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
                v4.J(chatActivityEnterView.O2, chatActivityEnterView.Q2, new f2(4, this, command), chatActivityEnterView.W3);
                return;
            }
            org.telegram.ui.an anVar = chatActivityEnterView.P2;
            if (anVar == null || !anVar.s7(view)) {
                v4.X(chatActivityEnterView.Q, 1, chatActivityEnterView.Q2, new org.telegram.messenger.voip.k(22, this, command));
            }
        }
    }
}
