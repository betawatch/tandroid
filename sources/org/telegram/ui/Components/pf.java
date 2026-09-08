package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class pf implements zk0 {
    public final /* synthetic */ ChatActivityEnterView a;

    public pf(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.zk0
    public final void a(int i10, View view) {
        if (view instanceof fi.a0) {
            String command = ((fi.a0) view).getCommand();
            if (TextUtils.isEmpty(command)) {
                return;
            }
            ChatActivityEnterView chatActivityEnterView = this.a;
            if (chatActivityEnterView.c()) {
                e5.M(chatActivityEnterView.N2, chatActivityEnterView.P2, new b3(1, this, command), chatActivityEnterView.V3);
                return;
            }
            org.telegram.ui.co coVar = chatActivityEnterView.O2;
            if (coVar == null || !coVar.e7(view)) {
                e5.a0(chatActivityEnterView.Q, 1, chatActivityEnterView.P2, new org.telegram.ui.nf(10, this, command));
            }
        }
    }
}
