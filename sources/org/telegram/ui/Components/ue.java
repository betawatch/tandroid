package org.telegram.ui.Components;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ue implements w71, y4 {
    public final /* synthetic */ ChatActivityEnterView a;

    public /* synthetic */ ue(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.y4
    public void J(int i10, int i11, boolean z4) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        boolean T0 = chatActivityEnterView.T0(i10, z4, i11, true, 0L);
        cf cfVar = chatActivityEnterView.I0;
        if (cfVar != null) {
            cfVar.h(!T0);
            chatActivityEnterView.I0 = null;
        }
    }
}
