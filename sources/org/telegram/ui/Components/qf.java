package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class qf implements am0 {
    public final /* synthetic */ ChatActivityEnterView a;

    public qf(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.am0
    public final void a(int i10, View view) {
        if (view instanceof fi.z) {
            String command = ((fi.z) view).getCommand();
            if (TextUtils.isEmpty(command)) {
                return;
            }
            ChatActivityEnterView chatActivityEnterView = this.a;
            if (chatActivityEnterView.c()) {
                g5.L(chatActivityEnterView.O2, chatActivityEnterView.Q2, new u2(4, this, command), chatActivityEnterView.W3);
                return;
            }
            org.telegram.ui.fo foVar = chatActivityEnterView.P2;
            if (foVar == null || !foVar.h7(view)) {
                g5.Z(chatActivityEnterView.Q, 1, chatActivityEnterView.Q2, new org.telegram.ui.uc(15, this, command));
            }
        }
    }
}
