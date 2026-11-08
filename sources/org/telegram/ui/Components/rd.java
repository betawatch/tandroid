package org.telegram.ui.Components;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ rd(ChatActivityEnterView chatActivityEnterView, int i7) {
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
                wf wfVar = chatActivityEnterView.Z2;
                if (wfVar != null) {
                    wfVar.e1();
                    break;
                }
                break;
            case 2:
                xe xeVar = chatActivityEnterView.E0;
                if (xeVar != null) {
                    xeVar.setText("");
                    break;
                }
                break;
            case 3:
                xe xeVar2 = chatActivityEnterView.E0;
                if (xeVar2 != null) {
                    xeVar2.setText("");
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
