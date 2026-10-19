package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
            org.telegram.ui.qn qnVar = chatActivityEnterView.P2;
            if (qnVar == null || !qnVar.h7(view)) {
                f5.Z(chatActivityEnterView.Q, 1, chatActivityEnterView.Q2, new org.telegram.ui.ActionBar.j3(21, this, command));
            }
        }
    }
}
