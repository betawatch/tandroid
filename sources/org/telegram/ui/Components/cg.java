package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class cg extends ry {
    public final /* synthetic */ ChatActivityEnterView W2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cg(ChatActivityEnterView chatActivityEnterView, org.telegram.ui.ActionBar.h2 h2Var, boolean z10, Context context, TLRPC.ChatFull chatFull, ViewGroup viewGroup, boolean z11, org.telegram.ui.ActionBar.i6 i6Var, boolean z12, boolean z13) {
        super(h2Var, z10, true, true, context, true, chatFull, viewGroup, z11, i6Var, z12, z13);
        this.W2 = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.ry, android.view.View
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        ChatActivityEnterView chatActivityEnterView = this.W2;
        if (chatActivityEnterView.W0 == null || chatActivityEnterView.c4 != 0) {
            return;
        }
        chatActivityEnterView.N3.x(f10);
    }
}
