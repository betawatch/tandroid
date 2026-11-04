package org.telegram.ui.Components;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ gd(ChatActivityEnterView chatActivityEnterView, boolean z10, int i3) {
        this.a = i3;
        this.b = chatActivityEnterView;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        se seVar;
        int i3 = this.a;
        ChatActivityEnterView chatActivityEnterView = this.b;
        boolean z10 = this.c;
        switch (i3) {
            case 0:
                if (!z10) {
                    chatActivityEnterView.u1.setVisibility(8);
                    break;
                } else {
                    int i10 = ChatActivityEnterView.t5;
                    chatActivityEnterView.getClass();
                    break;
                }
            case 1:
                if (!z10) {
                    chatActivityEnterView.v1.setVisibility(8);
                    break;
                } else {
                    int i11 = ChatActivityEnterView.t5;
                    chatActivityEnterView.getClass();
                    break;
                }
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.b;
                yc ycVar = chatActivityEnterView2.G4;
                chatActivityEnterView2.N0 = System.currentTimeMillis();
                boolean S0 = chatActivityEnterView2.S0(false, 0, 0, 0L, true);
                if (!z10 && (seVar = chatActivityEnterView2.M0) != null) {
                    seVar.g(!S0);
                    chatActivityEnterView2.M0 = null;
                    break;
                } else {
                    chatActivityEnterView2.F4 = !S0;
                    org.telegram.messenger.g0.r(ycVar);
                    org.telegram.messenger.g0.i3(ycVar, 500L);
                    break;
                }
        }
    }
}
