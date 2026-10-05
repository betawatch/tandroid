package org.telegram.ui.Components;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ke implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ ke(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.a = i10;
        this.b = chatActivityEnterView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        ChatActivityEnterView chatActivityEnterView = this.b;
        switch (i10) {
            case 0:
                pg pgVar = chatActivityEnterView.Z2;
                if (pgVar != null) {
                    pgVar.q1();
                    break;
                }
                break;
            case 1:
                rf rfVar = chatActivityEnterView.E0;
                if (rfVar != null) {
                    rfVar.setText("");
                    break;
                }
                break;
            case 2:
                rf rfVar2 = chatActivityEnterView.E0;
                if (rfVar2 != null) {
                    rfVar2.setText("");
                }
                chatActivityEnterView.I(true);
                break;
            case 3:
                chatActivityEnterView.p0.callOnClick();
                break;
            case 4:
                chatActivityEnterView.p0.callOnClick();
                break;
            default:
                int i11 = ChatActivityEnterView.n5;
                chatActivityEnterView.B();
                break;
        }
    }
}
