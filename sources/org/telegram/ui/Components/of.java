package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class of implements ml0 {
    public final /* synthetic */ ChatActivityEnterView a;

    public of(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.ml0
    public final void d(int i10, View view) {
        if (view instanceof ei.a0) {
            String command = ((ei.a0) view).getCommand();
            if (TextUtils.isEmpty(command)) {
                return;
            }
            ChatActivityEnterView chatActivityEnterView = this.a;
            if (chatActivityEnterView.c()) {
                d5.M(chatActivityEnterView.O2, chatActivityEnterView.Q2, new a3(1, this, command), chatActivityEnterView.W3);
                return;
            }
            org.telegram.ui.zn znVar = chatActivityEnterView.P2;
            if (znVar == null || !znVar.e7(view)) {
                d5.a0(chatActivityEnterView.Q, 1, chatActivityEnterView.Q2, new org.telegram.ui.of(10, this, command));
            }
        }
    }
}
