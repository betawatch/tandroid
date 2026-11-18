package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class ff implements oj0 {
    public final /* synthetic */ ChatActivityEnterView a;

    public ff(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.oj0
    public final void c(int i7, View view) {
        if (view instanceof ki.x) {
            String command = ((ki.x) view).getCommand();
            if (TextUtils.isEmpty(command)) {
                return;
            }
            ChatActivityEnterView chatActivityEnterView = this.a;
            if (chatActivityEnterView.c()) {
                b5.J(chatActivityEnterView.C3, chatActivityEnterView.E3, new g2(7, this, command), chatActivityEnterView.K4);
                return;
            }
            org.telegram.ui.bn bnVar = chatActivityEnterView.D3;
            if (bnVar == null || !bnVar.t7(view)) {
                b5.X(chatActivityEnterView.R, 1, chatActivityEnterView.E3, new li.d(27, this, command));
            }
        }
    }
}
