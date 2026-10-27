package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class of implements am0 {
    public final /* synthetic */ ChatActivityEnterView a;

    public of(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.am0
    public final void c(int i10, View view) {
        if (view instanceof hi.g0) {
            String command = ((hi.g0) view).getCommand();
            if (TextUtils.isEmpty(command)) {
                return;
            }
            ChatActivityEnterView chatActivityEnterView = this.a;
            if (chatActivityEnterView.c()) {
                g5.L(chatActivityEnterView.O2, chatActivityEnterView.Q2, new p1(9, this, command), chatActivityEnterView.W3);
                return;
            }
            org.telegram.ui.wn wnVar = chatActivityEnterView.P2;
            if (wnVar == null || !wnVar.n7(view)) {
                g5.Z(chatActivityEnterView.Q, 1, chatActivityEnterView.Q2, new li.s2(23, this, command));
            }
        }
    }
}
