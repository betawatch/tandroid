package org.telegram.ui.Components;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class xe implements k71, b5 {
    public final /* synthetic */ ChatActivityEnterView a;

    public /* synthetic */ xe(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.b5
    public void I(int i10, int i11, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        boolean T0 = chatActivityEnterView.T0(i10, z10, i11, true, 0L);
        ff ffVar = chatActivityEnterView.H0;
        if (ffVar != null) {
            ffVar.h(!T0);
            chatActivityEnterView.H0 = null;
        }
    }
}
