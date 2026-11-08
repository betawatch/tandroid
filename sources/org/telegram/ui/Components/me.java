package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class me implements g61, dj0 {
    public final /* synthetic */ ChatActivityEnterView a;

    public /* synthetic */ me(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.dj0
    public boolean c(int i7, View view) {
        if (!(view instanceof hi.w)) {
            return false;
        }
        String str = ((hi.w) view).getCommand() + " ";
        ChatActivityEnterView chatActivityEnterView = this.a;
        chatActivityEnterView.setFieldText(str);
        chatActivityEnterView.m0.c();
        return true;
    }
}
