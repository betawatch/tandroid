package org.telegram.ui.Components;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class qe implements d5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ qe(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.a = i10;
        this.b = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.d5
    public final void J(int i10, int i11, boolean z10) {
        switch (this.a) {
            case 0:
                this.b.T0(i10, z10, i11, true, 0L);
                break;
            default:
                ChatActivityEnterView chatActivityEnterView = this.b;
                chatActivityEnterView.T0(i10, z10, i11, true, 0L);
                nf nfVar = chatActivityEnterView.L0;
                if (nfVar != null) {
                    nfVar.i();
                    chatActivityEnterView.L0 = null;
                    break;
                }
                break;
        }
    }
}
