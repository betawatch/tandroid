package org.telegram.ui.Components;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ pd(ChatActivityEnterView chatActivityEnterView, int i3) {
        this.a = i3;
        this.b = chatActivityEnterView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        ChatActivityEnterView chatActivityEnterView = this.b;
        switch (i3) {
            case 0:
                if (chatActivityEnterView.m0 != null && !org.telegram.messenger.b6.h(chatActivityEnterView.R, chatActivityEnterView.R2)) {
                    chatActivityEnterView.m0.setOpened(false);
                    break;
                }
                break;
            case 1:
                uf ufVar = chatActivityEnterView.a3;
                if (ufVar != null) {
                    ufVar.b1();
                    break;
                }
                break;
            case 2:
                ve veVar = chatActivityEnterView.F0;
                if (veVar != null) {
                    veVar.setText("");
                    break;
                }
                break;
            case 3:
                ve veVar2 = chatActivityEnterView.F0;
                if (veVar2 != null) {
                    veVar2.setText("");
                }
                chatActivityEnterView.E(true);
                break;
            case 4:
                chatActivityEnterView.q0.callOnClick();
                break;
            default:
                int i10 = ChatActivityEnterView.t5;
                chatActivityEnterView.y();
                break;
        }
    }
}
