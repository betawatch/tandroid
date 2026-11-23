package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class gf implements qj0 {
    public final /* synthetic */ ChatActivityEnterView a;

    public gf(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.qj0
    public final void b(int i7, View view) {
        if (view instanceof ki.w) {
            String command = ((ki.w) view).getCommand();
            if (TextUtils.isEmpty(command)) {
                return;
            }
            ChatActivityEnterView chatActivityEnterView = this.a;
            if (chatActivityEnterView.c()) {
                b5.J(chatActivityEnterView.E3, chatActivityEnterView.G3, new g2(7, this, command), chatActivityEnterView.M4);
                return;
            }
            org.telegram.ui.bn bnVar = chatActivityEnterView.F3;
            if (bnVar == null || !bnVar.t7(view)) {
                b5.X(chatActivityEnterView.R, 1, chatActivityEnterView.G3, new ki.n2(28, this, command));
            }
        }
    }
}
