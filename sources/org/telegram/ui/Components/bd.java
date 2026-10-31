package org.telegram.ui.Components;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class bd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ bd(ChatActivityEnterView chatActivityEnterView, boolean z10, int i10) {
        this.a = i10;
        this.b = chatActivityEnterView;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pe peVar;
        int i10 = this.a;
        ChatActivityEnterView chatActivityEnterView = this.b;
        boolean z10 = this.c;
        switch (i10) {
            case 0:
                if (!z10) {
                    chatActivityEnterView.t1.setVisibility(8);
                    break;
                } else {
                    int i11 = ChatActivityEnterView.s5;
                    chatActivityEnterView.getClass();
                    break;
                }
            case 1:
                if (!z10) {
                    chatActivityEnterView.u1.setVisibility(8);
                    break;
                } else {
                    int i12 = ChatActivityEnterView.s5;
                    chatActivityEnterView.getClass();
                    break;
                }
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.b;
                tc tcVar = chatActivityEnterView2.F4;
                chatActivityEnterView2.M0 = System.currentTimeMillis();
                boolean R0 = chatActivityEnterView2.R0(false, 0, 0, 0L, true);
                if (!z10 && (peVar = chatActivityEnterView2.L0) != null) {
                    peVar.g(!R0);
                    chatActivityEnterView2.L0 = null;
                    break;
                } else {
                    chatActivityEnterView2.E4 = !R0;
                    org.telegram.messenger.i0.r(tcVar);
                    org.telegram.messenger.i0.h3(tcVar, 500L);
                    break;
                }
        }
    }
}
