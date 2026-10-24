package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class of implements am0 {
    public final /* synthetic */ ChatActivityEnterView a;

    public of(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.am0
    public final void d(int i10, View view) {
        if (view instanceof gi.z) {
            String command = ((gi.z) view).getCommand();
            if (TextUtils.isEmpty(command)) {
                return;
            }
            ChatActivityEnterView chatActivityEnterView = this.a;
            if (chatActivityEnterView.c()) {
                f5.M(chatActivityEnterView.O2, chatActivityEnterView.Q2, new p2(command, 6, this), chatActivityEnterView.W3);
                return;
            }
            org.telegram.ui.sn snVar = chatActivityEnterView.P2;
            if (snVar == null || !snVar.h7(view)) {
                f5.a0(chatActivityEnterView.Q, 1, chatActivityEnterView.Q2, new org.telegram.ui.ActionBar.m3(21, this, command));
            }
        }
    }
}
