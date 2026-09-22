package org.telegram.ui.Components;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class bf implements u71, b5 {
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
