package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class re implements e5, cm0 {
    public final /* synthetic */ ChatActivityEnterView a;

    public /* synthetic */ re(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.e5
    public void G(int i10, int i11, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        boolean Q0 = chatActivityEnterView.Q0(i10, z10, i11, true, 0L);
        mf mfVar = chatActivityEnterView.L0;
        if (mfVar != null) {
            mfVar.g(!Q0);
            chatActivityEnterView.L0 = null;
        }
    }

    @Override // org.telegram.ui.Components.cm0
    public boolean c(int i10, View view) {
        if (!(view instanceof hi.g0)) {
            return false;
        }
        String str = ((hi.g0) view).getCommand() + " ";
        ChatActivityEnterView chatActivityEnterView = this.a;
        chatActivityEnterView.setFieldText(str);
        chatActivityEnterView.m0.c();
        return true;
    }
}
