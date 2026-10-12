package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
                g5.L(chatActivityEnterView.O2, chatActivityEnterView.Q2, new t2(5, this, command), chatActivityEnterView.W3);
                return;
            }
            org.telegram.ui.fo foVar = chatActivityEnterView.P2;
            if (foVar == null || !foVar.h7(view)) {
                g5.Z(chatActivityEnterView.Q, 1, chatActivityEnterView.Q2, new org.telegram.ui.vc(15, this, command));
            }
        }
    }
}
