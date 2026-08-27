package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ld implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ ld(ChatActivityEnterView chatActivityEnterView, boolean z10, int i10) {
        this.a = i10;
        this.b = chatActivityEnterView;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ye yeVar;
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
                ed edVar = chatActivityEnterView2.A4;
                chatActivityEnterView2.I0 = System.currentTimeMillis();
                boolean T0 = chatActivityEnterView2.T0(0, false, 0, true, 0L);
                if (!z10 && (yeVar = chatActivityEnterView2.H0) != null) {
                    yeVar.h(!T0);
                    chatActivityEnterView2.H0 = null;
                    break;
                } else {
                    chatActivityEnterView2.z4 = !T0;
                    AndroidUtilities.cancelRunOnUIThread(edVar);
                    AndroidUtilities.runOnUIThread(edVar, 500L);
                    break;
                }
        }
    }
}
