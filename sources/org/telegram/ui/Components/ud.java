package org.telegram.ui.Components;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ud implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ ud(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.a = i10;
        this.b = chatActivityEnterView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        ChatActivityEnterView chatActivityEnterView = this.b;
        switch (i10) {
            case 0:
                ag agVar = chatActivityEnterView.U2;
                if (agVar != null) {
                    agVar.i1();
                    break;
                }
                break;
            case 1:
                bf bfVar = chatActivityEnterView.A0;
                if (bfVar != null) {
                    bfVar.setText("");
                    break;
                }
                break;
            case 2:
                bf bfVar2 = chatActivityEnterView.A0;
                if (bfVar2 != null) {
                    bfVar2.setText("");
                }
                chatActivityEnterView.K(true);
                break;
            case 3:
                chatActivityEnterView.l0.callOnClick();
                break;
            case 4:
                chatActivityEnterView.l0.callOnClick();
                break;
            default:
                int i11 = ChatActivityEnterView.i5;
                chatActivityEnterView.D();
                break;
        }
    }
}
