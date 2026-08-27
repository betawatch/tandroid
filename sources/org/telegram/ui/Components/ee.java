package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ee implements x4, rk0 {
    public final /* synthetic */ ChatActivityEnterView a;

    public /* synthetic */ ee(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.x4
    public void I(int i10, int i11, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        boolean T0 = chatActivityEnterView.T0(i10, z10, i11, true, 0L);
        ye yeVar = chatActivityEnterView.H0;
        if (yeVar != null) {
            yeVar.h(!T0);
            chatActivityEnterView.H0 = null;
        }
    }

    @Override // org.telegram.ui.Components.rk0
    public boolean a(int i10, View view) {
        if (!(view instanceof nh.y)) {
            return false;
        }
        String str = ((nh.y) view).getCommand() + " ";
        ChatActivityEnterView chatActivityEnterView = this.a;
        chatActivityEnterView.setFieldText(str);
        chatActivityEnterView.i0.c();
        return true;
    }
}
