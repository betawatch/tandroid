package org.telegram.ui.Components;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class id implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ id(ChatActivityEnterView chatActivityEnterView, boolean z9, int i7) {
        this.a = i7;
        this.b = chatActivityEnterView;
        this.c = z9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ue ueVar;
        int i7 = this.a;
        ChatActivityEnterView chatActivityEnterView = this.b;
        boolean z9 = this.c;
        switch (i7) {
            case 0:
                if (!z9) {
                    chatActivityEnterView.t1.setVisibility(8);
                    break;
                } else {
                    int i10 = ChatActivityEnterView.s5;
                    chatActivityEnterView.getClass();
                    break;
                }
            case 1:
                if (!z9) {
                    chatActivityEnterView.u1.setVisibility(8);
                    break;
                } else {
                    int i11 = ChatActivityEnterView.s5;
                    chatActivityEnterView.getClass();
                    break;
                }
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.b;
                ad adVar = chatActivityEnterView2.F4;
                chatActivityEnterView2.M0 = System.currentTimeMillis();
                boolean T0 = chatActivityEnterView2.T0(false, 0, 0, 0L, true);
                if (!z9 && (ueVar = chatActivityEnterView2.L0) != null) {
                    ueVar.g(!T0);
                    chatActivityEnterView2.L0 = null;
                    break;
                } else {
                    chatActivityEnterView2.E4 = !T0;
                    org.telegram.messenger.g0.r(adVar);
                    org.telegram.messenger.g0.i3(adVar, 500L);
                    break;
                }
        }
    }
}
