package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class ff implements qj0 {
    public final /* synthetic */ ChatActivityEnterView a;

    public ff(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.qj0
    public final void c(int i7, View view) {
        if (view instanceof ki.w) {
            String command = ((ki.w) view).getCommand();
            if (TextUtils.isEmpty(command)) {
                return;
            }
            ChatActivityEnterView chatActivityEnterView = this.a;
            if (chatActivityEnterView.c()) {
                c5.J(chatActivityEnterView.E3, chatActivityEnterView.G3, new h2(7, this, command), chatActivityEnterView.M4);
                return;
            }
            org.telegram.ui.bn bnVar = chatActivityEnterView.F3;
            if (bnVar == null || !bnVar.t7(view)) {
                c5.X(chatActivityEnterView.R, 1, chatActivityEnterView.G3, new li.d(27, this, command));
            }
        }
    }
}
