package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class dg extends kz {
    public final /* synthetic */ ChatActivityEnterView P2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dg(ChatActivityEnterView chatActivityEnterView, org.telegram.ui.ActionBar.n2 n2Var, boolean z10, Context context, TLRPC.ChatFull chatFull, ViewGroup viewGroup, boolean z11, org.telegram.ui.ActionBar.f6 f6Var, boolean z12, boolean z13) {
        super(n2Var, z10, true, true, context, true, chatFull, viewGroup, z11, f6Var, z12, z13);
        this.P2 = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.kz, android.view.View
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        ChatActivityEnterView chatActivityEnterView = this.P2;
        if (chatActivityEnterView.V0 == null || chatActivityEnterView.n3 != 0) {
            return;
        }
        chatActivityEnterView.Y2.y(f7);
    }
}
