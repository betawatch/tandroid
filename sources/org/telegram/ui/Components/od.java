package org.telegram.ui.Components;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
        org.telegram.ui.fg0 fg0Var;
        int i7 = this.a;
        ChatActivityEnterView chatActivityEnterView = this.b;
        boolean z10 = this.c;
        switch (i7) {
            case 0:
                if (!z10) {
                    chatActivityEnterView.h2.setVisibility(8);
                    break;
                } else {
                    int i10 = ChatActivityEnterView.n7;
                    chatActivityEnterView.getClass();
                    break;
                }
            case 1:
                if (!z10) {
                    chatActivityEnterView.i2.setVisibility(8);
                    break;
                } else {
                    int i11 = ChatActivityEnterView.n7;
                    chatActivityEnterView.getClass();
                    break;
                }
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.b;
                td tdVar = chatActivityEnterView2.d6;
                chatActivityEnterView2.N0 = System.currentTimeMillis();
                boolean s12 = chatActivityEnterView2.s1(false, 0, 0, 0L, true);
                if (!z10 && (fg0Var = chatActivityEnterView2.M0) != null) {
                    fg0Var.h(!s12);
                    chatActivityEnterView2.M0 = null;
                    break;
                } else {
                    chatActivityEnterView2.c6 = !s12;
                    org.telegram.messenger.g0.r(tdVar);
                    org.telegram.messenger.g0.h3(tdVar, 500L);
                    break;
                }
        }
    }
}
