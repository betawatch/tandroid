package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ie implements x4, ok0 {
    public final /* synthetic */ ChatActivityEnterView a;

    public /* synthetic */ ie(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.x4
    public void B(int i9, int i10, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        boolean T0 = chatActivityEnterView.T0(i9, z10, i10, true, 0L);
        cf cfVar = chatActivityEnterView.H0;
        if (cfVar != null) {
            cfVar.h(!T0);
            chatActivityEnterView.H0 = null;
        }
    }

    @Override // org.telegram.ui.Components.ok0
    public boolean a(int i9, View view) {
        if (!(view instanceof mh.a0)) {
            return false;
        }
        String str = ((mh.a0) view).getCommand() + " ";
        ChatActivityEnterView chatActivityEnterView = this.a;
        chatActivityEnterView.setFieldText(str);
        chatActivityEnterView.i0.c();
        return true;
    }
}
