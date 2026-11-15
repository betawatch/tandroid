package org.telegram.ui.Components;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class fd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ fd(ChatActivityEnterView chatActivityEnterView, boolean z10, int i7) {
        this.a = i7;
        this.b = chatActivityEnterView;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.bg0 bg0Var;
        int i7 = this.a;
        ChatActivityEnterView chatActivityEnterView = this.b;
        boolean z10 = this.c;
        switch (i7) {
            case 0:
                if (!z10) {
                    chatActivityEnterView.b2.setVisibility(8);
                    break;
                } else {
                    int i10 = ChatActivityEnterView.N6;
                    chatActivityEnterView.getClass();
                    break;
                }
            case 1:
                if (!z10) {
                    chatActivityEnterView.c2.setVisibility(8);
                    break;
                } else {
                    int i11 = ChatActivityEnterView.N6;
                    chatActivityEnterView.getClass();
                    break;
                }
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.b;
                uc ucVar = chatActivityEnterView2.X5;
                chatActivityEnterView2.N0 = System.currentTimeMillis();
                boolean k12 = chatActivityEnterView2.k1(false, 0, 0, 0L, true);
                if (!z10 && (bg0Var = chatActivityEnterView2.M0) != null) {
                    bg0Var.h(!k12);
                    chatActivityEnterView2.M0 = null;
                    break;
                } else {
                    chatActivityEnterView2.W5 = !k12;
                    org.telegram.messenger.g0.r(ucVar);
                    org.telegram.messenger.g0.i3(ucVar, 500L);
                    break;
                }
        }
    }
}
