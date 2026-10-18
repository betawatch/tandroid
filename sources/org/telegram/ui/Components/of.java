package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class of implements wl0 {
    public final /* synthetic */ ChatActivityEnterView a;

    public of(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.wl0
    public final void a(int i10, View view) {
        if (view instanceof gi.z) {
            String command = ((gi.z) view).getCommand();
            if (TextUtils.isEmpty(command)) {
                return;
            }
            ChatActivityEnterView chatActivityEnterView = this.a;
            if (chatActivityEnterView.c()) {
                f5.L(chatActivityEnterView.O2, chatActivityEnterView.Q2, new q2(command, 6, this), chatActivityEnterView.W3);
                return;
            }
            org.telegram.ui.sn snVar = chatActivityEnterView.P2;
            if (snVar == null || !snVar.h7(view)) {
                f5.Z(chatActivityEnterView.Q, 1, chatActivityEnterView.Q2, new org.telegram.ui.ActionBar.j3(21, this, command));
            }
        }
    }
}
