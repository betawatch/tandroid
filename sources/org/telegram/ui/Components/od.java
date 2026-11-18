package org.telegram.ui.Components;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
        org.telegram.ui.eg0 eg0Var;
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
                if (!z10 && (eg0Var = chatActivityEnterView2.M0) != null) {
                    eg0Var.h(!s12);
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
