package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class of implements jl0 {
    public final /* synthetic */ ChatActivityEnterView a;

    public of(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.jl0
    public final void d(int i10, View view) {
        if (view instanceof ei.a0) {
            String command = ((ei.a0) view).getCommand();
            if (TextUtils.isEmpty(command)) {
                return;
            }
            ChatActivityEnterView chatActivityEnterView = this.a;
            if (chatActivityEnterView.c()) {
                d5.M(chatActivityEnterView.N2, chatActivityEnterView.P2, new a3(1, this, command), chatActivityEnterView.V3);
                return;
            }
            org.telegram.ui.zn znVar = chatActivityEnterView.O2;
            if (znVar == null || !znVar.e7(view)) {
                d5.a0(chatActivityEnterView.Q, 1, chatActivityEnterView.P2, new org.telegram.ui.of(10, this, command));
            }
        }
    }
}
