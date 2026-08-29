package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ sd(ChatActivityEnterView chatActivityEnterView, boolean z10, int i10) {
        this.a = i10;
        this.b = chatActivityEnterView;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ff ffVar;
        int i10 = this.a;
        ChatActivityEnterView chatActivityEnterView = this.b;
        boolean z10 = this.c;
        switch (i10) {
            case 0:
                if (!z10) {
                    chatActivityEnterView.o1.setVisibility(8);
                    break;
                } else {
                    int i11 = ChatActivityEnterView.i5;
                    chatActivityEnterView.getClass();
                    break;
                }
            case 1:
                if (!z10) {
                    chatActivityEnterView.p1.setVisibility(8);
                    break;
                } else {
                    int i12 = ChatActivityEnterView.i5;
                    chatActivityEnterView.getClass();
                    break;
                }
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.b;
                ld ldVar = chatActivityEnterView2.A4;
                chatActivityEnterView2.I0 = System.currentTimeMillis();
                boolean T0 = chatActivityEnterView2.T0(0, false, 0, true, 0L);
                if (!z10 && (ffVar = chatActivityEnterView2.H0) != null) {
                    ffVar.h(!T0);
                    chatActivityEnterView2.H0 = null;
                    break;
                } else {
                    chatActivityEnterView2.z4 = !T0;
                    AndroidUtilities.cancelRunOnUIThread(ldVar);
                    AndroidUtilities.runOnUIThread(ldVar, 500L);
                    break;
                }
        }
    }
}
