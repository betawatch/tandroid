package org.telegram.ui.Components;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ue implements y61, x4 {
    public final /* synthetic */ ChatActivityEnterView a;

    public /* synthetic */ ue(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.x4
    public void B(int i9, int i10, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        boolean T0 = chatActivityEnterView.T0(i9, z10, i10, true, 0L);
        cf cfVar = chatActivityEnterView.H0;
        if (cfVar != null) {
            cfVar.h(!T0);
            chatActivityEnterView.H0 = null;
        }
    }
}
