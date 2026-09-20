package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class re implements c5, ll0 {
    public final /* synthetic */ ChatActivityEnterView a;

    public /* synthetic */ re(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.c5
    public void J(int i10, int i11, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        boolean T0 = chatActivityEnterView.T0(i10, z10, i11, true, 0L);
        mf mfVar = chatActivityEnterView.L0;
        if (mfVar != null) {
            mfVar.h(!T0);
            chatActivityEnterView.L0 = null;
        }
    }

    @Override // org.telegram.ui.Components.ll0
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
