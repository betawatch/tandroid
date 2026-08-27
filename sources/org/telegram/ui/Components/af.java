package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class af implements pk0 {
    public final /* synthetic */ ChatActivityEnterView a;

    public af(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.pk0
    public final void a(int i10, View view) {
        if (view instanceof nh.y) {
            String command = ((nh.y) view).getCommand();
            if (TextUtils.isEmpty(command)) {
                return;
            }
            ChatActivityEnterView chatActivityEnterView = this.a;
            if (chatActivityEnterView.c()) {
                y4.M(chatActivityEnterView.J2, chatActivityEnterView.L2, new g1(10, this, command), chatActivityEnterView.R3);
                return;
            }
            org.telegram.ui.rn rnVar = chatActivityEnterView.K2;
            if (rnVar == null || !rnVar.e7(view)) {
                y4.a0(chatActivityEnterView.M, 1, chatActivityEnterView.L2, new org.telegram.ui.df(12, this, command));
            }
        }
    }
}
