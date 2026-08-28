package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class od implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ od(ChatActivityEnterView chatActivityEnterView, boolean z10, int i9) {
        this.a = i9;
        this.b = chatActivityEnterView;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cf cfVar;
        int i9 = this.a;
        ChatActivityEnterView chatActivityEnterView = this.b;
        boolean z10 = this.c;
        switch (i9) {
            case 0:
                if (!z10) {
                    chatActivityEnterView.o1.setVisibility(8);
                    break;
                } else {
                    int i10 = ChatActivityEnterView.i5;
                    chatActivityEnterView.getClass();
                    break;
                }
            case 1:
                if (!z10) {
                    chatActivityEnterView.p1.setVisibility(8);
                    break;
                } else {
                    int i11 = ChatActivityEnterView.i5;
                    chatActivityEnterView.getClass();
                    break;
                }
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.b;
                hd hdVar = chatActivityEnterView2.A4;
                chatActivityEnterView2.I0 = System.currentTimeMillis();
                boolean T0 = chatActivityEnterView2.T0(0, false, 0, true, 0L);
                if (!z10 && (cfVar = chatActivityEnterView2.H0) != null) {
                    cfVar.h(!T0);
                    chatActivityEnterView2.H0 = null;
                    break;
                } else {
                    chatActivityEnterView2.z4 = !T0;
                    AndroidUtilities.cancelRunOnUIThread(hdVar);
                    AndroidUtilities.runOnUIThread(hdVar, 500L);
                    break;
                }
        }
    }
}
