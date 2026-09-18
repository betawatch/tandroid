package org.telegram.ui.Components;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class bf implements v71, b5 {
    public final /* synthetic */ ChatActivityEnterView a;

    public /* synthetic */ bf(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.b5
    public void J(int i10, int i11, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        boolean U0 = chatActivityEnterView.U0(i10, z10, i11, true, 0L);
        kf kfVar = chatActivityEnterView.L0;
        if (kfVar != null) {
            kfVar.h(!U0);
            chatActivityEnterView.L0 = null;
        }
    }
}
