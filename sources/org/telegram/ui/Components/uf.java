package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class uf extends wy {
    public final /* synthetic */ ChatActivityEnterView L2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uf(ChatActivityEnterView chatActivityEnterView, org.telegram.ui.ActionBar.o2 o2Var, boolean z10, Context context, TLRPC.ChatFull chatFull, ViewGroup viewGroup, boolean z11, org.telegram.ui.ActionBar.b6 b6Var, boolean z12, boolean z13) {
        super(o2Var, z10, true, true, context, true, chatFull, viewGroup, z11, b6Var, z12, z13);
        this.L2 = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.wy, android.view.View
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        ChatActivityEnterView chatActivityEnterView = this.L2;
        if (chatActivityEnterView.R0 == null || chatActivityEnterView.j3 != 0) {
            return;
        }
        chatActivityEnterView.U2.o(f10);
    }
}
