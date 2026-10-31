package org.telegram.ui.Components;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ld implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ ld(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.a = i10;
        this.b = chatActivityEnterView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        ChatActivityEnterView chatActivityEnterView = this.b;
        switch (i10) {
            case 0:
                if (chatActivityEnterView.l0 != null && !org.telegram.messenger.js.h(chatActivityEnterView.Q, chatActivityEnterView.Q2)) {
                    chatActivityEnterView.l0.setOpened(false);
                    break;
                }
                break;
            case 1:
                sf sfVar = chatActivityEnterView.Z2;
                if (sfVar != null) {
                    sfVar.a1();
                    break;
                }
                break;
            case 2:
                se seVar = chatActivityEnterView.E0;
                if (seVar != null) {
                    seVar.setText("");
                    break;
                }
                break;
            case 3:
                se seVar2 = chatActivityEnterView.E0;
                if (seVar2 != null) {
                    seVar2.setText("");
                }
                chatActivityEnterView.F(true);
                break;
            case 4:
                chatActivityEnterView.p0.callOnClick();
                break;
            default:
                int i11 = ChatActivityEnterView.s5;
                chatActivityEnterView.y();
                break;
        }
    }
}
