package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class vd implements q4, ik0 {
    public final /* synthetic */ ChatActivityEnterView a;

    public /* synthetic */ vd(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.q4
    public void K(int i10, int i11, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        boolean R0 = chatActivityEnterView.R0(z10, i10, i11, 0L, true);
        pe peVar = chatActivityEnterView.L0;
        if (peVar != null) {
            peVar.g(!R0);
            chatActivityEnterView.L0 = null;
        }
    }

    @Override // org.telegram.ui.Components.ik0
    public boolean f(int i10, View view) {
        if (!(view instanceof xh.u)) {
            return false;
        }
        String str = ((xh.u) view).getCommand() + " ";
        ChatActivityEnterView chatActivityEnterView = this.a;
        chatActivityEnterView.setFieldText(str);
        chatActivityEnterView.m0.c();
        return true;
    }
}
