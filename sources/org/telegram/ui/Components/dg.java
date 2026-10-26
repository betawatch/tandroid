package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class dg extends sz {
    public final /* synthetic */ ChatActivityEnterView T2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dg(ChatActivityEnterView chatActivityEnterView, org.telegram.ui.ActionBar.r2 r2Var, boolean z10, Context context, TLRPC.ChatFull chatFull, ViewGroup viewGroup, boolean z11, org.telegram.ui.ActionBar.u6 u6Var, boolean z12, boolean z13) {
        super(r2Var, z10, true, true, context, true, chatFull, viewGroup, z11, u6Var, z12, z13);
        this.T2 = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.sz, android.view.View
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        ChatActivityEnterView chatActivityEnterView = this.T2;
        if (chatActivityEnterView.V0 == null || chatActivityEnterView.o3 != 0) {
            return;
        }
        chatActivityEnterView.Z2.t(f7);
    }
}
