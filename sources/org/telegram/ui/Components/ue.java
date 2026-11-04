package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ue implements fj0 {
    public final /* synthetic */ ChatActivityEnterView a;

    public ue(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.fj0
    public final void f(int i3, View view) {
        if (view instanceof ii.y) {
            String command = ((ii.y) view).getCommand();
            if (TextUtils.isEmpty(command)) {
                return;
            }
            ChatActivityEnterView chatActivityEnterView = this.a;
            if (chatActivityEnterView.c()) {
                t4.L(chatActivityEnterView.P2, chatActivityEnterView.R2, new org.telegram.ui.jo(14, this, command), chatActivityEnterView.X3);
                return;
            }
            org.telegram.ui.wm wmVar = chatActivityEnterView.Q2;
            if (wmVar == null || !wmVar.s7(view)) {
                t4.Z(chatActivityEnterView.R, 1, chatActivityEnterView.R2, new mi.f(26, this, command));
            }
        }
    }
}
