package org.telegram.ui.Components;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ yd(ChatActivityEnterView chatActivityEnterView, int i9) {
        this.a = i9;
        this.b = chatActivityEnterView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i9 = this.a;
        ChatActivityEnterView chatActivityEnterView = this.b;
        switch (i9) {
            case 0:
                eg egVar = chatActivityEnterView.U2;
                if (egVar != null) {
                    egVar.h1();
                    break;
                }
                break;
            case 1:
                ff ffVar = chatActivityEnterView.A0;
                if (ffVar != null) {
                    ffVar.setText("");
                    break;
                }
                break;
            case 2:
                ff ffVar2 = chatActivityEnterView.A0;
                if (ffVar2 != null) {
                    ffVar2.setText("");
                }
                chatActivityEnterView.J(true);
                break;
            case 3:
                chatActivityEnterView.l0.callOnClick();
                break;
            case 4:
                chatActivityEnterView.l0.callOnClick();
                break;
            default:
                int i10 = ChatActivityEnterView.i5;
                chatActivityEnterView.C();
                break;
        }
    }
}
