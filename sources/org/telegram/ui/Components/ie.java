package org.telegram.ui.Components;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class ie implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ ie(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.a = i10;
        this.b = chatActivityEnterView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        ChatActivityEnterView chatActivityEnterView = this.b;
        switch (i10) {
            case 0:
                ng ngVar = chatActivityEnterView.Y2;
                if (ngVar != null) {
                    ngVar.q1();
                    break;
                }
                break;
            case 1:
                pf pfVar = chatActivityEnterView.E0;
                if (pfVar != null) {
                    pfVar.setText("");
                    break;
                }
                break;
            case 2:
                pf pfVar2 = chatActivityEnterView.E0;
                if (pfVar2 != null) {
                    pfVar2.setText("");
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
