package org.telegram.ui.Components;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class be implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ be(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.a = i10;
        this.b = chatActivityEnterView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        ChatActivityEnterView chatActivityEnterView = this.b;
        switch (i10) {
            case 0:
                hg hgVar = chatActivityEnterView.U2;
                if (hgVar != null) {
                    hgVar.q1();
                    break;
                }
                break;
            case 1:
                jf jfVar = chatActivityEnterView.A0;
                if (jfVar != null) {
                    jfVar.setText("");
                    break;
                }
                break;
            case 2:
                jf jfVar2 = chatActivityEnterView.A0;
                if (jfVar2 != null) {
                    jfVar2.setText("");
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
                int i11 = ChatActivityEnterView.i5;
                chatActivityEnterView.C();
                break;
        }
    }
}
