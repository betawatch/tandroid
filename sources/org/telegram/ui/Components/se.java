package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class se implements d5, ml0 {
    public final /* synthetic */ ChatActivityEnterView a;

    public /* synthetic */ se(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.d5
    public void J(int i10, int i11, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        boolean T0 = chatActivityEnterView.T0(i10, z10, i11, true, 0L);
        nf nfVar = chatActivityEnterView.L0;
        if (nfVar != null) {
            nfVar.h(!T0);
            chatActivityEnterView.L0 = null;
        }
    }

    @Override // org.telegram.ui.Components.ml0
    public boolean d(int i10, View view) {
        if (!(view instanceof ei.a0)) {
            return false;
        }
        String str = ((ei.a0) view).getCommand() + " ";
        ChatActivityEnterView chatActivityEnterView = this.a;
        chatActivityEnterView.setFieldText(str);
        chatActivityEnterView.m0.c();
        return true;
    }
}
