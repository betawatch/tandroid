package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class qf implements ml0 {
    public final /* synthetic */ ChatActivityEnterView a;

    public qf(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.ml0
    public final void d(int i10, View view) {
        if (view instanceof ei.b0) {
            String command = ((ei.b0) view).getCommand();
            if (TextUtils.isEmpty(command)) {
                return;
            }
            ChatActivityEnterView chatActivityEnterView = this.a;
            if (chatActivityEnterView.c()) {
                e5.M(chatActivityEnterView.O2, chatActivityEnterView.Q2, new w2(this, command, false, 3), chatActivityEnterView.W3);
                return;
            }
            org.telegram.ui.yn ynVar = chatActivityEnterView.P2;
            if (ynVar == null || !ynVar.e7(view)) {
                e5.a0(chatActivityEnterView.Q, 1, chatActivityEnterView.Q2, new org.telegram.ui.qc(15, this, command));
            }
        }
    }
}
