package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class le implements g61, dj0 {
    public final /* synthetic */ ChatActivityEnterView a;

    public /* synthetic */ le(ChatActivityEnterView chatActivityEnterView) {
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
