package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class pf implements kl0 {
    public final /* synthetic */ ChatActivityEnterView a;

    public pf(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.kl0
    public final void d(int i10, View view) {
        if (view instanceof ei.a0) {
            String command = ((ei.a0) view).getCommand();
            if (TextUtils.isEmpty(command)) {
                return;
            }
            ChatActivityEnterView chatActivityEnterView = this.a;
            if (chatActivityEnterView.c()) {
                e5.M(chatActivityEnterView.O2, chatActivityEnterView.Q2, new w2(2, this, command), chatActivityEnterView.W3);
                return;
            }
            org.telegram.ui.wn wnVar = chatActivityEnterView.P2;
            if (wnVar == null || !wnVar.e7(view)) {
                e5.a0(chatActivityEnterView.Q, 1, chatActivityEnterView.Q2, new org.telegram.ui.oc(15, this, command));
            }
        }
    }
}
