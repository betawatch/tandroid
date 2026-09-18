package org.telegram.ui.Components;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ge implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ ge(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.a = i10;
        this.b = chatActivityEnterView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        ChatActivityEnterView chatActivityEnterView = this.b;
        switch (i10) {
            case 0:
                mg mgVar = chatActivityEnterView.Y2;
                if (mgVar != null) {
                    mgVar.q1();
                    break;
                }
                break;
            case 1:
                of ofVar = chatActivityEnterView.E0;
                if (ofVar != null) {
                    ofVar.setText("");
                    break;
                }
                break;
            case 2:
                of ofVar2 = chatActivityEnterView.E0;
                if (ofVar2 != null) {
                    ofVar2.setText("");
                }
                chatActivityEnterView.L(true);
                break;
            case 3:
                chatActivityEnterView.p0.callOnClick();
                break;
            case 4:
                chatActivityEnterView.p0.callOnClick();
                break;
            default:
                int i11 = ChatActivityEnterView.n5;
                chatActivityEnterView.E();
                break;
        }
    }
}
