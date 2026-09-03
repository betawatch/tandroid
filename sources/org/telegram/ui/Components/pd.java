package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ pd(ChatActivityEnterView chatActivityEnterView, boolean z4, int i10) {
        this.a = i10;
        this.b = chatActivityEnterView;
        this.c = z4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cf cfVar;
        int i10 = this.a;
        ChatActivityEnterView chatActivityEnterView = this.b;
        boolean z4 = this.c;
        switch (i10) {
            case 0:
                if (!z4) {
                    chatActivityEnterView.p1.setVisibility(8);
                    break;
                } else {
                    int i11 = ChatActivityEnterView.j5;
                    chatActivityEnterView.getClass();
                    break;
                }
            case 1:
                if (!z4) {
                    chatActivityEnterView.q1.setVisibility(8);
                    break;
                } else {
                    int i12 = ChatActivityEnterView.j5;
                    chatActivityEnterView.getClass();
                    break;
                }
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.b;
                id idVar = chatActivityEnterView2.B4;
                chatActivityEnterView2.J0 = System.currentTimeMillis();
                boolean T0 = chatActivityEnterView2.T0(0, false, 0, true, 0L);
                if (!z4 && (cfVar = chatActivityEnterView2.I0) != null) {
                    cfVar.h(!T0);
                    chatActivityEnterView2.I0 = null;
                    break;
                } else {
                    chatActivityEnterView2.A4 = !T0;
                    AndroidUtilities.cancelRunOnUIThread(idVar);
                    AndroidUtilities.runOnUIThread(idVar, 500L);
                    break;
                }
        }
    }
}
