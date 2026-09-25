package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ae implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ ae(ChatActivityEnterView chatActivityEnterView, boolean z10, int i10) {
        this.a = i10;
        this.b = chatActivityEnterView;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        nf nfVar;
        int i10 = this.a;
        ChatActivityEnterView chatActivityEnterView = this.b;
        boolean z10 = this.c;
        switch (i10) {
            case 0:
                if (!z10) {
                    chatActivityEnterView.t1.setVisibility(8);
                    break;
                } else {
                    int i11 = ChatActivityEnterView.n5;
                    chatActivityEnterView.getClass();
                    break;
                }
            case 1:
                if (!z10) {
                    chatActivityEnterView.u1.setVisibility(8);
                    break;
                } else {
                    int i12 = ChatActivityEnterView.n5;
                    chatActivityEnterView.getClass();
                    break;
                }
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.b;
                td tdVar = chatActivityEnterView2.F4;
                chatActivityEnterView2.M0 = System.currentTimeMillis();
                boolean T0 = chatActivityEnterView2.T0(0, false, 0, true, 0L);
                if (!z10 && (nfVar = chatActivityEnterView2.L0) != null) {
                    nfVar.h(!T0);
                    chatActivityEnterView2.L0 = null;
                    break;
                } else {
                    chatActivityEnterView2.E4 = !T0;
                    AndroidUtilities.cancelRunOnUIThread(tdVar);
                    AndroidUtilities.runOnUIThread(tdVar, 500L);
                    break;
                }
        }
    }
}
