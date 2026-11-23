package org.telegram.ui.Components;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class od implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ od(ChatActivityEnterView chatActivityEnterView, boolean z10, int i7) {
        this.a = i7;
        this.b = chatActivityEnterView;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.dg0 dg0Var;
        int i7 = this.a;
        ChatActivityEnterView chatActivityEnterView = this.b;
        boolean z10 = this.c;
        switch (i7) {
            case 0:
                if (!z10) {
                    chatActivityEnterView.j2.setVisibility(8);
                    break;
                } else {
                    int i10 = ChatActivityEnterView.s7;
                    chatActivityEnterView.getClass();
                    break;
                }
            case 1:
                if (!z10) {
                    chatActivityEnterView.k2.setVisibility(8);
                    break;
                } else {
                    int i11 = ChatActivityEnterView.s7;
                    chatActivityEnterView.getClass();
                    break;
                }
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.b;
                td tdVar = chatActivityEnterView2.f6;
                chatActivityEnterView2.N0 = System.currentTimeMillis();
                boolean x12 = chatActivityEnterView2.x1(false, 0, 0, 0L, true);
                if (!z10 && (dg0Var = chatActivityEnterView2.M0) != null) {
                    dg0Var.h(!x12);
                    chatActivityEnterView2.M0 = null;
                    break;
                } else {
                    chatActivityEnterView2.e6 = !x12;
                    org.telegram.messenger.g0.r(tdVar);
                    org.telegram.messenger.g0.h3(tdVar, 500L);
                    break;
                }
        }
    }
}
