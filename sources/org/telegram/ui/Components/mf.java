package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class mf extends gy {
    public final /* synthetic */ ChatActivityEnterView V2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mf(ChatActivityEnterView chatActivityEnterView, org.telegram.ui.ActionBar.f2 f2Var, boolean z9, Context context, TLRPC.ChatFull chatFull, ViewGroup viewGroup, boolean z10, org.telegram.ui.ActionBar.f6 f6Var, boolean z11, boolean z12) {
        super(f2Var, z9, true, true, context, true, chatFull, viewGroup, z10, f6Var, z11, z12);
        this.V2 = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.gy, android.view.View
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        ChatActivityEnterView chatActivityEnterView = this.V2;
        if (chatActivityEnterView.V0 == null || chatActivityEnterView.o3 != 0) {
            return;
        }
        chatActivityEnterView.Z2.w(f10);
    }
}
