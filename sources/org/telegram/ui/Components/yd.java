package org.telegram.ui.Components;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ yd(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.a = i10;
        this.b = chatActivityEnterView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        ChatActivityEnterView chatActivityEnterView = this.b;
        switch (i10) {
            case 0:
                eg egVar = chatActivityEnterView.V2;
                if (egVar != null) {
                    egVar.w1();
                    break;
                }
                break;
            case 1:
                ff ffVar = chatActivityEnterView.B0;
                if (ffVar != null) {
                    ffVar.setText("");
                    break;
                }
                break;
            case 2:
                ff ffVar2 = chatActivityEnterView.B0;
                if (ffVar2 != null) {
                    ffVar2.setText("");
                }
                chatActivityEnterView.J(true);
                break;
            case 3:
                chatActivityEnterView.m0.callOnClick();
                break;
            case 4:
                chatActivityEnterView.m0.callOnClick();
                break;
            default:
                int i11 = ChatActivityEnterView.j5;
                chatActivityEnterView.C();
                break;
        }
    }
}
