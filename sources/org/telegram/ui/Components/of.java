package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class of implements zl0 {
    public final /* synthetic */ ChatActivityEnterView a;

    public of(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.zl0
    public final void c(int i10, View view) {
        if (view instanceof hi.g0) {
            String command = ((hi.g0) view).getCommand();
            if (TextUtils.isEmpty(command)) {
                return;
            }
            ChatActivityEnterView chatActivityEnterView = this.a;
            if (chatActivityEnterView.c()) {
                g5.L(chatActivityEnterView.O2, chatActivityEnterView.Q2, new p1(9, this, command), chatActivityEnterView.W3);
                return;
            }
            org.telegram.ui.un unVar = chatActivityEnterView.P2;
            if (unVar == null || !unVar.l7(view)) {
                g5.Z(chatActivityEnterView.Q, 1, chatActivityEnterView.Q2, new li.s2(23, this, command));
            }
        }
    }
}
