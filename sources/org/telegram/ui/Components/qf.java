package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class qf implements jl0 {
    public final /* synthetic */ ChatActivityEnterView a;

    public qf(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.jl0
    public final void d(int i10, View view) {
        if (view instanceof di.d0) {
            String command = ((di.d0) view).getCommand();
            if (TextUtils.isEmpty(command)) {
                return;
            }
            ChatActivityEnterView chatActivityEnterView = this.a;
            if (chatActivityEnterView.c()) {
                d5.M(chatActivityEnterView.N2, chatActivityEnterView.P2, new org.telegram.ui.oe(26, this, command), chatActivityEnterView.V3);
                return;
            }
            org.telegram.ui.eo eoVar = chatActivityEnterView.O2;
            if (eoVar == null || !eoVar.e7(view)) {
                d5.a0(chatActivityEnterView.Q, 1, chatActivityEnterView.P2, new org.telegram.ui.pf(10, this, command));
            }
        }
    }
}
