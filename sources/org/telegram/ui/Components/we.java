package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class we implements gj0 {
    public final /* synthetic */ ChatActivityEnterView a;

    public we(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.gj0
    public final void b(int i7, View view) {
        if (view instanceof ki.y) {
            String command = ((ki.y) view).getCommand();
            if (TextUtils.isEmpty(command)) {
                return;
            }
            ChatActivityEnterView chatActivityEnterView = this.a;
            if (chatActivityEnterView.c()) {
                t4.J(chatActivityEnterView.w3, chatActivityEnterView.y3, new f1(8, this, command), chatActivityEnterView.E4);
                return;
            }
            org.telegram.ui.an anVar = chatActivityEnterView.x3;
            if (anVar == null || !anVar.t7(view)) {
                t4.X(chatActivityEnterView.R, 1, chatActivityEnterView.y3, new li.v(27, this, command));
            }
        }
    }
}
