package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class xf extends fz {
    public final /* synthetic */ ChatActivityEnterView L2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xf(ChatActivityEnterView chatActivityEnterView, org.telegram.ui.ActionBar.o2 o2Var, boolean z10, Context context, TLRPC.ChatFull chatFull, ViewGroup viewGroup, boolean z11, org.telegram.ui.ActionBar.c6 c6Var, boolean z12, boolean z13) {
        super(o2Var, z10, true, true, context, true, chatFull, viewGroup, z11, c6Var, z12, z13);
        this.L2 = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.fz, android.view.View
    public final void setTranslationY(float f9) {
        super.setTranslationY(f9);
        ChatActivityEnterView chatActivityEnterView = this.L2;
        if (chatActivityEnterView.R0 == null || chatActivityEnterView.j3 != 0) {
            return;
        }
        chatActivityEnterView.U2.v(f9);
    }
}
