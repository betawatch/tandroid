package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ xd(ChatActivityEnterView chatActivityEnterView, boolean z10, int i10) {
        this.a = i10;
        this.b = chatActivityEnterView;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kf kfVar;
        int i10 = this.a;
        ChatActivityEnterView chatActivityEnterView = this.b;
        boolean z10 = this.c;
        switch (i10) {
            case 0:
                if (!z10) {
                    chatActivityEnterView.s1.setVisibility(8);
                    break;
                } else {
                    int i11 = ChatActivityEnterView.n5;
                    chatActivityEnterView.getClass();
                    break;
                }
            case 1:
                if (!z10) {
                    chatActivityEnterView.t1.setVisibility(8);
                    break;
                } else {
                    int i12 = ChatActivityEnterView.n5;
                    chatActivityEnterView.getClass();
                    break;
                }
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.b;
                qd qdVar = chatActivityEnterView2.F4;
                chatActivityEnterView2.M0 = System.currentTimeMillis();
                boolean U0 = chatActivityEnterView2.U0(0, false, 0, true, 0L);
                if (!z10 && (kfVar = chatActivityEnterView2.L0) != null) {
                    kfVar.h(!U0);
                    chatActivityEnterView2.L0 = null;
                    break;
                } else {
                    chatActivityEnterView2.E4 = !U0;
                    AndroidUtilities.cancelRunOnUIThread(qdVar);
                    AndroidUtilities.runOnUIThread(qdVar, 500L);
                    break;
                }
        }
    }
}
