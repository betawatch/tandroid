package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class of implements al0 {
    public final /* synthetic */ ChatActivityEnterView a;

    public of(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.al0
    public final void d(int i10, View view) {
        if (view instanceof ei.a0) {
            String command = ((ei.a0) view).getCommand();
            if (TextUtils.isEmpty(command)) {
                return;
            }
            ChatActivityEnterView chatActivityEnterView = this.a;
            if (chatActivityEnterView.c()) {
                e5.M(chatActivityEnterView.N2, chatActivityEnterView.P2, new b3(1, this, command), chatActivityEnterView.V3);
                return;
            }
            org.telegram.ui.xn xnVar = chatActivityEnterView.O2;
            if (xnVar == null || !xnVar.e7(view)) {
                e5.a0(chatActivityEnterView.Q, 1, chatActivityEnterView.P2, new org.telegram.ui.oc(15, this, command));
            }
        }
    }
}
