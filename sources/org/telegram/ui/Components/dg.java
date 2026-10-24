package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class dg extends tz {
    public final /* synthetic */ ChatActivityEnterView V2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dg(ChatActivityEnterView chatActivityEnterView, org.telegram.ui.ActionBar.o2 o2Var, boolean z10, Context context, TLRPC.ChatFull chatFull, ViewGroup viewGroup, boolean z11, org.telegram.ui.ActionBar.g6 g6Var, boolean z12, boolean z13) {
        super(o2Var, z10, true, true, context, true, chatFull, viewGroup, z11, g6Var, z12, z13);
        this.V2 = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.tz, android.view.View
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        ChatActivityEnterView chatActivityEnterView = this.V2;
        if (chatActivityEnterView.V0 == null || chatActivityEnterView.o3 != 0) {
            return;
        }
        chatActivityEnterView.Z2.z(f7);
    }
}
