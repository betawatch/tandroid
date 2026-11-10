package org.telegram.ui.Components;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ qd(ChatActivityEnterView chatActivityEnterView, int i7) {
        this.a = i7;
        this.b = chatActivityEnterView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        ChatActivityEnterView chatActivityEnterView = this.b;
        switch (i7) {
            case 0:
                if (chatActivityEnterView.l0 != null && !org.telegram.messenger.b6.h(chatActivityEnterView.Q, chatActivityEnterView.Q2)) {
                    chatActivityEnterView.l0.setOpened(false);
                    break;
                }
                break;
            case 1:
                vf vfVar = chatActivityEnterView.Z2;
                if (vfVar != null) {
                    vfVar.e1();
                    break;
                }
                break;
            case 2:
                we weVar = chatActivityEnterView.E0;
                if (weVar != null) {
                    weVar.setText("");
                    break;
                }
                break;
            case 3:
                we weVar2 = chatActivityEnterView.E0;
                if (weVar2 != null) {
                    weVar2.setText("");
                }
                chatActivityEnterView.E(true);
                break;
            case 4:
                chatActivityEnterView.p0.callOnClick();
                break;
            default:
                int i10 = ChatActivityEnterView.s5;
                chatActivityEnterView.y();
                break;
        }
    }
}
